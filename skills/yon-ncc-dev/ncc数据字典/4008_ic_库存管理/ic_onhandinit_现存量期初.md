# |<<

**现存量期初 (ic_onhandinit / nc.vo.ic.onhand.init.OnhandInitNumVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2936.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_onhandinit | 主键 | pk_onhandinit | char(20) | √ | 主键 (UFID) |
| 2 | nonhandnum | 结存数量 | nonhandnum | decimal(20, 8) |  | 数值 (UFDouble) |
| 3 | nonhandastnum | 结存辅数量 | nonhandastnum | decimal(20, 8) |  | 数值 (UFDouble) |
| 4 | nastnum1 | 借入辅数量 | nastnum1 | decimal(20, 8) |  | 数值 (UFDouble) |
| 5 | nnum1 | 借入量 | nnum1 | decimal(20, 8) |  | 数值 (UFDouble) |
| 6 | nastnum2 | 借出辅数量 | nastnum2 | decimal(20, 8) |  | 数值 (UFDouble) |
| 7 | nnum2 | 借出量 | nnum2 | decimal(20, 8) |  | 数值 (UFDouble) |
| 8 | ngrossnum | 毛重 | ngrossnum | decimal(20, 8) |  | 数值 (UFDouble) |
| 9 | ngrossnum1 | 借入毛重数量 | ngrossnum1 | decimal(20, 8) |  | 数值 (UFDouble) |
| 10 | ngrossnum2 | 借出毛重数量 | ngrossnum2 | decimal(20, 8) |  | 数值 (UFDouble) |
| 11 | pk_onhanddim | 现存量维度表主键 | pk_onhanddim | varchar(20) | √ | 现存量维度 (OnhandDimVO) |
| 12 | nlocknum | 冻结数量 | nlocknum | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | nlockastnum | 冻结辅数量 | nlockastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | nlockgrossnum | 冻结毛重数量 | nlockgrossnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nrsnum | 预留数量 | nrsnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | nrsastnum | 预留辅数量 | nrsastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | nrsgrossnum | 预留毛重数量 | nrsgrossnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | dbegindate | 开始日期 | dbegindate | varchar(19) |  | 日期 (UFDate) |