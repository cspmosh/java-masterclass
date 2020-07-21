import java.util.List;

public interface Saveable {
    List<String> save();
    void restore(List<String> values);
}
