# |<<

**减少单 (fa_reduce / nc.vo.fa.reduce.ReduceHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2055.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reduce | 减少单标识 | pk_reduce | char(20) | √ | 主键 (UFID) |
| 2 | bill_code | 减少单号 | bill_code | varchar(40) |  | 字符串 (String) |
| 3 | pk_org | 财务组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_raorg | 利润中心最新版本 | pk_raorg | varchar(20) |  | 利润中心 (profitcenter) |
| 6 | pk_raorg_v | 利润中心 | pk_raorg_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 7 | pk_accbook | 资产账簿 | pk_accbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 8 | pk_accbook_scale | 账簿精度字段 | pk_accbook_scale | varchar(50) |  | 字符串 (String) |
| 9 | business_date | 业务日期 | business_date | char(19) |  | 日期 (UFDate) |
| 10 | bill_status | 单据状态 | bill_status | int |  | 单据状态 (billstatus) |  | 0=自由态; |