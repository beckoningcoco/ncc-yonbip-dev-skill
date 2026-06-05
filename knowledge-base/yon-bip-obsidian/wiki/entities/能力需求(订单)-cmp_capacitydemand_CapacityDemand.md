---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.capacitydemand.CapacityDemand"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 能力需求(订单) (`cmp.capacitydemand.CapacityDemand`)

> DCRP | 物理表：`cmp_capacity_demand`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 能力需求(订单) |
| 物理表 | `cmp_capacity_demand` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:58:39.8350` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（123个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | id | `id` | Long |
| 3 | `planOrgId` | 计划组织 | `plan_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 4 | `calculateId` | 产能运算ID | `calculate_id` | 12a493ee-e7d1-4aac-b52d-8dd0dc02121b |
| 5 | `calculateMark` | 能力计算标识 | `calculate_mark` | Short |
| 6 | `createDate` | 创建日期 | `create_date` | Date |
| 7 | `createTime` | 创建时间 | `create_time` | DateTime |
| 8 | `creator` | 创建人名称 | `creator` | String |
| 9 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 10 | `defineCharacter` | 自定义项 | `define_character` | 0db9d836-07ca-4b03-85b5-bd18dff12faa |
| 11 | `orderType` | 订单类型 | `order_type` | String |
| 12 | `productId` | 物料ID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 13 | `bomReplaceMark` | BOM替代标识 | `bom_replace_mark` | String |
| 14 | `materialId` | 制造物料 | `material_id` | Long |
| 15 | `supplyOrgId` | 供应组织 | `supply_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 16 | `srcDocId` | 能力需求来源ID(订单ID) | `src_doc_id` | Long |
| 17 | `deliveryStatus` | 交期状态 | `delivery_status` | String |
| 18 | `scheduleStatus` | 排产状态 | `schedule_status` | String |
| 19 | `diffDayQty` | 差异天数(天) | `diff_day_qty` | Integer |
| 20 | `dataClassType` | 数据类类型 | `data_class_type` | String |
| 21 | `dataClassItem` | 数据类项 | `data_class_item` | String |
| 22 | `displayColor` | 显示颜色 | `display_color` | String |
| 23 | `bussinessKey` | 业务主键 | `bussiness_key` | String |
| 24 | `srcRouteId` | 工艺约束来源ID | `src_route_id` | Long |
| 25 | `srcRouteType` | 工艺约束来源类型 | `src_route_type` | String |
| 26 | `capacityObject` | 加工中心 | `capacity_object` | e3034100-f166-46e1-b750-d85fb84474b7 |
| 27 | `srcWCId` | 加工中心来源ID(工作中心/生产线) | `src_wc_id` | Long |
| 28 | `srcWCType` | 加工中心来源类型 | `src_wc_type` | String |
| 29 | `releaseStatus` | 发布状态 | `release_status` | String |
| 30 | `releasePeople` | 发布人id | `release_people` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 31 | `releasePeopleName` | 发布人 | `release_people_name` | String |
| 32 | `releaseTime` | 发布时间 | `release_time` | DateTime |
| 33 | `schedulingQuantity` | 排产数量 | `scheduling_quantity` | Decimal |
| 34 | `schedulingAuxQuantity` | 排产件数 | `scheduling_aux_quantity` | Decimal |
| 35 | `rcEvaluateStatus` | 交期评估状态 | `rc_evaluate_status` | Short |
| 36 | `rcPublishStatus` | 交期确认状态 | `rc_publish_status` | Short |
| 37 | `appScene` | 应用场景 | `app_scene` | String |
| 38 | `lvl` | 级别 | `lvl` | Short |
| 39 | `isEnd` | 是否末级 | `is_end` | Short |
| 40 | `parentId` | 父Id | `parent_id` | Long |
| 41 | `seq` | 顺序号 | `seq` | Integer |
| 42 | `outsourcingAuxQty` | 转委外件数 | `outsourcing_aux_qty` | Decimal |
| 43 | `purchasesAuxQty` | 转采购件数 | `purchases_aux_qty` | Decimal |
| 44 | `selfMadeQty` | 自制数 | `self_made_qty` | Decimal |
| 45 | `selfMadeAuxQty` | 自制件数 | `self_made_aux_qty` | Decimal |
| 46 | `routeLineId` | 工艺约束行 | `route_line_id` | bd70e207-3153-4d6f-8a3f-11dae94555da |
| 47 | `bomVersion` | BOM版本 | `bom_version` | f494c08f-f466-474b-937a-4773d56696ed |
| 48 | `originalOrderNo` | 原单单号 | `original_order_no` | String |
| 49 | `changeStatus` | 变更状态 | `change_status` | String |
| 50 | `syncStatus` | 同步状态 | `sync_status` | String |
| 51 | `isDelMark` | 删除标记 | `is_del_mark` | Short |
| 52 | `demandTraceClue` | 跟踪线索 | `demand_trace_clue` | String |
| 53 | `sourceDocNo` | 源头单据号 | `source_doc_no` | String |
| 54 | `outsourcingQty` | 转委外量 | `outsourcing_qty` | Decimal |
| 55 | `originalPubts` | 原单时间戳 | `original_pubts` | DateTime |
| 56 | `sourceDocType` | 源头单据类型 | `source_doc_type` | String |
| 57 | `purchasesQty` | 转采购量 | `purchases_qty` | Decimal |
| 58 | `isEditMark` | 可编辑标识 | `is_edit_mark` | Short |
| 59 | `sourceDocMaterial` | 源头单据物料 | `source_doc_material` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 60 | `demandTraceMethod` | 需求跟踪方式 | `demand_trace_method` | String |
| 61 | `sourceDocLineNo` | 源头单据行号 | `source_doc_line_no` | Decimal |
| 62 | `syncMessage` | 同步信息 | `sync_message` | String |
| 63 | `demandCapacityId` | 需求能力ID | `demand_capacity_id` | 1550bbc9-2eed-432c-84cd-6c36a16d9507 |
| 64 | `demandPlanNo` | 需求计划行号 | `demand_plan_no` | Decimal |
| 65 | `demandStatus` | 状态 | `demand_status` | String |
| 66 | `disablets` | 停用时间 | `disablets` | DateTime |
| 67 | `dr` | 逻辑删除标记 | `dr` | Short |
| 68 | `enable` | 启用 | `enable` | sys_intboolean |
| 69 | `enablets` | 启用时间 | `enablets` | DateTime |
| 70 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 71 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 72 | `modifier` | 修改人名称 | `modifier` | String |
| 73 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 74 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 75 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 76 | `priority` | 优先级 | `priority` | Short |
| 77 | `pubts` | 时间戳 | `pubts` | DateTime |
| 78 | `receiptQuantity` | 入库数量 | `receipt_quantity` | Decimal |
| 79 | `source` | 上游单据类型 | `source` | String |
| 80 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 81 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 82 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 83 | `suggestBeginDate` | 建议需求开始日期 | `suggest_begin_date` | DateTime |
| 84 | `suggestEndDate` | 建议需求结束日期 | `suggest_end_date` | DateTime |
| 85 | `upcode` | 上游单据号 | `upcode` | String |
| 86 | `demandType` | 需求类型 | `demand_type` | String |
| 87 | `transId` | 交易类型 | `trans_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 88 | `demandOrgId` | 需求组织 | `demand_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 89 | `demandCode` | 需求单号 | `demand_code` | String |
| 90 | `demandDeptId` | 需求部门 | `demand_dept_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 91 | `demandId` | 需求ID | `demand_id` | Long |
| 92 | `demandLineNo` | 需求行号 | `demand_line_no` | Decimal |
| 93 | `demandProjectId` | 需求项目 | `demand_project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 94 | `demandObjectId` | 需求对象ID | `demand_objectId` | Long |
| 95 | `demandObjectCode` | 需求对象编码 | `demand_object_code` | String |
| 96 | `demandObjectName` | 需求对象名称 | `demand_object_name` | String |
| 97 | `demandObjectModelDesc` | 需求对象规格 | `demand_object_model_desc` | String |
| 98 | `demandObjectType` | 需求对象类型 | `demand_object_type` | String |
| 99 | `freeCharacter` | 自由项特征 | `free_character` | 9ada1710-5e91-4809-8f42-ade1594d482e |
| 100 | `quantity` | 需求数量 | `quantity` | Decimal |
| 101 | `unit` | 单位 | `unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 102 | `mainQuantity` | 主数量 | `main_quantity` | Decimal |
| 103 | `mainUnit` | 主单位 | `main_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 104 | `conversionRate` | 换算率 | `conversion_rate` | Decimal |
| 105 | `demandBeginDate` | 需求开始日期 | `demand_begin_date` | DateTime |
| 106 | `demandEndDate` | 需求结束日期 | `demand_end_date` | DateTime |
| 107 | `startQty` | 开工数量 | `start_qty` | Decimal |
| 108 | `completeQuantity` | 完工数量 | `complete_quantity` | Decimal |
| 109 | `docTransferQty` | 入库数量 | `doc_transfer_qty` | Decimal |
| 110 | `memo` | 备注 | `memo` | String |
| 111 | `calculateStrategy` | 能力计算策略 | `calculate_strategy` | String |
| 112 | `capacityDemandList` | 能力需求清单(订单工序明) | `` | 0aa3f101-f572-447c-8998-b17f8a9f1c28 |
| 113 | `capacityDemandProduction` | 能力需求(订单)-生产执行接口表 | `` | 65d9fe27-d3ad-4b65-b8e2-1bf4f7150ec8 |
| 114 | `capacityDemandSchemaExt` | 能力需求排产方案表(订单平行表) | `` | 8a713848-4b96-42ec-89b8-c85eee0feed7 |
| 115 | `conversionRateDen` | 换算率分母 | `conversion_rateden` | Decimal |
| 116 | `conversionRateNum` | 换算率分子 | `conversion_ratenum` | Decimal |
| 117 | `lockDate` | 锁定日期 | `lock_Date` | Date |
| 118 | `lockStatus` | 锁定状态 | `lock_status` | String |
| 119 | `lockTime` | 锁定时间 | `lock_time` | DateTime |
| 120 | `locker` | 锁定人 | `locker` | String |
| 121 | `originalMainQty` | 原始主单位数量 | `original_main_qty` | Decimal |
| 122 | `originalQty` | 原始数量 | `original_qty` | Decimal |
| 123 | `status` | 状态 | `status` | String |

---

## 关联属性（24个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `mainUnit` | 主单位 | `pc.unit.Unit` | Service |  |
| 2 | `releasePeople` | 发布人id | `base.user.BipUser` | Service |  |
| 3 | `productId` | 物料ID | `pc.product.Product` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `transId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 6 | `routeLineId` | 工艺约束行 | `cmp.demandcapacity.DemandCapacityList` | None |  |
| 7 | `calculateId` | 产能运算ID | `cmp.capacitycalculate.CapacityCalculate` | None |  |
| 8 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 9 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 10 | `capacityDemandProduction` | 能力需求(订单)-生产执行接口表 | `cmp.capacitydemand.CapacityDemandProduction` | None | true |
| 11 | `demandProjectId` | 需求项目 | `bd.project.ProjectVO` | Service |  |
| 12 | `capacityDemandList` | 能力需求清单(订单工序明) | `cmp.capacitydemand.CapacityDemandList` | None | true |
| 13 | `bomVersion` | BOM版本 | `ed.bom.Bom` | Service |  |
| 14 | `freeCharacter` | 自由项特征 | `cmp.capacitydemand.CapacityDemandFreeCT` | None |  |
| 15 | `demandOrgId` | 需求组织 | `aa.baseorg.OrgMV` | Service |  |
| 16 | `unit` | 单位 | `pc.unit.Unit` | Service |  |
| 17 | `sourceDocMaterial` | 源头单据物料 | `pc.product.Product` | Service |  |
| 18 | `planOrgId` | 计划组织 | `org.func.BaseOrg` | Service |  |
| 19 | `capacityObject` | 加工中心 | `cmp.capacityobject.CapacityObject` | None |  |
| 20 | `demandDeptId` | 需求部门 | `aa.baseorg.DeptMV` | Service |  |
| 21 | `supplyOrgId` | 供应组织 | `org.func.BaseOrg` | Service |  |
| 22 | `defineCharacter` | 自定义项 | `cmp.capacitydemand.CapacityDemandDefineCT` | None |  |
| 23 | `capacityDemandSchemaExt` | 能力需求排产方案表(订单平行表) | `cmp.capacitydemand.CapacityDemandSchemaExt` | None | true |
| 24 | `demandCapacityId` | 需求能力ID | `cmp.demandcapacity.DemandCapacity` | None |  |
