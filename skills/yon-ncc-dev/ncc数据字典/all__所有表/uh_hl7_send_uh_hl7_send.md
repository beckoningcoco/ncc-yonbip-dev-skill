# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12625.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_msg | pk_msg | pk_msg | char(20) | √ |
| 2 | ack_ctrl_id | ack_ctrl_id | ack_ctrl_id | varchar2(50) |
| 3 | ack_type | ack_type | ack_type | varchar2(50) |
| 4 | create_time | create_time | create_time | varchar2(50) |
| 5 | error | error | error | varchar2(500) |
| 6 | msg | msg | msg | varchar2(2000) |
| 7 | msg_ctrl_id | msg_ctrl_id | msg_ctrl_id | varchar2(100) |
| 8 | msg_type | msg_type | msg_type | varchar2(50) |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | schedule_time | schedule_time | schedule_time | char(19) |
| 12 | send_mode | send_mode | send_mode | char(50) |
| 13 | send_type | send_type | send_type | char(50) |
| 14 | sent_first_time | sent_first_time | sent_first_time | char(19) |
| 15 | sent_last_time | sent_last_time | sent_last_time | char(19) |
| 16 | sent_times | sent_times | sent_times | number(38, 0) |
| 17 | sys_status | sys_status | sys_status | char(50) |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |