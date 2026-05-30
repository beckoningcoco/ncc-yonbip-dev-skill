# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6962.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_intercodemap | pk_intercodemap | pk_intercodemap | char(20) | √ |
| 2 | cremethod | cremethod | cremethod | number(38, 0) |
| 3 | cretime | cretime | cretime | char(19) |
| 4 | dataitemcode | dataitemcode | dataitemcode | varchar2(256) |
| 5 | dataitemname | dataitemname | dataitemname | varchar2(256) |
| 6 | exter_java_fmt_code | exter_java_fmt_code | exter_java_fmt_code | varchar2(50) |
| 7 | exter_sys_code | exter_sys_code | exter_sys_code | varchar2(50) |
| 8 | exter_sys_dbcode | exter_sys_dbcode | exter_sys_dbcode | varchar2(50) |
| 9 | exter_sys_name | exter_sys_name | exter_sys_name | varchar2(256) |
| 10 | exter_value | exter_value | exter_value | varchar2(4000) |
| 11 | exter_value_type | exter_value_type | exter_value_type | varchar2(50) |
| 12 | inter_java_fmt_code | inter_java_fmt_code | inter_java_fmt_code | varchar2(50) |
| 13 | inter_value | inter_value | inter_value | varchar2(4000) |
| 14 | inter_value_type | inter_value_type | inter_value_type | varchar2(50) |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 16 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |