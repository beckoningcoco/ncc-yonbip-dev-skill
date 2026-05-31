# |<<

**期初成本还原数据 (cm_revertbg / nc.vo.cm.revertbg.entity.RevertBgHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1501.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | crevertbgid | 期初成本还原数据 | crevertbgid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cperiod | 会计期间 | cperiod | varchar(20) |  | 会计月份 (accperiodmonth) |
| 6 | cmaterialid | 产品版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 7 | cmaterialvid | 产品 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 8 | cmarcostclassid | 产品成本分类 | cmarcostclassid | varchar(20) |  | 物料成本分类 (marcostclass) |
| 9 | nnum | 结存数量 | nnum | decimal(20, 8) |  | 数值 (UFDouble) |
| 10 | ncost | 结存金额 | ncost | decimal(20, 8) |  | 数值 (UFDouble) |
| 11 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 12 | dbilldate | 业务日期 | dbilldate | char(19) |  | 日期时间 (UFDateTime) |
| 13 | bbeginflag | 是否期初数据 | bbeginflag | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | vbillcode | 单据编码 | vbillcode | varchar(40) |  | 字符串 (String) |
| 15 | isourcetype | 数据来源 | isourcetype | int |  | 期初成本还原数据来源类型 (RevertSourceTypeEnum) | 1 | 1=手工创建; |