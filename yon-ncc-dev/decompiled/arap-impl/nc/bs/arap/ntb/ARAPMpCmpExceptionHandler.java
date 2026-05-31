/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.cmp.ml.MLString
 *  nc.ui.pub.formulaparse.FormulaParse
 *  nc.vo.cmp.exception.CmpAuthorizationException
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  uap.iweb.wf.util.IWFAlertExceptionHandler2
 */
package nc.bs.arap.ntb;

import java.util.List;
import java.util.Map;
import nc.bs.cmp.ml.MLString;
import nc.ui.pub.formulaparse.FormulaParse;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.exception.ARAP4CmpAuthorizationException;
import nc.vo.cmp.exception.CmpAuthorizationException;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import uap.iweb.wf.util.IWFAlertExceptionHandler2;

public class ARAPMpCmpExceptionHandler
implements IWFAlertExceptionHandler2 {
    public String getAlertMessageByException(BusinessException e) throws BusinessException {
        return null;
    }

    public void setAlertForcePass(String checkResult, AggregatedValueObject billvo) throws BusinessException {
    }

    public String getAlertMessageByException(BusinessException e, Object billVO) throws BusinessException {
        if (e instanceof ARAP4CmpAuthorizationException) {
            ARAP4CmpAuthorizationException exp = (ARAP4CmpAuthorizationException)e;
            String result = this.handleException(exp.getCmpAuthorizationException());
            return result;
        }
        return null;
    }

    private String handleException(CmpAuthorizationException e) throws BusinessException {
        List authorAccount = e.getAuthorAccount();
        List refuseAccount = e.getRefuseAccount();
        List tipAccount = e.getTipAccount();
        if (refuseAccount.size() != 0) {
            String refuseBankAccName = null;
            String[] msg = null;
            msg = refuseAccount.size() == 1 ? ((String)refuseAccount.get(0)).split("\\|") : ((String)refuseAccount.get(1)).split("\\|");
            if (msg != null && msg.length != 0) {
                throw new BusinessException(msg[1]);
            }
            refuseBankAccName = this.getColValue("bd_cashaccount", "name", "pk_cashaccount", (String)refuseAccount.get(0));
            throw new BusinessException(refuseBankAccName + MLString.getStr0008());
        }
        if (authorAccount.size() != 0) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2011", "UPP2011-000340"));
        }
        if (tipAccount.size() != 0) {
            StringBuffer buf = new StringBuffer();
            for (int i = 0; i < tipAccount.size(); ++i) {
                String returnVal = (String)tipAccount.get(i);
                String[] msg = returnVal.split("\\|");
                String pk_account = msg[0];
                String tipBankAccName = null;
                if (msg != null && msg.length != 0) {
                    buf.append(msg[1] + "\n");
                } else {
                    tipBankAccName = this.getColValue("bd_cashaccount", "name", "pk_cashaccount", pk_account);
                    buf.append(tipBankAccName + MLString.getStr0010() + "\n");
                }
                if (msg.length != 4) continue;
                if (msg[2].equals("2")) {
                    throw new BusinessException(msg[3]);
                }
                if (!msg[2].equals("1")) continue;
                buf.append(msg[3] + "\n");
            }
            if (buf.length() > 0) {
                return buf.toString();
            }
        }
        return null;
    }

    public String getColValue(String table, String column, String pk, String id) {
        FormulaParse parser = new FormulaParse();
        parser.setExpress("aim->getColValue(" + table + "," + column + "," + pk + ",id);");
        parser.addVariable("id", (Object)id);
        String aim = parser.getValue();
        return aim;
    }

    public void setAlertForcePass(String checkResult, AggregatedValueObject billvo, Map<String, Object> eparam) throws BusinessException {
        if (billvo == null) {
            return;
        }
        if (checkResult == null || !checkResult.equals("Y")) {
            return;
        }
        if (billvo instanceof BaseAggVO) {
            ((BaseAggVO)billvo).getHeadVO().setAuthAccount(true);
        }
    }
}

