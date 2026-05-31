# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11624.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_role | pk_role | pk_role | char(20) | √ |
| 2 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 3 | isorgrole | isorgrole | isorgrole | char(1) |
| 4 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 5 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 6 | role_class | role_class | role_class | number(38, 0) |  |  | 0 |
| 7 | role_code | role_code | role_code | varchar2(30) |
| 8 | role_group_id | role_group_id | role_group_id | varchar2(20) |  |  | '~' |
| 9 | role_memo | role_memo | role_memo | varchar2(200) |
| 10 | role_name | role_name | role_name | varchar2(300) |
| 11 | role_name2 | role_name2 | role_name2 | varchar2(300) |
| 12 | role_name3 | role_name3 | role_name3 | varchar2(300) |
| 13 | role_name4 | role_name4 | role_name4 | varchar2(300) |
| 14 | role_name5 | role_name5 | role_name5 | varchar2(300) |
| 15 | role_name6 | role_name6 | role_name6 | varchar2(300) |
| 16 | role_type | role_type | role_type | number(38, 0) |
| 17 | creationtime | creationtime | creationtime | char(19) |
| 18 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 21 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |