public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        byte a = 2;
        short b = 1000;
        int c = 100000;
        long d = 5000000L;
        float e = 3.25f;
        double f = 5.95;
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);
    }
            public static void task2 () {
                System.out.println("Задача 2");
                byte a = 67;
                short b = -159;
                short bb = 569;
                int c = 27897;
                long d = 987678965549L;
                float e = 27.12f;
                double f = 2.786;
            }
    public static void task3 () {
        System.out.println("Задача 3");
        int a = 23;
        int b = 27;
        int c = 30;
        int f = 480;
        System.out.println("На каждого ученика рассчитано " + f / (a + b + c) + " листов бумаги");
    }
public static void task4 () {
    System.out.println("Задача 4");
    byte pr = 16 / 2;  //производительность бутылок за 1 минуту
    int a = 20 * pr;
    int b = pr * 60 * 24; // производительность за сутки
    int c = b * 3; // за 3 дня
    int d = b * 30;//за месяц
    System.out.println("За 20 минут машина произвела " + a + " штук бутылок");
    System.out.println("За сутки машина произвела " + b + " штук бутылок");
    System.out.println("За 3 дня машина произвела " + c + " штук бутылок");
    System.out.println("За месяц машина произвела " + d + " штук бутылок");
}
    public static void task5 () {
        System.out.println("Задача 5");
        byte all = 120;  //всего банок краски
        byte a = 2; // на 1 класс белой
        byte b = 4;// на 1 класс коричневой
        int c = all / (a + b); // всего классов
        int d = c * a;//всего белой
        int e = c * b;//всего коричневой
        System.out.println("В школе, где " + c + " классов, нужно " + d + " банок белой краски и " + e + " банок коричневой краски");
    }

        }



