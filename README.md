# Система, имитирующая работу пекарни полного цикла производства

## 1. Система закупки сырья. Ответственный Егоров Михаил
> Package factory_components
### Важно: разработка велась в ветке pr_1

### В данном задании использовались:
- Spring Web
- Spring Data Jpa
- Slf4j (с выводом логов в файл)
- Многопоточность для задержки и параллельного выполнения задания
- Lombok
- PostgreSQL

### Как работает
При вызове эндпоинта "/component/{component_name}?count={count}" сервис его обрабатывает и если данного component_name нет, то выдает ошибку, 
а иначе создается новый поток, где он ждет время изготовления компонента и потом обновляет запись в БД.

## 2. Система приготовления продукции. Ответственный Шевченко Даниил
> Package cooking_products

## 3. Система заказов. Ответственный Виноградов Клим
> Package create_order
### Как работает
Создал класс Order, который хранит список продуктов, дату и время создания заказа, тип заказа, город доставки.
Создал класс CreateOrder, который в методе create() создаёт объект Order, заполняет его рандомными значениями и возвращает

## 4. Система доставки. Ответственный Слюсаренко Алла
> Package delivery