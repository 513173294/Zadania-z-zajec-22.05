public class ShapeCalcTest {

    public static void main(String[] args) {
//        ShapeCalculator poleKwadratu = new ShapeCalculator();
//        poleKwadratu.squareArea(kwadrat);
//        System.out.println("pole kwadratu o boku 2 to : " + poleKwadratu.squareArea(kwadrat));

        Square kwadrat = new Square(2);//wrzuc w nawias bok kwadratu:
        double kwadracik = kwadrat.squareArea(kwadrat);
        System.out.println("pole kwadratu o boku 2 to : " + kwadracik);


//        ShapeCalculator obwodProstokata = new ShapeCalculator();
//        double obwod =obwodProstokata.rectPerimeter(prostokat);
//        System.out.println("obwod prostokata  o bokach 2 i 4 to : " + obwod);

        Rectangle prostokat = new Rectangle(2,4);//wrzuc w nawias boki prostokata zeby obliczyc obwod
        double prost = prostokat.rectPerimeter(prostokat);
        System.out.println("obwod prostokata  o bokach 2 i 4 to : " + prost);


        Rectangle rect = new Rectangle(5, 10);//wrzuc w nawias boki prostokata zeby obliczyc pole
        double rectArea = rect.calculateArea(rect);
        System.out.println("pole prostokata o boka 5 i 10 to : " + rectArea);




        Triangle trojkat1 = new Triangle(15,3.5);//wrzuc w nawias podstawe i wysokosc trojkata zeby obliczyc pole
        double trojkacik = trojkat1.triangleArea(trojkat1);
        System.out.println("Pole trojkata o wys 3.5 i podstawie15 to : " + trojkacik);

//
// ShapeCalculator poleTrojkata = new ShapeCalculator();
//        double pole = poleTrojkata.triangleArea(trojkat1);
//        System.out.println("pole trojkata o podstawie 15 i wysokosci 3.5 to : " + pole);




        Circle kolo1 = new Circle(2);
        double koleczko = kolo1.circleArea(kolo1);
        System.out.println("pole kola o promieniu 2 to: "+ koleczko);



//        ShapeCalculator polekola = new ShapeCalculator();
//        double poletko = polekola.circleArea(kolo1);
//        System.out.println("pole kola o promieniu 2 to : " + poletko);
//

    }
}
