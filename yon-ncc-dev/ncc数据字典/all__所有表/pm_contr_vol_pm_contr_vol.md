# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10578.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contr_vol | pk_contr_vol | pk_contr_vol | char(20) | √ |
| 2 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 3 | audittime | audittime | audittime | char(19) |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | billmaketime | billmaketime | billmaketime | char(19) |
| 6 | bill_code | bill_code | bill_code | varchar2(20) |
| 7 | bill_data | bill_data | bill_data | char(19) |
| 8 | bill_status | bill_status | bill_status | number(38, 0) |
| 9 | bill_type | bill_type | bill_type | varchar2(50) |
| 10 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 11 | check_opinion | check_opinion | check_opinion | varchar2(101) |
| 12 | comp_taxmny | comp_taxmny | comp_taxmny | number(28, 8) |
| 13 | cum_comp_taxmny | cum_comp_taxmny | cum_comp_taxmny | number(28, 8) |
| 14 | curr_taxmny | curr_taxmny | curr_taxmny | number(28, 8) |
| 15 | memo | memo | memo | varchar2(200) |
| 16 | pk_contr | pk_contr | pk_contr | varchar2(20) |  |  | '~' |
| 17 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 18 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 19 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 20 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 21 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 22 | pk_transactor | pk_transactor | pk_transactor | varchar2(20) |  |  | '~' |
| 23 | pk_transact_dept | pk_transact_dept | pk_transact_dept | varchar2(20) |  |  | '~' |
| 24 | pk_transact_dept_v | pk_transact_dept_v | pk_transact_dept_v | varchar2(20) |  |  | '~' |
| 25 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 26 | src_bill_code | src_bill_code | src_bill_code | varchar2(20) |
| 27 | src_bill_type | src_bill_type | src_bill_type | varchar2(20) |
| 28 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(20) |
| 29 | src_pk_transitype | src_pk_transitype | src_pk_transitype | varchar2(20) |
| 30 | src_transi_type | src_transi_type | src_transi_type | varchar2(20) |
| 31 | this_comp_taxmny | this_comp_taxmny | this_comp_taxmny | number(28, 8) |
| 32 | transi_type | transi_type | transi_type | varchar2(20) |
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