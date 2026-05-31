# |<<

**订阅中心管理定义 (bi_subscribe_def / nc.vo.bap.subscribe.SubscribeDefVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1218.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_def | 定义主键 | pk_def | char(20) | √ | 主键 (UFID) |
| 2 | pk_dir | 分类 | pk_dir | varchar(20) |  | 订阅中心管理分类 (subscribedir) |
| 3 | defcode | 订阅编码 | defcode | varchar(50) |  | 字符串 (String) |
| 4 | defname | 订阅名称 | defname | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | note | 备注 | note | varchar(1024) |  | 备注 (Memo) |
| 6 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 8 | environmentsetting | 环境设置 | environmentsetting | image |  | BLOB (BLOB) |
| 9 | conditionsetting | 条件设置 | conditionsetting | image |  | BLOB (BLOB) |
| 10 | timesetting | 时间设置 | timesetting | image |  | BLOB (BLOB) |
| 11 | pushsetting | 推送设置 | pushsetting | image |  | BLOB (BLOB) |
| 12 | receiver | 接收人 | receiver | varchar(200) |  | 字符串 (String) |
| 13 | pushtype | 推送方式 | pushtype | varchar(20) |  | 字符串 (String) |
| 14 | extpushproperty | 扩展属性 | extpushproperty | image |  | BLOB (BLOB) |
| 15 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 16 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 17 | creator | 创建者 | creator | varchar(20) |  | 用户 (user) |
| 18 | modifier | 修改者 | modifier | varchar(20) |  | 用户 (user) |