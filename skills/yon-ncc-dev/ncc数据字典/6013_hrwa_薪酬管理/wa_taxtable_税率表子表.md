# |<<

**税率表子表 (wa_taxtable / nc.vo.wa.taxrate.TaxTableVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6368.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_taxtable | 税率表子表主键 | pk_wa_taxtable | char(20) | √ | 主键 (UFID) |
| 2 | pk_wa_taxbase | 税率表计税基数主键 | pk_wa_taxbase | varchar(20) |  | 税率表计税基数 (wa_taxbase) |
| 3 | nminamount | 纳税级距下限 | nminamount | decimal(31, 8) |  | 数值 (UFDouble) |
| 4 | nmaxamount | 纳税级距上限 | nmaxamount | decimal(31, 8) |  | 数值 (UFDouble) |
| 5 | ntaxrate | 税率% | ntaxrate | decimal(9, 6) |  | 数值 (UFDouble) |
| 6 | nquickdebuct | 速算扣除数 | nquickdebuct | decimal(31, 8) |  | 数值 (UFDouble) |
| 7 | itaxlevel | 税率级次 | itaxlevel | int |  | 整数 (Integer) |
| 8 | ndebuctrate | 费用扣除比例 | ndebuctrate | decimal(9, 6) |  | 数值 (UFDouble) |
| 9 | ndebuctamount | 费用扣除额 | ndebuctamount | decimal(31, 8) |  | 数值 (UFDouble) |