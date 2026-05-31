# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10609.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ptmfileapprove | pk_ptmfileapprove | pk_ptmfileapprove | char(20) | √ |
| 2 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 3 | audittime | audittime | audittime | char(19) |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | billmaketime | billmaketime | billmaketime | char(19) |
| 6 | bill_code | bill_code | bill_code | varchar2(50) |
| 7 | bill_status | bill_status | bill_status | number(38, 0) |
| 8 | bill_type | bill_type | bill_type | varchar2(50) |
| 9 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 10 | check_opinion | check_opinion | check_opinion | varchar2(50) |
| 11 | file_code | file_code | file_code | varchar2(30) |
| 12 | file_content | file_content | file_content | varchar2(400) |
| 13 | pk_customer | pk_customer | pk_customer | varchar2(20) |  |  | '~' |
| 14 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 15 | pk_operdept | pk_operdept | pk_operdept | varchar2(20) |  |  | '~' |
| 16 | pk_operdept_v | pk_operdept_v | pk_operdept_v | varchar2(20) |  |  | '~' |
| 17 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 18 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 19 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 20 | pk_transtype | pk_transtype | pk_transtype | varchar2(20) |  |  | '~' |
| 21 | project_name | project_name | project_name | varchar2(300) |
| 22 | project_name2 | project_name2 | project_name2 | varchar2(300) |
| 23 | project_name3 | project_name3 | project_name3 | varchar2(300) |
| 24 | project_name4 | project_name4 | project_name4 | varchar2(300) |
| 25 | project_name5 | project_name5 | project_name5 | varchar2(300) |
| 26 | project_name6 | project_name6 | project_name6 | varchar2(300) |
| 27 | project_type | project_type | project_type | varchar2(20) |  |  | '~' |
| 28 | pt_begin_time | pt_begin_time | pt_begin_time | char(19) |
| 29 | pt_price | pt_price | pt_price | number(28, 8) |
| 30 | pt_principal | pt_principal | pt_principal | varchar2(20) |  |  | '~' |
| 31 | pt_risk | pt_risk | pt_risk | varchar2(400) |
| 32 | src_billid | src_billid | src_billid | varchar2(50) |
| 33 | src_bill_type | src_bill_type | src_bill_type | varchar2(50) |
| 34 | src_pk_bill | src_pk_bill | src_pk_bill | varchar2(50) |
| 35 | transi_type | transi_type | transi_type | varchar2(50) |
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