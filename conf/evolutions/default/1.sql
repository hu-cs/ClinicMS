# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table register_drug (
  id                        bigint not null,
  name                      varchar(255),
  build                     varchar(255),
  price                     varchar(255),
  sell_price                varchar(255),
  birth_date                timestamp,
  age                       bigint,
  work                      boolean,
  constraint pk_register_drug primary key (id))
;

create sequence register_drug_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists register_drug;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists register_drug_seq;

