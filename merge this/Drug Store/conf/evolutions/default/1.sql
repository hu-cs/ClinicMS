# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table list_sell_drug (
  id                        integer not null,
  number                    integer,
  sell_date                 timestamp,
  total_sell                bigint,
  benfit                    bigint,
  constraint pk_list_sell_drug primary key (id))
;

create table register_drug (
  id                        bigint not null,
  name                      varchar(255),
  build                     varchar(255),
  price                     integer,
  sell_price                integer,
  date                      timestamp,
  work                      boolean,
  constraint pk_register_drug primary key (id))
;

create table sell_drug (
  number                    integer not null,
  num                       integer,
  total                     integer,
  drug_count                bigint,
  name_listing              varchar(255),
  name                      varchar(255),
  price                     integer,
  sell_price                integer,
  build                     varchar(255),
  date                      timestamp,
  date1                     varchar(255),
  work                      boolean,
  constraint pk_sell_drug primary key (number))
;

create sequence list_sell_drug_seq;

create sequence register_drug_seq;

create sequence sell_drug_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists list_sell_drug;

drop table if exists register_drug;

drop table if exists sell_drug;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists list_sell_drug_seq;

drop sequence if exists register_drug_seq;

drop sequence if exists sell_drug_seq;

