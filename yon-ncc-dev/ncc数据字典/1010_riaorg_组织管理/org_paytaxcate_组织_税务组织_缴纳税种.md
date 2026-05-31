# |<<

**组织_税务组织_缴纳税种 (org_paytaxcate / nc.vo.org.PayTaxCateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4116.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_paytaxcate | 缴纳税种主键 | pk_paytaxcate | char(20) | √ | 主键 (UFID) |
| 2 | pk_taxcategory | 税种主键 | pk_taxcategory | varchar(20) |  | 税种 (taxkind) |
| 3 | dataoriginflag | 数据来源 | dataoriginflag | int |  | 数据来源 (dataorigin) | 0 | 0=本级产生; |