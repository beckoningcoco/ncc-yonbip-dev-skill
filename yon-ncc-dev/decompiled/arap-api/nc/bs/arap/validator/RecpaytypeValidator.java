/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.bs.dao.DAOException
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.bs.uif2.validation.Validator
 *  nc.jdbc.framework.processor.ColumnListProcessor
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.lang.UFBoolean
 */
package nc.bs.arap.validator;

import java.util.List;
import nc.bs.arap.validator.AbstractValidator;
import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.jdbc.framework.processor.ColumnListProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.lang.UFBoolean;

public class RecpaytypeValidator
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 1L;

    public ValidationFailure validate(Object obj) {
        if (UFBoolean.FALSE.equals((Object)this.checkObj(obj))) {
            return null;
        }
        for (AggregatedValueObject aggvo : (AggregatedValueObject[])obj) {
            this.setObj(aggvo);
            BaseBillVO parentVO = (BaseBillVO)this.getParentVO();
            BaseItemVO[] bodyVOs = (BaseItemVO[])this.getChildrenVO();
            if (null == parentVO || !"F2".equals(parentVO.getPk_billtype()) && !"F3".equals(parentVO.getPk_billtype()) || bodyVOs == null || bodyVOs.length <= 0) continue;
            List result = null;
            try {
                result = (List)new BaseDAO().executeQuery("select pk_recpaytype from fi_recpaytype where dr=0 and isverification<>'Y'", (ResultSetProcessor)new ColumnListProcessor());
            }
            catch (DAOException e) {
                ExceptionHandler.consume((Throwable)e);
            }
            if (result == null || result.size() <= 0) continue;
            boolean hasTop = false;
            for (BaseItemVO bodyVO : bodyVOs) {
                if (StringUtil.isEmptyWithTrim((String)bodyVO.getTop_billtype()) || !result.contains(bodyVO.getPk_recpaytype())) continue;
                hasTop = true;
                break;
            }
            if (!hasTop) continue;
            return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0136"));
        }
        return null;
    }
}

