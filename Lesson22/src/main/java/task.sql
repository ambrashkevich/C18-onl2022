insert into workers(login, salary, age, date, description)
values ('Антон', 100, 21, '2004-10-19 10:23:54', 'junior developer');
insert into workers(login, salary, age, date, description)
values ('user', 200, 22, '2004-10-19 10:23:54', 'junior developer');
insert into workers(login, salary, age, date, description)
values ('admin', 300, 23, '2021-10-19 10:23:54', 'junior developer');
insert into workers(login, salary, age, date, description)
values ('ivan', 400, 24, '2022-10-19 10:23:54', 'junior developer');
insert into workers(login, salary, age, date, description)
values ('eee', 500, 25, '2020-10-19 10:23:54', 'junior developer');
insert into workers(login, salary, age, date, description)
values ('bbb', 600, 26, '2021-10-19 10:23:54', 'junior developer');
insert into workers(login, salary, age, date, description)
values ('zzz', 700, 27, '2021-10-19 10:23:54', 'junior developer');
insert into workers(login, salary, age, date, description)
values ('Иван', 800, 28, '2021-10-19 10:23:54', 'junior developer');
insert into workers(login, salary, age, date, description)
values ('Иван', 900, 29, '2021-10-19 10:23:54', 'junior developer');
insert into workers(login, salary, age, date, description)
values ('Иван', 1000, 30, '2021-10-19 10:23:54', 'junior developer');
insert into workers(login, salary, age, date, description)
values ('Иван', 1100, 31, '2032-10-19 10:23:54', 'junior developer');
insert into workers(login, salary, age, date, description)
values ('Иван', 1200, 32, '2032-10-19 10:23:54', 'junior developer');
insert into workers(login, salary, age, date, description)
values ('Иван', 1300, 33, '2021-10-19 10:23:54', 'junior developer');
insert into workers(login, salary, age, date, description)
values ('Иван', 1400, 34, '2024-10-19 10:23:54', 'junior developer');

/*Выберите из таблицы workers записи с id равным 1, 2, 3, 5, 14.*/
SELECT *
FROM workers
WHERE id = 1
   or id = 2
   or id = 3
   or id = 5
   or id = 14;
/*Выберите из таблицы workers записи с login равным 'eee', 'bbb', 'zzz'. */
SELECT *
FROM workers
WHERE login = 'eee'
   or login = 'bbb'
   or login = 'zzz';
/* Выберите из таблицы workers записи с id равным 1, 2, 3, 7, 9, и логином, равным 'user', 'admin', 'ivan' и зарплатой больше 300. */
SELECT *
FROM workers
WHERE id = 1
   OR id = 2
   or id = 3
   or id = 7
   or id = 9 and login = 'user'
   or login = 'admin'
   or login = 'ivan' and salary > 300;
/*На BETWEEN
//    Для решения задач данного блока вам понадобятся следующие SQL команды и функции: BETWEEN.
//    Выберите из таблицы workers записи c зарплатой от 100 до 1000.*/
SELECT *
FROM workers
where salary between 100 and 1000;
/*Выберите из таблицы workers записи c id от 3 до 10 и зарплатой от 300 до 500. */
SELECT *
FROM workers
WHERE id between 3 and 10
  and salary between 300 and 500;
/*На AS
//    Для решения задач данного блока вам понадобятся следующие SQL команды и функции: AS.
//    Выберите из таблицы workers все записи так, чтобы вместо id было userId,
  вместо login – userLogin, вместо salary - userSalary. */
SELECT id as userId, login as userLogin, salary as userSalary
from workers;
/*  На DISTINCT
//    Для решения задач данного блока вам понадобятся следующие SQL команды и функции: DISTINCT.
//    Выберите из таблицы workers все записи так, чтобы туда попали только записи с разной зарплатой (без дублей). */
SELECT DISTINCT salary
from workers;
/*Получите SQL запросом все возрасты без дублирования.*/
SELECT DISTINCT age
from workers;
/*На MIN и MAX
//    Для решения задач данного блока вам понадобятся следующие SQL команды и функции: MIN, MAX.
//    Найдите в таблице workers минимальную зарплату.*/
select min(salary)
from workers;
/*Найдите в таблице workers максимальную зарплату. */
select max(salary)
from workers;
/*На SUM
//    Для решения задач данного блока вам понадобятся следующие SQL команды и функции: SUM.
//    Найдите в таблице workers суммарную зарплату.*/
select sum(salary)
from workers;
/* Найдите в таблице workers суммарную зарплату для людей в возрасте от 21 до 25.*/
select sum(salary)
from workers
where age between 21 and 25;
/*Найдите в таблице workers суммарную зарплату для id, равного 1, 2, 3 и 5. */
select sum(salary)
from workers
where id = 1
   or id = 2
   or id = 3
   or id = 5;
