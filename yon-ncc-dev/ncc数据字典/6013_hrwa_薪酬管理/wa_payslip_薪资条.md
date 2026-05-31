# |<<

**薪资条 (wa_payslip / nc.vo.wa.payslip.PayslipVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6341.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_payslip | 薪资条主键 | pk_payslip | char(20) | √ | 主键 (UFID) |
| 2 | title | 主题 | title | varchar(500) |  | 字符串 (String) |
| 3 | tail | 表尾 | tail | varchar(500) |  | 字符串 (String) |
| 4 | type | 发送方式 | type | int | √ | 发送方式 (SendTypeEnum) |  | 1=邮件; |