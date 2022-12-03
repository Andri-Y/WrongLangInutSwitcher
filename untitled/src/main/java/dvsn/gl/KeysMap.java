package dvsn.gl;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

//TODO implement KeysMap methods
public class KeysMap implements Map {

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Object get(Object key) {
        return null;
    }

    @Override
    public Object put(Object key, Object value) {
        return null;
    }

    @Override
    public Object remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set keySet() {
        return null;
    }

    @Override
    public Collection values() {
        return null;
    }

    @Override
    public Set<Entry> entrySet() {
        return null;
    }

    @Override
    public void forEach(BiConsumer action) {
        Map.super.forEach(action);
    }

    @Override
    public void replaceAll(BiFunction function) {
        Map.super.replaceAll(function);
    }

    @Override
    public Object merge(Object key, Object value, BiFunction remappingFunction) {
        return Map.super.merge(key, value, remappingFunction);
    }
}
