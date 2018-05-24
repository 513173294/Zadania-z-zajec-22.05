public class OverClock {

    double increaseCpuClock(Computer computer, double x ){
        computer.processor.taktowanie = computer.processor.taktowanie + x;
        return computer.processor.taktowanie;
    }

    double decreaseCpuClock(Computer computer, double x ){
        computer.processor.taktowanie = computer.processor.taktowanie - x;
        return computer.processor.taktowanie;
    }
}
