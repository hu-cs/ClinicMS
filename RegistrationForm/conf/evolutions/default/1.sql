# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table personal (
  id                        bigint not null,
  roll_number               bigint,
  name                      varchar(255),
  father_name               varchar(255),
  national_id_card_number   bigint,
  family_name               varchar(255),
  grand_father_name         varchar(255),
  occuption                 varchar(255),
  date_of_birth             timestamp,
  address                   varchar(255),
  email                     varchar(255),
  telephone_number          bigint,
  age                       bigint,
  emergency_number          bigint,
  salary                    bigint,
  is_percentage             boolean,
  not_percentage            boolean,
  both                      boolean,
  percentage                bigint,
  section                   varchar(255),
  isready                   boolean,
  info                      varchar(255),
  constraint pk_personal primary key (id))
;

create sequence personal_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists personal;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists personal_seq;

