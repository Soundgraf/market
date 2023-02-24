-- Создание таблицы Покупателей
create table if not exists buyer
(
    id   bigint primary key,
    name varchar
);

-- Создание таблицы Продуктов
create table if not exists product
(
    id    bigint primary key,
    name  varchar,
    price numeric,
    count int
);

-- Создание таблицы Магазинов
create table if not exists store
(
    id   bigint primary key,
    name varchar
);