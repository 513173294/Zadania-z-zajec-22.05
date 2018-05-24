class Memory {
    String producent;
    String model;
    int taktowanie;
    int ilosc;

    public Memory(String producent, String model, int taktowanie, int ilosc) {
        this.producent = producent;
        this.model = model;
        this.taktowanie = taktowanie;
        this.ilosc = ilosc;
    }

    String getInfoAboutMemory(){
        return ("\n" + "Producent: " +this.producent + ", model: " + this.model + ", taktowanie: " + this.taktowanie + ", ilosc: " + this.ilosc);


    }
}
