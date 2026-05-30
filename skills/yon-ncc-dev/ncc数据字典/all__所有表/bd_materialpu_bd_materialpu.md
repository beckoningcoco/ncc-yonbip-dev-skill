# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6995.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_materialpu | pk_materialpu | pk_materialpu | char(20) | √ |
| 2 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 3 | isinquirebyfactory | isinquirebyfactory | isinquirebyfactory | char(1) |  |  | 'N' |
| 4 | isinquirebyqltylevel | isinquirebyqltylevel | isinquirebyqltylevel | char(1) |  |  | 'N' |
| 5 | isinquirebyrectarea | isinquirebyrectarea | isinquirebyrectarea | char(1) |  |  | 'N' |
| 6 | isinquirebysupplier | isinquirebysupplier | isinquirebysupplier | char(1) |  |  | 'N' |
| 7 | isinquirebytranstype | isinquirebytranstype | isinquirebytranstype | char(1) |  |  | 'N' |
| 8 | isnoconallowed | isnoconallowed | isnoconallowed | char(1) |  |  | 'Y' |
| 9 | isselfapprsupplier | isselfapprsupplier | isselfapprsupplier | char(1) |  |  | 'Y' |
| 10 | maxprice | maxprice | maxprice | number(20, 8) |  |  | 0.00 |
| 11 | pebegin | pebegin | pebegin | char(19) |
| 12 | peend | peend | peend | char(19) |
| 13 | pk_cumandoc | pk_cumandoc | pk_cumandoc | varchar2(20) |  |  | '~' |
| 14 | pk_group | pk_group | pk_group | char(20) | √ |
| 15 | pk_material | pk_material | pk_material | char(20) | √ |
| 16 | pk_org | pk_org | pk_org | char(20) | √ |
| 17 | purchasestge | purchasestge | purchasestge | number(38, 0) |
| 18 | def1 | def1 | def1 | varchar2(101) |
| 19 | def2 | def2 | def2 | varchar2(101) |
| 20 | def3 | def3 | def3 | varchar2(101) |
| 21 | def4 | def4 | def4 | varchar2(101) |
| 22 | def5 | def5 | def5 | varchar2(101) |
| 23 | def6 | def6 | def6 | varchar2(101) |
| 24 | def7 | def7 | def7 | varchar2(101) |
| 25 | def8 | def8 | def8 | varchar2(101) |
| 26 | def9 | def9 | def9 | varchar2(101) |
| 27 | def10 | def10 | def10 | varchar2(101) |
| 28 | def11 | def11 | def11 | varchar2(101) |
| 29 | def12 | def12 | def12 | varchar2(101) |
| 30 | def13 | def13 | def13 | varchar2(101) |
| 31 | def14 | def14 | def14 | varchar2(101) |
| 32 | def15 | def15 | def15 | varchar2(101) |
| 33 | def16 | def16 | def16 | varchar2(101) |
| 34 | def17 | def17 | def17 | varchar2(101) |
| 35 | def18 | def18 | def18 | varchar2(101) |
| 36 | def19 | def19 | def19 | varchar2(101) |
| 37 | def20 | def20 | def20 | varchar2(101) |
| 38 | creationtime | creationtime | creationtime | char(19) |
| 39 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 40 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 41 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 42 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 43 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |