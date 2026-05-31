# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10756.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invoicerecord | pk_invoicerecord | pk_invoicerecord | char(20) | √ |
| 2 | id | id | id | char(20) |
| 3 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 4 | recorddate | recorddate | recorddate | char(19) |
| 5 | recorder | recorder | recorder | varchar2(20) |  |  | '~' |
| 6 | recordername | recordername | recordername | varchar2(50) |
| 7 | totalnastnum | totalnastnum | totalnastnum | number(28, 8) |
| 8 | totaltaxmny | totaltaxmny | totaltaxmny | number(28, 8) |
| 9 | vbillcode | vbillcode | vbillcode | varchar2(50) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |