/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.jcom.io.fileparse;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import nc.vo.jcom.io.fileparse.FileItemStatistics;
import nc.vo.jcom.io.fileparse.FileParser;
import nc.vo.jcom.io.fileparse.IFileParser;

public abstract class DirectoryFileParser
extends FileParser {
    private HashMap hsFileItems = new HashMap();
    protected ArrayList fileParsers = new ArrayList();

    public DirectoryFileParser(File file) {
        super(file);
    }

    public void addFileParser(IFileParser fileParser) {
        this.fileParsers.add(fileParser);
    }

    public void removeFileParser(IFileParser fileParser) {
        this.fileParsers.remove(fileParser);
    }

    public IFileParser getFileParser(int index) {
        return (IFileParser)this.fileParsers.get(index);
    }

    protected void putFileItem(String key, String filename) {
        FileItemStatistics fileItemStatistics = (FileItemStatistics)this.hsFileItems.get(key);
        if (fileItemStatistics == null) {
            fileItemStatistics = new FileItemStatistics(key, filename);
            this.hsFileItems.put(key, fileItemStatistics);
        } else {
            fileItemStatistics.addFileName(filename);
        }
    }

    public String[] getDuplicatedFileNames(String key) {
        FileItemStatistics fileItemStatistics;
        if (key != null && (fileItemStatistics = (FileItemStatistics)this.hsFileItems.get(key)) != null && fileItemStatistics.isDuplicated()) {
            return fileItemStatistics.getDuplicatedFileNames();
        }
        return null;
    }
}

