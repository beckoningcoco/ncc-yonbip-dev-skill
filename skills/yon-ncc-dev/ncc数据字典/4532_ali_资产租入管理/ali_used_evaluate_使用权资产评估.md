# |<<

**使用权资产评估 (ali_used_evaluate / nc.vo.ali.used.evaluate.UsedEvaluateHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/74.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_evaluate | 使用权资产评估主键 | pk_evaluate | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org_in | 承租组织最新版本 | pk_org_in | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_org_in_v | 承租组织 | pk_org_in_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | pk_org_out | 出租组织最新版本 | pk_org_out | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 6 | pk_org_out_v | 出租组织 | pk_org_out_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 7 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 8 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 9 | pk_fiorg_in_v | 承租财务组织 | pk_fiorg_in_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 10 | pk_fiorg_in | 承租财务组织最新版本 | pk_fiorg_in | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 11 | pk_currency_origin | 原币币种 | pk_currency_origin | varchar(20) |  | 币种 (currtype) |
| 12 | origin_rate | 汇率 | origin_rate | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | pk_currency_local | 本币币种 | pk_currency_local | varchar(20) |  | 币种 (currtype) |
| 14 | bill_type | 单据类型 | bill_type | varchar(4) |  | 字符串 (String) |
| 15 | busi_type | 业务类型 | busi_type | varchar(20) |  | 业务流程 (BusitypeVO) |
| 16 | bill_status | 单据状态 | bill_status | int |  | 单据状态 (billstatus) |  | 0=自由态; |