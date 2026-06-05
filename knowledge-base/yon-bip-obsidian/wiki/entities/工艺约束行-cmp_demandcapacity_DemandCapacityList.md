---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.demandcapacity.DemandCapacityList"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工艺约束行 (`cmp.demandcapacity.DemandCapacityList`)

> DCRP | 物理表：`cmp_demand_capacity_list`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工艺约束行 |
| 物理表 | `cmp_demand_capacity_list` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 14:00:12.6090` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（47个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `demandCapacityId` | 工艺约束 | `demand_capacity_id` | 1550bbc9-2eed-432c-84cd-6c36a16d9507 |
| 4 | `srcRouteId` | 工艺约束来源ID(工艺路线) | `src_route_id` | Long |
| 5 | `srcRouteType` | 工艺约束来源类型 | `src_route_type` | String |
| 6 | `serialNo` | 顺序号 | `serial_no` | Decimal |
| 7 | `standardOperationId` | 标准工序 | `standard_operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 8 | `capacityObject` | 加工中心 | `capacity_objectId` | e3034100-f166-46e1-b750-d85fb84474b7 |
| 9 | `srcWCId` | 加工中心来源ID(工作中心/生产线) | `src_wc_id` | Long |
| 10 | `srcWCType` | 加工中心来源类型 | `src_wc_type` | String |
| 11 | `outsourcing` | 是否委外标识 | `outsourcing` | Short |
| 12 | `providerId` | 委外商 | `provider_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 13 | `parallelNumber` | 并行数量 | `parallel_number` | Short |
| 14 | `lineUpTime` | 排队时间 | `line_up_time` | Decimal |
| 15 | `fixedTime` | 固定时间 | `fixed_time` | Decimal |
| 16 | `changeTime` | 变动时间 | `change_time` | Decimal |
| 17 | `disassembleTime` | 拆卸时间 | `disassemble_time` | Decimal |
| 18 | `waittingTime` | 等待时间 | `waiting_time` | Decimal |
| 19 | `shiftTime` | 转移时间 | `shift_time` | Decimal |
| 20 | `standardQuantity` | 基准数量 | `standard_quantity` | Decimal |
| 21 | `mainStandardQuantity` | 主计量基准数量 | `main_standard_quantity` | Decimal |
| 22 | `timeUnit` | 时间单位 | `time_unit` | String |
| 23 | `workTime` | 工作时间 | `work_time` | Decimal |
| 24 | `sourceId` | 来源ID | `source_id` | Long |
| 25 | `sourceLineId` | 来源行ID | `source_line_id` | Long |
| 26 | `outputUnit` | 产出单位 | `output_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 27 | `conversionRate` | 换算率 | `conversion_rate` | Decimal |
| 28 | `memo` | 备注 | `capacity_adjust_mark` | String |
| 29 | `defineCharacter` | 自定义项 | `define_character` | 8b968683-1189-4939-bdf7-831a552e4357 |
| 30 | `bottleneck` | 瓶颈能力标识 | `bottleneck` | Short |
| 31 | `dosageUnit` | 单位用量(小时) | `dosage_unit` | Decimal |
| 32 | `mainDosageUnit` | 单位用量(主单位)(小时) | `main_dosage_unit` | Decimal |
| 33 | `priority` | 优先级 | `priority` | Short |
| 34 | `dailyOutput` | 日产量 | `daily_output` | Decimal |
| 35 | `dr` | 逻辑删除标记 | `dr` | Short |
| 36 | `createTime` | 创建时间 | `create_time` | DateTime |
| 37 | `createDate` | 创建日期 | `create_date` | Date |
| 38 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 39 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 40 | `creator` | 创建人名称 | `creator` | String |
| 41 | `modifier` | 修改人名称 | `modifier` | String |
| 42 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 43 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 44 | `pubts` | 时间戳 | `pubts` | DateTime |
| 45 | `conversionRateDen` | 换算率分母 | `conversion_rateden` | Decimal |
| 46 | `conversionRateNum` | 换算率分子 | `conversion_ratenum` | Decimal |
| 47 | `demandCapacityResource` | 工序资源 | `` | d88b847b-f891-4abd-9fec-b7cb1f49fc5e |

---

## 关联属性（10个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `standardOperationId` | 标准工序 | `ed.operation.Operation` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `providerId` | 委外商 | `aa.vendor.Vendor` | Service |  |
| 4 | `outputUnit` | 产出单位 | `pc.unit.Unit` | Service |  |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `demandCapacityResource` | 工序资源 | `cmp.demandcapacity.DemandCapacityResource` | None | true |
| 8 | `capacityObject` | 加工中心 | `cmp.capacityobject.CapacityObject` | None |  |
| 9 | `defineCharacter` | 自定义项 | `cmp.demandcapacity.DemandCapacityListDefineCT` | None |  |
| 10 | `demandCapacityId` | 工艺约束 | `cmp.demandcapacity.DemandCapacity` | None | true |
