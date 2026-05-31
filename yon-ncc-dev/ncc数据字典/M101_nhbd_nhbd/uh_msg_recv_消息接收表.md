# |<<

**消息接收表 (uh_msg_recv / com.yonyou.yh.nhis.bd.tpi.uhmsg.vo.UhMsgRecvVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6129.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_msgrecv | 消息接收主键 | pk_msgrecv | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 所属机构 | pk_org | char(20) |  | 主键 (UFID) |
| 4 | pk_msgsend | 消息发送记录 | pk_msgsend | char(20) |  | 主键 (UFID) |
| 5 | pk_msg | 消息主键 | pk_msg | char(20) |  | 主键 (UFID) |
| 6 | date_recv | 接收时间 | date_recv | char(19) |  | 日期时间 (UFDateTime) |
| 7 | code_psn | 接收人员 | code_psn | varchar(50) |  | 字符串 (String) |
| 8 | name_psn | 接收人员姓名 | name_psn | varchar(50) |  | 字符串 (String) |
| 9 | date_read | 阅读时间 | date_read | char(19) |  | 日期时间 (UFDateTime) |
| 10 | flag_reply | 回复标志 | flag_reply | varchar(50) |  | 字符串 (String) |
| 11 | date_reply | 回复时间 | date_reply | char(19) |  | 日期时间 (UFDateTime) |
| 12 | cont_reply | 回复内容 | cont_reply | varchar(50) |  | 字符串 (String) |
| 13 | addr_ip | 回复IP | addr_ip | varchar(50) |  | 字符串 (String) |
| 14 | note | 备注信息 | note | varchar(50) |  | 字符串 (String) |