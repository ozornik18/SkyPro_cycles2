public class Main {
    public static void main(String[] args) {
        task1();
        task2();

    }
    public static void task1() {
        System.out.println("Задача 1");
        int contribution = 15_000;
        double total = 0;
        double percentagesInMonth = 0.01;
        for (int i = 1; ; i++) {
            while (total <= 2_459_000) {
                total = total + contribution * percentagesInMonth;
                total = total + contribution;
                System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
            }
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
    }
}
