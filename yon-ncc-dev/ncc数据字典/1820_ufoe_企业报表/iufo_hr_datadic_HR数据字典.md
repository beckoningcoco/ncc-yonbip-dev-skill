# |<<

**HR数据字典 (iufo_hr_datadic / nc.vo.iufo.hr.hrstatcond.HRDataDictionaryVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3455.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_datadic | 数据字典主键 | pk_datadic | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(50) |  | 字符串 (String) |
| 4 | parentname | 父名称 | parentname | varchar(50) |  | 字符串 (String) |
| 5 | childname | 子名称 | childname | varchar(50) |  | 字符串 (String) |
| 6 | pk_parent | 父Id | pk_parent | varchar(50) |  | 字符串 (String) |
| 7 | pk_child | 子ID | pk_child | varchar(50) | √ | 字符串 (String) |
| 8 | datatype | 数据类型 | datatype | int |  | 整数 (Integer) |
| 9 | fieldtablename | 表名 | fieldtablename | varchar(50) |  | 字符串 (String) |
| 10 | refname | 参照名称 | refname | varchar(50) |  | 字符串 (String) |
| 11 | resmodule | 多语资源目录 | resmodule | varchar(50) |  | 字符串 (String) |
| 12 | resid | 多语资源 | resid | varchar(50) |  | 字符串 (String) |
| 13 | showorder | 显示顺序 | showorder | int |  | 整数 (Integer) |
| 14 | show_control | 是否显示 | show_control | char(1) |  | 布尔类型 (UFBoolean) | N |
| 15 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 16 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 17 | statmainbody | 所属统计主体 | statmainbody | varchar(50) |  | 字符串 (String) |
| 18 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 19 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 20 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 21 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |