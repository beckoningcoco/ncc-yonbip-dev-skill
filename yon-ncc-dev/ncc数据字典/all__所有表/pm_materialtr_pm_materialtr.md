# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10628.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_materialtr | pk_materialtr | pk_materialtr | char(20) | √ |
| 2 | apply_dept | apply_dept | apply_dept | varchar2(20) |  |  | '~' |
| 3 | apply_dept_v | apply_dept_v | apply_dept_v | varchar2(20) |  |  | '~' |
| 4 | apply_person | apply_person | apply_person | varchar2(20) |  |  | '~' |
| 5 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 6 | audittime | audittime | audittime | char(19) |
| 7 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 8 | billmaketime | billmaketime | billmaketime | char(19) |
| 9 | bill_code | bill_code | bill_code | varchar2(40) |
| 10 | bill_status | bill_status | bill_status | number(38, 0) |
| 11 | bill_type | bill_type | bill_type | varchar2(4) |
| 12 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 13 | check_opinion | check_opinion | check_opinion | varchar2(50) |
| 14 | contract_name | contract_name | contract_name | varchar2(50) |
| 15 | datetransf | datetransf | datetransf | char(19) |
| 16 | memo | memo | memo | varchar2(200) |
| 17 | pk_contract | pk_contract | pk_contract | varchar2(50) |  |  | '~' |
| 18 | pk_contract_ext | pk_contract_ext | pk_contract_ext | varchar2(20) |  |  | '~' |
| 19 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 20 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 21 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 22 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 23 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 24 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 25 | pk_wbs | pk_wbs | pk_wbs | varchar2(20) |  |  | '~' |
| 26 | saga_btxid | saga_btxid | saga_btxid | varchar2(50) |
| 27 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 28 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(50) |
| 29 | saga_status | saga_status | saga_status | number(38, 0) |
| 30 | src_bill_code | src_bill_code | src_bill_code | varchar2(20) |
| 31 | src_bill_type | src_bill_type | src_bill_type | varchar2(4) |
| 32 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(20) |
| 33 | src_pk_transitype | src_pk_transitype | src_pk_transitype | varchar2(20) |
| 34 | src_transi_type | src_transi_type | src_transi_type | varchar2(30) |
| 35 | transi_type | transi_type | transi_type | varchar2(30) |
| 36 | def1 | def1 | def1 | varchar2(101) |
| 37 | def2 | def2 | def2 | varchar2(101) |
| 38 | def3 | def3 | def3 | varchar2(101) |
| 39 | def4 | def4 | def4 | varchar2(101) |
| 40 | def5 | def5 | def5 | varchar2(101) |
| 41 | def6 | def6 | def6 | varchar2(101) |
| 42 | def7 | def7 | def7 | varchar2(101) |
| 43 | def8 | def8 | def8 | varchar2(101) |
| 44 | def9 | def9 | def9 | varchar2(101) |
| 45 | def10 | def10 | def10 | varchar2(101) |
| 46 | def11 | def11 | def11 | varchar2(101) |
| 47 | def12 | def12 | def12 | varchar2(101) |
| 48 | def13 | def13 | def13 | varchar2(101) |
| 49 | def14 | def14 | def14 | varchar2(101) |
| 50 | def15 | def15 | def15 | varchar2(101) |
| 51 | def16 | def16 | def16 | varchar2(101) |
| 52 | def17 | def17 | def17 | varchar2(101) |
| 53 | def18 | def18 | def18 | varchar2(101) |
| 54 | def19 | def19 | def19 | varchar2(101) |
| 55 | def20 | def20 | def20 | varchar2(101) |
| 56 | creationtime | creationtime | creationtime | char(19) |
| 57 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 58 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 59 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 60 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 61 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |