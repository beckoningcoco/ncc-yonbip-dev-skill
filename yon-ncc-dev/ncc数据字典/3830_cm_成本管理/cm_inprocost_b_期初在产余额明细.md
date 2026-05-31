# |<<

**期初在产余额明细 (cm_inprocost_b / nc.vo.cm.inprocost.entity.InproCostItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1483.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cinprocost_bid | 期初在产余额明细 | cinprocost_bid | char(20) | √ | 主键 (UFID) |
| 2 | cinprocostid | 期初在产余额 | cinprocostid | char(20) |  | 主键 (UFID) |
| 3 | cmaterialid | 物料最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 4 | cmaterialvid | 物料 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 5 | celementid | 核算要素 | celementid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 6 | nnum | 数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | nprice | 单价 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | nmoney | 金额 | nmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | istatus | 状态 | istatus | decimal(0, 0) |  | 单据状态(成本) (CMStatusEnum) | 1 | 1=自由; |