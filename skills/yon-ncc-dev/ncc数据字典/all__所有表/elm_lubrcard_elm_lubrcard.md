# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7858.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_lubrcard | pk_lubrcard | pk_lubrcard | char(20) | √ |
| 2 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 3 | audittime | audittime | audittime | char(19) |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | billmaketime | billmaketime | billmaketime | char(19) |
| 6 | bill_code | bill_code | bill_code | varchar2(50) |
| 7 | bill_status | bill_status | bill_status | number(38, 0) |
| 8 | bill_type | bill_type | bill_type | varchar2(4) |
| 9 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 10 | check_opinion | check_opinion | check_opinion | varchar2(80) |
| 11 | enablestate | enablestate | enablestate | number(38, 0) |
| 12 | lubr_count_all | lubr_count_all | lubr_count_all | number(38, 0) |
| 13 | memo | memo | memo | varchar2(200) |
| 14 | pk_equip | pk_equip | pk_equip | varchar2(20) |  |  | '~' |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 16 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 17 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 18 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 19 | transi_type | transi_type | transi_type | varchar2(30) |
| 20 | def1 | def1 | def1 | varchar2(101) |
| 21 | def2 | def2 | def2 | varchar2(101) |
| 22 | def3 | def3 | def3 | varchar2(101) |
| 23 | def4 | def4 | def4 | varchar2(101) |
| 24 | def5 | def5 | def5 | varchar2(101) |
| 25 | def6 | def6 | def6 | varchar2(101) |
| 26 | def7 | def7 | def7 | varchar2(101) |
| 27 | def8 | def8 | def8 | varchar2(101) |
| 28 | def9 | def9 | def9 | varchar2(101) |
| 29 | def10 | def10 | def10 | varchar2(101) |
| 30 | def11 | def11 | def11 | varchar2(101) |
| 31 | def12 | def12 | def12 | varchar2(101) |
| 32 | def13 | def13 | def13 | varchar2(101) |
| 33 | def14 | def14 | def14 | varchar2(101) |
| 34 | def15 | def15 | def15 | varchar2(101) |
| 35 | def16 | def16 | def16 | varchar2(101) |
| 36 | def17 | def17 | def17 | varchar2(101) |
| 37 | def18 | def18 | def18 | varchar2(101) |
| 38 | def19 | def19 | def19 | varchar2(101) |
| 39 | def20 | def20 | def20 | varchar2(101) |
| 40 | creationtime | creationtime | creationtime | char(19) |
| 41 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 42 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 43 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 44 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 45 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |