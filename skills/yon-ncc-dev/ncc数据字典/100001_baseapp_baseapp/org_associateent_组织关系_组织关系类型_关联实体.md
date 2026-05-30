# |<<

**组织关系_组织关系类型_关联实体 (org_associateent / nc.vo.org.orgmodel.AssociateEntityVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4002.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_associateentity | 关联实体主键 | pk_associateentity | char(20) | √ | 主键 (UFID) |
| 2 | mdclassid | 实体 | mdclassid | varchar(36) | √ | 实体 (entity) |
| 3 | reftype | 实体参照类型 | reftype | varchar(100) |  | 字符串 (String) |
| 4 | orderindex | 显示次序 | orderindex | int | √ | 整数 (Integer) |  | [1 , 6] |
| 5 | displayname | 显示名称 | displayname | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | extendtag | 扩展标记 | extendtag | varchar(200) |  | 字符串 (String) |