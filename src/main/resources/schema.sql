CREATE TABLE POLICY_DETAILS
(
    policyNo bigint not null primary key,
    firstName varchar(50) not null,
    lastName varchar(50) not null,
    startDate date not null,
    endDate date not null,
    deductible numeric(10,2) not null
);

