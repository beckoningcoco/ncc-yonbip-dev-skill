# |<<

**物料消耗单明细 (cm_stuff_b / nc.vo.cm.stuff.entity.StuffItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1511.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cstuff_bid | 物料消耗单明细 | cstuff_bid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(0) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cstuffid | 物料消耗单 | cstuffid | char(20) |  | 主键 (UFID) |
| 6 | cmaterialid | 物料最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 7 | cmaterialvid | 物料 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 8 | celementid | 核算要素 | celementid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 9 | nplanprice | 计划单价 | nplanprice | decimal(20, 8) |  | 数值 (UFDouble) |
| 10 | nplanmoney | 计划金额 | nplanmoney | decimal(20, 8) |  | 数值 (UFDouble) |
| 11 | nnum | 数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | nprice | 实际单价 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | nmoney | 实际金额 | nmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | ndiff | 差异 | ndiff | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | cactivityid | 作业 | cactivityid | varchar(20) |  | 作业档案 (bd_activity) |
| 16 | csourcebillid | 来源单据 | csourcebillid | char(20) |  | 主键 (UFID) |
| 17 | csourcebill_bid | 来源单据明细 | csourcebill_bid | char(20) |  | 主键 (UFID) |
| 18 | istatus | 状态 | istatus | int |  | 单据状态(成本) (CMStatusEnum) | 1 | 1=自由; |