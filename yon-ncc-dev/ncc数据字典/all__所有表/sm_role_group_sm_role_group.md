# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11627.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_role_group | pk_role_group | pk_role_group | char(20) | √ |
| 2 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 3 | group_code | group_code | group_code | varchar2(50) |
| 4 | group_name | group_name | group_name | varchar2(300) |
| 5 | group_name2 | group_name2 | group_name2 | varchar2(300) |
| 6 | group_name3 | group_name3 | group_name3 | varchar2(300) |
| 7 | group_name4 | group_name4 | group_name4 | varchar2(300) |
| 8 | group_name5 | group_name5 | group_name5 | varchar2(300) |
| 9 | group_name6 | group_name6 | group_name6 | varchar2(300) |
| 10 | group_type | group_type | group_type | number(38, 0) |
| 11 | innercode | innercode | innercode | varchar2(200) |
| 12 | parent_code | parent_code | parent_code | varchar2(20) |  |  | '~' |
| 13 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | creationtime | creationtime | creationtime | char(19) |
| 16 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 19 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |