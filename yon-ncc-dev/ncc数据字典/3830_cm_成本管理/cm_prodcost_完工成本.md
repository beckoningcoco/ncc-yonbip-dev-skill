# |<<

**完工成本 (cm_prodcost / nc.vo.cm.pc.pc0410.ProdcostHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1491.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cprodcostid | 完工成本 | cprodcostid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(0) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂版本 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cperiod | 会计期间 | cperiod | varchar(20) |  | 会计月份 (accperiodmonth) |
| 6 | ccostcenterid | 成本中心 | ccostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 7 | ccostobjectid | 成本对象 | ccostobjectid | varchar(20) |  | 成本对象 (cm_costobject) |
| 8 | nnum | 产量 | nnum | decimal(20, 8) |  | 数值 (UFDouble) |
| 9 | blastcenter | 是否末道成本中心 | blastcenter | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | cmaincostobjid | 联副产品主成本对象 | cmaincostobjid | varchar(20) |  | 成本对象 (cm_costobject) |
| 11 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 12 | ifeetype | 费用类型 | ifeetype | int |  | 费用类型 (FeeTypeEnum) |  | 1=主产品; |