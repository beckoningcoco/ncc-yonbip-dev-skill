# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10679.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_protranfacard | pk_protranfacard | pk_protranfacard | char(20) | √ |
| 2 | actpercent_before | actpercent_before | actpercent_before | number(28, 8) |
| 3 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 4 | audittime | audittime | audittime | char(19) |
| 5 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 6 | billmaketime | billmaketime | billmaketime | char(19) |
| 7 | bill_code | bill_code | bill_code | varchar2(40) |
| 8 | bill_status | bill_status | bill_status | number(38, 0) |
| 9 | bill_type | bill_type | bill_type | varchar2(4) |
| 10 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 11 | check_opinion | check_opinion | check_opinion | varchar2(200) |
| 12 | corigcurrencyid | corigcurrencyid | corigcurrencyid | varchar2(20) |  |  | '~' |
| 13 | memo | memo | memo | varchar2(200) |
| 14 | oper_date | oper_date | oper_date | char(19) |
| 15 | pk_consignorg | pk_consignorg | pk_consignorg | varchar2(20) |  |  | '~' |
| 16 | pk_consignorg_v | pk_consignorg_v | pk_consignorg_v | varchar2(20) |  |  | '~' |
| 17 | pk_financeorg | pk_financeorg | pk_financeorg | varchar2(20) |  |  | '~' |
| 18 | pk_financeorg_v | pk_financeorg_v | pk_financeorg_v | varchar2(20) |  |  | '~' |
| 19 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 20 | pk_operdept | pk_operdept | pk_operdept | varchar2(20) |  |  | '~' |
| 21 | pk_operdept_v | pk_operdept_v | pk_operdept_v | varchar2(20) |  |  | '~' |
| 22 | pk_operuser | pk_operuser | pk_operuser | varchar2(20) |  |  | '~' |
| 23 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 24 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 25 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 26 | pk_status_after | pk_status_after | pk_status_after | varchar2(20) |  |  | '~' |
| 27 | pk_status_before | pk_status_before | pk_status_before | varchar2(20) |  |  | '~' |
| 28 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 29 | pk_wbs | pk_wbs | pk_wbs | varchar2(36) |  |  | '~' |
| 30 | saga_btxid | saga_btxid | saga_btxid | varchar2(101) |
| 31 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 32 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(101) |
| 33 | saga_status | saga_status | saga_status | number(38, 0) |
| 34 | status_date_after | status_date_after | status_date_after | char(19) |
| 35 | status_date_before | status_date_before | status_date_before | char(19) |
| 36 | transi_type | transi_type | transi_type | varchar2(30) |
| 37 | wbs_status_after | wbs_status_after | wbs_status_after | number(38, 0) |
| 38 | wbs_status_before | wbs_status_before | wbs_status_before | number(38, 0) |
| 39 | hdef1 | hdef1 | hdef1 | varchar2(101) |
| 40 | hdef2 | hdef2 | hdef2 | varchar2(101) |
| 41 | hdef3 | hdef3 | hdef3 | varchar2(101) |
| 42 | hdef4 | hdef4 | hdef4 | varchar2(101) |
| 43 | hdef5 | hdef5 | hdef5 | varchar2(101) |
| 44 | hdef6 | hdef6 | hdef6 | varchar2(101) |
| 45 | hdef7 | hdef7 | hdef7 | varchar2(101) |
| 46 | hdef8 | hdef8 | hdef8 | varchar2(101) |
| 47 | hdef9 | hdef9 | hdef9 | varchar2(101) |
| 48 | hdef10 | hdef10 | hdef10 | varchar2(101) |
| 49 | hdef11 | hdef11 | hdef11 | varchar2(101) |
| 50 | hdef12 | hdef12 | hdef12 | varchar2(101) |
| 51 | hdef13 | hdef13 | hdef13 | varchar2(101) |
| 52 | hdef14 | hdef14 | hdef14 | varchar2(101) |
| 53 | hdef15 | hdef15 | hdef15 | varchar2(101) |
| 54 | hdef16 | hdef16 | hdef16 | varchar2(101) |
| 55 | hdef17 | hdef17 | hdef17 | varchar2(101) |
| 56 | hdef18 | hdef18 | hdef18 | varchar2(101) |
| 57 | hdef19 | hdef19 | hdef19 | varchar2(101) |
| 58 | hdef20 | hdef20 | hdef20 | varchar2(101) |
| 59 | creationtime | creationtime | creationtime | char(19) |
| 60 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 61 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 62 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 63 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 64 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |