---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.tenderAnnouncement.LawbidAnnouncementQualifyTender"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 发标报名审核条件 (`lawbid.tenderAnnouncement.LawbidAnnouncementQualifyTender`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_bid_pjt_qualify_tender`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 发标报名审核条件 |
| 物理表 | `cpu_bid_pjt_qualify_tender` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:03:12.8650` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2025-10-24 23:58:02:000

## 依赖接口（5个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 4 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 5 | 招标公告资格审核条件接口 | `tenderAnnouncement.itf.ITenderAnnouncementQualify` | 4 |

---

## 直接属性（15个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | id | `id` | Long |
| 2 | `pubts` | 最后修改时间 | `pubts` | DateTime |
| 3 | `announcementId` | 公告主表ID | `announcement_id` | e764c131-bca2-44d7-a8af-fe17cb0837f8 |
| 4 | `enterpriseId` | 租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 5 | `ytenant` | 新租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 6 | `bidSectionId` | 标段包Id | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 7 | `qualifyId` | 资质id | `qualify_id` | Long |
| 8 | `qualifyNo` | 资质编码 | `qualify_no` | String |
| 9 | `qualifyName` | 资质名称 | `qualify_name` | String |
| 10 | `qualifyExplain` | 资质描述 | `qualify_explain` | String |
| 11 | `isMustUpload` | 是否必须上传 | `is_must_upload` | Short |
| 12 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 13 | `dr` | 逻辑删除标记 | `dr` | Short |
| 14 | `lawbidSystemId` | 原始ID | `lawbid_system_id` | Long |
| 15 | `lawbidSystemType` | 原始表 | `lawbid_system_type` | String |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 新租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `announcementId` | 公告主表ID | `lawbid.tenderAnnouncement.LawbidAnnouncementTender` | None | true |
| 3 | `enterpriseId` | 租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 4 | `bidSectionId` | 标段包Id | `lawbid.section.LawbidSection` | None |  |
