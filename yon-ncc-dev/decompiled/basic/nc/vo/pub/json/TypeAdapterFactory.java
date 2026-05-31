/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.json;

import nc.vo.pub.json.Gson;
import nc.vo.pub.json.TypeAdapter;
import nc.vo.pub.json.TypeToken;

public interface TypeAdapterFactory {
    public <T> TypeAdapter<T> create(Gson var1, TypeToken<T> var2);
}

