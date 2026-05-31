# |<<

**银行回单 (obm_yhhd / nc.vo.obm.cjzfdzhd.YhhdVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3924.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_yhhd | 主键 | pk_yhhd | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | code | code | code | varchar(50) |  | 字符串 (String) |
| 6 | name | name | name | varchar(50) |  | 字符串 (String) |
| 7 | billdate | 单据日期 | billdate | char(19) |  | 日期 (UFDate) |
| 8 | maketime | 制单时间 | maketime | char(19) | √ | 日期时间 (UFDateTime) |
| 9 | lastmaketime | 最后修改时间 | lastmaketime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 11 | billno | 单据号 | billno | varchar(50) |  | 字符串 (String) |
| 12 | pkorg | 所属组织 | pkorg | varchar(50) |  | 字符串 (String) |
| 13 | busitype | 业务类型 | busitype | varchar(50) |  | 字符串 (String) |
| 14 | billmaker | 制单人 | billmaker | varchar(50) |  | 字符串 (String) |
| 15 | approver | 审批人 | approver | varchar(50) |  | 字符串 (String) |
| 16 | approvestatus | 审批状态 | approvestatus | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |