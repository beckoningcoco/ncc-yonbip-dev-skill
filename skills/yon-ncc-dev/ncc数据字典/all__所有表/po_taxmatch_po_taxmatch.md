# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10804.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taxmatch | pk_taxmatch | pk_taxmatch | char(20) | √ |
| 2 | cgeneralbid | cgeneralbid | cgeneralbid | varchar2(20) |
| 3 | cgenerallid | cgenerallid | cgenerallid | varchar2(20) |
| 4 | nmatchmny | nmatchmny | nmatchmny | number(28, 8) |
| 5 | nmatchnum | nmatchnum | nmatchnum | number(28, 8) |
| 6 | nprice | nprice | nprice | number(28, 8) |
| 7 | nreasonwastenum | nreasonwastenum | nreasonwastenum | number(28, 8) |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_invoice | pk_invoice | pk_invoice | varchar2(20) |
| 10 | pk_invoice_b | pk_invoice_b | pk_invoice_b | varchar2(20) |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |
| 13 | pk_taxinvoice | pk_taxinvoice | pk_taxinvoice | varchar2(20) |
| 14 | pk_taxinvoice_b | pk_taxinvoice_b | pk_taxinvoice_b | varchar2(20) |
| 15 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 16 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 17 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 18 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 19 | vinvcode | vinvcode | vinvcode | varchar2(20) |
| 20 | vinvnum | vinvnum | vinvnum | varchar2(20) |
| 21 | vinvoicebillcode | vinvoicebillcode | vinvoicebillcode | varchar2(40) |
| 22 | vstockbillcode | vstockbillcode | vstockbillcode | varchar2(40) |
| 23 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |