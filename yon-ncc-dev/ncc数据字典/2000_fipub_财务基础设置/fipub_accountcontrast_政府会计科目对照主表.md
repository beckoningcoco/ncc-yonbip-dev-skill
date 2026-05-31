# |<<

**政府会计科目对照主表 (fipub_accountcontrast / nc.vo.fipub.accountcontrast.AccountContrastHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2264.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accountcontrast | 主键 | pk_accountcontrast | char(20) | √ | 主键 (UFID) |
| 2 | billid | 单据ID | billid | varchar(50) |  | 字符串 (String) |
| 3 | billno | 单据号 | billno | varchar(50) |  | 字符串 (String) |
| 4 | pkorg | 所属组织 | pkorg | varchar(50) |  | 字符串 (String) |
| 5 | busitype | 业务类型 | busitype | varchar(50) |  | 字符串 (String) |
| 6 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 7 | approver | 审批人 | approver | varchar(20) |  | 用户 (user) |
| 8 | approvestatus | 审批状态 | approvestatus | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |