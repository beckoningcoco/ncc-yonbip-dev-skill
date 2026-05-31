# |<<

**预警条目与后台任务 (pub_alertregistry / nc.vo.pub.pa.AlertregistryVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4697.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_alertregistry | 主键 | pk_alertregistry | char(20) | √ | 主键 (UFID) |
| 2 | accountpk | 帐套主键 | accountpk | varchar(30) |  | 字符串 (String) |
| 3 | alertname | 预警条目名称 | alertname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | description | 描述 | description | varchar(256) |  | 字符串 (String) |
| 5 | enabled | 是否启用 | enabled | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | filename | 消息文件名前缀 | filename | varchar(80) |  | 字符串 (String) |
| 7 | istiming | 是否即时 | istiming | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | language | 语言 | language | varchar(30) |  | 字符串 (String) |
| 9 | maxlogs | 最大日志数 | maxlogs | int |  | 整数 (Integer) |
| 10 | message | 消息title | message | varchar(512) |  | 字符串 (String) |
| 11 | messagefile | 实际消息文件名称 | messagefile | varchar(128) |  | 字符串 (String) |
| 12 | pk_alerttype | 预警类型主键 | pk_alerttype | varchar(20) |  | 预警类型 (alerttype) |
| 13 | groupid | 集团ID | groupid | varchar(20) |  | 组织_集团 (group) |
| 14 | registrytype | 任务类型 | registrytype | smallint |  | 整数 (Integer) |
| 15 | scheduletaskid | 异步任务id | scheduletaskid | varchar(30) |  | 字符串 (String) |
| 16 | reportlikework | 异步报表体 | reportlikework | image |  | BLOB (BLOB) |
| 17 | info1 | info1 | info1 | varchar(50) |  | 字符串 (String) |
| 18 | info2 | info2 | info2 | varchar(50) |  | 字符串 (String) |
| 19 | info3 | info3 | info3 | varchar(50) |  | 字符串 (String) |
| 20 | info4 | info4 | info4 | varchar(50) |  | 字符串 (String) |
| 21 | info5 | info5 | info5 | varchar(50) |  | 字符串 (String) |
| 22 | info6 | info6 | info6 | varchar(50) |  | 字符串 (String) |
| 23 | info7 | info7 | info7 | varchar(50) |  | 字符串 (String) |
| 24 | info8 | info8 | info8 | varchar(50) |  | 字符串 (String) |
| 25 | info9 | info9 | info9 | varchar(50) |  | 字符串 (String) |
| 26 | info10 | info10 | info10 | varchar(50) |  | 字符串 (String) |
| 27 | info11 | info11 | info11 | varchar(50) |  | 字符串 (String) |
| 28 | info12 | info12 | info12 | varchar(50) |  | 字符串 (String) |
| 29 | irule | 自定义预警条件 | irule | image |  | BLOB (BLOB) |
| 30 | pk_busiobj | 业务实体主键 | pk_busiobj | varchar(20) |  | 实体 (entity) |
| 31 | pk_messagetemplate | 消息模板主键 | pk_messagetemplate | varchar(20) |  | 消息模板 (messagetemplate) |
| 32 | pk_org | 业务单元主键 | pk_org | varchar(20) |  | 组织 (org) |
| 33 | creator | 创建者 | creator | varchar(20) |  | 用户 (user) |