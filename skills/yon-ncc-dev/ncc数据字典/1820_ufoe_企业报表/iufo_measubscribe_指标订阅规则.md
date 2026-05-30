# |<<

**指标订阅规则 (iufo_measubscribe / nc.vo.iufo.measubscribe.MeaSubscribeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3478.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_measub | 主键 | pk_measub | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | rulecontent | 规则内容 | rulecontent | image |  | BLOB (BLOB) |
| 5 | measubssort | 所属分类 | measubssort | varchar(20) |  | 指标订阅规则分类 (measubscribesort) |
| 6 | pk_hbscheme | 合并方案 | pk_hbscheme | varchar(20) |  | 字符串 (String) |
| 7 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 8 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 9 | pk_keygroup | 关键字组合 | pk_keygroup | varchar(20) |  | 关键字组合 (关键字组合) |
| 10 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 11 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 13 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |