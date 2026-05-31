/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.jcom.io.fileparse;

import java.io.Serializable;
import java.util.ArrayList;

public class FileItemStatistics
implements Serializable {
    private String key = null;
    private ArrayList alFileNames = null;

    public FileItemStatistics(String key, String filename) {
        this.key = key;
        this.alFileNames = new ArrayList();
        this.alFileNames.add(filename);
    }

    public void addFileName(String filename) {
        this.alFileNames.add(filename);
    }

    public String getKey() {
        return this.key;
    }

    public boolean isDuplicated() {
        return this.alFileNames.size() >= 1;
    }

    public String[] getDuplicatedFileNames() {
        return this.alFileNames.toArray(new String[0]);
    }
}

