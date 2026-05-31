# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10460.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tool | pk_tool | pk_tool | char(20) | √ |
| 2 | enablestate | enablestate | enablestate | number(38, 0) |
| 3 | memo | memo | memo | varchar2(200) |
| 4 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 5 | pk_measdoc | pk_measdoc | pk_measdoc | varchar2(20) |  |  | '~' |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | rowno | rowno | rowno | varchar2(30) |
| 8 | std_rate | std_rate | std_rate | number(20, 8) |
| 9 | tool_code | tool_code | tool_code | varchar2(40) |
| 10 | tool_name | tool_name | tool_name | varchar2(120) |
| 11 | tool_name2 | tool_name2 | tool_name2 | varchar2(120) |
| 12 | tool_name3 | tool_name3 | tool_name3 | varchar2(120) |
| 13 | tool_name4 | tool_name4 | tool_name4 | varchar2(120) |
| 14 | tool_name5 | tool_name5 | tool_name5 | varchar2(120) |
| 15 | tool_name6 | tool_name6 | tool_name6 | varchar2(120) |
| 16 | def1 | def1 | def1 | varchar2(101) |
| 17 | def2 | def2 | def2 | varchar2(101) |
| 18 | def3 | def3 | def3 | varchar2(101) |
| 19 | def4 | def4 | def4 | varchar2(101) |
| 20 | def5 | def5 | def5 | varchar2(101) |
| 21 | creationtime | creationtime | creationtime | char(19) |
| 22 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 23 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 24 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 25 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 26 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |