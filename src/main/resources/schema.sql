
create table user (
  id uuid not null,
  name varchar(200) not null,
  email varchar(200) not null,
  nationality char(2) not null
);

alter table user add constraint user_pk primary key (id);