/* На AVG
//    Для решения задач данного блока вам понадобятся следующие SQL команды и функции: AVG.
//    Найдите в таблице workers среднюю зарплату.*/
select avg(salary)
from workers;
/*айдите в таблице workers средний возраст. */
select avg(age)
from workers;
/*На NOW, CURRENT_DATE, CURRENT_TIME
//    Для решения задач данного блока вам понадобятся следующие SQL команды и функции: NOW, CURRENT_DATE, CURRENT_TIME.
//    Выберите из таблицы workers все записи, у которых дата больше текущей. */
select *
from workers
where date > now();
/* Вставьте в таблицу workers запись с полем date
   с текущим моментом времени в формате 'год-месяц-день часы:минуты:секунды'*/
insert into workers(login, salary, age, date, description)
values ('Max', 1500, 34, now(), 'junior developer');
/*Вставьте в таблицу workers запись с полем date с текущей датой в формате 'год-месяц-день' */
insert into workers(login, salary, age, date, description)
values ('Alex', 1600, 34, current_date, 'junior developer');
/* Вставьте в таблицу workers запись с полем time с текущим моментом времени в формате 'часы:минуты:секунды'. */
insert into workers(login, salary, age, date, description)
values ('Alex', 1600, 34, localtimestamp, 'junior developer');
/*На работу с частью даты
//    Для решения задач данного блока вам понадобятся следующие SQL команды и функции: SECOND, MINUTE, HOUR, DAY, MONTH, YEAR, DAYOFWEEK, WEEKDAY.
//    Выберите из таблицы workers все записи за 2016 год. */
SELECT *
FROM workers
WHERE date >= '2016-01-01'
  AND date
    < '2016-12-31';

/*Выберите из таблицы workers все записи за март любого года.*/
SELECT *
FROM workers
where extract(month from date) = 3;
/*    Выберите из таблицы workers все записи за третий день месяца. */
SELECT *
FROM workers
WHERE extract(day from date) = 3;
/*Выберите из таблицы workers все записи за пятый день апреля любого года. */
SELECT *
FROM workers
WHERE extract(day from date) = 5
  and extract(month from date) = 4;
/*Выберите из таблицы workers все записи за следующие дни любого месяца: 1, 7, 11, 12, 15, 19, 21, 29. */
SELECT *
FROM workers
WHERE EXTRACT(day from date) = 1
   or extract(day from date) = 7
   or extract(day from date) = 11
   or extract(day from date) = 12
   or extract(day from date) = 15
   or extract(day from date) = 19
   or extract(day from date) = 21
   or extract(day from date) = 29;
/*Выберите из таблицы workers все записи за вторник. */
SELECT *
FROM workers
WHERE EXTRACT(dow from date) = 2;
/*Выберите из таблицы workers все записи за первую декаду любого месяца 2016 года. */
SELECT *
FROM workers
WHERE extract(day from date) <= 10
  and extract(year from date) = 2023;
