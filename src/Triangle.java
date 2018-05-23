class Triangle {
    double a;
    double h;

    Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    double triangleArea(Triangle triangle){
        return (triangle.a *triangle.h) / 2;
    }

}
