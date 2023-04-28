--------------------------------------------------------
--  ddl for schema eshop
--------------------------------------------------------
drop schema if exists eshop;
create schema if not exists eshop;

--------------------------------------------------------
--  ddl for table category
--------------------------------------------------------
drop table if exists eshop.categories;
create table if not exists eshop.categories
(
    id
    serial
    primary
    key,
    name
    varchar
(
    45
) not null,
    image_path varchar
(
    100
) not null,
    rating int not null
    );
create unique index idx_categories_category_id_unique on eshop.categories (id);
create unique index idx_categories_name_unique on eshop.categories (name asc);

--------------------------------------------------------
--  ddl for table users
--------------------------------------------------------
drop table if exists eshop.users;
create table if not exists eshop.users
(
    id
    serial
    primary
    key,
    name
    varchar
(
    45
) not null,
    surname varchar
(
    45
) not null,
    email varchar
(
    200
) not null,
    password varchar
(
    50
) not null,
    birthday timestamp not null,
    balance int not null
    );
create unique index idx_users_user_id_unique on eshop.users (id asc);
create unique index idx_users_email_unique on eshop.users (email asc);
create unique index idx_users_password_unique on eshop.users (password asc);


--------------------------------------------------------
--  ddl for table orders
--------------------------------------------------------
drop table if exists eshop.orders;
create table if not exists eshop.orders
(
    id
    serial
    primary
    key,
    date
    timestamp
    not
    null,
    price
    int
    not
    null,
    user_id
    int
    not
    null
);
alter table eshop.orders
    add constraint fk_orders_user_id_users_id
        foreign key (user_id)
            references eshop.users (id)
            on delete cascade
            on update cascade;

create unique index idx_orders_id_unique on eshop.orders (id asc);

--------------------------------------------------------
--  ddl for table products
--------------------------------------------------------
drop table if exists eshop.products;
create table if not exists eshop.products
(
    id
    serial
    primary
    key,
    name
    varchar
(
    200
) not null,
    description varchar
(
    300
) null,
    price int not null,
    image_path varchar
(
    300
) null,
    category_id int not null
    );
alter table eshop.products
    add constraint fk_products_category_id_categories_id
        foreign key (category_id)
            references eshop.categories (id)
            on delete cascade
            on update cascade;

create unique index idx_products_id_unique on eshop.products (id asc);

--------------------------------------------------------
--  ddl for table orders_products
--------------------------------------------------------
drop table if exists eshop.orders_products;
create table if not exists eshop.orders_products
(
    order_id
    int
    not
    null,
    product_id
    int
    not
    null,
    primary
    key
(
    order_id,
    product_id
)
    );
alter table eshop.orders_products
    add constraint fk_orders_products_order_id_orders_id
        foreign key (order_id)
            references eshop.orders (id);
alter table eshop.orders_products
    add constraint fk_orders_products_product_id_products_id
        foreign key (product_id)
            references eshop.products (id)
            on delete cascade
            on update cascade;
