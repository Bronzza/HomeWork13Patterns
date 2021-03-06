package patterns.abstractfactoryproxy;

import lombok.Getter;
import lombok.Setter;

public class ConcreteProxyCreator {
    @Setter
    @Getter
    private ProxyCounter proxyCounter;

    public void createProxy(AbstractProxyFactory factory) {
        if (factory.getClass().equals(CounterProxyFactory.class)) {
            proxyCounter = (ProxyCounter) factory.createProxy();
        }
    }
}
