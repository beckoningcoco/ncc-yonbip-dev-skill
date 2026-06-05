---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.sos.SoComplete"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工单完工【废弃】 (`pes.sos.SoComplete`)

> IMP_PES | 物理表：`sms_so_complete`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工单完工【废弃】 |
| 物理表 | `sms_so_complete` |
| 数据库 schema | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:20:14.9530` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |
| 编码 | `so_complete_id` | String | 单据编码 |

---

## 直接属性（26个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `attachmentId` | 附件Id | `attachmentId` | String |
| 2 | `checkResult` | 验收状态 | `check_result` | String |
| 3 | `completeAt` | 实际完工时间 | `complete_at` | DateTime |
| 4 | `completeStatus` | 完成状态 | `complete_status` | String |
| 5 | `createTimeStr` | 创建时间 | `create_time` | String |
| 6 | `createUser` | 创建者 | `create_user` | String |
| 7 | `dr` | 逻辑删除 | `dr` | Integer |
| 8 | `id` | ID | `id` | String |
| 9 | `lastModified` | 最近修改时间 | `last_modified` | String |
| 10 | `lastModifyUser` | 最近修改者 | `last_modify_user` | String |
| 11 | `memoComplete` | 完工说明 | `memo_complete` | String |
| 12 | `orgId` | 组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 13 | `priceMaterial` | 应收材料费 | `price_material` | Decimal |
| 14 | `priceOther` | 其他费用 | `price_other` | Decimal |
| 15 | `priceService` | 应收服务费 | `price_service` | Decimal |
| 16 | `priceSum` | 费用合计 | `price_sum` | Decimal |
| 17 | `projectId` | 服务项目 | `project_id` | 80e2a9ee-50bc-440b-97c0-694cf5697ccc |
| 18 | `pubts` | 时间戳 | `pubts` | DateTime |
| 19 | `qaType` | 质保类型 | `qa_type` | String |
| 20 | `soCompleteId` | 单据编码 | `so_complete_id` | String |
| 21 | `soId` | 工单Id | `so_id` | 18332b41-ebd3-4301-90af-714dfea07d9f |
| 22 | `tenant` | 租户ID | `tenant_id` | String |
| 23 | `transactionType` | 交易类型 | `transaction_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 24 | `ts` | 版本号 | `ts` | String |
| 25 | `workingHours` | 工时 | `working_hours` | Decimal |
| 26 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `transactionType` | 交易类型 | `bd.bill.TransType` | Service |  |
| 2 | `soId` | 工单Id | `pes.sos.SmsSos` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `projectId` | 服务项目 | `pes.serviceProject.ServiceProject` | None |  |
| 5 | `orgId` | 组织 | `org.func.BaseOrg` | Service |  |
