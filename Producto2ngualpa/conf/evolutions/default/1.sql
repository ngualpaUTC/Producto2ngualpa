# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table pedido (
  id                            bigserial not null,
  cliente                       varchar(255),
  detalle                       varchar(255),
  unidades                      integer,
  valor                         integer,
  constraint pk_pedido primary key (id)
);


# --- !Downs

drop table if exists pedido cascade;

