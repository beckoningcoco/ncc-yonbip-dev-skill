/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.pubitf.arap.djlx.IBillTypePublic
 *  nc.vo.arap.djlx.BillTypeVO
 *  nc.vo.arap.djlx.DjLXVO
 *  nc.vo.arap.utils.ARAPModuleEnableUtil
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.platform.workbench.AppRegisterVO
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.billtype.BilltypeVO
 *  ncccloud.pubitf.riart.transtype.INccTranstypeBiz
 */
package nccloud.impl.arap.billtype;

import java.util.ArrayList;
import nc.bs.framework.common.NCLocator;
import nc.pubitf.arap.djlx.IBillTypePublic;
import nc.vo.arap.djlx.BillTypeVO;
import nc.vo.arap.djlx.DjLXVO;
import nc.vo.arap.utils.ARAPModuleEnableUtil;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.platform.workbench.AppRegisterVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.billtype.BilltypeVO;
import ncccloud.pubitf.riart.transtype.INccTranstypeBiz;

public class ARAPTranstypeBizImpl
implements INccTranstypeBiz {
    public void saveTransType(Object userObj, BilltypeVO transtypevo) throws BusinessException {
        DjLXVO djlvo = (DjLXVO)userObj;
        djlvo.setDjdl(this.getDjlxvo(transtypevo));
        djlvo.setDjlxbm(transtypevo.getPk_billtypecode());
        djlvo.setDjlxmc_remark(transtypevo.getBilltypename());
        djlvo.setDjlxjc_remark(transtypevo.getBilltypename());
        djlvo.setPk_group(transtypevo.getPk_group());
        BillTypeVO busitypevo = this.converttoBilltype(transtypevo);
        IBillTypePublic service = (IBillTypePublic)NCLocator.getInstance().lookup(IBillTypePublic.class);
        BillTypeVO btVO = this.checkFcbz(busitypevo);
        busitypevo.setParentVO((CircularlyAccessibleValueObject)djlvo);
        service.insertBillType(btVO);
    }

    public void updateTransType(Object userObj, BilltypeVO transtypevo) throws BusinessException {
        DjLXVO djlvo = (DjLXVO)userObj;
        djlvo.setDjdl(this.getDjlxvo(transtypevo));
        djlvo.setDjlxmc_remark(transtypevo.getBilltypename());
        djlvo.setDjlxjc_remark(transtypevo.getBilltypename());
        djlvo.setPk_group(transtypevo.getPk_group());
        BillTypeVO busitypevo = this.converttoBilltype(transtypevo);
        IBillTypePublic service = (IBillTypePublic)NCLocator.getInstance().lookup(IBillTypePublic.class);
        BillTypeVO btVO = this.checkFcbz(busitypevo);
        busitypevo.setParentVO((CircularlyAccessibleValueObject)djlvo);
        service.updateBillType(btVO);
    }

    public void deleteTransType(Object userObj, BilltypeVO transtypevo) throws BusinessException {
        DjLXVO djlvo = (DjLXVO)userObj;
        BillTypeVO busitypevo = this.converttoBilltype(transtypevo);
        IBillTypePublic service = (IBillTypePublic)NCLocator.getInstance().lookup(IBillTypePublic.class);
        BillTypeVO btVO = this.checkFcbz(busitypevo);
        busitypevo.setParentVO((CircularlyAccessibleValueObject)djlvo);
        service.deleteBillType(btVO);
    }

    public void execOnPublish(BilltypeVO transtypevo, String oldApppk, String newApppk, boolean isExecFunc) throws BusinessException {
    }

    public void execOnDelPublish(BilltypeVO transTypeVO, ArrayList<AppRegisterVO> appVOs) throws BusinessException {
    }

    private BillTypeVO checkFcbz(BillTypeVO busitypevo) throws BusinessException {
        BillTypeVO billTypeVO = busitypevo;
        DjLXVO djlvo = (DjLXVO)billTypeVO.getParentVO();
        if (djlvo.getIsqr() != null && djlvo.getIsqr().booleanValue() && !ARAPModuleEnableUtil.isCMPEnable((String)djlvo.getPk_group())) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0281"));
        }
        return billTypeVO;
    }

    private BillTypeVO converttoBilltype(BilltypeVO transtype) {
        BillTypeVO vo = new BillTypeVO();
        DjLXVO head = new DjLXVO();
        vo.setParentVO((CircularlyAccessibleValueObject)head);
        vo.setParentBillType(transtype.parentbilltype);
        head.setDjdl(this.getDjlxvo(transtype));
        head.setDjlxbm(transtype.getPk_billtypecode());
        head.setDjlxmc_remark(transtype.getBilltypename());
        head.setDjlxjc_remark(transtype.getBilltypename());
        return vo;
    }

    private String getDjlxvo(BilltypeVO transtype) {
        DjLXVO head = new DjLXVO();
        String dj = transtype.getParentbilltype();
        if ("F0".equals(dj)) {
            head.setDjdl("ys");
        } else if ("F1".equals(dj)) {
            head.setDjdl("yf");
        } else if ("F2".equals(dj)) {
            head.setDjdl("sk");
        } else if ("F3".equals(dj)) {
            head.setDjdl("fk");
        }
        String djdl = head.getDjdl();
        return djdl;
    }
}

