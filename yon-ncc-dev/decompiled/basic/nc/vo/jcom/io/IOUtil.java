/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.jcom.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;

public abstract class IOUtil {
    public static final int DEFAULT_BUFFER_SIZE = 4096;
    public static final Charset UTF8_CHARSET = Charset.forName("utf-8");

    public static void write(byte[] input, Writer output) throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(input);
        IOUtil.write((InputStream)in, output);
    }

    public static void write(byte[] input, Writer output, String encoding) throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream(input);
        IOUtil.write(in, output, encoding);
    }

    public static int write(InputStream input, OutputStream output) throws IOException {
        byte[] buffer = new byte[4096];
        int count = 0;
        int n = 0;
        while (-1 != (n = input.read(buffer))) {
            output.write(buffer, 0, n);
            count += n;
        }
        return count;
    }

    public static int write(Reader input, Writer output) throws IOException {
        char[] buffer = new char[4096];
        int count = 0;
        int n = 0;
        while (-1 != (n = input.read(buffer))) {
            output.write(buffer, 0, n);
            count += n;
        }
        return count;
    }

    public static void write(InputStream input, Writer output) throws IOException {
        InputStreamReader in = new InputStreamReader(input);
        IOUtil.write((Reader)in, output);
    }

    public static void write(InputStream input, Writer output, String encoding) throws IOException {
        InputStreamReader in = new InputStreamReader(input, encoding);
        IOUtil.write((Reader)in, output);
    }

    public static void write(Reader input, OutputStream output) throws IOException {
        OutputStreamWriter out = new OutputStreamWriter(output);
        IOUtil.write(input, (Writer)out);
        out.flush();
    }

    public static void write(String input, OutputStream output) throws IOException {
        StringReader in = new StringReader(input);
        OutputStreamWriter out = new OutputStreamWriter(output);
        IOUtil.write((Reader)in, (Writer)out);
        out.flush();
    }

    public static void write(String input, Writer output) throws IOException {
        output.write(input);
    }

    public static void close(Reader input) {
        if (input == null) {
            return;
        }
        try {
            input.close();
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    public static void close(Writer output) {
        if (output == null) {
            return;
        }
        try {
            output.close();
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    public static void close(OutputStream output) {
        if (output == null) {
            return;
        }
        try {
            output.close();
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    public static void close(InputStream input) {
        if (input == null) {
            return;
        }
        try {
            input.close();
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    public static String toString(InputStream input) throws IOException {
        StringWriter sw = new StringWriter();
        IOUtil.write(input, (Writer)sw);
        return sw.toString();
    }

    public static String toString(InputStream input, String encoding) throws IOException {
        StringWriter sw = new StringWriter();
        IOUtil.write(input, (Writer)sw, encoding);
        return sw.toString();
    }

    public static byte[] toByteArray(InputStream input) throws IOException {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        IOUtil.write(input, (OutputStream)output);
        return output.toByteArray();
    }

    public static String toString(Reader input) throws IOException {
        StringWriter sw = new StringWriter();
        IOUtil.write(input, (Writer)sw);
        return sw.toString();
    }

    public static byte[] toByteArray(Reader input) throws IOException {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        IOUtil.write(input, (OutputStream)output);
        return output.toByteArray();
    }

    public static byte[] toByteArray(String input) throws IOException {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        IOUtil.write(input, (OutputStream)output);
        return output.toByteArray();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static File writeBytesToFile(byte[] filedata, String filename) throws IOException {
        File file = new File(filename);
        File pFile = file.getParentFile();
        if (!pFile.exists()) {
            pFile.mkdirs();
        }
        try (FileOutputStream outStream = new FileOutputStream(file);){
            outStream.write(filedata);
        }
        return file;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static ByteArrayOutputStream getByteStreamFromFile(File newfile) throws IOException {
        byte[] buffer = new byte[4096];
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        FileInputStream stream = null;
        stream = new FileInputStream(newfile);
        int index = 0;
        try {
            while ((index = ((InputStream)stream).read(buffer, 0, 4096)) > 0) {
                out.write(buffer, 0, index);
            }
        }
        finally {
            ((InputStream)stream).close();
        }
        return out;
    }

    public static int copy(InputStream input, OutputStream output) throws IOException {
        return IOUtil.copy(input, output, 4096);
    }

    public static int copyAndCloseInput(InputStream input, OutputStream output) throws IOException {
        try {
            int n = IOUtil.copy(input, output, 4096);
            return n;
        }
        finally {
            input.close();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int copyAndCloseInput(InputStream input, OutputStream output, int bufferSize) throws IOException {
        try {
            int n = IOUtil.copy(input, output, bufferSize);
            return n;
        }
        finally {
            input.close();
        }
    }

    public static int copy(InputStream input, OutputStream output, int bufferSize) throws IOException {
        int avail = input.available();
        if (avail > 262144) {
            avail = 262144;
        }
        if (avail > bufferSize) {
            bufferSize = avail;
        }
        byte[] buffer = new byte[bufferSize];
        int n = 0;
        n = input.read(buffer);
        int total = 0;
        while (-1 != n) {
            output.write(buffer, 0, n);
            total += n;
            n = input.read(buffer);
        }
        return total;
    }

    public static void copy(Reader input, Writer output, int bufferSize) throws IOException {
        char[] buffer = new char[bufferSize];
        int n = 0;
        n = input.read(buffer);
        while (-1 != n) {
            output.write(buffer, 0, n);
            n = input.read(buffer);
        }
    }

    public static String readStringFromStream(InputStream in) throws IOException {
        StringBuilder sb = new StringBuilder(1024);
        int i = in.read();
        while (i != -1) {
            sb.append((char)i);
            i = in.read();
        }
        in.close();
        return sb.toString();
    }

    public static byte[] readBytesFromStream(InputStream in) throws IOException {
        int i = in.available();
        if (i < 4096) {
            i = 4096;
        }
        ByteArrayOutputStream bos = new ByteArrayOutputStream(i);
        IOUtil.copy(in, bos);
        in.close();
        return bos.toByteArray();
    }
}

