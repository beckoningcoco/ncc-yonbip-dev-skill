# |<<

**报表管理报告数据源 (ufoe_reptemplate_ds / nc.vo.iufo.reptemplate.RepTemplateDSVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5909.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_datasource | 管理报告数据源主键 | pk_datasource | char(20) | √ | 主键 (UFID) |
| 2 | pk_task | 所属任务ID | pk_task | varchar(20) |  | 任务 (task) |
| 3 | datasourceinfo | 数据源信息 | datasourceinfo | image |  | BLOB (BLOB) |
| 4 | name | 数据源名称 | name | varchar(50) |  | 字符串 (String) |
| 5 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | filepath | 数据源文件路径 | filepath | varchar(200) |  | 字符串 (String) |
| 8 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 10 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |