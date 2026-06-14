---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.bidinvitation.BidSubjectVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 投标标段 (`auction.bidinvitation.BidSubjectVO`)

> ycSouringAuction | 物理表：`cpu_bid_subject`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 投标标段 |
| 物理表 | `cpu_bid_subject` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:24:24.9560` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（19个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | id | `id` | Long |
| 2 | `bidSectionId` | 标段(包)ID | `bid_section_id` | be269c23-7eb6-4029-ac01-781f16c75ec4 |
| 3 | `announcementSectionId` | 邀请书公告ID | `bid_announcement_section_id` | d046c9cf-68b1-48bb-8686-13a20ae80de7 |
| 4 | `dr` | 逻辑删除标记 | `dr` | Short |
| 5 | `createTime` | 创建时间 | `create_time` | DateTime |
| 6 | `createDate` | 创建日期 | `create_date` | Date |
| 7 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 8 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 9 | `creator` | 创建人名称 | `creator` | String |
| 10 | `modifier` | 修改人名称 | `modifier` | String |
| 11 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 12 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 13 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 14 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 15 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 16 | `enterpriseId` | 租户主键 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 17 | `bidProjectId` | 招标项目ID | `bid_project_id` | 94b777ba-4855-4d81-a975-f6ab6b09f9a8 |
| 18 | `pubts` | 最后修改时间 | `pubts` | DateTime |
| 19 | `biddings` | 供应商投标单 | `` | 15e79b2d-d323-481c-919e-348ab3f982b3 |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `biddings` | 供应商投标单 | `auction.bidinvitation.SubjectBiddingVO` | None | true |
| 2 | `announcementSectionId` | 邀请书公告ID | `auction.announcement.AuctionAnnouncementSection` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `enterpriseId` | 租户主键 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 7 | `bidProjectId` | 招标项目ID | `auction.project.AuctionProject` | None |  |
| 8 | `bidSectionId` | 标段(包)ID | `auction.project.AuctionSection` | None |  |
