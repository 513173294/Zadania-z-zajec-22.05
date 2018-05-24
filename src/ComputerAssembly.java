class ComputerAssembly {

    Computer assembly(String nazwaKomputera, String nazwaPamieci,String model, int taktowaniePamieci, int iloscPamieci,
                    String producentProcesora, String modelProcesora, double taktowanieProcesora) {

        Memory newMemory = new Memory(nazwaPamieci, model, taktowaniePamieci, iloscPamieci);
        Processor newProcessor = new Processor(producentProcesora, modelProcesora, taktowanieProcesora);
        Computer newComputer = new Computer(nazwaKomputera, newMemory,newProcessor );
        return newComputer;

    }

}
