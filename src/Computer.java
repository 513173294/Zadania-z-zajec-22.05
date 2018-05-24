class Computer {
    String nazwa;
    Memory memory;
    Processor processor;

    public Computer(String nazwa, Memory memory, Processor processor) {
        this.nazwa = nazwa;
        this.memory = memory;
        this.processor = processor;
    }


    String getInfo() {
        return ("Nazwa: " + this.nazwa + "\n" + "Pamiec:  " + memory.getInfoAboutMemory() + "\n" + "Procesor: " + processor.getInfoAboutProcesor());


    }
}

