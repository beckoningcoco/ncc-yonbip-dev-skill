# |<<

**租入租金计算单 (ali_rent_calc / nc.vo.ali.rent.calculate.RentInCalcHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/59.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rent_calc | 租金计算单主键 | pk_rent_calc | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 3 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | bill_type | 单据类型 | bill_type | varchar(4) |  | 字符串 (String) |
| 6 | busi_type | 业务类型 | busi_type | varchar(20) |  | 业务流程 (BusitypeVO) |
| 7 | transi_type | 交易类型编码 | transi_type | varchar(30) |  | 字符串 (String) |
| 8 | pk_transitype | 交易类型 | pk_transitype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 9 | bill_code | 计算单号 | bill_code | varchar(40) |  | 字符串 (String) |
| 10 | calculate_date | 计算日期 | calculate_date | char(19) |  | 日期 (UFDate) |
| 11 | pk_org_out | 出租组织最新版本 | pk_org_out | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 12 | pk_org_out_v | 出租组织 | pk_org_out_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 13 | pk_supplier | 出租方 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 14 | pk_customer | 承租方 | pk_customer | varchar(20) |  | 客户基本信息 (customer) |
| 15 | pk_org_in | 承租组织最新版本 | pk_org_in | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 16 | pk_org_in_v | 承租组织 | pk_org_in_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 17 | pk_fiorg_out | 出租财务组织最新版本 | pk_fiorg_out | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 18 | pk_fiorg_out_v | 出租财务组织 | pk_fiorg_out_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 19 | pk_fiorg_in | 承租财务组织最新版本 | pk_fiorg_in | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 20 | pk_fiorg_in_v | 承租财务组织 | pk_fiorg_in_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 21 | pk_raorg_out | 出租利润中心最新版本 | pk_raorg_out | varchar(20) |  | 利润中心 (profitcenter) |
| 22 | pk_raorg_out_v | 出租利润中心 | pk_raorg_out_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 23 | pk_raorg_in | 承租利润中心最新版本 | pk_raorg_in | varchar(20) |  | 利润中心 (profitcenter) |
| 24 | pk_raorg_in_v | 承租利润中心 | pk_raorg_in_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 25 | bill_status | 单据状态 | bill_status | int |  | 单据状态 (billstatus) |  | 0=自由态; |