# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11818.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invoice_voucher_bill | pk_invoice_voucher_bill | pk_invoice_voucher_bill | char(20) | √ |
| 2 | billid | billid | billid | varchar2(20) |
| 3 | billno | billno | billno | varchar2(50) |
| 4 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 5 | pk_invoice | pk_invoice | pk_invoice | varchar2(20) |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | pk_tradetype | pk_tradetype | pk_tradetype | varchar2(20) |  |  | '~' |
| 8 | voucherid | voucherid | voucherid | varchar2(20) |
| 9 | voucherno | voucherno | voucherno | varchar2(50) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |