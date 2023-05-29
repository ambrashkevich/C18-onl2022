--------------------------------------------------------
--  ddl for table category
--------------------------------------------------------
drop table if exists categories;
create table if not exists categories
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
create unique index idx_categories_category_id_unique on categories (id);
create unique index idx_categories_name_unique on categories (name asc);

--------------------------------------------------------
--  ddl for table users
--------------------------------------------------------
drop table if exists users;
create table if not exists users
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
create unique index idx_users_user_id_unique on users (id asc);
create unique index idx_users_email_unique on users (email asc);
create unique index idx_users_password_unique on users (password asc);


--------------------------------------------------------
--  ddl for table orders
--------------------------------------------------------
drop table if exists orders;
create table if not exists orders
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
alter table orders
    add constraint fk_orders_user_id_users_id
        foreign key (user_id)
            references users (id)
            on delete cascade
            on update cascade;

create unique index idx_orders_id_unique on orders (id asc);

--------------------------------------------------------
--  ddl for table products
--------------------------------------------------------
drop table if exists products;
create table if not exists products
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
alter table products
    add constraint fk_products_category_id_categories_id
        foreign key (category_id)
            references categories (id)
            on delete cascade
            on update cascade;

create unique index idx_products_id_unique on products (id asc);

--------------------------------------------------------
--  ddl for table orders_products
--------------------------------------------------------
drop table if exists orders_products;
create table if not exists orders_products
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
alter table orders_products
    add constraint fk_orders_products_order_id_orders_id
        foreign key (order_id)
            references orders (id);
alter table orders_products
    add constraint fk_orders_products_product_id_products_id
        foreign key (product_id)
            references products (id)
            on delete cascade
            on update cascade;