# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8705.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_drug | pk_drug | pk_drug | char(20) | √ |
| 2 | barcode | barcode | barcode | varchar2(50) |
| 3 | code | code | code | varchar2(50) |
| 4 | costprice | costprice | costprice | number(28, 8) |
| 5 | enablestate | enablestate | enablestate | char(1) |
| 6 | mnemonic | mnemonic | mnemonic | varchar2(50) |
| 7 | name | name | name | varchar2(50) |
| 8 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 9 | pk_measdoc | pk_measdoc | pk_measdoc | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 12 | rowno | rowno | rowno | varchar2(50) |
| 13 | standards | standards | standards | varchar2(50) |
| 14 | syscode | syscode | syscode | varchar2(20) |  |  | '~' |
| 15 | type | type | type | varchar2(50) |
| 16 | def1 | def1 | def1 | varchar2(200) |
| 17 | def2 | def2 | def2 | varchar2(200) |
| 18 | def3 | def3 | def3 | varchar2(200) |
| 19 | def4 | def4 | def4 | varchar2(200) |
| 20 | def5 | def5 | def5 | varchar2(200) |
| 21 | def6 | def6 | def6 | varchar2(200) |
| 22 | def7 | def7 | def7 | varchar2(200) |
| 23 | def8 | def8 | def8 | varchar2(200) |
| 24 | def9 | def9 | def9 | varchar2(200) |
| 25 | def10 | def10 | def10 | varchar2(200) |
| 26 | def11 | def11 | def11 | number(28, 8) |
| 27 | def12 | def12 | def12 | number(28, 8) |
| 28 | def13 | def13 | def13 | number(28, 8) |
| 29 | def14 | def14 | def14 | number(28, 8) |
| 30 | def15 | def15 | def15 | number(28, 8) |
| 31 | def16 | def16 | def16 | number(28, 8) |
| 32 | def17 | def17 | def17 | number(28, 8) |
| 33 | def18 | def18 | def18 | number(28, 8) |
| 34 | def19 | def19 | def19 | number(28, 8) |
| 35 | def20 | def20 | def20 | number(28, 8) |
| 36 | creationtime | creationtime | creationtime | char(19) |
| 37 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 38 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 39 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 40 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 41 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |