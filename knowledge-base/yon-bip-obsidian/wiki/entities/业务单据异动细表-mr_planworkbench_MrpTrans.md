---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.planworkbench.MrpTrans"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 业务单据异动细表 (`mr.planworkbench.MrpTrans`)

> MR | 物理表：`mr_mrp_trans`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 业务单据异动细表 |
| 物理表 | `mr_mrp_trans` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:10:55.4320` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（50个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `createDate` | 创建日期 | `create_date` | Date |
| 2 | `createTime` | 创建时间 | `create_time` | DateTime |
| 3 | `creator` | 创建人名称 | `creator` | String |
| 4 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 5 | `datasub` | 应用来源 | `datasub` | String |
| 6 | `docDate` | 单据日期 | `doc_date` | DateTime |
| 7 | `docId` | 单据 | `doc_id` | Long |
| 8 | `docLineId` | 单据行 | `doc_line_id` | Long |
| 9 | `docLineNo` | 单据行号 | `doc_line_no` | String |
| 10 | `docMainQty` | 主单位数量 | `doc_main_qty` | Decimal |
| 11 | `docNo` | 单据号 | `doc_no` | String |
| 12 | `docOrg` | 供需组织 | `doc_org` | 14302233-1394-4a70-94e1-bed51636f312 |
| 13 | `docQty` | 单据数量 | `doc_qty` | Decimal |
| 14 | `docTypeCode` | 单据类型编码 | `doc_type_code` | DocTypeEnum |
| 15 | `docTypeId` | 供需单据类型 | `doc_type_id` | b1ac8af8-72c2-4b2d-939f-9d7e22bd2f9c |
| 16 | `dr` | 逻辑删除标识 | `dr` | Integer |
| 17 | `free1` | 规格1 | `free1` | String |
| 18 | `free10` | 规格10 | `free10` | String |
| 19 | `free2` | 规格2 | `free2` | String |
| 20 | `free3` | 规格3 | `free3` | String |
| 21 | `free4` | 规格4 | `free4` | String |
| 22 | `free5` | 规格5 | `free5` | String |
| 23 | `free6` | 规格6 | `free6` | String |
| 24 | `free7` | 规格7 | `free7` | String |
| 25 | `free8` | 规格8 | `free8` | String |
| 26 | `free9` | 规格9 | `free9` | String |
| 27 | `id` | ID | `id` | Long |
| 28 | `mainUom` | 主单位 | `main_uom` | String |
| 29 | `materialId` | 制造物料 | `material_id` | Long |
| 30 | `modifier` | 修改人名称 | `modifier` | String |
| 31 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 32 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 33 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 34 | `productId` | product | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 35 | `pubts` | 时间戳 | `pubts` | DateTime |
| 36 | `remark` | 备注 | `remark` | String |
| 37 | `reserveid` | 跟踪线索id | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 38 | `skuId` | SKU | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 39 | `srcDocDate` | 来源单据日期 | `src_doc_date` | DateTime |
| 40 | `srcDocId` | 来源单据 | `src_doc_id` | Long |
| 41 | `srcDocLineId` | 来源单据行 | `src_doc_line_id` | Long |
| 42 | `srcDocLineNo` | 来源单据行号 | `src_doc_line_no` | String |
| 43 | `srcDocNo` | 来源单据号 | `src_doc_no` | String |
| 44 | `srcDocTypeId` | 来源单据类型 | `src_doc_type_id` | String |
| 45 | `sysId` | 系统ID | `sys_id` | String |
| 46 | `sysTag` | 系统标签 | `sys_tag` | String |
| 47 | `sysType` | 系统类型 | `sys_type` | String |
| 48 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 49 | `uom` | 单位 | `uom` | String |
| 50 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（9个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `docOrg` | 供需组织 | `org.func.BaseOrg` | Service |  |
| 2 | `productId` | product | `pc.product.Product` | Service |  |
| 3 | `reserveid` | 跟踪线索id | `st.reservation.Reservation` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `docTypeId` | 供需单据类型 | `mr.sdDocType.SDDocType` | None |  |
| 6 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 7 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 8 | `skuId` | SKU | `pc.product.ProductSKU` | Service |  |
| 9 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
