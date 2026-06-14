---
tags: ["BIP", "元数据", "数据字典", "OSM", "po.verification.Verification"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外核销与调整 (`po.verification.Verification`)

> OSM | 物理表：`po_verification`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外核销与调整 |
| 物理表 | `po_verification` |
| domain/服务域 | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:55:32.0210` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 单号 |

---

## 直接属性（64个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `autoVerificationAudit` | 自动审核 | `auto_verification_audit` | Boolean |
| 2 | `costCenterId` | 成本中心ID | `cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 3 | `fiEventAccountingDate` | 会计事务记账日期 | `fiEventAccountingDate` | String |
| 4 | `fiEventCode` | 会计事务类型编码 | `fiEventCode` | String |
| 5 | `fiEventDataId` | 会计事务数据ID | `fiEventDataId` | String |
| 6 | `fiEventId` | 会计事务类型ID | `fiEventId` | String |
| 7 | `freeCharacteristics` | 自由项特征组 | `free_cts` | 135d4c99-941f-45eb-afc9-94b7217aa98c |
| 8 | `verificationCreateWay` | 来源 | `create_way` | String |
| 9 | `id` | ID | `id` | Long |
| 10 | `orgId` | 组织ID | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 11 | `financeOrgId` | 会计主体组织ID | `finance_org_id` | 4ec9e266-1eae-4f78-b5e3-26c220a15d70 |
| 12 | `transTypeId` | 交易类型ID | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 13 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 14 | `vendorId` | 委外商ID | `vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 15 | `code` | 单号 | `code` | String |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime |
| 17 | `verificationType` | 核销类型 | `verification_type` | String |
| 18 | `verificationUserId` | 核销人ID | `verification_user_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 19 | `status` | 状态 | `status` | Short |
| 20 | `isReturn` | 返工订单 | `is_return` | Boolean |
| 21 | `isMerge` | 合并 | `is_merge` | Boolean |
| 22 | `mergeMark` | 合并标识 | `merge_mark` | String |
| 23 | `mergeQuantity` | 合并数量 | `merge_quantity` | Decimal |
| 24 | `sourceType` | 来源 | `source_type` | String |
| 25 | `docType` | 单据类别 | `doc_type` | String |
| 26 | `purinrecordsId` | 入库行ID | `purinrecords_id` | 3928fe10-4802-4d6d-9545-dfd2ac3aba9c |
| 27 | `purinwarehouseId` | 入库仓库ID | `purin_warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 28 | `subcontractproductId` | 委外订单行Id | `subcontractproduct_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 29 | `subcontractId` | 委外订单Id | `subcontract_id` | b80026c8-0517-4255-aca1-b7f374771eb6 |
| 30 | `purinDate` | 入库日期 | `purin_date` | Date |
| 31 | `materialId` | 成品制造物料ID | `material_id` | Long |
| 32 | `productId` | 物料ID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 33 | `skuId` | SKUID | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 34 | `purinStockQuantity` | 件数 | `purin_stock_quantity` | Decimal |
| 35 | `stockUnitId` | 库存单位ID | `stock_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 36 | `purinQuantity` | 数量 | `purin_quantity` | Decimal |
| 37 | `unitId` | 主计量单位ID | `unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 38 | `remark` | 备注 | `remark` | String |
| 39 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 40 | `creator` | 创建人 | `creator` | String |
| 41 | `createTime` | 创建时间 | `create_time` | DateTime |
| 42 | `modifier` | 修改人 | `modifier` | String |
| 43 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 44 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 45 | `auditor` | 审核人 | `auditor` | String |
| 46 | `auditTime` | 审核时间 | `audit_time` | DateTime |
| 47 | `auditDate` | 审核日期 | `audit_date` | Date |
| 48 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 49 | `tplid` | 模板id | `tplid` | Long |
| 50 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 51 | `isScrap` | 是否废品 | `isScrap` | Boolean |
| 52 | `postAccountStatus` | 过账状态 | `postAccountStatus` | Short |
| 53 | `supplyVirtualAccbodyId` | 供方利润中心ID | `supply_virtual_accbody_id` | e33ec72a-3857-4167-89e2-a437168ed3bb |
| 54 | `demandvirtualAccbodyId` | 需方利润中心ID | `demand_virtual_accbody_id` | e33ec72a-3857-4167-89e2-a437168ed3bb |
| 55 | `postAccountVersion` | 过账版本 | `postAccountVersion` | Long |
| 56 | `purinOrgId` | 入库组织 | `purin_Org_Id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 57 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 58 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 59 | `isUpdateCost` | 更新存货成本 | `isUpdateCost` | Boolean |
| 60 | `vendorAuth` | 供货供应商权限 | `vendor_id` | 4267e0aa-1efb-4b5e-b921-25dca8392171 |
| 61 | `createDate` | 创建日期 | `create_date` | Date |
| 62 | `inAccountingDate` | 委外入库记账日期 | `in_accounting_date` | String |
| 63 | `verificationDetail` | 委外核销明细 | `` | 8a33f803-8486-4d8c-902a-2178022a5c4e |
| 64 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（26个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplyVirtualAccbodyId` | 供方利润中心ID | `bd.virtualaccbody.VirtualAccbody` | Service |  |
| 2 | `subcontractId` | 委外订单Id | `po.order.Order` | None |  |
| 3 | `subcontractproductId` | 委外订单行Id | `po.order.OrderProduct` | None |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `vendorId` | 委外商ID | `aa.vendor.Vendor` | Service |  |
| 7 | `vendorAuth` | 供货供应商权限 | `pb.dataauth.VendorDataAuth` | None |  |
| 8 | `orgId` | 组织ID | `aa.baseorg.OrgMV` | Service |  |
| 9 | `purinrecordsId` | 入库行ID | `st.osminrecord.OsmInRecords` | Service |  |
| 10 | `demandvirtualAccbodyId` | 需方利润中心ID | `bd.virtualaccbody.VirtualAccbody` | Service |  |
| 11 | `costCenterId` | 成本中心ID | `bd.costcenter.CostCenter` | Service |  |
| 12 | `transTypeId` | 交易类型ID | `bd.bill.TransType` | Service |  |
| 13 | `unitId` | 主计量单位ID | `pc.unit.Unit` | Service |  |
| 14 | `skuId` | SKUID | `pc.product.ProductSKU` | Service |  |
| 15 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 16 | `financeOrgId` | 会计主体组织ID | `aa.baseorg.FinanceOrgMV` | Service |  |
| 17 | `productId` | 物料ID | `pc.product.Product` | Service |  |
| 18 | `verificationUserId` | 核销人ID | `bd.staff.Staff` | Service |  |
| 19 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 20 | `verificationDetail` | 委外核销明细 | `po.verification.VerificationDetail` | None | true |
| 21 | `purinOrgId` | 入库组织 | `aa.baseorg.OrgMV` | Service |  |
| 22 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 23 | `freeCharacteristics` | 自由项特征组 | `po.verification.ProductFreeCharacteristics` | None |  |
| 24 | `purinwarehouseId` | 入库仓库ID | `aa.warehouse.Warehouse` | Service |  |
| 25 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 26 | `stockUnitId` | 库存单位ID | `pc.unit.Unit` | Service |  |
