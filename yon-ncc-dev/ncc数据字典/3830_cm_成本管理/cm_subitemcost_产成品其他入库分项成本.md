# |<<

**产成品其他入库分项成本 (cm_subitemcost / nc.vo.cm.subitemcost.entity.SubitemcostHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1514.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | csubitemcostid | 产成品其他入库分项成本 | csubitemcostid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 6 | dbusinessdate | 业务日期 | dbusinessdate | char(19) |  | 日期 (UFDate) |
| 7 | cmaterialid | 产品 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 8 | cmaterialvid | 产品版本 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 9 | cmeasureid | 计量单位 | cmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 10 | nnumber | 数量 | nnumber | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | nprice | 单价 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | nmoney | 金额 | nmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | isourcetype | 来源类型 | isourcetype | int |  | 来源类型 (enum) |  | 1=采购入库-交易类型; |