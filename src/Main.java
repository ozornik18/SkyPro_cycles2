public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
 //       task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int contribution = 15_000;
        int total = 0;
        int month = 0;

        while (total <= 2_459_000) {
            month++;
            total = total + contribution / 100;
            total = total + contribution;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;

        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();

        for (int x = 10; x >= 1; x--) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int populationInYear = 12_000_000;
        int birthRate = 17;
        int mortality = 8;
        int growth = (birthRate - mortality) * 1000;
        int year = 0;
        while (year < 10) {
            populationInYear = populationInYear + growth;
            year++;
            System.out.println("Год " + year + ", Численность населения составляет " + populationInYear);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int contribution = 15_000;
        double total = 0;
        double percentagesInMonth = 0.07;
        int month = 0;
        while (total <= 12_000_000) {
            total = total + contribution * percentagesInMonth;
            total = total + contribution;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int contribution = 15_000;
        double total = 0;
        double percentagesInMonth = 0.07;
        int month = 0;
        while (total <= 12_000_000) {
            total = total + contribution * percentagesInMonth;
            total = total + contribution;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int contribution = 15_000;
        double total = 0;
        double percentagesInMonth = 0.07;
        int month = 0;
        while (month <= 108) {
            total = total + contribution * percentagesInMonth;
            total = total + contribution;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int friday = 2;
        int day = 31;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday += 7;
        }
    }

}
