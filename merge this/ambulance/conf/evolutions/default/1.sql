# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table ambulance_info (
  rgcod                     integer not null,
  first_name                varchar(255),
  ambulancenumber           integer,
  phone                     integer,
  date                      timestamp,
  address                   varchar(255),
  cost                      integer,
  payment                   varchar(255),
  constraint pk_ambulance_info primary key (rgcod))
;

create sequence ambulance_info_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists ambulance_info;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists ambulance_info_seq;

