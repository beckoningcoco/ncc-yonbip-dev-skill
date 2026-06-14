---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.samplePlan.SamplePlanStricter"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 抽样计划加严信息表 (`QMSDFM.samplePlan.SamplePlanStricter`)

> QIC | 物理表：`qms_dfm_sampleplanstricter`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 抽样计划加严信息表 |
| 物理表 | `qms_dfm_sampleplanstricter` |
| domain/服务域 | `QMS-DFM` |
| schema | `qms_dfm` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 16:48:17.4850` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（20个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `createDate` | 创建日期 | `create_date` | Date |
| 2 | `dr` | 逻辑删除标记 | `dr` | Short |
| 3 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 4 | `parentId` | 抽样计划ID | `parentId` | 5539bfee-9f1a-4ea1-84d3-fc996d2426c4 |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime |
| 6 | `tenant` | 租户ID | `tenant_id` | String |
| 7 | `id` | ID | `id` | Long |
| 8 | `start_quantity` | 起始数量 | `start_quantity` | Long |
| 9 | `end_quantity` | 终止数量 | `end_quantity` | Long |
| 10 | `sample_number` | 样本个数 | `sample_number` | String |
| 11 | `ac` | Ac | `ac` | Decimal |
| 12 | `re` | Re | `re` | Decimal |
| 13 | `creatorId` | 创建人id | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 14 | `creator` | 创建人 | `creator` | String |
| 15 | `createTime` | 创建时间 | `create_time` | DateTime |
| 16 | `modifierId` | 修改人id | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 17 | `modifier` | 修改人 | `modifier` | String |
| 18 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 19 | `definect_c` | 自定义项特征组 | `definect_c` | 3a6a7c89-eaa6-4184-8d35-1a32c9b3b298 |
| 20 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人id | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人id | `base.user.User` | Service |  |
| 4 | `definect_c` | 自定义项特征组 | `QMSDFM.samplePlan.SamplePlanStricterDefineCharacter` | None |  |
| 5 | `parentId` | 抽样计划ID | `QMSDFM.samplePlan.SamplePlan` | None | true |
