# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8182.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billacc_detail | pk_billacc_detail | pk_billacc_detail | char(20) | √ |
| 2 | billbizdate | billbizdate | billbizdate | char(19) |
| 3 | billclass | billclass | billclass | number(38, 0) |
| 4 | billtype | billtype | billtype | varchar2(10) |
| 5 | bizsystem | bizsystem | bizsystem | varchar2(10) |
| 6 | debitmoney | debitmoney | debitmoney | number(28, 8) |
| 7 | direction | direction | direction | number(38, 0) |
| 8 | fbmbillno | fbmbillno | fbmbillno | varchar2(50) |
| 9 | glcdebitmoney | glcdebitmoney | glcdebitmoney | number(28, 8) |
| 10 | glclendermoney | glclendermoney | glclendermoney | number(28, 8) |
| 11 | glldebitmoney | glldebitmoney | glldebitmoney | number(28, 8) |
| 12 | glllendermoney | glllendermoney | glllendermoney | number(28, 8) |
| 13 | lendermoney | lendermoney | lendermoney | number(28, 8) |
| 14 | note | note | note | varchar2(181) |
| 15 | olcdebitmoney | olcdebitmoney | olcdebitmoney | number(28, 8) |
| 16 | olclendermoney | olclendermoney | olclendermoney | number(28, 8) |
| 17 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 18 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 19 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 20 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 21 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 22 | pk_register | pk_register | pk_register | char(20) |
| 23 | pk_sourcebill | pk_sourcebill | pk_sourcebill | varchar2(20) |  |  | '~' |
| 24 | sfflag | sfflag | sfflag | number(38, 0) |
| 25 | tallydate | tallydate | tallydate | char(19) |
| 26 | tallyperson | tallyperson | tallyperson | varchar2(20) |  |  | '~' |
| 27 | tallytime | tallytime | tallytime | char(19) |
| 28 | vbillno | vbillno | vbillno | varchar2(50) |
| 29 | def1 | def1 | def1 | varchar2(100) |
| 30 | def2 | def2 | def2 | varchar2(100) |
| 31 | def3 | def3 | def3 | varchar2(100) |
| 32 | def4 | def4 | def4 | varchar2(100) |
| 33 | def5 | def5 | def5 | varchar2(100) |
| 34 | def6 | def6 | def6 | varchar2(100) |
| 35 | def7 | def7 | def7 | varchar2(100) |
| 36 | def8 | def8 | def8 | varchar2(100) |
| 37 | def9 | def9 | def9 | varchar2(100) |
| 38 | def10 | def10 | def10 | varchar2(100) |
| 39 | def11 | def11 | def11 | varchar2(100) |
| 40 | def12 | def12 | def12 | varchar2(100) |
| 41 | def13 | def13 | def13 | varchar2(100) |
| 42 | def14 | def14 | def14 | varchar2(100) |
| 43 | def15 | def15 | def15 | varchar2(100) |
| 44 | def16 | def16 | def16 | varchar2(100) |
| 45 | def17 | def17 | def17 | varchar2(100) |
| 46 | def18 | def18 | def18 | varchar2(100) |
| 47 | def19 | def19 | def19 | varchar2(100) |
| 48 | def20 | def20 | def20 | varchar2(100) |
| 49 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 50 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |