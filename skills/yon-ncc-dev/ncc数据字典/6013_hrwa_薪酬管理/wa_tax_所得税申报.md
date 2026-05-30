# |<<

**所得税申报 (wa_tax / nc.vo.wa.tax.WaTaxVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6355.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_tax | 所得税表 | pk_wa_tax | char(20) | √ | 主键 (UFID) |
| 2 | pk_wa_data | 薪资发放 | pk_wa_data | varchar(20) |  | 薪资档案 (payfile) |
| 3 | ftaxmny | 应纳税所得额 | ftaxmny | decimal(31, 8) |  | 数值 (UFDouble) |
| 4 | ftax | 应纳税额 | ftax | decimal(31, 8) |  | 数值 (UFDouble) |
| 5 | dtaxdate | 纳税日期 | dtaxdate | char(10) |  | 主键 (UFID) |
| 6 | fmny | 金额 | fmny | decimal(31, 8) |  | 数值 (UFDouble) |
| 7 | fmnyz | 折主金额 | fmnyz | decimal(31, 8) |  | 数值 (UFDouble) |
| 8 | ntaxrate | 税率 | ntaxrate | decimal(9, 6) |  | 数值 (UFDouble) |
| 9 | ndebuctamount | 费用扣除 | ndebuctamount | decimal(31, 8) |  | 数值 (UFDouble) |
| 10 | nquickdebuct | 速算扣除数 | nquickdebuct | decimal(31, 8) |  | 数值 (UFDouble) |
| 11 | f_8 | 已扣税 | f_8 | decimal(31, 8) |  | 数值 (UFDouble) |
| 12 | f_10 | 补发扣税 | f_10 | decimal(31, 8) |  | 数值 (UFDouble) |
| 13 | ftaxz | 所得税额 | ftaxz | decimal(31, 8) |  | 数值 (UFDouble) |
| 14 | vtaxcode | 完税证字号 | vtaxcode | varchar(101) |  | 自定义项 (Custom) |
| 15 | vmemo | 备注 | vmemo | varchar(101) |  | 自定义项 (Custom) |
| 16 | displaytaxitem | 所得项目显示名称 | displaytaxitem | varchar(101) |  | 自定义项 (Custom) |