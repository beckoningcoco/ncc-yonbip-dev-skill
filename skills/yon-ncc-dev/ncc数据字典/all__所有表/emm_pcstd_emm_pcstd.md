# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7871.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pcstd | pk_pcstd | pk_pcstd | char(20) | √ |
| 2 | bill_code | bill_code | bill_code | varchar2(40) |
| 3 | bill_type | bill_type | bill_type | varchar2(4) |
| 4 | edit_time | edit_time | edit_time | char(19) |
| 5 | enablestate | enablestate | enablestate | number(38, 0) |
| 6 | memo | memo | memo | varchar2(200) |
| 7 | pcobject | pcobject | pcobject | varchar2(150) |
| 8 | pcobject2 | pcobject2 | pcobject2 | varchar2(150) |
| 9 | pcobject3 | pcobject3 | pcobject3 | varchar2(150) |
| 10 | pcobject4 | pcobject4 | pcobject4 | varchar2(150) |
| 11 | pcobject5 | pcobject5 | pcobject5 | varchar2(150) |
| 12 | pcobject6 | pcobject6 | pcobject6 | varchar2(150) |
| 13 | pk_category | pk_category | pk_category | varchar2(20) |  |  | '~' |
| 14 | pk_editor | pk_editor | pk_editor | varchar2(20) |  |  | '~' |
| 15 | pk_edit_dept | pk_edit_dept | pk_edit_dept | varchar2(20) |  |  | '~' |
| 16 | pk_edit_dept_v | pk_edit_dept_v | pk_edit_dept_v | varchar2(20) |  |  | '~' |
| 17 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 18 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 19 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |
| 20 | pk_sealer | pk_sealer | pk_sealer | varchar2(20) |  |  | '~' |
| 21 | seal_time | seal_time | seal_time | char(19) |
| 22 | def1 | def1 | def1 | varchar2(101) |
| 23 | def2 | def2 | def2 | varchar2(101) |
| 24 | def3 | def3 | def3 | varchar2(101) |
| 25 | def4 | def4 | def4 | varchar2(101) |
| 26 | def5 | def5 | def5 | varchar2(101) |
| 27 | creationtime | creationtime | creationtime | char(19) |
| 28 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 29 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 30 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 31 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 32 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |