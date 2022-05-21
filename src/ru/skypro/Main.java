package ru.skypro;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        // Дополнительные задачи
        task6();
        task7();
    }

    public static void task1() {
        int clientOS = 0;   // 0 - iOS; 1 - Android

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        /* должен быть без вложенностей */
        int clientOS = 0; // По условию 0 или 1
        int clientDeviceYear = 2012;
        boolean clientDeviceIsNew = clientDeviceYear >= 2015;

        if (clientOS == 0 && clientDeviceIsNew) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 0 && !clientDeviceIsNew) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceIsNew) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS == 1 && !clientDeviceIsNew) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void task3() {
        int year = 2005;
        boolean yearIsEveryFourth = year % 4 == 0;
        boolean yearIsEveryFourHundred = year % 400 == 0;
        boolean yearIsEveryHundred = year % 100 == 0;

        if (!yearIsEveryHundred && yearIsEveryFourth || yearIsEveryFourHundred) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4() {
        int deliveryDistance = 60;
        int deliveryTime = 1;
        int distanceRange = 40;

        if (deliveryDistance > 20) {
            deliveryTime += (20 + deliveryDistance) / distanceRange;
        }
        System.out.println("Потребуется дней: " + deliveryTime);
    }

    public static void task5() {
        int monthNumber = 4;
        if (monthNumber < 13 && monthNumber > 0) {
            switch (monthNumber) {
                case 3:
                case 4:
                case 5:
                    System.out.println(monthNumber + " месяц принадлежит к сезону весна.");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println(monthNumber + " месяц принадлежит к сезону лето.");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println(monthNumber + " месяц принадлежит к сезону осень.");
                    break;
                case 1:
                case 2:
                case 12:
                    System.out.println(monthNumber + " месяц принадлежит к сезону зима.");
                    break;
                default:
                    break;
            }
        }
    }

    public static void task6() {
        int age = 25;
        int salary = 90_000;

        int limit = (age >= 23) ? 3 * salary : 2 * salary;
        if (salary >= 80000) {
            limit *= 1.5;
        } else if (salary >= 50000) {
            limit *= 1.2;
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");
    }

    public static void task7() {
        int age = 22;
        int salary = 40000;
        int wantedSum = 330_000;
        double base = 10.0;                         // % ставка годовых
        int monthCredit = 12;
        double maxPaymentMonth = salary * 0.5;      // 50 % от зарплаты
        double totalSum;                            // сумма к возврату
        double paymentMonth;
        String result = "Отказано";

        double creditRate = (salary > 80000) ? base - 0.7 : base;   // Итоговая процентная ставка %
        if (age < 23) {
            creditRate += 1.0;
        } else if (age < 30) {
            creditRate += 0.5;
        }
        totalSum = wantedSum * (1 + creditRate / 100);
        paymentMonth = totalSum / monthCredit;
        if (maxPaymentMonth > paymentMonth) {
            result = "Одобрено";
        } else {
            result = "Отказано";
        }
        System.out.printf("Максимальный платеж при ЗП %d равен %.2f рублей. " +
                "Платеж по кредиту %.2f рублей. %s", salary, maxPaymentMonth, paymentMonth, result);
    }
}