# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10689.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sale_balance | pk_sale_balance | pk_sale_balance | char(20) | √ |
| 2 | app_taxmny | app_taxmny | app_taxmny | number(28, 8) |
| 3 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 4 | audittime | audittime | audittime | char(19) |
| 5 | balance_date | balance_date | balance_date | char(19) |
| 6 | bal_dif_taxmny | bal_dif_taxmny | bal_dif_taxmny | number(28, 8) |
| 7 | begin_flag | begin_flag | begin_flag | char(1) |
| 8 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 9 | billmaketime | billmaketime | billmaketime | char(19) |
| 10 | bill_code | bill_code | bill_code | varchar2(40) |
| 11 | bill_status | bill_status | bill_status | number(38, 0) |
| 12 | bill_type | bill_type | bill_type | varchar2(4) |
| 13 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 14 | cha_taxmny | cha_taxmny | cha_taxmny | number(28, 8) |
| 15 | check_opinion | check_opinion | check_opinion | varchar2(50) |
| 16 | due_taxmny_org | due_taxmny_org | due_taxmny_org | number(28, 8) |
| 17 | final_bal_flag | final_bal_flag | final_bal_flag | char(1) |
| 18 | income_mode | income_mode | income_mode | number(38, 0) |
| 19 | memo | memo | memo | varchar2(300) |
| 20 | mny_org | mny_org | mny_org | number(28, 8) |
| 21 | pk_contr | pk_contr | pk_contr | varchar2(20) |  |  | '~' |
| 22 | pk_customer | pk_customer | pk_customer | varchar2(20) |  |  | '~' |
| 23 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 24 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 25 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 26 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 27 | pk_taxcode | pk_taxcode | pk_taxcode | varchar2(20) |  |  | '~' |
| 28 | pk_transactor | pk_transactor | pk_transactor | varchar2(20) |  |  | '~' |
| 29 | pk_transact_dept | pk_transact_dept | pk_transact_dept | varchar2(20) |  |  | '~' |
| 30 | pk_transact_dep_v | pk_transact_dep_v | pk_transact_dep_v | varchar2(20) |  |  | '~' |
| 31 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 32 | qual_apply_mny | qual_apply_mny | qual_apply_mny | number(28, 8) |
| 33 | qual_begindate | qual_begindate | qual_begindate | char(19) |
| 34 | qual_enddate | qual_enddate | qual_enddate | char(19) |
| 35 | qual_mny | qual_mny | qual_mny | number(28, 8) |
| 36 | qual_percent | qual_percent | qual_percent | number(28, 8) |
| 37 | qual_time | qual_time | qual_time | number(38, 0) |
| 38 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 39 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |  |  | 0 |
| 40 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 41 | saga_status | saga_status | saga_status | number(38, 0) |  |  | 0 |
| 42 | src_bill_code | src_bill_code | src_bill_code | varchar2(40) |
| 43 | src_bill_type | src_bill_type | src_bill_type | varchar2(4) |
| 44 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(20) |
| 45 | src_pk_transitype | src_pk_transitype | src_pk_transitype | varchar2(20) |
| 46 | src_transi_type | src_transi_type | src_transi_type | varchar2(30) |
| 47 | tax | tax | tax | number(28, 8) |
| 48 | taxmny_org | taxmny_org | taxmny_org | number(28, 8) |
| 49 | taxrate | taxrate | taxrate | number(28, 8) |
| 50 | tot_bal_taxmny | tot_bal_taxmny | tot_bal_taxmny | number(28, 8) |
| 51 | transi_type | transi_type | transi_type | varchar2(20) |
| 52 | hdef1 | hdef1 | hdef1 | varchar2(101) |
| 53 | hdef2 | hdef2 | hdef2 | varchar2(101) |
| 54 | hdef3 | hdef3 | hdef3 | varchar2(101) |
| 55 | hdef4 | hdef4 | hdef4 | varchar2(101) |
| 56 | hdef5 | hdef5 | hdef5 | varchar2(101) |
| 57 | hdef6 | hdef6 | hdef6 | varchar2(101) |
| 58 | hdef7 | hdef7 | hdef7 | varchar2(101) |
| 59 | hdef8 | hdef8 | hdef8 | varchar2(101) |
| 60 | hdef9 | hdef9 | hdef9 | varchar2(101) |
| 61 | hdef10 | hdef10 | hdef10 | varchar2(101) |
| 62 | hdef11 | hdef11 | hdef11 | varchar2(101) |
| 63 | hdef12 | hdef12 | hdef12 | varchar2(101) |
| 64 | hdef13 | hdef13 | hdef13 | varchar2(101) |
| 65 | hdef14 | hdef14 | hdef14 | varchar2(101) |
| 66 | hdef15 | hdef15 | hdef15 | varchar2(101) |
| 67 | hdef16 | hdef16 | hdef16 | varchar2(101) |
| 68 | hdef17 | hdef17 | hdef17 | varchar2(101) |
| 69 | hdef18 | hdef18 | hdef18 | varchar2(101) |
| 70 | hdef19 | hdef19 | hdef19 | varchar2(101) |
| 71 | hdef20 | hdef20 | hdef20 | varchar2(101) |
| 72 | creationtime | creationtime | creationtime | char(19) |
| 73 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 74 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 75 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 76 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 77 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |