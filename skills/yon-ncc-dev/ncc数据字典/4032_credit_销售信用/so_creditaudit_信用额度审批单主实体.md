# |<<

**信用额度审批单主实体 (so_creditaudit / nc.vo.credit.creditaudit.entity.CreditAuditHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5393.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ccreditauditid | 信用额度审批单 | ccreditauditid | char(20) | √ | 主键 (UFID) |
| 2 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 3 | pk_org | 信用控制域 | pk_org | varchar(20) | √ | 组织_信用控制域 (creditctlregion) |
| 4 | dbilldate | 单据日期 | dbilldate | char(19) | √ | 日期 (UFDate) |
| 5 | fstatusflag | 单据状态 | fstatusflag | int |  | 单据状态 (fstatusfalg) |  | 1=自由; |