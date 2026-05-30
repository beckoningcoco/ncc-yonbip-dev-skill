# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6703.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tasklog | pk_tasklog | pk_tasklog | char(20) | √ |
| 2 | loglevel | loglevel | loglevel | number(38, 0) |
| 3 | logtime | logtime | logtime | char(19) |
| 4 | message | message | message | varchar2(4000) |
| 5 | operatetype | operatetype | operatetype | number(38, 0) |
| 6 | pk_adptask | pk_adptask | pk_adptask | char(20) | √ |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_stage | pk_stage | pk_stage | varchar2(20) |  |  | '~' |
| 9 | pk_user | pk_user | pk_user | varchar2(20) |  |  | '~' |
| 10 | stagelogno | stagelogno | stagelogno | number(38, 0) |
| 11 | tasklogno | tasklogno | tasklogno | number(38, 0) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |