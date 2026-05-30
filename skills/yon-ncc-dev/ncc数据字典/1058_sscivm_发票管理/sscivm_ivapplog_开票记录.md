# |<<

**开票记录 (sscivm_ivapplog / nc.vo.sscivm.ivsale.IVApplogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5556.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ivapplog | 主键 | pk_ivapplog | char(20) | √ | 主键 (UFID) |
| 2 | fpqqlsh | 发票请求流水号 | fpqqlsh | varchar(50) | √ | 字符串 (String) |
| 3 | code | 开票信息码 | code | varchar(50) |  | 字符串 (String) |
| 4 | errmsg | 开票失败信息 | errmsg | varchar(255) |  | 字符串 (String) |
| 5 | shareurl | 发票提取url | shareurl | varchar(255) |  | 字符串 (String) |
| 6 | sharecode | 发票提取码 | sharecode | varchar(255) |  | 字符串 (String) |
| 7 | invoice_type | 发票类型 | invoice_type | varchar(10) |  | 发票类型 (invoicetype) |  | 1=增值税电子普通发票; |