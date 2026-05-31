# |<<

**消息实体属性 (sm_msg_property / nc.message.vo.MessagePropertyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5324.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_property | 主键 | pk_property | char(20) | √ | 主键 (UFID) |
| 2 | propertyname | 属性名 | propertyname | varchar(100) |  | 字符串 (String) |
| 3 | value | 属性值 | value | varchar(1000) |  | 字符串 (String) |
| 4 | type | 属性类型 | type | varchar(50) |  | 字符串 (String) |
| 5 | seq | 数组类型序号 | seq | varchar(20) |  | 字符串 (String) |
| 6 | pk_message | 消息主键 | pk_message | varchar(36) |  | 消息发送实体 (message) |