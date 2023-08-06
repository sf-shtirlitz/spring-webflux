package com.vinsguru.productservice.config;

import com.vinsguru.productservice.dto.ProductDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Sinks;

@Configuration
public class SinkConfig {

    @Bean
    public Sinks.Many<ProductDto> sink(){
        return Sinks.many().replay().limit(1);
    }

    @Bean
    public Flux<ProductDto> getBroadcastedProducts(Sinks.Many<ProductDto> sink){//looks like it doesn't matter what the
        //name of this Bean is going to be, since it's used via Flux<ProductDto> instantiation in ProductStreamController
        return sink.asFlux();
    }

}
