# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/13068.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | dataitemcode | dataitemcode | dataitemcode | varchar2(256) |
| 2 | dataitemname | dataitemname | dataitemname | varchar2(256) |
| 3 | exter_name | exter_name | exter_name | varchar2(50) |
| 4 | exter_sys_code | exter_sys_code | exter_sys_code | varchar2(50) |  |  | 'Appointment' |
| 5 | exter_sys_dbcode | exter_sys_dbcode | exter_sys_dbcode | varchar2(50) |  |  | 'MYSQL' |
| 6 | exter_sys_name | exter_sys_name | exter_sys_name | varchar2(256) |  |  | '棰？绾？？？？？' |
| 7 | exter_value | exter_value | exter_value | varchar2(4000) |
| 8 | exter_value_type | exter_value_type | exter_value_type | varchar2(50) |  |  | 'String' |
| 9 | inter_name | inter_name | inter_name | varchar2(4000) |
| 10 | inter_value | inter_value | inter_value | varchar2(4000) |
| 11 | inter_value_type | inter_value_type | inter_value_type | varchar2(50) |  |  | 'String' |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | pk_zzintercodemap | pk_zzintercodemap | pk_zzintercodemap | char(20) | √ |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |