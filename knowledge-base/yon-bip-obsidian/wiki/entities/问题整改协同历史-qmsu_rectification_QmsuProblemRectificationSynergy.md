---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "qmsu.rectification.QmsuProblemRectificationSynergy"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 问题整改协同历史 (`qmsu.rectification.QmsuProblemRectificationSynergy`)

> ycSaleCoor | 物理表：`qmsu_problem_rectification_synergy`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 问题整改协同历史 |
| 物理表 | `qmsu_problem_rectification_synergy` |
| 数据库 schema | `yonbip-cpu-synergy` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:32:13.9400` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（17个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `action` | 业务动作 | `action` | String |
| 2 | `rectificationId` | 问题整改id | `rectification_id` | 90e038b6-07e0-40bd-bfb7-f0890939dc13 |
| 3 | `createDate` | 创建日期 | `create_date` | Date |
| 4 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 5 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 6 | `modifier` | 修改人名称 | `modifier` | String |
| 7 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 8 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 9 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 10 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 11 | `tenant` | 租户ID | `tenant_id` | String |
| 12 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 13 | `pubts` | 时间戳 | `pubts` | DateTime |
| 14 | `entityTag` | 身份标签 | `entity_tag` | String |
| 15 | `createTime` | 创建时间 | `create_time` | DateTime |
| 16 | `creator` | 处理人 | `creator` | String |
| 17 | `id` | ID | `id` | Long |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `rectificationId` | 问题整改id | `qmsu.rectification.QmsuProblemRectification` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
