# |<<

**作业成本报表表头 (cm_ActCostHead / nc.vo.cm.actcostreport.ActCostReportHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1435.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_org | 工厂 | pk_org | varchar(20) | √ | 组织_业务单元_工厂 (factory) |
| 2 | cactcostid | 作业成本表头主键 | cactcostid | char(20) |  | 主键 (UFID) |
| 3 | pk_org_v | 工厂版本 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 4 | cperiod | 会计期间 | cperiod | varchar(50) |  | 字符串 (String) |
| 5 | cprodcostcenterid | 完工成本中心 | cprodcostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 6 | cactivityid | 作业id | cactivityid | varchar(20) |  | 作业档案 (bd_activity) |
| 7 | cactunitid | 作业计量单位 | cactunitid | varchar(20) |  | 计量单位 (measdoc) |
| 8 | celementid | 核算要素 | celementid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 9 | cconsumecostcenterid | 消耗成本中心id | cconsumecostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 10 | ccostobjectid | 成本对象 | ccostobjectid | varchar(20) |  | 成本对象 (cm_costobject) |
| 11 | cmaterialid | 产品 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 12 | cmaterialvid | 物料版本 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 13 | cmaterialspec | 规格 | cmaterialspec | varchar(50) |  | 字符串 (String) |
| 14 | cmaterialtype | 型号 | cmaterialtype | varchar(50) |  | 字符串 (String) |
| 15 | cprodunitid | 产品主计量单位 | cprodunitid | varchar(20) |  | 计量单位 (measdoc) |
| 16 | cmocode | 生产订单 | cmocode | varchar(50) |  | 字符串 (String) |
| 17 | nnumber | 产量 | nnumber | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | ninpronum | 在产量 | ninpronum | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | ninproequnum | 在产约当量 | ninproequnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | nactnum | 作业量 | nactnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | nstdactnum | 标准作业量 | nstdactnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | nactnumdiff | 作业量差异 | nactnumdiff | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | nactcost | 作业成本 | nactcost | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | nstdactcost | 标准作业成本 | nstdactcost | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | ncostdiff | 成本差异 | ncostdiff | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | nfactfee | 实际费率 | nfactfee | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | nstdfee | 标准费率 | nstdfee | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | nfeediff | 费率差异 | nfeediff | decimal(28, 8) |  | 数值 (UFDouble) |