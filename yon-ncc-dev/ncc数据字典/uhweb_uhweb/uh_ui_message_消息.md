# |<<

**消息 (uh_ui_message / uh.uhweb.vo.message.MessageVo)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6288.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_msg | 主键 | pk_msg | char(20) | √ | 主键 (UFID) |
| 2 | receiver_role | 接收角色 | receiver_role | varchar(20) |  | 角色 (Role) |
| 3 | receiver_dept | 接收科室 | receiver_dept | varchar(20) |  | 组织_部门 (dept) |
| 4 | msg_type | 消息类型 | msg_type | varchar(10) |  | 字符串 (String) |
| 5 | msg_gnid | 功能ID | msg_gnid | varchar(50) |  | 字符串 (String) |
| 6 | msg_gnmc | 功能名称 | msg_gnmc | varchar(50) |  | 字符串 (String) |
| 7 | msg_url | 功能URL | msg_url | varchar(200) |  | 字符串 (String) |
| 8 | msg_param | 消息参数 | msg_param | varchar(500) |  | 字符串 (String) |
| 9 | msg_content | 消息内容 | msg_content | varchar(1000) |  | 字符串 (String) |
| 10 | sender | 发送者 | sender | varchar(20) |  | 用户 (user) |
| 11 | sendtime | 发送时间 | sendtime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | sender_dept | 发送科室 | sender_dept | varchar(20) |  | 组织_部门 (dept) |
| 13 | extiredtime | 失效时间 | extiredtime | char(19) |  | 日期时间 (UFDateTime) |