---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.serviceTime.ServiceTime"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 服务时限 (`pes.serviceTime.ServiceTime`)

> IMP_PES | 物理表：`sms_allot_times`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 服务时限 |
| 物理表 | `sms_allot_times` |
| 数据库 schema | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:17:34.6790` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（31个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `serviceOrgId` | 服务组织ID | `service_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 2 | `tosId` | 服务类型ID | `tos_id` | 792f6d8f-bf3b-4090-ac4d-a7f2e9230758 |
| 3 | `urgency` | 紧急程度 | `urgency` | String |
| 4 | `productCategoryId` | 产品分类ID | `product_category_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 5 | `customerCategoryId` | 客户分类ID | `customer_category_id` | 3198ce2d-0e64-462d-bacf-54d18171756a |
| 6 | `stepLimit` | 每环节时长(小时) | `step_limit` | Decimal |
| 7 | `totalLimit` | 总时长(小时) | `total_limit` | Decimal |
| 8 | `isEffective` | 启用状态 | `is_effective` | Integer |
| 9 | `memo` | 备注 | `memo` | String |
| 10 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 11 | `creator` | 创建人名称 | `creator` | String |
| 12 | `createUser` | 创建者 | `create_user` | String |
| 13 | `createTime` | 创建时间 | `create_time` | DateTime |
| 14 | `createDate` | 创建日期 | `create_date` | Date |
| 15 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 16 | `modifier` | 修改人名称 | `modifier` | String |
| 17 | `lastModifyUser` | 最近修改者 | `last_modify_user` | String |
| 18 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 19 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 20 | `lastModified` | 最近修改时间 | `last_modified` | String |
| 21 | `orgId` | 组织ID | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 22 | `urgencyName` | 紧急类型名称 | `urgency_name` | String |
| 23 | `kmscategorie` | 故障分类 | `kmscategorie` | String |
| 24 | `posId` | 服务点ID | `pos_id` | c685b8cd-eb64-47a1-b5a2-fcf3296b3c7d |
| 25 | `uomId` | 计量单位ID | `uom_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 26 | `id` | ID | `id` | String |
| 27 | `dr` | 逻辑删除 | `dr` | Integer |
| 28 | `tenant` | 租户ID | `tenant_id` | String |
| 29 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 30 | `pubts` | 时间戳 | `pubts` | DateTime |
| 31 | `ts` | 版本号 | `ts` | String |

---

## 关联属性（10个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `posId` | 服务点ID | `pes.pos.Pos` | None |  |
| 2 | `productCategoryId` | 产品分类ID | `pc.cls.ManagementClass` | Service |  |
| 3 | `tosId` | 服务类型ID | `pes.tos.Tos` | None |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `serviceOrgId` | 服务组织ID | `org.func.BaseOrg` | Service |  |
| 8 | `uomId` | 计量单位ID | `pc.unit.Unit` | Service |  |
| 9 | `customerCategoryId` | 客户分类ID | `aa.custcategory.CustCategory` | Service |  |
| 10 | `orgId` | 组织ID | `org.func.BaseOrg` | Service |  |
