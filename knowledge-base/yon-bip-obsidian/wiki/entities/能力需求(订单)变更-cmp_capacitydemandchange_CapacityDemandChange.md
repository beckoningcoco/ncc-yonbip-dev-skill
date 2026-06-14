---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.capacitydemandchange.CapacityDemandChange"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 能力需求(订单)变更 (`cmp.capacitydemandchange.CapacityDemandChange`)

> DCRP | 物理表：`cmp_capacity_demand_change`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 能力需求(订单)变更 |
| 物理表 | `cmp_capacity_demand_change` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:58:03.0580` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（124个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `parentId` | 父Id | `parent_id` | Long |
| 4 | `capacityDemandId` | 原能力需求(订单)id | `capacity_demand_id` | c09df742-e522-466c-a5ac-757f34e80092 |
| 5 | `capacityDemandPubts` | 原能力需求(订单)时间戳 | `capacity_demand_pubts` | DateTime |
| 6 | `isVersions` | 是否历史最新版本 | `is_versions` | Short |
| 7 | `reasonMemo` | 变更原因 | `reason_memo` | String |
| 8 | `demandType` | 需求类型 | `demand_type` | String |
| 9 | `demandId` | 需求ID | `demand_id` | Long |
| 10 | `transId` | 交易类型 | `trans_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 11 | `demandOrgId` | 需求组织 | `demand_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 12 | `supplyOrgId` | 供应组织 | `supply_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 13 | `planOrgId` | 计划组织 | `plan_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 14 | `demandCode` | 需求单号 | `demand_code` | String |
| 15 | `demandLineNo` | 需求行号 | `demand_line_no` | Decimal |
| 16 | `demandPlanNo` | 需求计划行号 | `demand_plan_no` | Decimal |
| 17 | `demandDeptId` | 需求部门 | `demand_dept_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 18 | `demandProjectId` | 需求项目 | `demand_project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 19 | `productId` | 物料ID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 20 | `materialId` | 制造物料 | `material_id` | Long |
| 21 | `demandObjectId` | 需求对象ID | `demand_objectId` | Long |
| 22 | `demandObjectCode` | 需求对象编码 | `demand_object_code` | String |
| 23 | `demandObjectName` | 需求对象名称 | `demand_object_name` | String |
| 24 | `demandObjectModelDesc` | 需求对象规格 | `demand_object_model_desc` | String |
| 25 | `demandObjectType` | 需求对象类型 | `demand_object_type` | String |
| 26 | `freeCharacter` | 自由项特征 | `free_character` | 9ada1710-5e91-4809-8f42-ade1594d482e |
| 27 | `quantity` | 数量 | `quantity` | Decimal |
| 28 | `unit` | 单位 | `unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 29 | `mainQuantity` | 主单位数量 | `main_quantity` | Decimal |
| 30 | `mainUnit` | 主单位 | `main_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 31 | `conversionRate` | 换算率 | `conversion_rate` | Decimal |
| 32 | `demandBeginDate` | 需求开始日期 | `demand_begin_date` | DateTime |
| 33 | `demandEndDate` | 需求结束日期 | `demand_end_date` | DateTime |
| 34 | `suggestBeginDate` | 建议需求开始日期 | `suggest_begin_date` | DateTime |
| 35 | `suggestEndDate` | 建议需求结束日期 | `suggest_end_date` | DateTime |
| 36 | `docTransferQty` | 转单数量 | `doc_transfer_qty` | Decimal |
| 37 | `startQty` | 开工数量 | `start_qty` | Decimal |
| 38 | `completeQuantity` | 完工数量 | `complete_quantity` | Decimal |
| 39 | `receiptQuantity` | 入库数量 | `receipt_quantity` | Decimal |
| 40 | `defineCharacter` | 自定义项 | `define_character` | 0db9d836-07ca-4b03-85b5-bd18dff12faa |
| 41 | `memo` | 备注 | `memo` | String |
| 42 | `calculateMark` | 能力计算标识 | `calculate_mark` | Short |
| 43 | `calculateStrategy` | 能力计算策略 | `calculate_strategy` | String |
| 44 | `priority` | 优先级 | `priority` | Short |
| 45 | `calculateId` | 产能运算ID | `calculate_id` | 12a493ee-e7d1-4aac-b52d-8dd0dc02121b |
| 46 | `demandCapacityId` | 工艺约束ID | `demand_capacity_id` | 1550bbc9-2eed-432c-84cd-6c36a16d9507 |
| 47 | `demandStatus` | 状态 | `demand_status` | String |
| 48 | `sourceDocType` | 源头单据类型 | `source_doc_type` | String |
| 49 | `sourceDocMaterial` | 源头单据物料 | `source_doc_material` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 50 | `outsourcingQty` | 转委外量 | `outsourcing_qty` | Decimal |
| 51 | `purchasesQty` | 转采购量 | `purchases_qty` | Decimal |
| 52 | `bomVersion` | BOM版本 | `bom_version` | f494c08f-f466-474b-937a-4773d56696ed |
| 53 | `bomReplaceMark` | BOM替代标识 | `bom_replace_mark` | String |
| 54 | `demandTraceMethod` | 需求跟踪方式 | `demand_trace_method` | String |
| 55 | `demandTraceClue` | 跟踪线索 | `demand_trace_clue` | String |
| 56 | `changeStatus` | 变更状态 | `change_status` | String |
| 57 | `originalOrderNo` | 原单单号 | `original_order_no` | String |
| 58 | `syncStatus` | 同步状态 | `sync_status` | String |
| 59 | `syncMessage` | 同步信息 | `sync_message` | String |
| 60 | `isEditMark` | 可编辑标识 | `is_edit_mark` | Short |
| 61 | `isDelMark` | 删除标记 | `is_del_mark` | Short |
| 62 | `sourceDocLineNo` | 源头单据行号 | `source_doc_line_no` | Decimal |
| 63 | `originalPubts` | 原单时间戳 | `original_pubts` | DateTime |
| 64 | `orderType` | 订单类型 | `order_type` | String |
| 65 | `srcDocId` | 能力需求来源ID(订单ID) | `src_doc_id` | Long |
| 66 | `deliveryStatus` | 交期状态 | `delivery_status` | String |
| 67 | `scheduleStatus` | 排产状态 | `schedule_status` | String |
| 68 | `diffDayQty` | 差异天数(天) | `diff_day_qty` | Integer |
| 69 | `dataClassType` | 数据类类型 | `data_class_type` | String |
| 70 | `dataClassItem` | 数据类项 | `data_class_item` | String |
| 71 | `displayColor` | 显示颜色 | `display_color` | String |
| 72 | `bussinessKey` | 业务主键 | `bussiness_key` | String |
| 73 | `srcRouteId` | 工艺约束来源ID | `src_route_id` | Long |
| 74 | `srcRouteType` | 工艺约束来源类型 | `src_route_type` | String |
| 75 | `capacityObject` | 加工中心 | `capacity_object` | e3034100-f166-46e1-b750-d85fb84474b7 |
| 76 | `srcWCId` | 加工中心来源ID(工作中心/生产线) | `src_wc_id` | Long |
| 77 | `srcWCType` | 加工中心来源类型 | `src_wc_type` | String |
| 78 | `releaseStatus` | 发布状态 | `release_status` | String |
| 79 | `releasePeople` | 发布人id | `release_people` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 80 | `releasePeopleName` | 发布人 | `release_people_name` | String |
| 81 | `releaseTime` | 发布时间 | `release_time` | DateTime |
| 82 | `schedulingQuantity` | 排产数量 | `scheduling_quantity` | Decimal |
| 83 | `schedulingAuxQuantity` | 排产件数 | `scheduling_aux_quantity` | Decimal |
| 84 | `rcEvaluateStatus` | 交期评估状态 | `rc_evaluate_status` | Short |
| 85 | `rcPublishStatus` | 交期确认状态 | `rc_publish_status` | Short |
| 86 | `appScene` | 应用场景 | `app_scene` | String |
| 87 | `lvl` | 级别 | `lvl` | Short |
| 88 | `isEnd` | 是否末级 | `is_end` | Short |
| 89 | `seq` | 顺序号 | `seq` | Integer |
| 90 | `outsourcingAuxQty` | 转委外件数 | `outsourcing_aux_qty` | Decimal |
| 91 | `purchasesAuxQty` | 转采购件数 | `purchases_aux_qty` | Decimal |
| 92 | `selfMadeQty` | 自制数 | `self_made_qty` | Decimal |
| 93 | `selfMadeAuxQty` | 自制件数 | `self_made_aux_qty` | Decimal |
| 94 | `sourceDocNo` | 源头单据号 | `source_doc_no` | String |
| 95 | `upcode` | 来源单号 | `upcode` | String |
| 96 | `routeLineId` | 工艺约束行 | `route_line_id` | bd70e207-3153-4d6f-8a3f-11dae94555da |
| 97 | `dr` | 逻辑删除标记 | `dr` | Short |
| 98 | `createTime` | 创建时间 | `create_time` | DateTime |
| 99 | `createDate` | 创建日期 | `create_date` | Date |
| 100 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 101 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 102 | `creator` | 创建人名称 | `creator` | String |
| 103 | `modifier` | 修改人名称 | `modifier` | String |
| 104 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 105 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 106 | `enable` | 启用 | `enable` | sys_intboolean |
| 107 | `enablets` | 启用时间 | `enablets` | DateTime |
| 108 | `disablets` | 停用时间 | `disablets` | DateTime |
| 109 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 110 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 111 | `source` | 上游单据类型 | `source` | String |
| 112 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 113 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 114 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 115 | `pubts` | 时间戳 | `pubts` | DateTime |
| 116 | `conversionRateDen` | 换算率分母 | `conversion_rateden` | Decimal |
| 117 | `conversionRateNum` | 换算率分子 | `conversion_ratenum` | Decimal |
| 118 | `lockDate` | 锁定日期 | `lock_Date` | Date |
| 119 | `lockStatus` | 锁定状态 | `lock_status` | String |
| 120 | `lockTime` | 锁定时间 | `lock_time` | DateTime |
| 121 | `locker` | 锁定人 | `locker` | String |
| 122 | `originalMainQty` | 原始主单位数量 | `original_main_qty` | Decimal |
| 123 | `originalQty` | 原始数量 | `original_qty` | Decimal |
| 124 | `status` | 状态 | `status` | String |

---

## 关联属性（22个）

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
| 10 | `capacityDemandId` | 原能力需求(订单)id | `cmp.capacitydemand.CapacityDemand` | None |  |
| 11 | `demandProjectId` | 需求项目 | `bd.project.ProjectVO` | Service |  |
| 12 | `bomVersion` | BOM版本 | `ed.bom.Bom` | Service |  |
| 13 | `freeCharacter` | 自由项特征 | `cmp.capacitydemand.CapacityDemandFreeCT` | None |  |
| 14 | `demandOrgId` | 需求组织 | `aa.baseorg.OrgMV` | Service |  |
| 15 | `unit` | 单位 | `pc.unit.Unit` | Service |  |
| 16 | `sourceDocMaterial` | 源头单据物料 | `pc.product.Product` | Service |  |
| 17 | `planOrgId` | 计划组织 | `org.func.BaseOrg` | Service |  |
| 18 | `capacityObject` | 加工中心 | `cmp.capacityobject.CapacityObject` | None |  |
| 19 | `demandDeptId` | 需求部门 | `aa.baseorg.DeptMV` | Service |  |
| 20 | `supplyOrgId` | 供应组织 | `org.func.BaseOrg` | Service |  |
| 21 | `defineCharacter` | 自定义项 | `cmp.capacitydemand.CapacityDemandDefineCT` | None |  |
| 22 | `demandCapacityId` | 工艺约束ID | `cmp.demandcapacity.DemandCapacity` | None |  |
