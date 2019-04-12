package patterns.abstractfactoryproxy;

import lombok.Getter;

public class ConcreteProxyCreatror {
    @Getter
    ProxyCounter proxyCounter;

    public void createProxy(AbstractProxyFactory factory) {
        if (factory.getClass().equals(CounterProxyFactory.class)) {
            proxyCounter = (ProxyCounter) factory.createProxy();
        }
    }
}
