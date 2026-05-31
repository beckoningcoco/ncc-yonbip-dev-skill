# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12624.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | msg_id | msg_id | msg_id | varchar2(100) | √ |
| 2 | create_time | create_time | create_time | char(19) |
| 3 | exception_info | exception_info | exception_info | clob |
| 4 | interact_id | interact_id | interact_id | varchar2(100) |
| 5 | interact_mode | interact_mode | interact_mode | number(38, 0) |
| 6 | msg_type | msg_type | msg_type | varchar2(20) |
| 7 | process_status | process_status | process_status | varchar2(50) |
| 8 | receipt_info | receipt_info | receipt_info | clob |
| 9 | receive_info | receive_info | receive_info | clob |
| 10 | version | version | version | number(38, 0) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |