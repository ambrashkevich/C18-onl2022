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