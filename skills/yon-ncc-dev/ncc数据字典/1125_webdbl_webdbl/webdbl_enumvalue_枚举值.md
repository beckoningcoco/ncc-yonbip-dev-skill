# |<<

**枚举值 (webdbl_enumvalue / uap.lfw.md.vo.MDEnumValueVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6374.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_enumvalue | 主键 | pk_enumvalue | char(20) | √ | 主键 (UFID) |
| 2 | pk_enumtype | 枚举类型 | pk_enumtype | char(20) |  | 主键 (UFID) |
| 3 | enumsequence | 序号 | enumsequence | int |  | 整数 (Integer) |
| 4 | enumvaluename | 名称 | enumvaluename | varchar(50) |  | 字符串 (String) |
| 5 | enumvalue | 枚举值 | enumvalue | varchar(50) |  | 字符串 (String) |
| 6 | ishidden | 是否隐藏 | ishidden | char(1) |  | 布尔类型 (UFBoolean) |