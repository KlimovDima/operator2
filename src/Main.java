public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOs = 0;
        if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOs = 0;
        int clientDeviceYear = 2019;
        boolean newAndroid = (clientOs == 1 && clientDeviceYear >= 2015);
        boolean oldAndroid = (clientOs == 1 && clientDeviceYear < 2015);
        // boolean newIos = (clientOs == 0 && clientDeviceYear >= 2015);
        boolean oldIos = (clientOs == 0 && clientDeviceYear < 2015);

        if (oldAndroid) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (newAndroid) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (oldIos) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2016;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("високосный");
        } else {
            System.out.println("не високосный");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 10;
        int deliveryDay = 1;
        int deliveryDayFirst = deliveryDay + 1;
        int deliveryDayTwo = deliveryDay + 2;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryDay);
        } else if (deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + deliveryDayFirst);
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + deliveryDayTwo);
        } else {
            System.out.println("Доставка не доступна");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int month = 8;
        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println(month + " месяц принадлежит сезону: Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(month + " месяц принадлежит сезону: Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(month + " месяц принадлежит сезону: Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(month + " месяц принадлежит сезону: Осень");
                break;
            default:
                System.out.println("Введён не верный номер месяца");
        }
    }

}
