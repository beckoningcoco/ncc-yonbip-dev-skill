# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8124.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_depprogram | pk_depprogram | pk_depprogram | char(20) | √ |
| 2 | enablestate | enablestate | enablestate | number(38, 0) |
| 3 | pk_depmethod | pk_depmethod | pk_depmethod | varchar2(20) |  |  | '~' |
| 4 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 5 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 6 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 7 | program_code | program_code | program_code | varchar2(40) |
| 8 | program_name | program_name | program_name | varchar2(120) |
| 9 | program_name2 | program_name2 | program_name2 | varchar2(120) |
| 10 | program_name3 | program_name3 | program_name3 | varchar2(120) |
| 11 | program_name4 | program_name4 | program_name4 | varchar2(120) |
| 12 | program_name5 | program_name5 | program_name5 | varchar2(120) |
| 13 | program_name6 | program_name6 | program_name6 | varchar2(120) |
| 14 | remark | remark | remark | varchar2(200) |
| 15 | sim_accudep | sim_accudep | sim_accudep | number(28, 8) |
| 16 | sim_localoriginvalue | sim_localoriginvalue | sim_localoriginvalue | number(28, 8) |
| 17 | sim_predevaluate | sim_predevaluate | sim_predevaluate | number(28, 8) |
| 18 | sim_predevaluaterate | sim_predevaluaterate | sim_predevaluaterate | number(28, 8) |
| 19 | sim_salvagerate | sim_salvagerate | sim_salvagerate | number(28, 8) |
| 20 | sim_salvalue | sim_salvalue | sim_salvalue | number(28, 8) |
| 21 | sim_servicemonth | sim_servicemonth | sim_servicemonth | number(38, 0) |
| 22 | creationtime | creationtime | creationtime | char(19) |
| 23 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 26 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |