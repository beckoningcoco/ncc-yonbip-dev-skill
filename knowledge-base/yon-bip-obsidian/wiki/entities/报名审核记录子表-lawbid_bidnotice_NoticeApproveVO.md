---
tags: ["BIP", "元数据", "数据字典", "ycBusinessCenter", "lawbid.bidnotice.NoticeApproveVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 报名审核记录子表 (`lawbid.bidnotice.NoticeApproveVO`)

> ycBusinessCenter | 物理表：`cpu_bid_notice_approve`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 报名审核记录子表 |
| 物理表 | `cpu_bid_notice_approve` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycBusinessCenter` |
| 构建时间 | `2026-06-04 23:43:39.6810` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（14个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 2 | `dr` | 逻辑删除标记 | `dr` | Short |
| 3 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime |
| 5 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 6 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 7 | `id` | id | `id` | Long |
| 8 | `approveStatus` | 采购商审核状态 | `approve_status` | String |
| 9 | `approveTime` | 采购商审批时间 | `approve_time` | Date |
| 10 | `bidSectionNames` | 标段名称 | `bid_section_names` | String |
| 11 | `reviewerName` | 招标审核人名称 | `reviewer_name` | String |
| 12 | `bidNoticeId` | 供应商报名主表 | `bid_notice_id` | 9856b255-b5b6-4b2e-a8b9-a2c4ae9962b5 |
| 13 | `approveSuggestion` | 采购商审批意见 | `approve_suggestion` | String |
| 14 | `reviewerPsnId` | 招标审核人 | `reviewer_psn_id` | String |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 3 | `bidNoticeId` | 供应商报名主表 | `lawbid.bidnotice.NoticeVO` | None | true |
