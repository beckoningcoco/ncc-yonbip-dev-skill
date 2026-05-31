# |<<

**公共字段 (sscrp_publicfield / nc.vo.sscrp.rpbill.publicfield.PublicFieldVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5617.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_publicfield | 唯一标识 | pk_publicfield | varchar(36) | √ | 主键 (UFID) |
| 2 | code | 字段编码 | code | varchar(36) |  | 字符串 (String) |
| 3 | name | 字段名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | refname | 参照档案 | refname | varchar(36) |  | 实体 (entity) |
| 5 | sysflag | 系统默认 | sysflag | char(1) |  | 布尔类型 (UFBoolean) | N |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 8 | datatype | 数据类型 | datatype | varchar(50) |  | 数据类型 (PublicFieldDataTypeEnum) |  | 1=字符类型; |