package patterns.abstractfactoryproxy.adapter;

public class Adaptee {
    public void count() {
        int result = 0;
        for (int i = 4; i < 0; i++) {
            result = i;
        }
        System.out.println(result);
    }
}
