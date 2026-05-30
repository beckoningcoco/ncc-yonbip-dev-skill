# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11812.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_relation | pk_relation | pk_relation | char(20) | √ |
| 2 | amount | amount | amount | number(28, 8) |
| 3 | billid | billid | billid | varchar2(50) |
| 4 | billno | billno | billno | varchar2(50) |
| 5 | billtype | billtype | billtype | varchar2(50) |
| 6 | fpdm | fpdm | fpdm | varchar2(50) |
| 7 | fphm | fphm | fphm | varchar2(50) |
| 8 | invoiceamount | invoiceamount | invoiceamount | number(28, 8) |
| 9 | je | je | je | number(28, 8) |
| 10 | pk_invoice | pk_invoice | pk_invoice | varchar2(50) |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | se | se | se | number(28, 8) |
| 13 | tradetype | tradetype | tradetype | varchar2(20) |  |  | '~' |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |