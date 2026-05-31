# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10562.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_construction_permit | pk_construction_permit | pk_construction_permit | char(20) | √ |
| 2 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 3 | audittime | audittime | audittime | char(19) |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | billmaketime | billmaketime | billmaketime | char(19) |
| 6 | bill_code | bill_code | bill_code | varchar2(40) |
| 7 | bill_status | bill_status | bill_status | number(38, 0) |
| 8 | bill_type | bill_type | bill_type | varchar2(4) |
| 9 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 10 | check_opinion | check_opinion | check_opinion | varchar2(50) |
| 11 | construction_address | construction_address | construction_address | varchar2(100) |
| 12 | construction_control_unit | construction_control_unit | construction_control_unit | varchar2(100) |
| 13 | construction_permit_code | construction_permit_code | construction_permit_code | varchar2(50) |
| 14 | construction_scale | construction_scale | construction_scale | number(28, 8) |
| 15 | construction_unit | construction_unit | construction_unit | varchar2(100) |
| 16 | contract_end_date | contract_end_date | contract_end_date | char(19) |
| 17 | contract_start_date | contract_start_date | contract_start_date | char(19) |
| 18 | design_unit | design_unit | design_unit | varchar2(100) |
| 19 | engineering_name | engineering_name | engineering_name | varchar2(100) |
| 20 | memo | memo | memo | varchar2(200) |
| 21 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 22 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 23 | pk_operdept | pk_operdept | pk_operdept | varchar2(20) |  |  | '~' |
| 24 | pk_operdept_v | pk_operdept_v | pk_operdept_v | varchar2(20) |  |  | '~' |
| 25 | pk_operuser | pk_operuser | pk_operuser | varchar2(20) |  |  | '~' |
| 26 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 27 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 28 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 29 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 30 | reg_date | reg_date | reg_date | char(19) |
| 31 | transi_type | transi_type | transi_type | varchar2(30) |  |  | '~' |
| 32 | def1 | def1 | def1 | varchar2(101) |
| 33 | def2 | def2 | def2 | varchar2(101) |
| 34 | def3 | def3 | def3 | varchar2(101) |
| 35 | def4 | def4 | def4 | varchar2(101) |
| 36 | def5 | def5 | def5 | varchar2(101) |
| 37 | def6 | def6 | def6 | varchar2(101) |
| 38 | def7 | def7 | def7 | varchar2(101) |
| 39 | def8 | def8 | def8 | varchar2(101) |
| 40 | def9 | def9 | def9 | varchar2(101) |
| 41 | def10 | def10 | def10 | varchar2(101) |
| 42 | def11 | def11 | def11 | varchar2(101) |
| 43 | def12 | def12 | def12 | varchar2(101) |
| 44 | def13 | def13 | def13 | varchar2(101) |
| 45 | def14 | def14 | def14 | varchar2(101) |
| 46 | def15 | def15 | def15 | varchar2(101) |
| 47 | def16 | def16 | def16 | varchar2(101) |
| 48 | def17 | def17 | def17 | varchar2(101) |
| 49 | def18 | def18 | def18 | varchar2(101) |
| 50 | def19 | def19 | def19 | varchar2(101) |
| 51 | def20 | def20 | def20 | varchar2(101) |
| 52 | creationtime | creationtime | creationtime | char(19) |
| 53 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 54 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 55 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 56 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 57 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |