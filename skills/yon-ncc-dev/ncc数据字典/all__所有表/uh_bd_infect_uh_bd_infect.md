# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12369.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_infect | pk_infect | pk_infect | char(20) | √ |
| 2 | code | code | code | varchar2(30) |
| 3 | code_diag | code_diag | code_diag | varchar2(50) | √ |
| 4 | infect_type | infect_type | infect_type | varchar2(50) | √ |
| 5 | mnecode | mnecode | mnecode | varchar2(30) |
| 6 | name | name | name | varchar2(100) |
| 7 | name_diag | name_diag | name_diag | varchar2(150) | √ |
| 8 | name_infect | name_infect | name_infect | varchar2(150) | √ |
| 9 | pk_diag | pk_diag | pk_diag | varchar2(20) | √ |  | '~' |
| 10 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 11 | pk_org | pk_org | pk_org | varchar2(20) | √ |  | '~' |
| 12 | report_once | report_once | report_once | char(50) |
| 13 | statutory | statutory | statutory | char(1) | √ |
| 14 | sup_card | sup_card | sup_card | varchar2(50) |
| 15 | def1 | def1 | def1 | varchar2(100) |
| 16 | def2 | def2 | def2 | varchar2(100) |
| 17 | def3 | def3 | def3 | varchar2(100) |
| 18 | def4 | def4 | def4 | varchar2(100) |
| 19 | def5 | def5 | def5 | varchar2(100) |
| 20 | def6 | def6 | def6 | varchar2(100) |
| 21 | def7 | def7 | def7 | varchar2(100) |
| 22 | def8 | def8 | def8 | varchar2(100) |
| 23 | def9 | def9 | def9 | varchar2(100) |
| 24 | def10 | def10 | def10 | varchar2(100) |
| 25 | def11 | def11 | def11 | varchar2(100) |
| 26 | def12 | def12 | def12 | varchar2(100) |
| 27 | def13 | def13 | def13 | varchar2(100) |
| 28 | def14 | def14 | def14 | varchar2(100) |
| 29 | def15 | def15 | def15 | varchar2(100) |
| 30 | def16 | def16 | def16 | varchar2(100) |
| 31 | def17 | def17 | def17 | varchar2(100) |
| 32 | def18 | def18 | def18 | varchar2(100) |
| 33 | def19 | def19 | def19 | varchar2(100) |
| 34 | def20 | def20 | def20 | varchar2(100) |
| 35 | creationtime | creationtime | creationtime | char(19) |
| 36 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 37 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 38 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 39 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 40 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |