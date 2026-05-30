# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10445.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_service_step | pk_service_step | pk_service_step | char(20) | √ |
| 2 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 2 |
| 3 | memo | memo | memo | varchar2(200) |
| 4 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 5 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 6 | pre_flag | pre_flag | pre_flag | char(1) |
| 7 | step_code | step_code | step_code | varchar2(40) |
| 8 | step_name | step_name | step_name | varchar2(400) |
| 9 | step_name2 | step_name2 | step_name2 | varchar2(400) |
| 10 | step_name3 | step_name3 | step_name3 | varchar2(400) |
| 11 | step_name4 | step_name4 | step_name4 | varchar2(400) |
| 12 | step_name5 | step_name5 | step_name5 | varchar2(400) |
| 13 | step_name6 | step_name6 | step_name6 | varchar2(400) |
| 14 | creationtime | creationtime | creationtime | char(19) |
| 15 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 18 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |