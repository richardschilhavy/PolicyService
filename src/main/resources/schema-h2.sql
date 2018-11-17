CREATE TABLE IF NOT EXISTS POLICY
(
    policyNo bigint not null primary key,
    firstName varchar(50) not null,
    lastName varchar(50) not null,
    startDate timestamp not null,
    endDate timestamp not null,
    deductible numeric(10,2) not null,
    currencyType varchar(10) not null
);
