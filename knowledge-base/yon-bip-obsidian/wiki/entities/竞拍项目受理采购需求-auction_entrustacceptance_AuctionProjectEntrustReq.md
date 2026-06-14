---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.entrustacceptance.AuctionProjectEntrustReq"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 竞拍项目受理采购需求 (`auction.entrustacceptance.AuctionProjectEntrustReq`)

> ycSouringAuction | 物理表：`cpu_project_apt_req`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 竞拍项目受理采购需求 |
| 物理表 | `cpu_project_apt_req` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:25:18.3160` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键ID |

---

## 直接属性（16个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 主键ID | `id` | Long |
| 2 | `reqDetailId` | 采购需求子表ID | `req_detail_id` | 5f4eb70b-e0cd-415d-b97e-1c12b0acb571 |
| 3 | `reqId` | 采购需求主表ID | `req_id` | bac52eb7-97d5-4c52-8a52-cc1d9bf96c66 |
| 4 | `bidSectionMaterialId` | 标段物料ID | `bid_section_material_id` | d1c773f8-faee-4714-9ef2-044060d8ee18 |
| 5 | `wbs` | WBS_ID | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 6 | `activity` | 活动ID | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 7 | `bidProjectId` | 竞拍项目受理主表ID | `bid_project_id` | 112566c3-981c-47e7-a9f9-701d0dccf82e |
| 8 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 9 | `dr` | 逻辑删除标记 | `dr` | Short |
| 10 | `ecProcessStatus` | 电商处理状态 | `ec_process_status` | String |
| 11 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 12 | `erpApplyorderType` | erp请购单类型 | `erp_applyorder_type` | Integer |
| 13 | `pubts` | 时间戳 | `pubts` | DateTime |
| 14 | `reqStatus` | 记录采购需求原始状态 | `req_status` | String |
| 15 | `tenantId` | tenant租户 | `tenant_id` | String |
| 16 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `activity` | 活动ID | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `wbs` | WBS_ID | `BGDM.wbs.wbs_doc` | Service |  |
| 4 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 5 | `bidProjectId` | 竞拍项目受理主表ID | `auction.entrustacceptance.AuctionProjectEntrust` | None | true |
| 6 | `bidSectionMaterialId` | 标段物料ID | `auction.project.AuctionSectionMaterial` | None |  |
| 7 | `reqDetailId` | 采购需求子表ID | `sourcing.pureq.CpuIpuReqSkuext` | Service |  |
| 8 | `reqId` | 采购需求主表ID | `sourcing.pureq.IpuPuReq` | Service |  |
