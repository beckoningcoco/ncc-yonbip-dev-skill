# |<<

**资产调出单 (fa_deployout / nc.vo.fa.deployout.DeployOutHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2011.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deployout | 单据主键 | pk_deployout | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 调出财务组织 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_raorg | 利润中心最新版本 | pk_raorg | varchar(20) |  | 利润中心 (profitcenter) |
| 6 | pk_raorg_v | 利润中心 | pk_raorg_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 7 | pk_accbook | 资产账簿 | pk_accbook | varchar(20) |  | 字符串 (String) |
| 8 | pk_accbook_scale | 资产账簿精度 | pk_accbook_scale | varchar(50) |  | 字符串 (String) |
| 9 | pk_currency | 币种精度 | pk_currency | varchar(50) |  | 字符串 (String) |
| 10 | pk_org_out | 调出 财务组织 | pk_org_out | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 11 | pk_org_in | 调入财务组织最新版本 | pk_org_in | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 12 | pk_org_in_v | 调入财务组织 | pk_org_in_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 13 | business_date | 调出日期 | business_date | char(19) |  | 日期 (UFDate) |
| 14 | bill_type | 单据类型 | bill_type | varchar(4) |  | 字符串 (String) |
| 15 | transi_type | 交易类型编码 | transi_type | varchar(30) |  | 字符串 (String) |
| 16 | pk_transitype | 交易类型 | pk_transitype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 17 | bill_code | 调出单号 | bill_code | varchar(40) |  | 字符串 (String) |
| 18 | bill_status | 单据状态 | bill_status | int |  | 单据状态 (billstatus) |  | 0=自由态; |