/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.thoughtworks.xstream.XStream
 *  com.thoughtworks.xstream.security.AnyTypePermission
 *  nc.md.data.access.DASFacade
 *  nc.md.data.access.NCObject
 *  nc.ui.pub.print.IDataSource
 *  nc.ui.pub.print.IMetaDataDataSource
 *  nc.vo.pf.pub.util.ArrayUtil
 */
package nc.bs.pub.pa.read;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.security.AnyTypePermission;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import nc.bs.pub.pa.IMobileDataSource;
import nc.bs.pub.pa.read.MDDataSource;
import nc.md.data.access.DASFacade;
import nc.md.data.access.NCObject;
import nc.ui.pub.print.IDataSource;
import nc.ui.pub.print.IMetaDataDataSource;
import nc.vo.pf.pub.util.ArrayUtil;
import uap.vo.prealert.util.PreAlertMobileAppUtil;

public class MobileAppMsgCreator {
    private IMobileDataSource mds;
    private IDataSource ds;
    private Map<String, String[]> bodyKeyDataMap = new HashMap<String, String[]>();

    public MobileAppMsgCreator(IMobileDataSource mds, IDataSource ds) {
        this.mds = mds;
        this.ds = ds;
    }

    public String createAsXML() {
        Map<String, Object> map = this.createAsMap();
        XStream xstream = new XStream();
        xstream.addPermission(AnyTypePermission.ANY);
        return xstream.toXML(map);
    }

    public Map<String, Object> createAsMap() {
        this.resolveMdDs();
        DataRow header = this.buildHeader();
        List<DataRow> body = this.buildBody();
        LinkedHashMap<String, Object> msgMap = new LinkedHashMap<String, Object>();
        msgMap.put("header", header.toListWithoutSummary());
        msgMap.put("rowcnt", String.valueOf(PreAlertMobileAppUtil.getRowCount()));
        ArrayList<Map<String, Object>> bodyMapList = new ArrayList<Map<String, Object>>();
        for (DataRow row : body) {
            bodyMapList.add(row.toMap());
        }
        msgMap.put("body", bodyMapList);
        return msgMap;
    }

    private DataRow buildHeader() {
        DataRow header = new DataRow();
        header.setSummary(this.mds.getHeaderSummary());
        Map<String, String> headerDescp = this.mds.getHeaderDescription();
        for (String key : headerDescp.keySet()) {
            String fieldName = headerDescp.get(key);
            String value = null;
            String[] values = this.ds.getItemValuesByExpress(key);
            if (values != null && values.length != 0) {
                value = values[0];
            }
            header.addEntry(key, fieldName, value);
        }
        return header;
    }

    private List<DataRow> buildBody() {
        ArrayList<DataRow> bodyRowList = new ArrayList<DataRow>();
        String[] bodySummaries = this.mds.getBodySummaries();
        int rowCount = bodySummaries.length;
        PreAlertMobileAppUtil.setRowCount(rowCount);
        if (rowCount > PreAlertMobileAppUtil.TRIM_TO_COUNT) {
            rowCount = PreAlertMobileAppUtil.TRIM_TO_COUNT;
        }
        Map<String, String> bodyDescp = this.mds.getBodyDescription();
        for (int i = 0; i < rowCount; ++i) {
            DataRow bodyRow = new DataRow();
            bodyRow.setSummary(bodySummaries[i]);
            for (String key : bodyDescp.keySet()) {
                String[] columnData = this.bodyKeyDataMap.get(key);
                if (columnData == null) {
                    columnData = this.ds.getItemValuesByExpress(key);
                    if (columnData == null) {
                        columnData = new String[]{};
                    }
                    this.bodyKeyDataMap.put(key, columnData);
                }
                String fieldName = bodyDescp.get(key);
                String value = columnData.length >= rowCount ? columnData[i] : null;
                bodyRow.addEntry(key, fieldName, value);
            }
            bodyRowList.add(bodyRow);
        }
        return bodyRowList;
    }

    private void resolveMdDs() {
        IMetaDataDataSource mdds;
        Object[] objects;
        if (this.ds instanceof IMetaDataDataSource && !ArrayUtil.isNull((Object[])(objects = (mdds = (IMetaDataDataSource)this.ds).getMDObjects()))) {
            NCObject[] ncobjs = new NCObject[objects.length];
            for (int i = 0; i < objects.length; ++i) {
                NCObject ncobj;
                Object obj = objects[i];
                ncobjs[i] = ncobj = DASFacade.newInstanceWithContainedObject((Object)obj);
            }
            ArrayList<String> varList = new ArrayList<String>();
            varList.addAll(this.mds.getHeaderDescription().keySet());
            varList.addAll(this.mds.getBodyDescription().keySet());
            this.ds = new MDDataSource(this.ds, varList);
            ((MDDataSource)this.ds).setNCObjects(ncobjs);
        }
    }

    class DataRow {
        private String summary;
        private List<Map<String, Object>> entryList = new ArrayList<Map<String, Object>>();

        DataRow() {
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public void addEntry(String key, String fieldName, String value) {
            LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
            map.put(key + "FieldName", fieldName);
            map.put(key, value);
            this.entryList.add(map);
        }

        public Map<String, Object> toMap() {
            LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
            map.put("summary", this.summary);
            map.put("child", this.entryList);
            return map;
        }

        public List<Map<String, Object>> toListWithoutSummary() {
            return this.entryList;
        }
    }
}

