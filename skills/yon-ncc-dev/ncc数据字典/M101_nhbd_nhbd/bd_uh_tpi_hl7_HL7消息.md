# |<<

**HL7消息 (bd_uh_tpi_hl7 / com.yonyou.yh.nhis.bd.tpi.hl7.vo.HL7MessageVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1138.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_msg | 主键 | pk_msg | char(20) | √ | 主键 (UFID) |
| 2 | msg_type | 消息类型 | msg_type | varchar(50) | √ | 字符串 (String) |
| 3 | msg_ctrl_id | 消息控制id | msg_ctrl_id | varchar(100) | √ | 字符串 (String) |
| 4 | msg | 消息内容 | msg | varchar(2000) | √ | 字符串 (String) |
| 5 | create_time | 产生时间 | create_time | varchar(50) | √ | 字符串 (String) |
| 6 | send_type | 发送类型 | send_type | char(3) | √ | 字符串 (String) |
| 7 | send_mode | 发送模式 | send_mode | char(4) | √ | 字符串 (String) |
| 8 | sent_times | 已发送次数 | sent_times | int |  | 整数 (Integer) |
| 9 | sent_first_time | 首次发送时间 | sent_first_time | char(19) |  | 日期时间 (UFDateTime) |
| 10 | sent_last_time | 末次发送时间 | sent_last_time | char(19) |  | 日期时间 (UFDateTime) |
| 11 | schedule_time | 定时发送时间 | schedule_time | char(19) |  | 日期时间 (UFDateTime) |
| 12 | ack_type | 应答类型 | ack_type | varchar(50) |  | 字符串 (String) |
| 13 | ack_ctrl_id | 应答消息控制id | ack_ctrl_id | varchar(2) |  | 字符串 (String) |
| 14 | sys_status | 状态 | sys_status | char(50) | √ | 字符串 (String) |
| 15 | error | 错误信息 | error | varchar(500) |  | 字符串 (String) |