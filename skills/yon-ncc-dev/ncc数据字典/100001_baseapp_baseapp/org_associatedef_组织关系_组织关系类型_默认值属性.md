# |<<

**组织关系_组织关系类型_默认值属性 (org_associatedef / nc.vo.org.orgmodel.AssociateDefVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4001.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_associatedef | 默认值属性主键 | pk_associatedef | char(20) | √ | 主键 (UFID) |
| 2 | mdclassid | 实体 | mdclassid | varchar(36) | √ | 实体 (entity) |
| 3 | reftype | 实体参照类型 | reftype | varchar(100) |  | 字符串 (String) |
| 4 | displayname | 显示名称 | displayname | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | extendtag | 扩展标记 | extendtag | varchar(200) |  | 字符串 (String) |
| 6 | orderindex | 显示次序 | orderindex | int | √ | 整数 (Integer) |  | [1 , 6] |