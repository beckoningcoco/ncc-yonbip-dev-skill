# |<<

**坏帐计提因素表 (arap_dstlfactor / nc.voarap.dstlfactor.arap_dstlfactor)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/180.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dstlfactor | 主键 | pk_dstlfactor | varchar(20) | √ | 主键 (UFID) |
| 2 | code | 因素编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | operator | 模板运算符列 | operator | varchar(50) |  | 字符串 (String) |
| 4 | name | 模板因素名称 | name | varchar(50) |  | 字符串 (String) |
| 5 | refname | 模板名称列 | refname | varchar(50) |  | 字符串 (String) |
| 6 | datatype | 模板数据类型 | datatype | int |  | 整数 (Integer) |
| 7 | reftype | 模板参照类型 | reftype | varchar(1000) |  | 字符串 (String) |
| 8 | tablecode | 所在表 | tablecode | varchar(50) |  | 字符串 (String) |
| 9 | tablekey | 展现表 | tablekey | varchar(50) |  | 字符串 (String) |
| 10 | codekey | 展现表编码字段 | codekey | varchar(50) |  | 字符串 (String) |
| 11 | namekey | 展现表名称字段 | namekey | varchar(50) |  | 字符串 (String) |
| 12 | jnkey | 关联字段 | jnkey | varchar(50) |  | 字符串 (String) |
| 13 | tablepk | 关联字段所在表的对应pk | tablepk | varchar(50) |  | 字符串 (String) |
| 14 | parentkey | 父亲字段 | parentkey | varchar(50) |  | 字符串 (String) |