---
tags: ["BIP", "元数据", "数据字典", "PO", "po.wholereport.WholeReportOrder"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 齐套分析订单行 (`po.wholereport.WholeReportOrder`)

> PO | 物理表：`po_whole_order`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 齐套分析订单行 |
| 物理表 | `po_whole_order` |
| domain/服务域 | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:34:19.6290` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（79个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `analysePushRule` | 分析规则 | `analyse_push_rule` | String |
| 2 | `materialPushRule` | 发料规则 | `material_push_rule` | MaterialPushRuleEnum |
| 3 | `reserveid` | 跟踪线索Id | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 4 | `subcontractVendorId` | 委外供应商 | `subcontract_vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 5 | `reportQuantity` | 分析数量 | `report_quantity` | Decimal |
| 6 | `wholeStatus` | 分析结果 | `whole_status` | String |
| 7 | `adviceReportQuantity` | 建议分析数量 | `advice_report_quantity` | Decimal |
| 8 | `departmentId` | 部门 | `department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 9 | `inputQuantity` | 投入计划量 | `input_quantity` | Decimal |
| 10 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 11 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 12 | `dailyPlanId` | 订单日计划id | `daily_plan_id` | d421b3fa-9bcd-4db2-b43b-fbc55db29ae7 |
| 13 | `orderDailyPlanCode` | 订单日计划编号 | `order_daily_plan_code` | String |
| 14 | `planStatus` | 状态 | `plan_status` | PlanStatusEnum |
| 15 | `replenishQuantity` | 调整补货数量 | `replenish_quantity` | Decimal |
| 16 | `arriveQuantity` | 到货数量 | `arrive_quantity` | Decimal |
| 17 | `incomingQuantityNoArrive` | 入库未到货数量 | `incoming_quantity_no_arrive` | Decimal |
| 18 | `returnQuantityMU` | 已退货数量 | `return_quantity_mu` | Decimal |
| 19 | `incomingQuantity` | 累计入库数量 | `incoming_quantity` | Decimal |
| 20 | `free1` | 产品行规格1 | `free1` | String |
| 21 | `free2` | 产品行规格2 | `free2` | String |
| 22 | `free3` | 产品行规格3 | `free3` | String |
| 23 | `free4` | 产品行规格4 | `free4` | String |
| 24 | `free5` | 产品行规格5 | `free5` | String |
| 25 | `free6` | 产品行规格6 | `free6` | String |
| 26 | `free7` | 产品行规格7 | `free7` | String |
| 27 | `free8` | 产品行规格8 | `free8` | String |
| 28 | `free9` | 产品行规格9 | `free9` | String |
| 29 | `free10` | 产品行规格10 | `free10` | String |
| 30 | `actionDate` | 行动日期 | `action_date` | DateTime |
| 31 | `assistChangeRate` | 建议计划量换算率 | `assist_change_rate` | Decimal |
| 32 | `assistUnit` | 建议计划量单位 | `assist_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 33 | `assistUnitCount` | 建议计划量 | `assist_unit_count` | Decimal |
| 34 | `billSource` | 生单来源 | `bill_source` | Integer |
| 35 | `demandOrgId` | 需求组织 | `demand_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 36 | `issuedQuantity` | 已下达数量 | `issued_quantity` | Decimal |
| 37 | `orderCode` | 订单编号 | `order_code` | String |
| 38 | `orgId` | 计划组织 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 39 | `planProperty` | 计划属性 | `plan_property` | Integer |
| 40 | `suggestPlanQuantity` | 主建议计划量 | `suggest_plan_quantity` | Decimal |
| 41 | `supplyOrgId` | 供应组织 | `supply_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 42 | `bomSensitiveUID` | BOM敏感域唯一性ID | `bom_sensitive_uid` | String |
| 43 | `freeCharacteristics` | 自由项特征组 | `free_characteristics` | 44f40a73-daff-46bb-b8eb-ad19e958f3fe |
| 44 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 45 | `productDefineCharacter` | 自定义项特征属性组 | `product_define_ct` | 58a00b60-5001-4da5-aa32-c570b1d9f973 |
| 46 | `pubts` | 时间戳 | `pubts` | DateTime |
| 47 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 48 | `wholeId` | 齐套分析id | `whole_id` | a8af8064-3e34-4ffe-9eb9-8f289b1aabcc |
| 49 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 50 | `id` | ID | `id` | Long |
| 51 | `priorityNo` | 优先级 | `priority_no` | Decimal |
| 52 | `orderProductId` | 产品行id | `order_product_id` | d421b3fa-9bcd-4db2-b43b-fbc55db29ae7 |
| 53 | `orderId` | 生产订单ID | `order_id` | d421b3fa-9bcd-4db2-b43b-fbc55db29ae7 |
| 54 | `lineNo` | 产品行号 | `line_no` | Decimal |
| 55 | `materialId` | 制造物料 | `material_id` | Long |
| 56 | `productId` | 物料Id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 57 | `bomId` | 物料清单 | `bom_id` | f494c08f-f466-474b-937a-4773d56696ed |
| 58 | `skuId` | skuId | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 59 | `quantity` | 生产数量 | `quantity` | Decimal |
| 60 | `changeRate` | 换算率 | `change_rate` | Decimal |
| 61 | `productionUnitId` | 生产单位 | `production_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 62 | `auxiliaryQuantity` | 生产件数 | `auxiliary_quantity` | Decimal |
| 63 | `startDate` | 开工日期 | `start_date` | DateTime |
| 64 | `finishDate` | 完工日期 | `finish_date` | DateTime |
| 65 | `wholeQuantity` | 齐套数量 | `whole_quantity` | Decimal |
| 66 | `wholeConfirmQuantity` | 齐套确认数量 | `whole_confirm_quantity` | Decimal |
| 67 | `reportAuxQuantity` | 分析件数 | `report_aux_quantity` | Decimal |
| 68 | `wholeAuxQuantity` | 齐套件数 | `whole_aux_quantity` | Decimal |
| 69 | `batchNo` | 批次号 | `batch_no` | String |
| 70 | `sourceType` | 来源单据类型 | `source_type` | String |
| 71 | `firstupcode` | 源头单据号 | `first_upcode` | String |
| 72 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 73 | `remark` | 备注 | `remark` | String |
| 74 | `assistChangeRateDen` | 建议计划量换算率分母 | `assist_change_rateden` | Decimal |
| 75 | `assistChangeRateNum` | 建议计划量换算率分子 | `assist_change_ratenum` | Decimal |
| 76 | `changeRateDen` | 换算率分母 | `change_rateden` | Decimal |
| 77 | `changeRateNum` | 换算率分子 | `change_ratenum` | Decimal |
| 78 | `wholeReportOrderAttrextItem` | 订单自由自定义项 | `` | b04e0650-5708-4cdd-b991-9bb8d6dc4587 |
| 79 | `wholeReportOrderUserdefItem` | 订单固定自定义项 | `` | 26467c99-0141-4e84-b64f-99804a0b7b60 |

---

## 关联属性（25个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `reserveid` | 跟踪线索Id | `st.reservation.Reservation` | Service |  |
| 2 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 3 | `orderId` | 生产订单ID | `base.entity.BizObject` | None |  |
| 4 | `departmentId` | 部门 | `aa.baseorg.DeptMV` | Service |  |
| 5 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 6 | `orgId` | 计划组织 | `aa.baseorg.OrgMV` | Service |  |
| 7 | `wholeReportOrderAttrextItem` | 订单自由自定义项 | `po.wholereport.WholeReportOrderAttrextItem` | None | true |
| 8 | `supplyOrgId` | 供应组织 | `aa.baseorg.OrgMV` | Service |  |
| 9 | `skuId` | skuId | `pc.product.ProductSKU` | Service |  |
| 10 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 11 | `wholeReportOrderUserdefItem` | 订单固定自定义项 | `po.wholereport.WholeReportOrderUserdefItem` | None | true |
| 12 | `assistUnit` | 建议计划量单位 | `pc.unit.Unit` | Service |  |
| 13 | `bomId` | 物料清单 | `ed.bom.Bom` | Service |  |
| 14 | `productId` | 物料Id | `pc.product.Product` | Service |  |
| 15 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 16 | `productDefineCharacter` | 自定义项特征属性组 | `po.wholereport.ProductDefineCharacter` | None |  |
| 17 | `orderProductId` | 产品行id | `base.entity.BizObject` | None |  |
| 18 | `productionUnitId` | 生产单位 | `pc.unit.Unit` | Service |  |
| 19 | `subcontractVendorId` | 委外供应商 | `aa.vendor.Vendor` | Service |  |
| 20 | `demandOrgId` | 需求组织 | `aa.baseorg.OrgMV` | Service |  |
| 21 | `dailyPlanId` | 订单日计划id | `base.entity.BizObject` | None |  |
| 22 | `freeCharacteristics` | 自由项特征组 | `po.wholereport.ProductFreeCharacteristics` | None |  |
| 23 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 24 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
| 25 | `wholeId` | 齐套分析id | `po.wholereport.WholeReport` | None | true |
