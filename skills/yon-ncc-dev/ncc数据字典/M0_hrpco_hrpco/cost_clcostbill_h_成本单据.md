# |<<

**成本单据 (cost_clcostbill_h / nc.vo.hrpco.clcostbill.ClcostbillHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1603.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_clcostbill_h | 主键 | pk_clcostbill_h | char(20) | √ | 主键 (UFID) |
| 2 | totalmoney | 总金额 | totalmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 3 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 4 | accountperiod | 会计期间 | accountperiod | varchar(20) |  | 会计月份 (accperiodmonth) |
| 5 | vmemo | 备注 | vmemo | varchar(200) |  | 字符串 (String) |
| 6 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 7 | name | 姓名 | name | varchar(50) |  | 字符串 (String) |
| 8 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 9 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 10 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 11 | billno | 单据号 | billno | varchar(50) |  | 字符串 (String) |
| 12 | busitype | 业务类型 | busitype | varchar(20) |  | 业务流程 (BusitypeVO) |
| 13 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 14 | approver | 审批人 | approver | varchar(20) |  | 用户 (user) |
| 15 | approvestatus | 审批状态 | approvestatus | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |