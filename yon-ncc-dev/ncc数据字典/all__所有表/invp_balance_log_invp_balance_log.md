# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9244.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_balancelog | pk_balancelog | pk_balancelog | char(20) | √ |
| 2 | cdownbillbid | cdownbillbid | cdownbillbid | varchar2(50) |
| 3 | cdownbillid | cdownbillid | cdownbillid | varchar2(50) |
| 4 | cdownbilltypecode | cdownbilltypecode | cdownbilltypecode | varchar2(20) |  |  | '~' |
| 5 | cdowntranstype | cdowntranstype | cdowntranstype | varchar2(20) |  |  | '~' |
| 6 | csummarydate | csummarydate | csummarydate | char(19) |
| 7 | csummarypsn | csummarypsn | csummarypsn | varchar2(20) |  |  | '~' |
| 8 | ctransbillbid | ctransbillbid | ctransbillbid | varchar2(50) |
| 9 | ctransbillid | ctransbillid | ctransbillid | varchar2(50) |
| 10 | ctransbilltypecode | ctransbilltypecode | ctransbilltypecode | varchar2(20) |  |  | '~' |
| 11 | ctranstranstype | ctranstranstype | ctranstranstype | varchar2(20) |  |  | '~' |
| 12 | nnetnum | nnetnum | nnetnum | number(28, 8) |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 16 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 17 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 18 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 19 | src_billbid | src_billbid | src_billbid | varchar2(20) |
| 20 | src_billcode | src_billcode | src_billcode | varchar2(20) |
| 21 | src_billid | src_billid | src_billid | varchar2(20) |
| 22 | src_rowno | src_rowno | src_rowno | varchar2(40) |
| 23 | vdownbillcode | vdownbillcode | vdownbillcode | varchar2(50) |
| 24 | vdownrowno | vdownrowno | vdownrowno | varchar2(50) |
| 25 | vtransbillcode | vtransbillcode | vtransbillcode | varchar2(50) |
| 26 | vtransrowno | vtransrowno | vtransrowno | varchar2(50) |
| 27 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 28 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |