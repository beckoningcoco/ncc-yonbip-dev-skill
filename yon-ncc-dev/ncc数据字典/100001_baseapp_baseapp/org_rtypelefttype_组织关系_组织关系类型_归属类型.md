# |<<

**组织关系_组织关系类型_归属类型 (org_rtypelefttype / nc.vo.org.orgmodel.OrgRelationTypeLeftTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4161.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_lefttype | 类型主键 | pk_lefttype | char(20) | √ | 主键 (UFID) |
| 2 | mdclassid | 元数据主键 | mdclassid | varchar(36) | √ | 实体 (entity) |
| 3 | typecode | 类型编码 | typecode | varchar(50) | √ | 字符串 (String) |
| 4 | typename | 类型名称 | typename | varchar(200) | √ | 多语文本 (MultiLangText) |
| 5 | createtime | 创建时间 | createtime | char(19) |  | 日期时间 (UFDateTime) |
| 6 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 7 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 8 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |