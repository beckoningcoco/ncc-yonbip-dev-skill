# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7148.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_disease | pk_disease | pk_disease | char(20) | √ |
| 2 | amount | amount | amount | number(14, 2) |
| 3 | flag_active | flag_active | flag_active | char(1) |
| 4 | mnecode | mnecode | mnecode | varchar2(50) |
| 5 | name_disease | name_disease | name_disease | varchar2(256) |
| 6 | note | note | note | varchar2(256) |
| 7 | pk_diag | pk_diag | pk_diag | varchar2(50) |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_hp | pk_hp | pk_hp | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | pk_pvtype | pk_pvtype | pk_pvtype | varchar2(20) |  |  | '~' |
| 12 | sortnum | sortnum | sortnum | number(38, 0) |
| 13 | def1 | def1 | def1 | varchar2(50) |
| 14 | def2 | def2 | def2 | varchar2(50) |
| 15 | def3 | def3 | def3 | varchar2(50) |
| 16 | def4 | def4 | def4 | varchar2(50) |
| 17 | def5 | def5 | def5 | varchar2(50) |
| 18 | def6 | def6 | def6 | varchar2(50) |
| 19 | def7 | def7 | def7 | varchar2(50) |
| 20 | def8 | def8 | def8 | varchar2(50) |
| 21 | def9 | def9 | def9 | varchar2(50) |
| 22 | creationtime | creationtime | creationtime | char(19) |
| 23 | creator | creator | creator | char(20) |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 26 | modifier | modifier | modifier | varchar2(50) |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |