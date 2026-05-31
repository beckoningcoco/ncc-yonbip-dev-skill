/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Logger
 *  nc.bs.pf.pub.PfDataCache
 *  nc.md.MDBaseQueryFacade
 *  nc.md.data.access.DASFacade
 *  nc.md.data.access.NCObject
 *  nc.md.model.IBean
 *  nc.md.model.IBusinessEntity
 *  nc.md.model.IComponent
 *  nc.md.model.MetaDataException
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessRuntimeException
 *  nccloud.commons.lang.StringUtils
 */
package nc.vo.arap.basebill;

import java.util.HashMap;
import nc.bs.logging.Logger;
import nc.bs.pf.pub.PfDataCache;
import nc.md.MDBaseQueryFacade;
import nc.md.data.access.DASFacade;
import nc.md.data.access.NCObject;
import nc.md.model.IBean;
import nc.md.model.IBusinessEntity;
import nc.md.model.IComponent;
import nc.md.model.MetaDataException;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessRuntimeException;
import nccloud.commons.lang.StringUtils;

public class ArapVOFactory {
    private ArapVOFactory() {
    }

    public static BaseAggVO getAggVOInstance(String pk_billtype) {
        if (StringUtils.isEmpty((CharSequence)pk_billtype)) {
            return null;
        }
        try {
            String billcomponent = PfDataCache.getBillType((String)pk_billtype).getComponent();
            Logger.debug((Object)("#####################LIAOBX#############################\u7ec4\u4ef6" + billcomponent), ArapVOFactory.class, (String)"getAggVOInstance");
            IComponent icom = MDBaseQueryFacade.getInstance().getComponentByName(billcomponent);
            String entityid = icom.getPrimaryBusinessEntity().getID();
            DASFacade.newInstanceWithKeyValues((IBean)MDBaseQueryFacade.getInstance().getBeanByID(((IBusinessEntity)icom.getBusinessEntities().get(1)).getID()), new HashMap()).getContainmentObject();
            IBean objbean = MDBaseQueryFacade.getInstance().getBeanByID(entityid);
            NCObject ncobject = DASFacade.newInstanceWithKeyValues((IBean)objbean, new HashMap());
            Logger.debug((Object)("#####################LIAOBX#############################\u7ec4\u4ef6" + entityid + ncobject.getContainmentObject()), ArapVOFactory.class, (String)"getAggVOInstance");
            return (BaseAggVO)((Object)ncobject.getContainmentObject());
        }
        catch (MetaDataException e) {
            ExceptionHandler.consume((Throwable)e);
            return null;
        }
    }

    public static BaseAggVO[] covert(BaseAggVO[] bills) {
        BaseAggVO[] arrays = new BaseAggVO[bills.length];
        for (int i = 0; i < bills.length; ++i) {
            String billType = ((BaseBillVO)bills[i].getParentVO()).getPk_billtype();
            BaseAggVO temp = ArapVOFactory.getAggVOInstance(billType);
            temp.setParentVO(bills[i].getParentVO());
            temp.setChildrenVO(bills[i].getChildrenVO());
            arrays[i] = temp;
        }
        return arrays;
    }

    public static BaseBillVO getParentVOInstance(String pk_billtype) {
        if (StringUtils.isEmpty((CharSequence)pk_billtype)) {
            throw new BusinessRuntimeException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0316"));
        }
        return (BaseBillVO)ArapVOFactory.getAggVOInstance(pk_billtype).getParent();
    }

    public static BaseItemVO getChildrenVOInstance(String billtype) {
        if (StringUtils.isEmpty((CharSequence)billtype)) {
            return null;
        }
        try {
            String billcomponent = PfDataCache.getBillType((String)billtype).getComponent();
            IComponent icom = MDBaseQueryFacade.getInstance().getComponentByName(billcomponent);
            if (icom.getBusinessEntities().size() < 2) {
                throw new BusinessRuntimeException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0542"));
            }
            String entityid = ((IBusinessEntity)icom.getBusinessEntities().get(1)).getID();
            IBean objbean = MDBaseQueryFacade.getInstance().getBeanByID(entityid);
            NCObject ncobject = DASFacade.newInstanceWithKeyValues((IBean)objbean, new HashMap());
            Logger.debug((Object)("#####################LIAOBX#############################\u7ec4\u4ef6" + entityid + ncobject.getContainmentObject()), ArapVOFactory.class, (String)"getAggVOInstance");
            return (BaseItemVO)ncobject.getContainmentObject();
        }
        catch (MetaDataException e) {
            ExceptionHandler.consume((Throwable)e);
            return null;
        }
    }
}

