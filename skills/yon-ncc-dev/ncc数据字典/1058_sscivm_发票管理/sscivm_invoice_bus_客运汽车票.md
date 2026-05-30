# |<<

**客运汽车票 (sscivm_invoice_bus / nc.vo.sscivm.invoice.ext.IVMInvoiceBusVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5544.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invoice_bus | 主键 | pk_invoice_bus | char(20) | √ | 主键 (UFID) |
| 2 | fpdm | 发票代码 | fpdm | varchar(50) | √ | 字符串 (String) |
| 3 | fphm | 发票号码 | fphm | varchar(50) | √ | 字符串 (String) |
| 4 | kprq | 乘车日期 | kprq | char(19) | √ | 日期 (UFDate) |
| 5 | origin | 出发 | origin | varchar(50) |  | 字符串 (String) |
| 6 | destination | 到达 | destination | varchar(50) |  | 字符串 (String) |
| 7 | name | 乘车人姓名 | name | varchar(30) |  | 字符串 (String) |
| 8 | hjje | 不含税金额 | hjje | decimal(28, 8) | √ | 数值 (UFDouble) |
| 9 | hjse | 税额 | hjse | decimal(28, 8) | √ | 数值 (UFDouble) |
| 10 | jshj | 价税合计 | jshj | decimal(28, 8) | √ | 数值 (UFDouble) |
| 11 | pk_invoice | 发票主键 | pk_invoice | varchar(20) |  | 发票信息主实体 (sscivm_invoice) |
| 12 | def1 | 自定义项1 | def1 | varchar(50) |  | 字符串 (String) |
| 13 | def2 | 自定义项2 | def2 | varchar(50) |  | 字符串 (String) |
| 14 | def3 | 自定义项3 | def3 | varchar(50) |  | 字符串 (String) |
| 15 | def4 | 自定义项4 | def4 | varchar(50) |  | 字符串 (String) |
| 16 | def5 | 自定义项5 | def5 | varchar(50) |  | 字符串 (String) |