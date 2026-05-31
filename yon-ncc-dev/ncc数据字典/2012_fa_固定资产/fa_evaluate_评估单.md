# |<<

**评估单 (fa_evaluate / nc.vo.fa.evaluate.EvaluateHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2018.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_evaluate | 单据主键 | pk_evaluate | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_raorg | 利润中心最新版本 | pk_raorg | varchar(20) |  | 利润中心 (profitcenter) |
| 6 | pk_raorg_v | 利润中心 | pk_raorg_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 7 | pk_accbook | 资产账簿 | pk_accbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 8 | bill_code | 评估单号 | bill_code | varchar(40) |  | 字符串 (String) |
| 9 | business_date | 业务日期 | business_date | char(19) |  | 日期 (UFDate) |
| 10 | transi_type | 交易类型 | transi_type | varchar(30) |  | 字符串 (String) |
| 11 | bill_type | 单据类型 | bill_type | varchar(4) |  | 字符串 (String) |
| 12 | bill_status | 单据状态 | bill_status | int |  | 单据状态 (billstatus) |  | 0=自由态; |