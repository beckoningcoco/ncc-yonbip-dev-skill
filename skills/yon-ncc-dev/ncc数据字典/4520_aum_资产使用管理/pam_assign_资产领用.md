# |<<

**资产领用 (pam_assign / nc.vo.aum.assign.used.AssignHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4219.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_assign | 主表主键 | pk_assign | char(20) | √ | 主键 (UFID) |
| 2 | pk_org_v | 使用管理组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 3 | pk_org | 使用管理组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | transi_type | 交易类型编码 | transi_type | varchar(30) |  | 字符串 (String) |
| 6 | pk_transitype | 交易类型 | pk_transitype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | bill_type | 单据类型 | bill_type | varchar(4) |  | 字符串 (String) |
| 8 | bill_code | 领用单号 | bill_code | varchar(40) |  | 字符串 (String) |
| 9 | bill_status | 单据状态 | bill_status | int |  | 单据状态 (billstatus) |  | 0=自由态; |