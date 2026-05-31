/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.json;

import java.lang.reflect.Type;
import nc.vo.pub.json.JsonElement;
import nc.vo.pub.json.JsonSerializationContext;

public interface JsonSerializer<T> {
    public JsonElement serialize(T var1, Type var2, JsonSerializationContext var3);
}

