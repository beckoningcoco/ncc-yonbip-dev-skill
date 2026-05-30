# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6677.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_stepstatus_detail | pk_stepstatus_detail | pk_stepstatus_detail | char(20) | √ |
| 2 | exceptioninfo | exceptioninfo | exceptioninfo | varchar2(200) |
| 3 | pk_org | pk_org | pk_org | varchar2(50) |
| 4 | pk_stepstatus | pk_stepstatus | pk_stepstatus | char(20) | √ |
| 5 | pk_step_ref | pk_step_ref | pk_step_ref | varchar2(50) |  |  | '~' |
| 6 | pk_task | pk_task | pk_task | varchar2(50) |
| 7 | step_name | step_name | step_name | varchar2(50) |
| 8 | step_order | step_order | step_order | number(38, 0) |
| 9 | step_status | step_status | step_status | varchar2(50) |  |  | '~' |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 12 | modifier | modifier | modifier | varchar2(50) |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |