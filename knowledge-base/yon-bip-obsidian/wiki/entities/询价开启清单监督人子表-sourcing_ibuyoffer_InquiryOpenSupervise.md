---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.ibuyoffer.InquiryOpenSupervise"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 询价开启清单监督人子表 (`sourcing.ibuyoffer.InquiryOpenSupervise`)

> ycSouringInquiry | 物理表：`cpu_buyoffer_supervise`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 询价开启清单监督人子表 |
| 物理表 | `cpu_buyoffer_supervise` |
| 数据库 schema | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 构建时间 | `2026-06-04 23:07:19.1400` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | 82c4d623-677d-4aa3-ae69-0b4257dd2799 | 监督人子表id |

---

## 直接属性（8个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `supervisePsnId` | 监督人员id | `supervise_psn_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 2 | `supervisePsnName` | 监督人员名称 | `supervise_psn_name` | String |
| 3 | `id` | 监督人子表id | `id` | 82c4d623-677d-4aa3-ae69-0b4257dd2799 |
| 4 | `quotationId` | 询价开启清单Id | `quotationId` | bf62599c-f667-424e-996b-aef6b54eebae |
| 5 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 6 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 7 | `dr` | 逻辑删除标识 | `dr` | Integer |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supervisePsnId` | 监督人员id | `bd.staff.Staff` | Service |  |
| 2 | `quotationId` | 询价开启清单Id | `sourcing.ibuyoffer.InquiryOpenVO` | None | true |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `id` | 监督人子表id | `sourcing.ibuyoffer.BuyOfferSuperviseVO` | None |  |
