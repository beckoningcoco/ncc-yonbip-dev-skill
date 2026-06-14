---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.incominspectorder.qms_qit_incominspectorder_h"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验单 (`QMSQIT.incominspectorder.qms_qit_incominspectorder_h`)

> QMSQIT | 物理表：`qms_qit_incominspectorder_h`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验单 |
| 物理表 | `qms_qit_incominspectorder_h` |
| domain/服务域 | `QMS-QIT` |
| schema | `qms_qit_rejectbill` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:42:09.8300` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |
| 编码 | `code` | String | 检验单号 |

---

## 直接属性（216个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `tenant` | 租户ID | `tenant_id` | String |
| 3 | `id` | ID | `id` | String |
| 4 | `pk_org` | 质检组织id | `pk_org` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 5 | `code` | 检验单号 | `code` | String |
| 6 | `trantype` | 交易类型id | `trantype` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 7 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 8 | `autoFreezeInventory` | 自动冻结库存 | `auto_freezeInventory` | Boolean |
| 9 | `checkApplyStStatus` | 请检库存状态 | `checkapply_ststatus` | 5275f074-3e60-4b90-9771-20970f1e905c |
| 10 | `customId` | 客户 | `custom_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 11 | `salesDept` | 销售部门 | `sales_dept` | ca871996-b447-42f9-8dac-dd7c21ee0662 |
| 12 | `salesOrg` | 销售组织 | `sales_org` | 4991976e-11ee-406e-bdbb-0f73f9f89ff2 |
| 13 | `applyAuditTime` | 检验申请审核日期 | `apply_audit_time` | DateTime |
| 14 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 15 | `directPrintCount` | 直接打印次数 | `directPrintCount` | Integer |
| 16 | `inspectRule` | 检验规则 | `inspectRule` | String |
| 17 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean |
| 18 | `planDays` | 计划检验天数 | `plan_days` | Decimal |
| 19 | `planEndDate` | 计划检验结束日期 | `plan_end_date` | DateTime |
| 20 | `previewPrintCount` | 预览打印次数 | `previewPrintCount` | Integer |
| 21 | `printCount` | 打印次数 | `printCount` | Integer |
| 22 | `realityEndDate` | 实际检验结束日期 | `reality_end_date` | DateTime |
| 23 | `realityInspectDays` | 实际检验天数 | `reality_inspect_days` | Decimal |
| 24 | `samplingUnit` | 取样单位id | `samplingUnit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 25 | `samplingUnitName` | 取样单位 | `samplingUnitName` | String |
| 26 | `terminalPerson` | 终止人 | `terminal_person` | 54800425-15da-4742-ae89-059d05e77c9b |
| 27 | `singleInspection` | 单件检验 | `single_inspection` | Boolean |
| 28 | `sourceOrderId` | 请检来源订单id | `source_order_id` | Long |
| 29 | `sourceOrderRowId` | 请检来源订单行id | `source_order_row_id` | Long |
| 30 | `sampleMethodDetailId` | 取样方式主表id | `samplemethod_detail_id` | 5653b278-1a57-42ea-81ab-e579e060556a |
| 31 | `barCode` | 条形码 | `bar_code` | String |
| 32 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 33 | `isSnManage` | 序列号管理 | `is_sn_manage` | Short |
| 34 | `sn` | 序列号 | `sn` | String |
| 35 | `inspectionStepConfig` | 检验步骤配置 | `inspection_step_config` | d793bf8a-3e9f-444b-a8ac-5f95511b2a46 |
| 36 | `inspectDurationUnit` | 检验时长单位 | `inspect_duration_unit` | String |
| 37 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 38 | `sourceOrderLineNo` | 请检来源订单行号 | `source_order_line_no` | Decimal |
| 39 | `destroySimpleResp` | 破坏样本承担方 | `destroy_simple_resp` | Short |
| 40 | `sourceOrderType` | 请检来源订单类型 | `source_order_type` | String |
| 41 | `inspect_result_source` | 检验结果来源 | `inspect_result_source` | Short |
| 42 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 43 | `isExternalSource` | 是否外部请检 | `is_external_source` | Short |
| 44 | `destroySimpleMagType` | 破坏样本管理方式 | `destroy_simple_mag_type` | Short |
| 45 | `productionType` | 产出类型 | `productionType` | String |
| 46 | `originalRecord` | 原始记录 | `original_record` | Short |
| 47 | `sourceOrderCode` | 请检来源订单号 | `source_order_code` | String |
| 48 | `destroySimpleNum` | 破坏样本数量 | `destroy_simple_num` | Decimal |
| 49 | `factory` | 工厂 | `factory` | 14302233-1394-4a70-94e1-bed51636f312 |
| 50 | `terminalTime` | 终止时间 | `terminal_time` | DateTime |
| 51 | `terminate` | 终止 | `terminate` | Boolean |
| 52 | `qty` | 到货数量 | `qty` | Decimal |
| 53 | `cargospace` | 货位 | `cargospace` | 79b90356-9fc7-4bc2-ac1a-400520fa80cc |
| 54 | `checkSubNumber` | 库存件数 | `checkSubNumber` | Decimal |
| 55 | `exchangeRate` | 库存换算率 | `exchangeRate` | Decimal |
| 56 | `frozeState` | 质检冻结状态 | `frozeState` | 5275f074-3e60-4b90-9771-20970f1e905c |
| 57 | `pk_prod_dept` | 生产部门 | `pk_prod_dept` | ca871996-b447-42f9-8dac-dd7c21ee0662 |
| 58 | `reserved_obj` | 跟踪线索 | `reserved_obj` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 59 | `stockCheckType` | 在库检验类型 | `stockCheckType` | String |
| 60 | `stockUnit` | 库存单位 | `stockUnit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 61 | `stockstate` | 同步库存单据状态 | `stockstate` | String |
| 62 | `warehouse` | 仓库 | `warehouse` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 63 | `applyPersonId` | 请检人 | `applyPersonId` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 64 | `orderProcessId` | 工序 | `order_process_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 65 | `orderProcessSn` | 工序顺序号 | `order_process_sn` | String |
| 66 | `workCenterId` | 工作中心 | `work_center_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 67 | `createDate` | 创建日期 | `create_date` | Date |
| 68 | `definect_h` | 表头自定义项特征实体 | `definect_h` | a03e99c5-c65f-4849-b114-24c81764870a |
| 69 | `freect_h` | 表头自由项特征组实体 | `freect_h` | 9305521e-e1f8-4690-9e64-42cd2a6ee0e7 |
| 70 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 71 | `pk_inspect_period` | 检验阶段 | `pk_inspect_period` | String |
| 72 | `tplid` | 模板id | `tplid` | Long |
| 73 | `checkrule` | 检验规则 | `checkrule` | Short |
| 74 | `createTime` | 创建时间 | `create_time` | DateTime |
| 75 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 76 | `status` | 单据状态 | `status` | Short |
| 77 | `creator` | 创建人id | `creator` | String |
| 78 | `modifier` | 修改人id | `modifier` | String |
| 79 | `auditor` | 审批人 | `auditor` | String |
| 80 | `initinspectorder_id` | 初始检验申请ID | `initinspectorder_id` | String |
| 81 | `checkPlanDetailId` | 检验方案主表id | `checkPlanDetailId` | cacc3797-7e23-44d9-aad5-ebfe0c680961 |
| 82 | `manufacture_date` | 生产日期 | `manufacture_date` | DateTime |
| 83 | `initinspectorder_code` | 初始检验申请单号 | `initinspectorder_code` | String |
| 84 | `pk_purchase_org` | 采购组织id | `pk_purchase_org` | a4916c85-f087-4e87-a178-0ad37aff7cd0 |
| 85 | `warranty_date` | 保质期 | `warranty_date` | Integer |
| 86 | `warranty_unit` | 保质期单位 | `warranty_unit` | Short |
| 87 | `pk_purchase_dept` | 采购部门id | `pk_purchase_dept` | ca871996-b447-42f9-8dac-dd7c21ee0662 |
| 88 | `vbillcode` | 检验单号 | `vbillcode` | String |
| 89 | `pk_purchaser` | 采购员id | `pk_purchaser` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 90 | `pk_materialsku` | 物料skuid | `pk_materialsku` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 91 | `verifystate` | 审批状态 | `verifystate` | Short |
| 92 | `inspectDate` | 检验日期 | `inspectDate` | Date |
| 93 | `pk_outsupplier` | 供应商id | `pk_outsupplier` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 94 | `version` | 版本号 | `version` | String |
| 95 | `pk_material` | 物料id | `pk_material` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 96 | `billtype` | 检验类型 | `check_type` | String |
| 97 | `pk_batchcode` | 批次号 | `pk_batchcode` | String |
| 98 | `pk_sample` | 取样方式id | `pk_sample` | d21eaba0-3431-4238-b178-c6216a31b34b |
| 99 | `pk_inspectionplan` | 检验方案id | `pk_inspectionplan` | 14bcdfef-7982-4772-baf8-e0d6ebef507e |
| 100 | `pk_test` | 检测依据id | `pk_test` | f0529fa3-5e4b-444a-8212-716743519d68 |
| 101 | `inspectastnum` | 检验数量 | `inspectastnum` | Decimal |
| 102 | `validityDate` | 有效期至 | `validityDate` | Date |
| 103 | `castunitid` | 检验单位id | `castunitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 104 | `inspectResult` | 检验结果 | `inspectResult` | String |
| 105 | `cunitid` | 主单位id | `cunitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 106 | `vchangerate` | 换算率 | `vchangerate` | String |
| 107 | `inspectnum` | 检验主数量 | `inspectnum` | Decimal |
| 108 | `pk_inspecter` | 检验员id | `pk_inspecter` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 109 | `spotchekastnum` | 本单抽检数量 | `spotchekastnum` | Decimal |
| 110 | `spotcheknum` | 本单抽检主数量 | `spotcheknum` | Decimal |
| 111 | `pk_inspectdept` | 检验部门id | `pk_inspectdept` | ca871996-b447-42f9-8dac-dd7c21ee0662 |
| 112 | `sourcebilltype` | 请检来源单据类型 | `sourcebilltype` | String |
| 113 | `vsourcecode` | 请检来源单据号 | `vsourcecode` | String |
| 114 | `sourcerowno` | 请检来源单据行号 | `sourcerowno` | String |
| 115 | `orderbilltype` | 请检源头单据类型 | `orderbilltype` | String |
| 116 | `vordercode` | 请检源头单据号 | `vordercode` | String |
| 117 | `vorderrowno` | 请检源头单据行号 | `vorderrowno` | String |
| 118 | `pk_busiperiod` | 业务期间 | `pk_busiperiod` | String |
| 119 | `pk_applycheckorg` | 请检组织id | `pk_applycheckorg` | 598482c6-0ad7-493a-b944-5493a8b9fb8e |
| 120 | `pk_applycheckdept` | 请检部门id | `pk_applycheckdept` | ca871996-b447-42f9-8dac-dd7c21ee0662 |
| 121 | `vapplycheckcode` | 来源单据号 | `vapplycheckcode` | String |
| 122 | `applycheckDate` | 请检日期 | `applycheckDate` | Date |
| 123 | `combinecheck` | 合并检验 | `combinecheck` | Boolean |
| 124 | `busistartDate` | 业务日期起 | `busistartDate` | Date |
| 125 | `note` | 备注 | `note` | String |
| 126 | `recheck` | 复检 | `recheck` | Boolean |
| 127 | `qnum` | 合格主数量 | `qnum` | Decimal |
| 128 | `nqnum` | 不合格主数量 | `nqnum` | Decimal |
| 129 | `samnum` | 样本合格数 | `samnum` | Decimal |
| 130 | `unsamnum` | 样本不合格数 | `unsamnum` | Decimal |
| 131 | `chastnum` | 改判数量 | `chastnum` | Decimal |
| 132 | `chnum` | 改判主数量 | `chnum` | Decimal |
| 133 | `chrate` | 改判率(%) | `chrate` | Decimal |
| 134 | `busiendDate` | 业务日期止 | `busiendDate` | Date |
| 135 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 136 | `returncount` | 退回次数 | `returncount` | Short |
| 137 | `pk_applycheck` | 检验申请单id | `pk_applycheck` | String |
| 138 | `pk_orderbill` | 订单单据id | `pk_orderbill` | String |
| 139 | `pk_sourcebill` | 来源单据id | `pk_sourcebill` | String |
| 140 | `attachmentId` | 附件 | `attachmentId` | String |
| 141 | `pk_sourcebill_b` | 来源单据行id | `pk_sourcebill_b` | String |
| 142 | `inspectionplanSingle` | 单一取样方式 | `inspectionplanSingle` | Boolean |
| 143 | `inspectionplanVersion` | 检验方案版本 | `inspectionplanVersion` | String |
| 144 | `inspectionplanMethod` | 质量等级 | `inspectionplanMethod` | String |
| 145 | `free1` | 物料规格1 | `free1` | String |
| 146 | `free2` | 物料规格2 | `free2` | String |
| 147 | `free3` | 物料规格3 | `free3` | String |
| 148 | `free4` | 物料规格4 | `free4` | String |
| 149 | `free5` | 物料规格5 | `free5` | String |
| 150 | `free6` | 物料规格6 | `free6` | String |
| 151 | `free7` | 物料规格7 | `free7` | String |
| 152 | `free8` | 物料规格8 | `free8` | String |
| 153 | `free9` | 物料规格9 | `free9` | String |
| 154 | `free10` | 物料规格10 | `free10` | String |
| 155 | `applycheckbillType` | 来源单据类型 | `applycheckbillType` | String |
| 156 | `unitExchangeType` | 固定换算率 | `unitExchangeType` | Integer |
| 157 | `define1` | 批次号属性1 | `define1` | String |
| 158 | `currentStage` | 当前检验阶段 | `currentStage` | String |
| 159 | `define2` | 批次号属性2 | `define2` | String |
| 160 | `define3` | 批次号属性3 | `define3` | String |
| 161 | `define4` | 批次号属性4 | `define4` | String |
| 162 | `define5` | 批次号属性5 | `define5` | String |
| 163 | `define6` | 批次号属性6 | `define6` | String |
| 164 | `define7` | 批次号属性7 | `define7` | String |
| 165 | `define9` | 批次号属性9 | `define9` | String |
| 166 | `define10` | 批次号属性10 | `define10` | String |
| 167 | `define11` | 批次号属性11 | `define11` | String |
| 168 | `define12` | 批次号属性12 | `define12` | String |
| 169 | `define13` | 批次号属性13 | `define13` | String |
| 170 | `define14` | 批次号属性14 | `define14` | String |
| 171 | `define15` | 批次号属性15 | `define15` | String |
| 172 | `define16` | 批次号属性16 | `define16` | String |
| 173 | `define17` | 批次号属性17 | `define17` | String |
| 174 | `define18` | 批次号属性18 | `define18` | String |
| 175 | `define19` | 批次号属性19 | `define19` | String |
| 176 | `define20` | 批次号属性20 | `define20` | String |
| 177 | `define21` | 批次号属性21 | `define21` | String |
| 178 | `define22` | 批次号属性22 | `define22` | String |
| 179 | `define23` | 批次号属性23 | `define23` | String |
| 180 | `define24` | 批次号属性24 | `define24` | String |
| 181 | `define25` | 批次号属性25 | `define25` | String |
| 182 | `define26` | 批次号属性26 | `define26` | String |
| 183 | `define27` | 批次号属性27 | `define27` | String |
| 184 | `define28` | 批次号属性28 | `define28` | String |
| 185 | `define29` | 批次号属性29 | `define29` | String |
| 186 | `define30` | 批次号属性30 | `define30` | String |
| 187 | `creatorId` | 创建人id | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 188 | `producedate` | 生产日期 | `producedate` | DateTime |
| 189 | `invaliddate` | 有效期 | `invaliddate` | DateTime |
| 190 | `firstStoredDate` | 首次入库日期 | `firstStoredDate` | DateTime |
| 191 | `modifierId` | 修改人id | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 192 | `qastnum` | 合格数量 | `qastnum` | Decimal |
| 193 | `nqastnum` | 不合格数量 | `nqastnum` | Decimal |
| 194 | `qrate` | 合格率(%) | `qrate` | Decimal |
| 195 | `rnote` | 备注 | `rnote` | String |
| 196 | `storage` | 保质期 | `storage` | String |
| 197 | `pk_storageunit` | 保质期单位 | `pk_storageunit` | String |
| 198 | `define8` | 批次属性8 | `define8` | String |
| 199 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 200 | `vbaditemcode` | 不良品处理单号 | `vbaditemcode` | String |
| 201 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 202 | `auditDate` | 审批日期 | `audit_date` | Date |
| 203 | `pubts` | 时间戳 | `pubts` | DateTime |
| 204 | `dr` | 逻辑删除标记 | `dr` | Short |
| 205 | `incom_h_define` | 表头自定义项 | `` | 926a9a85-17ab-4015-b62e-950aacabd5de |
| 206 | `qms_qit_incominspectorder_bList` | 检验信息 | `` | 602ac289-2dbc-4c0a-9972-33796c984402 |
| 207 | `qms_qit_incominspectorder_detailresultList1` | 整单明细处理结果 | `` | e1503ddc-d2ce-46f8-b37d-b310747e1742 |
| 208 | `qms_qit_incominspectorder_h_extList` | 检验单扩展表 | `` | 5d0cf232-9de8-4478-b8c7-1e5447b7b573 |
| 209 | `qms_qit_incominspectorder_resultList` | 检验结果 | `` | b8617523-4895-4d63-9586-3a1ba9eafaeb |
| 210 | `qms_qit_incominspectorder_simpleList` | 检验单样本号子表 | `` | e4ba6838-6ddd-466a-b080-efcfeae92712 |
| 211 | `qms_qit_incominspectorder_sourcelistList` | 源单信息 | `` | 6507f2f0-2c04-4704-9c28-117c95d14a51 |
| 212 | `qms_qit_inspectorder_sim_recordList_fixed` | 整单样本记录 | `` | 33e0313e-8870-4bfd-862d-08f6a99ec55a |
| 213 | `submitTime` | 提交时间 | `submit_time` | DateTime |
| 214 | `submitter` | 提交人 | `submitter` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 215 | `withdrawTime` | 撤回提交时间 | `withdraw_time` | DateTime |
| 216 | `withdrawpp` | 撤回提交的人 | `withdrawpp` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |

---

## 关联属性（56个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `pk_purchase_org` | 采购组织id | `org.func.PurchaseOrg` | Service |  |
| 2 | `pk_outsupplier` | 供应商id | `aa.vendor.Vendor` | Service |  |
| 3 | `pk_inspectionplan` | 检验方案id | `QMSDFM.inspectionPlan.inspectionPlan` | Service |  |
| 4 | `modifierId` | 修改人id | `base.user.User` | Service |  |
| 5 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 6 | `pk_purchaser` | 采购员id | `bd.staff.Staff` | Service |  |
| 7 | `incom_h_define` | 表头自定义项 | `QMSQIT.incominspectorder.incom_h_define` | None | true |
| 8 | `salesDept` | 销售部门 | `bd.adminOrg.DeptOrgVO` | Service |  |
| 9 | `pk_org` | 质检组织id | `org.func.QualityOrg` | Service |  |
| 10 | `pk_material` | 物料id | `pc.product.Product` | Service |  |
| 11 | `workCenterId` | 工作中心 | `ed.workcenter.WorkCenter` | Service |  |
| 12 | `pk_test` | 检测依据id | `QMSDFM.detectionbasis.qam_detectionbasis` | Service |  |
| 13 | `frozeState` | 质检冻结状态 | `st.stockStatusRecord.stockStatusRecord` | Service |  |
| 14 | `pk_purchase_dept` | 采购部门id | `bd.adminOrg.DeptOrgVO` | Service |  |
| 15 | `definect_h` | 表头自定义项特征实体 | `QMSQIT.incominspectorder.IncomInspectOrderHDefineCharacter` | None |  |
| 16 | `terminalPerson` | 终止人 | `base.user.User` | Service |  |
| 17 | `reserved_obj` | 跟踪线索 | `st.reservation.Reservation` | Service |  |
| 18 | `inspectionStepConfig` | 检验步骤配置 | `QMSQIT.inspectionstepconfig.InspectionStepConfig` | None |  |
| 19 | `qms_qit_incominspectorder_bList` | 检验信息 | `QMSQIT.incominspectorder.qms_qit_incominspectorder_b` | None | true |
| 20 | `pk_applycheckdept` | 请检部门id | `bd.adminOrg.DeptOrgVO` | Service |  |
| 21 | `pk_applycheckorg` | 请检组织id | `bd.adminOrg.InventoryOrgVO` | Service |  |
| 22 | `samplingUnit` | 取样单位id | `pc.unit.Unit` | Service |  |
| 23 | `castunitid` | 检验单位id | `pc.unit.Unit` | Service |  |
| 24 | `pk_sample` | 取样方式id | `QMSDFM.sampleMethod.sampleMethod` | Service |  |
| 25 | `warehouse` | 仓库 | `aa.warehouse.Warehouse` | Service |  |
| 26 | `cunitid` | 主单位id | `pc.unit.Unit` | Service |  |
| 27 | `stockUnit` | 库存单位 | `pc.unit.Unit` | Service |  |
| 28 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 29 | `orderProcessId` | 工序 | `ed.operation.Operation` | Service |  |
| 30 | `pk_inspectdept` | 检验部门id | `bd.adminOrg.DeptOrgVO` | Service |  |
| 31 | `qms_qit_inspectorder_sim_recordList_fixed` | 整单样本记录 | `QMSQIT.incominspectorder.IncomInspectOrderSimRecordAll` | None | true |
| 32 | `trantype` | 交易类型id | `bd.bill.TransType` | Service |  |
| 33 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
| 34 | `pk_prod_dept` | 生产部门 | `bd.adminOrg.DeptOrgVO` | Service |  |
| 35 | `submitter` | 提交人 | `base.user.BipUser` | Service |  |
| 36 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 37 | `creatorId` | 创建人id | `base.user.User` | Service |  |
| 38 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 39 | `salesOrg` | 销售组织 | `org.func.SalesOrg` | Service |  |
| 40 | `customId` | 客户 | `aa.merchant.Merchant` | Service |  |
| 41 | `pk_materialsku` | 物料skuid | `pc.product.ProductSKU` | Service |  |
| 42 | `qms_qit_incominspectorder_sourcelistList` | 源单信息 | `QMSQIT.incominspectorder.qms_qit_incominspectorder_sourcelist` | None | true |
| 43 | `pk_inspecter` | 检验员id | `bd.staff.Staff` | Service |  |
| 44 | `qms_qit_incominspectorder_resultList` | 检验结果 | `QMSQIT.incominspectorder.qms_qit_incominspectorder_result` | None | true |
| 45 | `freect_h` | 表头自由项特征组实体 | `QMSQIT.incominspectorder.InComInspectFree` | None |  |
| 46 | `withdrawpp` | 撤回提交的人 | `base.user.BipUser` | Service |  |
| 47 | `qms_qit_incominspectorder_detailresultList1` | 整单明细处理结果 | `QMSQIT.incominspectorder.qms_qit_incominspectorder_detailresult_all` | None | true |
| 48 | `qms_qit_incominspectorder_h_extList` | 检验单扩展表 | `QMSQIT.incominspectorder.qms_qit_incominspectorder_h_ext` | None | true |
| 49 | `applyPersonId` | 请检人 | `bd.staff.Staff` | Service |  |
| 50 | `sampleMethodDetailId` | 取样方式主表id | `QMSDFM.sampleMethod.sampleMethodDetail` | Service |  |
| 51 | `checkPlanDetailId` | 检验方案主表id | `QMSDFM.inspectionPlan.inspectionPlanDetail` | Service |  |
| 52 | `factory` | 工厂 | `org.func.BaseOrg` | Service |  |
| 53 | `cargospace` | 货位 | `aa.goodsposition.GoodsPosition` | Service |  |
| 54 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 55 | `checkApplyStStatus` | 请检库存状态 | `st.stockStatusRecord.stockStatusRecord` | Service |  |
| 56 | `qms_qit_incominspectorder_simpleList` | 检验单样本号子表 | `QMSQIT.incominspectorder.qms_qit_incominspectorder_simple` | None | true |
