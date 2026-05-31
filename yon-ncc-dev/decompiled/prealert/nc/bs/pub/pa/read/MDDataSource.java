/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.md.data.access.DASFacade
 *  nc.md.data.access.NCObject
 *  nc.md.model.IAttribute
 *  nc.md.model.IBean
 *  nc.md.model.type.IEnumType
 *  nc.md.model.type.IType
 *  nc.ui.pub.print.IDataSource
 *  nc.ui.pub.print.IExDataSource
 *  nc.vo.bd.userdefrule.UserdefitemVO
 *  nc.vo.ml.NCLangRes4VoTransl
 */
package nc.bs.pub.pa.read;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nc.bs.pub.pa.read.PTDefaultUserDefInfoQueryService;
import nc.bs.pub.pa.read.PTMDUtil;
import nc.md.data.access.DASFacade;
import nc.md.data.access.NCObject;
import nc.md.model.IAttribute;
import nc.md.model.IBean;
import nc.md.model.type.IEnumType;
import nc.md.model.type.IType;
import nc.ui.pub.print.IDataSource;
import nc.ui.pub.print.IExDataSource;
import nc.vo.bd.userdefrule.UserdefitemVO;
import nc.vo.ml.NCLangRes4VoTransl;

public class MDDataSource
implements IDataSource,
IExDataSource {
    private static final long serialVersionUID = -6981961449209007053L;
    private static final String DEFAULT_PREFIX = ".";
    private NCObject[] ncObjects = null;
    private IDataSource origDs = null;
    private transient ValueCollectorFactory valueCollectorFactory = new ValueCollectorFactory();
    private transient List<String> varList;
    private transient Map<String, Object[]> path_value_map;
    private transient Map<String, UserdefitemVO> path_userDefInfo_map;

    public MDDataSource(IDataSource ds, List<String> varList) {
        this.origDs = ds;
        this.varList = varList;
    }

    private Map<String, Object[]> getPath_Value_Map() {
        if (this.path_value_map == null) {
            this.path_value_map = new HashMap<String, Object[]>();
            this.initPath_Value_Map();
        }
        return this.path_value_map;
    }

    private void initPath_Value_Map() {
        List<String> vars = this.extractNot1LevelVars();
        if (vars == null || vars.isEmpty()) {
            return;
        }
        if (this.isCardPrint()) {
            this.fetchVarValueFromVO(vars);
        } else {
            List<String> calVars = this.extractCalculationVars(vars);
            this.fetchCalculationVarValueFromVO(calVars);
            vars.removeAll(calVars);
            this.fetchVarValueFromMD(vars);
        }
    }

    private List<String> extractNot1LevelVars() {
        if (this.varList == null || this.varList.isEmpty()) {
            return null;
        }
        ArrayList<String> vars = new ArrayList<String>();
        for (String var : this.varList) {
            if (this.is1LevelAttribute(var)) continue;
            vars.add(var);
        }
        return vars;
    }

    private boolean is1LevelAttribute(String attrpath) {
        return PTMDUtil.is1LevelAttr2(attrpath, this.getBean());
    }

    private boolean isCardPrint() {
        return this.ncObjects.length == 1;
    }

    private void fetchVarValueFromVO(List<String> vars) {
        Object[] values = this.ncObjects[0].getAttributeValue(vars.toArray(new String[0]));
        for (int i = 0; i < vars.size(); ++i) {
            this.path_value_map.put(vars.get(i), (Object[])values[i]);
        }
    }

    private List<String> extractCalculationVars(List<String> vars) {
        ArrayList<String> calVars = new ArrayList<String>();
        for (String var : vars) {
            if (!this.isCalculationAttr(var)) continue;
            calVars.add(var);
        }
        return calVars;
    }

    private boolean isCalculationAttr(String attrpath) {
        ArrayList<String> paths = new ArrayList<String>();
        MDDataSource.splitAttrpath(attrpath, paths);
        for (String path : paths) {
            IAttribute attr = this.getBean().getAttributeByPath(path);
            if (!attr.isCalculation()) continue;
            return true;
        }
        return false;
    }

    private static void splitAttrpath(String attrpath, List<String> list) {
        list.add(attrpath);
        if (attrpath.contains(DEFAULT_PREFIX)) {
            MDDataSource.splitAttrpath(attrpath.substring(0, attrpath.lastIndexOf(DEFAULT_PREFIX)), list);
        }
    }

    private void fetchCalculationVarValueFromVO(List<String> calVars) {
        for (String calVar : calVars) {
            ArrayList<Object> values = new ArrayList<Object>();
            for (NCObject ncobject : this.ncObjects) {
                Object value = ncobject.getAttributeValue(calVar);
                values.add(value);
            }
            this.path_value_map.put(calVar, values.toArray(new Object[0]));
        }
    }

    private void fetchVarValueFromMD(List<String> vars) {
        Map<String, List<String>> prefix_var_map = this.classifyVars(vars);
        if (prefix_var_map.get(DEFAULT_PREFIX) != null) {
            Map<String, Object[]> varValues = this.fetchParentBeanVarValueFromMD(prefix_var_map.get(DEFAULT_PREFIX));
            this.path_value_map.putAll(varValues);
            prefix_var_map.remove(DEFAULT_PREFIX);
        }
        this.fetchChildrenBeanVarValueFromMD(prefix_var_map);
    }

    private Map<String, List<String>> classifyVars(List<String> vars) {
        HashMap<String, List<String>> prefix_vars_map = new HashMap<String, List<String>>();
        for (String var : vars) {
            String preffix = this.getVarPreffix(var);
            if (!this.isCollection(preffix)) {
                preffix = DEFAULT_PREFIX;
            }
            if (prefix_vars_map.get(preffix) == null) {
                prefix_vars_map.put(preffix, new ArrayList());
            }
            ((List)prefix_vars_map.get(preffix)).add(var);
        }
        return prefix_vars_map;
    }

    private String getVarPreffix(String var) {
        return PTMDUtil.splitPath(var)[0];
    }

    private boolean isCollection(String preffix) {
        IAttribute parentAttr = this.getBean().getAttributeByPath(preffix);
        if (parentAttr == null) {
            return false;
        }
        return PTMDUtil.isCollection(parentAttr);
    }

    private Map<String, Object[]> fetchParentBeanVarValueFromMD(List<String> vars) {
        List<String> pks = PTMDUtil.extractPKs(this.ncObjects);
        if (pks == null || pks.isEmpty()) {
            return new HashMap<String, Object[]>();
        }
        return PTMDUtil.getAttrpath_Values_Map(this.getBean(), pks, vars);
    }

    private void fetchChildrenBeanVarValueFromMD(Map<String, List<String>> prefix_var_map) {
        Set<String> childBeanPaths = prefix_var_map.keySet();
        for (String childBeanPath : childBeanPaths) {
            List<String> childVars = prefix_var_map.get(childBeanPath);
            if (childVars == null) continue;
            IBean childBean = PTMDUtil.getAssociationBean(this.getBean().getAttributeByPath(childBeanPath));
            List<String> childPKs = PTMDUtil.extractChildVOPKs(this.ncObjects, childBeanPath);
            List<String> childAttrpaths = this.extractChildAttrPaths(childBeanPath, childVars);
            Map<String, Object[]> attrValues = PTMDUtil.getAttrpath_Values_Map(childBean, childPKs, childAttrpaths);
            for (String childAttrpath : childAttrpaths) {
                String reconstructKey = childBeanPath + DEFAULT_PREFIX + childAttrpath;
                this.path_value_map.put(reconstructKey, attrValues.get(childAttrpath));
            }
        }
    }

    private List<String> extractChildAttrPaths(String childBeanPath, List<String> childVars) {
        ArrayList<String> attrPaths = new ArrayList<String>();
        for (String var : childVars) {
            attrPaths.add(var.replaceAll(childBeanPath + DEFAULT_PREFIX, ""));
        }
        return attrPaths;
    }

    private Map<String, UserdefitemVO> getPath_DefInfo_Map() {
        if (this.path_userDefInfo_map == null) {
            String beanID = this.getBean().getID();
            List<String> defAttrpath = this.extractDefAttrPath();
            this.path_userDefInfo_map = new PTDefaultUserDefInfoQueryService().getUserDefInfoMap(beanID, defAttrpath);
        }
        return this.path_userDefInfo_map;
    }

    private List<String> extractDefAttrPath() {
        if (this.varList == null || this.varList.isEmpty()) {
            return null;
        }
        ArrayList<String> defPath = new ArrayList<String>();
        for (String var : this.varList) {
            IAttribute attr = this.getBean().getAttributeByPath(var);
            if (attr == null || !attr.isCustomAttr()) continue;
            defPath.add(var);
        }
        return defPath;
    }

    public void setNCObjects(IBean bean, Object ... objs) {
        this.ncObjects = new NCObject[objs.length];
        for (int i = 0; i < this.ncObjects.length; ++i) {
            this.ncObjects[i] = DASFacade.newInstanceWithContainedObject((IBean)bean, (Object)objs[i]);
        }
    }

    public void setNCObjects(NCObject ... objs) {
        this.ncObjects = objs;
    }

    public String[] getAllDataItemExpress() {
        return null;
    }

    public String[] getAllDataItemNames() {
        return null;
    }

    public String[] getDependentItemExpressByExpress(String itemExpress) {
        if (this.origDs != null) {
            return this.origDs.getDependentItemExpressByExpress(itemExpress);
        }
        return null;
    }

    public String[] getItemValuesByExpress(String itemExpress) {
        String[] result = this.getMDValueByExpress(itemExpress);
        if (result == null && this.origDs != null) {
            result = this.origDs.getItemValuesByExpress(itemExpress);
        }
        return result;
    }

    private String[] getMDValueByExpress(String itemExpress) {
        ArrayList<String> result = new ArrayList<String>();
        if (this.ncObjects == null || this.ncObjects.length == 0) {
            return null;
        }
        IAttribute attribute = this.getBean().getAttributeByPath(itemExpress);
        if (attribute == null) {
            return null;
        }
        ValueCollector valueCollector = this.valueCollectorFactory.create(attribute, itemExpress);
        result.addAll(valueCollector.fetchValues(itemExpress));
        return result.toArray(new String[0]);
    }

    private IBean getBean() {
        return this.ncObjects[0].getRelatedBean();
    }

    public String getModuleName() {
        return null;
    }

    public boolean isNumber(String itemExpress) {
        if (this.origDs != null) {
            return this.origDs.isNumber(itemExpress);
        }
        return false;
    }

    public Object[] getObjectByExpress(String itemExpress) {
        if (this.origDs != null && this.origDs instanceof IExDataSource) {
            return ((IExDataSource)this.origDs).getObjectByExpress(itemExpress);
        }
        return this.getMDValueByExpress(itemExpress);
    }

    public int getObjectTypeByExpress(String itemExpress) {
        if (this.origDs != null && this.origDs instanceof IExDataSource) {
            return ((IExDataSource)this.origDs).getObjectTypeByExpress(itemExpress);
        }
        return 1;
    }

    private class EnumValueCollector
    extends MDValueCollector {
        public EnumValueCollector(IAttribute attribute) {
            super(attribute);
        }

        @Override
        protected String valueObject2String(Object value) {
            IEnumType enumType = (IEnumType)this.getAttribute().getDataType();
            return enumType.getConstEnum(value).getName();
        }
    }

    private class BooleanValueCollector
    extends MDValueCollector {
        public BooleanValueCollector(IAttribute attribute) {
            super(attribute);
        }

        @Override
        protected String valueObject2String(Object value) {
            return value.toString().equalsIgnoreCase("Y") ? NCLangRes4VoTransl.getNCLangRes().getStrByID("_Template", "UPP_Template-000053") : NCLangRes4VoTransl.getNCLangRes().getStrByID("_Template", "UPP_Template-000054");
        }
    }

    private class StringValueCollector
    extends MDValueCollector {
        public StringValueCollector(IAttribute attribute) {
            super(attribute);
        }

        @Override
        protected String valueObject2String(Object value) {
            return value.toString();
        }
    }

    private abstract class MDValueCollector
    implements ValueCollector {
        private IAttribute attribute;

        public MDValueCollector(IAttribute attribute) {
            this.attribute = attribute;
        }

        @Override
        public List<String> fetchValues(String itemExpress) {
            ArrayList<String> result = null;
            if (MDDataSource.this.is1LevelAttribute(itemExpress)) {
                result = new ArrayList();
                for (NCObject obj : MDDataSource.this.ncObjects) {
                    Object values = obj.getAttributeValue(itemExpress);
                    if (values != null) {
                        result.addAll(this.fetch(values));
                        continue;
                    }
                    if (MDDataSource.this.isCardPrint()) continue;
                    result.addAll(this.fetch(values));
                }
            } else {
                Object[] values = (Object[])MDDataSource.this.getPath_Value_Map().get(itemExpress);
                result = this.fetch(values);
            }
            return result;
        }

        private List<String> fetch(Object ... values) {
            ArrayList<String> result = new ArrayList<String>();
            if (values != null) {
                for (Object obj : values) {
                    if (obj == null) {
                        result.add(null);
                        continue;
                    }
                    if (obj.getClass().isArray()) {
                        Object[] objs = (Object[])obj;
                        for (int i = 0; i < objs.length; ++i) {
                            if (objs[i] != null) {
                                result.add(this.valueObject2String(objs[i]));
                                continue;
                            }
                            result.add(null);
                        }
                        continue;
                    }
                    result.add(this.valueObject2String(obj));
                }
            }
            return result;
        }

        protected abstract String valueObject2String(Object var1);

        public IAttribute getAttribute() {
            return this.attribute;
        }
    }

    private static interface ValueCollector {
        public List<String> fetchValues(String var1);
    }

    private class ValueCollectorFactory {
        private ValueCollectorFactory() {
        }

        public ValueCollector create(IAttribute attribute, String attrpath) {
            IType type = this.getAttributeTrueType(attribute, attrpath);
            if (PTMDUtil.isBoolean(type)) {
                return new BooleanValueCollector(attribute);
            }
            if (PTMDUtil.isEnum(type)) {
                return new EnumValueCollector(attribute);
            }
            return new StringValueCollector(attribute);
        }

        private IType getAttributeTrueType(IAttribute attribute, String attrpath) {
            UserdefitemVO defInfo;
            IType type = attribute.getDataType();
            if (attribute.isCustomAttr() && (defInfo = (UserdefitemVO)MDDataSource.this.getPath_DefInfo_Map().get(attrpath)) != null) {
                type = PTMDUtil.getTypeByID(defInfo.getClassid());
            }
            return type;
        }
    }
}

