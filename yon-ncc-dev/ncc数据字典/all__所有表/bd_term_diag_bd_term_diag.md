# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7113.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_diag | pk_diag | pk_diag | char(20) | √ |
| 2 | diagcode | diagcode | diagcode | varchar2(50) |
| 3 | diagname | diagname | diagname | varchar2(200) |
| 4 | diagname2 | diagname2 | diagname2 | varchar2(200) |
| 5 | diagname3 | diagname3 | diagname3 | varchar2(200) |
| 6 | diagname4 | diagname4 | diagname4 | varchar2(200) |
| 7 | diagname5 | diagname5 | diagname5 | varchar2(200) |
| 8 | diagname6 | diagname6 | diagname6 | varchar2(200) |
| 9 | dt_code_ehr | dt_code_ehr | dt_code_ehr | varchar2(50) |
| 10 | dt_code_ph | dt_code_ph | dt_code_ph | varchar2(50) |
| 11 | dt_system | dt_system | dt_system | varchar2(50) |
| 12 | eu_level | eu_level | eu_level | number(38, 0) |
| 13 | flag_pi | flag_pi | flag_pi | char(1) |
| 14 | innercode | innercode | innercode | varchar2(50) |
| 15 | mnecode | mnecode | mnecode | varchar2(50) |
| 16 | pk_code_ehr | pk_code_ehr | pk_code_ehr | varchar2(20) |  |  | '~' |
| 17 | pk_code_ph | pk_code_ph | pk_code_ph | varchar2(20) |  |  | '~' |
| 18 | pk_father | pk_father | pk_father | varchar2(20) |  |  | '~' |
| 19 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 20 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 21 | pk_system | pk_system | pk_system | varchar2(20) |  |  | '~' |
| 22 | creationtime | creationtime | creationtime | char(19) |
| 23 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 26 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |