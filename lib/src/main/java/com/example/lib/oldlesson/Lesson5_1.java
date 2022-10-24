package com.example.lib.oldlesson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;

public class Lesson5_1 {
    public static void main(String[] args) {
        Shop shop = new Shop();
        //создаем товары 3 штуки
        Good good1 = new Good(1, "t-shirt", 200);
        Good good3 = new Good(2, "shoes", 1000);
        Good good2 = new Good(3, "jeans", 500);
        //добавляем эти товары в магазин
        shop.addGood(good1);
        shop.addGood(good2);
        shop.addGood(good3);

        //получаем список товаров
        HashSet<Good> allGoods = shop.getAllGoods();

        //поскольку хэшсет не имеет сортировки - делаем лист и сортируем по цене
        ArrayList<Good> sortedAllGoodsByPrice = new ArrayList<Good>(allGoods);
        sortedAllGoodsByPrice.sort(new Comparator<Good>() {
            @Override
            public int compare(Good good, Good t1) {
                return Integer.valueOf(good.getPrice()).compareTo(Integer.valueOf(t1.getPrice()));
            }
        });

        //выводим отсортированные товары по цене
        for (Good sortedGood : sortedAllGoodsByPrice) {
            System.out.print(sortedGood.getId() + " " + sortedGood.getName() + " " + sortedGood.getPrice() + "\n");
        }
        //1 t-shirt 200
        //3 jeans 500
        //2 shoes 1000

        System.out.println();

        //тут просто выводим все товары машазина
        for (Good good : allGoods) {
            System.out.print(good.getId() + " " + good.getName() + " " + good.getPrice() + "\n");
        }
        //1 t-shirt 200
        //2 shoes 1000
        //3 jeans 500

        System.out.println();

        //тут удаляем товар из магазина по айди
        shop.deleteGood(good1.getId());
        //тут проверяем удалился ли он выводя все товары магазина
        for (Good good : allGoods) {
            System.out.print(good.getId() + " " + good.getName() + " " + good.getPrice() + "\n");
        }
        //2 shoes 1000
        //3 jeans 500

        System.out.println();

        //тут редактируем товар
        //я изменила только цену
        shop.editGood(new Good(3, "jeans", 1010));
        for (Good good : allGoods) {
            System.out.print(good.getId() + " " + good.getName() + " " + good.getPrice() + "\n");
        }
        //2 shoes 1000
        //3 jeans 1010

        System.out.println();

        //тут сортируем товары по последнему добавленному
        ArrayList<Good> sortedAllGoodsByLast = new ArrayList<Good>(allGoods);
        Collections.reverse(sortedAllGoodsByLast);
        for (Good good : sortedAllGoodsByLast) {
            System.out.print(good.getId() + " " + good.getName() + " " + good.getPrice() + "\n");
        }
        //3 jeans 1010
        //2 shoes 1000
    }
}

//создаем класс товар
class Good {
    //создаем поля
    private int id;
    private String name;
    private int price;

    //создаем конструктор
    Good(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    //переопределяем товар по айдишнику
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Good good = (Good) o;
        return id == good.id;
    }

    //не забываем также про переопределения хэшкода
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

//создаем класс магазин
class Shop {

    //создаем поле коллекции
    HashSet<Good> goodList = new HashSet<Good>();

    //создаем метод добавления товара
    void addGood(Good good) {
        goodList.add(good);
    }

    //создаем метод получения товара
    HashSet<Good> getAllGoods() {
        return goodList;
    }

    //создаем метод удаления товара
//    void deleteGood(int id) {
//        //тут удаляем по айдишнику(если такой айдишник есть в коллекции)
//        goodList.removeIf(good -> good.getId() == id);
//    }

    //создаем метод редактирования товара
    void editGood(Good good) {
        //пробегаемся по коллекции
        for (Good goodInList : goodList) {
            //проверяем есть ли в коллекции товар с таким же айдишником который мы хотим изменить
            if (goodInList.getId() == good.getId()) {
                //если есть то удаляем такой товар
                goodList.remove(goodInList);
                //и добавляем уже измененный
                goodList.add(good);
            }
        }


    }

    public void deleteGood(int id) {
    }
}
