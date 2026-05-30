# |<<

**底稿查询方案 (bcs_dgqueryscheme / nc.vo.bcs.dgqueryscheme.DGQuerySchemeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/274.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | 方案pk | pk_obj | varchar(50) | √ | 字符串 (String) |
| 2 | name | 方案名称 | name | varchar(50) |  | 字符串 (String) |
| 3 | querycondition | 查询条件 | querycondition | image |  | BLOB (BLOB) |
| 4 | creatingtime | 建造时间 | creatingtime | char(19) |  | 日期时间 (UFDateTime) |
| 5 | isdeafault | 是否默认 | isdeafault | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | pk_workbook | 套表 | pk_workbook | varchar(50) |  | 字符串 (String) |
| 7 | pk_sheet | 表单 | pk_sheet | varchar(50) |  | 字符串 (String) |
| 8 | busisystem | 业务系统 | busisystem | varchar(50) |  | 字符串 (String) |
| 9 | appcode | 小应用编码 | appcode | varchar(50) |  | 字符串 (String) |
| 10 | key1 | 扩展字段1 | key1 | varchar(50) |  | 字符串 (String) |
| 11 | key2 | 扩展字段2 | key2 | varchar(50) |  | 字符串 (String) |
| 12 | key3 | 扩展字段3 | key3 | varchar(50) |  | 字符串 (String) |
| 13 | key4 | 扩展字段4 | key4 | varchar(50) |  | 字符串 (String) |
| 14 | key5 | 扩展字段5 | key5 | varchar(50) |  | 字符串 (String) |
| 15 | creator | 建造者 | creator | varchar(50) |  | 字符串 (String) |