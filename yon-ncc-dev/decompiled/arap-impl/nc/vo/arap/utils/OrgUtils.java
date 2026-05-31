/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.arap.utils;

public class OrgUtils {
    public static String getGlobalAndGroupSql(String pk_group) {
        return OrgUtils.getGlobalAndGroupSql(pk_group, null);
    }

    public static String getGlobalAndGroupSql(String pk_group, String alias) {
        if (null == alias || alias.length() == 0) {
            return " (pk_group = '~'  or pk_group ='" + pk_group + "' or pk_group ='" + "GLOBLE00000000000000" + "')";
        }
        return " (" + alias + ".pk_group = '~'  or " + alias + ".pk_group ='" + pk_group + "' or " + alias + ".pk_group ='" + "GLOBLE00000000000000" + "')";
    }
}

