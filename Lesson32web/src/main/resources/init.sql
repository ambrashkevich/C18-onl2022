DROP TABLE IF EXISTS categories;
create table categories
(
    id        serial
        primary key,
    name      varchar(50)  not null,
    imageName varchar(100) not null

);

alter table categories
    owner to postgres;

INSERT INTO categories (id, name, imageName)
VALUES (1, 'Mobile phones', 'mobile.jpg');
INSERT INTO categories (id, name, imageName)
VALUES (2, 'Laptops', 'laptop.jpg');
INSERT INTO categories (id, name, imageName)
VALUES (3, 'GPS Navigators', 'jps_nav.jpg');
INSERT INTO categories (id, name, imageName)
VALUES (4, 'Fridges', 'fridge.jpg');
INSERT INTO categories (id, name, imageName)
VALUES (5, 'Cars', 'car.jpg');
INSERT INTO categories (id, name, imageName)
VALUES (6, 'Cameras', 'camera.jpg');


create unique index idx_categories_category_id_unique on categories (id);
create unique index idx_categories_name_unique on categories (name asc);

--------------------------------------------------------
--  ddl for table users
--------------------------------------------------------
drop table if exists users;
create table if not exists users
(
    id       serial primary key,
    name     varchar(45)  not null,
    surname  varchar(45)  not null,
    email    varchar(200) not null,
    password varchar(50)  not null,
    birthday timestamp    not null,
    balance  int          not null
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
    id      serial primary key,
    date    timestamp not null,
    price   int       not null,
    user_id int       not null
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
    id          serial primary key,
    name        varchar(200) not null,
    description varchar(300) null,
    price       int          not null,
    image_path  varchar(300) null,
    category_id int          not null
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
    order_id   int not null,
    product_id int not null,
    primary key (order_id, product_id)
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


INSERT INTO products (id, name, description, price, image_path, category_id)
VALUES (1, 'Iphone 14', 'Apple iOS, экран 6.1\" OLED (1170x2532) 60 Гц, Apple A15 Bionic, ОЗУ 6 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68', 1300, 'iphone14.png', 1);
INSERT INTO products (id, name, description, price, image_path, category_id)
VALUES (2, 'Samsung Galaxy M53 5G', 'Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68', 1100, 'galaxym53.jpg', 1);
INSERT INTO products (id, name, description, price, image_path, category_id)
VALUES (3, 'Macbook Air 13',
        'Операционная система: Mac OS,размер экрана: 13.3 дюйма, разрешение экрана: 2560x1600,матрица: IPS, соотношение сторон: 16:10, частота экрана: 60 гц, процессор: M1, кол-во ядер: 8, частота процессора: 3200 МГц, графический адаптер: Apple M1 GPU, оперативная память: 8 гб,ёмкость SSD: 256 гб',
        1100, 'macbook.jpeg', 2);
INSERT INTO products (id, name, description, price, image_path, category_id)
VALUES (4, 'ASUS FX503',
        'Операционная система: Windows,размер экрана: 15.6 дюйма, разрешение экрана: 1920x1080,матрица: IPS, соотношение сторон: 16:9, частота экрана: 60 гц, процессор: intel core i5 6500, кол-во ядер: 4, частота: 3500 МГц, графический адаптер: GeForce GTX 1050, оперативная память: 16 гб,ёмкость SSD: 512 гб',
        1100, 'asus.jpeg', 2);
INSERT INTO products (id, name, description, price, image_path, category_id)
VALUES (5, 'NAVITEL E777 Truck', 'Операционная система: Linux, процессор: MStar MSB2531, оперативная память: 128 мб,размер экрана:7 дюймов,разрешение экрана: 800 х 480,встроенная память: 8 гб', 1100, 'navitel.jpeg', 3);
INSERT INTO products (id, name, description, price, image_path, category_id)
VALUES (6, 'GEOFOX MID 743', 'Операционная система: Android 7.0 Nougat, процессор: MediaTek МТК8321, частота процессора: 1300 МГц, кол-во ядер: 4, оперативная память: 2 гб,размер экрана: 7 дюймов,разрешение экрана: 1024 х 600, технология экрана: IPS, встроенная память: 32 гб', 1100, 'geofox.jpeg',
        3);
INSERT INTO products(id, name, description, price, image_path, category_id)
VALUES (7, 'LG DoorCooling',
        'Исполнение: отдельностоящий,конструкция: с нижней морозильной камерой,система охлаждения: No Frost,количество компрессоров: 1,количество полок: 4, количество отделений морозильной камеры: 3,общий объём: 419л, полезный объем: 384л, уровень шума: 35 дБ, мощность замораживания 14кг/сути',
        1100, 'lg.jpeg', 4);
INSERT INTO products(id, name, description, price, image_path, category_id)
VALUES (8, 'Indesit ITR', 'Исполнение: отдельностоящий,конструкция: с нижней морозильной камерой,система охлаждения: No Frost,количество компрессоров: 1,количество полок: 3, количество отделений морозильной камеры: 3, полезный объем: 257л, уровень шума: 43 дБ, мощность замораживания 4кг/сути', 1100,
        'indesit.jpeg', 4);
INSERT INTO products(id, name, description, price, image_path, category_id)
VALUES (9, 'Tesla model S', 'Мощность: 1020 л.с., привод: полный, коробка: автомат, разнос: 2.0 секунды, тип двигателя: электро, запас хода 840 км, максимальная скорость: 322 км/ч', 1100, 'models.jpg', 5);
INSERT INTO products(id, name, description, price, image_path, category_id)
VALUES (10, 'Tesla model X', 'Мощность: 580 л.с., привод: полный, коробка: автомат, разнос: 5.0 секунд, тип двигателя: электро, запас хода 489 км, максимальная скорость: 250 км/ч', 1100, 'modelx.png', 5);
INSERT INTO products(id, name, description, price, image_path, category_id)
VALUES (11, 'GoPro HERO10',
        'Разрешение видеосъёмки: 5.3K, формат сжатия видео: H.264, H.265 (HEVC), размер экрана: 2.27, количество точек матрицы: 23 Мп, электронная стабилизация: HyperSmooth 4.0, количество пикселей при фотосъемке: 23 Мп, максимальное количество кадров в секунду: 240 кадров/с, емкость аккумулятора: 1720 мАч',
        1100, 'gopro.jpeg', 6);
INSERT INTO products(id, name, description, price, image_path, category_id)
VALUES (12, 'Panasonic HC-V770',
        'Разрешение видеосъёмки: Full HD, матрица: BSI MOS, формат сжатия видео: AVCHD, MPEG-4 (MP4), количество точек матрицы: 12.76 Мп, электронная стабилизация: оптическая, количество пикселей при фотосъемке: 24 Мп, разрешение фотоснимка:6528x3672, емкость аккумулятора: 1940 мАч', 1100,
        'panasonic.jpg', 6);
