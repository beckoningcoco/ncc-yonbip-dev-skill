/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.ui.pub.print.IDataSource
 *  nc.ui.pub.print.IMetaDataDataSource
 */
package nc.bs.pub.pa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.ui.pub.print.IDataSource;
import nc.ui.pub.print.IMetaDataDataSource;
import nc.vo.pub.pa.AlertregistryVO;
import nc.vo.pub.pa.AlerttypeconfigVO;

public class PreAlertDataSource
implements IMetaDataDataSource {
    private static final long serialVersionUID = 8368615547773279703L;
    private IDataSource ds = null;
    private List<String> nameList = new ArrayList<String>();
    private List<String> codeList = new ArrayList<String>();
    private Map<String, String[]> map = new HashMap<String, String[]>();

    public PreAlertDataSource(IDataSource ds, AlertregistryVO registry) {
        this.ds = ds;
        AlerttypeconfigVO[] vos = registry.getTypeConfigVo();
        if (vos != null) {
            for (AlerttypeconfigVO vo : vos) {
                String value = vo.getValue();
                String code = vo.getFieldname();
                String name = vo.getVariablename();
                this.nameList.add(name);
                this.codeList.add(code);
                this.map.put(code, new String[]{value});
            }
        }
    }

    public String[] getItemValuesByExpress(String itemExpress) {
        String[] ret = this.ds.getItemValuesByExpress(itemExpress);
        if (ret == null || ret.length == 0) {
            ret = this.map.get(itemExpress);
        }
        return ret;
    }

    public boolean isNumber(String itemExpress) {
        return this.ds.isNumber(itemExpress);
    }

    public String[] getDependentItemExpressByExpress(String itemExpress) {
        return this.ds.getDependentItemExpressByExpress(itemExpress);
    }

    public String[] getAllDataItemExpress() {
        ArrayList<String> allExpress = new ArrayList<String>();
        allExpress.addAll(this.codeList);
        allExpress.addAll(Arrays.asList(this.ds.getAllDataItemExpress()));
        return allExpress.toArray(new String[0]);
    }

    public String[] getAllDataItemNames() {
        ArrayList<String> allNames = new ArrayList<String>();
        allNames.addAll(this.nameList);
        allNames.addAll(Arrays.asList(this.ds.getAllDataItemNames()));
        return allNames.toArray(new String[0]);
    }

    public String getModuleName() {
        return this.ds.getModuleName();
    }

    public Object[] getMDObjects() {
        if (this.ds instanceof IMetaDataDataSource) {
            return ((IMetaDataDataSource)this.ds).getMDObjects();
        }
        return new Object[0];
    }
}

