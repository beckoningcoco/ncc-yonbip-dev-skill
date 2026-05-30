# |<<

**稽核明细 (er_erminvoicecheck_b / nc.vo.erm.erminvoicecheck.ErmInvoiceCheckDetail)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1890.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_erminvoicecheck_b | 明细主键 | pk_erminvoicecheck_b | char(20) | √ | 主键 (UFID) |
| 2 | checkattr | 稽核维度 | checkattr | varchar(150) |  | 字符串 (String) |
| 3 | checkattrname | 稽核维度名称 | checkattrname | varchar(200) |  | 字符串 (String) |
| 4 | billattrvalue | 原始发票维度值 | billattrvalue | varchar(500) |  | 字符串 (String) |
| 5 | receiveattrvalue | 收单发票维度值 | receiveattrvalue | varchar(500) |  | 字符串 (String) |
| 6 | ismatch | 是否一致 | ismatch | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | checkresult | 维度比对结果 | checkresult | varchar(2000) |  | 字符串 (String) |
| 8 | pk_erminvoice | 所属发票 | pk_erminvoice | varchar(50) |  | 字符串 (String) |
| 9 | invoiceuniquecode | 唯一标识字符 | invoiceuniquecode | varchar(200) |  | 字符串 (String) |
| 10 | defitem10 | 自定义项10 | defitem10 | varchar(101) |  | 自定义项 (Custom) |
| 11 | defitem9 | 自定义项9 | defitem9 | varchar(101) |  | 自定义项 (Custom) |
| 12 | defitem8 | 自定义项8 | defitem8 | varchar(101) |  | 自定义项 (Custom) |
| 13 | defitem7 | 自定义项7 | defitem7 | varchar(101) |  | 自定义项 (Custom) |
| 14 | defitem6 | 自定义项6 | defitem6 | varchar(101) |  | 自定义项 (Custom) |
| 15 | defitem5 | 自定义项5 | defitem5 | varchar(101) |  | 自定义项 (Custom) |
| 16 | defitem4 | 自定义项4 | defitem4 | varchar(101) |  | 自定义项 (Custom) |
| 17 | defitem3 | 自定义项3 | defitem3 | varchar(101) |  | 自定义项 (Custom) |
| 18 | defitem2 | 自定义项2 | defitem2 | varchar(101) |  | 自定义项 (Custom) |
| 19 | defitem1 | 自定义项1 | defitem1 | varchar(101) |  | 自定义项 (Custom) |