---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.sdrelation.SDRelationSupply"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 供应路径-供应 (`mr.sdrelation.SDRelationSupply`)

> MR | 物理表：`mr_sd_relation_supply`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应路径-供应 |
| 物理表 | `mr_sd_relation_supply` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:18:24.0570` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（23个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 2 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 3 | `supplyOrgId` | 供应组织 | `supply_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 4 | `id` | ID | `id` | Long |
| 5 | `sdDemandId` | 外键id | `sd_demand_id` | 35696f11-f0cd-42aa-bf8a-b41478e12e67 |
| 6 | `sequence` | 顺序号 | `sequence` | Integer |
| 7 | `warehouseId` | 仓库id | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 8 | `supplyType` | 供应类型 | `supply_type` | SupplyTypeEnum |
| 9 | `crossOrgFlag` | 跨组织入库 | `cross_org_flag` | Boolean |
| 10 | `vendorId` | 供应商 | `vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 11 | `ratio` | 比例(%) | `ratio` | Decimal |
| 12 | `sharedSupply` | 共享供应 | `shared_supply` | Integer |
| 13 | `demandReplenishment` | 需求补货 | `demand_replenishment` | Integer |
| 14 | `transportDays` | 运输天数 | `transport_days` | Integer |
| 15 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 16 | `creator` | 创建人名称 | `creator` | String |
| 17 | `createDate` | 创建日期 | `create_date` | Date |
| 18 | `createTime` | 创建时间 | `create_time` | DateTime |
| 19 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 20 | `modifier` | 修改人名称 | `modifier` | String |
| 21 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 22 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 23 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `warehouseId` | 仓库id | `aa.warehouse.Warehouse` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `vendorId` | 供应商 | `aa.vendor.Vendor` | Service |  |
| 6 | `supplyOrgId` | 供应组织 | `aa.baseorg.OrgMV` | Service |  |
| 7 | `sdDemandId` | 外键id | `mr.sdrelation.SDRelationDemand` | None | true |
| 8 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
