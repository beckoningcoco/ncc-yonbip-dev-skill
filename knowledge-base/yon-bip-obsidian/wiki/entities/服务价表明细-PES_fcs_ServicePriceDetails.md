---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "PES.fcs.ServicePriceDetails"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 服务价表明细 (`PES.fcs.ServicePriceDetails`)

> IMP_PES | 物理表：`imp_fcs_service_price_details`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 服务价表明细 |
| 物理表 | `imp_fcs_service_price_details` |
| 数据库 schema | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:18:30.2550` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（32个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `productCategoryId` | 产品分类 | `product_category_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 2 | `equipmentType` | 设备分类id | `equipmentType` | 2cc09807-e5f0-4c71-a7ac-c4f932b8bdb7 |
| 3 | `deptId` | 服务部门 | `dept_id` | 10ff81be-23e4-45e8-b173-240aff8ef9f3 |
| 4 | `postId` | 服务点 | `post_Id` | c685b8cd-eb64-47a1-b5a2-fcf3296b3c7d |
| 5 | `tosId` | 服务类型 | `tos_id` | 792f6d8f-bf3b-4090-ac4d-a7f2e9230758 |
| 6 | `proejctId` | 服务项目 | `proejct_id` | 80e2a9ee-50bc-440b-97c0-694cf5697ccc |
| 7 | `addressId` | 地址 | `address_id` | 95577e23-979f-4f09-a629-61fea93e576d |
| 8 | `priceCustomerBeyond` | 保外应收客户 | `price_customer_beyond` | Decimal |
| 9 | `priceCustomerPeriod` | 保内应收客户 | `price_customer_period` | Decimal |
| 10 | `pricePosPeriod` | 保外应付网点 | `price_pos_period` | Decimal |
| 11 | `pricePosBeyond` | 保内应付网点 | `price_pos_beyond` | Decimal |
| 12 | `priceStaffPeriod` | 保外应付员工 | `price_staff_period` | Decimal |
| 13 | `priceStaffBeyond` | 保内应付员工 | `price_staff_beyond` | Decimal |
| 14 | `priceId` | 价表ID | `price_id` | 41f5e436-cfa5-4ed0-a025-c11d5ecebf2b |
| 15 | `businessKey` | 业务主键 | `business_key` | String |
| 16 | `orgId` | 组织id | `org_id` | String |
| 17 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 18 | `creator` | 创建人名称 | `creator` | String |
| 19 | `createUser` | 创建人 | `create_user` | String |
| 20 | `createTime` | 创建时间 | `create_time` | DateTime |
| 21 | `createDate` | 创建日期 | `create_date` | Date |
| 22 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 23 | `modifier` | 修改人名称 | `modifier` | String |
| 24 | `lastModifyUser` | 修改人 | `last_modify_user` | String |
| 25 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 26 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 27 | `lastModified` | 修改时间 | `last_modified` | DateTime |
| 28 | `id` | ID | `id` | String |
| 29 | `dr` | DR | `dr` | Short |
| 30 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 31 | `tenant` | 租户ID | `tenant_id` | String |
| 32 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（11个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `productCategoryId` | 产品分类 | `pc.cls.ManagementClass` | Service |  |
| 2 | `tosId` | 服务类型 | `pes.tos.Tos` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `proejctId` | 服务项目 | `pes.serviceProject.ServiceProject` | None |  |
| 5 | `deptId` | 服务部门 | `bd.adminOrg.AdminOrgViewDept` | Service |  |
| 6 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 7 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 8 | `postId` | 服务点 | `pes.pos.Pos` | None |  |
| 9 | `priceId` | 价表ID | `PES.fcs.ServicePrices` | None | true |
| 10 | `equipmentType` | 设备分类id | `ampub.ambase.CategoryVO` | Service |  |
| 11 | `addressId` | 地址 | `bd.region.BaseRegionVO` | Service |  |
