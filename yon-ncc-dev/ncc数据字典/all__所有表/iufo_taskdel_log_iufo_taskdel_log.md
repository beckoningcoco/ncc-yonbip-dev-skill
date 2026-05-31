# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9703.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taskdel_log | pk_taskdel_log | pk_taskdel_log | char(20) | √ |
| 2 | busi_prop | busi_prop | busi_prop | char(20) |
| 3 | code | code | code | varchar2(50) |
| 4 | name | name | name | varchar2(300) |
| 5 | operationtime | operationtime | operationtime | char(19) |
| 6 | operator | operator | operator | char(20) |
| 7 | pk_group | pk_group | pk_group | char(20) |
| 8 | pk_keygroup | pk_keygroup | pk_keygroup | char(20) |
| 9 | pk_org | pk_org | pk_org | char(20) |
| 10 | pk_task | pk_task | pk_task | char(20) | √ |
| 11 | pk_tasksort | pk_tasksort | pk_tasksort | char(20) |
| 12 | taskrefinfovo | taskrefinfovo | taskrefinfovo | blob |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |