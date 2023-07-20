create table users (
    id integer GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    name varchar(50),
    balance int
);

create table user_transaction(
    id integer GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    user_id bigint,
    amount int,
    transaction_date timestamp,
    foreign key (user_id) references users (id) on delete cascade
);

insert into users
    (name, balance)
    values
    ('sam', 1000),
    ('mike', 1200),
    ('jake', 800),
    ('marshal', 2000),
    ('shtirlitz', 1000);