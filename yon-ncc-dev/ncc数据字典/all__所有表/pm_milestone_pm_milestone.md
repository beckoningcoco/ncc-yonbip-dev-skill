# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10647.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_milestone | pk_milestone | pk_milestone | char(20) | √ |
| 2 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 2 |
| 3 | memo | memo | memo | varchar2(200) |
| 4 | milestone_code | milestone_code | milestone_code | varchar2(200) | √ |
| 5 | milestone_name | milestone_name | milestone_name | varchar2(300) | √ |
| 6 | milestone_name2 | milestone_name2 | milestone_name2 | varchar2(300) |
| 7 | milestone_name3 | milestone_name3 | milestone_name3 | varchar2(300) |
| 8 | milestone_name4 | milestone_name4 | milestone_name4 | varchar2(300) |
| 9 | milestone_name5 | milestone_name5 | milestone_name5 | varchar2(300) |
| 10 | milestone_name6 | milestone_name6 | milestone_name6 | varchar2(300) |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 13 | def1 | def1 | def1 | varchar2(101) |
| 14 | def2 | def2 | def2 | varchar2(101) |
| 15 | def3 | def3 | def3 | varchar2(101) |
| 16 | def4 | def4 | def4 | varchar2(101) |
| 17 | def5 | def5 | def5 | varchar2(101) |
| 18 | def6 | def6 | def6 | varchar2(101) |
| 19 | def7 | def7 | def7 | varchar2(101) |
| 20 | def8 | def8 | def8 | varchar2(101) |
| 21 | def9 | def9 | def9 | varchar2(101) |
| 22 | def10 | def10 | def10 | varchar2(101) |
| 23 | creationtime | creationtime | creationtime | char(19) |
| 24 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 25 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 26 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 27 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 28 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |