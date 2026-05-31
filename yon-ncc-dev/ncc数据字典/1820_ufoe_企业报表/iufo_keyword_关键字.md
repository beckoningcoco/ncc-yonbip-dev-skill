# |<<

**关键字 (iufo_keyword / nc.vo.iufo.keydef.KeyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3468.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_keyword | 关键字PK | pk_keyword | char(20) | √ | 主键 (UFID) |
| 2 | name | 名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 3 | ref_pk | 引用的元数据档案 | ref_pk | varchar(50) |  | 字符串 (String) |
| 4 | len | 允许录入最大长度 | len | int |  | 整数 (Integer) |
| 5 | code | 代码 | code | varchar(30) |  | 字符串 (String) |
| 6 | note | 说明 | note | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | type | 类型 | type | int | √ | 关键字类型 (enum) |  | 1=字符型; |