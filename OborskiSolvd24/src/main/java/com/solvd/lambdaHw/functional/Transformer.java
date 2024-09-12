package lambdaHw.functional;

@FunctionalInterface
public interface Transformer<T, R> {
    R transform(T t);
}