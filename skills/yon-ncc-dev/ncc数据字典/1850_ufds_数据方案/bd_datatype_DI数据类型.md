# |<<

**DI数据类型 (bd_datatype / nc.vo.bd.datatype.DataTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/454.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_datatype | 数据类型主键 | pk_datatype | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(30) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | isbuiltin | 预置 | isbuiltin | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | isseal | 启用 | isseal | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | note | 备注 | note | varchar(200) |  | 备注 (Memo) |
| 7 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 8 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 9 | dataorigin | 分布式数据来源 | dataorigin | varchar(50) |  | 字符串 (String) |
| 10 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 11 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 13 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |