# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12626.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | msg_id | msg_id | msg_id | varchar2(100) | √ |
| 2 | create_time | create_time | create_time | char(19) |
| 3 | event_obj | event_obj | event_obj | blob |
| 4 | exception_info | exception_info | exception_info | clob |
| 5 | interact_id | interact_id | interact_id | varchar2(100) |
| 6 | interact_mode | interact_mode | interact_mode | number(38, 0) |
| 7 | msg_type | msg_type | msg_type | varchar2(20) |
| 8 | process_status | process_status | process_status | varchar2(50) |
| 9 | receipt_info | receipt_info | receipt_info | clob |
| 10 | send_info | send_info | send_info | clob |
| 11 | version | version | version | number(38, 0) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |