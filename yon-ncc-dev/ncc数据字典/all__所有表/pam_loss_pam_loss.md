# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10409.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_loss | pk_loss | pk_loss | char(20) | √ |
| 2 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 3 | audittime | audittime | audittime | char(19) |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | billmaketime | billmaketime | billmaketime | char(19) |
| 6 | billtype_src | billtype_src | billtype_src | varchar2(30) |
| 7 | bill_code | bill_code | bill_code | varchar2(40) |
| 8 | bill_status | bill_status | bill_status | number(38, 0) |
| 9 | bill_type | bill_type | bill_type | varchar2(4) |
| 10 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 11 | check_code | check_code | check_code | varchar2(40) |
| 12 | check_date | check_date | check_date | char(19) |
| 13 | check_opinion | check_opinion | check_opinion | varchar2(200) |
| 14 | memo | memo | memo | varchar2(200) |
| 15 | pk_bill_src | pk_bill_src | pk_bill_src | char(20) |
| 16 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 17 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 18 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 19 | pk_recorder | pk_recorder | pk_recorder | varchar2(20) |  |  | '~' |
| 20 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 21 | pre_text1 | pre_text1 | pre_text1 | varchar2(100) |
| 22 | pre_text2 | pre_text2 | pre_text2 | varchar2(100) |
| 23 | pre_text3 | pre_text3 | pre_text3 | varchar2(100) |
| 24 | pre_text4 | pre_text4 | pre_text4 | varchar2(100) |
| 25 | pre_text5 | pre_text5 | pre_text5 | varchar2(100) |
| 26 | pre_text6 | pre_text6 | pre_text6 | varchar2(100) |
| 27 | pre_text7 | pre_text7 | pre_text7 | varchar2(100) |
| 28 | pre_text8 | pre_text8 | pre_text8 | varchar2(100) |
| 29 | pre_text9 | pre_text9 | pre_text9 | varchar2(100) |
| 30 | pre_text10 | pre_text10 | pre_text10 | varchar2(100) |
| 31 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 32 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 33 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 34 | saga_status | saga_status | saga_status | number(38, 0) |
| 35 | transi_type | transi_type | transi_type | varchar2(30) |
| 36 | def1 | def1 | def1 | varchar2(101) |
| 37 | def2 | def2 | def2 | varchar2(101) |
| 38 | def3 | def3 | def3 | varchar2(101) |
| 39 | def4 | def4 | def4 | varchar2(101) |
| 40 | def5 | def5 | def5 | varchar2(101) |
| 41 | def6 | def6 | def6 | varchar2(101) |
| 42 | def7 | def7 | def7 | varchar2(101) |
| 43 | def8 | def8 | def8 | varchar2(101) |
| 44 | def9 | def9 | def9 | varchar2(101) |
| 45 | def10 | def10 | def10 | varchar2(101) |
| 46 | def11 | def11 | def11 | varchar2(101) |
| 47 | def12 | def12 | def12 | varchar2(101) |
| 48 | def13 | def13 | def13 | varchar2(101) |
| 49 | def14 | def14 | def14 | varchar2(101) |
| 50 | def15 | def15 | def15 | varchar2(101) |
| 51 | def16 | def16 | def16 | varchar2(101) |
| 52 | def17 | def17 | def17 | varchar2(101) |
| 53 | def18 | def18 | def18 | varchar2(101) |
| 54 | def19 | def19 | def19 | varchar2(101) |
| 55 | def20 | def20 | def20 | varchar2(101) |
| 56 | creationtime | creationtime | creationtime | char(19) |
| 57 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 58 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 59 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 60 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 61 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |