---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.CheckPlan.CheckPlan"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验计划 (`QMSQIT.CheckPlan.CheckPlan`)

> QMSQIT | 物理表：`qms_qit_checkplan_m`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验计划 |
| 物理表 | `qms_qit_checkplan_m` |
| 数据库 schema | `QMS-QIT` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:41:55.5630` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 检验计划单号 |

---

## 直接属性（55个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `qualityinSpectionCenter` | 质检组织 | `qualityinspectioncenter` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 4 | `code` | 检验计划单号 | `code` | String |
| 5 | `productId` | 物料id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 6 | `productName` | 物料名称 | `product_name` | String |
| 7 | `transType` | 交易类型 | `trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 8 | `inspectionStartTime` | 整单计划检验开始时间 | `inspection_start_time` | DateTime |
| 9 | `inspectionEndTime` | 整单计划检验结束时间 | `inspection_end_time` | DateTime |
| 10 | `planStatus` | 计划状态 | `plan_status` | String |
| 11 | `checkType` | 检验类型 | `check_type` | String |
| 12 | `checkStep` | 按步骤检验 | `check_step` | String |
| 13 | `specsExplain` | 规格说明 | `specs_explain` | String |
| 14 | `model` | 型号 | `model` | String |
| 15 | `freect_h` | 检验计划自由项特征组 | `freect_h` | 6f0347ba-1e96-43a8-a435-268f7dffcad0 |
| 16 | `batchNo` | 批次号 | `batch_no` | String |
| 17 | `inspectastNum` | 计划请检数量 | `inspectast_num` | Decimal |
| 18 | `pk_unit` | 主计量 | `pk_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 19 | `checkOrg` | 请检组织 | `check_org` | 14302233-1394-4a70-94e1-bed51636f312 |
| 20 | `supplier` | 供应商 | `supplier` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 21 | `standardProcessId` | 工序 | `standard_process_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 22 | `workcenterId` | 工作中心 | `workcenter_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 23 | `pk_proddept` | 生产部门 | `pk_proddept` | ca871996-b447-42f9-8dac-dd7c21ee0662 |
| 24 | `orderType` | 源头单据类型 | `order_type` | String |
| 25 | `orderCode` | 源头单据号 | `order_code` | String |
| 26 | `orderLineNum` | 源头单据行号 | `order_linenum` | String |
| 27 | `qicSourceBillType` | 来源单据类型 | `qic_source_bill_type` | String |
| 28 | `qicSourceBillNo` | 来源单据号 | `qic_source_billno` | String |
| 29 | `qicSourceLineNum` | 来源单据行号 | `qic_source_linenum` | String |
| 30 | `qicSourcePlanLineNum` | 来源单据计划行号 | `qic_source_plan_linenum` | String |
| 31 | `qicSourceDate` | 来源业务日期 | `qic_source_date` | DateTime |
| 32 | `note` | 备注 | `note` | String |
| 33 | `defineCharacteristics` | 检验计划自定义项特征组 | `define_cts` | a005239c-56cd-4925-a79d-01b450f7c61f |
| 34 | `productCode` | 物料编码 | `product_code` | String |
| 35 | `checkStepConfig` | 检验步骤配置 | `check_step_config` | d793bf8a-3e9f-444b-a8ac-5f95511b2a46 |
| 36 | `qicSourceBillId` | 来源单据ID | `qic_source_bill_id` | String |
| 37 | `sysDate` | 单据日期 | `sys_date` | Date |
| 38 | `dr` | 逻辑删除标记 | `dr` | Short |
| 39 | `createTime` | 创建时间 | `create_time` | DateTime |
| 40 | `createDate` | 创建日期 | `create_date` | Date |
| 41 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 42 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 43 | `creator` | 创建人名称 | `creator` | String |
| 44 | `modifier` | 修改人名称 | `modifier` | String |
| 45 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 46 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 47 | `auditor` | 审批人名称 | `auditor` | String |
| 48 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 49 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 50 | `auditDate` | 审批日期 | `audit_date` | Date |
| 51 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 52 | `verifystate` | 审批状态 | `verifystate` | Short |
| 53 | `returncount` | 退回次数 | `returncount` | Short |
| 54 | `pubts` | 时间戳 | `pubts` | DateTime |
| 55 | `CheckPlanBodyList` | 检验计划表体 | `` | ad4dfcac-8d02-4f5f-9f0c-cdbd98788ee8 |

---

## 关联属性（17个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `checkStepConfig` | 检验步骤配置 | `QMSQIT.inspectionstepconfig.InspectionStepConfig` | None |  |
| 2 | `standardProcessId` | 工序 | `ed.operation.Operation` | Service |  |
| 3 | `productId` | 物料id | `pc.product.Product` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `checkOrg` | 请检组织 | `org.func.BaseOrg` | Service |  |
| 6 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 7 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 8 | `pk_proddept` | 生产部门 | `bd.adminOrg.DeptOrgVO` | Service |  |
| 9 | `pk_unit` | 主计量 | `pc.unit.Unit` | Service |  |
| 10 | `qualityinSpectionCenter` | 质检组织 | `org.func.QualityOrg` | Service |  |
| 11 | `CheckPlanBodyList` | 检验计划表体 | `QMSQIT.CheckPlan.CheckPlanBody` | None | true |
| 12 | `freect_h` | 检验计划自由项特征组 | `QMSQIT.CheckPlan.CheckPlanFree` | None |  |
| 13 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 14 | `defineCharacteristics` | 检验计划自定义项特征组 | `QMSQIT.CheckPlan.CheckPlanDefineCharacter` | None |  |
| 15 | `transType` | 交易类型 | `bd.bill.TransType` | Service |  |
| 16 | `supplier` | 供应商 | `aa.vendor.Vendor` | Service |  |
| 17 | `workcenterId` | 工作中心 | `ed.workcenter.WorkCenter` | Service |  |
