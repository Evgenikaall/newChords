create table person
(
    id         integer not null,
    first_name varchar(255),
    last_name  varchar(255),
    primary key (id)
);

create table user_form
(
    username varchar(255) not null,
    enabled  integer      not null,
    password varchar(255),
    role     varchar(255),
    primary key (username)
);