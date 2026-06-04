---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.announcement.AuctionDepositPaymentMethod"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 保证金缴纳方式 (`auction.announcement.AuctionDepositPaymentMethod`)

> ycSouringAuction | 物理表：`cpu_auction_deposit_payment_method`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 保证金缴纳方式 |
| 物理表 | `cpu_auction_deposit_payment_method` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:25:45.3560` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（9个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `depositPaymentCode` | 保证金缴纳方式编码 | `deposit_payment_code` | String |
| 2 | `depositPaymentId` | 保证金缴纳方式主键 | `deposit_payment_id` | c88936ac-b4d4-4f31-b90e-eca5f8037e4b |
| 3 | `auctionAnnouncementSectionId` | 公告子表 | `auction_announcement_section_id` | d046c9cf-68b1-48bb-8686-13a20ae80de7 |
| 4 | `bidSectionId` | 标段ID | `bid_section_id` | be269c23-7eb6-4029-ac01-781f16c75ec4 |
| 5 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 6 | `dr` | 逻辑删除标记 | `dr` | Short |
| 7 | `id` | ID | `id` | Long |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime |
| 9 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `auctionAnnouncementSectionId` | 公告子表 | `auction.announcement.AuctionAnnouncementSection` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `depositPaymentId` | 保证金缴纳方式主键 | `ewallet.config.PayType` | Service |  |
| 4 | `bidSectionId` | 标段ID | `auction.project.AuctionSection` | None |  |
