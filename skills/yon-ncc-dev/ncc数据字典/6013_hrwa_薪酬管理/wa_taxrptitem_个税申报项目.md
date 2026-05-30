# |<<

**个税申报项目 (wa_taxrptitem / nc.vo.wa.taxrptitem.TaxRptItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6365.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_taxrptitem | 主键 | pk_wa_taxrptitem | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | name | 项目名称 | name | varchar(50) |  | 多语文本 (MultiLangText) |
| 5 | datatype | 数据类型 | datatype | int |  | 数据类型 (TypeEnumVO) |  | 0=数值型; |