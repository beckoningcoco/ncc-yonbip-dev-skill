# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12492.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_emrver | pk_emrver | pk_emrver | char(20) | √ |
| 2 | date_comfirm | date_comfirm | date_comfirm | char(19) |
| 3 | date_edit | date_edit | date_edit | char(19) |
| 4 | desc_emredit | desc_emredit | desc_emredit | varchar2(256) |
| 5 | dt_emredit | dt_emredit | dt_emredit | varchar2(20) |
| 6 | flag_newver | flag_newver | flag_newver | char(1) |
| 7 | name_dept_comfirm | name_dept_comfirm | name_dept_comfirm | varchar2(50) |
| 8 | name_psn_edit | name_psn_edit | name_psn_edit | varchar2(50) |
| 9 | pk_dept_comfirm | pk_dept_comfirm | pk_dept_comfirm | varchar2(20) |  |  | '~' |
| 10 | pk_emr | pk_emr | pk_emr | varchar2(20) |  |  | '~' |
| 11 | pk_emredit | pk_emredit | pk_emredit | varchar2(20) |  |  | '~' |
| 12 | pk_emrsec | pk_emrsec | pk_emrsec | varchar2(20) |  |  | '~' |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | pk_org | pk_org | pk_org | varchar2(50) |  |  | '~' |
| 15 | pk_psn_edit | pk_psn_edit | pk_psn_edit | varchar2(20) |  |  | '~' |
| 16 | verno | verno | verno | varchar2(20) |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |