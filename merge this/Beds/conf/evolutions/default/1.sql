# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table bed_reservation (
  bed_number                integer not null,
  bed_num                   integer,
  bed_department            varchar(255),
  name                      varchar(255),
  father_name               varchar(255),
  cost                      integer,
  start_date                timestamp,
  finish_date               timestamp,
  constraint pk_bed_reservation primary key (bed_number))
;

create sequence bed_reservation_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists bed_reservation;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists bed_reservation_seq;

