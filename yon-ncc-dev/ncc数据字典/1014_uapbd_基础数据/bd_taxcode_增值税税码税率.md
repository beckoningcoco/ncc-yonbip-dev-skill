# |<<

**增值税税码税率 (bd_taxcode / nc.vo.bd.taxcode.TaxcodeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/993.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taxcode | 税码主键 | pk_taxcode | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 4 | reptaxcountry | 报税国 | reptaxcountry | varchar(20) | √ | 国家地区 (countryzone) |
| 5 | code | 税码 | code | varchar(40) | √ | 字符串 (String) |
| 6 | description | 描述 | description | varchar(200) | √ | 多语文本 (MultiLangText) |
| 7 | pursaletype | 购销类型 | pursaletype | int | √ | 购销类型 (pursaletype) | 5 | 1=国内销售; |