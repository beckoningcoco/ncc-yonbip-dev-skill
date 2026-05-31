/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.itf.uap.IUAPQueryBS
 *  nc.jdbc.framework.processor.ColumnListProcessor
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 */
package nc.bs.pub.pa;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.itf.uap.IUAPQueryBS;
import nc.jdbc.framework.processor.ColumnListProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;

public class AlertMethod
implements Serializable,
Cloneable {
    private static final long serialVersionUID = -9869L;
    public boolean isNcc = false;
    public String m_Acounts = "";
    public String m_AcountNames = "";
    public String m_TODOs = "";
    public String m_ToDoNames = "";
    public String m_RealEmails = "";
    public String m_RealEmailNames = "";
    public String m_Mobiles = "";
    public String m_MobileNames = "";
    public String m_Nexts = "";
    public String m_NextsAttribute = "";
    private String syscode = "";
    private String nodetype = "";
    public String m_Nexts_NCC = "";
    public String m_NextsName_NCC = "";
    private String syscode_ncc = "";
    private String nodetype_ncc = "";
    public String m_Invoke = "";
    public String m_ButtonNames = "";
    public String m_Buttons = "";
    public static final int LOGIN = 0;
    public static final int TODO = 1;
    public static final int NEXT = 2;
    public static final int PLATFORM = 3;
    public static final int INVOKE = 4;
    public static final int BUTTON = 5;
    public static final int MOBILE = 6;
    public static final int REALMAIL = 7;
    public static final int NEXT_NCC = 8;
    public static final String[] AlertMethodName = new String[]{"logingIn", "todo", "trigger", "platform", "invoke", "button", "mobile", "realEmail", "trigger_ncc"};
    private boolean[] m_SelectedTypes = new boolean[]{false, false, false, false, false, false, false, false, false};

    public void addAccount(String account) {
        this.m_Acounts = this.m_Acounts + account + ";";
    }

    public void addAccountName(String accountName) {
        this.m_AcountNames = this.m_AcountNames + accountName + ";";
    }

    public boolean isNcc() {
        return this.isNcc;
    }

    public void setNcc(boolean isNcc) {
        this.isNcc = isNcc;
    }

    public void addButton(String button) {
        this.m_Buttons = this.m_Buttons + button + ";";
    }

    public void addButtonName(String buttonName) {
        this.m_ButtonNames = this.m_ButtonNames + buttonName + ";";
    }

    public void addToDOUserID(String todoUserid) {
        this.m_TODOs = this.m_TODOs + todoUserid + ";";
    }

    public void addToDOUserName(String todoUserName) {
        this.m_ToDoNames = this.m_ToDoNames + todoUserName + ";";
    }

    public void addRealEmail(String realEmail) {
        this.m_RealEmails = this.m_RealEmails + realEmail + ";";
    }

    public void addRealEmailName(String realEmailName) {
        this.m_RealEmailNames = this.m_RealEmailNames + realEmailName + ";";
    }

    public void addMobile(String mobile) {
        this.m_Mobiles = this.m_Mobiles + mobile + ";";
    }

    public void addMobileName(String mobileName) {
        this.m_MobileNames = this.m_MobileNames + mobileName + ";";
    }

    public void addNext(String next) {
        this.m_Nexts = this.m_Nexts + next + ";";
    }

    public void addNextNCC(String next) {
        this.m_Nexts_NCC = this.m_Nexts_NCC + next + ";";
    }

    public void addNextName(String nextName) {
        this.m_NextsAttribute = this.m_NextsAttribute + nextName + ";";
    }

    public void addNextNameNCC(String nextName) {
        this.m_NextsName_NCC = this.m_NextsName_NCC + nextName + ";";
    }

    public void addNextSysCode(String nextSysCode) {
        if (nextSysCode == null) {
            nextSysCode = "RIA";
        }
        this.syscode = this.syscode + nextSysCode + ";";
    }

    public void addNextSysCodeNCC(String nextSysCode) {
        if (nextSysCode == null) {
            nextSysCode = "7";
        }
        this.syscode_ncc = this.syscode_ncc + nextSysCode + ";";
    }

    public void addNodetype(String pnodetype) {
        if (pnodetype == null) {
            pnodetype = "0";
        }
        this.nodetype = this.nodetype + pnodetype + ";";
    }

    public void addNodetypeNCC(String pnodetype) {
        if (pnodetype == null) {
            pnodetype = "0";
        }
        this.nodetype_ncc = this.nodetype_ncc + pnodetype + ";";
    }

    public String[] getAcountNames() {
        return this.getValuesWithToken(this.m_AcountNames);
    }

    public String[] getValuesWithToken(String varValue) {
        ArrayList<String> v = new ArrayList<String>();
        StringTokenizer t = new StringTokenizer(varValue, ";");
        while (t.hasMoreTokens()) {
            v.add(t.nextToken().trim());
        }
        return v.toArray(new String[0]);
    }

    public String[] getAcounts() {
        return this.getValuesWithToken(this.m_Acounts);
    }

    public String[] getButtonNames() {
        return this.getValuesWithToken(this.m_ButtonNames);
    }

    public String[] getButtons() {
        return this.getValuesWithToken(this.m_Buttons);
    }

    public String[] getToDOUserlNames() {
        return this.parseReceivers(this.m_ToDoNames);
    }

    public String[] getToDOUserIds() {
        return this.parseReceivers(this.m_TODOs);
    }

    public String getRealEmails() {
        return this.m_RealEmails;
    }

    public String[] getRealEmailsArray() {
        return this.parseReceivers(this.m_RealEmails);
    }

    private String[] parseReceivers(String block) {
        return this.getValuesWithToken(block);
    }

    public String getRealEmailNames() {
        return this.m_RealEmailNames;
    }

    public String[] getRealEmailNamesArray() {
        return this.parseReceivers(this.m_RealEmailNames);
    }

    private boolean[] getEnable() {
        return this.m_SelectedTypes;
    }

    public boolean getEnable(int type) {
        if (type == 1 || type == 0 || type == 2 || type == 3 || type == 4 || type == 5 || type == 6 || type == 7 || type == 8) {
            return this.m_SelectedTypes[type];
        }
        return false;
    }

    public String getInvoke() {
        return this.m_Invoke;
    }

    public String[] getMobileNames() {
        return this.getValuesWithToken(this.m_MobileNames);
    }

    public String[] getMobiles() {
        return this.getValuesWithToken(this.m_Mobiles);
    }

    public String[] getNext() {
        return this.getValuesWithToken(this.m_Nexts);
    }

    public String[] getNextNCC() {
        return this.getValuesWithToken(this.m_Nexts_NCC);
    }

    public String[] getNextAttribute() {
        return this.getValuesWithToken(this.m_NextsAttribute);
    }

    public String[] getNextNameNCC() {
        return this.getValuesWithToken(this.m_NextsName_NCC);
    }

    public String[] getNodetype() {
        return this.getValuesWithToken(this.nodetype);
    }

    public String[] getNodetypeNCC() {
        return this.getValuesWithToken(this.nodetype_ncc);
    }

    public boolean[] getSelectedTypes() {
        return this.m_SelectedTypes;
    }

    public void setAccountNames(String newAcounts) {
        this.m_AcountNames = newAcounts;
    }

    public void setAccounts(String newAcounts) {
        this.m_Acounts = newAcounts;
    }

    public void setButtons(String newButtons) {
        this.m_Buttons = newButtons;
    }

    public void setButtonsNames(String newButtonNames) {
        this.m_ButtonNames = newButtonNames;
    }

    public void setTODONames(String newEmails) {
        this.m_ToDoNames = newEmails;
    }

    public void setTODOs(String newEmails) {
        this.m_TODOs = newEmails;
    }

    public void setRealEmails(String newRealEmails) {
        this.m_RealEmails = newRealEmails;
    }

    public void setRealEmailNames(String newRealEmailNames) {
        this.m_RealEmailNames = newRealEmailNames;
    }

    private void setEnable(boolean[] value) {
        for (int i = 0; i < value.length; ++i) {
            this.m_SelectedTypes[i] = value[i];
        }
    }

    public void setEnable(int type, boolean value) {
        if (type >= 0 && type < 9) {
            this.m_SelectedTypes[type] = value;
        }
    }

    public void setInvoke(String newM_Invoke) {
        this.m_Invoke = newM_Invoke;
    }

    public void setMobileNames(String newMobiles) {
        this.m_MobileNames = newMobiles;
    }

    public void setMobiles(String newMobiles) {
        this.m_Mobiles = newMobiles;
    }

    public void setNexts(String newNext) {
        this.m_Nexts = newNext;
    }

    public void setNextsNCC(String newNext) {
        this.m_Nexts_NCC = newNext;
    }

    public void setNodetypes(String pnodetype) {
        this.nodetype = pnodetype;
    }

    public void setNodetypesNCC(String pnodetype) {
        this.nodetype_ncc = pnodetype;
    }

    public void setNextsAttribute(String newNext) {
        this.m_NextsAttribute = newNext;
    }

    public void setNextsNameNCC(String newNext) {
        this.m_NextsName_NCC = newNext;
    }

    public void setReceiver(String myid, String myname) {
        String id = myid + ";";
        String name = myname + ";";
        this.setEnable(0, false);
        this.setEnable(3, false);
        this.setEnable(2, false);
        this.setEnable(6, false);
        this.setEnable(4, false);
        this.setEnable(5, false);
        this.setEnable(7, false);
        this.setEnable(1, true);
        this.setEnable(8, false);
        this.setTODOs(id);
        this.setTODONames(name);
    }

    public static int getTypeByName(String alertMethodName) {
        int typeValue = -1;
        for (int i = 0; i < AlertMethodName.length; ++i) {
            if (!AlertMethodName[i].equals(alertMethodName)) continue;
            typeValue = i;
            break;
        }
        return typeValue;
    }

    public String toSingleString(String[] value) {
        int count;
        String result = "";
        int n = count = value == null ? 0 : value.length;
        if (count != 0) {
            for (int i = 0; i < count; ++i) {
                result = result + value[i] + ";";
            }
        }
        return result;
    }

    public String toString() {
        String buffer = "";
        try {
            if (this.getEnable(1)) {
                buffer = buffer + NCLangRes4VoTransl.getNCLangRes().getStrByID("101502", "UPP101502-000280");
            }
            if (this.getEnable(0)) {
                buffer = buffer + NCLangRes4VoTransl.getNCLangRes().getStrByID("101502", "UPP101502-000248");
            }
            if (this.getEnable(3)) {
                buffer = buffer + NCLangRes4VoTransl.getNCLangRes().getStrByID("101502", "UPP101502-000250");
            }
            if (this.getEnable(2)) {
                buffer = buffer + NCLangRes4VoTransl.getNCLangRes().getStrByID("101502", "UPP101502-000252");
            }
            if (this.getEnable(8)) {
                buffer = buffer + NCLangRes4VoTransl.getNCLangRes().getStrByID("101502", "UPP101502-000252");
            }
            if (this.getEnable(4)) {
                buffer = buffer + NCLangRes4VoTransl.getNCLangRes().getStrByID("101502", "UPP101502-000254");
            }
            if (this.getEnable(5)) {
                buffer = buffer + NCLangRes4VoTransl.getNCLangRes().getStrByID("101502", "UPP101502-000256");
            }
            if (this.getEnable(6)) {
                buffer = buffer + NCLangRes4VoTransl.getNCLangRes().getStrByID("101502", "UPP101502-000258");
            }
            if (this.getEnable(7)) {
                buffer = buffer + NCLangRes4VoTransl.getNCLangRes().getStrByID("101502", "UPP101502-000246");
            }
        }
        catch (Throwable th) {
            Logger.error((Object)"Error, AlartMethod.ToString.", (Throwable)th);
        }
        return buffer;
    }

    public Object clone() {
        try {
            AlertMethod am = new AlertMethod();
            am.setAccounts(this.toSingleString(this.getAcounts()));
            am.setAccountNames(this.toSingleString(this.getAcountNames()));
            am.setMobiles(this.toSingleString(this.getMobiles()));
            am.setMobileNames(this.toSingleString(this.getMobileNames()));
            am.setTODOs(this.toSingleString(this.getToDOUserIds()));
            am.setTODONames(this.toSingleString(this.getToDOUserlNames()));
            am.setNexts(this.toSingleString(this.getNext()));
            am.setNodetypes(this.toSingleString(this.getNodetype()));
            am.setSyscode(this.toSingleString(this.getSyscode()));
            am.setNextsAttribute(this.toSingleString(this.getNextAttribute()));
            am.setNextsNCC(this.toSingleString(this.getNextNCC()));
            am.setNodetypesNCC(this.toSingleString(this.getNodetypeNCC()));
            am.setSyscode_ncc(this.toSingleString(this.getSyscode_ncc()));
            am.setNextsNameNCC(this.toSingleString(this.getNextNameNCC()));
            am.setButtons(this.toSingleString(this.getButtons()));
            am.setButtonsNames(this.toSingleString(this.getButtonNames()));
            am.setRealEmails(this.toSingleString(this.getRealEmailsArray()));
            am.setRealEmailNames(this.toSingleString(this.getRealEmailNamesArray()));
            am.setInvoke(this.getInvoke());
            am.setEnable(this.getEnable());
            return am;
        }
        catch (Exception e) {
            throw new InternalError();
        }
    }

    public String[][] getParsedUserIdAndName(String[] idsWithType, String[] names) {
        if (idsWithType == null || idsWithType.length == 0) {
            return new String[][]{new String[0]};
        }
        ArrayList<String> idList = new ArrayList<String>();
        ArrayList<String> nameList = new ArrayList<String>();
        HashSet<String> idSet = new HashSet<String>();
        boolean setCorrespondName = true;
        if (names == null || names.length == 0 || names.length != idsWithType.length) {
            setCorrespondName = false;
        }
        block4: for (int i = 0; i < idsWithType.length; ++i) {
            String id = idsWithType[i];
            String name = "";
            if (setCorrespondName) {
                String string = name = names[i] == null ? "" : names[i];
            }
            if (StringUtil.isEmptyWithTrim((String)id)) continue;
            if (id.startsWith("[") && id.contains("]")) {
                int type = Integer.valueOf(id.substring(1, 2));
                switch (type) {
                    case 1: {
                        String realId = id.substring(3);
                        if (idSet.contains(realId)) break;
                        idList.add(realId);
                        nameList.add(name);
                        idSet.add(realId);
                        break;
                    }
                    case 2: {
                        List<String[]> idsAndNames = this.getUserIdsAndNamesByRole(id.substring(3));
                        if (idsAndNames == null) break;
                        for (String[] idAndName : idsAndNames) {
                            if (idSet.contains(idAndName[0])) continue;
                            idList.add(idAndName[0]);
                            nameList.add(idAndName[1]);
                            idSet.add(idAndName[0]);
                        }
                        continue block4;
                    }
                }
                continue;
            }
            if (idSet.contains(id)) continue;
            idList.add(id);
            nameList.add(name);
            idSet.add(id);
        }
        return new String[][]{idList.toArray(new String[0]), nameList.toArray(new String[0])};
    }

    @Deprecated
    public String[] getMaxmumUserIds(String[] idsWithType) {
        if (idsWithType == null || idsWithType.length == 0) {
            return idsWithType;
        }
        HashSet<String> allUserIds = new HashSet<String>();
        for (String id : idsWithType) {
            if (id == null) continue;
            if (id.startsWith("[") && id.contains("]")) {
                int type = Integer.valueOf(id.substring(1, 2));
                switch (type) {
                    case 1: {
                        allUserIds.add(id.substring(3));
                        break;
                    }
                    case 2: {
                        allUserIds.addAll(this.getRelatedUserByRole(id.substring(3)));
                        break;
                    }
                }
                continue;
            }
            allUserIds.add(id);
        }
        return allUserIds.toArray(new String[0]);
    }

    private List<String[]> getUserIdsAndNamesByRole(String pk_role) {
        String sql = "select r.cuserid, u.user_name from sm_user_role r join sm_user u on r.cuserid=u.cuserid where pk_role='" + pk_role + "'";
        IUAPQueryBS service = (IUAPQueryBS)NCLocator.getInstance().lookup(IUAPQueryBS.class);
        List list = null;
        try {
            list = (List)service.executeQuery(sql, new ResultSetProcessor(){

                public Object handleResultSet(ResultSet rs) throws SQLException {
                    ArrayList<String[]> list = new ArrayList<String[]>();
                    while (rs.next()) {
                        String cuserid = rs.getString(1);
                        String name = rs.getString(2);
                        list.add(new String[]{cuserid, name});
                    }
                    return list;
                }
            });
        }
        catch (BusinessException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
        return list;
    }

    @Deprecated
    private List<String> getRelatedUserByRole(String pk_role) {
        String sql = "select * from sm_user_role where pk_role='" + pk_role + "'";
        IUAPQueryBS service = (IUAPQueryBS)NCLocator.getInstance().lookup(IUAPQueryBS.class);
        List<String> result = new ArrayList<String>();
        try {
            result = (List)service.executeQuery(sql, (ResultSetProcessor)new ColumnListProcessor(){

                public Object processResultSet(ResultSet rs) throws SQLException {
                    ArrayList<String> result = new ArrayList<String>();
                    while (rs.next()) {
                        result.add(rs.getString("cuserid"));
                    }
                    return result;
                }
            });
        }
        catch (BusinessException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
        return result;
    }

    public String[] getSyscode_ncc() {
        return this.getValuesWithToken(this.syscode_ncc);
    }

    public String[] getSyscode() {
        return this.getValuesWithToken(this.syscode);
    }

    public void setSyscode(String syscode) {
        this.syscode = syscode;
    }

    public void setSyscode_ncc(String syscode) {
        this.syscode_ncc = syscode;
    }
}

