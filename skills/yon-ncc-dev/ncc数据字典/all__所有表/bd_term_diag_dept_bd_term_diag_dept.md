# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7114.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_diagdept | pk_diagdept | pk_diagdept | char(20) | √ |
| 2 | describe | describe | describe | varchar2(256) |
| 3 | diagcode | diagcode | diagcode | varchar2(50) |
| 4 | dt_system | dt_system | dt_system | varchar2(50) |
| 5 | flag_dept | flag_dept | flag_dept | char(1) |
| 6 | mnecode | mnecode | mnecode | varchar2(50) |
| 7 | name | name | name | varchar2(50) |
| 8 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 9 | pk_diag | pk_diag | pk_diag | varchar2(20) |  |  | '~' |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |
| 13 | sortno | sortno | sortno | varchar2(50) |
| 14 | creationtime | creationtime | creationtime | char(19) |
| 15 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 18 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |