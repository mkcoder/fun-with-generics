package excerise3.finalproject.generics;

import java.util.HashMap;
import java.util.Map;

/**
 * Searches for the model in the service context, which is a Map
 */
public class DomainRetriever {

    private Map<Class<? extends DomainModel>, Class<?>> serviceContext;

    public DomainRetriever() {
        serviceContext = new HashMap<>();
    }

    public <T extends R, R extends DomainModel> void put(Class<R> key, Class<T> type) {
        serviceContext.put(key, type);
    }

    public <T, R extends DomainModel> T get(Class<R> key, Class<T> type) throws IllegalAccessException, InstantiationException {
        return (T) serviceContext.get(key).newInstance();
    }
}
