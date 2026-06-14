---
tags: ["BIP", "元数据", "数据字典", "ycBusinessCenter", "saleauction.bidnotice.NoticeApproveVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 供应商报名审核记录表 (`saleauction.bidnotice.NoticeApproveVO`)

> ycBusinessCenter | 物理表：`cpu_bid_notice_approve`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应商报名审核记录表 |
| 物理表 | `cpu_bid_notice_approve` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycBusinessCenter` |
| 构建时间 | `2026-06-04 23:43:53.8560` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（18个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | id | `id` | Long |
| 2 | `approveStatus` | 采购商审核状态 | `approve_status` | String |
| 3 | `approveTime` | 采购商审批时间 | `approve_time` | Date |
| 4 | `bidSectionNames` | 标段名称 | `bid_section_names` | String |
| 5 | `reviewerName` | 招标审核人名称 | `reviewer_name` | String |
| 6 | `bidNoticeId` | 供应商报名主表 | `bid_notice_id` | 9f3db86b-e723-4fde-a245-f09c2e59bab1 |
| 7 | `approveSuggestion` | 采购商审批意见 | `approve_suggestion` | String |
| 8 | `reviewerPsnId` | 招标审核人personId | `reviewer_psn_id` | String |
| 9 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 10 | `createTime` | 创建时间 | `create_time` | DateTime |
| 11 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 12 | `dr` | 逻辑删除标记 | `dr` | Short |
| 13 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 14 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 15 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime |
| 17 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 18 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `creator` | 创建人 | `base.user.BipUser` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `modifier` | 修改人 | `base.user.BipUser` | Service |  |
| 4 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 5 | `bidNoticeId` | 供应商报名主表 | `saleauction.bidnotice.NoticeVO` | None | true |
