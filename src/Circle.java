class Circle {
    final double pi = 3.14;
    double r;

     Circle(double r) {
        this.r = r;
    }

    double circleArea(Circle cirle){
        return cirle.pi * cirle.r * cirle.r;

    }
}
