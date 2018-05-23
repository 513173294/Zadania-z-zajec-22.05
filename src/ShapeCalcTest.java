public class ShapeCalcTest {

    public static void main(String[] args) {
        Square kwadrat = new Square(2);
        ShapeCalculator poleKwadratu = new ShapeCalculator();
        poleKwadratu.squareArea(kwadrat);
        System.out.println("pole kwadratu o boku 2 to : " + poleKwadratu.squareArea(kwadrat));


        Rectangle prostokat = new Rectangle(2,4);
        ShapeCalculator obwodProstokata = new ShapeCalculator();
        double obwod =obwodProstokata.rectPerimeter(prostokat);
        System.out.println("obwod prostokata  o bokach 2 i 4 to : " + obwod);

        Triangle trojkat1 = new Triangle(15,3.5);
        ShapeCalculator poleTrojkata = new ShapeCalculator();
        double pole = poleTrojkata.triangleArea(trojkat1);
        System.out.println("pole trojkata o podstawie 15 i wysokosci 3.5 to : " + pole);

        Circle kolo1 = new Circle(2);
        ShapeCalculator polekola = new ShapeCalculator();
        double poletko = polekola.circleArea(kolo1);
        System.out.println("pole kola o promieniu 2 to : " + poletko);


    }
}
