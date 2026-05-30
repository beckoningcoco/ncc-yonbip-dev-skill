# |<<

**个税项目设置 (wa_tax_relat / nc.vo.wa.psntax.TaxRelatVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6357.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tax_relat | 主键 | pk_tax_relat | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属组织 | pk_org | char(20) |  | 主键 (UFID) |
| 3 | deduction_tax_item | 允许扣除的税费对应的项目 | deduction_tax_item | char(20) |  | 主键 (UFID) |
| 4 | deduction_donations_item | 准予扣除的捐赠额 | deduction_donations_item | char(20) |  | 主键 (UFID) |
| 5 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |