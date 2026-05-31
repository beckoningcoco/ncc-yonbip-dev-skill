# |<<

**税收地区 (bd_taxregion / nc.vo.bd.taxregion.TaxregionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/995.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taxregion | 税收地区主键 | pk_taxregion | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 4 | pk_country | 所属国家 | pk_country | varchar(20) | √ | 国家地区 (countryzone) |
| 5 | code | 征税地区编码 | code | varchar(50) | √ | 字符串 (String) |
| 6 | name | 征税地区名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 7 | remark | 备注 | remark | varchar(200) |  | 多语文本 (MultiLangText) |
| 8 | enablestate | 启用状态 | enablestate | int | √ | 启用状态 (enablestate) | 2 | 1=未启用; |