/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonParseException
 */
package nc.vo.pub.json;

import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import nc.vo.pub.json.JsonDeserializationContext;
import nc.vo.pub.json.JsonElement;

public interface JsonDeserializer<T> {
    public T deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException;
}

