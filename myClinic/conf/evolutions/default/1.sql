# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table user (
  id                        bigint not null,
  first_name                varchar(255),
  last_name                 varchar(255),
  password                  varchar(255),
  bed_access                boolean,
  accounting_access         boolean,
  lab_access                boolean,
  time_reserving_access     boolean,
  ambulance_access          boolean,
  operation_access          boolean,
  reception_access          boolean,
  office_access             boolean,
  create_user_access        boolean,
  drug_store_access         boolean,
  constraint pk_user primary key (id))
;

create sequence user_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists user_seq;

