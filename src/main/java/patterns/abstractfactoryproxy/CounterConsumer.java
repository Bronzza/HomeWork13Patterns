package patterns.abstractfactoryproxy;

public class CounterConsumer {

    private Counter counter;

    public CounterConsumer(Counter counter) {
        this.counter = counter;
    }

    public void doSmth() {
        counter.count();
    }
}
