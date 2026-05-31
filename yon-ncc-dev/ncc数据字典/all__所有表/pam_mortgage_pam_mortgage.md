# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10414.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mortgage | pk_mortgage | pk_mortgage | char(20) | √ |
| 2 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 3 | audittime | audittime | audittime | char(19) |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | billmaketime | billmaketime | billmaketime | char(19) |
| 6 | bill_code | bill_code | bill_code | varchar2(40) |
| 7 | bill_date | bill_date | bill_date | char(19) |
| 8 | bill_status | bill_status | bill_status | number(38, 0) |
| 9 | bill_type | bill_type | bill_type | varchar2(20) |
| 10 | check_opinion | check_opinion | check_opinion | varchar2(200) |
| 11 | contract_addr | contract_addr | contract_addr | varchar2(60) |
| 12 | contract_code | contract_code | contract_code | varchar2(40) |
| 13 | contract_date | contract_date | contract_date | char(19) |
| 14 | end_date | end_date | end_date | char(19) |
| 15 | hypothec_man | hypothec_man | hypothec_man | varchar2(50) |
| 16 | memo | memo | memo | varchar2(200) |
| 17 | money_debt_local | money_debt_local | money_debt_local | number(28, 8) |
| 18 | money_debt_origin | money_debt_origin | money_debt_origin | number(28, 8) |
| 19 | money_mortgage | money_mortgage | money_mortgage | number(28, 8) |
| 20 | mortgager | mortgager | mortgager | varchar2(20) |  |  | '~' |
| 21 | pk_currency_debt | pk_currency_debt | pk_currency_debt | varchar2(20) |  |  | '~' |
| 22 | pk_currency_local | pk_currency_local | pk_currency_local | varchar2(20) |  |  | '~' |
| 23 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 24 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 25 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 26 | pk_recorder | pk_recorder | pk_recorder | varchar2(20) |  |  | '~' |
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
| 38 | rate_debt | rate_debt | rate_debt | number(28, 8) |
| 39 | rate_mortgage | rate_mortgage | rate_mortgage | number(28, 8) |
| 40 | reason | reason | reason | varchar2(200) |
| 41 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 42 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 43 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 44 | saga_status | saga_status | saga_status | number(38, 0) |
| 45 | start_date | start_date | start_date | char(19) |
| 46 | stop_date | stop_date | stop_date | char(19) |
| 47 | stop_maker | stop_maker | stop_maker | varchar2(20) |  |  | '~' |
| 48 | transi_type | transi_type | transi_type | varchar2(30) |
| 49 | def1 | def1 | def1 | varchar2(101) |
| 50 | def2 | def2 | def2 | varchar2(101) |
| 51 | def3 | def3 | def3 | varchar2(101) |
| 52 | def4 | def4 | def4 | varchar2(101) |
| 53 | def5 | def5 | def5 | varchar2(101) |
| 54 | def6 | def6 | def6 | varchar2(101) |
| 55 | def7 | def7 | def7 | varchar2(101) |
| 56 | def8 | def8 | def8 | varchar2(101) |
| 57 | def9 | def9 | def9 | varchar2(101) |
| 58 | def10 | def10 | def10 | varchar2(101) |
| 59 | def11 | def11 | def11 | varchar2(101) |
| 60 | def12 | def12 | def12 | varchar2(101) |
| 61 | def13 | def13 | def13 | varchar2(101) |
| 62 | def14 | def14 | def14 | varchar2(101) |
| 63 | def15 | def15 | def15 | varchar2(101) |
| 64 | def16 | def16 | def16 | varchar2(101) |
| 65 | def17 | def17 | def17 | varchar2(101) |
| 66 | def18 | def18 | def18 | varchar2(101) |
| 67 | def19 | def19 | def19 | varchar2(101) |
| 68 | def20 | def20 | def20 | varchar2(101) |
| 69 | creationtime | creationtime | creationtime | char(19) |
| 70 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 71 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 72 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 73 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 74 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |