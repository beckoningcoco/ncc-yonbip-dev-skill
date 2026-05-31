/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.jcom.io;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import nc.vo.jcom.io.FileFilterFactory;

public class FileFilterFactoryAdapter {
    private static ArrayList alFilters = new ArrayList();

    public static javax.swing.filechooser.FileFilter prefixFileFilter(String prefix) {
        return FileFilterFactoryAdapter.prefixFileFilter(prefix, null, true);
    }

    public static javax.swing.filechooser.FileFilter prefixFileFilter(String prefix, String description) {
        return FileFilterFactoryAdapter.prefixFileFilter(prefix, description, true);
    }

    public static javax.swing.filechooser.FileFilter prefixFileFilter(String prefix, String description, boolean caseSensitive) {
        alFilters.clear();
        alFilters.add(prefix + "*");
        return new FileFilterAdapter(FileFilterFactory.prefixFileFilter(prefix, caseSensitive), description);
    }

    public static javax.swing.filechooser.FileFilter prefixFileFilter(String[] prefixes) {
        return FileFilterFactoryAdapter.prefixFileFilter(prefixes, null, true);
    }

    public static javax.swing.filechooser.FileFilter prefixFileFilter(String[] prefixes, String description) {
        return FileFilterFactoryAdapter.prefixFileFilter(prefixes, description, true);
    }

    public static javax.swing.filechooser.FileFilter prefixFileFilter(String[] prefixes, String description, boolean caseSensitive) {
        alFilters.clear();
        for (int i = 0; i < prefixes.length; ++i) {
            alFilters.add(prefixes[i] + "*");
        }
        return new FileFilterAdapter(FileFilterFactory.prefixFileFilter(prefixes, caseSensitive), description);
    }

    public static javax.swing.filechooser.FileFilter suffixFileFilter(String suffix) {
        return FileFilterFactoryAdapter.suffixFileFilter(suffix, null, true);
    }

    public static javax.swing.filechooser.FileFilter suffixFileFilter(String suffix, String description) {
        return FileFilterFactoryAdapter.suffixFileFilter(suffix, description, true);
    }

    public static javax.swing.filechooser.FileFilter suffixFileFilter(String suffix, String description, boolean caseSensitive) {
        alFilters.clear();
        alFilters.add("*" + suffix);
        return new FileFilterAdapter(FileFilterFactory.suffixFileFilter(suffix, caseSensitive), description);
    }

    public static javax.swing.filechooser.FileFilter suffixFileFilter(String[] suffixes) {
        return FileFilterFactoryAdapter.suffixFileFilter(suffixes, null, true);
    }

    public static javax.swing.filechooser.FileFilter suffixFileFilter(String[] suffixes, String description) {
        return FileFilterFactoryAdapter.suffixFileFilter(suffixes, description, true);
    }

    public static javax.swing.filechooser.FileFilter suffixFileFilter(String[] suffixes, String description, boolean caseSensitive) {
        alFilters.clear();
        for (int i = 0; i < suffixes.length; ++i) {
            alFilters.add("*" + suffixes[i]);
        }
        return new FileFilterAdapter(FileFilterFactory.suffixFileFilter(suffixes, caseSensitive), description);
    }

    public static javax.swing.filechooser.FileFilter nameFileFilter(String fileName) {
        return FileFilterFactoryAdapter.nameFileFilter(fileName, null, true);
    }

    public static javax.swing.filechooser.FileFilter nameFileFilter(String fileName, String description) {
        return FileFilterFactoryAdapter.nameFileFilter(fileName, description, true);
    }

    public static javax.swing.filechooser.FileFilter nameFileFilter(String fileName, String description, boolean caseSensitive) {
        alFilters.clear();
        alFilters.add(fileName);
        return new FileFilterAdapter(FileFilterFactory.nameFileFilter(fileName, caseSensitive), description);
    }

    public static javax.swing.filechooser.FileFilter directoryFileFilter() {
        alFilters.clear();
        return new FileFilterAdapter(FileFilterFactory.directoryFileFilter(), "Folder");
    }

    public static javax.swing.filechooser.FileFilter fileFileFilter() {
        alFilters.clear();
        return new FileFilterAdapter(FileFilterFactory.fileFileFilter(), "File");
    }

    public static javax.swing.filechooser.FileFilter excludeFileFilter(Set fileNames) {
        return FileFilterFactoryAdapter.excludeFileFilter(fileNames, null);
    }

    public static javax.swing.filechooser.FileFilter excludeFileFilter(Set fileNames, String description) {
        alFilters.clear();
        return new FileFilterAdapter(FileFilterFactory.excludeFileFilter(fileNames), description);
    }

    public static javax.swing.filechooser.FileFilter excludeFileFilter(List files) {
        return FileFilterFactoryAdapter.excludeFileFilter(files, null);
    }

    public static javax.swing.filechooser.FileFilter excludeFileFilter(List files, String description) {
        alFilters.clear();
        return new FileFilterAdapter(FileFilterFactory.excludeFileFilter(files), description);
    }

    public static javax.swing.filechooser.FileFilter existsFileFilter(String relativePath) {
        return FileFilterFactoryAdapter.existsFileFilter(relativePath, null);
    }

    public static javax.swing.filechooser.FileFilter existsFileFilter(String relativePath, String description) {
        alFilters.clear();
        return new FileFilterAdapter(FileFilterFactory.existsFileFilter(relativePath), description);
    }

    public static javax.swing.filechooser.FileFilter or(final javax.swing.filechooser.FileFilter[] filters) {
        return new javax.swing.filechooser.FileFilter(){

            @Override
            public boolean accept(File f) {
                boolean result = false;
                for (int i = 0; i < filters.length; ++i) {
                    result = result || filters[i].accept(f);
                }
                return result;
            }

            @Override
            public String getDescription() {
                StringBuffer buffer = new StringBuffer();
                for (int i = 0; i < filters.length; ++i) {
                    String desc = filters[i].getDescription();
                    if (desc == null || desc.length() == 0 || buffer.length() <= 0) continue;
                    buffer.append(";" + desc);
                }
                return buffer.toString();
            }
        };
    }

    private static class FileFilterAdapter
    extends javax.swing.filechooser.FileFilter {
        private boolean useFiltersInDescription = true;
        private FileFilter adaptee0 = FileFilterFactory.directoryFileFilter();
        private FileFilter adaptee = null;
        private String description = null;
        private String fullDescription = null;

        public FileFilterAdapter(FileFilter adaptee, String description) {
            this.adaptee = adaptee;
            this.description = description;
        }

        @Override
        public boolean accept(File f) {
            return this.adaptee0.accept(f) || this.adaptee.accept(f);
        }

        @Override
        public String getDescription() {
            if (this.fullDescription == null) {
                if (this.description == null || this.isFilterListInDescription()) {
                    String string = this.fullDescription = this.description == null ? "(" : this.description + " (";
                    if (alFilters.size() == 0) {
                        this.fullDescription = this.fullDescription + "All Files";
                    } else {
                        for (int j = 0; j < alFilters.size(); ++j) {
                            this.fullDescription = j == 0 ? this.fullDescription + (String)alFilters.get(j) : this.fullDescription + "," + (String)alFilters.get(j);
                        }
                    }
                    this.fullDescription = this.fullDescription + ")";
                } else {
                    this.fullDescription = this.description;
                }
            }
            return this.fullDescription;
        }

        public void setFiltersListInDescription(boolean b) {
            this.useFiltersInDescription = b;
        }

        public boolean isFilterListInDescription() {
            return this.useFiltersInDescription;
        }
    }
}

