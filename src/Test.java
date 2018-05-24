public class Test {
    public static void main(String[] args) {
        Memory pamiecHP = new Memory("Ballistix", "Sport LT",2400,2 );
        Memory pamiecAcer = new Memory("Corsair","Vengeance LPX",3000,4);
        Processor procHP = new Processor("AMD", "Athlon X4 845",3.5);
        Processor procArer = new Processor("Intel", "Core i3 2120",3.3);
        Computer hP = new Computer("HP EliteBook", pamiecHP,procHP);
        Computer acer = new Computer("Acer Z500", pamiecAcer,procArer);

        System.out.println("HP initial: " + hP.processor.taktowanie);
        System.out.println("Acer inital: " + acer.processor.taktowanie);
        OverClock oc = new OverClock();
        oc.decreaseCpuClock(hP,2.5);

        System.out.println(hP.processor.taktowanie);

        oc.increaseCpuClock(acer,0.5);
        System.out.println(acer.processor.taktowanie);







    }



}
