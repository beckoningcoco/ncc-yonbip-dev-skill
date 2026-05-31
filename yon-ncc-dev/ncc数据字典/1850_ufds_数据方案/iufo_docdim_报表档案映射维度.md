# |<<

**报表档案映射维度 (iufo_docdim / nc.vo.iufo.docmapping.DIDocDimVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3418.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dim | 主键 | pk_dim | char(20) | √ | 字符串 (String) |
| 2 | dimcode | 维度编码 | dimcode | varchar(30) |  | 字符串 (String) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_basedoc | 关联基本档案pk | pk_basedoc | varchar(50) |  | 字符串 (String) |
| 6 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 7 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 8 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 9 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |