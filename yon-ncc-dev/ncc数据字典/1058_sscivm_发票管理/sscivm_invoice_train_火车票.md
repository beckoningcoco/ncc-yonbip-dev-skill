# |<<

**火车票 (sscivm_invoice_train / nc.vo.sscivm.invoice.ext.IVMInvoiceTrainVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5551.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invoice_train | 主键 | pk_invoice_train | char(20) | √ | 主键 (UFID) |
| 2 | fphm | 火车票号 | fphm | varchar(50) | √ | 字符串 (String) |
| 3 | kprq | 乘车日期 | kprq | char(19) | √ | 日期 (UFDate) |
| 4 | trainnum | 车次 | trainnum | varchar(50) |  | 字符串 (String) |
| 5 | origin | 出发 | origin | varchar(50) |  | 字符串 (String) |
| 6 | destination | 到达 | destination | varchar(50) |  | 字符串 (String) |
| 7 | trainlevel | 席位 | trainlevel | varchar(20) |  | 字符串 (String) |
| 8 | seatno | 座位号 | seatno | varchar(20) |  | 字符串 (String) |
| 9 | name | 乘车人姓名 | name | varchar(30) |  | 字符串 (String) |
| 10 | hjje | 不含税金额 | hjje | decimal(28, 8) | √ | 数值 (UFDouble) |
| 11 | hjse | 税额 | hjse | decimal(28, 8) | √ | 数值 (UFDouble) |
| 12 | jshj | 价税合计 | jshj | decimal(28, 8) | √ | 数值 (UFDouble) |
| 13 | pk_invoice | 发票主键 | pk_invoice | varchar(20) |  | 发票信息主实体 (sscivm_invoice) |
| 14 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 15 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |