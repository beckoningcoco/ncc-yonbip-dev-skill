---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.capacitycalculate.CalOrder"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 运算单据 (`cmp.capacitycalculate.CalOrder`)

> DCRP | 物理表：`cmp_capacity_demand`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 运算单据 |
| 物理表 | `cmp_capacity_demand` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:58:59.4120` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（121个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `demandType` | 需求类型 | `demand_type` | String |
| 4 | `demandId` | 需求ID | `demand_id` | Long |
| 5 | `transId` | 交易类型 | `trans_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 6 | `demandOrgId` | 需求组织 | `demand_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 7 | `supplyOrgId` | 供应组织 | `supply_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 8 | `planOrgId` | 计划组织 | `plan_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 9 | `demandCode` | 需求单号 | `demand_code` | String |
| 10 | `demandLineNo` | 需求行号 | `demand_line_no` | Decimal |
| 11 | `demandPlanNo` | 需求计划行号 | `demand_plan_no` | Decimal |
| 12 | `demandDeptId` | 需求部门 | `demand_dept_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 13 | `demandProjectId` | 需求项目 | `demand_project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 14 | `productId` | 物料ID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 15 | `materialId` | 制造物料 | `material_id` | Long |
| 16 | `demandObjectId` | 需求对象ID | `demand_objectId` | Long |
| 17 | `demandObjectCode` | 需求对象编码 | `demand_object_code` | String |
| 18 | `demandObjectName` | 需求对象名称 | `demand_object_name` | String |
| 19 | `demandObjectModelDesc` | 需求对象规格 | `demand_object_model_desc` | String |
| 20 | `demandObjectType` | 需求对象类型 | `demand_object_type` | String |
| 21 | `freeCharacter` | 自由项特征 | `free_character` | 9ada1710-5e91-4809-8f42-ade1594d482e |
| 22 | `quantity` | 数量 | `quantity` | Decimal |
| 23 | `unit` | 单位 | `unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 24 | `mainQuantity` | 主单位数量 | `main_quantity` | Decimal |
| 25 | `mainUnit` | 主单位 | `main_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 26 | `conversionRate` | 换算率 | `conversion_rate` | Decimal |
| 27 | `demandBeginDate` | 需求开始日期 | `demand_begin_date` | DateTime |
| 28 | `demandEndDate` | 需求结束日期 | `demand_end_date` | DateTime |
| 29 | `suggestBeginDate` | 建议需求开始日期 | `suggest_begin_date` | DateTime |
| 30 | `suggestEndDate` | 建议需求结束日期 | `suggest_end_date` | DateTime |
| 31 | `docTransferQty` | 转单数量 | `doc_transfer_qty` | Decimal |
| 32 | `startQty` | 开工数量 | `start_qty` | Decimal |
| 33 | `completeQuantity` | 完工数量 | `complete_quantity` | Decimal |
| 34 | `receiptQuantity` | 入库数量 | `receipt_quantity` | Decimal |
| 35 | `defineCharacter` | 自定义项 | `define_character` | 0db9d836-07ca-4b03-85b5-bd18dff12faa |
| 36 | `memo` | 备注 | `memo` | String |
| 37 | `calculateMark` | 能力计算标识 | `calculate_mark` | Short |
| 38 | `calculateStrategy` | 能力计算策略 | `calculate_strategy` | String |
| 39 | `priority` | 优先级 | `priority` | Short |
| 40 | `calculateId` | 产能运算ID | `calculate_id` | 12a493ee-e7d1-4aac-b52d-8dd0dc02121b |
| 41 | `demandCapacityId` | 工艺约束ID | `demand_capacity_id` | 1550bbc9-2eed-432c-84cd-6c36a16d9507 |
| 42 | `demandStatus` | 状态 | `demand_status` | String |
| 43 | `sourceDocType` | 源头单据类型 | `source_doc_type` | String |
| 44 | `sourceDocNo` | 源头单据号 | `source_doc_no` | String |
| 45 | `sourceDocLineNo` | 源头单据行号 | `source_doc_line_no` | Decimal |
| 46 | `sourceDocMaterial` | 源头单据物料 | `source_doc_material` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 47 | `outsourcingQty` | 转委外量 | `outsourcing_qty` | Decimal |
| 48 | `purchasesQty` | 转采购量 | `purchases_qty` | Decimal |
| 49 | `bomVersion` | BOM版本 | `bom_version` | f494c08f-f466-474b-937a-4773d56696ed |
| 50 | `bomReplaceMark` | BOM替代标识 | `bom_replace_mark` | String |
| 51 | `demandTraceMethod` | 需求跟踪方式 | `demand_trace_method` | String |
| 52 | `demandTraceClue` | 跟踪线索 | `demand_trace_clue` | String |
| 53 | `changeStatus` | 变更状态 | `change_status` | String |
| 54 | `originalOrderNo` | 原单单号 | `original_order_no` | String |
| 55 | `syncStatus` | 同步状态 | `sync_status` | String |
| 56 | `syncMessage` | 同步信息 | `sync_message` | String |
| 57 | `appScene` | 应用场景 | `app_scene` | String |
| 58 | `isEditMark` | 可编辑标识 | `is_edit_mark` | Short |
| 59 | `isDelMark` | 删除标记 | `is_del_mark` | Short |
| 60 | `originalPubts` | 原单时间戳 | `original_pubts` | DateTime |
| 61 | `orderType` | 订单类型 | `order_type` | String |
| 62 | `srcDocId` | 能力需求来源ID(订单ID) | `src_doc_id` | Long |
| 63 | `deliveryStatus` | 交期状态 | `delivery_status` | String |
| 64 | `scheduleStatus` | 排产状态 | `schedule_status` | String |
| 65 | `diffDayQty` | 差异天数(天) | `diff_day_qty` | Integer |
| 66 | `dataClassType` | 数据类类型 | `data_class_type` | String |
| 67 | `dataClassItem` | 数据类项 | `data_class_item` | String |
| 68 | `displayColor` | 显示颜色 | `display_color` | String |
| 69 | `bussinessKey` | 业务主键 | `bussiness_key` | String |
| 70 | `srcRouteId` | 工艺约束来源ID | `src_route_id` | Long |
| 71 | `srcRouteType` | 工艺约束来源类型 | `src_route_type` | String |
| 72 | `capacityObject` | 加工中心 | `capacity_object` | e3034100-f166-46e1-b750-d85fb84474b7 |
| 73 | `srcWCId` | 加工中心来源ID(工作中心/生产线) | `src_wc_id` | Long |
| 74 | `srcWCType` | 加工中心来源类型 | `src_wc_type` | String |
| 75 | `releaseStatus` | 发布状态 | `release_status` | String |
| 76 | `releasePeople` | 发布人id | `release_people` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 77 | `releasePeopleName` | 发布人 | `release_people_name` | String |
| 78 | `releaseTime` | 发布时间 | `release_time` | DateTime |
| 79 | `schedulingQuantity` | 排产数量 | `scheduling_quantity` | Decimal |
| 80 | `schedulingAuxQuantity` | 排产件数 | `scheduling_aux_quantity` | Decimal |
| 81 | `rcEvaluateStatus` | 交期评估状态 | `rc_evaluate_status` | Short |
| 82 | `rcPublishStatus` | 交期确认状态 | `rc_publish_status` | Short |
| 83 | `lvl` | 级别 | `lvl` | Short |
| 84 | `isEnd` | 是否末级 | `is_end` | Short |
| 85 | `parentId` | 父Id | `parent_id` | Long |
| 86 | `seq` | 顺序号 | `seq` | Integer |
| 87 | `outsourcingAuxQty` | 转委外件数 | `outsourcing_aux_qty` | Decimal |
| 88 | `purchasesAuxQty` | 转采购件数 | `purchases_aux_qty` | Decimal |
| 89 | `selfMadeQty` | 自制数 | `self_made_qty` | Decimal |
| 90 | `selfMadeAuxQty` | 自制件数 | `self_made_aux_qty` | Decimal |
| 91 | `upcode` | 来源单号 | `upcode` | String |
| 92 | `routeLineId` | 工艺约束行 | `route_line_id` | bd70e207-3153-4d6f-8a3f-11dae94555da |
| 93 | `dr` | 逻辑删除标记 | `dr` | Short |
| 94 | `createTime` | 创建时间 | `create_time` | DateTime |
| 95 | `createDate` | 创建日期 | `create_date` | Date |
| 96 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 97 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 98 | `creator` | 创建人名称 | `creator` | String |
| 99 | `modifier` | 修改人名称 | `modifier` | String |
| 100 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 101 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 102 | `enable` | 启用 | `enable` | sys_intboolean |
| 103 | `enablets` | 启用时间 | `enablets` | DateTime |
| 104 | `disablets` | 停用时间 | `disablets` | DateTime |
| 105 | `source` | 上游单据类型 | `source` | String |
| 106 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 107 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 108 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 109 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 110 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 111 | `pubts` | 时间戳 | `pubts` | DateTime |
| 112 | `calOrderDemandList` | 排产运算单据-工序明细 | `` | 769338d5-913e-4798-b484-e53251aa59d9 |
| 113 | `conversionRateDen` | 换算率分母 | `conversion_rateden` | Decimal |
| 114 | `conversionRateNum` | 换算率分子 | `conversion_ratenum` | Decimal |
| 115 | `lockDate` | 锁定日期 | `lock_Date` | Date |
| 116 | `lockStatus` | 锁定状态 | `lock_status` | String |
| 117 | `lockTime` | 锁定时间 | `lock_time` | DateTime |
| 118 | `locker` | 锁定人 | `locker` | String |
| 119 | `originalMainQty` | 原始主单位数量 | `original_main_qty` | Decimal |
| 120 | `originalQty` | 原始数量 | `original_qty` | Decimal |
| 121 | `status` | 状态 | `status` | String |

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
| 7 | `calculateId` | 产能运算ID | `cmp.capacitycalculate.CapacityCalculate` | None | true |
| 8 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 9 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 10 | `demandProjectId` | 需求项目 | `bd.project.ProjectVO` | Service |  |
| 11 | `bomVersion` | BOM版本 | `ed.bom.Bom` | Service |  |
| 12 | `freeCharacter` | 自由项特征 | `cmp.capacitydemand.CapacityDemandFreeCT` | None |  |
| 13 | `demandOrgId` | 需求组织 | `aa.baseorg.OrgMV` | Service |  |
| 14 | `unit` | 单位 | `pc.unit.Unit` | Service |  |
| 15 | `sourceDocMaterial` | 源头单据物料 | `pc.product.Product` | Service |  |
| 16 | `calOrderDemandList` | 排产运算单据-工序明细 | `cmp.capacitycalculate.CalOrderDemandList` | None | true |
| 17 | `planOrgId` | 计划组织 | `org.func.BaseOrg` | Service |  |
| 18 | `capacityObject` | 加工中心 | `cmp.capacityobject.CapacityObject` | None |  |
| 19 | `demandDeptId` | 需求部门 | `aa.baseorg.DeptMV` | Service |  |
| 20 | `supplyOrgId` | 供应组织 | `org.func.BaseOrg` | Service |  |
| 21 | `defineCharacter` | 自定义项 | `cmp.capacitydemand.CapacityDemandDefineCT` | None |  |
| 22 | `demandCapacityId` | 工艺约束ID | `cmp.demandcapacity.DemandCapacity` | None |  |
