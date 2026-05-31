# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8029.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_team | pk_team | pk_team | char(20) | √ |
| 2 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 2 |
| 3 | memo | memo | memo | varchar2(200) |
| 4 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 5 | pk_leader | pk_leader | pk_leader | varchar2(20) |  |  | '~' |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |
| 8 | team_code | team_code | team_code | varchar2(40) |
| 9 | team_name | team_name | team_name | varchar2(120) |
| 10 | team_name2 | team_name2 | team_name2 | varchar2(120) |
| 11 | team_name3 | team_name3 | team_name3 | varchar2(120) |
| 12 | team_name4 | team_name4 | team_name4 | varchar2(120) |
| 13 | team_name5 | team_name5 | team_name5 | varchar2(120) |
| 14 | team_name6 | team_name6 | team_name6 | varchar2(120) |
| 15 | def1 | def1 | def1 | varchar2(101) |
| 16 | def2 | def2 | def2 | varchar2(101) |
| 17 | def3 | def3 | def3 | varchar2(101) |
| 18 | def4 | def4 | def4 | varchar2(101) |
| 19 | def5 | def5 | def5 | varchar2(101) |
| 20 | creationtime | creationtime | creationtime | char(19) |
| 21 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 24 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |