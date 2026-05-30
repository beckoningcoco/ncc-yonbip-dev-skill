# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8041.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wo_actual_tool | pk_wo_actual_tool | pk_wo_actual_tool | char(20) | √ |
| 2 | man_hours | man_hours | man_hours | number(28, 8) |  |  | 0 |
| 3 | memo | memo | memo | varchar2(200) |
| 4 | money | money | money | number(28, 8) |  |  | 0 |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |
| 7 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |
| 8 | pk_tool | pk_tool | pk_tool | varchar2(20) |  |  | '~' |
| 9 | pk_wo | pk_wo | pk_wo | char(20) | √ |
| 10 | rate | rate | rate | number(28, 8) |  |  | 0 |
| 11 | rowno | rowno | rowno | varchar2(30) |
| 12 | sequence_num | sequence_num | sequence_num | number(38, 0) |
| 13 | tools_num | tools_num | tools_num | number(38, 0) |  |  | 1 |
| 14 | def1 | def1 | def1 | varchar2(101) |
| 15 | def2 | def2 | def2 | varchar2(101) |
| 16 | def3 | def3 | def3 | varchar2(101) |
| 17 | def4 | def4 | def4 | varchar2(101) |
| 18 | def5 | def5 | def5 | varchar2(101) |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |