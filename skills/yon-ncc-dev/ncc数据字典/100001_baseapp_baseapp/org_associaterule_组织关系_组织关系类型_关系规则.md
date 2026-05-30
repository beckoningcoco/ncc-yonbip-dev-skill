# |<<

**组织关系_组织关系类型_关系规则 (org_associaterule / nc.vo.org.orgmodel.AssociateRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4003.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_associaterule | 关系规则主键 | pk_associaterule | char(20) | √ | 主键 (UFID) |
| 2 | sourceentity | 源实体 | sourceentity | varchar(36) | √ | 实体 (entity) |
| 3 | sourcereftype | 源实体参照类型 | sourcereftype | varchar(100) |  | 字符串 (String) |
| 4 | sourceentityname | 源组织显示名称 | sourceentityname | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | targetentity | 目的实体 | targetentity | varchar(36) | √ | 实体 (entity) |
| 6 | targetreftype | 目的实体参照类型 | targetreftype | varchar(100) |  | 字符串 (String) |
| 7 | targetentityname | 目的组织显示名称 | targetentityname | varchar(200) |  | 多语文本 (MultiLangText) |
| 8 | multiplicity | 多样性 | multiplicity | smallint | √ | 多样性 (relationships) | 1 | 0=源组织+关联实体+目的组织唯一; |