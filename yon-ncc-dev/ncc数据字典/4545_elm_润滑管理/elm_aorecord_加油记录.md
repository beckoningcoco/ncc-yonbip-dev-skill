# |<<

**加油记录 (elm_aorecord / nc.vo.elm.addoilrecord.AddOilRecordHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1787.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_addoilrecord | 加油记录主键 | pk_addoilrecord | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | bill_type | 单据类型 | bill_type | varchar(50) |  | 字符串 (String) |
| 6 | transi_type | 交易类型编码 | transi_type | varchar(50) |  | 字符串 (String) |
| 7 | pk_transitype | 交易类型 | pk_transitype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 8 | busi_type | 业务类型 | busi_type | varchar(20) |  | 业务流程 (BusitypeVO) |
| 9 | bill_code | 单据号 | bill_code | varchar(50) |  | 字符串 (String) |
| 10 | bill_status | 单据状态 | bill_status | int |  | 单据状态 (billstatus) |  | 0=自由态; |