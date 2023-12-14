import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nВведите номер проверяемой задачи");
            short number = scanner.nextShort();
            switch (number) {
                case 1 : definingOS();
                break;
                case 2 : definingOSYear();
                break;
                case 3 : isLeapYear();
                break;
                case 4 : deliveryDaysCalculation();
                break;
                case 5 : definingSeason();
                break;
                default: System.out.println("Такой задачи нет");
            }
        }
    }
    public static void definingOS() {
        System.out.println("Введите номер операционной системы: iOS - 0, Android - 1");
        Scanner scanner = new Scanner(System.in);
        boolean clientOS = scanner.nextInt() == 1;
        System.out.println(clientOS ? "Установите версию приложения для Android по ссылке" : "Установите версию приложения для iOS по ссылке" );
    }

    public static void definingOSYear() {
        System.out.println("Введите номер операционной системы: iOS - 0, Android - 1");
        Scanner scanner = new Scanner(System.in);
        boolean clientOS = scanner.nextInt() == 1;
        System.out.println("Введите год выпуска вашего смартфона");
        int clientDeviceYear = scanner.nextInt();

        if(clientOS) {
            if (clientDeviceYear >= 2015) System.out.println("Установите версию приложения для Android по ссылке");
            else System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015) System.out.println( "Установите версию приложения для iOS по ссылке");
            else System.out.println("Установите облегченную версию приложения для iOS по ссылке");
    }

    public static void isLeapYear(){
        System.out.println("Введите год");
        Scanner scanner = new Scanner(System.in);
        short year = scanner.nextShort();
        if (year >= 1584 && year % 4 == 0 && (year % 100 != 0 || year% 400 ==0)) System.out.println(year + " год является високосным");
        else System.out.println(year + " год не является високосным");
    }
    public static void deliveryDaysCalculation() {
        System.out.println("Введите расстояние от офиса до адреса доставки");
        Scanner scanner = new Scanner(System.in);
        short deliveryDistance = scanner.nextShort();
        int deliveryDays = 1;
        if (deliveryDistance <= 20 ) System.out.println("Потребуется " + deliveryDays + " день");
        if (deliveryDistance > 20 && deliveryDistance <= 60) System.out.println("Потребуется " + ++deliveryDays + " дня");
        if (deliveryDistance > 60 && deliveryDistance <= 100) System.out.println("Потребуется " + (deliveryDays + 2) + " дня");
        if (deliveryDistance > 100)  System.out.println("Доставки нет");

    }
    public static void definingSeason() {
        System.out.println("Введите порядковый номер месяца");
        Scanner scanner = new Scanner(System.in);
        short monthNumber = scanner.nextShort();
        switch (monthNumber) {
            case 12, 1, 2 : System.out.println("Это зимний месяц");
                break;
            case 3, 4, 5 : System.out.println("Это весенний месяц");
                break;
            case 6, 7, 8 : System.out.println("Это летний месяц");
                break;
            case 9, 10, 11 : System.out.println("Это осенний месяц");
                break;
            default: System.out.println("Такого месяца нет");
        }
    }
}