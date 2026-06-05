---
tags: ["BIP", "元数据", "数据字典", "PO", "po.replenishdemand.ReplenishDemandPullCardVO"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 补货需求拉单卡片 (`po.replenishdemand.ReplenishDemandPullCardVO`)

> PO | 物理表：`po_replenish_demand`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 补货需求拉单卡片 |
| 物理表 | `po_replenish_demand` |
| 数据库 schema | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:32:59.4770` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（24个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `orgId` | 工厂 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 3 | `transTypeId` | 交易类型 | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 4 | `timeBucket` | 时格id | `time_bucket` | 4e2f676d-fbf6-448e-b43f-aae7fd6fa808 |
| 5 | `isConsiderStock` | 考虑存量 | `is_consider_stock` | Boolean |
| 6 | `isConsiderTransit` | 考虑在途 | `is_consider_transit` | Boolean |
| 7 | `outOrgId` | 调出组织id | `out_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 8 | `createDate` | 创建日期 | `create_date` | Date |
| 9 | `createTime` | 创建时间 | `create_time` | DateTime |
| 10 | `creator` | 创建人名称 | `creator` | String |
| 11 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 12 | `modifier` | 修改人名称 | `modifier` | String |
| 13 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 14 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 15 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 16 | `orderTransTypeId` | 生产订单交易类型 | `order_trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime |
| 18 | `replenishDemandChildMaterial` | 补货需求拉单卡片(子件物料) | `` | 1b9ae795-80ad-4397-8a09-1389b30cd4fa |
| 19 | `replenishDemandDept` | 补货需求拉单卡片(部门) | `` | ae92b216-d722-4dda-9b64-320fd4dcc78f |
| 20 | `replenishDemandMaterial` | 补货需求拉单卡片(母件物料) | `` | 4daf79e5-79a1-400e-852f-e43fa89a0b39 |
| 21 | `replenishDemandOrder` | 补货需求拉单卡片(生产订单) | `` | 40d74674-c00a-4c75-8ded-108aa4243511 |
| 22 | `replenishDemandWarehouse` | 补货需求拉单卡片(仓库) | `` | 30765ab3-f236-4b92-9e63-36e34d89cbed |
| 23 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 24 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（14个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `replenishDemandWarehouse` | 补货需求拉单卡片(仓库) | `po.replenishdemand.ReplenishDemandPullCardWarehouseVO` | None | true |
| 5 | `outOrgId` | 调出组织id | `aa.baseorg.OrgMV` | Service |  |
| 6 | `orgId` | 工厂 | `aa.baseorg.OrgMV` | Service |  |
| 7 | `replenishDemandChildMaterial` | 补货需求拉单卡片(子件物料) | `po.replenishdemand.ReplenishDemandPullCardChildMaterialVO` | None | true |
| 8 | `replenishDemandOrder` | 补货需求拉单卡片(生产订单) | `po.replenishdemand.ReplenishDemandPullCardOrderVO` | None | true |
| 9 | `transTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 10 | `replenishDemandDept` | 补货需求拉单卡片(部门) | `po.replenishdemand.ReplenishDemandPullCardDeptVO` | None | true |
| 11 | `timeBucket` | 时格id | `mr.timebucket.TimeBucket` | Service |  |
| 12 | `orderTransTypeId` | 生产订单交易类型 | `bd.bill.TransType` | Service |  |
| 13 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 14 | `replenishDemandMaterial` | 补货需求拉单卡片(母件物料) | `po.replenishdemand.ReplenishDemandPullCardMaterialVO` | None | true |
