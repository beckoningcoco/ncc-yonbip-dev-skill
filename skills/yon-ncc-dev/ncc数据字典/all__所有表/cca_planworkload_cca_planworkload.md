# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7416.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_planworkload | pk_planworkload | pk_planworkload | char(20) | √ |
| 2 | pk_accperiod | pk_accperiod | pk_accperiod | varchar2(20) |  |  | '~' |
| 3 | pk_activity | pk_activity | pk_activity | varchar2(20) |  |  | '~' |
| 4 | pk_costcenter | pk_costcenter | pk_costcenter | varchar2(20) |  |  | '~' |
| 5 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 9 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 10 | pk_wk | pk_wk | pk_wk | varchar2(20) |  |  | '~' |
| 11 | realworkload | realworkload | realworkload | number(28, 8) |
| 12 | source | source | source | number(38, 0) |
| 13 | workload | workload | workload | number(28, 8) |
| 14 | def1 | def1 | def1 | varchar2(101) |
| 15 | def2 | def2 | def2 | varchar2(101) |
| 16 | def3 | def3 | def3 | varchar2(101) |
| 17 | def4 | def4 | def4 | varchar2(101) |
| 18 | def5 | def5 | def5 | varchar2(101) |
| 19 | def6 | def6 | def6 | varchar2(101) |
| 20 | def7 | def7 | def7 | varchar2(101) |
| 21 | def8 | def8 | def8 | varchar2(101) |
| 22 | def9 | def9 | def9 | varchar2(101) |
| 23 | def10 | def10 | def10 | varchar2(101) |
| 24 | creationtime | creationtime | creationtime | char(19) |
| 25 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 26 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 27 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 28 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 29 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |