package object;

import java.lang.String;
import java.util.List;

public record Array(List<Object> elements) implements Object {

    @Override
    public ObjectType type() {
        return ObjectType.ARRAY_OBJ;
    }

    @Override
    public String inspect() {
        String[] args = elements.stream()
                .map(Object::inspect)
                .toArray(String[]::new);
        return "[" + String.join(", ", args) + "]";
    }
}
