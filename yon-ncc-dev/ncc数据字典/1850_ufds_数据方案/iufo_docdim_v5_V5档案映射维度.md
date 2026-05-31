# |<<

**V5档案映射维度 (iufo_docdim_v5 / nc.vo.iufo.v5.docmapping.V5DIDocDimVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3419.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_docdim | 主键 | pk_docdim | varchar(50) | √ | 字符串 (String) |
| 2 | code_docdim | 编码 | code_docdim | varchar(50) |  | 字符串 (String) |
| 3 | name_docdim | 名称 | name_docdim | varchar(50) |  | 字符串 (String) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_basedoc | 关联基本档案pk | pk_basedoc | varchar(50) |  | 字符串 (String) |
| 7 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 8 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 10 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |