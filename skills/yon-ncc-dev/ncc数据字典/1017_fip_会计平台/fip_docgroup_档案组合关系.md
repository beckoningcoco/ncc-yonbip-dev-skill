# |<<

**档案组合关系 (fip_docgroup / nc.vo.fip.docgroup.FipDocGroupVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2232.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_docgroup | 对象标识 | pk_docgroup | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_desdoc | 目标档案类型 | pk_desdoc | varchar(36) |  | 实体 (entity) |
| 5 | pk_srcdoc1 | 来源档案类型1 | pk_srcdoc1 | varchar(36) |  | 实体 (entity) |
| 6 | pk_srcdoc2 | 来源档案类型2 | pk_srcdoc2 | varchar(36) |  | 实体 (entity) |
| 7 | pk_srcdoc3 | 来源档案类型3 | pk_srcdoc3 | varchar(36) |  | 实体 (entity) |
| 8 | pk_srcdoc4 | 来源档案类型4 | pk_srcdoc4 | varchar(36) |  | 实体 (entity) |
| 9 | pk_srcdoc5 | 来源档案类型5 | pk_srcdoc5 | varchar(36) |  | 实体 (entity) |
| 10 | pk_srcdoc6 | 来源档案类型6 | pk_srcdoc6 | varchar(36) |  | 实体 (entity) |
| 11 | pk_srcdoc7 | 来源档案类型7 | pk_srcdoc7 | varchar(36) |  | 实体 (entity) |
| 12 | pk_srcdoc8 | 来源档案类型8 | pk_srcdoc8 | varchar(36) |  | 实体 (entity) |
| 13 | pk_srcdoc9 | 来源档案类型9 | pk_srcdoc9 | varchar(36) |  | 实体 (entity) |
| 14 | displaycode | 显示编码 | displaycode | varchar(50) |  | 字符串 (String) |
| 15 | displayname | 显示名称 | displayname | varchar(1000) |  | 多语文本 (MultiLangText) |
| 16 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 17 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 18 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 19 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |