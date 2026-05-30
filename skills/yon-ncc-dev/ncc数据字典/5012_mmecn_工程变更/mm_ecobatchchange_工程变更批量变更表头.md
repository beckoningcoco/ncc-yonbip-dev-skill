# |<<

**工程变更批量变更表头 (mm_ecobatchchange / nc.vo.ecn.eco.entity.EcoBatchChangeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3681.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbom_bid | 物料清单明细 | cbom_bid | char(20) | √ | 主键 (UFID) |
| 2 | fchangeitem | 变更项 | fchangeitem | int |  | 变更属性状态 (FChangeStatusEnum) |  | 1=属性原值; |