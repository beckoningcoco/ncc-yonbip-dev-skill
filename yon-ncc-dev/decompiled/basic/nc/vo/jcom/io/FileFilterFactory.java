/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.jcom.io;

import java.io.File;
import java.io.FileFilter;
import java.util.List;
import java.util.Set;

public abstract class FileFilterFactory {
    public static String[] JAR_POSTFIX = new String[]{".jar", ".zip"};
    public static String[] PURE_CLIENT_JAR_POSTFIX = new String[]{"_ui.jar", "_ui.zip"};
    public static String[] SRC_JAR_POSTFIX = new String[]{"_src.jar", "_src.zip"};
    public static FileFilter JAR_FILTER = FileFilterFactory.suffixFileFilter(JAR_POSTFIX);
    public static FileFilter SRC_JAR_FILTER = FileFilterFactory.suffixFileFilter(SRC_JAR_POSTFIX);
    public static FileFilter CLIENT_JAR_FILTER = FileFilterFactory.suffixFileFilter(PURE_CLIENT_JAR_POSTFIX);
    public static FileFilter CP_JAR_FILTER = FileFilterFactory.and(new FileFilter[]{JAR_FILTER, FileFilterFactory.not(SRC_JAR_FILTER)});

    public static FileFilter prefixFileFilter(String prefix) {
        return FileFilterFactory.prefixFileFilter(prefix, true);
    }

    public static FileFilter prefixFileFilter(String prefix, final boolean caseSensitive) {
        final String _prefix = prefix == null ? "" : prefix;
        return new FileFilter(){

            @Override
            public boolean accept(File pathname) {
                if (caseSensitive) {
                    return pathname.getName().startsWith(_prefix);
                }
                return pathname.getName().toLowerCase().startsWith(_prefix.toLowerCase());
            }
        };
    }

    public static FileFilter prefixFileFilter(String[] prefixes) {
        return FileFilterFactory.prefixFileFilter(prefixes, true);
    }

    public static FileFilter prefixFileFilter(String[] prefixes, boolean caseSensitive) {
        if (prefixes == null || prefixes.length == 0) {
            return FileFilterFactory.prefixFileFilter("", caseSensitive);
        }
        FileFilter[] filters = new FileFilter[prefixes.length];
        for (int i = 0; i < prefixes.length; ++i) {
            filters[i] = FileFilterFactory.prefixFileFilter(prefixes[i], caseSensitive);
        }
        return FileFilterFactory.or(filters);
    }

    public static FileFilter excludeFileFilter(final Set fileNames) {
        return new FileFilter(){

            @Override
            public boolean accept(File pathname) {
                if (fileNames == null) {
                    return true;
                }
                return !fileNames.contains(pathname.getName());
            }
        };
    }

    public static FileFilter excludeFileFilter(final List files) {
        return new FileFilter(){

            @Override
            public boolean accept(File pathname) {
                if (files == null) {
                    return true;
                }
                return !files.contains(pathname);
            }
        };
    }

    public static FileFilter existsFileFilter(final String relativePath) {
        return new FileFilter(){

            @Override
            public boolean accept(File pathname) {
                if (!pathname.isDirectory()) {
                    return false;
                }
                File subFile = new File(pathname, relativePath);
                return subFile.exists();
            }
        };
    }

    public static FileFilter suffixFileFilter(String suffix) {
        return FileFilterFactory.suffixFileFilter(suffix, true);
    }

    public static FileFilter suffixFileFilter(String suffix, final boolean caseSensitive) {
        final String _suffix = suffix == null ? "" : suffix;
        return new FileFilter(){

            @Override
            public boolean accept(File pathname) {
                if (caseSensitive) {
                    return pathname.getName().endsWith(_suffix);
                }
                return pathname.getName().toLowerCase().endsWith(_suffix.toLowerCase());
            }
        };
    }

    public static FileFilter suffixFileFilter(String[] suffixes, boolean caseSensitive) {
        if (suffixes == null || suffixes.length == 0) {
            return FileFilterFactory.suffixFileFilter("", caseSensitive);
        }
        FileFilter[] filters = new FileFilter[suffixes.length];
        for (int i = 0; i < suffixes.length; ++i) {
            filters[i] = FileFilterFactory.suffixFileFilter(suffixes[i], caseSensitive);
        }
        return FileFilterFactory.or(filters);
    }

    public static FileFilter suffixFileFilter(String[] suffixes) {
        return FileFilterFactory.suffixFileFilter(suffixes, true);
    }

    public static FileFilter nameFileFilter(String fileName) {
        return FileFilterFactory.nameFileFilter(fileName, true);
    }

    public static FileFilter nameFileFilter(String fileName, final boolean caseSensitive) {
        final String _fileName = fileName == null ? "" : fileName;
        return new FileFilter(){

            @Override
            public boolean accept(File pathname) {
                if (caseSensitive) {
                    return pathname.getName().equals(_fileName);
                }
                return pathname.getName().toLowerCase().equals(_fileName.toLowerCase());
            }
        };
    }

    public static FileFilter directoryFileFilter() {
        return new FileFilter(){

            @Override
            public boolean accept(File pathname) {
                return pathname.exists() && pathname.isDirectory();
            }
        };
    }

    public static FileFilter fileFileFilter() {
        return new FileFilter(){

            @Override
            public boolean accept(File pathname) {
                return pathname.exists() && pathname.isFile();
            }
        };
    }

    public static FileFilter and(final FileFilter[] filters) {
        return new FileFilter(){

            @Override
            public boolean accept(File pathname) {
                boolean result = true;
                for (int i = 0; i < filters.length; ++i) {
                    result = result && filters[i].accept(pathname);
                }
                return result;
            }
        };
    }

    public static FileFilter or(final FileFilter[] filters) {
        return new FileFilter(){

            @Override
            public boolean accept(File pathname) {
                boolean result = false;
                for (int i = 0; i < filters.length; ++i) {
                    result = result || filters[i].accept(pathname);
                }
                return result;
            }
        };
    }

    public static FileFilter not(final FileFilter filter) {
        return new FileFilter(){

            @Override
            public boolean accept(File pathname) {
                return !filter.accept(pathname);
            }
        };
    }
}

