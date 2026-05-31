/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonSyntaxException
 *  com.google.gson.internal.JavaVersion
 *  com.google.gson.internal.PreJava9DateFormatProvider
 *  com.google.gson.internal.bind.util.ISO8601Utils
 *  com.google.gson.stream.JsonReader
 *  com.google.gson.stream.JsonToken
 *  com.google.gson.stream.JsonWriter
 */
package nc.vo.pub.json;

import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.JavaVersion;
import com.google.gson.internal.PreJava9DateFormatProvider;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import nc.vo.pub.json.Gson;
import nc.vo.pub.json.TypeAdapter;
import nc.vo.pub.json.TypeAdapterFactory;
import nc.vo.pub.json.TypeToken;

public final class DateTypeAdapter
extends TypeAdapter<Date> {
    public static final TypeAdapterFactory FACTORY = new TypeAdapterFactory(){

        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            return typeToken.getRawType() == Date.class ? new DateTypeAdapter() : null;
        }
    };
    private final List<DateFormat> dateFormats = new ArrayList<DateFormat>();

    public DateTypeAdapter() {
        this.dateFormats.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.dateFormats.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (JavaVersion.isJava9OrLater()) {
            this.dateFormats.add(PreJava9DateFormatProvider.getUSDateTimeFormat((int)2, (int)2));
        }
    }

    @Override
    public Date read(JsonReader in) throws IOException {
        if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
        }
        return this.deserializeToDate(in.nextString());
    }

    private synchronized Date deserializeToDate(String json) {
        for (DateFormat dateFormat : this.dateFormats) {
            try {
                return dateFormat.parse(json);
            }
            catch (ParseException parseException) {
            }
        }
        try {
            return ISO8601Utils.parse((String)json, (ParsePosition)new ParsePosition(0));
        }
        catch (ParseException e) {
            throw new JsonSyntaxException(json, (Throwable)e);
        }
    }

    @Override
    public synchronized void write(JsonWriter out, Date value) throws IOException {
        if (value == null) {
            out.nullValue();
            return;
        }
        String dateFormatAsString = this.dateFormats.get(0).format(value);
        out.value(dateFormatAsString);
    }
}

