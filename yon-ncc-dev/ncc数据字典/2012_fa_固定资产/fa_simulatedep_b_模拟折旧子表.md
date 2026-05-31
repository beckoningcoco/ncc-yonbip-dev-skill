# |<<

**模拟折旧子表 (fa_simulatedep_b / nc.vo.fa.simulatedep.SimulateDepBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2062.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_simulatedep_b | 主键 | pk_simulatedep_b | varchar(50) | √ | 字符串 (String) |
| 2 | pk_card | 资产卡片 | pk_card | varchar(20) |  | 资产卡片 (asset) |
| 3 | pk_category | 资产类别 | pk_category | varchar(20) |  | 资产类别 (assetcategory) |
| 4 | accyear | 年度 | accyear | varchar(10) |  | 字符串 (String) |
| 5 | period | 期间 | period | varchar(10) |  | 字符串 (String) |
| 6 | depamount1 | 账簿1月折旧额 | depamount1 | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | accudep1 | 账簿1累计折旧 | accudep1 | decimal(28, 8) |  | 金额 (UFMoney) |
| 8 | depamount2 | 账簿2月折旧额 | depamount2 | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | accudep2 | 账簿2累计折旧 | accudep2 | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | depamount3 | 账簿3月折旧额 | depamount3 | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | accudep3 | 账簿3累计折旧 | accudep3 | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | depamount4 | 账簿4月折旧额 | depamount4 | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | accudep4 | 账簿4累计折旧 | accudep4 | decimal(28, 8) |  | 金额 (UFMoney) |