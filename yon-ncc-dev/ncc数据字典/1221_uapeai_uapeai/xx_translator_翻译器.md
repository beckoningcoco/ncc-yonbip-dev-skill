# |<<

**翻译器 (xx_translator / nc.vo.pfxx.translator.TranslatorVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6389.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_translator | 翻译器主键 | pk_translator | char(20) | √ | 主键 (UFID) |
| 2 | traid | 翻译器编码 | traid | varchar(50) | √ | 字符串 (String) |
| 3 | traname | 翻译器名称 | traname | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | traclassname | 翻译器类名 | traclassname | varchar(120) | √ | 字符串 (String) |
| 5 | module | 模块名 | module | varchar(20) |  | 字符串 (String) |