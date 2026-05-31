# |<<

**HL7消息接收 (uh_hl7_receiving / com.yonyou.yh.nhis.bd.tpi.hl7.vo.MsgReceiveVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6116.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_msgreceiving | 主键 | pk_msgreceiving | char(20) | √ | 主键 (UFID) |
| 2 | msg_type | 消息类型 | msg_type | varchar(50) |  | 字符串 (String) |
| 3 | msg_ctrl_id | 消息控制id | msg_ctrl_id | varchar(100) |  | 字符串 (String) |
| 4 | msg | 消息报文 | msg | varchar(2000) |  | 字符串 (String) |
| 5 | rcv_type | 接收类型 | rcv_type | char(50) |  | 字符串 (String) |
| 6 | rcv_mode | 接收模式 | rcv_mode | char(50) |  | 字符串 (String) |
| 7 | from_system | 来自系统 | from_system | varchar(50) |  | 字符串 (String) |
| 8 | from_ip | 来自ip | from_ip | varchar(50) |  | 字符串 (String) |
| 9 | rcv_time | 接收时间 | rcv_time | char(19) |  | 日期时间 (UFDateTime) |
| 10 | process_time | 处理完成时间 | process_time | char(19) |  | 日期时间 (UFDateTime) |
| 11 | ask_time | 应答时间 | ask_time | char(19) |  | 日期时间 (UFDateTime) |
| 12 | validate_result | 消息验证结果 | validate_result | varchar(50) |  | 字符串 (String) |
| 13 | ack_ctrl_id | 应答消息控制id | ack_ctrl_id | varchar(50) |  | 字符串 (String) |
| 14 | sys_status | 状态 | sys_status | char(50) |  | 字符串 (String) |
| 15 | error | 错误信息 | error | varchar(500) |  | 字符串 (String) |