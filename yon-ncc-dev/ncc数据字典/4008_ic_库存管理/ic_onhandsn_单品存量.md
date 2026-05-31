# |<<

**单品存量 (ic_onhandsn / nc.vo.ic.onhand.entity.OnhandSNVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2938.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_onhanddim | 现存量维度 | pk_onhanddim | varchar(20) | √ | 现存量维度 (OnhandDimVO) |
| 2 | vbarcode | 条形码 | vbarcode | varchar(50) |  | 字符串 (String) |
| 3 | vbarcodesub | 次条码 | vbarcodesub | varchar(50) |  | 字符串 (String) |
| 4 | vboxbarcode | 箱条码 | vboxbarcode | varchar(50) |  | 字符串 (String) |
| 5 | vsncode | 序列号 | vsncode | varchar(50) |  | 字符串 (String) |
| 6 | nonhandnum | 结存主数量 | nonhandnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | nonhandastnum | 结存数量 | nonhandastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | nlocknum | 冻结数量 | nlocknum | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | nlockastnum | 冻结辅数量 | nlockastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | nnum1 | 借入量 | nnum1 | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | nastnum1 | 借入辅数量 | nastnum1 | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | nnum2 | 借出量 | nnum2 | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | nastnum2 | 借出辅数量 | nastnum2 | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | nrsnum | 预留数量 | nrsnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nrsastnum | 预留辅数量 | nrsastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | pk_serialcode | 序列号主键 | pk_serialcode | varchar(20) |  | 序列号档案 (SerialNoVO) |