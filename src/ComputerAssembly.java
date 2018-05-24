class ComputerAssembly {

    Computer assembly(String nazwa, String nazwaPamieci,String model, int taktowaniePamieci, int iloscPamieci,
                    String producentProcesora, String modelProcesora, double taktowanieProcesora) {

        Memory newMemory = new Memory(nazwaPamieci, model, taktowaniePamieci, iloscPamieci);
        Processor newProcessor = new Processor(producentProcesora, modelProcesora, taktowanieProcesora);
        Computer newComputer = new Computer(nazwa, newMemory,newProcessor );
        return newComputer;

    }

}
