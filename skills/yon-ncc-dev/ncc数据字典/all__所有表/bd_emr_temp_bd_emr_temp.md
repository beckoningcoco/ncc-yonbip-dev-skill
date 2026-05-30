# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6908.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_emrtemp | pk_emrtemp | pk_emrtemp | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | code_std | code_std | code_std | varchar2(50) |
| 4 | date_create | date_create | date_create | char(19) |
| 5 | dt_emrtempfiletype | dt_emrtempfiletype | dt_emrtempfiletype | varchar2(20) |
| 6 | emrtempverno | emrtempverno | emrtempverno | varchar2(50) |
| 7 | emrtypefilename | emrtypefilename | emrtypefilename | varchar2(50) |
| 8 | eu_applyto | eu_applyto | eu_applyto | number(38, 0) |
| 9 | eu_emrtempright | eu_emrtempright | eu_emrtempright | number(38, 0) |
| 10 | eu_fsmode | eu_fsmode | eu_fsmode | number(38, 0) |
| 11 | eu_page_mode | eu_page_mode | eu_page_mode | number(38, 0) |
| 12 | eu_show_node | eu_show_node | eu_show_node | number(38, 0) |
| 13 | flag_active | flag_active | flag_active | char(1) |
| 14 | flag_def_use | flag_def_use | flag_def_use | char(1) |
| 15 | flag_needchk | flag_needchk | flag_needchk | char(1) |
| 16 | func_editor | func_editor | func_editor | varchar2(150) |
| 17 | func_editor_argu | func_editor_argu | func_editor_argu | varchar2(4000) |
| 18 | last_file_md5 | last_file_md5 | last_file_md5 | varchar2(256) |
| 19 | mix_emrtemp_codes | mix_emrtemp_codes | mix_emrtemp_codes | varchar2(1024) |
| 20 | name | name | name | varchar2(100) |
| 21 | pk_dept_create | pk_dept_create | pk_dept_create | varchar2(20) |  |  | '~' |
| 22 | pk_editor | pk_editor | pk_editor | varchar2(20) |  |  | '~' |
| 23 | pk_emrtempfiletype | pk_emrtempfiletype | pk_emrtempfiletype | varchar2(20) |  |  | '~' |
| 24 | pk_emrtype | pk_emrtype | pk_emrtype | varchar2(20) |  |  | '~' |
| 25 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 26 | pk_org | pk_org | pk_org | varchar2(50) |  |  | '~' |
| 27 | pk_org_create | pk_org_create | pk_org_create | varchar2(20) |  |  | '~' |
| 28 | pk_org_use | pk_org_use | pk_org_use | varchar2(20) |  |  | '~' |
| 29 | pk_org_v | pk_org_v | pk_org_v | varchar2(50) |  |  | '~' |
| 30 | pk_psn_create | pk_psn_create | pk_psn_create | varchar2(20) |  |  | '~' |
| 31 | pk_pvtype | pk_pvtype | pk_pvtype | varchar2(20) |  |  | '~' |
| 32 | show_name | show_name | show_name | varchar2(100) |
| 33 | sortno | sortno | sortno | varchar2(50) |
| 34 | creationtime | creationtime | creationtime | char(19) |
| 35 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 36 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 37 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 38 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 39 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |