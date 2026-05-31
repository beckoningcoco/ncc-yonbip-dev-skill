# |<<

**账户消息日志 (uh_pi_exter_acc_log / com.yonyou.yh.nhis.pi.acc.exter.mess.vo.MessLogVo)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6187.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_exteracc | 主键 | pk_exteracc | char(20) | √ | 主键 (UFID) |
| 2 | code_card | 卡号 | code_card | varchar(100) |  | 字符串 (String) |
| 3 | name_method | 消息类型 | name_method | varchar(50) |  | 字符串 (String) |
| 4 | event_obj | 事件对象 | event_obj | varchar(50) |  | 字符串 (String) |
| 5 | send_info | 接收消息 | send_info | varchar(2000) |  | 字符串 (String) |
| 6 | receive_info | 回执消息 | receive_info | varchar(2000) |  | 字符串 (String) |
| 7 | process_status | 处理状态 | process_status | varchar(50) |  | 字符串 (String) |
| 8 | exception_info | 异常信息 | exception_info | varchar(2000) |  | 字符串 (String) |
| 9 | create_time | 接收时间 | create_time | date |  | 日期时间 (UFDateTime) |
| 10 | serial_num | 流水号 | serial_num | varchar(50) |  | 字符串 (String) |