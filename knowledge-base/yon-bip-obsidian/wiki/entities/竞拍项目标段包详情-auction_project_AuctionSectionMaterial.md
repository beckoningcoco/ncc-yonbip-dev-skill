---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.project.AuctionSectionMaterial"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 竞拍项目标段包详情 (`auction.project.AuctionSectionMaterial`)

> ycSouringAuction | 物理表：`cpu_project_section_material`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 竞拍项目标段包详情 |
| 物理表 | `cpu_project_section_material` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:26:01.9610` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（81个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `AuctionSectionMaterialDefineCharacter` | 标段物料表自定义项特征 | `define_character_id` | 6fed5554-82cb-4b46-b604-216bf938347f |
| 2 | `AuctionSectionMaterialFreeCharacter` | 标段物料表自由项特征组 | `free_characters_id` | cd035cd1-7ad6-454b-a5e8-e357751471d7 |
| 3 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 4 | `dr` | 逻辑删除标记 | `dr` | Short |
| 5 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 6 | `materialName` | 物料名称 | `material_name` | String |
| 7 | `materialSpec` | 物料规格 | `material_spec` | String |
| 8 | `materialModel` | 物料型号 | `material_model` | String |
| 9 | `materialClassId` | 物料分类ID | `material_class_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 10 | `materialClassName` | 物料分类名称 | `material_class_name` | String |
| 11 | `reqOrgName` | 需求公司名称 | `req_org_name` | String |
| 12 | `unit` | 单位 | `unit` | String |
| 13 | `unitid` | 单位id | `unitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 14 | `purUnitName` | 采购单位 | `pur_unit_name` | String |
| 15 | `guidingTaxRate` | 指导税率 | `guiding_tax_rate` | Decimal |
| 16 | `costCenterId` | 成本中心id | `cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 17 | `expenseItemId` | 费用项目id | `expense_item_id` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 |
| 18 | `projectCloudId` | 项目id | `project_cloud_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 19 | `sourceType` | 单据类型 | `source_type` | String |
| 20 | `materialNo` | 物料编码 | `material_no` | String |
| 21 | `discountTaxType` | 扣税类别 | `discount_tax_type` | String |
| 22 | `priceMark` | 价格标识 | `price_mark` | Short |
| 23 | `invPriceExchRateType` | 采购计价换算率类型 | `inv_price_exch_rate_type` | Short |
| 24 | `erpApplyorderType` | erp请购单类型 | `erp_applyorder_type` | Integer |
| 25 | `processesId` | 工序id | `processes_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 26 | `receiveOrgId` | 收货组织id | `receive_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 27 | `receivePersonId` | 收货人id | `receive_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 28 | `receivePersonTel` | 收货人联系方式 | `receive_person_tel` | String |
| 29 | `reqDeptId` | 需求部门id | `reqdept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 |
| 30 | `tenantId` | tenant租户 | `tenant_id` | String |
| 31 | `id` | id | `id` | Long |
| 32 | `pubts` | 最后修改时间 | `pubts` | DateTime |
| 33 | `bidProjectId` | 招标方案主表ID | `bid_project_id` | 94b777ba-4855-4d81-a975-f6ab6b09f9a8 |
| 34 | `bidSectionId` | 招标方案标段包ID | `bid_section_id` | be269c23-7eb6-4029-ac01-781f16c75ec4 |
| 35 | `rowNo` | 行号 | `row_no` | Decimal |
| 36 | `materialId` | 物料id | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 37 | `reqDesc` | 标的物描述 | `req_desc` | String |
| 38 | `num` | 数量 | `num` | Decimal |
| 39 | `guaranteedSupply` | 保供量 | `guaranteed_supply` | String |
| 40 | `guaranteed_supply_limit` | 保供量下限 | `guaranteed_supply_limit` | Decimal |
| 41 | `reqOrgId` | 需求公司id | `req_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 42 | `highestPrice` | 最高限价 | `highest_price` | Decimal |
| 43 | `materialBrand` | 品牌 | `material_brand` | String |
| 44 | `materialQualifyStandard` | 质量要求 | `material_qualify_standard` | String |
| 45 | `reqTime` | 需求日期 | `req_time` | Date |
| 46 | `receiveAddress` | 收货地址 | `receive_address` | String |
| 47 | `purchaseType` | 采购类型 | `purchase_type` | String |
| 48 | `reqId` | 采购需求主表ID | `req_id` | bac52eb7-97d5-4c52-8a52-cc1d9bf96c66 |
| 49 | `reqDetailId` | 采购需求子表ID | `req_detail_id` | Long |
| 50 | `reqEndTime` | 需求结束日期 | `req_end_time` | Date |
| 51 | `startAddress` | 物流起运地 | `start_address` | String |
| 52 | `destinationAddress` | 物流终点 | `destination_address` | String |
| 53 | `mileage` | 物流里程 | `mileage` | Decimal |
| 54 | `transmaterial` | 物流运输物资 | `transmaterial` | String |
| 55 | `entryTime` | 项目进场时间 | `entry_time` | DateTime |
| 56 | `purCategory` | 采购类别 | `pur_category` | String |
| 57 | `exceptionFormId` | 异常申请单ID | `exception_form_id` | Long |
| 58 | `billStates` | 状态 | `bill_states` | String |
| 59 | `ytenant` | 新租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 60 | `demandNum` | 数量 | `demand_num` | Decimal |
| 61 | `orderSplit` | 分单标识 | `order_split` | String |
| 62 | `invPurExchRateType` | 采购换算率类型 | `inv_pur_exch_rate_type` | Short |
| 63 | `mainCount` | 主数量 | `main_count` | Decimal |
| 64 | `purCount` | 采购数量 | `pur_count` | Decimal |
| 65 | `invPurExchRate` | 采购换算率 | `inv_pur_exch_rate` | Decimal |
| 66 | `invPriceExchRate` | 计价换算率 | `inv_price_exch_rate` | Decimal |
| 67 | `purUnitId` | 采购单位主键 | `pur_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 68 | `mainUnitId` | 主单位主键 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 69 | `wbs` | WBS_ID | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 70 | `activity` | 活动ID | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 71 | `firstUpLineNo` | 源头单据行号 | `first_up_line_no` | Integer |
| 72 | `firstSourceAutoId` | 源头单据子表id | `first_source_auto_id` | Long |
| 73 | `firstSourceId` | 源头单据主表id | `first_source_id` | Long |
| 74 | `firstUpCode` | 源头单据号 | `first_up_code` | String |
| 75 | `firstSource` | 源头单据类型 | `first_source` | String |
| 76 | `businessType` | 业务类型 | `business_type` | String |
| 77 | `invPriceExchRateDen` | 计价换算率分母 | `inv_price_exch_rate_den` | Decimal |
| 78 | `invPriceExchRateNum` | 计价换算率分子 | `inv_price_exch_rate_num` | Decimal |
| 79 | `invPurExchRateDen` | 采购换算率分母 | `inv_pur_exch_rate_den` | Decimal |
| 80 | `invPurExchRateNum` | 采购换算率分子 | `inv_pur_exch_rate_num` | Decimal |
| 81 | `sourceLineNo` | 来源单据行号 | `source_line_no` | Integer |

---

## 关联属性（22个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `expenseItemId` | 费用项目id | `bd.expenseitem.ExpenseItem` | Service |  |
| 2 | `processesId` | 工序id | `ed.operation.Operation` | Service |  |
| 3 | `receiveOrgId` | 收货组织id | `org.func.BaseOrg` | Service |  |
| 4 | `reqDeptId` | 需求部门id | `bd.adminOrg.AdminOrgVO` | Service |  |
| 5 | `materialClassId` | 物料分类ID | `pc.cls.ManagementClass` | Service |  |
| 6 | `activity` | 活动ID | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 7 | `ytenant` | 新租户id | `yht.tenant.YhtTenant` | Service |  |
| 8 | `projectCloudId` | 项目id | `bd.project.ProjectVO` | Service |  |
| 9 | `purUnitId` | 采购单位主键 | `pc.unit.Unit` | Service |  |
| 10 | `wbs` | WBS_ID | `BGDM.wbs.wbs_doc` | Service |  |
| 11 | `materialId` | 物料id | `pc.product.Product` | Service |  |
| 12 | `bidProjectId` | 招标方案主表ID | `auction.project.AuctionProject` | None |  |
| 13 | `reqId` | 采购需求主表ID | `sourcing.pureq.IpuPuReq` | Service |  |
| 14 | `AuctionSectionMaterialFreeCharacter` | 标段物料表自由项特征组 | `auction.project.AuctionSectionMaterialFreeCharacter` | None |  |
| 15 | `receivePersonId` | 收货人id | `bd.staff.Staff` | Service |  |
| 16 | `costCenterId` | 成本中心id | `bd.costcenter.CostCenter` | Service |  |
| 17 | `unitid` | 单位id | `pc.unit.Unit` | Service |  |
| 18 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 19 | `reqOrgId` | 需求公司id | `org.func.BaseOrg` | Service |  |
| 20 | `AuctionSectionMaterialDefineCharacter` | 标段物料表自定义项特征 | `auction.project.AuctionSectionMaterialDefineCharacter` | None |  |
| 21 | `bidSectionId` | 招标方案标段包ID | `auction.project.AuctionSection` | None | true |
| 22 | `mainUnitId` | 主单位主键 | `pc.unit.Unit` | Service |  |
