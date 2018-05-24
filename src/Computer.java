class Computer {
    String nazwa;
    Memory memory;
    Processor processor;

    public Computer(String nazwa, Memory memory, Processor processor) {
        this.nazwa = nazwa;
        this.memory = memory;
        this.processor = processor;
    }


    String getInfo(){
        return ("nazwa: " +this.nazwa + "\n" + ", pamiec:  " + memory.getInfoAboutMemory() + "\n" + ", procesor: " + processor.getInfoAboutProcesor() );


    }

//    double increaseCpuClock(Computer computer, double x ) {
//        computer.processor.taktowanie = computer.processor.taktowanie + x;
//        return computer.processor.taktowanie;
//    }
}
