public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }
    public static void task1() {
        System.out.println("Задача 1");
        int contribution = 15_000;
        double total = 0;
        double percentagesInMonth = 0.01;
        int month = 0;
        while (total <= 2_459_000) {
                total = total + contribution * percentagesInMonth;
                total = total + contribution;
            month = month + 1;
                System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
            }
        }
        public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i = i + 1;
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
        int population = 12_000_000;
        int birthRate = 17;
        int mortality = 8;
        for (int i = 1; i <= 10; i++) {
            int birthRateInYears = population / 1000 * 17;
            int mortalityInYears = population / 1000 * 8;
            population = population + birthRateInYears - mortalityInYears;
            System.out.println("Год "+ i +", численность населения составляет " + population);
        }
    }

}
