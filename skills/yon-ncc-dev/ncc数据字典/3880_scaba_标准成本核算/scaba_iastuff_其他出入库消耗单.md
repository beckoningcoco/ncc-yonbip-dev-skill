# |<<

**其他出入库消耗单 (scaba_iastuff / nc.vo.scaba.iastuff.entity.IastuffHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5085.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ciastuffid | 其他出入库消耗单 | ciastuffid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 6 | dbusinessdate | 业务日期 | dbusinessdate | char(19) |  | 日期 (UFDate) |
| 7 | cperiod | 会计期间 | cperiod | varchar(20) |  | 会计月份 (accperiodmonth) |
| 8 | cmaterialid | 物料最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 9 | cmaterialvid | 物料 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 10 | cmeasdocid | 计量单位 | cmeasdocid | varchar(20) |  | 计量单位 (measdoc) |
| 11 | nnum | 数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | nprice | 单价 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | nmoney | 金额 | nmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | ctradetype | 交易类型 | ctradetype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 15 | isourcetype | 来源类型 | isourcetype | int |  | 计算业务类型 (calcbiztype) |  | 1=普通计算类型; |