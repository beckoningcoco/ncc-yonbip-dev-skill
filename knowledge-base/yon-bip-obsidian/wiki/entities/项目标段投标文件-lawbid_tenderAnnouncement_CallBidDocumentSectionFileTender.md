---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.tenderAnnouncement.CallBidDocumentSectionFileTender"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 项目标段投标文件 (`lawbid.tenderAnnouncement.CallBidDocumentSectionFileTender`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_bid_document_section_file_tender`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 项目标段投标文件 |
| 物理表 | `cpu_bid_document_section_file_tender` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:16:58.2310` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

## 部署信息

- 部署时间: 2025-10-24 23:58:02:000

## 依赖接口（5个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 4 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 5 | 招标公告标段投标文件 | `tenderAnnouncement.itf.ITenderCallBidDocumentSectionFile` | 4 |

---

## 直接属性（19个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `pubts` | 最后修改时间 | `pubts` | DateTime |
| 3 | `enterpriseId` | 租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 4 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 5 | `ytenant` | 新租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 6 | `callBidDocumentSectionId` | 招标文件子表 | `call_bid_document_section_id` | cabadb1e-5c64-4035-bbba-d79c9db61370 |
| 7 | `name` | 文件名称 | `name` | String |
| 8 | `reviewTypeId` | 文件类型ID | `review_type_id` | 92b613a5-0e7c-4f87-8a9b-7fccc9ba556a |
| 9 | `reviewType` | 文件类型 | `review_type` | String |
| 10 | `attachFileId` | 格式模板 | `attach_file_id` | String |
| 11 | `necessary` | 是否必须提供 | `necessary` | Integer |
| 12 | `rowNo` | 行号 | `row_no` | Decimal |
| 13 | `requirementFileType` | 是否限制文件格式 | `requirement_file_type` | String |
| 14 | `fileType` | 文件类型要求 | `file_type` | String |
| 15 | `bidSectionId` | 标段id | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 16 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 17 | `dr` | 逻辑删除标记 | `dr` | Short |
| 18 | `lawbidSystemId` | 原始ID | `lawbid_system_id` | Long |
| 19 | `lawbidSystemType` | 原始表 | `lawbid_system_type` | String |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 新租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `callBidDocumentSectionId` | 招标文件子表 | `lawbid.tenderAnnouncement.LawbidAnnouncementSectionTender` | None | true |
| 3 | `enterpriseId` | 租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 4 | `bidSectionId` | 标段id | `lawbid.section.LawbidSection` | None |  |
| 5 | `reviewTypeId` | 文件类型ID | `bctask.basedoc.CustomerDocVO` | Service |  |
