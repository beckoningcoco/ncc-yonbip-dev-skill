/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.bill.ArapBillDAO
 *  nc.bs.arap.util.BillEuroUtils
 *  nc.bs.dao.DAOException
 *  nc.pubitf.uapbd.TaxcodeUtil
 *  nc.pubitf.uapbd.taxcode.TaxrateQueryVO
 *  nc.vo.bd.taxcode.TaxrateVO
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nccloud.pubitf.arap.arappub.IBillEuroUtilsService
 */
package nccloud.pubimpl.arap.arappub;

import java.util.Map;
import nc.bs.arap.bill.ArapBillDAO;
import nc.bs.arap.util.BillEuroUtils;
import nc.bs.dao.DAOException;
import nc.pubitf.uapbd.TaxcodeUtil;
import nc.pubitf.uapbd.taxcode.TaxrateQueryVO;
import nc.vo.bd.taxcode.TaxrateVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nccloud.pubitf.arap.arappub.IBillEuroUtilsService;

public class BillEuroUtilsServiceImpl
implements IBillEuroUtilsService {
    public UFBoolean[] getOpptaxFlag(String taxcountry, String pk_org, Object[] buysellTypes) {
        return BillEuroUtils.getOpptaxFlag((String)taxcountry, (String)pk_org, (Object[])buysellTypes);
    }

    public Map<String, String> getVatCode(String[] taxcountrys, String[] pk_orgs) {
        return BillEuroUtils.getVatCode((String[])taxcountrys, (String[])pk_orgs);
    }

    public Map<String, String> getBodyEuroAfterEditHandler(String pk_customer) {
        return BillEuroUtils.getBodyEuroAfterEditHandler((String)pk_customer);
    }

    public String getCountryByCustomerSupplier(String customer_supplier, boolean iscustomer) {
        return BillEuroUtils.getCountryByCustomerSupplier((String)customer_supplier, (boolean)iscustomer);
    }

    public String[] getSuppTaxcode(UFDate billdate, String rececountryid, String[] material, Integer[] buys, String[] sendcountryid, String[] supplier, String taxcountryid) {
        return BillEuroUtils.getSuppTaxcode((UFDate)billdate, (String)rececountryid, (String[])material, (Integer[])buys, (String[])sendcountryid, (String[])supplier, (String)taxcountryid);
    }

    public String[] getCusTaxcode(UFDate billdate, String[] rececountryid, String[] material, Integer[] sells, String sendcountryid, String[] customer, String taxcountryid, UFBoolean[] trialtradetype) {
        return BillEuroUtils.getCusTaxcode((UFDate)billdate, (String[])rececountryid, (String[])material, (Integer[])sells, (String)sendcountryid, (String[])customer, (String)taxcountryid, (UFBoolean[])trialtradetype);
    }

    public String[] getCusSuppVatCode(String[] country, String[] customer_supplier, boolean iscustomer) {
        return BillEuroUtils.getCusSuppVatCode((String[])country, (String[])customer_supplier, (boolean)iscustomer);
    }

    public Integer getBuyType(String taxcountry, String sendcountry) {
        return BillEuroUtils.getBuyType((String)taxcountry, (String)sendcountry);
    }

    public Integer getSellType(String taxcountry, String rececountry) {
        return BillEuroUtils.getSellType((String)taxcountry, (String)rececountry);
    }

    public UFBoolean getTriaTradeFlag(String sendcountry, String taxcountry, String rececountry) {
        return BillEuroUtils.getTriaTradeFlag((String)sendcountry, (String)taxcountry, (String)rececountry);
    }

    public TaxrateVO[] getTaxratesByTaxcodeIdAndDates(TaxrateQueryVO[] queryVOs) throws BusinessException {
        return TaxcodeUtil.getInstance().getTaxratesByTaxcodeIdAndDates(queryVOs);
    }

    public Map<String, String> getMaterialTaxCode(String[] materials, Map<String, String[]> map) throws DAOException {
        ArapBillDAO dao = new ArapBillDAO();
        Map taxCodeByMaterial = dao.getTaxCodeByMaterial(materials, map);
        return taxCodeByMaterial;
    }
}

