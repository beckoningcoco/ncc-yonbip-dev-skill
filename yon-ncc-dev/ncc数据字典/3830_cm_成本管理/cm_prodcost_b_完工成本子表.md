# |<<

**完工成本子表 (cm_prodcost_b / nc.vo.cm.pc.pc0410.ProdcostItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1492.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cprodcost_bid | 完工成本明细 | cprodcost_bid | char(20) | √ | 主键 (UFID) |
| 2 | cprodcostid | 完工成本 | cprodcostid | char(20) |  | 主键 (UFID) |
| 3 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 4 | cmaterialvid | 物料版本 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 5 | celementid | 核算要素 | celementid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 6 | nnum | 数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | nprice | 单价 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | nmoney | 金额 | nmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | istatus | 状态 | istatus | varchar(50) |  | 子项状态 (ItemStatus) |  | 1=初始; |