---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.matchprocess.MatchProcess"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# MRP供需追溯明细表主表 (`mr.matchprocess.MatchProcess`)

> MR | 物理表：`mr_matchprocess`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | MRP供需追溯明细表主表 |
| 物理表 | `mr_matchprocess` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:10:48.1670` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（42个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `allocatedQuantity` | 冲减数量 | `allocated_quantity` | Decimal |
| 2 | `associationGUID` | 计划订单关联GUID | `association_guid` | String |
| 3 | `auditDate` | 审核日期 | `audit_date` | DateTime |
| 4 | `free1` | 规格1 | `free1` | String |
| 5 | `free10` | 规格10 | `free10` | String |
| 6 | `free2` | 规格2 | `free2` | String |
| 7 | `free3` | 规格3 | `free3` | String |
| 8 | `free4` | 规格4 | `free4` | String |
| 9 | `free5` | 规格5 | `free5` | String |
| 10 | `free6` | 规格6 | `free6` | String |
| 11 | `free7` | 规格7 | `free7` | String |
| 12 | `free8` | 规格8 | `free8` | String |
| 13 | `free9` | 规格9 | `free9` | String |
| 14 | `id` | ID | `id` | Long |
| 15 | `materialId` | 制造物料id | `material_id` | Long |
| 16 | `materialRowNumber` | 子件行号 | `material_row_number` | Integer |
| 17 | `netRequirementQuantity` | 匹配后余量 | `net_requirement_quantity` | Decimal |
| 18 | `orgId` | 工厂 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 19 | `planParamId` | 计划参数id | `plan_param_id` | Long |
| 20 | `planVoucherCode` | 计划订单号 | `plan_voucher_code` | String |
| 21 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 22 | `productId` | 物料ID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 23 | `pubts` | 时间戳 | `pubts` | DateTime |
| 24 | `requirementDate` | 需求日期 | `requirement_date` | DateTime |
| 25 | `requirementDocType` | 无状态需求类型 | `requirement_doc_type` | DocTypeWithoutStatus |
| 26 | `requirementQuantity` | 需求订单余量 | `requirement_quantity` | Decimal |
| 27 | `requirementType` | 需求类型 | `requirement_type` | RequirementTypeEnum |
| 28 | `requirementVoucherCode` | 需求订单号 | `requirement_voucher_code` | String |
| 29 | `rowId` | 行id | `row_id` | Long |
| 30 | `rowNumber` | 行号 | `row_number` | Integer |
| 31 | `status` | 订单状态 | `status` | Integer |
| 32 | `supplyDate` | 供应日期 | `supply_date` | DateTime |
| 33 | `supplyDocType` | 无状态供应类型 | `supply_doc_type` | DocTypeWithoutStatus |
| 34 | `supplyQuantity` | 供应订单余量 | `supply_quantity` | Decimal |
| 35 | `supplyType` | 供应类型 | `supply_type` | SupplyTypeEnum |
| 36 | `supplyVoucherCode` | 供应订单号 | `supply_voucher_code` | String |
| 37 | `supplyVoucherQuantity` | 供应订单原量 | `supply_voucher_quantity` | Decimal |
| 38 | `supplyVoucherRowId` | 供应订单行id | `supply_voucher_row_id` | Long |
| 39 | `supplyVoucherRowNumber` | 供应订单行号 | `supply_voucher_row_number` | String |
| 40 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 41 | `voucherQuantity` | 需求订单原量 | `voucher_quantity` | Decimal |
| 42 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `productId` | 物料ID | `pc.product.Product` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 4 | `orgId` | 工厂 | `aa.baseorg.OrgMV` | Service |  |
| 5 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
