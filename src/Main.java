public class Main {
    public static void main(String[] args) {
        //задание 1
        int A=1;
        byte B=2;
        short C=3;
        long D=4L;
        float E=5.0f;
        double F=6.0;
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
        System.out.println(F);
        //задание 2
        E = 27.12f;
        F = 987678965549d;
        E = 2.786f;
        C = 569;
        A = -159;
        D = 27897L;
        B = 67;
        //задание 3
        byte LP = 23; //кол-во детей в классе Людмилы Павловны
        byte AC = 27; //кол-во детей в классе Александры Сергеевны
        byte EA = 30; //кол-во детей в классе Екатерины Андреевны
        short amountSheet = 480; // количество листов на всех детей
        int amountOfChildren = LP + AC + EA; //общее количество детей
        System.out.println("«На каждого ученика рассчитано " + amountSheet / amountOfChildren + " листов бумаги»");
        //задание 4
        byte machineProductivity = 16 / 2; //производительно машины в минуту
        int productivityFor20Minutes = machineProductivity * 20;
        //конвертация времени в минуты
        int for20Minutes = 20;
        int forDay = 24 * 60;
        int for3Days = forDay * 3;
        int for1month = forDay * 30;
        System.out.println("«За 20 минут машина произвела " + for20Minutes*machineProductivity + "  штук бутылок»");
        System.out.println("«За день машина произвела " + forDay*machineProductivity + "  штук бутылок»");
        System.out.println("«За три дня машина произвела " + for3Days*machineProductivity + "  штук бутылок»");
        System.out.println("«За три месяца машина произвела " + for1month*machineProductivity + "  штук бутылок»");
        //задание 5
        byte white = 2; //банок белой краски на один класс
        byte brown = 4; //банок коричневой краски на один класс
        byte amountClassRoom = (byte) (120/(white+brown)); //количество классов
        white = (byte) (white*amountClassRoom); //общее количесво банок белой краски
        brown = (byte) (brown*amountClassRoom);//общее количесво банок коричневой краски
        System.out.println("«В школе, где "+amountClassRoom+" классов, нужно "+white+"  банок белой краски и "+brown+"  банок коричневой краски».");
        //задание 6
        int banana = 5;
        int weightBanana = 80;
        int milk = 200;
        int milkDestiny=105/100;
        int iceCrem=2;
        int weightCream=100;
        int eggs=4;
        int weightEgg=70;
        int commonWeight=(banana*weightBanana)+(milk*milkDestiny)+(iceCrem*weightCream)+(eggs*weightEgg);
        float weightInKg=commonWeight/1000f;
        System.out.println("Общий вес напитка составляет "+commonWeight+" граммов, что в килограммах составляет "+weightInKg+" кг");
        //задание 7
        int weightLose=7;
        int weightInGr=7*1000; //вес в граммах
        int lessWeight=250;
        int moreWeight=500;
        System.out.println("При похудении на 250гр в сутки потребется "+ weightInGr/lessWeight+" дней, а при похудении на 500гр в сутки достаточно "+weightInGr/moreWeight+" дней");
        //задание 8
        int salaryMary=67760;  //нынешняя зарплата
        int salaryDeny=83690;
        int salaryChristy=76230;
        double newMaryS=salaryMary*1.1; //заработная плата после повышения
        double newDenyS=salaryDeny*1.1f;
        double newChrityS=salaryChristy*1.1f;
        double difMaryS=newMaryS-salaryMary;  //разница после повышения зарплаты
        double difDanyS=newDenyS-salaryDeny;
        double difChristyS=newChrityS-salaryChristy;
        System.out.println("«Маша теперь получает "+newMaryS+" рублей. Годовой доход вырос на "+difMaryS+" рублей».");
        System.out.println("«Денис теперь получает "+newDenyS+" рублей. Годовой доход вырос на "+difDanyS+" рублей».");
        System.out.println("«Кристина теперь получает "+newChrityS+" рублей. Годовой доход вырос на "+difChristyS+" рублей».");

    }
}