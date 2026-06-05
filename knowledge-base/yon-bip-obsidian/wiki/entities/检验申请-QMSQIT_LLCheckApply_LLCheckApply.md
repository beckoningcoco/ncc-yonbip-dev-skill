---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.LLCheckApply.LLCheckApply"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验申请 (`QMSQIT.LLCheckApply.LLCheckApply`)

> QMSQIT | 物理表：`qms_qit_llcheckapply`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验申请 |
| 物理表 | `qms_qit_llcheckapply` |
| 数据库 schema | `QMS-QIT` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:42:08.1530` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |
| 编码 | `code` | String | 检验申请单号 |

---

## 直接属性（205个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `tenant` | 租户ID | `tenant_id` | String |
| 3 | `id` | ID | `id` | String |
| 4 | `qualityinSpectionCenter` | 质检组织id | `qualityinSpectionCenter` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 5 | `code` | 检验申请单号 | `code` | String |
| 6 | `bustype` | 交易类型id | `bustype` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 7 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 8 | `qty` | 到货数量 | `qty` | Decimal |
| 9 | `cargospace` | 库位 | `cargospace` | 79b90356-9fc7-4bc2-ac1a-400520fa80cc |
| 10 | `checkSubNumber` | 库存件数 | `checkSubNumber` | Decimal |
| 11 | `exchangeRate` | 库存换算率 | `exchangeRate` | Decimal |
| 12 | `inspectFrozenStatus` | 质检冻结状态 | `inspectFrozenStatus` | 5275f074-3e60-4b90-9771-20970f1e905c |
| 13 | `isBatchManage` | 是否批次管理 | `isBatchManage` | Boolean |
| 14 | `isFrozenStock` | 已冻结库存 | `isFrozenStock` | Boolean |
| 15 | `isGoodsPosition` | 是否货位管理 | `isGoodsPosition` | Boolean |
| 16 | `pk_proddept` | 生产部门 | `pk_proddept` | ca871996-b447-42f9-8dac-dd7c21ee0662 |
| 17 | `reservedObj` | 跟踪线索 | `reservedObj` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 18 | `stockCheckType` | 在库检验类型 | `stockCheckType` | String |
| 19 | `stockStatusType` | 库存状态类型 | `stockStatusType` | String |
| 20 | `stockUnit` | 库存单位 | `stockUnit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 21 | `stockstatus` | 库存状态 | `stockstatus` | 5275f074-3e60-4b90-9771-20970f1e905c |
| 22 | `warehouse` | 仓库 | `warehouse` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 23 | `operationSequence` | 工序顺序号 | `operation_sequence` | String |
| 24 | `terminalTime` | 终止时间 | `terminal_time` | DateTime |
| 25 | `terminalPerson` | 终止人 | `terminal_person` | 54800425-15da-4742-ae89-059d05e77c9b |
| 26 | `autoFreezeInventory` | 自动冻结库存 | `auto_freezeInventory` | Boolean |
| 27 | `sourceOrderId` | 请检来源订单id | `source_order_id` | Long |
| 28 | `sourceOrderRowId` | 请检来源订单行id | `source_order_row_id` | Long |
| 29 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 30 | `sampleNum` | 已取样数量 | `sample_num` | Decimal |
| 31 | `sampling` | 取样 | `sampling` | Short |
| 32 | `makingSample` | 制样 | `making_sample` | Short |
| 33 | `originalRecord` | 原始记录 | `original_record` | Short |
| 34 | `isExternalSource` | 是否外部请检 | `is_external_source` | Short |
| 35 | `inspectionStepConfig` | 检验步骤配置 | `inspection_step_config` | d793bf8a-3e9f-444b-a8ac-5f95511b2a46 |
| 36 | `sampleplanId` | 取样方案id | `sampleplan_id` | 5961aff7-b759-4498-a39b-6aef93301023 |
| 37 | `samplePosition` | 取样位置 | `sample_position` | String |
| 38 | `sampleDirection` | 取样方向 | `sample_direction` | String |
| 39 | `sampleSize` | 取样大小 | `sample_size` | String |
| 40 | `sampleLocation` | 取样地点 | `sample_location` | String |
| 41 | `sampleContainer` | 取样容器 | `sample_container` | String |
| 42 | `sampleForm` | 取样形态 | `sample_form` | String |
| 43 | `sampleDesc` | 取样说明 | `sample_desc` | String |
| 44 | `preparationplanId` | 制样方案id | `preparationplan_id` | d0c92763-f04e-4002-9fbb-7e88ab1acdf0 |
| 45 | `preparationSize` | 制样大小 | `preparation_size` | String |
| 46 | `preparationForm` | 制样样品形态 | `preparation_form` | String |
| 47 | `preparationDesc` | 制样说明 | `preparation_desc` | String |
| 48 | `standardAcqMethod` | 标准获取方式 | `standard_acq_method` | String |
| 49 | `sourceOrderType` | 请检来源订单类型 | `source_order_type` | String |
| 50 | `sourceOrderCode` | 请检来源订单号 | `source_order_code` | String |
| 51 | `sourceOrderLineNo` | 请检来源订单行号 | `source_order_line_no` | Decimal |
| 52 | `sampleMethodDetailId` | 取样方式主表id | `sample_method_detailid` | 5653b278-1a57-42ea-81ab-e579e060556a |
| 53 | `castunitid` | 检验单位 | `castunitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 54 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 55 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 56 | `barCode` | 条形码 | `bar_code` | String |
| 57 | `spotchekastnum` | 本单抽检件数 | `spotchekastnum` | Decimal |
| 58 | `singleInspection` | 单件检验 | `single_inspection` | Boolean |
| 59 | `terminate` | 终止 | `terminate` | Boolean |
| 60 | `productionType` | 产出类型 | `productionType` | String |
| 61 | `salesOrg` | 销售组织 | `sales_org` | 4991976e-11ee-406e-bdbb-0f73f9f89ff2 |
| 62 | `customId` | 客户 | `custom_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 63 | `spotcheknum` | 本单抽检数量 | `spotcheknum` | Decimal |
| 64 | `isSnManage` | 序列号管理 | `is_sn_manage` | Short |
| 65 | `sh` | 序列号 | `sh` | String |
| 66 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean |
| 67 | `batchnoid` | 批次 | `batchnoid` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 68 | `directPrintCount` | 直接打印次数 | `directPrintCount` | Integer |
| 69 | `previewPrintCount` | 预览打印次数 | `previewPrintCount` | Integer |
| 70 | `salesDept` | 销售部门 | `sales_dept` | ca871996-b447-42f9-8dac-dd7c21ee0662 |
| 71 | `sampleUnitName` | 取样单位 | `sampleUnitName` | String |
| 72 | `samplingUnit` | 取样单位枚举 | `samplingUnit` | String |
| 73 | `inspectastnum` | 检验件数 | `inspectastnum` | Decimal |
| 74 | `inspectionrule` | 检验规则 | `inspectionRule` | String |
| 75 | `sampleUnit` | 取样单位Id | `sampleUnit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 76 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 77 | `exchangeType` | 质检换算率类型 | `exchangeType` | Integer |
| 78 | `printCount` | 打印次数 | `printCount` | Integer |
| 79 | `currentStage` | 当前检验阶段 | `currentStage` | String |
| 80 | `factory` | 工厂 | `factory` | 14302233-1394-4a70-94e1-bed51636f312 |
| 81 | `vchangerate` | 质检换算率 | `vchangerate` | String |
| 82 | `standardProcessId` | 标准工序 | `standard_process_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 83 | `workcenterId` | 工作中心 | `workcenter_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 84 | `createDate` | 创建日期 | `create_date` | Date |
| 85 | `definect_h` | 表头自定义项特征 | `definect_h` | 57659827-589c-4b3b-85c9-b1b4bbff0c34 |
| 86 | `freect_h` | 表头自由项特征组实体 | `freect_h` | 711f1bde-fc6c-45f4-8780-b974593aa002 |
| 87 | `initcheckapply_code` | 初始检验申请单号 | `initcheckapply_code` | String |
| 88 | `initcheckapply_id` | 初始检验申请ID | `initcheckapply_id` | String |
| 89 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 90 | `tplid` | 模板id | `tplid` | Long |
| 91 | `status` | 单据状态 | `status` | Short |
| 92 | `creator` | 创建人id | `creator` | String |
| 93 | `createTime` | 创建时间 | `create_time` | DateTime |
| 94 | `modifier` | 修改人id | `modifier` | String |
| 95 | `auditor` | 审批人 | `auditor` | String |
| 96 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 97 | `manufactureDate` | 生产日期 | `manufactureDate` | DateTime |
| 98 | `expireDateNo` | 保质期 | `expireDateNo` | Integer |
| 99 | `expireDateUnit` | 保质期单位 | `expireDateUnit` | Short |
| 100 | `checkDate` | 请检日期 | `checkDate` | DateTime |
| 101 | `checkPlanDetailId` | 检验方案主表id | `checkPlanDetailId` | cacc3797-7e23-44d9-aad5-ebfe0c680961 |
| 102 | `supplier` | 供应商id | `supplier` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 103 | `product` | 物料编码id | `product` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 104 | `specifications` | 规格 | `specifications` | String |
| 105 | `model` | 型号 | `model` | String |
| 106 | `batchNum` | 批次号 | `batchNum` | String |
| 107 | `checkNumber` | 请检数量 | `checkNumber` | Decimal |
| 108 | `mainUnit` | 主单位ID | `mainUnit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 109 | `verifystate` | 单据状态 | `verifystate` | Short |
| 110 | `checkPlan` | 默认检验方案id | `checkPlan` | 14bcdfef-7982-4772-baf8-e0d6ebef507e |
| 111 | `sumNumber` | 累计检验数量 | `sumNumber` | Decimal |
| 112 | `notTestNumber` | 未检验数量 | `notTestNumber` | Decimal |
| 113 | `productSKu` | 物料SKU编码id | `productSKu` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 114 | `checkOrg` | 请检组织id | `checkOrg` | 14302233-1394-4a70-94e1-bed51636f312 |
| 115 | `checkDept` | 请检部门id | `checkDept` | ca871996-b447-42f9-8dac-dd7c21ee0662 |
| 116 | `checkPeople` | 请检人id | `checkPeople` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 117 | `sampMethod` | 取样方式ID | `sampMethod` | d21eaba0-3431-4238-b178-c6216a31b34b |
| 118 | `isInspectionItemConfirm` | 单一取样方式 | `isInspectionItemConfirm` | String |
| 119 | `sourcebillType` | 来源单据类型 | `sourcebillType` | String |
| 120 | `sourcebillNum` | 来源单据号 | `sourcebillNum` | String |
| 121 | `documentStatus` | 源头单据类型 | `documentStatus` | String |
| 122 | `documentNumber` | 源头单据号 | `documentNumber` | String |
| 123 | `documentIndex` | 源头单据行号 | `documentIndex` | String |
| 124 | `checkType` | 检验类型 | `checkType` | String |
| 125 | `purchOrg` | 采购组织id | `purchOrg` | a4916c85-f087-4e87-a178-0ad37aff7cd0 |
| 126 | `purchDept` | 采购部门id | `purchDept` | ca871996-b447-42f9-8dac-dd7c21ee0662 |
| 127 | `purchPeople` | 采购员id | `purchPeople` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 128 | `sourcebillIndex` | 来源单据行号 | `sourcebillIndex` | String |
| 129 | `billtype` | 单据类型id | `billtype` | 4a227650-b866-4f4c-a6ca-2433297a1713 |
| 130 | `testBasis` | 检测依据id | `testBasis` | f0529fa3-5e4b-444a-8212-716743519d68 |
| 131 | `termOfValidity` | 有效期至 | `termOfValidity` | DateTime |
| 132 | `reexamination` | 复检 | `reexamination` | Boolean |
| 133 | `vnote` | 备注 | `vnote` | String |
| 134 | `dispatchFrequency` | 调度频次 | `dispatchFrequency` | String |
| 135 | `mergeTest` | 合并检验 | `mergeTest` | Boolean |
| 136 | `businessStart` | 业务日期起 | `businessStart` | DateTime |
| 137 | `businessEnd` | 业务日期止 | `businessEnd` | DateTime |
| 138 | `businessPeriod` | 业务期间 | `businessPeriod` | String |
| 139 | `pubts` | 时间戳 | `pubts` | DateTime |
| 140 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 141 | `returncount` | 退回次数 | `returncount` | Short |
| 142 | `dr` | 逻辑删除标记 | `dr` | Short |
| 143 | `source` | 上游单据类型 | `source` | String |
| 144 | `sourcebillId` | 来源单据id | `sourcebillId` | String |
| 145 | `documentId` | 订单单据id | `documentId` | String |
| 146 | `sourcebillbId` | 到货单子表ID | `sourcebillbId` | String |
| 147 | `version` | 检验方案版本 | `version` | String |
| 148 | `free8` | 物料规格8 | `free8` | String |
| 149 | `free7` | 物料规格7 | `free7` | String |
| 150 | `free10` | 物料规格10 | `free10` | String |
| 151 | `free9` | 物料规格9 | `free9` | String |
| 152 | `free1` | 物料规格1 | `free1` | String |
| 153 | `free4` | 物料规格4 | `free4` | String |
| 154 | `free2` | 物料规格2 | `free2` | String |
| 155 | `free3` | 物料规格3 | `free3` | String |
| 156 | `free6` | 物料规格6 | `free6` | String |
| 157 | `free5` | 物料规格5 | `free5` | String |
| 158 | `define30` | 批次属性30 | `define30` | String |
| 159 | `define10` | 批次属性10 | `define10` | String |
| 160 | `define16` | 批次属性16 | `define16` | String |
| 161 | `define9` | 批次属性9 | `define9` | String |
| 162 | `define15` | 批次属性15 | `define15` | String |
| 163 | `define21` | 批次属性21 | `define21` | String |
| 164 | `define3` | 批次属性3 | `define3` | String |
| 165 | `define8` | 批次属性8 | `define8` | String |
| 166 | `define14` | 批次属性14 | `define14` | String |
| 167 | `define20` | 批次属性20 | `define20` | String |
| 168 | `define25` | 批次属性25 | `define25` | String |
| 169 | `define26` | 批次属性26 | `define26` | String |
| 170 | `define4` | 批次属性4 | `define4` | String |
| 171 | `define7` | 批次属性7 | `define7` | String |
| 172 | `define13` | 批次属性13 | `define13` | String |
| 173 | `define19` | 批次属性19 | `define19` | String |
| 174 | `define24` | 批次属性24 | `define24` | String |
| 175 | `define27` | 批次属性27 | `define27` | String |
| 176 | `creatorId` | 创建人id | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 177 | `define1` | 批次属性1 | `define1` | String |
| 178 | `define6` | 批次属性6 | `define6` | String |
| 179 | `define12` | 批次属性12 | `define12` | String |
| 180 | `define18` | 批次属性18 | `define18` | String |
| 181 | `modifierId` | 修改人id | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 182 | `define23` | 批次属性23 | `define23` | String |
| 183 | `define28` | 批次属性28 | `define28` | String |
| 184 | `define2` | 批次属性2 | `define2` | String |
| 185 | `define5` | 批次属性5 | `define5` | String |
| 186 | `define11` | 批次属性11 | `define11` | String |
| 187 | `define17` | 批次属性17 | `define17` | String |
| 188 | `define22` | 批次属性22 | `define22` | String |
| 189 | `define29` | 批次属性29 | `define29` | String |
| 190 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 191 | `checkId` | 检验单ID | `checkId` | String |
| 192 | `isMany` | 是否启用质量等级 | `isMany` | String |
| 193 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 194 | `auditDate` | 审批日期 | `audit_date` | DateTime |
| 195 | `LLCheckApplyExt` | 检验申请扩展信息 | `` | 28d747d7-f376-4b42-9893-b887c7416e58 |
| 196 | `LLCheckInformationList` | 检验信息子表 | `` | 6bea8eb3-a6ed-4f12-9dba-6979d61cf247 |
| 197 | `LLSourceInformationList` | 检验申请源单信息子表 | `` | f52f8fb2-c97f-4bf4-b54d-6e9ea72724f4 |
| 198 | `MultipleInspectionList` | 分次检验表子表实体 | `` | 797ddaca-6500-475b-9093-d0b8ee491d41 |
| 199 | `PreparationInfoList` | 制样信息 | `` | 6d6a08d0-0246-46be-bced-a2bf1e88cb1d |
| 200 | `SamplingInfoList` | 检验申请取样信息子表 | `` | 6320e62e-841d-4add-a0b2-16ee02b33ed2 |
| 201 | `defines` | 检验申请自定义项 | `` | e9c2c46e-9826-431d-8558-345cb48e3ecf |
| 202 | `submitTime` | 提交时间 | `submit_time` | DateTime |
| 203 | `submitter` | 提交人 | `submitter` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 204 | `withdrawTime` | 撤回提交时间 | `withdraw_time` | DateTime |
| 205 | `withdrawpp` | 撤回提交的人 | `withdrawpp` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |

