package com.tms.util;

import com.tms.model.Product;
import java.math.BigDecimal;
import java.util.List;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ProductHelper {

    public static final List<Product> products = List.of(
            new Product(1, "iphone14.png", "Iphone 14", "Apple iOS, экран 6.1\" OLED (1170x2532) 60 Гц, Apple A15 Bionic, ОЗУ 6 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1300), 1),
            new Product(2, "galaxym53.jpg", "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), 1),
            new Product(3,
                        "macbook.jpeg",
                        "Macbook",
                        "Операционная система: Mac OS,размер экрана: 13.3 дюйма, разрешение экрана: 2560x1600,матрица: IPS, соотношение сторон: 16:10, частота экрана: 60 гц, процессор: M1, кол-во ядер: 8, частота процессора: 3200 МГц, графический адаптер: Apple M1 GPU, оперативная память: 8 гб,ёмкость SSD: 256 гб",
                        new BigDecimal(1100),
                        2),
            new Product(4,
                        "asus.jpeg",
                        "ASUS FX503VD",
                        "Операционная система: Windows,размер экрана: 15.6 дюйма, разрешение экрана: 1920x1080,матрица: IPS, соотношение сторон: 16:9, частота экрана: 60 гц, процессор: intel core i5 6500, кол-во ядер: 4, частота процессора: 3500 МГц, графический адаптер: NVIDIA GeForce GTX 1050, оперативная память: 16 гб,ёмкость SSD: 512 гб",
                        new BigDecimal(1100),
                        2),
            new Product(5, "navitel.jpeg", "NAVITEL E777 Truck", "Операционная система: Linux, процессор: MStar MSB2531, оперативная память: 128 мб,размер экрана:7 дюймов,разрешение экрана: 800 х 480,встроенная память: 8 гб", new BigDecimal(1100), 3),
            new Product(6,
                        "geofox.jpeg",
                        "GEOFOX MID 743",
                        "Операционная система: Android 7.0 Nougat, процессор: MediaTek МТК8321, частота процессора: 1300 МГц, кол-во ядер: 4, оперативная память: 2 гб,размер экрана: 7 дюймов,разрешение экрана: 1024 х 600, технология экрана: IPS, встроенная память: 32 гб",
                        new BigDecimal(1100),
                        3),
            new Product(7,
                        "lg.jpeg",
                        "LG DoorCooling",
                        "Исполнение: отдельностоящий,конструкция: с нижней морозильной камерой,система охлаждения: No Frost,количество компрессоров: 1,количество полок: 4, количество отделений морозильной камеры: 3,общий объём: 419л, полезный объем: 384л, управлениие: электронное, уровень шума: 35 дБ, мощность замораживания 14кг/сути",
                        new BigDecimal(1100),
                        4),
            new Product(8,
                        "indesit.jpeg",
                        "Indesit ITR",
                        "Исполнение: отдельностоящий,конструкция: с нижней морозильной камерой,система охлаждения: No Frost,количество компрессоров: 1,количество полок: 3, количество отделений морозильной камеры: 3, полезный объем: 257л, управлениие: электронное, уровень шума: 43 дБ, мощность замораживания 4кг/сути",
                        new BigDecimal(1100),
                        4),
            new Product(9, "models.jpg", "Tesla model S", "Мощность: 1020 л.с., привод: полный, коробка: автомат, разнос: 2.0 секунды, тип двигателя: электро, запас хода 840 км, максимальная скорость: 322 км/ч", new BigDecimal(1100), 5),
            new Product(10, "modelx.png", "Tesla model X", "Мощность: 580 л.с., привод: полный, коробка: автомат, разнос: 5.0 секунд, тип двигателя: электро, запас хода 489 км, максимальная скорость: 250 км/ч", new BigDecimal(1100), 5),
            new Product(11,
                        "gopro.jpeg",
                        "GoPro HERO10",
                        "Разрешение видеосъёмки: 5.3K, формат сжатия видео: H.264, H.265 (HEVC), размер экрана: 2.27, количество точек матрицы: 23 Мп, конструкция: стандартная, пыле и влагозащита: погружение на глубины до 10 метров, электронная стабилизация: HyperSmooth 4.0, количество пикселей при фотосъемке: 23 Мп, максимальное количество кадров в секунду: 240 кадров/с, емкость аккумулятора: 1720 мАч",
                        new BigDecimal(1100),
                        6),
            new Product(12,
                        "panasonic.jpg",
                        "Panasonic HC-V770",
                        "Разрешение видеосъёмки: Full HD,тип матрицы: BSI MOS,физический размер матрицы: 1/2.3, формат сжатия видео: AVCHD, MPEG-4 (MP4), количество точек матрицы: 12.76 Мп, электронная стабилизация:  оптическая, электронная, количество пикселей при фотосъемке: 24 Мп, максимальное количество кадров в секунду: 50 кадров/с, максимальное разрешение фотоснимка:6528x3672, емкость аккумулятора: 1940 мАч",
                        new BigDecimal(1100),
                        6));
}