---
tags: ["BIP", "元数据", "数据字典", "PO", "po.order.OrderHoldinfo"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 生产订单挂起信息 (`po.order.OrderHoldinfo`)

> PO | 物理表：`po_order_holdinfo`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 生产订单挂起信息 |
| 物理表 | `po_order_holdinfo` |
| domain/服务域 | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:23:03.1800` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | b80026c8-0517-4255-aca1-b7f374771eb6 | ID |

---

## 直接属性（13个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `pubts` | 时间戳 | `pubts` | DateTime |
| 2 | `id` | ID | `id` | b80026c8-0517-4255-aca1-b7f374771eb6 |
| 3 | `holdReasonId` | 挂起原因ID | `hold_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 4 | `holdDate` | 挂起日期 | `hold_date` | Date |
| 5 | `holdUserId` | 挂起人ID | `hold_user_id` | Long |
| 6 | `holdUser` | 挂起人 | `hold_user` | String |
| 7 | `holdTime` | 挂起时间 | `hold_time` | DateTime |
| 8 | `releaseReasonId` | 解挂原因ID | `release_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 9 | `releaseDate` | 解挂日期 | `release_date` | Date |
| 10 | `releaseUserId` | 解挂人ID | `release_user_id` | Long |
| 11 | `releaseUser` | 解挂人 | `release_user` | String |
| 12 | `releaseTime` | 解挂时间 | `release_time` | DateTime |
| 13 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `releaseReasonId` | 解挂原因ID | `aa.reason.Reason` | Service |  |
| 3 | `id` | ID | `po.order.Order` | None | true |
| 4 | `holdReasonId` | 挂起原因ID | `aa.reason.Reason` | Service |  |
