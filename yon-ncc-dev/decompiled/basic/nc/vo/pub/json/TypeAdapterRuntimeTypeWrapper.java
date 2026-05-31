/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.stream.JsonReader
 *  com.google.gson.stream.JsonWriter
 */
package nc.vo.pub.json;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import nc.vo.pub.json.Gson;
import nc.vo.pub.json.ReflectiveTypeAdapterFactory;
import nc.vo.pub.json.TypeAdapter;
import nc.vo.pub.json.TypeToken;

final class TypeAdapterRuntimeTypeWrapper<T>
extends TypeAdapter<T> {
    private final Gson context;
    private final TypeAdapter<T> delegate;
    private final Type type;

    TypeAdapterRuntimeTypeWrapper(Gson context, TypeAdapter<T> delegate, Type type) {
        this.context = context;
        this.delegate = delegate;
        this.type = type;
    }

    @Override
    public T read(JsonReader in) throws IOException {
        return this.delegate.read(in);
    }

    @Override
    public void write(JsonWriter out, T value) throws IOException {
        TypeAdapter<Object> chosen = this.delegate;
        Type runtimeType = this.getRuntimeTypeIfMoreSpecific(this.type, value);
        if (runtimeType != this.type) {
            TypeAdapter<?> runtimeTypeAdapter = this.context.getAdapter(TypeToken.get(runtimeType));
            chosen = !(runtimeTypeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter) ? runtimeTypeAdapter : (!(this.delegate instanceof ReflectiveTypeAdapterFactory.Adapter) ? this.delegate : runtimeTypeAdapter);
        }
        chosen.write(out, value);
    }

    private Type getRuntimeTypeIfMoreSpecific(Type type, Object value) {
        if (value != null && (type == Object.class || type instanceof TypeVariable || type instanceof Class)) {
            type = value.getClass();
        }
        return type;
    }
}

