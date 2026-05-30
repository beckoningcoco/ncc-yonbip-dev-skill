# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10567.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contr_alter | pk_contr_alter | pk_contr_alter | char(20) | √ |
| 2 | alter_date | alter_date | alter_date | char(19) |
| 3 | alter_mny | alter_mny | alter_mny | number(28, 8) |  |  | 0 |
| 4 | alter_taxmny | alter_taxmny | alter_taxmny | number(28, 8) |
| 5 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 6 | audittime | audittime | audittime | char(19) |
| 7 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 8 | billmaketime | billmaketime | billmaketime | char(19) |
| 9 | bill_code | bill_code | bill_code | varchar2(40) |
| 10 | bill_status | bill_status | bill_status | number(38, 0) |
| 11 | bill_type | bill_type | bill_type | varchar2(4) |
| 12 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 13 | calcostmny | calcostmny | calcostmny | number(28, 8) |
| 14 | check_opinion | check_opinion | check_opinion | varchar2(200) |
| 15 | contr_ver_after | contr_ver_after | contr_ver_after | number(38, 0) |
| 16 | contr_ver_bef | contr_ver_bef | contr_ver_bef | number(38, 0) |
| 17 | cont_mny | cont_mny | cont_mny | number(28, 8) |  |  | 0 |
| 18 | flexible_flag | flexible_flag | flexible_flag | char(1) |  |  | 'N' |
| 19 | memo | memo | memo | varchar2(200) |
| 20 | nexchangerate | nexchangerate | nexchangerate | number(28, 8) |
| 21 | nosubtaxmny | nosubtaxmny | nosubtaxmny | number(28, 8) |
| 22 | pk_contr | pk_contr | pk_contr | varchar2(20) |  |  | '~' |
| 23 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 24 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 25 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 26 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 27 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |
| 28 | pk_taxcode | pk_taxcode | pk_taxcode | varchar2(20) |
| 29 | pk_transactor | pk_transactor | pk_transactor | varchar2(20) |  |  | '~' |
| 30 | pk_transact_dept | pk_transact_dept | pk_transact_dept | varchar2(20) |  |  | '~' |
| 31 | pk_transact_dept_v | pk_transact_dept_v | pk_transact_dept_v | varchar2(20) |  |  | '~' |
| 32 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 33 | plan_payment_total | plan_payment_total | plan_payment_total | number(28, 8) |
| 34 | src_billtype | src_billtype | src_billtype | varchar2(50) |
| 35 | src_bill_code | src_bill_code | src_bill_code | varchar2(50) |
| 36 | src_bill_name | src_bill_name | src_bill_name | varchar2(200) |
| 37 | tax | tax | tax | number(28, 8) |
| 38 | taxrate | taxrate | taxrate | number(28, 8) |
| 39 | tot_comp_mny | tot_comp_mny | tot_comp_mny | number(28, 8) |
| 40 | tot_comp_num | tot_comp_num | tot_comp_num | number(28, 8) |
| 41 | transi_type | transi_type | transi_type | varchar2(30) |
| 42 | hdef1 | hdef1 | hdef1 | varchar2(101) |
| 43 | hdef2 | hdef2 | hdef2 | varchar2(101) |
| 44 | hdef3 | hdef3 | hdef3 | varchar2(101) |
| 45 | hdef4 | hdef4 | hdef4 | varchar2(101) |
| 46 | hdef5 | hdef5 | hdef5 | varchar2(101) |
| 47 | hdef6 | hdef6 | hdef6 | varchar2(101) |
| 48 | hdef7 | hdef7 | hdef7 | varchar2(101) |
| 49 | hdef8 | hdef8 | hdef8 | varchar2(101) |
| 50 | hdef9 | hdef9 | hdef9 | varchar2(101) |
| 51 | hdef10 | hdef10 | hdef10 | varchar2(101) |
| 52 | hdef11 | hdef11 | hdef11 | varchar2(101) |
| 53 | hdef12 | hdef12 | hdef12 | varchar2(101) |
| 54 | hdef13 | hdef13 | hdef13 | varchar2(101) |
| 55 | hdef14 | hdef14 | hdef14 | varchar2(101) |
| 56 | hdef15 | hdef15 | hdef15 | varchar2(101) |
| 57 | hdef16 | hdef16 | hdef16 | varchar2(101) |
| 58 | hdef17 | hdef17 | hdef17 | varchar2(101) |
| 59 | hdef18 | hdef18 | hdef18 | varchar2(101) |
| 60 | hdef19 | hdef19 | hdef19 | varchar2(101) |
| 61 | hdef20 | hdef20 | hdef20 | varchar2(101) |
| 62 | creationtime | creationtime | creationtime | char(19) |
| 63 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 64 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 65 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 66 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 67 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |