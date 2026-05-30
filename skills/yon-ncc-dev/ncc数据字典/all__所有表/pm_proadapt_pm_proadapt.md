# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10663.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_proadapt | pk_proadapt | pk_proadapt | char(20) | √ |
| 2 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 3 | audittime | audittime | audittime | char(19) |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | billmaketime | billmaketime | billmaketime | char(19) |
| 6 | bill_code | bill_code | bill_code | varchar2(40) |
| 7 | bill_status | bill_status | bill_status | number(38, 0) |
| 8 | bill_type | bill_type | bill_type | varchar2(4) |
| 9 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 10 | check_opinion | check_opinion | check_opinion | varchar2(200) |
| 11 | corigcurrencyid | corigcurrencyid | corigcurrencyid | varchar2(20) |  |  | '~' |
| 12 | ductorg | ductorg | ductorg | varchar2(20) |
| 13 | memo | memo | memo | varchar2(200) |
| 14 | mutilang | mutilang | mutilang | number(38, 0) |
| 15 | oper_date | oper_date | oper_date | char(19) |
| 16 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 17 | pk_operdept | pk_operdept | pk_operdept | varchar2(20) |  |  | '~' |
| 18 | pk_operdept_v | pk_operdept_v | pk_operdept_v | varchar2(20) |  |  | '~' |
| 19 | pk_operuser | pk_operuser | pk_operuser | varchar2(20) |  |  | '~' |
| 20 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 21 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 22 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 23 | pk_status_after | pk_status_after | pk_status_after | varchar2(20) |  |  | '~' |
| 24 | pk_status_before | pk_status_before | pk_status_before | varchar2(20) |  |  | '~' |
| 25 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 26 | saga_btxid | saga_btxid | saga_btxid | varchar2(101) |
| 27 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 28 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(101) |
| 29 | saga_status | saga_status | saga_status | number(38, 0) |
| 30 | status_date_after | status_date_after | status_date_after | char(19) |
| 31 | status_date_before | status_date_before | status_date_before | char(19) |
| 32 | transi_type | transi_type | transi_type | varchar2(30) |
| 33 | hdef1 | hdef1 | hdef1 | varchar2(101) |
| 34 | hdef2 | hdef2 | hdef2 | varchar2(101) |
| 35 | hdef3 | hdef3 | hdef3 | varchar2(101) |
| 36 | hdef4 | hdef4 | hdef4 | varchar2(101) |
| 37 | hdef5 | hdef5 | hdef5 | varchar2(101) |
| 38 | hdef6 | hdef6 | hdef6 | varchar2(101) |
| 39 | hdef7 | hdef7 | hdef7 | varchar2(101) |
| 40 | hdef8 | hdef8 | hdef8 | varchar2(101) |
| 41 | hdef9 | hdef9 | hdef9 | varchar2(101) |
| 42 | hdef10 | hdef10 | hdef10 | varchar2(101) |
| 43 | hdef11 | hdef11 | hdef11 | varchar2(101) |
| 44 | hdef12 | hdef12 | hdef12 | varchar2(101) |
| 45 | hdef13 | hdef13 | hdef13 | varchar2(101) |
| 46 | hdef14 | hdef14 | hdef14 | varchar2(101) |
| 47 | hdef15 | hdef15 | hdef15 | varchar2(101) |
| 48 | hdef16 | hdef16 | hdef16 | varchar2(101) |
| 49 | hdef17 | hdef17 | hdef17 | varchar2(101) |
| 50 | hdef18 | hdef18 | hdef18 | varchar2(101) |
| 51 | hdef19 | hdef19 | hdef19 | varchar2(101) |
| 52 | hdef20 | hdef20 | hdef20 | varchar2(101) |
| 53 | creationtime | creationtime | creationtime | char(19) |
| 54 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 55 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 56 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 57 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 58 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |