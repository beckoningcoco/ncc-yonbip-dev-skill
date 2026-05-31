/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.jcom.io.fileparse;

import java.io.File;
import java.io.FileFilter;
import nc.vo.jcom.io.FileFilterFactory;
import nc.vo.jcom.io.fileparse.DirectoryFileParser;
import nc.vo.jcom.io.fileparse.FileParseException;
import nc.vo.jcom.io.fileparse.IFileParser;

public abstract class FileParserFactory {
    public IFileParser getFileParser(String pathname) throws FileParseException {
        File file = new File(pathname);
        if (!file.exists()) {
            throw new FileParseException("File path error,file path:" + pathname);
        }
        return this.getFileParser(file);
    }

    public IFileParser getFileParser(File file) throws FileParseException {
        if (file == null) {
            throw new FileParseException("bad parameter!file can't be null!");
        }
        if (file.isDirectory()) {
            return this.createDirectoryParser(file);
        }
        return this.createFileParser(file);
    }

    protected abstract IFileParser createFileParser(File var1) throws FileParseException;

    protected abstract IFileParser createDirectoryParser(File var1) throws FileParseException;

    protected IFileParser initDirectoryParser(IFileParser dirParser) throws FileParseException {
        FileFilter filter = this.getFileFilter();
        if (filter == null) {
            filter = FileFilterFactory.suffixFileFilter("xml");
        }
        File[] files = dirParser.getFile().listFiles(filter);
        for (int i = 0; i < files.length; ++i) {
            IFileParser fileParser = this.createFileParser(files[i]);
            ((DirectoryFileParser)dirParser).addFileParser(fileParser);
        }
        return dirParser;
    }

    protected FileFilter getFileFilter() {
        return null;
    }
}

