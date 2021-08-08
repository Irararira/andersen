package com.andersenlab.payment;

public class Payment {

    private Item[] items;
    private int position;

    public Payment(int size) {
        this.items = new Item[size];
        this.position = 0;
    }

    public void addItem(String name, double price, int count) {
        if (this.position == this.items.length - 1) {
            return;
        }
        this.items[this.position] = new Item(name, price, count);
        this.position++;
    }

    public void deleteItem() {
        this.position--;
        this.items[this.position] = null;
    }

    public void seePayment() {
        System.out.println("Список товаров: ");
        for (int i = 0; i < position; i++) {
            System.out.println(this.items[i]);
        }
    }

    class Item {
        private final String name;
        private final double price;
        private final int count;

        public Item(String name, double price, int count) {
            this.name = name;
            this.price = price;
            this.count = count;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public int getCount() {
            return count;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    ", count=" + count +
                    '}';
        }
    }
}
