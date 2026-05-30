# |<<

**消息日志 (fip_messagelog / nc.vo.fip.messagelogs.MessageLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2242.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_messagelog | 对象标识 | pk_messagelog | varchar(50) | √ | 字符串 (String) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_system | 系统 | pk_system | varchar(50) |  | 字符串 (String) |
| 5 | pk_billtype | 单据类型 | pk_billtype | varchar(20) |  | 字符串 (String) |
| 6 | relationid | 关联号 | relationid | varchar(50) |  | 字符串 (String) |
| 7 | pk_operator | 用户 | pk_operator | varchar(20) |  | 用户 (user) |
| 8 | busidate | 业务日期 | busidate | char(19) |  | 日期 (UFDate) |
| 9 | defdoc1 | 自定义档案1 | defdoc1 | varchar(101) |  | 字符串 (String) |
| 10 | defdoc2 | 自定义档案2 | defdoc2 | varchar(101) |  | 字符串 (String) |
| 11 | defdoc3 | 自定义档案3 | defdoc3 | varchar(101) |  | 字符串 (String) |
| 12 | freedef1 | 自定义项目1 | freedef1 | varchar(200) |  | 字符串 (String) |
| 13 | freedef2 | 自定义项目2 | freedef2 | varchar(200) |  | 字符串 (String) |
| 14 | freedef3 | 自定义项目3 | freedef3 | varchar(200) |  | 字符串 (String) |
| 15 | freedef4 | 自定义项目4 | freedef4 | varchar(200) |  | 字符串 (String) |
| 16 | freedef5 | 自定义项目5 | freedef5 | varchar(200) |  | 字符串 (String) |
| 17 | messagetype | 消息类型 | messagetype | int |  | 消息类型 (messagetype) |  | 0=增加; |