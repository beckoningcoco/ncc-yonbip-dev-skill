# |<<

**对照表 (fip_docview / nc.vo.fip.docview.DocViewListVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2236.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_classview | 对象标识 | pk_classview | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | viewcode | 编码 | viewcode | varchar(40) |  | 字符串 (String) |
| 5 | viewname | 名称 | viewname | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | desdocid | 目标档案类型 | desdocid | varchar(36) |  | 实体 (entity) |
| 7 | explanation | 备注 | explanation | varchar(200) |  | 多语文本 (MultiLangText) |
| 8 | orgtype | 组织类型 | orgtype | varchar(36) |  | 实体 (entity) |
| 9 | pk_setorg1 | 关联组织 | pk_setorg1 | varchar(101) |  | 自定义项 (Custom) |
| 10 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 11 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 12 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 13 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 14 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 15 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 16 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 17 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 18 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |