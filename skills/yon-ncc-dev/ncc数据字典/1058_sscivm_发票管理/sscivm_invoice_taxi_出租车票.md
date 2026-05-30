# |<<

**出租车票 (sscivm_invoice_taxi / nc.vo.sscivm.invoice.ext.IVMInvoiceTaxiVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5550.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invoice_taxi | 主键 | pk_invoice_taxi | char(20) | √ | 主键 (UFID) |
| 2 | fpdm | 发票代码 | fpdm | varchar(50) | √ | 字符串 (String) |
| 3 | fphm | 发票号码 | fphm | varchar(50) | √ | 字符串 (String) |
| 4 | kprq | 开票日期 | kprq | char(19) | √ | 日期 (UFDate) |
| 5 | carnum | 车牌号 | carnum | varchar(20) |  | 字符串 (String) |
| 6 | mileage | 里程 | mileage | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | starttime | 上车时间 | starttime | varchar(50) |  | 字符串 (String) |
| 8 | endtime | 下车时间 | endtime | varchar(50) |  | 字符串 (String) |
| 9 | place | 发票所在地 | place | varchar(80) |  | 字符串 (String) |
| 10 | jshj | 金额 | jshj | decimal(28, 8) | √ | 数值 (UFDouble) |
| 11 | pk_invoice | 发票主键 | pk_invoice | varchar(20) |  | 发票信息主实体 (sscivm_invoice) |
| 12 | def1 | 自定义项1 | def1 | varchar(50) |  | 字符串 (String) |
| 13 | def2 | 自定义项2 | def2 | varchar(50) |  | 字符串 (String) |
| 14 | def3 | 自定义项3 | def3 | varchar(50) |  | 字符串 (String) |
| 15 | def4 | 自定义项4 | def4 | varchar(50) |  | 字符串 (String) |
| 16 | def5 | 自定义项5 | def5 | varchar(50) |  | 字符串 (String) |