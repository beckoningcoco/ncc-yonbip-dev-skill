# |<<

**薪资发放申请单 (wa_payroll / nc.vo.wa.payroll.PayrollVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6339.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_payroll | 薪资发放申请单主键 | pk_payroll | char(20) | √ | 主键 (UFID) |
| 2 | pk_payroll | 薪资发放申请单主键 | pk_payroll | char(20) | √ | 主键 (UFID) |
| 3 | billcode | 申请单编码 | billcode | varchar(30) |  | 字符串 (String) |
| 4 | billname | 申请单名称 | billname | varchar(50) |  | 字符串 (String) |
| 5 | operator | 申请人 | operator | varchar(20) |  | 用户 (user) |
| 6 | applydate | 申请日期 | applydate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 7 | approver | 审批人 | approver | varchar(20) |  | 用户 (user) |
| 8 | approvedate | 审批日期 | approvedate | char(19) |  | 日期时间 (UFDateTime) |
| 9 | billstate | 单据状态 | billstate | int |  | 单据状态 (billStateEnum) |  | -1=自由; |