/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.jcom.security;

import java.security.MessageDigest;

public class MessageDigestTool {
    private static MessageDigest md_sha = null;
    private static final String DEFAUL_WAY = "SHA";

    public static byte[] getByteDigetst(byte[] input) throws Exception {
        return MessageDigestTool.getSHAMessageDigest().digest(input);
    }

    public static String getDigest(String strSource) throws Exception {
        StringBuffer digest = new StringBuffer();
        byte[] input = strSource.getBytes();
        byte[] digestBytes = MessageDigestTool.getSHAMessageDigest().digest(input);
        if (digestBytes != null) {
            int n = digestBytes.length;
            for (int i = 0; i < n; ++i) {
                digest.append(digestBytes[i]);
            }
        }
        return digest.toString();
    }

    private static MessageDigest getSHAMessageDigest() throws Exception {
        if (md_sha == null) {
            md_sha = MessageDigest.getInstance(DEFAUL_WAY);
        }
        return md_sha;
    }
}

