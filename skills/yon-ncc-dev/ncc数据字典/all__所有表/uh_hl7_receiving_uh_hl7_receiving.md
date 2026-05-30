# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12623.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_msgreceiving | pk_msgreceiving | pk_msgreceiving | char(20) | √ |
| 2 | ack_ctrl_id | ack_ctrl_id | ack_ctrl_id | varchar2(50) |
| 3 | ask_time | ask_time | ask_time | char(19) |
| 4 | error | error | error | varchar2(500) |
| 5 | from_ip | from_ip | from_ip | varchar2(50) |
| 6 | from_system | from_system | from_system | varchar2(50) |
| 7 | msg | msg | msg | varchar2(2000) |
| 8 | msg_ctrl_id | msg_ctrl_id | msg_ctrl_id | varchar2(100) |
| 9 | msg_type | msg_type | msg_type | varchar2(50) |
| 10 | process_time | process_time | process_time | char(19) |
| 11 | rcv_mode | rcv_mode | rcv_mode | char(50) |
| 12 | rcv_time | rcv_time | rcv_time | char(19) |
| 13 | rcv_type | rcv_type | rcv_type | char(50) |
| 14 | sys_status | sys_status | sys_status | char(50) |
| 15 | validate_result | validate_result | validate_result | varchar2(50) |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |