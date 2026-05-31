/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.itf.arap.billconfer.IBConferMapQryService
 *  nc.md.model.MetaDataException
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.vo.arap.billconfer.BcMapVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nccloud.commons.lang.StringUtils
 *  org.apache.commons.lang3.StringUtils
 */
package nc.impl.arap.billconfer;

import java.util.Collection;
import nc.itf.arap.billconfer.IBConferMapQryService;
import nc.md.model.MetaDataException;
import nc.md.persist.framework.MDPersistenceService;
import nc.vo.arap.billconfer.BcMapVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import org.apache.commons.lang3.StringUtils;

public class BConferMapQryServiceImpl
implements IBConferMapQryService {
    public BcMapVO[] queryBCMapByIDAndBType(String primaryKey, String pkBilltype) throws BusinessException {
        if (StringUtils.isEmpty((CharSequence)pkBilltype) || StringUtils.isEmpty((CharSequence)primaryKey)) {
            throw new IllegalArgumentException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0335"));
        }
        String whereCondStr = "src_billtype = '" + pkBilltype + "' and " + "src_billid" + "  ='" + primaryKey + "' ";
        return this.query(whereCondStr);
    }

    private BcMapVO[] query(String whereCondStr) throws BusinessException {
        try {
            Collection vo = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByCond(BcMapVO.class, whereCondStr, false);
            if (vo.size() > 0) {
                return vo.toArray(new BcMapVO[0]);
            }
        }
        catch (MetaDataException e) {
            ExceptionHandler.createAndThrowException((String)NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0336"));
        }
        return null;
    }

    public BcMapVO[] queryBCMapByDestBill(String destPk, String destBilltype) throws BusinessException {
        if (nccloud.commons.lang.StringUtils.isEmpty((CharSequence)destPk) || StringUtils.isEmpty((CharSequence)destBilltype)) {
            throw new IllegalArgumentException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0335"));
        }
        String whereCondStr = "dest_billtype = '" + destBilltype + "' and " + "dest_billid" + "  ='" + destPk + "' ";
        return this.query(whereCondStr);
    }
}

