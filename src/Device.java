class Device {
    String code;
    String producer;
    String type;
    double price;

    Device(String code, String producer, String type) {
        this.code = code;
        this.producer = producer;
        this.type = type;
    }

    Device(String code, String producer, String type, double price) {
        this.code = code;
        this.producer = producer;
        this.type = type;
        this.price = price;
    }
    void getInfo(String code, String producer, String type) {
        System.out.println("Kod: " + this.code + ", producent: " + this.producer + ", typ: " + this.type + ", cena: ");

    }

    void getInfo(){
        System.out.println("Kod: " +this.code + ", producent: " + this.producer + ", typ: " + this.type + ", cena: " + this.price);


    }

}


