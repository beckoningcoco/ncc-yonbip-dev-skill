---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.entrustacceptance.AuctionProjectEntrustGroup"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 竞拍项目受理小组 (`auction.entrustacceptance.AuctionProjectEntrustGroup`)

> ycSouringAuction | 物理表：`cpu_project_apt_group`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 竞拍项目受理小组 |
| 物理表 | `cpu_project_apt_group` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:25:16.9730` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键ID |

---

## 直接属性（20个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 主键ID | `id` | Long |
| 2 | `psnName` | 姓名 | `psn_name` | String |
| 3 | `psnUserId` | 成员userid | `psn_user_id` | String |
| 4 | `psnId` | 人员id | `psn_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 5 | `psnUcuserid` | 友互通用户ID | `psn_uc_user_id` | String |
| 6 | `psnOrgName` | 所在单位 | `psn_org_name` | String |
| 7 | `psnOrgId` | 组织id | `psn_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 8 | `psnDeptName` | 部门 | `psn_dept_name` | String |
| 9 | `psnDeptId` | 人员部门id | `psn_dept_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 10 | `psnPosition` | 职责 | `psn_position` | String |
| 11 | `bidProjectId` | 竞拍项目受理主表ID | `bid_project_id` | 112566c3-981c-47e7-a9f9-701d0dccf82e |
| 12 | `bidSectionId` | 标段包id | `bid_section_id` | 15243ad8-6c8b-4b6b-971b-88aaa0506f6c |
| 13 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 14 | `dr` | 逻辑删除标记 | `dr` | Short |
| 15 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 16 | `psnEmail` | 邮箱 | `psn_email` | String |
| 17 | `psnMobile` | 手机号 | `psn_mobile` | String |
| 18 | `pubts` | 时间戳 | `pubts` | DateTime |
| 19 | `tenantId` | tenant租户 | `tenant_id` | String |
| 20 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `psnId` | 人员id | `bd.staff.Staff` | Service |  |
| 3 | `psnOrgId` | 组织id | `org.func.BaseOrg` | Service |  |
| 4 | `psnDeptId` | 人员部门id | `org.func.BaseOrg` | Service |  |
| 5 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 6 | `bidProjectId` | 竞拍项目受理主表ID | `auction.entrustacceptance.AuctionProjectEntrust` | None | true |
| 7 | `bidSectionId` | 标段包id | `auction.entrustacceptance.AuctionProjectEntrustSection` | None |  |
