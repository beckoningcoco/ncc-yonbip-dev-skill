# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10712.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_surbillestimate | pk_surbillestimate | pk_surbillestimate | char(20) | √ |
| 2 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 3 | audittime | audittime | audittime | char(19) |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | billmaketime | billmaketime | billmaketime | char(19) |
| 6 | bill_code | bill_code | bill_code | varchar2(40) |
| 7 | bill_status | bill_status | bill_status | number(38, 0) |
| 8 | bill_type | bill_type | bill_type | varchar2(50) |  |  | '~' |
| 9 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 10 | calcostmny | calcostmny | calcostmny | number(28, 8) |
| 11 | check_opinion | check_opinion | check_opinion | varchar2(50) |
| 12 | contract_code | contract_code | contract_code | varchar2(50) |
| 13 | estimater | estimater | estimater | varchar2(200) |  |  | '~' |
| 14 | estimater_date | estimater_date | estimater_date | char(19) |
| 15 | estimate_mny | estimate_mny | estimate_mny | number(28, 8) |
| 16 | estimate_tax | estimate_tax | estimate_tax | number(28, 8) |
| 17 | estimate_taxmny | estimate_taxmny | estimate_taxmny | number(28, 8) |
| 18 | memo | memo | memo | varchar2(200) |
| 19 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 20 | pk_estimate_dept | pk_estimate_dept | pk_estimate_dept | varchar2(20) |  |  | '~' |
| 21 | pk_estimate_dept_v | pk_estimate_dept_v | pk_estimate_dept_v | varchar2(20) |  |  | '~' |
| 22 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 23 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 24 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 25 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 26 | pk_receiptregister | pk_receiptregister | pk_receiptregister | varchar2(20) |  |  | '~' |
| 27 | pk_receiptverify | pk_receiptverify | pk_receiptverify | varchar2(50) |
| 28 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 29 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 30 | src_billtype | src_billtype | src_billtype | varchar2(20) |  |  | '~' |
| 31 | src_bill_code | src_bill_code | src_bill_code | varchar2(40) |
| 32 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(20) |  |  | '~' |
| 33 | transi_type | transi_type | transi_type | varchar2(30) |
| 34 | def1 | def1 | def1 | varchar2(101) |
| 35 | def2 | def2 | def2 | varchar2(101) |
| 36 | def3 | def3 | def3 | varchar2(101) |
| 37 | def4 | def4 | def4 | varchar2(101) |
| 38 | def5 | def5 | def5 | varchar2(101) |
| 39 | def6 | def6 | def6 | varchar2(101) |
| 40 | def7 | def7 | def7 | varchar2(101) |
| 41 | def8 | def8 | def8 | varchar2(101) |
| 42 | def9 | def9 | def9 | varchar2(101) |
| 43 | def10 | def10 | def10 | varchar2(101) |
| 44 | def11 | def11 | def11 | varchar2(101) |
| 45 | def12 | def12 | def12 | varchar2(101) |
| 46 | def13 | def13 | def13 | varchar2(101) |
| 47 | def14 | def14 | def14 | varchar2(101) |
| 48 | def15 | def15 | def15 | varchar2(101) |
| 49 | def16 | def16 | def16 | varchar2(101) |
| 50 | def17 | def17 | def17 | varchar2(101) |
| 51 | def18 | def18 | def18 | varchar2(101) |
| 52 | def19 | def19 | def19 | varchar2(101) |
| 53 | def20 | def20 | def20 | varchar2(101) |
| 54 | creationtime | creationtime | creationtime | char(19) |
| 55 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 56 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 57 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 58 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 59 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |