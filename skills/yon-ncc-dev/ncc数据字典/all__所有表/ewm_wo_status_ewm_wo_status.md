# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8051.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wo_status | pk_wo_status | pk_wo_status | char(20) | √ |
| 2 | default_flag | default_flag | default_flag | char(1) |
| 3 | enablestate | enablestate | enablestate | number(38, 0) |
| 4 | memo | memo | memo | varchar2(200) |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | pre_flag | pre_flag | pre_flag | char(1) |
| 8 | status_code | status_code | status_code | varchar2(40) |
| 9 | status_name | status_name | status_name | varchar2(120) |
| 10 | status_name2 | status_name2 | status_name2 | varchar2(120) |
| 11 | status_name3 | status_name3 | status_name3 | varchar2(120) |
| 12 | status_name4 | status_name4 | status_name4 | varchar2(120) |
| 13 | status_name5 | status_name5 | status_name5 | varchar2(120) |
| 14 | status_name6 | status_name6 | status_name6 | varchar2(120) |
| 15 | status_type | status_type | status_type | number(38, 0) |
| 16 | creationtime | creationtime | creationtime | char(19) |
| 17 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 20 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |