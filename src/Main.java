public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int contribution = 15_000;
        int total = 0;
        int month = 0;
        while (total <= 2_459_000) {
            month = month + 1;
            total = total + contribution/100;
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
        double populationInYears = 12_000_000;
        double birthRateInYears = 0.17;
        double mortalityInYears = 0.08;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Год " + i);
            double birthRate = birthRateInYears * populationInYears;
            double mortality = mortalityInYears * populationInYears;
            double population = populationInYears + birthRate - mortality;
                System.out.println(", Численность населения = " + population + populationInYears);
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
            month = month + 1;
            System.out.println("Месяц " + month +  ", сумма накоплений равна " + total + " рублей");
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
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month +  ", сумма накоплений равна " + total + " рублей");
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
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month +  ", сумма накоплений равна " + total + " рублей");
            }
        }
    }
}