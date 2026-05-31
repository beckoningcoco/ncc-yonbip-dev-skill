# |<<

**航空客票明细 (sscivm_invoice_airdetail / nc.vo.sscivm.invoice.ext.IVMInvoiceAirDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5543.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invoice_airdetail | 主键 | pk_invoice_airdetail | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | int | √ | 整数 (Integer) |
| 3 | origin | 出发 | origin | varchar(50) |  | 字符串 (String) |
| 4 | destination | 到达 | destination | varchar(50) |  | 字符串 (String) |
| 5 | flightnumber | 航班号 | flightnumber | varchar(20) |  | 字符串 (String) |
| 6 | kprq | 乘机日期 | kprq | char(19) |  | 日期 (UFDate) |
| 7 | seat | 仓位 | seat | varchar(20) |  | 字符串 (String) |
| 8 | carrier | 承运人 | carrier | varchar(30) |  | 字符串 (String) |
| 9 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 10 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 11 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 12 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 13 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |