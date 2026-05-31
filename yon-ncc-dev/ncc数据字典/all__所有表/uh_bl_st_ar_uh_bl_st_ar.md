# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12414.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_star | pk_star | pk_star | char(20) | √ |
| 2 | amt_ar | amt_ar | amt_ar | number(14, 2) |
| 3 | amt_pay | amt_pay | amt_pay | number(14, 2) |
| 4 | en_direct | en_direct | en_direct | number(38, 0) |
| 5 | eu_direct | eu_direct | eu_direct | number(38, 0) |
| 6 | flag_cl | flag_cl | flag_cl | char(1) |
| 7 | note | note | note | varchar2(256) |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_hp | pk_hp | pk_hp | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | pk_st | pk_st | pk_st | varchar2(20) |  |  | '~' |
| 12 | reason_ar | reason_ar | reason_ar | varchar2(256) |
| 13 | def1 | def1 | def1 | varchar2(101) |
| 14 | def2 | def2 | def2 | varchar2(101) |
| 15 | def3 | def3 | def3 | varchar2(101) |
| 16 | def4 | def4 | def4 | varchar2(101) |
| 17 | def5 | def5 | def5 | varchar2(101) |
| 18 | def6 | def6 | def6 | varchar2(101) |
| 19 | def7 | def7 | def7 | varchar2(101) |
| 20 | def8 | def8 | def8 | varchar2(101) |
| 21 | def9 | def9 | def9 | varchar2(101) |
| 22 | def10 | def10 | def10 | varchar2(101) |
| 23 | def11 | def11 | def11 | varchar2(101) |
| 24 | def12 | def12 | def12 | varchar2(101) |
| 25 | def13 | def13 | def13 | varchar2(101) |
| 26 | def14 | def14 | def14 | varchar2(101) |
| 27 | def15 | def15 | def15 | varchar2(101) |
| 28 | def16 | def16 | def16 | varchar2(101) |
| 29 | def17 | def17 | def17 | varchar2(101) |
| 30 | def18 | def18 | def18 | varchar2(101) |
| 31 | def19 | def19 | def19 | varchar2(101) |
| 32 | def20 | def20 | def20 | varchar2(101) |
| 33 | creationtime | creationtime | creationtime | char(19) |
| 34 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 35 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 36 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 37 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 38 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |