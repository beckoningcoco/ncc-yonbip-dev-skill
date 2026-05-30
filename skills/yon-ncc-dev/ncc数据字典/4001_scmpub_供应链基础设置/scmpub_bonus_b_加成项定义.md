# |<<

**加成项定义 (scmpub_bonus_b / nc.vo.scmpub.bonus.BonusBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5236.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bonus_b | 主键 | pk_bonus_b | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 3 | pk_marbasclass | 物资分类 | pk_marbasclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 4 | pk_material | 物资编码 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 5 | priceway | 零售价计价方式 | priceway | varchar(50) |  | 零售价计价方式 (marbasclass) |  | 0=固定价格; |