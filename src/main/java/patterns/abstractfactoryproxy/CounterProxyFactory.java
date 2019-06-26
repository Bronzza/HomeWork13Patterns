package patterns.abstractfactoryproxy;

public class CounterProxyFactory extends AbstractProxyFactory {
    @Override
    public ProxyInterface createProxy() {
        return new ProxyCounter();
    }
}
