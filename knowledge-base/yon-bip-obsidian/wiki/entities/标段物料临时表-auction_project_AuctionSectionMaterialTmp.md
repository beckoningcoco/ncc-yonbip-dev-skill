---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.project.AuctionSectionMaterialTmp"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 标段物料临时表 (`auction.project.AuctionSectionMaterialTmp`)

> ycSouringAuction | 物理表：`cpu_project_section_material_tmp`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 标段物料临时表 |
| 物理表 | `cpu_project_section_material_tmp` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:26:04.8270` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（11个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bidSectionId` | 标段包 | `bid_section_id` | be269c23-7eb6-4029-ac01-781f16c75ec4 |
| 2 | `bidSectionMaterialId` | 标段包更新数据 | `bid_section_material_id` | d1c773f8-faee-4714-9ef2-044060d8ee18 |
| 3 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 4 | `dr` | 逻辑删除标记 | `dr` | Short |
| 5 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 6 | `id` | ID | `id` | Long |
| 7 | `num` | 需求数量 | `num` | Decimal |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime |
| 9 | `reqId` | 采购需求主表ID | `req_id` | bac52eb7-97d5-4c52-8a52-cc1d9bf96c66 |
| 10 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 11 | `mainCount` | 主数量 | `main_count` | Decimal |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 3 | `bidSectionId` | 标段包 | `auction.project.AuctionSection` | None | true |
| 4 | `bidSectionMaterialId` | 标段包更新数据 | `auction.project.AuctionSectionMaterial` | None |  |
| 5 | `reqId` | 采购需求主表ID | `sourcing.pureq.IpuPuReq` | Service |  |
