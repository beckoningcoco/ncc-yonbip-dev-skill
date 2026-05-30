# |<<

**消息模板 (pub_messagetemplate / nc.bs.pub.messageTemplate.vo.MessageTemplateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4734.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_messagetemplate | 模板主键 | pk_messagetemplate | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | type | 模板类型 | type | varchar(1) |  | 字符串 (String) |
| 4 | pk_relateobj | 隶属对象 | pk_relateobj | varchar(50) |  | 字符串 (String) |
| 5 | pk_busiobj | 业务对象 | pk_busiobj | varchar(20) |  | 实体 (entity) |
| 6 | name | 模板名称 | name | varchar(50) |  | 字符串 (String) |
| 7 | title | 消息标题 | title | varchar(50) |  | 字符串 (String) |
| 8 | titlecolor | 标题颜色 | titlecolor | varchar(20) |  | 字符串 (String) |
| 9 | showbodytable | 是否附明细数据 | showbodytable | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | contentformat | 内容 | contentformat | image |  | BLOB (BLOB) |