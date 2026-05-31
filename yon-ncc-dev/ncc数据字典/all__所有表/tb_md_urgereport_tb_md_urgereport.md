# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12069.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | approve_enddate | approve_enddate | approve_enddate | char(19) |
| 3 | approve_responsible | approve_responsible | approve_responsible | varchar2(512) |
| 4 | approve_userscode | approve_userscode | approve_userscode | varchar2(512) |
| 5 | approve_usersname | approve_usersname | approve_usersname | varchar2(512) |
| 6 | pk_md_task | pk_md_task | pk_md_task | varchar2(20) |
| 7 | report_enddate | report_enddate | report_enddate | char(19) |
| 8 | report_responsible | report_responsible | report_responsible | varchar2(512) |
| 9 | report_times | report_times | report_times | number(10, 0) |
| 10 | report_userscode | report_userscode | report_userscode | varchar2(512) |
| 11 | report_usersname | report_usersname | report_usersname | varchar2(512) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |