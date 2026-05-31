/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.json;

import java.lang.reflect.Type;
import nc.vo.pub.json.JsonElement;

public interface JsonSerializationContext {
    public JsonElement serialize(Object var1);

    public JsonElement serialize(Object var1, Type var2);
}

