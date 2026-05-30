# |<<

**消息发送记录 (uh_msg_send / com.yonyou.yh.nhis.bd.tpi.uhmsg.vo.UhMsgSendVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6130.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_msgsend | 消息发送主键 | pk_msgsend | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 所属组织 | pk_org | char(20) |  | 主键 (UFID) |
| 4 | code_psn | 接收者编码 | code_psn | varchar(50) |  | 字符串 (String) |
| 5 | name_psn | 接收者姓名 | name_psn | varchar(50) |  | 字符串 (String) |
| 6 | pk_msg | 消息主键 | pk_msg | char(20) |  | 主键 (UFID) |
| 7 | date_opt | 操作时间 | date_opt | char(19) |  | 日期时间 (UFDateTime) |
| 8 | flag_valid | 完成标志 | flag_valid | varchar(50) |  | 字符串 (String) |
| 9 | date_read | 阅读时间 | date_read | char(19) |  | 日期时间 (UFDateTime) |