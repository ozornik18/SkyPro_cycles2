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
    }
}
