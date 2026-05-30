# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10068.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_settlpriclass | pk_settlpriclass | pk_settlpriclass | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | innersetclass | innersetclass | innersetclass | number(38, 0) | √ |
| 4 | name | name | name | varchar2(300) |
| 5 | name2 | name2 | name2 | varchar2(300) |
| 6 | name3 | name3 | name3 | varchar2(300) |
| 7 | name4 | name4 | name4 | varchar2(300) |
| 8 | name5 | name5 | name5 | varchar2(300) |
| 9 | name6 | name6 | name6 | varchar2(300) |
| 10 | pk_group | pk_group | pk_group | varchar2(20) | √ |  | '~' |
| 11 | pk_marpuclass | pk_marpuclass | pk_marpuclass | varchar2(20) |  |  | '~' |
| 12 | pk_org | pk_org | pk_org | varchar2(20) | √ |  | '~' |
| 13 | remark | remark | remark | blob |
| 14 | def1 | def1 | def1 | varchar2(101) |
| 15 | def2 | def2 | def2 | varchar2(101) |
| 16 | def3 | def3 | def3 | varchar2(101) |
| 17 | def4 | def4 | def4 | varchar2(101) |
| 18 | def5 | def5 | def5 | varchar2(101) |
| 19 | creationtime | creationtime | creationtime | char(19) |
| 20 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 23 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |