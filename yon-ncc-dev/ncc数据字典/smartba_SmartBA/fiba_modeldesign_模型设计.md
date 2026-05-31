# |<<

**模型设计 (fiba_modeldesign / nc.vo.smartba.modeldesign.DataModelDesign)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2218.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_modeldesign | 主键ID | pk_modeldesign | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(20) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | pk_datamodelclass | 所属分类 | pk_datamodelclass | varchar(20) |  | 数据模型分类 (datamodelclass) |
| 5 | ispreset | 是否预置 | ispreset | varchar(50) |  | 字符串 (String) |
| 6 | pk_model | 语义模型 | pk_model | varchar(20) |  | 语义模型定义 (smartdef) |
| 7 | pk_org | 组织 | pk_org | varchar(50) |  | 字符串 (String) |
| 8 | pk_group | 集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 9 | memo | 备注 | memo | varchar(1000) |  | 字符串 (String) |
| 10 | isenabale | 是否启用 | isenabale | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | isvalidate | 是否验证通过 | isvalidate | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 13 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 14 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 15 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |