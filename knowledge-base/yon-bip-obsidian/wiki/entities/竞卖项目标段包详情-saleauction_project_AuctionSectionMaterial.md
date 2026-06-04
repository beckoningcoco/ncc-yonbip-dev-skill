---
tags: ["BIP", "元数据", "数据字典", "ycAuction", "saleauction.project.AuctionSectionMaterial"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 竞卖项目标段包详情 (`saleauction.project.AuctionSectionMaterial`)

> ycAuction | 物理表：`cpu_project_section_material`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 竞卖项目标段包详情 |
| 物理表 | `cpu_project_section_material` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycAuction` |
| 构建时间 | `2026-06-04 23:45:26.5370` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（79个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | id | `id` | Long |
| 2 | `pubts` | 最后修改时间 | `pubts` | DateTime |
| 3 | `bidProjectId` | 招标方案主表ID | `bid_project_id` | 9f8b9356-4cd6-4ae7-8dc0-c84dfecdda07 |
| 4 | `bidSectionId` | 招标方案标段包ID | `bid_section_id` | 052621d8-fde7-4ab0-94bf-b179c720ce6d |
| 5 | `rowNo` | 行号 | `row_no` | Decimal |
| 6 | `materialId` | 物料id | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 7 | `expenseItemId` | 费用项目id | `expense_item_id` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 |
| 8 | `erpApplyorderType` | erp请购单类型 | `erp_applyorder_type` | Integer |
| 9 | `processesId` | 工序id | `processes_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 10 | `receiveOrgId` | 收货组织id | `receive_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 11 | `receivePersonId` | 收货人id | `receive_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 12 | `receivePersonTel` | 收货人联系方式 | `receive_person_tel` | String |
| 13 | `reqDeptId` | 需求部门id | `reqdept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 |
| 14 | `materialClassName` | 物料分类名称 | `material_class_name` | String |
| 15 | `invPriceExchRateType` | 采购计价换算率类型 | `inv_price_exch_rate_type` | Short |
| 16 | `dr` | 逻辑删除标记 | `dr` | Short |
| 17 | `purUnitName` | 采购单位 | `pur_unit_name` | String |
| 18 | `projectCloudId` | 项目id | `project_cloud_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 19 | `materialName` | 物料名称 | `material_name` | String |
| 20 | `unit` | 单位 | `unit` | String |
| 21 | `firstUpLineNo` | 源头单据行号 | `first_up_line_no` | Integer |
| 22 | `sourceType` | 单据类型 | `source_type` | String |
| 23 | `firstSourceId` | 源头单据主表id | `first_source_id` | Long |
| 24 | `discountTaxType` | 扣税类别 | `discount_tax_type` | String |
| 25 | `materialModel` | 物料型号 | `material_model` | String |
| 26 | `materialNo` | 物料编码 | `material_no` | String |
| 27 | `firstSource` | 源头单据类型 | `first_source` | String |
| 28 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 29 | `costCenterId` | 成本中心id | `cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 30 | `materialClassId` | 物料分类ID | `material_class_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 31 | `materialSpec` | 物料规格 | `material_spec` | String |
| 32 | `reqOrgName` | 需求公司名称 | `req_org_name` | String |
| 33 | `firstUpCode` | 源头单据号 | `first_up_code` | String |
| 34 | `firstSourceAutoId` | 源头单据子表id | `first_source_auto_id` | Long |
| 35 | `tenantId` | tenant租户 | `tenant_id` | String |
| 36 | `unitid` | 单位id | `unitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 37 | `priceMark` | 价格标识 | `price_mark` | Short |
| 38 | `reqDesc` | 标的物描述 | `req_desc` | String |
| 39 | `enterpriseId` | 租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 40 | `AuctionSectionMaterialDefineCharacter` | 标段物料自定义项 | `define_character_id` | eb47c839-dd7a-4364-ad49-df9cc84668bd |
| 41 | `AuctionSectionMaterialFreeCharacter` | 标段物料自由项 | `free_characters_id` | eac82713-1dab-4c76-aabd-a226a7e93b8e |
| 42 | `guidingTaxRate` | 指导税率(%) | `guiding_tax_rate` | Decimal |
| 43 | `num` | 数量 | `num` | Decimal |
| 44 | `guaranteedSupply` | 保供量 | `guaranteed_supply` | String |
| 45 | `mainCount` | 主数量 | `main_count` | Decimal |
| 46 | `guaranteed_supply_limit` | 保供量下限 | `guaranteed_supply_limit` | Decimal |
| 47 | `purCount` | 采购数量 | `pur_count` | Decimal |
| 48 | `invPurExchRate` | 采购换算率 | `inv_pur_exch_rate` | Decimal |
| 49 | `reqOrgId` | 需求公司id | `req_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 50 | `highestPrice` | 最高限价 | `highest_price` | Decimal |
| 51 | `invPriceExchRate` | 计价换算率 | `inv_price_exch_rate` | Decimal |
| 52 | `invPurExchRateType` | 采购换算率类型 | `inv_pur_exch_rate_type` | Short |
| 53 | `materialBrand` | 品牌 | `material_brand` | String |
| 54 | `materialQualifyStandard` | 质量要求 | `material_qualify_standard` | String |
| 55 | `reqTime` | 需求日期 | `req_time` | Date |
| 56 | `receiveAddress` | 收货地址 | `receive_address` | String |
| 57 | `purchaseType` | 采购类型 | `purchase_type` | String |
| 58 | `reqId` | 采购需求主表ID | `req_id` | bac52eb7-97d5-4c52-8a52-cc1d9bf96c66 |
| 59 | `reqDetailId` | 采购需求子表ID | `req_detail_id` | Long |
| 60 | `reqEndTime` | 需求结束日期 | `req_end_time` | Date |
| 61 | `startAddress` | 物流起运地 | `start_address` | String |
| 62 | `destinationAddress` | 物流终点 | `destination_address` | String |
| 63 | `purUnitId` | 采购单位主键 | `pur_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 64 | `mileage` | 物流里程 | `mileage` | Decimal |
| 65 | `transmaterial` | 物流运输物资 | `transmaterial` | String |
| 66 | `mainUnitId` | 主单位主键 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 67 | `entryTime` | 项目进场时间 | `entry_time` | DateTime |
| 68 | `purCategory` | 采购类别 | `pur_category` | String |
| 69 | `exceptionFormId` | 异常申请单ID | `exception_form_id` | Long |
| 70 | `billStates` | 状态 | `bill_states` | String |
| 71 | `ytenant` | 新租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 72 | `demandNum` | 数量 | `demand_num` | Decimal |
| 73 | `orderSplit` | 分单标识 | `order_split` | String |
| 74 | `invPriceExchRateDen` | 计价换算率分母 | `inv_price_exch_rate_den` | Decimal |
| 75 | `invPriceExchRateNum` | 计价换算率分子 | `inv_price_exch_rate_num` | Decimal |
| 76 | `invPurExchRateDen` | 采购换算率分母 | `inv_pur_exch_rate_den` | Decimal |
| 77 | `invPurExchRateNum` | 采购换算率分子 | `inv_pur_exch_rate_num` | Decimal |
| 78 | `sourceLineNo` | 来源单据行号 | `source_line_no` | Integer |
| 79 | `taxRateId` | 税率ID | `tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |

---

## 关联属性（21个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `expenseItemId` | 费用项目id | `bd.expenseitem.ExpenseItem` | Service |  |
| 2 | `processesId` | 工序id | `ed.operation.Operation` | Service |  |
| 3 | `receiveOrgId` | 收货组织id | `org.func.BaseOrg` | Service |  |
| 4 | `reqDeptId` | 需求部门id | `bd.adminOrg.AdminOrgVO` | Service |  |
| 5 | `materialClassId` | 物料分类ID | `pc.cls.ManagementClass` | Service |  |
| 6 | `ytenant` | 新租户id | `yht.tenant.YhtTenant` | Service |  |
| 7 | `projectCloudId` | 项目id | `bd.project.ProjectVO` | Service |  |
| 8 | `purUnitId` | 采购单位主键 | `pc.unit.Unit` | Service |  |
| 9 | `materialId` | 物料id | `pc.product.Product` | Service |  |
| 10 | `bidProjectId` | 招标方案主表ID | `saleauction.project.AuctionProject` | None |  |
| 11 | `reqId` | 采购需求主表ID | `sourcing.pureq.IpuPuReq` | Service |  |
| 12 | `AuctionSectionMaterialFreeCharacter` | 标段物料自由项 | `saleauction.project.AuctionSectionMaterialFreeCharacter` | None |  |
| 13 | `receivePersonId` | 收货人id | `bd.staff.Staff` | Service |  |
| 14 | `costCenterId` | 成本中心id | `bd.costcenter.CostCenter` | Service |  |
| 15 | `unitid` | 单位id | `pc.unit.Unit` | Service |  |
| 16 | `enterpriseId` | 租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 17 | `taxRateId` | 税率ID | `archive.taxArchives.TaxRateArchive` | Service |  |
| 18 | `reqOrgId` | 需求公司id | `org.func.BaseOrg` | Service |  |
| 19 | `AuctionSectionMaterialDefineCharacter` | 标段物料自定义项 | `saleauction.project.AuctionSectionMaterialDefineCharacter` | None |  |
| 20 | `bidSectionId` | 招标方案标段包ID | `saleauction.project.AuctionSection` | None | true |
| 21 | `mainUnitId` | 主单位主键 | `pc.unit.Unit` | Service |  |
