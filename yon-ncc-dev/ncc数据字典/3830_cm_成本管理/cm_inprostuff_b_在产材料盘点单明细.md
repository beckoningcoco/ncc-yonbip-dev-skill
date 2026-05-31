# |<<

**在产材料盘点单明细 (cm_inprostuff_b / nc.vo.cm.inprostuff.entity.InproStuffItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1485.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cinprostuff_bid | 在产材料盘点单明细 | cinprostuff_bid | char(20) | √ | 主键 (UFID) |
| 2 | cmaterialid | 物料最新版本 | cmaterialid | varchar(0) |  | 物料基本信息 (material_v) |
| 3 | cmaterialvid | 物料 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 4 | celementid | 核算要素 | celementid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 5 | nnum | 数量 | nnum | decimal(20, 8) |  | 数值 (UFDouble) |
| 6 | nprice | 实际单价 | nprice | decimal(20, 8) |  | 数值 (UFDouble) |
| 7 | nmoney | 实际金额 | nmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | istatus | 状态 | istatus | decimal(0, 0) |  | 单据状态(成本) (CMStatusEnum) | 1 | 1=自由; |