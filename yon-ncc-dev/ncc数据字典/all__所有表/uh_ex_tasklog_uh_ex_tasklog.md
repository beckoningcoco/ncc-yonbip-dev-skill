# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12617.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tasklog | pk_tasklog | pk_tasklog | char(20) | √ |
| 2 | date_execbegin | date_execbegin | date_execbegin | char(19) |
| 3 | date_execend | date_execend | date_execend | char(19) |
| 4 | errmsg | errmsg | errmsg | varchar2(4000) |
| 5 | flag_succ | flag_succ | flag_succ | char(19) |
| 6 | ipaddr | ipaddr | ipaddr | varchar2(100) |
| 7 | name_psn_exec | name_psn_exec | name_psn_exec | varchar2(50) |
| 8 | para | para | para | varchar2(500) |
| 9 | pk_dept | pk_dept | pk_dept | char(20) |
| 10 | pk_group | pk_group | pk_group | char(20) |
| 11 | pk_org | pk_org | pk_org | char(20) |
| 12 | pk_psn_exec | pk_psn_exec | pk_psn_exec | char(20) |
| 13 | task | task | task | varchar2(100) |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |