---
tags: ["BIP", "元数据", "数据字典", "pes.serviceTeam.serviceTeam"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 服务团队 (`pes.serviceTeam.serviceTeam`)

>  | 物理表：`sms_serviceTeams`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 服务团队 |
| 物理表 | `sms_serviceTeams` |
| domain/服务域 | `imppes` |
| 所属应用 | `` |
| 构建时间 | `2026-06-05 17:20:01.5510` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（22个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `orgId` | 组织id | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 2 | `code` | 编码 | `code` | String |
| 3 | `name` | 名称 | `name` | String |
| 4 | `posId` | 服务点id | `pos_id` | c685b8cd-eb64-47a1-b5a2-fcf3296b3c7d |
| 5 | `productId` | 产品id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 6 | `personId` | 负责人id | `person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 7 | `phone` | 联系电话 | `phone` | String |
| 8 | `memo` | 备注 | `memo` | String |
| 9 | `isEffective` | 启用状态 | `is_effective` | Integer |
| 10 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 11 | `creator` | 创建人名称 | `creator` | String |
| 12 | `createTime` | 创建时间 | `create_time` | DateTime |
| 13 | `createDate` | 创建日期 | `create_date` | Date |
| 14 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 15 | `modifier` | 修改人名称 | `modifier` | String |
| 16 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 17 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 18 | `id` | id | `id` | String |
| 19 | `tenant` | 租户ID | `tenant_id` | String |
| 20 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 21 | `pubts` | 时间戳 | `pubts` | DateTime |
| 22 | `servicepersonsList` | 服务团队人员 | `` | bb5a3f57-e0c1-4b44-a089-757419be6ff0 |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `posId` | 服务点id | `pes.pos.Pos` | None |  |
| 2 | `productId` | 产品id | `pc.product.Product` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `personId` | 负责人id | `bd.staff.Staff` | Service |  |
| 7 | `orgId` | 组织id | `org.func.BaseOrg` | Service |  |
| 8 | `servicepersonsList` | 服务团队人员 | `pes.serviceTeam.serviceTeamPerson` | None | true |
