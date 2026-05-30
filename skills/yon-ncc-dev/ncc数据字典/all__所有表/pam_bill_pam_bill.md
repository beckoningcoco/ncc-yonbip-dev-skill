# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10355.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bill | pk_bill | pk_bill | char(20) | √ |
| 2 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 3 | audittime | audittime | audittime | char(19) |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | billmaketime | billmaketime | billmaketime | char(19) |
| 6 | bill_code | bill_code | bill_code | varchar2(40) | √ |
| 7 | bill_status | bill_status | bill_status | number(38, 0) | √ |
| 8 | bill_type | bill_type | bill_type | varchar2(4) |
| 9 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 10 | check_opinion | check_opinion | check_opinion | varchar2(200) |
| 11 | debugger | debugger | debugger | varchar2(50) |
| 12 | memo | memo | memo | varchar2(200) |
| 13 | money_total_global | money_total_global | money_total_global | number(28, 8) |
| 14 | money_total_group | money_total_group | money_total_group | number(28, 8) |
| 15 | money_total_org | money_total_org | money_total_org | number(28, 8) |
| 16 | pk_currency | pk_currency | pk_currency | varchar2(20) |  |  | '~' |
| 17 | pk_cusmandoc | pk_cusmandoc | pk_cusmandoc | varchar2(20) |  |  | '~' |
| 18 | pk_debug_dept | pk_debug_dept | pk_debug_dept | varchar2(20) |  |  | '~' |
| 19 | pk_debug_dept_v | pk_debug_dept_v | pk_debug_dept_v | varchar2(20) |  |  | '~' |
| 20 | pk_fiorg | pk_fiorg | pk_fiorg | varchar2(20) |  |  | '~' |
| 21 | pk_fiorg_v | pk_fiorg_v | pk_fiorg_v | varchar2(20) |  |  | '~' |
| 22 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 23 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 24 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 25 | pk_raorg | pk_raorg | pk_raorg | varchar2(20) |  |  | '~' |
| 26 | pk_raorg_v | pk_raorg_v | pk_raorg_v | varchar2(20) |  |  | '~' |
| 27 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 28 | pre_text1 | pre_text1 | pre_text1 | varchar2(128) |
| 29 | pre_text2 | pre_text2 | pre_text2 | varchar2(128) |
| 30 | pre_text3 | pre_text3 | pre_text3 | varchar2(128) |
| 31 | pre_text4 | pre_text4 | pre_text4 | varchar2(128) |
| 32 | pre_text5 | pre_text5 | pre_text5 | varchar2(128) |
| 33 | pre_text6 | pre_text6 | pre_text6 | varchar2(128) |
| 34 | pre_text7 | pre_text7 | pre_text7 | varchar2(128) |
| 35 | pre_text8 | pre_text8 | pre_text8 | varchar2(128) |
| 36 | pre_text9 | pre_text9 | pre_text9 | varchar2(128) |
| 37 | pre_text10 | pre_text10 | pre_text10 | varchar2(128) |
| 38 | reason | reason | reason | varchar2(80) |
| 39 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 40 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 41 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 42 | saga_status | saga_status | saga_status | number(38, 0) |
| 43 | transi_type | transi_type | transi_type | varchar2(30) |
| 44 | def1 | def1 | def1 | varchar2(101) |
| 45 | def2 | def2 | def2 | varchar2(101) |
| 46 | def3 | def3 | def3 | varchar2(101) |
| 47 | def4 | def4 | def4 | varchar2(101) |
| 48 | def5 | def5 | def5 | varchar2(101) |
| 49 | def6 | def6 | def6 | varchar2(101) |
| 50 | def7 | def7 | def7 | varchar2(101) |
| 51 | def8 | def8 | def8 | varchar2(101) |
| 52 | def9 | def9 | def9 | varchar2(101) |
| 53 | def10 | def10 | def10 | varchar2(101) |
| 54 | def11 | def11 | def11 | varchar2(101) |
| 55 | def12 | def12 | def12 | varchar2(101) |
| 56 | def13 | def13 | def13 | varchar2(101) |
| 57 | def14 | def14 | def14 | varchar2(101) |
| 58 | def15 | def15 | def15 | varchar2(101) |
| 59 | def16 | def16 | def16 | varchar2(101) |
| 60 | def17 | def17 | def17 | varchar2(101) |
| 61 | def18 | def18 | def18 | varchar2(101) |
| 62 | def19 | def19 | def19 | varchar2(101) |
| 63 | def20 | def20 | def20 | varchar2(101) |
| 64 | creationtime | creationtime | creationtime | char(19) |
| 65 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 66 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 67 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 68 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 69 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |