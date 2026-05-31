# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12433.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cp_ex | pk_cp_ex | pk_cp_ex | varchar2(20) | √ |
| 2 | code_diag | code_diag | code_diag | varchar2(32) |
| 3 | date_input | date_input | date_input | char(19) |
| 4 | date_output | date_output | date_output | char(19) |
| 5 | name_diag | name_diag | name_diag | varchar2(64) |
| 6 | pk_aber | pk_aber | pk_aber | char(20) |  |  | '~' |
| 7 | pk_cp | pk_cp | pk_cp | char(20) |  |  | '~' |
| 8 | pk_dept | pk_dept | pk_dept | varchar2(50) |
| 9 | pk_dept_ns | pk_dept_ns | pk_dept_ns | varchar2(50) |
| 10 | pk_group | pk_group | pk_group | varchar2(20) | √ |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 12 | pk_psn | pk_psn | pk_psn | char(20) |  |  | '~' |
| 13 | pk_pv | pk_pv | pk_pv | varchar2(20) |  |  | '~' |
| 14 | psn_name | psn_name | psn_name | varchar2(32) |
| 15 | statu_cp | statu_cp | statu_cp | varchar2(50) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |