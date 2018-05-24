class Processor {
    String producent;
    String model;
    double taktowanie;

     Processor(String producent, String model, double taktowanie) {
        this.producent = producent;
        this.model = model;
        this.taktowanie = taktowanie;
    }

    String getInfoAboutProcesor(){
        return ("\n" + "Producent: " + this.producent + ", model: " + this.model + ", taktowanie: " + this.taktowanie);


    }

}
