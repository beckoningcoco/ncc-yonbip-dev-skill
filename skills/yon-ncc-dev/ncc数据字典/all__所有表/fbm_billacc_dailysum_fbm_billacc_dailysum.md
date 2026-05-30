# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8181.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dailysum | pk_dailysum | pk_dailysum | varchar2(20) | √ |
| 2 | billclass | billclass | billclass | number(38, 0) |
| 3 | debitsum | debitsum | debitsum | number(28, 8) |
| 4 | direction | direction | direction | number(38, 0) |
| 5 | glcdebitsum | glcdebitsum | glcdebitsum | number(28, 8) |
| 6 | glclendersum | glclendersum | glclendersum | number(28, 8) |
| 7 | glldebitsum | glldebitsum | glldebitsum | number(28, 8) |
| 8 | glllendersum | glllendersum | glllendersum | number(28, 8) |
| 9 | lendersum | lendersum | lendersum | number(28, 8) |
| 10 | olcdebitsum | olcdebitsum | olcdebitsum | number(28, 8) |
| 11 | olclendersum | olclendersum | olclendersum | number(28, 8) |
| 12 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 13 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 14 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 16 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 17 | tallydate | tallydate | tallydate | char(19) |
| 18 | def1 | def1 | def1 | varchar2(100) |
| 19 | def2 | def2 | def2 | varchar2(100) |
| 20 | def3 | def3 | def3 | varchar2(100) |
| 21 | def4 | def4 | def4 | varchar2(100) |
| 22 | def5 | def5 | def5 | varchar2(100) |
| 23 | def6 | def6 | def6 | varchar2(100) |
| 24 | def7 | def7 | def7 | varchar2(100) |
| 25 | def8 | def8 | def8 | varchar2(100) |
| 26 | def9 | def9 | def9 | varchar2(100) |
| 27 | def10 | def10 | def10 | varchar2(100) |
| 28 | def11 | def11 | def11 | varchar2(100) |
| 29 | def12 | def12 | def12 | varchar2(100) |
| 30 | def13 | def13 | def13 | varchar2(100) |
| 31 | def14 | def14 | def14 | varchar2(100) |
| 32 | def15 | def15 | def15 | varchar2(100) |
| 33 | def16 | def16 | def16 | varchar2(100) |
| 34 | def17 | def17 | def17 | varchar2(100) |
| 35 | def18 | def18 | def18 | varchar2(100) |
| 36 | def19 | def19 | def19 | varchar2(100) |
| 37 | def20 | def20 | def20 | varchar2(100) |
| 38 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 39 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |