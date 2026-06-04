---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.section.LawbidSectionMaterial"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 标段物料 (`lawbid.section.LawbidSectionMaterial`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_project_section_material`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 标段物料 |
| 物理表 | `cpu_project_section_material` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:16:51.3030` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2026-05-22 23:55:05:000

## 依赖接口（7个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 2 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 3 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 4 | 标段物料接口 | `section.itf.ISectionMaterial` | 380 |
| 5 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 6 | lawbidTenant租户相关 | `lawbid.itf.ITenant` | 2 |
| 7 | 项目结构属性 | `BGDM.wbs.projectStructureProperties` | 49 |

---

## 直接属性（90个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `lawbidSectionMaterialDefineCharacter` | 标段物料自定义项 | `define_character_id` | 006d9015-a43f-4bb5-bbee-bcde69079393 |
| 2 | `lawbidSectionMaterialFreeCharacters` | 标段物料自由项 | `free_characters_id` | 0852b548-3920-4341-94ea-54dec830f546 |
| 3 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 4 | `dr` | 逻辑删除标记 | `dr` | Short |
| 5 | `costQuoteGroupId` | 成本项报价组id | `cost_quote_group_id` | 89305c8c-fd63-410b-a9d4-4a1dde15ef7a |
| 6 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 7 | `dimensionPricingId` | 报价ID | `dimension_pricing_id` | efd1e4c5-9da5-490b-acfc-9b097f70f890 |
| 8 | `erpApplyorderType` | erp请购单类型 | `erp_applyorder_type` | Integer |
| 9 | `businessType` | 业务类型 | `business_type` | String |
| 10 | `sourceLineNo` | 来源单据行号 | `source_line_no` | Integer |
| 11 | `invPriceExchRateDen` | 计价换算率分母 | `inv_price_exch_rate_den` | Decimal |
| 12 | `invPriceExchRateNum` | 计价换算率分子 | `inv_price_exch_rate_num` | Decimal |
| 13 | `invPurExchRateDen` | 采购换算率分母 | `inv_pur_exch_rate_den` | Decimal |
| 14 | `invPurExchRateNum` | 采购换算率分子 | `inv_pur_exch_rate_num` | Decimal |
| 15 | `purOrgId` | 采购组织 | `pur_org_id` | a4916c85-f087-4e87-a178-0ad37aff7cd0 |
| 16 | `materialFile` | 附件 | `material_file` | String |
| 17 | `processesId` | 工序id | `processes_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 18 | `receiveOrgId` | 收货组织id | `receive_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 19 | `receivePersonId` | 收货人id | `receive_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 20 | `receivePersonTel` | 收货人联系方式 | `receive_person_tel` | String |
| 21 | `reqDeptId` | 需求部门id | `reqdept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 |
| 22 | `expenseItemId` | 费用项目id | `expense_item_id` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 |
| 23 | `materialClassName` | 物料分类名称 | `material_class_name` | String |
| 24 | `invPriceExchRateType` | 采购计价换算率类型 | `inv_price_exch_rate_type` | Short |
| 25 | `purUnitName` | 采购单位 | `pur_unit_name` | String |
| 26 | `projectCloudId` | 项目id | `project_cloud_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 27 | `materialName` | 物料名称 | `material_name` | String |
| 28 | `unit` | 单位 | `unit` | String |
| 29 | `discountTaxType` | 扣税类别 | `discount_tax_type` | String |
| 30 | `materialModel` | 物料型号 | `material_model` | String |
| 31 | `materialNo` | 物料编码 | `material_no` | String |
| 32 | `costCenterId` | 成本中心id | `cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 33 | `materialClassId` | 物料分类ID | `material_class_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 34 | `materialSpec` | 物料规格 | `material_spec` | String |
| 35 | `reqOrgName` | 需求组织 | `req_org_name` | String |
| 36 | `guidingTaxRate` | 指导税率 | `guiding_tax_rate` | Decimal |
| 37 | `tenantId` | tenant租户 | `tenant_id` | String |
| 38 | `unitid` | 单位id | `unitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 39 | `priceMark` | 价格标识 | `price_mark` | Short |
| 40 | `priceStrategy` | 取价策略id | `price_strategy` | 3dab7aea-9e18-4a82-8712-f029fd1ec393 |
| 41 | `id` | id | `id` | Long |
| 42 | `pubts` | 最后修改时间 | `pubts` | DateTime |
| 43 | `bidProjectId` | 招标方案主表ID | `bid_project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 44 | `bidSectionId` | 招标方案标段包ID | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 45 | `rowNo` | 行号 | `row_no` | Decimal |
| 46 | `materialId` | 物料id | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 47 | `reqDesc` | 需求描述 | `req_desc` | String |
| 48 | `num` | 需求数量 | `num` | Decimal |
| 49 | `guaranteedSupply` | 保供量 | `guaranteed_supply` | String |
| 50 | `guaranteed_supply_limit` | 保供量下限 | `guaranteed_supply_limit` | Decimal |
| 51 | `highestPrice` | 最高限价 | `highest_price` | Decimal |
| 52 | `reqOrgId` | 需求组织id | `req_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 53 | `materialBrand` | 物料品牌 | `material_brand` | String |
| 54 | `materialQualifyStandard` | 质量要求 | `material_qualify_standard` | String |
| 55 | `reqTime` | 需求日期 | `req_time` | Date |
| 56 | `receiveAddress` | 收货地址 | `receive_address` | String |
| 57 | `purchaseType` | 采购类型 | `purchase_type` | String |
| 58 | `reqId` | 采购需求主表ID | `req_id` | bac52eb7-97d5-4c52-8a52-cc1d9bf96c66 |
| 59 | `reqDetailId` | 采购需求子表ID | `req_detail_id` | Long |
| 60 | `reqEndTime` | 需求结束日期 | `req_end_time` | Date |
| 61 | `startAddress` | 物流起运地 | `start_address` | String |
| 62 | `destinationAddress` | 物流终点 | `destination_address` | String |
| 63 | `mileage` | 物流里程 | `mileage` | Decimal |
| 64 | `transmaterial` | 物流运输物资 | `transmaterial` | String |
| 65 | `entryTime` | 项目进场时间 | `entry_time` | DateTime |
| 66 | `purCategory` | 采购类别 | `pur_category` | String |
| 67 | `exceptionFormId` | 异常申请单ID | `exception_form_id` | Long |
| 68 | `billStates` | 状态 | `bill_states` | String |
| 69 | `ytenant` | 新租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 70 | `demandNum` | 需求数量 | `demand_num` | Decimal |
| 71 | `orderSplit` | 分单标识 | `order_split` | String |
| 72 | `mainCount` | 主数量 | `main_count` | Decimal |
| 73 | `purCount` | 采购数量 | `pur_count` | Decimal |
| 74 | `invPurExchRate` | 采购换算率 | `inv_pur_exch_rate` | Decimal |
| 75 | `invPriceExchRate` | 计价换算率 | `inv_price_exch_rate` | Decimal |
| 76 | `invPurExchRateType` | 采购换算率类型 | `inv_pur_exch_rate_type` | Short |
| 77 | `purUnitId` | 采购单位主键 | `pur_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 78 | `wbs` | WBS_ID | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 79 | `mainUnitId` | 主单位主键 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 80 | `activity` | 活动ID | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 81 | `firstUpCode` | 源头单据号 | `first_up_code` | String |
| 82 | `firstSourceId` | 源头单据主表id | `first_source_id` | Long |
| 83 | `firstUpLineNo` | 源头单据行号 | `first_up_line_no` | Integer |
| 84 | `entrustId` | 委托单id | `entrust_id` | 0dbcfc08-59dc-4d8e-8ad5-08af5e2055bf |
| 85 | `sourceType` | 单据类型 | `source_type` | String |
| 86 | `entrustDetailId` | 委托需求id | `entrust_detail_id` | 3ac9468c-0314-4863-bda0-e265e060bf15 |
| 87 | `firstSourceAutoId` | 源头单据子表id | `first_source_auto_id` | Long |
| 88 | `firstSource` | 源头单据类型 | `first_source` | String |
| 89 | `define` | 标段物料自由自定义项 | `` | 218bf7bc-08b2-45b1-9787-e95ab5c2da5a |
| 90 | `steps` | 标段物料价格梯度明细 | `` | b89907af-0db0-493f-a770-92ce097b7913 |

---

## 关联属性（30个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `purOrgId` | 采购组织 | `org.func.PurchaseOrg` | Service |  |
| 2 | `expenseItemId` | 费用项目id | `bd.expenseitem.ExpenseItem` | Service |  |
| 3 | `processesId` | 工序id | `ed.operation.Operation` | Service |  |
| 4 | `reqDeptId` | 需求部门id | `bd.adminOrg.AdminOrgVO` | Service |  |
| 5 | `activity` | 活动ID | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 6 | `entrustDetailId` | 委托需求id | `sourcing.entrust.CpuReqEntrustDetail` | Service |  |
| 7 | `purUnitId` | 采购单位主键 | `pc.unit.Unit` | Service |  |
| 8 | `entrustId` | 委托单id | `sourcing.entrust.CpuReqEntrust` | Service |  |
| 9 | `wbs` | WBS_ID | `BGDM.wbs.wbs_doc` | Service |  |
| 10 | `bidProjectId` | 招标方案主表ID | `lawbid.project.LawbidProject` | None |  |
| 11 | `lawbidSectionMaterialDefineCharacter` | 标段物料自定义项 | `lawbid.section.LawbidSectionMaterialDefineCharacter` | None |  |
| 12 | `lawbidSectionMaterialFreeCharacters` | 标段物料自由项 | `lawbid.section.LawbidSectionMaterialFreeCharacters` | None |  |
| 13 | `priceStrategy` | 取价策略id | `aa.pricestrategy.PriceStrategy` | Service |  |
| 14 | `costCenterId` | 成本中心id | `bd.costcenter.CostCenter` | Service |  |
| 15 | `define` | 标段物料自由自定义项 | `lawbid.section.LawbidSectionMaterialFreedefine` | None | true |
| 16 | `reqOrgId` | 需求组织id | `org.func.BaseOrg` | Service |  |
| 17 | `bidSectionId` | 招标方案标段包ID | `lawbid.section.LawbidSection` | None | true |
| 18 | `mainUnitId` | 主单位主键 | `pc.unit.Unit` | Service |  |
| 19 | `receiveOrgId` | 收货组织id | `org.func.BaseOrg` | Service |  |
| 20 | `materialClassId` | 物料分类ID | `pc.cls.ManagementClass` | Service |  |
| 21 | `costQuoteGroupId` | 成本项报价组id | `aa.costitem.CostItemTemplate` | Service |  |
| 22 | `projectCloudId` | 项目id | `bd.project.ProjectVO` | Service |  |
| 23 | `ytenant` | 新租户id | `yht.tenant.YhtTenant` | Service |  |
| 24 | `materialId` | 物料id | `pc.product.Product` | Service |  |
| 25 | `steps` | 标段物料价格梯度明细 | `lawbid.section.SectionMaterialStep` | None | true |
| 26 | `dimensionPricingId` | 报价ID | `aa.quotation.BiQuotationHead` | Service |  |
| 27 | `reqId` | 采购需求主表ID | `sourcing.pureq.IpuPuReq` | Service |  |
| 28 | `receivePersonId` | 收货人id | `bd.staff.Staff` | Service |  |
| 29 | `unitid` | 单位id | `pc.unit.Unit` | Service |  |
| 30 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
