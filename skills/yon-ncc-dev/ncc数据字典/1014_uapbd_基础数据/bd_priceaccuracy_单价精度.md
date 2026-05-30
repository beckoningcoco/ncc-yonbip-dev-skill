# |<<

**单价精度 (bd_priceaccuracy / nc.vo.bd.currtype.PriceAccuracyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/928.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_priceaccuracy | 单价精度主键 | pk_priceaccuracy | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 4 | pk_currtype | 币种 | pk_currtype | varchar(20) | √ | 币种 (currtype) |
| 5 | grpunitcurrdigit | 集团单价小数位数 | grpunitcurrdigit | int |  | 单价小数精度 (unitdigitenum) |  | 0=0; |