/*Выберите из таблицы workers все записи, в которых день меньше месяца. */
SELECT *
FROM workers
where extract(day from date) < extract(month from date);
/*При выборке из таблицы workers запишите день, месяц и год в отдельные поля. */
SELECT extract(day from date) AS day, extract(month from date) as month, extract(year from date) as year
from workers;
/*При выборке из таблицы workers создайте новое поле today, в котором будет номер текущего дня недели. */
SELECT login, EXTRACT(dow from date) as today
from workers;
/*На EXTRACT, DATE
//    Для решения задач данного блока вам понадобятся следующие SQL команды и функции: EXTRACT, DATE.
//    При выборке из таблицы workers запишите год, месяц и день в отдельные поля с помощью EXTRACT. */
SELECT EXTRACT(YEAR FROM DATE) as year, extract(month from date) as month, extract(day from date) as day
from workers;
/*При выборке из таблицы workers запишите день, месяц и год в отдельное поле с помощью DATE в формате 'год-месяц-день'*/
SELECT date (date) as today
FROM workers;
/*На DATE_FORMAT
//    Для решения задач данного блока вам понадобятся следующие SQL команды и функции: DATE_FORMAT.
//    При выборке из таблицы workers выведите дату в формате '31.12.2025'. */
SELECT to_char(date, 'dd.mm.YYYY')
from workers;
/*При выборке из таблицы workers выведите дату в формате '2025% 31.12'. */
select to_char(date, 'YYYY% mm.dd')
from workers;
/*//    На INTERVAL, DATE_ADD, DATE_SUB
//    Для решения задач данного блока вам понадобятся следующие SQL команды и функции: INTERVAL, DATE_ADD, DATE_SUB.
//    При выборке из таблицы workers прибавьте к дате 1 день. */
SELECT date + INTERVAL '1DAY' AS DATE
from workers;
/*При выборке из таблицы workers отнимите от даты 1 день. */
SELECT date - INTERVAL '1DAY' AS DATE
from workers;
/*При выборке из таблицы workers прибавьте к дате 1 день, 2 часа. */
SELECT date + interval '1day:2hours' as date
from workers;
/*При выборке из таблицы workers прибавьте к дате 1 год, 2 месяца.*/
SELECT date + interval '1year:2month' as date
from workers;
/*При выборке из таблицы workers прибавьте к дате 1 день, 2 часа, 3 минуты. */
SELECT date + interval '1day:2hours:3minutes' as date
from workers;
/*При выборке из таблицы workers прибавьте к дате 1 день, 2 часа, 3 минуты, 5 секунд. */
SELECT date + interval '1day:2hours:3minutes:5seconds' as date
from workers;
/*  При выборке из таблицы workers прибавьте к дате 2 часа, 3 минуты, 5 секунд. */
SELECT date + interval '2hours:3minutes:5seconds' as date
from workers;
/* При выборке из таблицы workers прибавьте к дате 1 день и отнимите 2 часа. */
select date + interval '1day' - interval '2hours' as date
from workers;
/*При выборке из таблицы workers прибавьте к дате 1 день и отнимите 2 часа, 3 минуты. */
select date + interval '1day' - interval '2hours' - interval '3minutes' as date
from workers;
/* На математические операции*/
/*При выборке из таблицы workers создайте новое поле res, в котором будет число 3. */
SELECT 3 as res
from workers;
/* При выборке из таблицы workers создайте новое поле res, в котором будет строка 'eee'. */
SELECT 'eee' as res
from workers;
/*При выборке из таблицы workers создайте новое поле 3, в котором будет число 3. */
SELECT 3 as "3"
from workers;
/*При выборке из таблицы workers создайте новое поле res, в котором будет лежать сумма зарплаты и возраста. */
SELECT sum(salary + age) as res
from workers;
/*При выборке из таблицы workers создайте новое поле res, в котором будет лежать разность зарплаты и возраста. */
SELECT (salary - age) as res
from workers;
/*При выборке из таблицы workers создайте новое поле res, в котором будет лежать произведение зарплаты и возраста. */
select (salary * age) as res
from workers;
/*При выборке из таблицы workers создайте новое поле res, в котором будет лежать среднее арифметическое зарплаты и возраста. */
select (salary * age) / 2 as res
from workers;
/*Выберите из таблицы workers все записи, в которых сумма дня и месяца меньше 10-ти. */
select extract(month from date) + extract(day from date) > 10 as days
from workers;
/* На LEFT, RIGHT, SUBSTRING
//    Для решения задач данного блока вам понадобятся следующие SQL команды и функции: LEFT, RIGHT, SUBSTRING.
//    При выборке из таблицы workers получите первые 5 символов поля description.*/
SELECT left (description, 5)
from workers;
/*При выборке из таблицы workers получите последние 5 символов поля description.*/
SELECT "right"(description, 5)
from workers;
/*При выборке из таблицы workers получите из поля description символы со второго по десятый.*/
SELECT substring(description, 2, 10)
from workers;
/*На UNION
//    Для решения задач данного блока вам понадобятся следующие SQL команды и функции: UNION.
//    Даны две таблицы: таблица category и таблица sub_category с полями id и name.
Достаньте одним запросом названия категорий и подкатегорий. */
insert into category(name)
values ('c#');
insert into category(name)
values ('java');
insert into category(name)
values ('c++');
insert into sub_category(name)
values ('php');
insert into sub_category(name)
values ('html');
insert into sub_category(name)
values ('css');
SELECT ID, name
FROM category
UNION
SELECT ID, NAME
FROM sub_category;
/*На CONCAT, CONCAT_WS
//    Для решения задач данного блока вам понадобятся следующие SQL команды и функции: CONCAT, CONCAT_WS.
//    При выборке из таблицы workers создайте новое поле res,
  в котором будут лежать одновременно зарплата и возраст (слитно).*/
SELECT concat(salary, age) as res
from workers;
/*При выборке из таблицы workers создайте новое поле res, в котором будут лежать одновременно
  зарплата и возраст (слитно), а после возраста будут идти три знака '!'.*/
SELECT concat(salary, age, '!!!') as res
from workers;
/*При выборке из таблицы workers создайте новое поле res, в котором будут
  лежать одновременно зарплата и возраст через дефис. */
SELECT concat(salary, '-', age) as res
from workers;
/**При выборке из таблицы workers получите первые 5 символов логина и добавьте троеточие. / */
select concat(left(login, 5), '...') as log
from workers;
/*На GROUP BY
//    Для решения задач данного блока вам понадобятся следующие SQL команды и функции: GROUP BY.
//    Найдите самые маленькие зарплаты по группам возрастов (для каждого возраста свою минимальную зарплату). */
SELECT MIN(salary)
from workers
group by age;
/*Найдите самый большой возраст по группам зарплат (для каждой зарплаты свой максимальный возраст). */
select MAX(age)
from workers
group by salary;
/*На GROUP_CONCAT
//    Для решения задач данного блока вам понадобятся следующие SQL команды и функции: GROUP_CONCAT.
//    Выберите из таблицы workers уникальные возраста так, чтобы для каждого возраста было поле res,
  в котором будут лежать через дефис id записей с таким возрастом. */
SELECT DISTINCT age, concat(age, '-', id) as res
from workers;
/*На подзапросы
//    Выберите из таблицы workers все записи, зарплата в которых больше средней зарплаты. */
select *
from workers
where salary > (select avg(salary) from workers);
/*Выберите из таблицы workers все записи, возраст в которых меньше
  среднего возраста, деленного на 2 и умноженного на 3. */
select *
from workers
where age < (select avg(age / 2 * 3) from workers);
/*Выберите из таблицы workers записи с минимальной зарплатой. */
SELECT *
FROM workers
WHERE salary = (SELECT MIN(salary) FROM workers);
/*Выберите из таблицы workers записи с максимальной зарплатой.*/
SELECT *
FROM workers
WHERE salary = (SELECT MAX(salary) FROM workers);
/*При выборке из таблицы workers создайте новое поле max, в котором будет лежать
  максимальное значение зарплаты для возраста 25 лет.*/
SELECT MAX(salary) AS MAX
FROM workers
where age = 25;
/*//    При выборке из таблицы workers создайте новое поле avg, в котором будет лежать
  деленная на 2 разница между максимальным значением возраста и минимальным значением
  возраста в во всей таблице.
*/
SELECT (SELECT (MAX(AGE) - min(AGE) / 2)) AS AVG
FROM workers;
/*При выборке из таблицы workers создайте новое поле avg, в котором будет лежать деленная на 2 разница между максимальным
  значением зарплаты и минимальным значением зарплаты для возраста 25 лет. */
SELECT (SELECT (MAX(AGE) - min(AGE) / 2)) AS AVG
FROM workers
WHERE AGE = 25;
/* На JOIN
//    Для решения задач данного блока вам понадобятся следующие SQL команды и функции: JOIN.
//    Даны две таблицы: таблица category с полями id и name и таблица page с полями id, name и category_id.
   Достаньте одним запросом все страницы вместе с их категориями.*/
insert into page(name, category_id)
values ('ivan', 1);
insert into page(name, category_id)
values ('max', 2);
insert into page(name, category_id)
values ('grisha', 3);
insert into page(name, category_id)
values ('anatoly', 4);
SELECT *
FROM page
         LEFT JOIN category on page.category_id = category.id;
/*Даны 3 таблицы: таблица category с полями id и name, таблица sub_category с полями id и name и таблица page с полями id, name и sub_category_id.
  Достаньте одним запросом все страницы вместе с их подкатегориями и категориями. */
SELECT *
FROM page
         LEFT JOIN category on page.category_id = category.id
         left join sub_category sc on page.category_id = sc.id;
/*  На работу с полями
//    Задачи данного блока следует решать SQL запросами, а не через PhpMyAdmin.
//    Создайте базы данных test1 и test2.*/
create
database test1;
create
database test2;
/* Удалите базу данных test2. */
drop
database test2;
/*Создайте в базе данных test1 таблицы table1 и table2 с полями id, login, salary, age, date. */
CREATE TABLE public.table1
(
    id     integer                  NOT NULL,
    login  character varying        NOT NULL,
    salary bigint                   NOT NULL,
    age    integer                  NOT NULL,
    date   timestamp with time zone NOT NULL,
    PRIMARY KEY (id)
);
CREATE TABLE public.table2
(
    id     integer                  NOT NULL,
    login  character varying        NOT NULL,
    salary bigint                   NOT NULL,
    age    integer                  NOT NULL,
    date   timestamp with time zone NOT NULL,
    PRIMARY KEY (id)
);
/*Переименуйте таблицу table2 в table3. */
alter table table2
    rename to table3;
/*Удалите таблицу table3. */
drop table table3;
/*Добавьте в таблицу table1 поле status. */
alter table table1
    add column status text;
/*Удалите из таблицы table1 поле age. */
alter table table1
drop
column age;
/*Переименуйте поле login на user_login.*/
alter table table1
    rename column login to user_login;
/* Смените типа поля salary с int на varchar(255). */
alter table table1
alter
column salary type varchar(255);
/*Очистите таблицу table1. */
delete
from table1;
/*Очистите все таблицы базы данных test1.*/
TRUNCATE test1;

