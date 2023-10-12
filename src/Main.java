import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int year = 2021;
        printLeapYear(year);

        int clientDeviceYear = 2015;
        int currentYear = LocalDate.now().getYear();

        checkAppVersion(0, clientDeviceYear, currentYear);
        //checkAppVersion(1, clientDeviceYear, currentYear);
    }

    public static void printLeapYear(int year) {
        if (isLeapYear(year)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public static void checkAppVersion(int osType, int clientDeviceYear, int currentYear) {
        if (clientDeviceYear < currentYear) {
            if (osType == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (osType == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (osType == 0) {
                System.out.println("Установите приложение для iOS по ссылке");
            } else if (osType == 1) {
                System.out.println("Установите приложение для Android по ссылке");
            }
        }
    }
}
