package patterns.abstractfactoryproxy;

public class ToFiveCounter implements Counter {
    @Override
    public int count() {
        int result = 0;
        for (int i = 0; i < 5; i++) {
            result = i;
        }
        return result;
    }
}
