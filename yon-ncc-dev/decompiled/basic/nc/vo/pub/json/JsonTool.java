/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.json;

import java.lang.reflect.Type;
import java.util.List;
import nc.vo.pub.json.Gson;
import nc.vo.pub.json.GsonBuilder;
import nc.vo.pub.json.JsonArray;
import nc.vo.pub.json.JsonElement;
import nc.vo.pub.json.JsonObject;
import nc.vo.pub.json.JsonParser;
import nc.vo.pub.json.TypeToken;

public class JsonTool {
    private static final Gson gson = new GsonBuilder().create();
    private static final JsonParser parser = new JsonParser();

    public static <T> T jsonToObject(String json, Class<T> classOfT) {
        return gson.fromJson(json, classOfT);
    }

    public static String objectToJson(Object obj) {
        return gson.toJson(obj);
    }

    public static JsonObject jsonToJsonObject(String json) {
        return parser.parse(json).getAsJsonObject();
    }

    public static JsonArray jsonToJsonArray(String json) {
        return parser.parse(json).getAsJsonArray();
    }

    public static List<?> jsonToList(String json) {
        return (List)gson.fromJson(json, new TypeToken().getType());
    }

    public static <T> T jsonToNewType(String json, Type type) {
        return gson.fromJson(json, type);
    }

    public static <T> T jsonObjectToObject(JsonObject jsonObject, Class<T> classOfT) {
        return gson.fromJson((JsonElement)jsonObject, classOfT);
    }

    public static String listToJson(List<?> list) {
        return gson.toJson(list);
    }

    public static JsonObject objectToJsonObject(Object obj) {
        return gson.toJsonTree(obj).getAsJsonObject();
    }

    public static List<?> jsonArrayToList(JsonArray jsonArray) {
        return (List)gson.fromJson((JsonElement)jsonArray, new TypeToken().getType());
    }

    public static JsonArray listToJsonArray(List<?> list) {
        return gson.toJsonTree(list, new TypeToken().getType()).getAsJsonArray();
    }
}

