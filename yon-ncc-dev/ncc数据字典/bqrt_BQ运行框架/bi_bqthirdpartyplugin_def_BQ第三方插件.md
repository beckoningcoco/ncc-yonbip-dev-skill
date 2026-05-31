# |<<

**BQ第三方插件 (bi_bqthirdpartyplugin_def / uap.bq.bqthirdpartyplugin.vo.BQThirdPartyPluginVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1185.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk | 主键 | pk | char(20) | √ | 主键 (UFID) |
| 2 | code | 插件编码 | code | varchar(50) | √ | 字符串 (String) |
| 3 | name | 插件名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | type | 插件类型 | type | varchar(50) | √ | 字符串 (String) |
| 5 | plugin_type | 插件分类 | plugin_type | varchar(50) |  | 字符串 (String) |
| 6 | sysinit | 系统预置 | sysinit | varchar(50) |  | 字符串 (String) |
| 7 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 8 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 9 | def1 | 自定义项1 | def1 | varchar(50) |  | 字符串 (String) |
| 10 | def2 | 自定义项2 | def2 | varchar(50) |  | 字符串 (String) |
| 11 | def3 | 自定义项3 | def3 | varchar(50) |  | 字符串 (String) |
| 12 | def4 | 自定义项4 | def4 | varchar(50) |  | 字符串 (String) |
| 13 | def5 | 自定义项5 | def5 | varchar(50) |  | 字符串 (String) |
| 14 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 15 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 16 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 17 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |