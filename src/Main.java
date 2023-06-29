import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        System.out.println("Задача № 1");

        int clientIOC = 0;
        int clientAndroid = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите тип операционной системы :\n 0 для клиента IOC;\n 1 для клиента Android.");
        String clientOC = scanner.nextLine();
        if (clientOC.equals("0")) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else
            System.out.println("Установите версию приложения для Android по ссылке");
        System.out.println("Задача № 2");
        int clientDeviceYear = 2015;
        String OC = "IOS";
        String OC1 = "Android";
        if (clientDeviceYear <= 2015 && OC == "IOS") {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear <= 2015 && OC1 == "Android") {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else
            System.out.println("Установите приложение");
        System.out.println("Задача № 3");
        int year = 2021;

        if (year % 4 == 0 || year % 400 ==0 && year % 100 != 0) {
            System.out.println(year + " год является высокостным");
        } else
            System.out.println(year + " год не является высокостным");

            System.out.println("Задача № 4");
            int deliveryDistance = 95;
            int deliveryTime = 1;
            int deliveryTime1 = 2;
            int deliveryTime2 = 3;
            if (deliveryDistance <= 20)
                System.out.println("Потребуется дней: " + deliveryTime + " сутки");
            if (deliveryDistance > 20 && deliveryDistance <= 60) {
                System.out.println("Потребуется дней: " + deliveryTime1 + " суток");
            } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
                System.out.println("Потребуется дней: " + deliveryTime2 + " суток");
            } else
                System.out.println("Доставки нет");
            System.out.println("Задача № 5");
            int  monthNumber = 1;
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Время года зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Время года весна");
                    break;
                case  6:
                case 7:
                case 8:
                    System.out.println("Время года лето");
                    break;
                case  9:
                case 10:
                case 11:
                    System.out.println("Время года осень");
                    break;
                default:
                    System.out.println("Такого месяца не сущесвует");

            }




    }
}



