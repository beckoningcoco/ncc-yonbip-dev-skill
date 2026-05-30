# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10610.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_finalflag | pk_finalflag | pk_finalflag | char(20) | √ |
| 2 | flag_value | flag_value | flag_value | number(38, 0) |
| 3 | memo | memo | memo | varchar2(200) |
| 4 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 5 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 6 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 7 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 8 | pk_start_psn | pk_start_psn | pk_start_psn | varchar2(20) |  |  | '~' |
| 9 | pk_unstart_psn | pk_unstart_psn | pk_unstart_psn | varchar2(20) |  |  | '~' |
| 10 | start_time | start_time | start_time | char(19) |
| 11 | unstart_time | unstart_time | unstart_time | char(19) |
| 12 | creationtime | creationtime | creationtime | char(19) |
| 13 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 16 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |