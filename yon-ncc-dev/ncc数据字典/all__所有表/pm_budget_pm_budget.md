# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10539.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_budget | pk_budget | pk_budget | char(20) | √ |
| 2 | alter_date | alter_date | alter_date | char(19) |
| 3 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 4 | audittime | audittime | audittime | char(19) |
| 5 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 6 | billmaketime | billmaketime | billmaketime | char(19) |
| 7 | bill_code | bill_code | bill_code | varchar2(40) |
| 8 | bill_status | bill_status | bill_status | number(38, 0) |
| 9 | bill_type | bill_type | bill_type | varchar2(4) |  |  | '~' |
| 10 | budget_mny | budget_mny | budget_mny | number(28, 8) |  |  | 0 |
| 11 | budget_tax | budget_tax | budget_tax | number(28, 8) |  |  | 0 |
| 12 | budget_taxmny | budget_taxmny | budget_taxmny | number(28, 8) |  |  | 0 |
| 13 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 14 | check_opinion | check_opinion | check_opinion | varchar2(200) |
| 15 | curr_effect | curr_effect | curr_effect | char(1) |
| 16 | in_budget | in_budget | in_budget | number(28, 8) |  |  | 0 |
| 17 | in_budget_tax | in_budget_tax | in_budget_tax | number(28, 8) |  |  | 0 |
| 18 | in_taxbudget | in_taxbudget | in_taxbudget | number(28, 8) |  |  | 0 |
| 19 | last_v_flag | last_v_flag | last_v_flag | char(1) |
| 20 | make_date | make_date | make_date | char(19) |
| 21 | make_mode | make_mode | make_mode | number(38, 0) |
| 22 | mal_version | mal_version | mal_version | number(28, 8) |
| 23 | memo | memo | memo | varchar2(300) |
| 24 | pk_alter | pk_alter | pk_alter | varchar2(20) |  |  | '~' |
| 25 | pk_billoid | pk_billoid | pk_billoid | varchar2(20) |
| 26 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 27 | pk_default_cbsnode | pk_default_cbsnode | pk_default_cbsnode | varchar2(20) |  |  | '~' |
| 28 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 29 | pk_makedept | pk_makedept | pk_makedept | varchar2(20) |  |  | '~' |
| 30 | pk_makedept_v | pk_makedept_v | pk_makedept_v | varchar2(20) |  |  | '~' |
| 31 | pk_maker | pk_maker | pk_maker | varchar2(20) |  |  | '~' |
| 32 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 33 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 34 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 35 | pk_releasepsn | pk_releasepsn | pk_releasepsn | varchar2(20) |  |  | '~' |
| 36 | pk_status_after | pk_status_after | pk_status_after | varchar2(20) |  |  | '~' |
| 37 | pk_status_before | pk_status_before | pk_status_before | varchar2(20) |  |  | '~' |
| 38 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 39 | pk_wbs | pk_wbs | pk_wbs | varchar2(36) |  |  | '~' |
| 40 | pre_profit | pre_profit | pre_profit | number(28, 8) |  |  | 0 |
| 41 | release_date | release_date | release_date | char(19) |
| 42 | stage | stage | stage | number(38, 0) |
| 43 | status_date_after | status_date_after | status_date_after | char(19) |
| 44 | status_date_before | status_date_before | status_date_before | char(19) |
| 45 | transi_type | transi_type | transi_type | varchar2(30) |
| 46 | version | version | version | number(38, 0) |
| 47 | hdef1 | hdef1 | hdef1 | varchar2(101) |
| 48 | hdef2 | hdef2 | hdef2 | varchar2(101) |
| 49 | hdef3 | hdef3 | hdef3 | varchar2(101) |
| 50 | hdef4 | hdef4 | hdef4 | varchar2(101) |
| 51 | hdef5 | hdef5 | hdef5 | varchar2(101) |
| 52 | hdef6 | hdef6 | hdef6 | varchar2(101) |
| 53 | hdef7 | hdef7 | hdef7 | varchar2(101) |
| 54 | hdef8 | hdef8 | hdef8 | varchar2(101) |
| 55 | hdef9 | hdef9 | hdef9 | varchar2(101) |
| 56 | hdef10 | hdef10 | hdef10 | varchar2(101) |
| 57 | hdef11 | hdef11 | hdef11 | varchar2(101) |
| 58 | hdef12 | hdef12 | hdef12 | varchar2(101) |
| 59 | hdef13 | hdef13 | hdef13 | varchar2(101) |
| 60 | hdef14 | hdef14 | hdef14 | varchar2(101) |
| 61 | hdef15 | hdef15 | hdef15 | varchar2(101) |
| 62 | hdef16 | hdef16 | hdef16 | varchar2(101) |
| 63 | hdef17 | hdef17 | hdef17 | varchar2(101) |
| 64 | hdef18 | hdef18 | hdef18 | varchar2(101) |
| 65 | hdef19 | hdef19 | hdef19 | varchar2(101) |
| 66 | hdef20 | hdef20 | hdef20 | varchar2(101) |
| 67 | hdef21 | hdef21 | hdef21 | varchar2(101) |
| 68 | hdef22 | hdef22 | hdef22 | varchar2(101) |
| 69 | hdef23 | hdef23 | hdef23 | varchar2(101) |
| 70 | hdef24 | hdef24 | hdef24 | varchar2(101) |
| 71 | hdef25 | hdef25 | hdef25 | varchar2(101) |
| 72 | hdef26 | hdef26 | hdef26 | varchar2(101) |
| 73 | hdef27 | hdef27 | hdef27 | varchar2(101) |
| 74 | hdef28 | hdef28 | hdef28 | varchar2(101) |
| 75 | hdef29 | hdef29 | hdef29 | varchar2(101) |
| 76 | hdef30 | hdef30 | hdef30 | varchar2(101) |
| 77 | hdef31 | hdef31 | hdef31 | varchar2(101) |
| 78 | hdef32 | hdef32 | hdef32 | varchar2(101) |
| 79 | hdef33 | hdef33 | hdef33 | varchar2(101) |
| 80 | hdef34 | hdef34 | hdef34 | varchar2(101) |
| 81 | hdef35 | hdef35 | hdef35 | varchar2(101) |
| 82 | hdef36 | hdef36 | hdef36 | varchar2(101) |
| 83 | hdef37 | hdef37 | hdef37 | varchar2(101) |
| 84 | hdef38 | hdef38 | hdef38 | varchar2(101) |
| 85 | hdef39 | hdef39 | hdef39 | varchar2(101) |
| 86 | hdef40 | hdef40 | hdef40 | varchar2(101) |
| 87 | hdef41 | hdef41 | hdef41 | varchar2(101) |
| 88 | hdef42 | hdef42 | hdef42 | varchar2(101) |
| 89 | hdef43 | hdef43 | hdef43 | varchar2(101) |
| 90 | hdef44 | hdef44 | hdef44 | varchar2(101) |
| 91 | hdef45 | hdef45 | hdef45 | varchar2(101) |
| 92 | hdef46 | hdef46 | hdef46 | varchar2(101) |
| 93 | hdef47 | hdef47 | hdef47 | varchar2(101) |
| 94 | hdef48 | hdef48 | hdef48 | varchar2(101) |
| 95 | hdef49 | hdef49 | hdef49 | varchar2(101) |
| 96 | hdef50 | hdef50 | hdef50 | varchar2(101) |
| 97 | creationtime | creationtime | creationtime | char(19) |
| 98 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 99 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 100 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 101 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 102 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |