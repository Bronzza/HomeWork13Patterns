package patterns.abstractfactoryproxy;

import lombok.extern.log4j.Log4j;

@Log4j
public class ProxyCounter implements Counter, ProxyInterface {
    @Override
    public int count() {
        additionalLogic();
        int result = 0;
        for (int i = 0; i < 5; i++) {
            result = i;
        }
        return result;
    }

    @Override
    public void additionalLogic() {
        log.info("Counting to 5 started");
    }
}
