---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.biddocumentfile.CpuBidDocumentFileCategory"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 文件归档子表 (`lawbid.biddocumentfile.CpuBidDocumentFileCategory`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_bid_document_file_category`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 文件归档子表 |
| 物理表 | `cpu_bid_document_file_category` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:56:30.1090` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2026-05-22 22:09:33:000

## 依赖接口（4个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 3 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 4 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |

---

## 直接属性（15个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 2 | `dr` | 删除标志 | `dr` | Short |
| 3 | `enterpriseId` | 企业 | `enterprise_id` | Long |
| 4 | `enterpriseName` | 企业名称 | `enterprise_name` | String |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime |
| 6 | `tenantId` | 租户 | `tenant_id` | String |
| 7 | `ts` | 默认值 | `ts` | DateTime |
| 8 | `ytenant` | 租户 | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 9 | `id` | id | `id` | Long |
| 10 | `rowNo` | 行号 | `row_no` | Integer |
| 11 | `categoryName` | 文件分类名称 | `category_name` | String |
| 12 | `bidDocumentId` | 主表外键 | `bid_document_id` | 81cd8638-3519-4a15-b1e2-bb655d5801f2 |
| 13 | `ytenantId` | 租户 | `ytenant_id` | String |
| 14 | `isFromTemplate` | 是否是参照带过来的 | `isFromTemplate` | Boolean |
| 15 | `documentItems` | 文件归档孙表 | `` | 3641284d-f940-4bbc-b1da-a937ddd9f949 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户 | `yht.tenant.YhtTenant` | Service |  |
| 2 | `bidDocumentId` | 主表外键 | `lawbid.biddocumentfile.CpuBidDocumentFile` | None | true |
| 3 | `documentItems` | 文件归档孙表 | `lawbid.biddocumentfile.CpuBidDocumentFileItem` | None | true |
