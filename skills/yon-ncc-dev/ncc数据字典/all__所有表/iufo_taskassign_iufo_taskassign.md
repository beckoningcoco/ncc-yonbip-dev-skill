# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9700.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taskassign | pk_taskassign | pk_taskassign | char(20) | √ |
| 2 | assign_note | assign_note | assign_note | varchar2(1024) |
| 3 | dataorigin | dataorigin | dataorigin | varchar2(50) |
| 4 | flag_privfml | flag_privfml | flag_privfml | char(1) |
| 5 | flag_privprint | flag_privprint | flag_privprint | char(1) |
| 6 | flag_reassign | flag_reassign | flag_reassign | char(1) |
| 7 | innercode | innercode | innercode | varchar2(50) |
| 8 | pk_assignorg | pk_assignorg | pk_assignorg | varchar2(20) |  |  | '~' |
| 9 | pk_createorg | pk_createorg | pk_createorg | varchar2(20) |  |  | '~' |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_groupcorp | pk_groupcorp | pk_groupcorp | varchar2(50) |  |  | '~' |
| 12 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 13 | pk_receiveorg | pk_receiveorg | pk_receiveorg | varchar2(20) |  |  | '~' |
| 14 | pk_task | pk_task | pk_task | varchar2(20) |  |  | '~' |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |