---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.announcement.LawbidAnnouncementQualify"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 发标报名审核条件 (`lawbid.announcement.LawbidAnnouncementQualify`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_bid_pjt_qualify`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 发标报名审核条件 |
| 物理表 | `cpu_bid_pjt_qualify` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:56:22.7250` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

## 部署信息

- 部署时间: 2025-10-24 23:57:48:000

## 依赖接口（5个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 4 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 5 | 资格审核条件接口 | `announcement.itf.IAnnouncementQualify` | 143 |

---

## 直接属性（15个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `announcementId` | 公告主表ID | `announcement_id` | c8caefa3-7f5b-4560-bb77-c2962503e2df |
| 2 | `bidSectionId` | 标段包Id | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 3 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 4 | `dr` | 逻辑删除标记 | `dr` | Short |
| 5 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 6 | `id` | ID | `id` | Long |
| 7 | `isMustUpload` | 是否必须上传 | `is_must_upload` | Short |
| 8 | `lawbidSystemId` | 原始ID | `lawbid_system_id` | Long |
| 9 | `lawbidSystemType` | 原始表 | `lawbid_system_type` | String |
| 10 | `pubts` | 时间戳 | `pubts` | DateTime |
| 11 | `qualifyExplain` | 资质描述 | `qualify_explain` | String |
| 12 | `qualifyId` | 资质id | `qualify_id` | Long |
| 13 | `qualifyName` | 资质名称 | `qualify_name` | String |
| 14 | `qualifyNo` | 资质编码 | `qualify_no` | String |
| 15 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `announcementId` | 公告主表ID | `lawbid.announcement.LawbidAnnouncement` | None | true |
| 3 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 4 | `bidSectionId` | 标段包Id | `lawbid.section.LawbidSection` | None |  |
