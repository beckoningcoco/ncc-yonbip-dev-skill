# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10677.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_projectregister | pk_projectregister | pk_projectregister | char(20) | √ |
| 2 | auditor | auditor | auditor | varchar2(20) |  |  | '~' |
| 3 | audittime | audittime | audittime | char(19) |
| 4 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 5 | billmaketime | billmaketime | billmaketime | char(19) |
| 6 | bill_code | bill_code | bill_code | varchar2(40) |
| 7 | bill_status | bill_status | bill_status | number(38, 0) |
| 8 | bill_type | bill_type | bill_type | varchar2(4) |
| 9 | builfreason | builfreason | builfreason | varchar2(200) |
| 10 | busi_type | busi_type | busi_type | varchar2(20) |  |  | '~' |
| 11 | check_opinion | check_opinion | check_opinion | varchar2(50) |
| 12 | customer_name | customer_name | customer_name | varchar2(101) |
| 13 | description | description | description | varchar2(200) |
| 14 | estimate_global | estimate_global | estimate_global | number(28, 8) |
| 15 | estimate_group | estimate_group | estimate_group | number(28, 8) |
| 16 | estimate_mn | estimate_mn | estimate_mn | number(28, 8) |
| 17 | info_status | info_status | info_status | varchar2(50) |
| 18 | is_refed | is_refed | is_refed | varchar2(50) |  |  | '~' |
| 19 | memo | memo | memo | varchar2(200) |
| 20 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 21 | pk_eps | pk_eps | pk_eps | varchar2(20) |  |  | '~' |
| 22 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 23 | pk_operdept | pk_operdept | pk_operdept | varchar2(20) |  |  | '~' |
| 24 | pk_operdept_v | pk_operdept_v | pk_operdept_v | varchar2(20) |  |  | '~' |
| 25 | pk_operuser | pk_operuser | pk_operuser | varchar2(20) |  |  | '~' |
| 26 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 27 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 28 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 29 | pk_projectclass | pk_projectclass | pk_projectclass | varchar2(20) |  |  | '~' |
| 30 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 31 | project_name | project_name | project_name | varchar2(450) |
| 32 | project_name2 | project_name2 | project_name2 | varchar2(450) |
| 33 | project_name3 | project_name3 | project_name3 | varchar2(450) |
| 34 | project_name4 | project_name4 | project_name4 | varchar2(450) |
| 35 | project_name5 | project_name5 | project_name5 | varchar2(450) |
| 36 | project_name6 | project_name6 | project_name6 | varchar2(450) |
| 37 | project_sh_name | project_sh_name | project_sh_name | varchar2(80) |
| 38 | reg_date | reg_date | reg_date | char(19) |
| 39 | reqduration | reqduration | reqduration | number(38, 0) |
| 40 | req_finish_date | req_finish_date | req_finish_date | char(19) |
| 41 | req_start_date | req_start_date | req_start_date | char(19) |
| 42 | sharetype | sharetype | sharetype | number(38, 0) |
| 43 | transi_type | transi_type | transi_type | varchar2(30) |  |  | '~' |
| 44 | def1 | def1 | def1 | varchar2(101) |
| 45 | def2 | def2 | def2 | varchar2(101) |
| 46 | def3 | def3 | def3 | varchar2(101) |
| 47 | def4 | def4 | def4 | varchar2(101) |
| 48 | def5 | def5 | def5 | varchar2(101) |
| 49 | def6 | def6 | def6 | varchar2(101) |
| 50 | def7 | def7 | def7 | varchar2(101) |
| 51 | def8 | def8 | def8 | varchar2(101) |
| 52 | def9 | def9 | def9 | varchar2(101) |
| 53 | def10 | def10 | def10 | varchar2(101) |
| 54 | def11 | def11 | def11 | varchar2(101) |
| 55 | def12 | def12 | def12 | varchar2(101) |
| 56 | def13 | def13 | def13 | varchar2(101) |
| 57 | def14 | def14 | def14 | varchar2(101) |
| 58 | def15 | def15 | def15 | varchar2(101) |
| 59 | def16 | def16 | def16 | varchar2(101) |
| 60 | def17 | def17 | def17 | varchar2(101) |
| 61 | def18 | def18 | def18 | varchar2(101) |
| 62 | def19 | def19 | def19 | varchar2(101) |
| 63 | def20 | def20 | def20 | varchar2(101) |
| 64 | creationtime | creationtime | creationtime | char(19) |
| 65 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 66 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 67 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 68 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 69 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |