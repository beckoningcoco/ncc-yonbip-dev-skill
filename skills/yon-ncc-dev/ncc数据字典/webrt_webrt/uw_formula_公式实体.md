# |<<

**公式实体 (uw_formula / nc.uap.lfw.core.formular.FormulaVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6307.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_formula | 主键 | pk_formula | char(20) | √ | 主键 (UFID) |
| 2 | name | 名称 | name | varchar(500) |  | 多语文本 (MultiLangText) |
| 3 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 4 | parser | 解析类 | parser | varchar(50) |  | 字符串 (String) |