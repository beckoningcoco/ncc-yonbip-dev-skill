# |<<

**租入归还单 (ali_restore / nc.vo.ali.lease.restore.LeaseInRestoreHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/65.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_leasein_restore | 租入归还主键 | pk_leasein_restore | char(20) | √ | 主键 (UFID) |
| 2 | pk_org_in | 承租组织最新版本 | pk_org_in | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 3 | pk_org_in_v | 承租组织 | pk_org_in_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 4 | transi_type | 交易类型编码 | transi_type | varchar(30) |  | 字符串 (String) |
| 5 | pk_transitype | 交易类型 | pk_transitype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 6 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 7 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 8 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 9 | bill_code | 归还单号 | bill_code | varchar(40) |  | 字符串 (String) |
| 10 | bill_status | 单据状态 | bill_status | int |  | 单据状态 (billstatus) |  | 0=自由态; |