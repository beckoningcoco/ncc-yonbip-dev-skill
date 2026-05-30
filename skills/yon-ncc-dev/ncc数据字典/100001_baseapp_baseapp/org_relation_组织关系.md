# |<<

**组织关系 (org_relation / nc.vo.org.orgmodel.OrgRelationVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4146.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_relation | 关系主键 | pk_relation | char(20) | √ | 主键 (UFID) |
| 2 | pk_relationtype | 关系类型主键 | pk_relationtype | char(20) | √ | 组织关系_组织关系类型 (orgrelationtype) |
| 3 | sourceentity | 源实体类型 | sourceentity | varchar(36) | √ | 实体 (entity) |
| 4 | targetentity | 目标实体类型 | targetentity | varchar(36) | √ | 实体 (entity) |
| 5 | entity1 | 影响对象1 | entity1 | varchar(20) |  | 实体 (entity) |
| 6 | entity2 | 影响对象2 | entity2 | varchar(20) |  | 实体 (entity) |
| 7 | entity3 | 影响对象3 | entity3 | varchar(20) |  | 实体 (entity) |
| 8 | entity4 | 影响对象4 | entity4 | varchar(20) |  | 实体 (entity) |
| 9 | entity5 | 影响对象5 | entity5 | varchar(20) |  | 实体 (entity) |
| 10 | entity6 | 影响对象6 | entity6 | varchar(20) |  | 实体 (entity) |
| 11 | default1 | 默认值对象1 | default1 | varchar(20) |  | 实体 (entity) |
| 12 | default2 | 默认值对象2 | default2 | varchar(20) |  | 实体 (entity) |
| 13 | default3 | 默认值对象3 | default3 | varchar(20) |  | 实体 (entity) |
| 14 | default4 | 默认值对象4 | default4 | varchar(20) |  | 实体 (entity) |
| 15 | default5 | 默认值对象5 | default5 | varchar(20) |  | 实体 (entity) |
| 16 | default6 | 默认值对象6 | default6 | varchar(20) |  | 实体 (entity) |
| 17 | isdefault | 是否默认 | isdefault | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 19 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) | 1 | 1=未启用; |