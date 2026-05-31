# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7893.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_route_summary | pk_route_summary | pk_route_summary | char(20) | √ |
| 2 | coordinate | coordinate | coordinate | varchar2(100) |
| 3 | coordinate_desc | coordinate_desc | coordinate_desc | varchar2(200) |
| 4 | memo | memo | memo | varchar2(200) |
| 5 | pk_equip | pk_equip | pk_equip | varchar2(20) |  |  | '~' |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_location | pk_location | pk_location | varchar2(20) |  |  | '~' |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 9 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 10 | pk_route | pk_route | pk_route | char(20) | √ |
| 11 | pk_standard | pk_standard | pk_standard | varchar2(20) |  |  | '~' |
| 12 | sequence_num | sequence_num | sequence_num | number(38, 0) |
| 13 | src_bill_type | src_bill_type | src_bill_type | varchar2(4) |
| 14 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(20) |
| 15 | src_pk_bill_b | src_pk_bill_b | src_pk_bill_b | varchar2(20) |
| 16 | src_pk_transitype | src_pk_transitype | src_pk_transitype | varchar2(20) |  |  | '~' |
| 17 | src_transitype | src_transitype | src_transitype | varchar2(30) |
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
| 38 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 39 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |