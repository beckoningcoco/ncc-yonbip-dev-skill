# |<<

**计薪规则 (wa_rangetable / nc.vo.hrwa.warangetable.WaRangetable)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6351.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rangetable | 计薪规则主键 | pk_rangetable | varchar(20) | √ | 主键 (UFID) |
| 2 | code | 计薪规则编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | isref | 是否参照 | isref | varchar(50) |  | 字符串 (String) |
| 4 | name | 计薪规则 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | refmodel | 参照模型 | refmodel | varchar(50) |  | 字符串 (String) |
| 6 | showorder | 显示序号 | showorder | varchar(50) |  | 字符串 (String) |