# |<<

**资金来源调整 (fa_fundsalter / nc.vo.fa.fundsalter.FundsAlterVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2022.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fundsalter | 主键 | pk_fundsalter | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | pk_accbook | 资产账簿 | pk_accbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 6 | altervalue | 本币调整金额合计 | altervalue | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | billno | 单据号 | billno | varchar(50) |  | 字符串 (String) |
| 8 | billdate | 单据日期 | billdate | char(19) |  | 日期 (UFDate) |
| 9 | busitype | 业务类型 | busitype | varchar(20) |  | 业务流程 (BusitypeVO) |
| 10 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 11 | approver | 审批人 | approver | varchar(20) |  | 用户 (user) |
| 12 | approvestatus | 审批状态 | approvestatus | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |