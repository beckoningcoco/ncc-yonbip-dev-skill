/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Logger
 */
package nc.vo.jcom.io.fileparse;

import java.io.File;
import nc.bs.logging.Logger;
import nc.vo.jcom.io.fileparse.DirectoryFileParser;
import nc.vo.jcom.io.fileparse.FileParseException;
import nc.vo.jcom.io.fileparse.IFileParser;

public class IntellijFileReader
implements IFileParser {
    IFileParser fileParser = null;
    private long modifiedtime = -1L;
    private long moremodifiedtime = -1L;
    private Object m_result = null;
    private Object m_resultMore = null;

    public IntellijFileReader(IFileParser fileParser) {
        this.fileParser = fileParser;
    }

    @Override
    public Object getResult() throws FileParseException {
        if (this.fileParser.getFile().isDirectory() || this.m_result == null || this.modifiedtime != this.fileParser.getFile().lastModified()) {
            this.m_result = null;
            this.m_result = this.fileParser.getResult();
            this.modifiedtime = this.fileParser.getFile().lastModified();
        }
        return this.m_result;
    }

    @Override
    public Object getResultMore() throws FileParseException {
        if (this.fileParser.getFile().isDirectory() || this.m_result == null || this.moremodifiedtime != this.fileParser.getFile().lastModified()) {
            this.m_result = null;
            this.m_resultMore = this.fileParser.getResultMore();
            this.moremodifiedtime = this.fileParser.getFile().lastModified();
        }
        return this.m_resultMore;
    }

    @Override
    public String getParserID() {
        return this.fileParser.getParserID();
    }

    public String getFilePath() {
        return this.fileParser.getFile().getPath();
    }

    @Override
    public File getFile() {
        return this.fileParser.getFile();
    }

    public String[] getDuplicatedFileNames(String key) {
        if (this.fileParser.getFile().isDirectory()) {
            try {
                this.modifiedtime = -1L;
                this.getResult();
            }
            catch (FileParseException e) {
                Logger.error((Object)e.getMessage(), (Throwable)e);
            }
            return ((DirectoryFileParser)this.fileParser).getDuplicatedFileNames(key);
        }
        return null;
    }
}

