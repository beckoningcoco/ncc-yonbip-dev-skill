# |<<

**个税申报设置子表 (wa_taxset / nc.vo.hrwa.taxset.TaxsetVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6366.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_taxset | 子表主键 | pk_wa_taxset | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | iitemtype | 数据类型 | iitemtype | int |  | 数据类型 (itemtypeenum) |  | 0=数值型; |