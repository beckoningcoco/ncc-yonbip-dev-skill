# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10749.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_compareresult | pk_compareresult | pk_compareresult | char(20) | √ |
| 2 | dinvoicedate | dinvoicedate | dinvoicedate | char(19) |
| 3 | ncollectnum | ncollectnum | ncollectnum | number(28, 8) |
| 4 | ninvoicenum | ninvoicenum | ninvoicenum | number(28, 8) |
| 5 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 6 | srcbid | srcbid | srcbid | varchar2(50) |
| 7 | srcbillcode | srcbillcode | srcbillcode | varchar2(50) |
| 8 | srcid | srcid | srcid | varchar2(50) |
| 9 | srcrowno | srcrowno | srcrowno | varchar2(50) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |