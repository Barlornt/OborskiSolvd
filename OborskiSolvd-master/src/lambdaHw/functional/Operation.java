package lambdaHw.functional;

@FunctionalInterface
public interface Operation<T, U, R> {
    R apply(T t, U u);
}