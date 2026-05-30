# |<<

**传输活动 (adp_t_activity / nc.vo.uap.distribution.datatrans.TransActivityVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/28.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | activityid | 活动ID | activityid | char(20) | √ | 主键 (UFID) |
| 2 | activityuuid | 活动的全局唯一ID | activityuuid | varchar(50) |  | 字符串 (String) |
| 3 | sendercode | 发送方系统编码 | sendercode | varchar(50) |  | 字符串 (String) |
| 4 | receivercode | 接收方系统编码 | receivercode | varchar(50) |  | 字符串 (String) |
| 5 | ackrequired | 是否要求接收确认 | ackrequired | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | sessionid | 会话ID | sessionid | varchar(20) |  | 传输会话 (TransSessionVO) |
| 7 | sessionuuid | 会话的全局唯一ID | sessionuuid | varchar(50) |  | 字符串 (String) |
| 8 | sendstatus | 发送状态 | sendstatus | int |  | 发送活动状态 (SendActivityStatus) |  | 1=数据准备; |