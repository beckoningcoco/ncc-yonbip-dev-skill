# |<<

**税率 (bd_taxrate / nc.vo.bd.taxcode.TaxrateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/994.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taxrate | 税率主键 | pk_taxrate | char(20) | √ | 主键 (UFID) |
| 2 | pk_taxcode | 税码主键 | pk_taxcode | char(0) | √ | 增值税税码税率 (taxcode) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | taxtype | 扣税类别 | taxtype | int |  | 扣税类别 (taxtype) | 1 | 1=应税外加; |