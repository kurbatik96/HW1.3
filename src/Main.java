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
    public static void task1() {
        System.out.println("Задача 1");
        int intNumber = 777777;
        byte byteNumber = 77;
        short shNumber = 7777;
        long longNumber = 777777777;
        float floatNumber = 3.77f;
        double doubleNumber = 77.777;
        System.out.println(intNumber+" "+byteNumber+" "+shNumber+" "+longNumber+" "+floatNumber+" "+doubleNumber);
    }

    public static void task2() {
        System.out.println("Задача 2");
     float floatNumber = 27.12f;
      long longNumber = 987678965549L;
      double doubleNumber = 2.786;
      short shNumber = 569;
      char chNumber = 159;
      int intNumber = 27897;
      byte byteNumber = 67;
        System.out.println(floatNumber+" "+longNumber+" "+doubleNumber+" "+shNumber+" "+chNumber+" "+intNumber+" "+byteNumber);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int lp = 23;
        int as = 27;
        int ea = 30;
        int sheets = 480;
        int result = sheets/(lp+as+ea);
        System.out.println("На каждого ученика рассчитано "+ result + " листов бумаги.");
    }

    public static void task4() {
        System.out.println("Задача 4");
        int bottles = 16;
        int time = 2;
        int bottlesMinute = bottles/time;
        int bootlesHours = bottlesMinute*60;
        int minetsWork20 = bottlesMinute*20;
        int hoursWork24 = bootlesHours*24;
        int day3 = hoursWork24*3;
        int month = day3*10;
        System.out.println("За 20 минут машина произвела " + minetsWork20 + " штук бутылок.");
        System.out.println("За 1 сутки машина произвела " + hoursWork24 + " штук бутылок." );
        System.out.println("За 3 дня машина произвела " + day3 + " штук бутылок.");
        System.out.println("за 1 месяц машина произвела "+ month + " штук бутылок.");
    }

    public static void task5() {
        System.out.println("Задача 5");
        int cans = 120;
        int white = 2;
        int brown = 4;
        int cansTotal = white+brown;
        int class1 = cans/cansTotal;
        int cansWhite = white*class1;
        int cansBrown = brown*class1;
        System.out.println("В школе, где "+class1+" классов,нужно "+cansWhite+" банок белой краски и "+cansBrown+" банок коричневой краски");
    }

    public static void task6() {
        System.out.println("Задача 6");
        int banana = 5;
        int bananaWeight = 80;
        int milk = 2;
        int milkWeight = 105;
        int iceCream = 2;
        int iceCreamWeight = 100;
        int egg = 4;
        int eggWeight = 70;
        int grPerKg = 1000;
        double weightGrams = (banana*bananaWeight)+(milk*milkWeight)+(iceCream*iceCreamWeight)+(egg*eggWeight);
        double weightKg = weightGrams/grPerKg;
        System.out.println(weightGrams+" грамм.");
        System.out.println(weightKg+ " килограмм.");
    }

    public static void task7() {
        System.out.println("Задача 7");
        int purposeKg = 7;
        double lowerGram = 0.250;
        double highGram = 0.500;
        double midelGram = (lowerGram+highGram)/2;
        double day1 = purposeKg/lowerGram;
        double day2 = purposeKg/highGram;
        double day3 = purposeKg/midelGram;
        System.out.println(day1+" Дней потребуеться, что бы похудеть на " + purposeKg + " килограмм, "+ "если за 1 день худеть на " + lowerGram+" килограмм." );
        System.out.println(day2+" Дней потребуеться , что бы похудеть на " + purposeKg + " килограмм, "+ "если за 1 день худеть на " + highGram+" килограмм." );
        System.out.println(day3+" Дней потребуеться , что бы похудеть на " + purposeKg + " килограмм, "+ "если за 1 день худеть на " + midelGram+" килограмм." );
    }

    public static void task8() {
        System.out.println("Задача 8");
        int year = 12;
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int percent = 10;
        int increaseMasha = (masha*percent)/100;
        int increaseDenis = (denis*percent)/100;
        int increaseKristina = (kristina*percent)/100;
        int result1 = increaseMasha*year;
        int result2 = increaseDenis*year;
        int result3 = increaseKristina*year;
        System.out.println("Маша теперь получает "+(masha+increaseMasha)+" рублей. Годовой доход теперь вырос на "+result1+" рублей.");
        System.out.println("Денис теперь получает "+(denis+increaseDenis)+" рублей. Годовой доход теперь вырос на "+result2+" рублей.");
        System.out.println("Кристина теперь получает "+(kristina+increaseKristina)+" рублей. Годовой доход теперь вырос на "+result3+" рублей.");
    }
}