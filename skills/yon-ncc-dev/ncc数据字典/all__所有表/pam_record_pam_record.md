# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10428.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_record | pk_record | pk_record | char(20) | √ |
| 2 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 3 | audittime | audittime | audittime | char(19) |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | billmaketime | billmaketime | billmaketime | char(19) |
| 6 | bill_code | bill_code | bill_code | varchar2(40) |
| 7 | bill_code_src | bill_code_src | bill_code_src | varchar2(40) |
| 8 | bill_status | bill_status | bill_status | number(38, 0) |
| 9 | bill_type | bill_type | bill_type | varchar2(4) |
| 10 | bill_type_src | bill_type_src | bill_type_src | varchar2(4) |
| 11 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 12 | checker | checker | checker | varchar2(50) |
| 13 | check_opinion | check_opinion | check_opinion | varchar2(200) |
| 14 | memo | memo | memo | varchar2(200) |
| 15 | pk_bill_src | pk_bill_src | pk_bill_src | varchar2(20) |
| 16 | pk_fiorg | pk_fiorg | pk_fiorg | varchar2(20) |  |  | '~' |
| 17 | pk_fiorg_v | pk_fiorg_v | pk_fiorg_v | varchar2(20) |  |  | '~' |
| 18 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 19 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 20 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 21 | pk_raorg | pk_raorg | pk_raorg | varchar2(20) |  |  | '~' |
| 22 | pk_raorg_v | pk_raorg_v | pk_raorg_v | varchar2(20) |  |  | '~' |
| 23 | pk_recorder | pk_recorder | pk_recorder | varchar2(20) |  |  | '~' |
| 24 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 25 | pk_transitype_src | pk_transitype_src | pk_transitype_src | varchar2(20) |
| 26 | pre_text1 | pre_text1 | pre_text1 | varchar2(128) |
| 27 | pre_text2 | pre_text2 | pre_text2 | varchar2(128) |
| 28 | pre_text3 | pre_text3 | pre_text3 | varchar2(128) |
| 29 | pre_text4 | pre_text4 | pre_text4 | varchar2(128) |
| 30 | pre_text5 | pre_text5 | pre_text5 | varchar2(128) |
| 31 | pre_text6 | pre_text6 | pre_text6 | varchar2(128) |
| 32 | pre_text7 | pre_text7 | pre_text7 | varchar2(128) |
| 33 | pre_text8 | pre_text8 | pre_text8 | varchar2(128) |
| 34 | pre_text9 | pre_text9 | pre_text9 | varchar2(128) |
| 35 | pre_text10 | pre_text10 | pre_text10 | varchar2(128) |
| 36 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 37 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 38 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 39 | saga_status | saga_status | saga_status | number(38, 0) |
| 40 | transi_type | transi_type | transi_type | varchar2(30) |
| 41 | transi_type_src | transi_type_src | transi_type_src | varchar2(50) |
| 42 | def1 | def1 | def1 | varchar2(101) |
| 43 | def2 | def2 | def2 | varchar2(101) |
| 44 | def3 | def3 | def3 | varchar2(101) |
| 45 | def4 | def4 | def4 | varchar2(101) |
| 46 | def5 | def5 | def5 | varchar2(101) |
| 47 | def6 | def6 | def6 | varchar2(101) |
| 48 | def7 | def7 | def7 | varchar2(101) |
| 49 | def8 | def8 | def8 | varchar2(101) |
| 50 | def9 | def9 | def9 | varchar2(101) |
| 51 | def10 | def10 | def10 | varchar2(101) |
| 52 | def11 | def11 | def11 | varchar2(101) |
| 53 | def12 | def12 | def12 | varchar2(101) |
| 54 | def13 | def13 | def13 | varchar2(101) |
| 55 | def14 | def14 | def14 | varchar2(101) |
| 56 | def15 | def15 | def15 | varchar2(101) |
| 57 | def16 | def16 | def16 | varchar2(101) |
| 58 | def17 | def17 | def17 | varchar2(101) |
| 59 | def18 | def18 | def18 | varchar2(101) |
| 60 | def19 | def19 | def19 | varchar2(101) |
| 61 | def20 | def20 | def20 | varchar2(101) |
| 62 | creationtime | creationtime | creationtime | char(19) |
| 63 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 64 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 65 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 66 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 67 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |