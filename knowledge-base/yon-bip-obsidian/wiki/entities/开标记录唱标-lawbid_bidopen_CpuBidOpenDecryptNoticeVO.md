---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.bidopen.CpuBidOpenDecryptNoticeVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 开标记录唱标 (`lawbid.bidopen.CpuBidOpenDecryptNoticeVO`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_bid_open_decrypt_notice`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 开标记录唱标 |
| 物理表 | `cpu_bid_open_decrypt_notice` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:56:37.1410` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2026-01-23 23:56:32:000

## 依赖接口（2个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 2 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |

---

## 直接属性（19个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `dr` | 逻辑删除标记 | `dr` | Short |
| 2 | `pubts` | 时间戳 | `pubts` | DateTime |
| 3 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 4 | `id` | id | `id` | Long |
| 5 | `enterpriseId` | 租户主键 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 6 | `enterpriseName` | 租户名 | `enterprise_name` | String |
| 7 | `bidopenId` | 开标记录主表 | `bidopen_id` | d9b08ed7-bb49-4184-bf86-23970f6dcb80 |
| 8 | `biddingId` | 租户主键 | `bidding_id` | 560d390c-4459-4448-8e73-f6ce26a04dba |
| 9 | `sectionId` | 标段(包)ID | `section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 10 | `sectionCode` | 标段(包)编码 | `section_code` | String |
| 11 | `sectionName` | 标段(包)名称 | `section_name` | String |
| 12 | `bidderId` | 投标人主键 | `bidder_id` | Long |
| 13 | `bidderCode` | 投标人编码 | `bidder_code` | String |
| 14 | `bidderName` | 供应商名称 | `bidder_name` | String |
| 15 | `secretStatus` | 文件加解密状态 | `secret_status` | Integer |
| 16 | `decryptTime` | 解密时间 | `decrypt_time` | DateTime |
| 17 | `content` | 解密通知 | `content` | String |
| 18 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 19 | `stepSeq` | 当前分步开标阶段 | `step_seq` | Integer |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bidopenId` | 开标记录主表 | `lawbid.bidopen.CpuBidOpenVO` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `biddingId` | 租户主键 | `lawbid.bid.BiddingVO` | None |  |
| 4 | `enterpriseId` | 租户主键 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 5 | `sectionId` | 标段(包)ID | `lawbid.section.LawbidSection` | None |  |
