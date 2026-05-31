# |<<

**费用发票 (er_erminvoice / nc.vo.erm.erminvoice.ErmInvoice)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1888.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_erminvoice | 主键 | pk_erminvoice | char(20) | √ | 主键 (UFID) |
| 2 | fphm | 发票号码 | fphm | varchar(50) | √ | 字符串 (String) |
| 3 | fpdm | 发票代码 | fpdm | varchar(50) |  | 字符串 (String) |
| 4 | classification | 分类 | classification | varchar(50) |  | 字符串 (String) |
| 5 | fplxpk | 发票类型主键 | fplxpk | varchar(50) | √ | 发票类型 (ErmInvoiceType) |  | invoice001=增值税普通发票; |