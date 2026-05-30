# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10724.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_verify_balance | pk_verify_balance | pk_verify_balance | char(20) | √ |
| 2 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 3 | audittime | audittime | audittime | char(19) |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | billmaketime | billmaketime | billmaketime | char(19) |
| 6 | bill_code | bill_code | bill_code | varchar2(40) |
| 7 | bill_status | bill_status | bill_status | number(38, 0) |
| 8 | bill_type | bill_type | bill_type | varchar2(4) |
| 9 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 10 | calcostmny | calcostmny | calcostmny | number(28, 8) |
| 11 | calcostmny_global | calcostmny_global | calcostmny_global | number(28, 8) |
| 12 | calcostmny_group | calcostmny_group | calcostmny_group | number(28, 8) |
| 13 | check_opinion | check_opinion | check_opinion | varchar2(50) |
| 14 | contract_code | contract_code | contract_code | varchar2(50) |
| 15 | memo | memo | memo | varchar2(300) |
| 16 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 17 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 18 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 19 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 20 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 21 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 22 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 23 | pk_verify_dept | pk_verify_dept | pk_verify_dept | varchar2(20) |  |  | '~' |
| 24 | pk_verify_dept_v | pk_verify_dept_v | pk_verify_dept_v | varchar2(20) |  |  | '~' |
| 25 | src_bill_code | src_bill_code | src_bill_code | varchar2(50) |
| 26 | src_bill_type | src_bill_type | src_bill_type | varchar2(20) |  |  | '~' |
| 27 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(20) |
| 28 | src_pk_verify | src_pk_verify | src_pk_verify | varchar2(20) |
| 29 | src_transi_type | src_transi_type | src_transi_type | varchar2(30) |
| 30 | tax | tax | tax | number(28, 8) |
| 31 | tot_taxmny | tot_taxmny | tot_taxmny | number(28, 8) |
| 32 | tot_taxmny_global | tot_taxmny_global | tot_taxmny_global | number(28, 8) |
| 33 | tot_taxmny_group | tot_taxmny_group | tot_taxmny_group | number(28, 8) |
| 34 | transi_type | transi_type | transi_type | varchar2(20) |
| 35 | verifier | verifier | verifier | varchar2(20) |  |  | '~' |
| 36 | verify_bill_code | verify_bill_code | verify_bill_code | varchar2(50) |
| 37 | verify_mny | verify_mny | verify_mny | number(28, 8) |
| 38 | verify_mny_global | verify_mny_global | verify_mny_global | number(28, 8) |
| 39 | verify_mny_group | verify_mny_group | verify_mny_group | number(28, 8) |
| 40 | verify_time | verify_time | verify_time | char(19) |
| 41 | hdef1 | hdef1 | hdef1 | varchar2(101) |
| 42 | hdef2 | hdef2 | hdef2 | varchar2(101) |
| 43 | hdef3 | hdef3 | hdef3 | varchar2(101) |
| 44 | hdef4 | hdef4 | hdef4 | varchar2(101) |
| 45 | hdef5 | hdef5 | hdef5 | varchar2(101) |
| 46 | hdef6 | hdef6 | hdef6 | varchar2(101) |
| 47 | hdef7 | hdef7 | hdef7 | varchar2(101) |
| 48 | hdef8 | hdef8 | hdef8 | varchar2(101) |
| 49 | hdef9 | hdef9 | hdef9 | varchar2(101) |
| 50 | hdef10 | hdef10 | hdef10 | varchar2(101) |
| 51 | hdef11 | hdef11 | hdef11 | varchar2(101) |
| 52 | hdef12 | hdef12 | hdef12 | varchar2(101) |
| 53 | hdef13 | hdef13 | hdef13 | varchar2(101) |
| 54 | hdef14 | hdef14 | hdef14 | varchar2(101) |
| 55 | hdef15 | hdef15 | hdef15 | varchar2(101) |
| 56 | hdef16 | hdef16 | hdef16 | varchar2(101) |
| 57 | hdef17 | hdef17 | hdef17 | varchar2(101) |
| 58 | hdef18 | hdef18 | hdef18 | varchar2(101) |
| 59 | hdef19 | hdef19 | hdef19 | varchar2(101) |
| 60 | hdef20 | hdef20 | hdef20 | varchar2(101) |
| 61 | creationtime | creationtime | creationtime | char(19) |
| 62 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 63 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 64 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 65 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 66 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |