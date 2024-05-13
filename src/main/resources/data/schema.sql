DROP TABLE IF EXISTS products;

CREATE Table products
(
    product_id INT NOT NULL AUTO_INCREMENT,
    name varchar(100) not null ,
    description varchar(200) null ,
    private DECIMAL(10, 2) NOT NULL ,
    primary key (product_id)
);

drop table if exists  orders;

create table orders
(
    order_id int not null AUTO_INCREMENT,
    customer_id int not null ,
    ordered_at DATETIME not null ,
    primary key (order_id)
);


drop table if exists order_items;

CREATE table order_items
(
    order_item_id int not null AUTO_INCREMENT,
    product_id int not null ,
    order_id int not null ,
    order_quantity int not null ,
    primary key (order_item_id)
);

drop table if exists customers;

CREATE table customers
(
    customer_id int not null AUTO_INCREMENT,
    name varchar(100) not null ,
    phone_number varchar(100) null,
    address varchar(100) not null,
    primary key (customer_id)
);