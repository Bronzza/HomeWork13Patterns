package patterns.abstractfactoryproxy;

import patterns.abstractfactoryproxy.ConcreteProxyCreatror;
import patterns.abstractfactoryproxy.CounterConsumer;
import patterns.abstractfactoryproxy.CounterProxyFactory;
import patterns.abstractfactoryproxy.ProxyCounter;
import patterns.abstractfactoryproxy.ToFiveCounter;
import patterns.abstractfactoryproxy.adapter.AdapterCounter;

public class AbstractFactLauncher {
    public static void main(String[] args) {
        CounterConsumer counterConsumer1 = new CounterConsumer(new ToFiveCounter());
        CounterProxyFactory counterProxyFactory = new CounterProxyFactory();
        ConcreteProxyCreatror creatorFactory = new ConcreteProxyCreatror();
        creatorFactory.createProxy(counterProxyFactory);
        CounterConsumer counterConsumer2 = new CounterConsumer((ProxyCounter) counterProxyFactory.createProxy());
        CounterConsumer counterConsumer3 = new CounterConsumer(creatorFactory.getProxyCounter());
        CounterConsumer counterConsumer4 = new CounterConsumer(new AdapterCounter());
        counterConsumer1.doSmth();
        counterConsumer2.doSmth();
        counterConsumer3.doSmth();
        counterConsumer4.doSmth();
    }
}
