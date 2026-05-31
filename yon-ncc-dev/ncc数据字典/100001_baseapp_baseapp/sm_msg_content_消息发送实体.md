# |<<

**消息发送实体 (sm_msg_content / nc.message.vo.MessageVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5323.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_message | 主键 | pk_message | char(20) | √ | 主键 (UFID) |
| 2 | subject | 标题 | subject | varchar(50) |  | 字符串 (String) |
| 3 | content | 内容 | content | varchar(4000) |  | 字符串 (String) |
| 4 | contenttype | 内容格式 | contenttype | varchar(50) |  | 字符串 (String) |
| 5 | msgtype | 消息发送类型 | msgtype | varchar(50) |  | 消息发送类型 (msgsendtypeenum) |  | 0=NC; |