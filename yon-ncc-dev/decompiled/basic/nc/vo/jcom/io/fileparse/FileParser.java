/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.jcom.io.fileparse;

import java.io.File;
import nc.vo.jcom.io.fileparse.IFileParser;

public abstract class FileParser
implements IFileParser {
    protected File file = null;

    public FileParser(File file) {
        this.file = file;
    }

    @Override
    public File getFile() {
        return this.file;
    }
}

