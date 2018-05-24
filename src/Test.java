public class Test {
    public static void main(String[] args) {
//        Memory pamiecHP = new Memory("Ballistix", "Sport LT",2400,2 );
//        Memory pamiecAcer = new Memory("Corsair","Vengeance LPX",3000,4);
//        Processor procHP = new Processor("AMD", "Athlon X4 845",3.5);
//        Processor procArer = new Processor("Intel", "Core i3 2120",3.3);
//        Computer hP = new Computer("HP EliteBook", pamiecHP,procHP);
//        Computer acer = new Computer("Acer Z500", pamiecAcer,procArer);

        ComputerAssembly pc2 = new ComputerAssembly();
        Computer hP =pc2.assembly("HP EliteBook", "Ballistix","Sport LT",2400,2,"AMD", "Athlon X4 845",3.5);
        System.out.println(hP.getInfo()+"\n");

        ComputerAssembly pc3 = new ComputerAssembly();
        Computer acer = pc3.assembly("Acer","Corsair","Vengeance LPX",3000,4,"Intel", "Core i3 2120",3.3);
        System.out.println(acer.getInfo()+"\n");



        System.out.println("HP initial: " + hP.processor.taktowanie);
        System.out.println("Acer inital: " + acer.processor.taktowanie + "\n");
        OverClock oc = new OverClock();
        oc.decreaseCpuClock(hP, 2.5);

        System.out.println("HP after change" + hP.processor.taktowanie);

        oc.increaseCpuClock(acer, 0.5);
        System.out.println("Acer after change" + acer.processor.taktowanie + "\n");

        ComputerAssembly cA = new ComputerAssembly();
        Computer asus = cA.assembly("Asus", " Patriot", "Viper 4",3000,2,
                "Intel ","Core i7-7820X", 3.6);
        System.out.println(asus.getInfo());

        System.out.println("Asus initial " + asus.processor.taktowanie + "\n" );
        oc.increaseCpuClock(asus, 1.2);
        System.out.println("Asus after change: " + asus.processor.taktowanie);



    }



}
