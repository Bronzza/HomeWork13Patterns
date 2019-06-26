package patterns.abstractfactoryproxy;

import patterns.abstractfactoryproxy.adapter.AdapterCounter;

public class AbstractFactLauncher {
    public static void main(String[] args) {
        CounterConsumer counterConsumer1 = new CounterConsumer(new ToFiveCounter());
        CounterProxyFactory counterProxyFactory = new CounterProxyFactory();
        ConcreteProxyCreator creatorFactory = new ConcreteProxyCreator();
        creatorFactory.createProxy(counterProxyFactory);
        CounterConsumer counterConsumer2 = new CounterConsumer((ProxyCounter) counterProxyFactory.createProxy());
        CounterConsumer counterConsumer3 = new CounterConsumer(creatorFactory.getProxyCounter());
        CounterConsumer counterConsumer4 = new CounterConsumer(new AdapterCounter());
        System.out.println(counterConsumer1.doSmth());
        System.out.println(counterConsumer2.doSmth());
        System.out.println(counterConsumer3.doSmth());
        System.out.println(counterConsumer4.doSmth());
    }
}
