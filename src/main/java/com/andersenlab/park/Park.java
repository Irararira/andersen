package com.andersenlab.park;

public class Park {
    private Attraction[] attraction;
    private int position;

    public Park(int size) {
        this.attraction = new Attraction[size];
        this.position = 0;
    }

    public void addAttraction(String name, int startTime, int endTime, double price) {
        if (this.position == this.attraction.length - 1) {
            return;
        }
        this.attraction[this.position] = new Attraction(name, startTime, endTime, price);
        this.position++;
    }

    public void deleteAttraction() {
        this.position--;
        this.attraction[this.position] = null;
    }

    public void parkAttraction() {
        System.out.println("Список аттракционов: ");
        for (int i = 0; i < position; i++) {
            System.out.println(this.attraction[i]);
        }
    }

    class Attraction {
        private final String name;
        private final int startTime;
        private final int endTime;
        private final double price;

        public Attraction(String name, int startTime, int endTime, double price) {
            this.name = name;
            this.startTime = startTime;
            this.endTime = endTime;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public int getStartTime() {
            return startTime;
        }

        public int getEndTime() {
            return endTime;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return "Attraction{" +
                    "name='" + name + '\'' +
                    ", startTime=" + startTime +
                    ", endTime=" + endTime +
                    ", price=" + price +
                    '}';
        }
    }

}