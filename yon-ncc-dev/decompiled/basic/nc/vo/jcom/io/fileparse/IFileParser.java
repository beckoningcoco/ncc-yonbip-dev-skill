/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.jcom.io.fileparse;

import java.io.File;
import nc.vo.jcom.io.fileparse.FileParseException;

public interface IFileParser {
    public Object getResult() throws FileParseException;

    public Object getResultMore() throws FileParseException;

    public String getParserID();

    public File getFile();
}

