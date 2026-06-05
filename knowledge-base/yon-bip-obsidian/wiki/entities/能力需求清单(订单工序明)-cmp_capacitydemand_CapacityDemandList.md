---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.capacitydemand.CapacityDemandList"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 能力需求清单(订单工序明) (`cmp.capacitydemand.CapacityDemandList`)

> DCRP | 物理表：`cmp_capacity_demand_list`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 能力需求清单(订单工序明) |
| 物理表 | `cmp_capacity_demand_list` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:59:05.6000` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（55个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | id | `id` | Long |
| 3 | `serialNo` | 顺序号 | `capacity_type` | Decimal |
| 4 | `standardOperation` | 标准工序 | `standard_operation` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 5 | `demandBeginDate` | 需求开始日期 | `demand_begin_date` | DateTime |
| 6 | `demandEndDate` | 需求结束日期 | `demand_end_date` | DateTime |
| 7 | `fixedTime` | 固定时间 | `fixed_time` | Decimal |
| 8 | `capacityDemandId` | 能力需求ID | `capacity_demand_id` | c09df742-e522-466c-a5ac-757f34e80092 |
| 9 | `capacityObject` | 加工中心 | `capacity_object_id` | e3034100-f166-46e1-b750-d85fb84474b7 |
| 10 | `suggestBeginDate` | 建议需求开始日期 | `suggest_begin_date` | DateTime |
| 11 | `suggestEndDate` | 建议需求结束日期 | `suggest_end_date` | DateTime |
| 12 | `lineUpTime` | 排队时间 | `line_up_time` | Decimal |
| 13 | `disassembleTime` | 拆卸时间 | `disassemble_time` | Decimal |
| 14 | `waittingTime` | 等待时间 | `waiting_time` | Decimal |
| 15 | `shiftTime` | 转移时间 | `shift_time` | Decimal |
| 16 | `lineUpTimeHour` | 排队时间(小时) | `line_up_time_hour` | Decimal |
| 17 | `disassembleTimeHour` | 拆卸时间(小时) | `disassemble_time_hour` | Decimal |
| 18 | `waittingTimeHour` | 等待时间(小时) | `waiting_time_hour` | Decimal |
| 19 | `shiftTimeHour` | 转移时间(小时) | `shift_time_hour` | Decimal |
| 20 | `defineCharacter` | 自定义项 | `define_character` | 3184e5c7-4d74-4335-aa92-41cc6bedb57a |
| 21 | `sourceMainQty` | 原需求主数量 | `source_main_qty` | Decimal |
| 22 | `sourceChangeTimeHour` | 原变动时间(小时) | `source_change_time_hour` | Decimal |
| 23 | `srcDocType` | 来源单据类型 | `src_doc_type` | String |
| 24 | `constraintRuleVerId` | 排产版本 | `constraint_rule_ver_id` | 1c76a52f-4c51-4554-9bec-dc552617ce6c |
| 25 | `dataClassType` | 数据类类型 | `data_class_type` | String |
| 26 | `dataClassItem` | 数据类项 | `data_class_item` | String |
| 27 | `dr` | 逻辑删除标记 | `dr` | Short |
| 28 | `createTime` | 创建时间 | `create_time` | DateTime |
| 29 | `createDate` | 创建日期 | `create_date` | Date |
| 30 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 31 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 32 | `creator` | 创建人名称 | `creator` | String |
| 33 | `modifier` | 修改人名称 | `modifier` | String |
| 34 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 35 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 36 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 37 | `source` | 上游单据类型 | `source` | String |
| 38 | `upcode` | 上游单据号 | `upcode` | String |
| 39 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 40 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 41 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 42 | `pubts` | 时间戳 | `pubts` | DateTime |
| 43 | `changeTime` | 变动时间 | `change_time` | Decimal |
| 44 | `timeUnit` | 时间单位 | `time_unit` | String |
| 45 | `fixedTimeHour` | 固定时间(小时) | `fixed_time_hour` | Decimal |
| 46 | `changeTimeHour` | 变动时间(小时) | `change_time_hour` | Decimal |
| 47 | `quantity` | 需求数量 | `quantity` | Decimal |
| 48 | `unit` | 需求单位 | `unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 49 | `mainQuantity` | 需求主数量 | `main_quantity` | Decimal |
| 50 | `mainUnit` | 需求主单位 | `main_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 51 | `conversionRate` | 换算率 | `conversion_rate` | Decimal |
| 52 | `sourceId` | 需求子表ID | `source_id` | Long |
| 53 | `conversionRateDen` | 换算率分母 | `conversion_rateden` | Decimal |
| 54 | `conversionRateNum` | 换算率分子 | `conversion_ratenum` | Decimal |
| 55 | `sourceid` | 上游单据主表id | `sourceid` | Long |

---

## 关联属性（10个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `standardOperation` | 标准工序 | `ed.operation.Operation` | Service |  |
| 2 | `mainUnit` | 需求主单位 | `pc.unit.Unit` | Service |  |
| 3 | `unit` | 需求单位 | `pc.unit.Unit` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `constraintRuleVerId` | 排产版本 | `cmp.constraintRuleVersion.ConstraintRuleVersion` | None |  |
| 6 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 7 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 8 | `capacityDemandId` | 能力需求ID | `cmp.capacitydemand.CapacityDemand` | None | true |
| 9 | `capacityObject` | 加工中心 | `cmp.capacityobject.CapacityObject` | None |  |
| 10 | `defineCharacter` | 自定义项 | `cmp.capacitydemand.CapacityDemandListDefineCT` | None |  |
