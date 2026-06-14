---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.allotPos.AllotPos"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 服务点分配规则 (`pes.allotPos.AllotPos`)

> IMP_PES | 物理表：`sms_allot_pos`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 服务点分配规则 |
| 物理表 | `sms_allot_pos` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:17:44.4940` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（34个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `orgId` | 组织ID | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 2 | `code` | 编码 | `code` | String |
| 3 | `name` | 名称 | `name` | String |
| 4 | `isEffective` | 启用状态 | `is_effective` | Integer |
| 5 | `memo` | 备注 | `memo` | String |
| 6 | `regionId` | 所属区域id | `region_id` | 95577e23-979f-4f09-a629-61fea93e576d |
| 7 | `productCategoryId` | 产品分类ID | `product_category_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 8 | `equipmentId` | 设备ID | `equipment_id` | e9f23971-1c19-49e1-83d7-3a84ebcb187e |
| 9 | `customerId` | 客户ID | `customer_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 10 | `bdProjectId` | 项目ID | `bd_project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 11 | `tosId` | 服务类型ID | `tos_id` | 792f6d8f-bf3b-4090-ac4d-a7f2e9230758 |
| 12 | `serviceOrgId` | 服务组织ID | `service_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 13 | `posId` | 服务点ID | `pos_id` | c685b8cd-eb64-47a1-b5a2-fcf3296b3c7d |
| 14 | `addressCountry` | 国家 | `address_country` | String |
| 15 | `addressProvince` | 省 | `address_province` | String |
| 16 | `addressCity` | 市 | `address_city` | String |
| 17 | `addressDistrict` | 区 | `address_district` | String |
| 18 | `addressStreet` | 街道 | `address_street` | String |
| 19 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 20 | `creator` | 创建人名称 | `creator` | String |
| 21 | `createTime` | 创建时间 | `create_time` | DateTime |
| 22 | `createDate` | 创建日期 | `create_date` | Date |
| 23 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 24 | `modifier` | 修改人名称 | `modifier` | String |
| 25 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 26 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 27 | `productId` | 产品 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 28 | `customerCategoryId` | 客户分类 | `customer_category_id` | 3198ce2d-0e64-462d-bacf-54d18171756a |
| 29 | `id` | ID | `id` | String |
| 30 | `dr` | 是否删除 | `dr` | Integer |
| 31 | `tenant` | 租户ID | `tenant_id` | String |
| 32 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 33 | `pubts` | 时间戳 | `pubts` | DateTime |
| 34 | `ts` | 时间戳 | `ts` | String |

---

## 关联属性（14个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `productId` | 产品 | `pc.product.Product` | Service |  |
| 2 | `tosId` | 服务类型ID | `pes.tos.Tos` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `bdProjectId` | 项目ID | `bd.project.ProjectVO` | Service |  |
| 7 | `customerCategoryId` | 客户分类 | `aa.custcategory.CustCategory` | Service |  |
| 8 | `equipmentId` | 设备ID | `aim.equip.EquipHeadVO` | Service |  |
| 9 | `orgId` | 组织ID | `org.func.BaseOrg` | Service |  |
| 10 | `posId` | 服务点ID | `pes.pos.Pos` | None |  |
| 11 | `productCategoryId` | 产品分类ID | `pc.cls.ManagementClass` | Service |  |
| 12 | `regionId` | 所属区域id | `bd.region.BaseRegionVO` | Service |  |
| 13 | `customerId` | 客户ID | `aa.merchant.Merchant` | Service |  |
| 14 | `serviceOrgId` | 服务组织ID | `org.func.BaseOrg` | Service |  |
