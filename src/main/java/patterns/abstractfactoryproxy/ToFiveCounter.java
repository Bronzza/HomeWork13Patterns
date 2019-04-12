package patterns.abstractfactoryproxy;

public class ToFiveCounter implements Counter {
    @Override
    public void count() {
        int result = 0;
        for (int i = 0; i < 5; i++) {
            result = i;
        }
        System.out.println(result);
    }
}
