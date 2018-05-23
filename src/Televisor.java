class Televisor {
    String status;


    void turnOn(){
        status = "Wlaczony";
    }


    void turnOff(){
        status = "Wylaczony";
    }
    void showStatus(){
        status = status;
        System.out.println(status);
    }
}


