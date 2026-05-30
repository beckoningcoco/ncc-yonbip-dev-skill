# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11815.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_task_log | pk_task_log | pk_task_log | char(20) | √ |
| 2 | error_msg | error_msg | error_msg | varchar2(512) |
| 3 | pk_task | pk_task | pk_task | char(20) |
| 4 | request_data | request_data | request_data | varchar2(2048) |
| 5 | request_type | request_type | request_type | varchar2(50) |
| 6 | task_result | task_result | task_result | char(1) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |