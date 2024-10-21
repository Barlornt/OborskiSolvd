package lambdaHw.functional;

@FunctionalInterface
public interface Checker<T> {
    boolean check(T t);
}