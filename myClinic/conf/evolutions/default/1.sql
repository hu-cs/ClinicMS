# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table ambulance_info (
  rgcod                     integer not null,
  first_name                varchar(255),
  ambulancenumber           integer,
  phone                     varchar(255),
  date                      timestamp,
  address                   varchar(255),
  cost                      integer,
  payment                   varchar(255),
  constraint pk_ambulance_info primary key (rgcod))
;

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

create table list_sell_drug (
  id                        integer not null,
  number                    integer,
  sell_date                 timestamp,
  total_sell                bigint,
  benfit                    bigint,
  constraint pk_list_sell_drug primary key (id))
;

create table operation (
  id                        bigint not null,
  first_name                varchar(255),
  father_name               varchar(255),
  family_name               varchar(255),
  fore_father               varchar(255),
  age                       bigint,
  blood_type                varchar(255),
  phone                     varchar(255),
  operation_date            timestamp,
  address                   varchar(255),
  description               varchar(255),
  charge                    bigint,
  discount                  bigint,
  doctor                    varchar(255),
  assistant                 varchar(255),
  operation_type            varchar(255),
  successfull               boolean,
  constraint pk_operation primary key (id))
;

create table parturition (
  id                        bigint not null,
  first_name                varchar(255),
  father_name               varchar(255),
  family_name               varchar(255),
  fore_father               varchar(255),
  parturition_date          timestamp,
  number_of_baby            bigint,
  doctor                    varchar(255),
  blood_type                varchar(255),
  phone_number              varchar(255),
  address                   varchar(255),
  description               varchar(255),
  charge                    bigint,
  discount                  bigint,
  caesareaned               boolean,
  constraint pk_parturition primary key (id))
;

create table patient (
  id                        integer not null,
  first_name                varchar(255),
  father_name               varchar(255),
  date                      timestamp,
  department                varchar(255),
  doctor_name               varchar(255),
  doctor_id                 integer,
  visit                     integer,
  payment                   varchar(255),
  constraint pk_patient primary key (id))
;

create table personal (
  id                        integer not null,
  name                      varchar(255),
  father_name               varchar(255),
  nic                       integer,
  proficiency               varchar(255),
  job                       varchar(255),
  phone                     bigint,
  active                    boolean,
  address                   varchar(255),
  salary_percentage         integer,
  salary_contracted         integer,
  image                     varchar(255),
  constraint pk_personal primary key (id))
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

create sequence ambulance_info_seq;

create sequence bed_reservation_seq;

create sequence list_sell_drug_seq;

create sequence operation_seq;

create sequence parturition_seq;

create sequence patient_seq;

create sequence personal_seq;

create sequence register_drug_seq;

create sequence sell_drug_seq;

create sequence user_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists ambulance_info;

drop table if exists bed_reservation;

drop table if exists list_sell_drug;

drop table if exists operation;

drop table if exists parturition;

drop table if exists patient;

drop table if exists personal;

drop table if exists register_drug;

drop table if exists sell_drug;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists ambulance_info_seq;

drop sequence if exists bed_reservation_seq;

drop sequence if exists list_sell_drug_seq;

drop sequence if exists operation_seq;

drop sequence if exists parturition_seq;

drop sequence if exists patient_seq;

drop sequence if exists personal_seq;

drop sequence if exists register_drug_seq;

drop sequence if exists sell_drug_seq;

drop sequence if exists user_seq;

