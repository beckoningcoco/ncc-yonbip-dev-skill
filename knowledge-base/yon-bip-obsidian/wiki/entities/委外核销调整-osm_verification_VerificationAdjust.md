---
tags: ["BIP", "元数据", "数据字典", "OSM", "osm.verification.VerificationAdjust"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外核销调整 (`osm.verification.VerificationAdjust`)

> OSM | 物理表：`po_verification`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外核销调整 |
| 物理表 | `po_verification` |
| 数据库 schema | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:55:24.0350` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 单号 |

---

## 直接属性（64个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `costCenterId` | 成本中心ID | `cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 2 | `demandvirtualAccbodyId` | 需方利润中心ID | `demand_virtual_accbody_id` | e33ec72a-3857-4167-89e2-a437168ed3bb |
| 3 | `freeCharacteristics` | 自由项特征组 | `free_cts` | 135d4c99-941f-45eb-afc9-94b7217aa98c |
| 4 | `postAccountStatus` | 过账状态 | `postAccountStatus` | Short |
| 5 | `postAccountVersion` | 过账版本 | `postAccountVersion` | Long |
| 6 | `supplyVirtualAccbodyId` | 供方利润中心ID | `supply_virtual_accbody_id` | e33ec72a-3857-4167-89e2-a437168ed3bb |
| 7 | `verificationCreateWay` | 来源 | `create_way` | String |
| 8 | `autoVerificationAudit` | 自动审核 | `auto_verification_audit` | Boolean |
| 9 | `fiEventDataId` | 会计事务数据ID | `fiEventDataId` | String |
| 10 | `fiEventId` | 会计事务类型ID | `fiEventId` | String |
| 11 | `fiEventCode` | 会计事务类型编码 | `fiEventCode` | String |
| 12 | `fiEventAccountingDate` | 会计事务记账日期 | `fiEventAccountingDate` | String |
| 13 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 14 | `auditDate` | 审批日期 | `audit_date` | Date |
| 15 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 16 | `auditor` | 审批人名称 | `auditor` | String |
| 17 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 18 | `code` | 单号 | `code` | String |
| 19 | `createDate` | 创建日期 | `create_date` | Date |
| 20 | `createTime` | 创建时间 | `create_time` | DateTime |
| 21 | `creator` | 创建人名称 | `creator` | String |
| 22 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 23 | `docType` | 单据类别 | `doc_type` | String |
| 24 | `financeOrgId` | 会计主体组织 | `finance_org_id` | 4ec9e266-1eae-4f78-b5e3-26c220a15d70 |
| 25 | `id` | ID | `id` | Long |
| 26 | `isMerge` | 合并 | `is_merge` | Boolean |
| 27 | `isReturn` | 返工订单 | `is_return` | Boolean |
| 28 | `isScrap` | 是否废品 | `isScrap` | Boolean |
| 29 | `isUpdateCost` | 更新存货成本 | `isUpdateCost` | Boolean |
| 30 | `materialId` | 成品制造物料Id | `material_id` | Long |
| 31 | `mergeMark` | 合并标识 | `merge_mark` | String |
| 32 | `mergeQuantity` | 合并数量 | `merge_quantity` | Decimal |
| 33 | `modifier` | 修改人名称 | `modifier` | String |
| 34 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 35 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 36 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 37 | `orgId` | 委外组织 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 38 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 39 | `productId` | 成品物料Id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 40 | `pubts` | 时间戳 | `pubts` | DateTime |
| 41 | `purinDate` | 入库日期 | `purin_date` | Date |
| 42 | `purinOrgId` | 入库组织 | `purin_Org_Id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 43 | `purinQuantity` | 入库数量 | `purin_quantity` | Decimal |
| 44 | `purinStockQuantity` | 入库数量(库存单位) | `purin_stock_quantity` | Decimal |
| 45 | `purinrecordsId` | 入库行id | `purinrecords_id` | 3928fe10-4802-4d6d-9545-dfd2ac3aba9c |
| 46 | `purinwarehouseId` | 仓库 | `purin_warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 47 | `remark` | 备注 | `remark` | String |
| 48 | `skuId` | 成品SKUid | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 49 | `sourceType` | 来源 | `source_type` | String |
| 50 | `status` | 单据状态 | `status` | Short |
| 51 | `stockUnitId` | 库存单位 | `stock_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 52 | `subcontractId` | 委外订单id | `subcontract_id` | b80026c8-0517-4255-aca1-b7f374771eb6 |
| 53 | `subcontractproductId` | 委外订单行id | `subcontractproduct_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 54 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 55 | `tplid` | 模板id | `tplid` | Long |
| 56 | `transTypeId` | 交易类型 | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 57 | `unitId` | 主单位 | `unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 58 | `vendorAuth` | 供货供应商权限 | `vendor_id` | 4267e0aa-1efb-4b5e-b921-25dca8392171 |
| 59 | `vendorId` | 委外商 | `vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 60 | `verificationType` | 核销类型 | `verification_type` | String |
| 61 | `verificationUserId` | 核销人 | `verification_user_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 62 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 63 | `inAccountingDate` | 委外入库记账日期 | `in_accounting_date` | String |
| 64 | `verificationDetail` | 委外核销调整明细 | `` | d8a1cd90-dc81-4ef9-bd16-2f6f3b5ff9d8 |

---

## 关联属性（26个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplyVirtualAccbodyId` | 供方利润中心ID | `bd.virtualaccbody.VirtualAccbody` | Service |  |
| 2 | `subcontractId` | 委外订单id | `po.order.Order` | None |  |
| 3 | `subcontractproductId` | 委外订单行id | `po.order.OrderProduct` | None |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `vendorId` | 委外商 | `aa.vendor.Vendor` | Service |  |
| 7 | `vendorAuth` | 供货供应商权限 | `pb.dataauth.VendorDataAuth` | None |  |
| 8 | `orgId` | 委外组织 | `aa.baseorg.OrgMV` | Service |  |
| 9 | `purinrecordsId` | 入库行id | `st.osminrecord.OsmInRecords` | Service |  |
| 10 | `demandvirtualAccbodyId` | 需方利润中心ID | `bd.virtualaccbody.VirtualAccbody` | Service |  |
| 11 | `costCenterId` | 成本中心ID | `bd.costcenter.CostCenter` | Service |  |
| 12 | `transTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 13 | `unitId` | 主单位 | `pc.unit.Unit` | Service |  |
| 14 | `skuId` | 成品SKUid | `pc.product.ProductSKU` | Service |  |
| 15 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 16 | `financeOrgId` | 会计主体组织 | `aa.baseorg.FinanceOrgMV` | Service |  |
| 17 | `productId` | 成品物料Id | `pc.product.Product` | Service |  |
| 18 | `verificationUserId` | 核销人 | `bd.staff.Staff` | Service |  |
| 19 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 20 | `verificationDetail` | 委外核销调整明细 | `osm.verification.VerificationAdjustDetail` | None | true |
| 21 | `purinOrgId` | 入库组织 | `aa.baseorg.OrgMV` | Service |  |
| 22 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 23 | `freeCharacteristics` | 自由项特征组 | `po.verification.ProductFreeCharacteristics` | None |  |
| 24 | `purinwarehouseId` | 仓库 | `aa.warehouse.Warehouse` | Service |  |
| 25 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 26 | `stockUnitId` | 库存单位 | `pc.unit.Unit` | Service |  |