---

## 关联属性（57个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `sampMethod` | 取样方式ID | `QMSDFM.sampleMethod.sampleMethod` | Service |  |
| 2 | `LLCheckApplyExt` | 检验申请扩展信息 | `QMSQIT.LLCheckApply.LLCheckApplyExt` | None | true |
| 3 | `modifierId` | 修改人id | `base.user.User` | Service |  |
| 4 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 5 | `salesDept` | 销售部门 | `bd.adminOrg.DeptOrgVO` | Service |  |
| 6 | `defines` | 检验申请自定义项 | `QMSQIT.LLCheckApply.LLCheckApplyDefine` | None | true |
| 7 | `checkPlan` | 默认检验方案id | `QMSDFM.inspectionPlan.inspectionPlan` | Service |  |
| 8 | `preparationplanId` | 制样方案id | `QMSQIT.samplepreparationplan.SamplePreparationPlan` | None |  |
| 9 | `PreparationInfoList` | 制样信息 | `QMSQIT.LLCheckApply.PreparationInfo` | None | true |
| 10 | `supplier` | 供应商id | `aa.vendor.Vendor` | Service |  |
| 11 | `purchPeople` | 采购员id | `bd.staff.Staff` | Service |  |
| 12 | `definect_h` | 表头自定义项特征 | `QMSQIT.LLCheckApply.LLCheckApplyDefineCharacter` | None |  |
| 13 | `terminalPerson` | 终止人 | `base.user.User` | Service |  |
| 14 | `mainUnit` | 主单位ID | `pc.unit.Unit` | Service |  |
| 15 | `standardProcessId` | 标准工序 | `ed.operation.Operation` | Service |  |
| 16 | `inspectionStepConfig` | 检验步骤配置 | `QMSQIT.inspectionstepconfig.InspectionStepConfig` | None |  |
| 17 | `checkOrg` | 请检组织id | `org.func.BaseOrg` | Service |  |
| 18 | `pk_proddept` | 生产部门 | `bd.adminOrg.DeptOrgVO` | Service |  |
| 19 | `reservedObj` | 跟踪线索 | `st.reservation.Reservation` | Service |  |
| 20 | `castunitid` | 检验单位 | `pc.unit.Unit` | Service |  |
| 21 | `warehouse` | 仓库 | `aa.warehouse.Warehouse` | Service |  |
| 22 | `stockUnit` | 库存单位 | `pc.unit.Unit` | Service |  |
| 23 | `productSKu` | 物料SKU编码id | `pc.product.ProductSKU` | Service |  |
| 24 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 25 | `purchOrg` | 采购组织id | `org.func.PurchaseOrg` | Service |  |
| 26 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
| 27 | `purchDept` | 采购部门id | `bd.adminOrg.DeptOrgVO` | Service |  |
| 28 | `submitter` | 提交人 | `base.user.BipUser` | Service |  |
| 29 | `stockstatus` | 库存状态 | `st.stockStatusRecord.stockStatusRecord` | Service |  |
| 30 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 31 | `MultipleInspectionList` | 分次检验表子表实体 | `QMSQIT.LLCheckApply.LLMultipleInspection` | None | true |
| 32 | `sampleUnit` | 取样单位Id | `pc.unit.Unit` | Service |  |
| 33 | `creatorId` | 创建人id | `base.user.User` | Service |  |
| 34 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 35 | `salesOrg` | 销售组织 | `org.func.SalesOrg` | Service |  |
| 36 | `testBasis` | 检测依据id | `QMSDFM.detectionbasis.qam_detectionbasis` | Service |  |
| 37 | `customId` | 客户 | `aa.merchant.Merchant` | Service |  |
| 38 | `freect_h` | 表头自由项特征组实体 | `QMSQIT.LLCheckApply.LLCheckApplyFree` | None |  |
| 39 | `withdrawpp` | 撤回提交的人 | `base.user.BipUser` | Service |  |
| 40 | `billtype` | 单据类型id | `bd.bill.BillTypeVO` | Service |  |
| 41 | `LLSourceInformationList` | 检验申请源单信息子表 | `QMSQIT.LLCheckApply.LLSourceInformation` | None | true |
| 42 | `checkDept` | 请检部门id | `bd.adminOrg.DeptOrgVO` | Service |  |
| 43 | `inspectFrozenStatus` | 质检冻结状态 | `st.stockStatusRecord.stockStatusRecord` | Service |  |
| 44 | `sampleMethodDetailId` | 取样方式主表id | `QMSDFM.sampleMethod.sampleMethodDetail` | Service |  |
| 45 | `checkPlanDetailId` | 检验方案主表id | `QMSDFM.inspectionPlan.inspectionPlanDetail` | Service |  |
| 46 | `workcenterId` | 工作中心 | `ed.workcenter.WorkCenter` | Service |  |
| 47 | `factory` | 工厂 | `org.func.BaseOrg` | Service |  |
| 48 | `batchnoid` | 批次 | `st.batchno.Batchno` | Service |  |
| 49 | `product` | 物料编码id | `pc.product.Product` | Service |  |
| 50 | `cargospace` | 库位 | `aa.goodsposition.GoodsPosition` | Service |  |
| 51 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 52 | `checkPeople` | 请检人id | `bd.staff.Staff` | Service |  |
| 53 | `qualityinSpectionCenter` | 质检组织id | `org.func.QualityOrg` | Service |  |
| 54 | `SamplingInfoList` | 检验申请取样信息子表 | `QMSQIT.LLCheckApply.LLSamplingInfo` | None | true |
| 55 | `bustype` | 交易类型id | `bd.bill.TransType` | Service |  |
| 56 | `sampleplanId` | 取样方案id | `QMSQIT.samplingplan.SamplingPlan` | None |  |
| 57 | `LLCheckInformationList` | 检验信息子表 | `QMSQIT.LLCheckApply.LLCheckInformation` | None | true |
