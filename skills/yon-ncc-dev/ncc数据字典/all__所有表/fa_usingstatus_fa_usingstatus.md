# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8173.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_usingstatus | pk_usingstatus | pk_usingstatus | char(20) | √ |
| 2 | dep_flag | dep_flag | dep_flag | number(38, 0) |
| 3 | enablestate | enablestate | enablestate | number(38, 0) |
| 4 | innercode | innercode | innercode | varchar2(60) |
| 5 | parent_id | parent_id | parent_id | varchar2(20) |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | preset_flag | preset_flag | preset_flag | number(38, 0) |
| 9 | res_id | res_id | res_id | varchar2(30) |
| 10 | statuslevel | statuslevel | statuslevel | number(38, 0) |
| 11 | status_code | status_code | status_code | varchar2(40) |
| 12 | status_name | status_name | status_name | varchar2(120) |
| 13 | status_name2 | status_name2 | status_name2 | varchar2(120) |
| 14 | status_name3 | status_name3 | status_name3 | varchar2(120) |
| 15 | status_name4 | status_name4 | status_name4 | varchar2(120) |
| 16 | status_name5 | status_name5 | status_name5 | varchar2(120) |
| 17 | status_name6 | status_name6 | status_name6 | varchar2(120) |
| 18 | creationtime | creationtime | creationtime | char(19) |
| 19 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 22 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 23 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |