class Device {
    private String code;
    private String producer;
    private String type;
    private double price;

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
public String getInfo (Device device){
    return ("Kod: " + this.code + ", producent: " + this.producer + ", typ: " + this.type + ", cena: " + this.price);
}
//    public String getInfo(String code, String producer, String type) {
//        this.code = code;
//        this.producer = producer;
//        this.type = type;
//
//        return ("Kod: " + this.code + ", producent: " + this.producer + ", typ: " + this.type + ", cena: ");
//    }
//
//    public String getInfo(String code, String producer, String type, double price) {
//
//        this.code = code;
//        this.producer = producer;
//        this.type = type;
//        this.price = price;
//        return ("Kod: " + this.code + ", producent: " + this.producer + ", typ: " + this.type + ", cena: " + this.price);
//    }


}


