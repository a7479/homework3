public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
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
    public static void task6 () {
        System.out.println("Задача 6");
        int banan = 5;  //всего бананов
        int weightBanan  = 80; // вес 1 банана
        int milk = 200;// молоко
        int weightMilk = 105/100; // вес 1мл молока
        int icecream=2;//всего брикетов мороженого
        int weightIcecream=100;//вес 1 брикета мороженого
        int egg=4;//всего яиц
        int weightEgg=70;//вес 1 яйца
        int menu=banan*weightBanan+milk*weightMilk+icecream*weightIcecream+egg*weightEgg;
        float kilo=menu/1000f;//перевод в кг
        System.out.println("Завтрак спортсмена весит: " +menu+ " гр ("+ kilo+ " кг)");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int weightKg = 7;//вес в кг, сколько нужно сбросить
        int weightGr = 7 * 1000;//вес в гр
        int down1 = 250;//сброс веса каждый день по 250гр
        int down2 = 500;//сброс веса каждый день по 500гр
        System.out.println("Если спортсмен будет сбрасывать каждый день по " + down1 + "гр, то для снижения веса на 7 кг ему понадобится " + weightGr/down1 + " дней");
        System.out.println("Если спортсмен будет сбрасывать каждый день по " + down2 + "гр, то для снижения веса на 7 кг ему понадобится " + weightGr/down2 + " дней");

    }public static void task8 () {
        System.out.println("Задача 8");
        int salaryMasha = 67760;//ЗП Маши
        int salaryDenis = 83690;//ЗП Дениса
        int salaryKristina = 76230;//ЗП Кристины
        int yearSalaryMasha=salaryMasha*12;
        int yearSalaryDenis=salaryDenis*12;
        int yearSalaryKristina=salaryKristina*12;
        float newSalaryMasha = salaryMasha*1.1f;//новая ЗП Маши
        float newSalaryDenis = salaryDenis*1.1f;//новая ЗП Дениса
        float newSalaryKristina = salaryKristina*1.1f;//новая ЗП Кристины
        float newYearSalaryMasha=newSalaryMasha*12f;
        float newYearSalaryDenis=newSalaryDenis*12f;
        float newYearSalaryKristina=newSalaryKristina*12f;
        float Masha=newYearSalaryMasha-yearSalaryMasha;
        float Denis=newYearSalaryDenis-yearSalaryDenis;
        float Kristina=newYearSalaryKristina-yearSalaryKristina;
        System.out.println("Маша теперь получает "+newSalaryMasha+" рублей. Годовой доход вырос на "+Masha+" рублей");
        System.out.println("Денис теперь получает "+newSalaryDenis+" рублей. Годовой доход вырос на "+Denis+" рублей");
        System.out.println("Кристина теперь получает "+newSalaryKristina+" рублей. Годовой доход вырос на "+Kristina+" рублей");


    }



        }



