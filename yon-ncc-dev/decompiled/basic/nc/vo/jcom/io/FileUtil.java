/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Logger
 */
package nc.vo.jcom.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import nc.bs.logging.Logger;
import nc.vo.jcom.io.FileFilterFactory;
import nc.vo.jcom.io.IOUtil;
import nc.vo.jcom.lang.StringUtil;

public abstract class FileUtil {
    public static boolean delete(File file) {
        if (null == file || !file.exists()) {
            return true;
        }
        if (file.isDirectory()) {
            return FileUtil.cleanDirectory(file) && file.delete();
        }
        return file.delete();
    }

    public static boolean cleanDirectory(File directory) {
        if (null == directory || !directory.exists()) {
            return true;
        }
        if (!directory.isDirectory()) {
            return false;
        }
        boolean result = true;
        File[] files = directory.listFiles();
        for (int i = 0; i < files.length; ++i) {
            File file = files[i];
            result = result && FileUtil.delete(file);
        }
        return result;
    }

    public static void deleteOnExit(File file) throws IOException {
        if (null != file && file.exists()) {
            if (file.isDirectory()) {
                FileUtil.cleanDirectoryOnExit(file);
                file.deleteOnExit();
            } else {
                file.deleteOnExit();
            }
        }
    }

    public static void cleanDirectoryOnExit(File directory) throws IOException {
        if (null == directory || !directory.exists()) {
            return;
        }
        if (!directory.isDirectory()) {
            throw new IllegalArgumentException(directory + " is not a directory.");
        }
        IOException exception = null;
        File[] files = directory.listFiles();
        for (int i = 0; i < files.length; ++i) {
            File file = files[i];
            try {
                FileUtil.deleteOnExit(file);
                continue;
            }
            catch (IOException ioe) {
                exception = ioe;
            }
        }
        if (null != exception) {
            throw exception;
        }
    }

    public static File copy(File sourceFile, File destDir) throws IOException {
        if (null == sourceFile || !sourceFile.isFile() || null == destDir) {
            return null;
        }
        return FileUtil.copy(sourceFile, destDir, sourceFile.getName());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static File copy(File sourceFile, File destDir, String fileName) throws IOException {
        String _fileName = fileName;
        if (null == sourceFile || !sourceFile.isFile() || null == destDir) {
            return null;
        }
        if (null == _fileName) {
            _fileName = sourceFile.getName();
        }
        if (sourceFile.getParentFile().equals(destDir)) {
            return sourceFile;
        }
        if (!destDir.exists()) {
            destDir.mkdirs();
        }
        if (!destDir.isDirectory()) {
            throw new IOException("Destination must be a directory.");
        }
        File target = new File(destDir, fileName);
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(sourceFile));
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(target));
        try {
            IOUtil.write((InputStream)in, (OutputStream)out);
        }
        finally {
            out.flush();
            IOUtil.close(in);
            IOUtil.close(out);
        }
        return target;
    }

    public static File move(File sourceFile, File destDir) throws IOException {
        File target = FileUtil.copy(sourceFile, destDir);
        if (null != sourceFile) {
            sourceFile.delete();
        }
        return target;
    }

    public static void touch(File file) throws IOException {
        if (null == file) {
            return;
        }
        if (!file.exists()) {
            FileOutputStream out = new FileOutputStream(file);
            IOUtil.close(out);
        } else {
            file.setLastModified(System.currentTimeMillis());
        }
    }

    public static URL[] toURLs(File[] files) throws IOException {
        if (null == files) {
            return new URL[0];
        }
        URL[] urls = new URL[files.length];
        for (int i = 0; i < urls.length; ++i) {
            urls[i] = files[i].toURI().toURL();
        }
        return urls;
    }

    public static File toFile(URL url) {
        if (null == url || !url.getProtocol().equals("file")) {
            return null;
        }
        String filename = url.getFile().replace('/', File.separatorChar);
        return new File(filename);
    }

    public static String content(File file) throws IOException {
        if (null == file) {
            return null;
        }
        FileInputStream in = new FileInputStream(file);
        try {
            String string = IOUtil.toString(in);
            return string;
        }
        finally {
            IOUtil.close(in);
        }
    }

    public static List<File> listFiles(File dir, FileFilter filter) {
        ArrayList<File> filesList = new ArrayList<File>();
        if (null == dir || !dir.exists() || dir.isFile()) {
            return filesList;
        }
        FileUtil.listFiles(filesList, dir, filter);
        return filesList;
    }

    public static List<File> listFiles(List<File> filesList, File dir, FileFilter filter) {
        File[] files = dir.listFiles(FileFilterFactory.and(new FileFilter[]{filter, FileFilterFactory.fileFileFilter()}));
        List<File> curFiles = Arrays.asList(files);
        Collections.sort(curFiles);
        filesList.addAll(curFiles);
        File[] subDirs = dir.listFiles(FileFilterFactory.directoryFileFilter());
        if (null != subDirs) {
            for (int i = 0; i < subDirs.length; ++i) {
                FileUtil.listFiles(filesList, subDirs[i], filter);
            }
        }
        return filesList;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void dos2Unix(File srcDosFile, boolean deleteOriFile) {
        FileOutputStream fos;
        FileInputStream fis;
        block15: {
            if (srcDosFile.isDirectory()) {
                return;
            }
            String strOriginalDosFile = srcDosFile.getAbsolutePath();
            fis = null;
            fos = null;
            File destUnixFile = new File(strOriginalDosFile + ".unix");
            try {
                fis = new FileInputStream(srcDosFile);
                fos = new FileOutputStream(destUnixFile);
                boolean bNeedConvert = false;
                boolean bFileFinished = false;
                boolean bDiscardFirstNewLineByte = false;
                byte[] bsInBuffer = new byte[4096];
                byte[] bsOutBuffer = new byte[4096];
                while (!bFileFinished) {
                    int nReadByteCount = fis.read(bsInBuffer, 0, 4096);
                    int nOutBufferIndex = 0;
                    for (int i = 0; i < nReadByteCount; ++i) {
                        byte bCurrentByte = bsInBuffer[i];
                        if (i == 0 && bDiscardFirstNewLineByte && bCurrentByte == 10) {
                            bDiscardFirstNewLineByte = false;
                            continue;
                        }
                        if (bCurrentByte == 13) {
                            if (!bNeedConvert) {
                                bNeedConvert = true;
                            }
                            bsOutBuffer[nOutBufferIndex++] = 10;
                            if (i == 4095) {
                                bDiscardFirstNewLineByte = true;
                                continue;
                            }
                            if (i == nReadByteCount - 1 || bsInBuffer[i + 1] != 10) continue;
                            ++i;
                            continue;
                        }
                        bsOutBuffer[nOutBufferIndex++] = bCurrentByte;
                    }
                    if (nOutBufferIndex > 0) {
                        fos.write(bsOutBuffer, 0, nOutBufferIndex);
                    }
                    if (nReadByteCount != -1 && nReadByteCount >= 4096) continue;
                    bFileFinished = true;
                }
                IOUtil.close(fis);
                if (fos != null) {
                    fos.flush();
                    IOUtil.close(fos);
                }
                if (bNeedConvert) {
                    File fDos = new File(strOriginalDosFile + ".dos");
                    srcDosFile.renameTo(fDos);
                    if (deleteOriFile) {
                        fDos.delete();
                    }
                    destUnixFile.renameTo(new File(strOriginalDosFile));
                    break block15;
                }
                destUnixFile.delete();
            }
            catch (Exception e) {
                try {
                    Logger.error((Object)("\u5904\u7406\u6587\u4ef6\"" + strOriginalDosFile + "\"\u65f6\u53d1\u751f\u5f02\u5e38!"), (Throwable)e);
                }
                catch (Throwable throwable) {
                    IOUtil.close(fis);
                    IOUtil.close(fos);
                    throw throwable;
                }
                IOUtil.close(fis);
                IOUtil.close(fos);
            }
        }
        IOUtil.close(fis);
        IOUtil.close(fos);
    }

    public static void createDirectoryAsNeeded(String strSource, String strTarget) throws IOException {
        if (strSource.indexOf("\\") >= 0) {
            strSource = StringUtil.replaceAllString(strSource, "\\", "/");
        }
        StringTokenizer st = new StringTokenizer(strSource, "/");
        if (strTarget == null && st.hasMoreElements()) {
            strTarget = st.nextElement().toString();
        }
        StringBuffer newPath = new StringBuffer();
        if (strTarget != null) {
            newPath.append(strTarget);
        }
        while (st.hasMoreElements()) {
            String str = st.nextElement().toString();
            if (!st.hasMoreElements()) break;
            newPath.append(File.separator);
            newPath.append(str);
            File dir = new File(newPath.toString());
            if (dir.exists()) continue;
            dir.mkdir();
        }
    }

    public static String concatPathAndFile(String strPath, String strFileName) {
        String strWhole = null;
        strWhole = strPath.charAt(strPath.length() - 1) == File.separatorChar ? strPath + strFileName : strPath + File.separatorChar + strFileName;
        return strWhole;
    }

    public static void copyDirectory(File srcDir, File dstDir) {
        if (srcDir.isDirectory()) {
            if (!dstDir.exists()) {
                dstDir.mkdir();
            }
            String[] children = srcDir.list();
            for (int i = 0; i < children.length; ++i) {
                FileUtil.copyDirectory(new File(srcDir, children[i]), new File(dstDir, children[i]));
            }
        } else {
            FileUtil.copyFile(srcDir, dstDir);
        }
    }

    public static void copyFile(File srcDir, File dstDir) {
        try {
            FileChannel srcChannel = new FileInputStream(srcDir).getChannel();
            FileChannel dstChannel = new FileOutputStream(dstDir).getChannel();
            dstChannel.transferFrom(srcChannel, 0L, srcChannel.size());
            srcChannel.close();
            dstChannel.close();
        }
        catch (IOException e) {
            Logger.error((Object)"", (Throwable)e);
        }
    }
}

