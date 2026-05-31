# |<<

**模拟折旧设置表体 (fa_depprogram_b / nc.vo.fa.depprogram.DepProgramBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2015.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deprogram_b | 主键 | pk_deprogram_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_category | 资产类别 | pk_category | varchar(20) |  | 资产类别 (assetcategory) |
| 3 | new_value | 新增资产价值 | new_value | decimal(28, 8) |  | 金额 (UFMoney) |