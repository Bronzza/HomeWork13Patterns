package patterns.abstractfactoryproxy.adapter;

import lombok.Setter;
import patterns.abstractfactoryproxy.Counter;

@Setter
public class AdapterCounter implements Counter {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void count() {
        adaptee.count();
    }
}
