# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6613.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billacc_detail | pk_billacc_detail | pk_billacc_detail | char(20) | √ |
| 2 | beginbalance | beginbalance | beginbalance | number(28, 8) |
| 3 | billaccbalance | billaccbalance | billaccbalance | number(28, 8) |
| 4 | billbizdate | billbizdate | billbizdate | char(19) |
| 5 | billclass | billclass | billclass | number(38, 0) |
| 6 | billtype | billtype | billtype | varchar2(10) |
| 7 | bizsystem | bizsystem | bizsystem | varchar2(50) |
| 8 | debitmoney | debitmoney | debitmoney | number(28, 8) |
| 9 | direction | direction | direction | number(38, 0) |
| 10 | endbalance | endbalance | endbalance | number(28, 8) |
| 11 | fbmbillno | fbmbillno | fbmbillno | varchar2(50) |
| 12 | glcbeginbalance | glcbeginbalance | glcbeginbalance | number(28, 8) |
| 13 | glcbillaccbalance | glcbillaccbalance | glcbillaccbalance | number(28, 8) |
| 14 | glcdebitmoney | glcdebitmoney | glcdebitmoney | number(28, 8) |
| 15 | glcendbalance | glcendbalance | glcendbalance | number(28, 8) |
| 16 | glclendermoney | glclendermoney | glclendermoney | number(28, 8) |
| 17 | gllbeginbalance | gllbeginbalance | gllbeginbalance | number(28, 8) |
| 18 | gllbillaccbalance | gllbillaccbalance | gllbillaccbalance | number(28, 8) |
| 19 | glldebitmoney | glldebitmoney | glldebitmoney | number(28, 8) |
| 20 | gllendbalance | gllendbalance | gllendbalance | number(28, 8) |
| 21 | glllendermoney | glllendermoney | glllendermoney | number(28, 8) |
| 22 | lendermoney | lendermoney | lendermoney | number(28, 8) |
| 23 | note | note | note | varchar2(50) |
| 24 | olcbeginbalance | olcbeginbalance | olcbeginbalance | number(28, 8) |
| 25 | olcbillaccbalance | olcbillaccbalance | olcbillaccbalance | number(28, 8) |
| 26 | olcdebitmoney | olcdebitmoney | olcdebitmoney | number(28, 8) |
| 27 | olcendbalance | olcendbalance | olcendbalance | number(28, 8) |
| 28 | olclendermoney | olclendermoney | olclendermoney | number(28, 8) |
| 29 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 30 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 31 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 32 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 33 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 34 | pk_sourcebill | pk_sourcebill | pk_sourcebill | varchar2(50) |  |  | '~' |
| 35 | sfflag | sfflag | sfflag | number(38, 0) |
| 36 | tallydate | tallydate | tallydate | char(19) |
| 37 | tallyperson | tallyperson | tallyperson | varchar2(20) |  |  | '~' |
| 38 | tallytime | tallytime | tallytime | char(19) |
| 39 | vbillno | vbillno | vbillno | varchar2(50) |
| 40 | voucherno | voucherno | voucherno | varchar2(50) |
| 41 | def1 | def1 | def1 | varchar2(101) |
| 42 | def2 | def2 | def2 | varchar2(101) |
| 43 | def3 | def3 | def3 | varchar2(101) |
| 44 | def4 | def4 | def4 | varchar2(101) |
| 45 | def5 | def5 | def5 | varchar2(101) |
| 46 | def6 | def6 | def6 | varchar2(101) |
| 47 | def7 | def7 | def7 | varchar2(101) |
| 48 | def8 | def8 | def8 | varchar2(101) |
| 49 | def9 | def9 | def9 | varchar2(101) |
| 50 | def10 | def10 | def10 | varchar2(101) |
| 51 | def11 | def11 | def11 | varchar2(101) |
| 52 | def12 | def12 | def12 | varchar2(101) |
| 53 | def13 | def13 | def13 | varchar2(101) |
| 54 | def14 | def14 | def14 | varchar2(101) |
| 55 | def15 | def15 | def15 | varchar2(101) |
| 56 | def16 | def16 | def16 | varchar2(101) |
| 57 | def17 | def17 | def17 | varchar2(101) |
| 58 | def18 | def18 | def18 | varchar2(101) |
| 59 | def19 | def19 | def19 | varchar2(101) |
| 60 | def120 | def120 | def120 | varchar2(101) |
| 61 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 62 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |