package OOPS;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;

public class CustomOptional <T> {
    private final T value;

    public static final CustomOptional<?> EMPTY = new CustomOptional<>(null);
    public CustomOptional(T value) {
        this.value = value;
    }

    @SuppressWarnings("unchecked")
    public static <T> CustomOptional<T> ofNullable(T obj) {
        return obj == null ? (CustomOptional<T>) EMPTY : new CustomOptional<>(obj);
    }

    public <P> CustomOptional<P> map(Function<? super T, ? extends P> mapper) {
        Objects.requireNonNull(mapper);
        if (isEmpty()) {
            return empty();
        } else {
            return CustomOptional.ofNullable(mapper.apply(value));
        }
    }

    public boolean isEmpty() {
        return value == null;
    }

    @SuppressWarnings("unchecked")
    public <K> CustomOptional<K> empty() {
        return (CustomOptional<K>) EMPTY;
    }

    public T orElseGet(Supplier<? extends T> supplier) {
        return value != null  ? value : supplier.get();
    }

    public T orElse(T other) {
        return value != null  ? value : other;
    }

    public <X extends Throwable> T orElseThrow(Supplier<? extends X> supplier) throws X {
        if (value != null) {
            return value;
        }
        throw supplier.get();
    }
}
