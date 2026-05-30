# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8026.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_priority | pk_priority | pk_priority | char(20) | √ |
| 2 | enablestate | enablestate | enablestate | number(38, 0) |
| 3 | memo | memo | memo | varchar2(200) |
| 4 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 5 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 6 | pre_flag | pre_flag | pre_flag | char(1) |
| 7 | prior_code | prior_code | prior_code | varchar2(40) |
| 8 | prior_name | prior_name | prior_name | varchar2(120) |
| 9 | prior_name2 | prior_name2 | prior_name2 | varchar2(120) |
| 10 | prior_name3 | prior_name3 | prior_name3 | varchar2(120) |
| 11 | prior_name4 | prior_name4 | prior_name4 | varchar2(120) |
| 12 | prior_name5 | prior_name5 | prior_name5 | varchar2(120) |
| 13 | prior_name6 | prior_name6 | prior_name6 | varchar2(120) |
| 14 | creationtime | creationtime | creationtime | char(19) |
| 15 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 18 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |