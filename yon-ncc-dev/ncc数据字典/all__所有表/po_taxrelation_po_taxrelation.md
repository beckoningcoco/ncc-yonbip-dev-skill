# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10805.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ctaxrelationid | ctaxrelationid | ctaxrelationid | char(20) | √ |
| 2 | cbillid | cbillid | cbillid | char(20) |
| 3 | cbill_bid | cbill_bid | cbill_bid | char(20) |
| 4 | cinvmatchid | cinvmatchid | cinvmatchid | char(20) |
| 5 | crelationbid | crelationbid | crelationbid | char(20) |
| 6 | crelationid | crelationid | crelationid | char(20) |
| 7 | dbilldate | dbilldate | dbilldate | char(19) |
| 8 | nmny | nmny | nmny | number(28, 8) |
| 9 | ntax | ntax | ntax | number(28, 8) |
| 10 | ntaxmny | ntaxmny | ntaxmny | number(28, 8) |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | pk_invoice | pk_invoice | pk_invoice | char(20) |
| 13 | pk_invoice_b | pk_invoice_b | pk_invoice_b | char(20) |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | vbillcode | vbillcode | vbillcode | varchar2(40) |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |