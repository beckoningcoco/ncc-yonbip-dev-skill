# |<<

**航空客票 (sscivm_invoice_air / nc.vo.sscivm.invoice.ext.IVMInvoiceAirVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5542.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invoice_air | 主键 | pk_invoice_air | char(20) | √ | 主键 (UFID) |
| 2 | kprq | 填开日期 | kprq | char(19) | √ | 日期 (UFDate) |
| 3 | fphm | 电子客票号码 | fphm | varchar(50) | √ | 字符串 (String) |
| 4 | checkcode | 验证码 | checkcode | varchar(20) |  | 字符串 (String) |
| 5 | agentcode | 销售单位代码 | agentcode | varchar(20) |  | 字符串 (String) |
| 6 | issueby | 填开单位 | issueby | varchar(80) |  | 字符串 (String) |
| 7 | fare | 票夹 | fare | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | tax | 税费 | tax | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | fuelsurcharge | 燃油附加费 | fuelsurcharge | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | caacdevelopfund | 民航发展基金 | caacdevelopfund | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | insurance | 保险费 | insurance | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | hjje | 不含税金额 | hjje | decimal(28, 8) | √ | 数值 (UFDouble) |
| 13 | hjse | 税额 | hjse | decimal(28, 8) | √ | 数值 (UFDouble) |
| 14 | jshj | 价税合计 | jshj | decimal(28, 8) | √ | 数值 (UFDouble) |
| 15 | username | 乘机人姓名 | username | varchar(30) |  | 字符串 (String) |
| 16 | useridcard | 身份证号 | useridcard | varchar(50) |  | 字符串 (String) |
| 17 | pk_invoice | 发票主键 | pk_invoice | varchar(20) |  | 发票信息主实体 (sscivm_invoice) |
| 18 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |