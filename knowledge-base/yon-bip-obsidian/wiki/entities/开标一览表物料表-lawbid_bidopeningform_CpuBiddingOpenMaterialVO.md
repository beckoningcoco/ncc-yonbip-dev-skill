---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.bidopeningform.CpuBiddingOpenMaterialVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 开标一览表物料表 (`lawbid.bidopeningform.CpuBiddingOpenMaterialVO`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_bidding_open_material`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 开标一览表物料表 |
| 物理表 | `cpu_bidding_open_material` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:56:41.7270` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 开标一览表物料主实体ID |

## 部署信息

- 部署时间: 2025-10-24 23:57:22:000

## 依赖接口（4个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 2 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 3 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 4 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |

---

## 直接属性（16个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 开标一览表物料主实体ID | `id` | Long |
| 2 | `noTaxLastPrice` | 上期成交价无税单价 | `no_tax_last_price` | Decimal |
| 3 | `lowestPrice` | 历史最低价含税单价 | `lowest_price` | Decimal |
| 4 | `noTaxLowestPrice` | 历史最低价无税单价 | `no_tax_lowest_price` | Decimal |
| 5 | `dr` | 逻辑删除标记 | `dr` | Short |
| 6 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 7 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 8 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 9 | `pubts` | 时间戳 | `pubts` | DateTime |
| 10 | `biddingOpenId` | 开标一览表物料实体外键ID | `bidding_open_id` | 8d279da2-d477-4e56-8299-9b4ae7032099 |
| 11 | `historicalPrice` | 历史价格 | `historical_price` | Decimal |
| 12 | `supplydocId` | 供应商档案ID | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 13 | `biddingDetailld` | 投标单物料id | `bidding_detail_id` | 102df149-dc26-44a9-8fbe-02be312d8a34 |
| 14 | `sectionMaterialld` | 标包物料id | `section_material_id` | 3fe14cdc-d32f-4161-80ad-994d5f6c57e3 |
| 15 | `materialId` | 物料id | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 16 | `steps` | 汇总报价单物料价格梯度明细 | `` | c26b80f0-fdab-4bd7-bc0c-53da9c12a187 |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplydocId` | 供应商档案ID | `aa.vendor.Vendor` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `biddingOpenId` | 开标一览表物料实体外键ID | `lawbid.bidopeningform.CpuBiddingOpenVO` | None | true |
| 4 | `biddingDetailld` | 投标单物料id | `lawbid.bid.BiddingMaterialDetailVO` | None |  |
| 5 | `sectionMaterialld` | 标包物料id | `lawbid.section.LawbidSectionMaterial` | None |  |
| 6 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 7 | `materialId` | 物料id | `pc.product.Product` | Service |  |
| 8 | `steps` | 汇总报价单物料价格梯度明细 | `lawbid.bidopeningform.OpenMaterialStep` | None | true |
