public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task4() {
        System.out.println("Задание5");
        int monthNumber = 13;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println(monthNumber + " такого месяца не существует выберите от 1-12");
        }
        if (monthNumber > 0 && monthNumber <3 || monthNumber ==12) {
            System.out.println("принадлежит к сезону зима");
        }
        if (monthNumber >2 && monthNumber <6) {
            System.out.println("принадлежит к сезону весна");
        }
        if (monthNumber >5 && monthNumber <9) {
            System.out.println("принадлежит к сезону лето");
        }
        if (monthNumber >8 && monthNumber <12) {
            System.out.println("принадлежит к сезону осень");
        }
    }

    public static void task3() {
        System.out.println("Задание4");
        int deliveryDistance = 95;

        int oneDay = 1;

        if (deliveryDistance >20) {
            oneDay++;
        }
        if (deliveryDistance > 40) {
            oneDay++;
        }
        if (deliveryDistance >60) {
            oneDay++;
        }

            System.out.println(oneDay + " дня + срок доставки");

    }

    public static void task2() {
        System.out.println("Задание3");
        int year = 1200;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " является високосным");
        } else {
            System.out.println(year + " не является високосным");
        }
    }

    public static void task1() {
        System.out.println("Задание1-2");
        int clientOS = 1;
        int productYear = 2015;
        if (clientOS ==0) {
            if (productYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }

        } else {

        if (clientOS == 1) {
            if (productYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
            }
        }
    }
}