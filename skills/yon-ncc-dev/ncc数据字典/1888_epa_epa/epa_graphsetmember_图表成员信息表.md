# |<<

**图表成员信息表 (epa_graphsetmember / nc.vo.epa.query.graph.GraphSetMemberVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1864.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ | 主键 (UFID) |
| 2 | name | name | name | varchar(200) |  | 字符串 (String) |
| 3 | caption | caption | caption | varchar(200) |  | 字符串 (String) |
| 4 | uniquename | 唯一标识名称 | uniquename | varchar(200) |  | 字符串 (String) |
| 5 | calculatemember | 是否计算成员 | calculatemember | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | calculateexpress | 计算成员表达式 | calculateexpress | image |  | BLOB (BLOB) |
| 7 | rulemember | 是否规则成员 | rulemember | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | def1 | def1 | def1 | varchar(50) |  | 字符串 (String) |
| 9 | def2 | def2 | def2 | varchar(50) |  | 字符串 (String) |
| 10 | def3 | def3 | def3 | varchar(50) |  | 字符串 (String) |
| 11 | def4 | def4 | def4 | varchar(50) |  | 字符串 (String) |
| 12 | def5 | def5 | def5 | varchar(50) |  | 字符串 (String) |