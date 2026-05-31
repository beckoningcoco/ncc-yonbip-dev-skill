# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12913.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tax_relat | pk_tax_relat | pk_tax_relat | char(20) | √ |
| 2 | deduction_donations_item | deduction_donations_item | deduction_donations_item | char(20) |
| 3 | deduction_tax_item | deduction_tax_item | deduction_tax_item | char(20) |
| 4 | pk_group | pk_group | pk_group | char(20) |
| 5 | pk_org | pk_org | pk_org | char(20) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |