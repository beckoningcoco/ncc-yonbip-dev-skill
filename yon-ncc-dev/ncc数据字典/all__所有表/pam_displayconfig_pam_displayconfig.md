# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10376.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_displayconfig | pk_displayconfig | pk_displayconfig | char(20) | √ |
| 2 | application_code | application_code | application_code | varchar2(40) |  |  | '~' |
| 3 | application_name | application_name | application_name | varchar2(300) |  |  | '~' |
| 4 | application_name2 | application_name2 | application_name2 | varchar2(300) |
| 5 | application_name3 | application_name3 | application_name3 | varchar2(300) |
| 6 | application_name4 | application_name4 | application_name4 | varchar2(300) |
| 7 | application_name5 | application_name5 | application_name5 | varchar2(300) |
| 8 | application_name6 | application_name6 | application_name6 | varchar2(300) |
| 9 | edit_state | edit_state | edit_state | number(38, 0) |  |  | 0 |
| 10 | innercode | innercode | innercode | varchar2(60) |  |  | '~' |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | pk_transitype | pk_transitype | pk_transitype | varchar2(20) |  |  | '~' |
| 13 | creationtime | creationtime | creationtime | char(19) |
| 14 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 17 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |