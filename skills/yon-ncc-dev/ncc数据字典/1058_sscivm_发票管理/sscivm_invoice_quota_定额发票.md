# |<<

**定额发票 (sscivm_invoice_quota / nc.vo.sscivm.invoice.ext.IVMInvoiceTuotaVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5545.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invoice_quota | 主键 | pk_invoice_quota | char(20) | √ | 主键 (UFID) |
| 2 | fpdm | 发票代码 | fpdm | varchar(50) | √ | 字符串 (String) |
| 3 | fphm | 发票号码 | fphm | varchar(50) | √ | 字符串 (String) |
| 4 | jshj | 金额 | jshj | decimal(28, 8) | √ | 数值 (UFDouble) |
| 5 | productname | 商品项目名称 | productname | varchar(100) |  | 字符串 (String) |
| 6 | pk_invoice | 发票主键 | pk_invoice | varchar(20) |  | 发票信息主实体 (sscivm_invoice) |
| 7 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 8 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 9 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 10 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 11 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |