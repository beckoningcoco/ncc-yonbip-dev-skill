# |<<

**消息配置表 (uh_ui_message_config / com.yonyou.yh.nhis.bd.message.vo.MessageConfigVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6289.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_message_config | 消息配置主键 | pk_message_config | char(20) | √ | 主键 (UFID) |
| 2 | trigger_name | 触发事件名称 | trigger_name | varchar(50) |  | 字符串 (String) |
| 3 | trigger_id | 触发时间id | trigger_id | varchar(50) |  | 字符串 (String) |
| 4 | pk_role | 接收端角色 | pk_role | varchar(50) |  | 字符串 (String) |
| 5 | role_name | 接收端角色名称 | role_name | varchar(50) |  | 字符串 (String) |
| 6 | pk_dept | 接收端部门 | pk_dept | varchar(50) |  | 字符串 (String) |
| 7 | dept_name | 接收端部门名称 | dept_name | varchar(50) |  | 字符串 (String) |
| 8 | url | url | url | varchar(150) |  | 字符串 (String) |
| 9 | function_id | 功能id | function_id | varchar(50) |  | 字符串 (String) |
| 10 | function_name | 功能名称 | function_name | varchar(50) |  | 字符串 (String) |