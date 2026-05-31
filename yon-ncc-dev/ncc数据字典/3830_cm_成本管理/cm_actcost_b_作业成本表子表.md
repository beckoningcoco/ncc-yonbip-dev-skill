# |<<

**作业成本表子表 (cm_actcost_b / nc.vo.cm.allocate.entity.activitycost.ActivityCostItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1433.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cactcost_bid | 作业成本明细 | cactcost_bid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(0) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cactcostid | 作业成本表 | cactcostid | char(20) |  | 主键 (UFID) |
| 6 | cmaterialid | 物料最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 7 | cmaterialvid | 物料 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 8 | celementid | 核算要素 | celementid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 9 | nnum | 数量 | nnum | decimal(20, 8) |  | 数值 (UFDouble) |
| 10 | nprice | 单价 | nprice | decimal(20, 8) |  | 数值 (UFDouble) |
| 11 | nmoney | 金额 | nmoney | decimal(30, 8) |  | 数值 (UFDouble) |
| 12 | istatus | 状态 | istatus | int |  | 分配状态 (CMAllocStatusEnum) | 0 | 0=未分配; |