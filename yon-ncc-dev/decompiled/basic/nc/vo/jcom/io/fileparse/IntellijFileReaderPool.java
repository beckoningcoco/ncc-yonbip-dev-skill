/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.jcom.io.fileparse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import nc.vo.jcom.io.fileparse.IFileParser;
import nc.vo.jcom.io.fileparse.IntellijFileReader;

public class IntellijFileReaderPool {
    private static Map intellijFileReaders = Collections.synchronizedMap(new HashMap());

    public static IntellijFileReader getIntellijFileReader(IFileParser fileParser) {
        int filenamecode = fileParser.getFile().getPath().hashCode();
        String key = String.valueOf(filenamecode) + fileParser.getParserID();
        IntellijFileReader filereader = (IntellijFileReader)intellijFileReaders.get(key);
        if (filereader == null) {
            filereader = new IntellijFileReader(fileParser);
            if (fileParser.getFile().isFile()) {
                intellijFileReaders.put(key, filereader);
            }
        }
        return filereader;
    }
}

