# |<<

**传输消息 (adp_message / uap.vo.distribution.message.TransMessageVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/16.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | msgpk | 消息PK | msgpk | char(20) | √ | 主键 (UFID) |
| 2 | tranferid | 基础通讯的消息ID | tranferid | varchar(50) |  | 字符串 (String) |
| 3 | msguuid | 消息UUID | msguuid | varchar(50) |  | 字符串 (String) |
| 4 | msgtype | 消息类型 | msgtype | int |  | 消息类型 (messagetype) |  | 1=系统消息; |