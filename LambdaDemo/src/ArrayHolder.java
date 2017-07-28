import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


public class ArrayHolder {
    int[] values;


    public ArrayHolder(int[] values) {
        this.values = values;
    }


    public void forEach(Consumer<Integer> consumer) {
        for (int val : values) {
            consumer.accept(val);
        }
    }


    public void modify(Function<Integer, Integer> function) {
        for (int i = 0; i < values.length; i++) {
            values[i] = function.apply(values[i]);
        }
    }


    public void delete(Predicate<Integer> predicate) {
        for (int i = 0; i < values.length; i++) {
            if (predicate.test(values[i])) {
                values[i] = 0;
            }
        }
    }


    public int fold(BiFunction<Integer, Integer, Integer> biFunction) {
        for (int i = 1; i < values.length; i++) {
            values[i] = biFunction.apply(values[i - 1], values[i]);
        }
        return values[values.length - 1];
    }
}
