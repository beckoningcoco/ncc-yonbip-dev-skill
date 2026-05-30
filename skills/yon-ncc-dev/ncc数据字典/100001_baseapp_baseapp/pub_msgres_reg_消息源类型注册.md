# |<<

**消息源类型注册 (pub_msgres_reg / nc.buzimsg.vo.MsgresRegVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4742.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_msgres_reg | 主键 | pk_msgres_reg | char(20) | √ | 主键 (UFID) |
| 2 | moduleid | 所属模块号 | moduleid | varchar(20) |  | 模块信息 (module) |
| 3 | code | 消息源编码 | code | varchar(50) | √ | 字符串 (String) |
| 4 | name | 消息源名称 | name | varchar(50) |  | 字符串 (String) |
| 5 | msgtemptype_code | 消息模板分类编码 | msgtemptype_code | varchar(20) |  | 消息模板分类 (msgtmptype) |
| 6 | metaid | 元数据ID | metaid | varchar(36) |  | 实体 (entity) |
| 7 | pk_billtypecode | 单据类型编码 | pk_billtypecode | varchar(20) |  | 单据类型 (BilltypeVO) |
| 8 | foldername | 名称多语文件夹名称 | foldername | varchar(50) |  | 字符串 (String) |
| 9 | resid | 名称多语资源号 | resid | varchar(50) |  | 字符串 (String) |
| 10 | innercode | 内部编码 | innercode | varchar(50) |  | 字符串 (String) |
| 11 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 12 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 13 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 14 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |