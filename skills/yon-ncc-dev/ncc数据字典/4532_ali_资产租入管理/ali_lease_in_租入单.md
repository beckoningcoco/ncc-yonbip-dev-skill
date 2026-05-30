# |<<

**租入单 (ali_lease_in / nc.vo.ali.lease.leasein.LeaseInHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/55.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_lease_in | 租入单主键 | pk_lease_in | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 3 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | bill_code | 租入单号 | bill_code | varchar(40) |  | 字符串 (String) |
| 6 | pk_org_out | 出租组织最新版本 | pk_org_out | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 7 | pk_org_out_v | 出租组织 | pk_org_out_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 8 | pk_fiorg_out | 出租财务组织最新版本 | pk_fiorg_out | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 9 | pk_fiorg_out_v | 出租财务组织 | pk_fiorg_out_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 10 | pk_raorg_out_v | 出租利润中心 | pk_raorg_out_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 11 | pk_raorg_out | 出租利润中心最新版本 | pk_raorg_out | varchar(20) |  | 利润中心 (profitcenter) |
| 12 | bill_type | 单据类型 | bill_type | varchar(4) |  | 字符串 (String) |
| 13 | pk_transitype | 交易类型 | pk_transitype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 14 | transi_type | 交易类型编码 | transi_type | varchar(30) |  | 字符串 (String) |
| 15 | bill_status | 单据状态 | bill_status | int |  | 单据状态 (billstatus) |  | 0=自由态; |