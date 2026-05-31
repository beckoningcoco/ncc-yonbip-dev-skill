# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7290.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_datamig_head | pk_datamig_head | pk_datamig_head | char(20) | √ |
| 2 | expfilename | expfilename | expfilename | varchar2(200) |
| 3 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 4 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 5 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 6 | pk_task | pk_task | pk_task | varchar2(50) |
| 7 | pk_workbook | pk_workbook | pk_workbook | char(20) |
| 8 | taskname | taskname | taskname | varchar2(50) |
| 9 | def1 | def1 | def1 | varchar2(100) |
| 10 | def2 | def2 | def2 | varchar2(100) |
| 11 | def3 | def3 | def3 | varchar2(100) |
| 12 | def4 | def4 | def4 | varchar2(100) |
| 13 | def5 | def5 | def5 | varchar2(100) |
| 14 | def6 | def6 | def6 | varchar2(100) |
| 15 | def7 | def7 | def7 | varchar2(100) |
| 16 | def8 | def8 | def8 | varchar2(100) |
| 17 | def9 | def9 | def9 | varchar2(100) |
| 18 | def10 | def10 | def10 | varchar2(100) |
| 19 | creationtime | creationtime | creationtime | char(19) |
| 20 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 23 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |