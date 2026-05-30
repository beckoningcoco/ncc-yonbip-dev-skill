# |<<

**成本还原主实体 (cm_ctrevert / nc.vo.cm.costrevert.CtRevertHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1461.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ctrevert | 主表ID | pk_ctrevert | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂版本 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cperiod | 会计期间 | cperiod | varchar(20) |  | 会计月份 (accperiodmonth) |
| 6 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 7 | cmaterialvid | 物料版本 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 8 | cmarcostclassid | 物料成本分类ID | cmarcostclassid | varchar(20) |  | 物料成本分类 (marcostclass) |
| 9 | nnum | 产量 | nnum | decimal(20, 8) |  | 数值 (UFDouble) |
| 10 | vnote | 备注 | vnote | varchar(181) |  | 备注 (Memo) |
| 11 | cmeasureid | 计量单位 | cmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 12 | cfeaturematerialvid | 特征物料 | cfeaturematerialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 13 | ccostcenterid | 成本中心 | ccostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 14 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 15 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 16 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 17 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 18 | finstoragetype | 产品入库类型 | finstoragetype | int |  | 产品入库类型 (CostObjInStorageTypeEnum) |  | 1=自制; |