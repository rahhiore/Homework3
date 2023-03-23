public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        int apple = 600;
        byte piecePineapple = 30;
        short kiwi = 18000;
        long distance = 83246931426L;
        float salt = 3.69f;
        double pi = 3.14;
        System.out.println("Значение переменной apple с типом int равно " + apple);
        System.out.println("Значение переменной piecePineapple с типом byte равно " + piecePineapple);
        System.out.println("Значение переменной kiwi с типом short равно " + kiwi);
        System.out.println("Значение переменной distance с типом long равно " + distance);
        System.out.println("Значение переменной salt с типом float равно " + salt);
        System.out.println("Значение переменной pi с типом double равно " + pi);

    }
    public static void task2() {
        float first = 27.12f;
        long second = 987678965549L;
        double third = 2.786;
        int fourth = 569;
        short fifth = -159;
        short sixth = 27897;
        byte seventh = 67;
        System.out.println(first + ", " + second + ", " + third + ", " + fourth + ", " + fifth + ", " + sixth +
                ", " + seventh);
    }
    public static void task3() {
        int studentsLudmila = 23;
        int studentsAnn = 27;
        int studentsEkaterina = 30;
        System.out.println("На каждого ученика рассчитано " +
                (480 / (studentsEkaterina + studentsAnn + studentsLudmila)) + " листов бумаги");
    }
    public static void task4() {
        int bottles = 16;
        int first = 20 / 2 * bottles;
        System.out.println("За 20 минут машина произвела " + first + " штук бутылок");
        int second = first * 3 * 24;
        System.out.println("За сутки машина произвела " + second + " штук бутылок");
        int third = second * 3;
        System.out.println("За 3 дня машина произвела " + third + " штук бутылок");
        int fourth = third * 10;
        System.out.println("За 1 месяц машина произвела " + fourth + " штук бутылок");
    }
    public static void task5() {
        int allPaint = 120;
        int whitePaint = 2;
        int brownPaint = 4;
        int classes = allPaint / (whitePaint + brownPaint);
        System.out.println("В школе, где " + classes + " классов, нужно " + (whitePaint * classes) +
                " банок белой краски и " + (brownPaint * classes) + " банок коричневой краски");
    }
    }