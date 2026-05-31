# |<<

**V5档案映射 (iufo_docmapping_V5 / nc.vo.iufo.v5.docmapping.V5DIDocMappingVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3421.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_docmapping | 主键 | pk_docmapping | varchar(50) | √ | 字符串 (String) |
| 2 | pk_owen | 基本档案 | pk_owen | varchar(50) |  | 字符串 (String) |
| 3 | code_owen | 基本档案编码 | code_owen | varchar(50) |  | 字符串 (String) |
| 4 | name_owen | 基本档案名称 | name_owen | varchar(200) |  | 字符串 (String) |
| 5 | pk_map | V5系统档案 | pk_map | varchar(50) |  | 字符串 (String) |
| 6 | code_map | V5系统档案编码 | code_map | varchar(50) |  | 字符串 (String) |
| 7 | name_map | V5系统档案名称 | name_map | varchar(200) |  | 字符串 (String) |
| 8 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 9 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 10 | dsname | 数据源 | dsname | varchar(50) |  | 字符串 (String) |
| 11 | pk_dim | 档案映射维度 | pk_dim | varchar(50) |  | 字符串 (String) |
| 12 | attribute | 属性 | attribute | varchar(50) |  | 字符串 (String) |
| 13 | pk_subjscheme | V5会计科目方案 | pk_subjscheme | varchar(50) |  | 字符串 (String) |
| 14 | basedoc_org | 基本档案条目所属组织 | basedoc_org | varchar(50) |  | 字符串 (String) |
| 15 | mapdoc_org | V5档案条目所属组织 | mapdoc_org | varchar(50) |  | 字符串 (String) |
| 16 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 17 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 18 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 19 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |