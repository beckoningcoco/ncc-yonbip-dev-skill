---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.wholereport.MRWholeReportOrder"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 齐套分析订单行 (`mr.wholereport.MRWholeReportOrder`)

> MR | 物理表：`po_whole_order`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 齐套分析订单行 |
| 物理表 | `po_whole_order` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:17:22.2380` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（77个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `actionDate` | 行动日期 | `action_date` | DateTime |
| 2 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 3 | `adviceReportQuantity` | 建议分析数量 | `advice_report_quantity` | Decimal |
| 4 | `analysePushRule` | 分析规则 | `analyse_push_rule` | String |
| 5 | `arriveQuantity` | 累计到货数量 | `arrive_quantity` | Decimal |
| 6 | `assistChangeRate` | 建议计划量换算率 | `assist_change_rate` | Decimal |
| 7 | `assistChangeRateDen` | 建议计划量换算率分母 | `assist_change_rateden` | Decimal |
| 8 | `assistChangeRateNum` | 建议计划量换算率分子 | `assist_change_ratenum` | Decimal |
| 9 | `assistUnit` | 建议计划量单位 | `assist_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 10 | `assistUnitCount` | 建议计划量 | `assist_unit_count` | Decimal |
| 11 | `auxiliaryQuantity` | 生产件数 | `auxiliary_quantity` | Decimal |
| 12 | `batchNo` | 批次号 | `batch_no` | String |
| 13 | `billSource` | 生单来源 | `bill_source` | Integer |
| 14 | `bomId` | 物料清单 | `bom_id` | f494c08f-f466-474b-937a-4773d56696ed |
| 15 | `bomSensitiveUID` | BOM敏感域唯一性ID | `bom_sensitive_uid` | String |
| 16 | `changeRate` | 换算率 | `change_rate` | Decimal |
| 17 | `changeRateDen` | 换算率分母 | `change_rateden` | Decimal |
| 18 | `changeRateNum` | 换算率分子 | `change_ratenum` | Decimal |
| 19 | `dailyPlanId` | 订单日计划id | `daily_plan_id` | d421b3fa-9bcd-4db2-b43b-fbc55db29ae7 |
| 20 | `demandOrgId` | 需求组织 | `demand_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 21 | `departmentId` | 部门 | `department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 22 | `finishDate` | 完工日期 | `finish_date` | DateTime |
| 23 | `firstupcode` | 源头单据号 | `first_upcode` | String |
| 24 | `free1` | 规格1 | `free1` | String |
| 25 | `free10` | 规格10 | `free10` | String |
| 26 | `free2` | 规格2 | `free2` | String |
| 27 | `free3` | 规格3 | `free3` | String |
| 28 | `free4` | 规格4 | `free4` | String |
| 29 | `free5` | 规格5 | `free5` | String |
| 30 | `free6` | 规格6 | `free6` | String |
| 31 | `free7` | 规格7 | `free7` | String |
| 32 | `free8` | 规格8 | `free8` | String |
| 33 | `free9` | 规格9 | `free9` | String |
| 34 | `freeCharacteristics` | 自由项特征组 | `free_characteristics` | 44f40a73-daff-46bb-b8eb-ad19e958f3fe |
| 35 | `id` | ID | `id` | Long |
| 36 | `incomingQuantity` | 累计入库数量 | `incoming_quantity` | Decimal |
| 37 | `incomingQuantityNoArrive` | 累计入库数量(无到货环节) | `incoming_quantity_no_arrive` | Decimal |
| 38 | `inputQuantity` | 投入计划量 | `input_quantity` | Decimal |
| 39 | `issuedQuantity` | 已下达数量 | `issued_quantity` | Decimal |
| 40 | `lineNo` | 产品行号 | `line_no` | Decimal |
| 41 | `materialId` | 制造物料 | `material_id` | Long |
| 42 | `materialPushRule` | 发料规则 | `material_push_rule` | MaterialPushRuleEnum |
| 43 | `orderCode` | 订单编号 | `order_code` | String |
| 44 | `orderDailyPlanCode` | 订单日计划编号 | `order_daily_plan_code` | String |
| 45 | `orderId` | 生产订单ID | `order_id` | d421b3fa-9bcd-4db2-b43b-fbc55db29ae7 |
| 46 | `orderProductId` | 产品行id | `order_product_id` | d421b3fa-9bcd-4db2-b43b-fbc55db29ae7 |
| 47 | `orgId` | 计划组织 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 48 | `planProperty` | 计划属性 | `plan_property` | Integer |
| 49 | `planStatus` | 计划订单状态 | `plan_status` | PlanStatusEnum |
| 50 | `priorityNo` | 优先级 | `priority_no` | Decimal |
| 51 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 52 | `productDefineCharacter` | 自定义项特征属性组 | `product_define_ct` | 58a00b60-5001-4da5-aa32-c570b1d9f973 |
| 53 | `productId` | 物料Id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 54 | `productionUnitId` | 生产单位 | `production_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 55 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 56 | `pubts` | 时间戳 | `pubts` | DateTime |
| 57 | `quantity` | 生产数量 | `quantity` | Decimal |
| 58 | `remark` | 备注 | `remark` | String |
| 59 | `replenishQuantity` | 拒收需补货数量 | `replenish_quantity` | Decimal |
| 60 | `reportAuxQuantity` | 分析件数 | `report_aux_quantity` | Decimal |
| 61 | `reportQuantity` | 分析数量 | `report_quantity` | Decimal |
| 62 | `reserveid` | 跟踪线索id | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 63 | `returnQuantityMU` | 已退货数量(主单位) | `return_quantity_mu` | Decimal |
| 64 | `skuId` | skuId | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 65 | `sourceType` | 来源单据类型 | `source_type` | String |
| 66 | `startDate` | 开工日期 | `start_date` | DateTime |
| 67 | `subcontractVendorId` | 委外供应商 | `subcontract_vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 68 | `suggestPlanQuantity` | 主建议计划量 | `suggest_plan_quantity` | Decimal |
| 69 | `supplyOrgId` | 供应组织 | `supply_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 70 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 71 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 72 | `wholeAuxQuantity` | 齐套件数 | `whole_aux_quantity` | Decimal |
| 73 | `wholeConfirmQuantity` | 齐套确认数量 | `whole_confirm_quantity` | Decimal |
| 74 | `wholeId` | 齐套分析id | `whole_id` | ca91ad55-28a3-4b23-9e41-a324e9808702 |
| 75 | `wholeQuantity` | 齐套数量 | `whole_quantity` | Decimal |
| 76 | `wholeStatus` | 齐套状态 | `whole_status` | String |
| 77 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（23个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `assistUnit` | 建议计划量单位 | `pc.unit.Unit` | Service |  |
| 2 | `bomId` | 物料清单 | `ed.bom.Bom` | Service |  |
| 3 | `productId` | 物料Id | `pc.product.Product` | Service |  |
| 4 | `reserveid` | 跟踪线索id | `st.reservation.Reservation` | Service |  |
| 5 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 6 | `orderId` | 生产订单ID | `base.entity.BizObject` | None |  |
| 7 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 8 | `departmentId` | 部门 | `aa.baseorg.DeptMV` | Service |  |
| 9 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 10 | `productDefineCharacter` | 自定义项特征属性组 | `po.wholereport.ProductDefineCharacter` | None |  |
| 11 | `orderProductId` | 产品行id | `base.entity.BizObject` | None |  |
| 12 | `productionUnitId` | 生产单位 | `pc.unit.Unit` | Service |  |
| 13 | `orgId` | 计划组织 | `aa.baseorg.OrgMV` | Service |  |
| 14 | `subcontractVendorId` | 委外供应商 | `aa.vendor.Vendor` | Service |  |
| 15 | `demandOrgId` | 需求组织 | `aa.baseorg.OrgMV` | Service |  |
| 16 | `dailyPlanId` | 订单日计划id | `base.entity.BizObject` | None |  |
| 17 | `freeCharacteristics` | 自由项特征组 | `po.wholereport.ProductFreeCharacteristics` | None |  |
| 18 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 19 | `supplyOrgId` | 供应组织 | `aa.baseorg.OrgMV` | Service |  |
| 20 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
| 21 | `wholeId` | 齐套分析id | `mr.wholereport.MRWholeReport` | None | true |
| 22 | `skuId` | skuId | `pc.product.ProductSKU` | Service |  |
| 23 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
