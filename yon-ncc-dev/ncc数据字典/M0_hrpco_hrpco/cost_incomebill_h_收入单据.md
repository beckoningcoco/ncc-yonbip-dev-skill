# |<<

**收入单据 (cost_incomebill_h / nc.vo.hrpco.incomebill.CostIncomebillHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1619.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_incomebill_h | 主键 | pk_incomebill_h | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | billid | 单据ID | billid | varchar(50) |  | 字符串 (String) |
| 6 | billno | 单据号 | billno | varchar(50) |  | 字符串 (String) |
| 7 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 8 | pkorg | 所属组织 | pkorg | varchar(50) |  | 字符串 (String) |
| 9 | busitype | 业务类型 | busitype | varchar(50) |  | 字符串 (String) |
| 10 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 11 | approver | 审批人 | approver | varchar(20) |  | 用户 (user) |
| 12 | approvestatus | 审批状态 | approvestatus | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |