class Rectangle {
    double a;
    double b;

   Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double calculateArea(Rectangle rectangle){
       return rectangle.a * rectangle.b;
    }

    double rectPerimeter(Rectangle rectangle){
        return rectangle.a * 2 +rectangle.b *2;
    }

}
