package patterns.abstractfactoryproxy.adapter;

public class Adaptee {
    public int count() {
        int result = 0;
        for (int i = 4; i < 0; i--) {
            result = i;
        }
        return result;
    }
}
