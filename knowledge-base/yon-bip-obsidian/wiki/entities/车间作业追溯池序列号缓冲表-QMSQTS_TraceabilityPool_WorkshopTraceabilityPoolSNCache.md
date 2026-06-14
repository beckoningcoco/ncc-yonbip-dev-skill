---
tags: ["BIP", "元数据", "数据字典", "QMSQTS", "QMSQTS.TraceabilityPool.WorkshopTraceabilityPoolSNCache"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 车间作业追溯池序列号缓冲表 (`QMSQTS.TraceabilityPool.WorkshopTraceabilityPoolSNCache`)

> QMSQTS | 物理表：`qms_qts_c_tracepool_sn_cache`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 车间作业追溯池序列号缓冲表 |
| 物理表 | `qms_qts_c_tracepool_sn_cache` |
| domain/服务域 | `QMS-DFM` |
| schema | `qms_dfm` |
| 所属应用 | `QMSQTS` |
| 构建时间 | `2026-06-05 17:00:48.8900` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（17个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `billType` | 单据类型 | `bill_type` | String |
| 2 | `createDate` | 创建日期 | `create_date` | Date |
| 3 | `createTime` | 创建时间 | `create_time` | DateTime |
| 4 | `creator` | 创建人名称 | `creator` | String |
| 5 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 6 | `dr` | 逻辑删除标记 | `dr` | Short |
| 7 | `grandchildID` | 序列号孙表ID | `grandchild_id` | Long |
| 8 | `id` | id | `id` | Long |
| 9 | `modifier` | 修改人名称 | `modifier` | String |
| 10 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 11 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 12 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 13 | `pubts` | 时间戳 | `pubts` | DateTime |
| 14 | `serialNumber` | 序列号 | `serial_number` | String |
| 15 | `serialNumberID` | 序列号主档ID | `serial_number_id` | Long |
| 16 | `workshopTPID` | 车间作业追溯池ID | `workshop_tp_id` | 1224e30e-149e-48d6-8ecd-7efa9ce74c7d |
| 17 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `workshopTPID` | 车间作业追溯池ID | `QMSQTS.TraceabilityPool.WorkshopTraceabilityPool` | None |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
