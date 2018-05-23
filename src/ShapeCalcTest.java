public class ShapeCalcTest {

    public static void main(String[] args) {
        Square kwadrat = new Square(2);
        ShapeCalculator poleKwadratu = new ShapeCalculator();
        poleKwadratu.squareArea(kwadrat);
        System.out.println("pole Kwadratu o bou 2 to : " + poleKwadratu.squareArea(kwadrat));


        Rectangle prostokat = new Rectangle(2,4);
        ShapeCalculator obwodProstokata = new ShapeCalculator();
        double obwod =obwodProstokata.rectPerimeter(prostokat);
        System.out.println("obwod prostokata to : " + obwod);






    }
}
