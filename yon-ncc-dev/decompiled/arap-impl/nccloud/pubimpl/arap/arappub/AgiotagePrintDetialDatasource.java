/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.ui.pub.print.IMetaDataDataSource
 *  nccloud.dto.arap.arappub.agiotageinfo.ReportPanelVO
 */
package nccloud.pubimpl.arap.arappub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import nc.ui.pub.print.IMetaDataDataSource;
import nccloud.dto.arap.arappub.agiotageinfo.ReportPanelVO;

public class AgiotagePrintDetialDatasource
implements IMetaDataDataSource {
    private static final long serialVersionUID = 1L;
    private ReportPanelVO[] datas;

    public AgiotagePrintDetialDatasource(ReportPanelVO[] datas) {
        this.datas = datas;
    }

    public String[] getAllDataItemExpress() {
        return new String[]{"xzbz", "jsrq", "bzmc", "djlx", "billno", "ybye", "hl", "zzbbye", "tybye", "thl", "tzzbbye", "zzbbce", "zzsy", "clr"};
    }

    public String[] getAllDataItemNames() {
        return null;
    }

    public String[] getDependentItemExpressByExpress(String arg0) {
        return null;
    }

    public String[] getItemValuesByExpress(String key) {
        ReportPanelVO[] vos = this.datas;
        List<String> keys = Arrays.asList(this.getAllDataItemExpress());
        if (keys.contains(key)) {
            switch (key) {
                case "xzbz": {
                    ArrayList<String> list = new ArrayList<String>();
                    for (ReportPanelVO vo : vos) {
                        if (vo.getXzbz().booleanValue()) {
                            list.add("\u221a");
                            continue;
                        }
                        list.add("");
                    }
                    return list.toArray(new String[0]);
                }
                case "jsrq": {
                    ArrayList<String> list = new ArrayList<String>();
                    for (ReportPanelVO vo : vos) {
                        if (vo.getJsrq() != null) {
                            list.add(vo.getJsrq());
                            continue;
                        }
                        list.add("");
                    }
                    return list.toArray(new String[0]);
                }
                case "bzmc": {
                    ArrayList<String> list = new ArrayList<String>();
                    for (ReportPanelVO vo : vos) {
                        if (vo.getBzmc() != null) {
                            list.add(vo.getBzmc());
                            continue;
                        }
                        list.add("");
                    }
                    return list.toArray(new String[0]);
                }
                case "djlx": {
                    ArrayList<String> list = new ArrayList<String>();
                    for (ReportPanelVO vo : vos) {
                        if (vo.getDjlx() != null) {
                            list.add(vo.getDjlx());
                            continue;
                        }
                        list.add("");
                    }
                    return list.toArray(new String[0]);
                }
                case "billno": {
                    ArrayList<String> list = new ArrayList<String>();
                    for (ReportPanelVO vo : vos) {
                        if (vo.getBillno() != null) {
                            list.add(vo.getBillno());
                            continue;
                        }
                        list.add("");
                    }
                    return list.toArray(new String[0]);
                }
                case "ybye": {
                    ArrayList<String> list = new ArrayList<String>();
                    for (ReportPanelVO vo : vos) {
                        if (vo.getYbye() != null) {
                            list.add(vo.getYbye());
                            continue;
                        }
                        list.add("");
                    }
                    return list.toArray(new String[0]);
                }
                case "hl": {
                    ArrayList<String> list = new ArrayList<String>();
                    for (ReportPanelVO vo : vos) {
                        if (vo.getHl() != null) {
                            list.add(vo.getHl());
                            continue;
                        }
                        list.add("");
                    }
                    return list.toArray(new String[0]);
                }
                case "zzbbye": {
                    ArrayList<String> list = new ArrayList<String>();
                    for (ReportPanelVO vo : vos) {
                        if (vo.getZzbbye() != null) {
                            list.add(vo.getZzbbye());
                            continue;
                        }
                        list.add("");
                    }
                    return list.toArray(new String[0]);
                }
                case "tybye": {
                    ArrayList<String> list = new ArrayList<String>();
                    for (ReportPanelVO vo : vos) {
                        if (vo.getTybye() != null) {
                            list.add(vo.getTybye());
                            continue;
                        }
                        list.add("");
                    }
                    return list.toArray(new String[0]);
                }
                case "thl": {
                    ArrayList<String> list = new ArrayList<String>();
                    for (ReportPanelVO vo : vos) {
                        if (vo.getThl() != null) {
                            list.add(vo.getThl());
                            continue;
                        }
                        list.add("");
                    }
                    return list.toArray(new String[0]);
                }
                case "tzzbbye": {
                    ArrayList<String> list = new ArrayList<String>();
                    for (ReportPanelVO vo : vos) {
                        if (vo.getTzzbbye() != null) {
                            list.add(vo.getTzzbbye());
                            continue;
                        }
                        list.add("");
                    }
                    return list.toArray(new String[0]);
                }
                case "zzbbce": {
                    ArrayList<String> list = new ArrayList<String>();
                    for (ReportPanelVO vo : vos) {
                        if (vo.getZzbbce() != null) {
                            list.add(vo.getZzbbce());
                            continue;
                        }
                        list.add("");
                    }
                    return list.toArray(new String[0]);
                }
                case "zzsy": {
                    ArrayList<String> list = new ArrayList<String>();
                    for (ReportPanelVO vo : vos) {
                        if (vo.getZzsy() != null) {
                            list.add(vo.getZzsy());
                            continue;
                        }
                        list.add("");
                    }
                    return list.toArray(new String[0]);
                }
                case "clr": {
                    ArrayList<String> list = new ArrayList<String>();
                    for (ReportPanelVO vo : vos) {
                        if (vo.getClr() != null) {
                            list.add(vo.getClr());
                            continue;
                        }
                        list.add("");
                    }
                    return list.toArray(new String[0]);
                }
            }
            return null;
        }
        return null;
    }

    public String getModuleName() {
        return null;
    }

    public boolean isNumber(String arg0) {
        return false;
    }

    public Object[] getMDObjects() {
        return null;
    }
}

