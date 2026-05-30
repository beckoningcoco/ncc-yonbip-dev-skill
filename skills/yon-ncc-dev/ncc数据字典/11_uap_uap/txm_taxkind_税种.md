# |<<

**税种 (txm_taxkind / nc.vo.txm.taxpub.TaxKindVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5836.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taxkind | 税种ID | pk_taxkind | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | issystemp | 数据类型 | issystemp | int |  | 数据类型 (txmdatatype) |  | 1=系统; |