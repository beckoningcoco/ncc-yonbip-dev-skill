# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12463.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_emr | pk_emr | pk_emr | char(20) | √ |
| 2 | code_emr | code_emr | code_emr | varchar2(100) |
| 3 | code_pvtype | code_pvtype | code_pvtype | varchar2(30) |
| 4 | date_chk | date_chk | date_chk | char(19) |
| 5 | date_entry | date_entry | date_entry | char(19) |
| 6 | date_sign | date_sign | date_sign | char(19) |
| 7 | emrtempsecfs | emrtempsecfs | emrtempsecfs | blob |
| 8 | eu_applyto | eu_applyto | eu_applyto | number(38, 0) |
| 9 | eu_fsmode | eu_fsmode | eu_fsmode | number(38, 0) |
| 10 | eu_page_mode | eu_page_mode | eu_page_mode | number(38, 0) |
| 11 | eu_show_node | eu_show_node | eu_show_node | number(38, 0) |
| 12 | eu_status | eu_status | eu_status | number(38, 0) |
| 13 | flag_needchk | flag_needchk | flag_needchk | char(1) |
| 14 | func_editor | func_editor | func_editor | varchar2(150) |
| 15 | func_edtor_argu | func_edtor_argu | func_edtor_argu | varchar2(4000) |
| 16 | grade_qa | grade_qa | grade_qa | number(14, 2) |
| 17 | last_file_md5 | last_file_md5 | last_file_md5 | varchar2(256) |
| 18 | name_emr | name_emr | name_emr | varchar2(60) |
| 19 | name_psn_chk | name_psn_chk | name_psn_chk | varchar2(50) |
| 20 | name_psn_entry | name_psn_entry | name_psn_entry | varchar2(50) |
| 21 | name_psn_sign | name_psn_sign | name_psn_sign | varchar2(50) |
| 22 | newborno | newborno | newborno | number(38, 0) |
| 23 | note | note | note | varchar2(256) |
| 24 | pk_cnet | pk_cnet | pk_cnet | varchar2(50) |  |  | '~' |
| 25 | pk_dept_emr | pk_dept_emr | pk_dept_emr | varchar2(20) |  |  | '~' |
| 26 | pk_editor | pk_editor | pk_editor | varchar2(20) |  |  | '~' |
| 27 | pk_emrtemp | pk_emrtemp | pk_emrtemp | varchar2(20) |  |  | '~' |
| 28 | pk_emrtype | pk_emrtype | pk_emrtype | varchar2(20) |  |  | '~' |
| 29 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 30 | pk_org | pk_org | pk_org | varchar2(50) |  |  | '~' |
| 31 | pk_org_v | pk_org_v | pk_org_v | varchar2(50) |  |  | '~' |
| 32 | pk_pati | pk_pati | pk_pati | varchar2(50) |  |  | '~' |
| 33 | pk_psn_chk | pk_psn_chk | pk_psn_chk | varchar2(20) |  |  | '~' |
| 34 | pk_psn_entry | pk_psn_entry | pk_psn_entry | varchar2(20) |  |  | '~' |
| 35 | pk_psn_sign | pk_psn_sign | pk_psn_sign | varchar2(20) |  |  | '~' |
| 36 | pk_pv | pk_pv | pk_pv | varchar2(50) |  |  | '~' |
| 37 | pk_pvtype | pk_pvtype | pk_pvtype | varchar2(50) |  |  | '~' |
| 38 | def1 | def1 | def1 | varchar2(50) |
| 39 | def2 | def2 | def2 | varchar2(50) |
| 40 | def3 | def3 | def3 | varchar2(50) |
| 41 | creationtime | creationtime | creationtime | char(19) |
| 42 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 43 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 44 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 45 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 46 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |