package interfaces;

@FunctionalInterface
public interface TestObject<T> {
    boolean test(T o);
}
