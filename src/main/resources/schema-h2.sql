create table if not exists policy
(
    policy_no bigint not null primary key,
    first_name varchar(50) not null,
    last_name varchar(50) not null,
    start_date date not null,
    end_date date not null,
    deductible decimal(20,2) not null,
    currencyType char(3) not null -- all currency codes are three letters/digits
);
