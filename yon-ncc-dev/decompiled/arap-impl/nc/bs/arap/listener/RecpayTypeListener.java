/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.bs.businessevent.IBusinessListener
 *  nc.bs.businessevent.bd.BDCommonEvent
 *  nc.bs.dao.BaseDAO
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.vo.fibd.RecpaytypeVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 */
package nc.bs.arap.listener;

import java.sql.ResultSet;
import java.sql.SQLException;
import nc.bs.businessevent.IBusinessEvent;
import nc.bs.businessevent.IBusinessListener;
import nc.bs.businessevent.bd.BDCommonEvent;
import nc.bs.dao.BaseDAO;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.vo.fibd.RecpaytypeVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;

public class RecpayTypeListener
implements IBusinessListener {
    public void doAction(IBusinessEvent event) throws BusinessException {
        if (event instanceof BDCommonEvent) {
            BDCommonEvent ev = (BDCommonEvent)event;
            RecpaytypeVO vo = (RecpaytypeVO)ev.getNewObjs()[0];
            RecpaytypeVO oldvo = (RecpaytypeVO)ev.getOldObjs()[0];
            if (!vo.getIssettle().equals((Object)oldvo.getIssettle()) || !vo.getPretype().equals(oldvo.getPretype())) {
                UFBoolean isExists = (UFBoolean)new BaseDAO().executeQuery("select pk_recpaytype from ar_gatheritem where dr=0 and pk_recpaytype='" + vo.getPk_recpaytype() + "'", (ResultSetProcessor)new ExistResultSetProcessor());
                if (isExists.booleanValue()) {
                    throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0864"));
                }
                isExists = (UFBoolean)new BaseDAO().executeQuery("select pk_recpaytype from ap_payitem where  dr=0 and pk_recpaytype='" + vo.getPk_recpaytype() + "'", (ResultSetProcessor)new ExistResultSetProcessor());
                if (isExists.booleanValue()) {
                    throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0865"));
                }
            }
        }
    }

    class ExistResultSetProcessor
    implements ResultSetProcessor {
        private static final long serialVersionUID = 1L;

        ExistResultSetProcessor() {
        }

        public Object handleResultSet(ResultSet rs) throws SQLException {
            if (rs.next()) {
                if (rs.getString(1) == null) {
                    return UFBoolean.FALSE;
                }
                return UFBoolean.TRUE;
            }
            return UFBoolean.FALSE;
        }
    }
}

