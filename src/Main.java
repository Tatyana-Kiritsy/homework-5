public class Main {
    public static void main(String[] args) {

        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Извините, данная ОС не поддерживается.");
        }

        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS " +
                    "по ссылке.");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android " +
                    "по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android " +
                    "по ссылке.");
        } else {
            System.out.println("Извините, данная ОС не поддерживается.");
        }

        int year = 1960;
        if (year >= 1584 && ((year % 4 == 0) || (year % 400 == 0 && year % 100 != 0))) {
            System.out.println("Год високосный.");
        } else if (year > 1584) {
            System.out.println("Год не високосный.");
        } else {
            System.out.println("Год не должен быть меньше 1584.");
        }

        int deliveryDistance = 101;
        int deliveryTime = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryTime + ".");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryTime = 2;
            System.out.println("Потребуется дней: " + deliveryTime + ".");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryTime = 3;
            System.out.println("Потребуется дней: " + deliveryTime + ".");
        }
        else {
            System.out.println("Доставки нет(.");
        }

        int monthNumber = 15;
            switch (monthNumber) {
                case 12, 1, 2:
                    System.out.println("Это зимний месяц.");
                    break;
                case 3, 4, 5:
                    System.out.println("Это весенний месяц.");
                    break;
                case 6, 7, 8:
                    System.out.println("Это летний месяц.");
                    break;
                case 9, 10, 11:
                    System.out.println("Это осенний месяц.");
                    break;
                default:
                    System.out.println("Нет месяца с таким номером.");
            }

            int monthNum = 1;
            switch (monthNum) {
                case 12, 1, 2 -> System.out.println("Это зимний месяц.");
                case 3, 4, 5 -> System.out.println("Это весенний месяц.");
                case 6, 7, 8 -> System.out.println("Это летний месяц.");
                case 9, 10, 11 -> System.out.println("Это осенний месяц.");
                default -> System.out.println("Нет такого месяца.");
            }
        }
    }








