# |<<

**数据模型分类 (fiba_datamodelclass / nc.vo.smartba.modeldesign.DataModelClass)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2216.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_modelclass | 主键 | pk_modelclass | char(20) | √ | 主键 (UFID) |
| 2 | name | 名称 | name | varchar(50) |  | 字符串 (String) |
| 3 | sequence | 次序 | sequence | varchar(50) |  | 字符串 (String) |
| 4 | pk_parent | 上级分类 | pk_parent | varchar(20) |  | 字符串 (String) |
| 5 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | ispreset | 是否预置 | ispreset | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 9 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 11 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |