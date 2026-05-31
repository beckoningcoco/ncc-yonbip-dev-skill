# |<<

**单品存量期初 (ic_onhandsninit / nc.vo.ic.onhand.init.OnhandSNInitVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2939.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_onhandsninit | 主键 | pk_onhandsninit | char(20) | √ | 主键 (UFID) |
| 2 | pk_onhanddim | 现存量维度 | pk_onhanddim | varchar(20) | √ | 现存量维度 (OnhandDimVO) |
| 3 | vbarcode | 主条码 | vbarcode | varchar(50) |  | 字符串 (String) |
| 4 | vbarcodesub | 次条码 | vbarcodesub | varchar(50) |  | 字符串 (String) |
| 5 | vboxbarcode | 箱条码 | vboxbarcode | varchar(50) |  | 字符串 (String) |
| 6 | vsncode | 序列号 | vsncode | varchar(50) |  | 字符串 (String) |
| 7 | nonhandnum | 结存数量 | nonhandnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | nonhandastnum | 结存辅数量 | nonhandastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | nlocknum | 冻结数量 | nlocknum | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | nlockastnum | 冻结辅数量 | nlockastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | nnum1 | 借入量 | nnum1 | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | nastnum1 | 借入辅数量 | nastnum1 | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | nnum2 | 借出量 | nnum2 | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | nastnum2 | 借出辅数量 | nastnum2 | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nrsnum | 预留数量 | nrsnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | nrsastnum | 预留辅数量 | nrsastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | dbegindate | 开始日期 | dbegindate | varchar(19) |  | 日期 (UFDate) |