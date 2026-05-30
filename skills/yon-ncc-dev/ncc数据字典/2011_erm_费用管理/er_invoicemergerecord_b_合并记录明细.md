# |<<

**合并记录明细 (er_invoicemergerecord_b / nc.vo.erm.invoicemergerecord.InvoiceMergeRecordDetail)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1903.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invoicemergerecord_b | 明细主键 | pk_invoicemergerecord_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_erminvoice | 费用发票 | pk_erminvoice | varchar(20) |  | 费用发票 (ErmInvoice) |
| 3 | pk_erminvoice_b | 费用发票明细 | pk_erminvoice_b | varchar(50) |  | 字符串 (String) |