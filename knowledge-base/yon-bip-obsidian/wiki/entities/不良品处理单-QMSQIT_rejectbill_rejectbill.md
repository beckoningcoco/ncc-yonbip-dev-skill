---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.rejectbill.rejectbill"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 不良品处理单 (`QMSQIT.rejectbill.rejectbill`)

> QMSQIT | 物理表：`qms_qit_rejectbill`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 不良品处理单 |
| 物理表 | `qms_qit_rejectbill` |
| 数据库 schema | `QMS-QIT` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:42:04.9270` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |
| 编码 | `code` | String | 不良品处理单号 |

---

## 直接属性（168个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `tenant` | 租户ID | `tenant_id` | String |
| 3 | `id` | ID | `id` | String |
| 4 | `pk_org` | 质检组织id | `pk_org` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 5 | `code` | 不良品处理单号 | `code` | String |
| 6 | `vtranstypeid` | 交易类型id | `vtranstypeid` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 7 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 8 | `autoFreezeInventory` | 自动冻结库存 | `auto_freeze_inventory` | Boolean |
| 9 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 10 | `checkApplyStStatus` | 请检库存状态 | `checkapply_ststatus` | 5275f074-3e60-4b90-9771-20970f1e905c |
| 11 | `customId` | 客户 | `custom_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 12 | `directPrintCount` | 直接打印次数 | `directPrintCount` | Integer |
| 13 | `inspectionrule` | 检验规则 | `inspectionrule` | String |
| 14 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean |
| 15 | `previewPrintCount` | 预览打印次数 | `previewPrintCount` | Integer |
| 16 | `printCount` | 打印次数 | `printCount` | Integer |
| 17 | `salesDept` | 销售部门 | `sales_dept` | ca871996-b447-42f9-8dac-dd7c21ee0662 |
| 18 | `salesOrg` | 销售组织 | `sales_org` | 4991976e-11ee-406e-bdbb-0f73f9f89ff2 |
| 19 | `qty` | 到货数量 | `qty` | Decimal |
| 20 | `applyPersonId` | 请检人 | `applyPersonId` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 21 | `frozeState` | 质检冻结状态 | `frozeState` | 5275f074-3e60-4b90-9771-20970f1e905c |
| 22 | `orderprocessno` | 工序顺序号 | `orderprocessno` | String |
| 23 | `sn` | 序列号 | `sn` | String |
| 24 | `sourceOrderId` | 请检来源订单id | `source_order_id` | Long |
| 25 | `sourceOrderRowId` | 请检来源订单行id | `source_order_row_id` | Long |
| 26 | `single_inspection` | 单件检验 | `single_inspection` | Boolean |
| 27 | `pk_checkapply_code` | 检验申请编码 | `pk_checkapply_code` | String |
| 28 | `productionType` | 产出类型 | `productionType` | String |
| 29 | `factory` | 工厂 | `factory` | 14302233-1394-4a70-94e1-bed51636f312 |
| 30 | `isExternalSource` | 是否外部请检 | `is_external_source` | Short |
| 31 | `inspectionStepConfig` | 检验步骤配置 | `inspection_step_config` | d793bf8a-3e9f-444b-a8ac-5f95511b2a46 |
| 32 | `isSnManage` | 序列号管理 | `is_sn_manage` | Short |
| 33 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 34 | `sourceOrderType` | 请检来源订单类型 | `source_order_type` | String |
| 35 | `sourceOrderCode` | 请检来源订单号 | `source_order_code` | String |
| 36 | `sourceOrderLineNo` | 请检来源订单行号 | `source_order_line_no` | Decimal |
| 37 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 38 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 39 | `pk_inspecter` | 检验员 | `pk_inspecter` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 40 | `pk_orderprocess` | 工序 | `pk_orderprocess` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 41 | `pk_prod_dept` | 生产部门 | `pk_prod_dept` | ca871996-b447-42f9-8dac-dd7c21ee0662 |
| 42 | `pk_prodbatch` | 生产批次 | `pk_prodbatch` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 43 | `pk_workcenter` | 工作中心 | `pk_workcenter` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 44 | `rack` | 货位 | `rack` | 79b90356-9fc7-4bc2-ac1a-400520fa80cc |
| 45 | `reservedobj` | 跟踪线索 | `reservedobj` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 46 | `vprodbatchcode` | 生产批次号 | `vprodbatchcode` | String |
| 47 | `warehouse` | 仓库 | `warehouse` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 48 | `createDate` | 创建日期 | `create_date` | Date |
| 49 | `definect_h` | 表头自定义项特征实体 | `definect_h` | d1902f21-5f5a-4916-8bc2-b49686221cf6 |
| 50 | `freect_h` | 表头自由项特征组实体 | `freect_h` | 2c8c3172-87c1-4820-ad24-5bb8d3197b99 |
| 51 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 52 | `tplid` | 模板id | `tplid` | Long |
| 53 | `createTime` | 创建时间 | `create_time` | DateTime |
| 54 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 55 | `status` | 单据状态 | `status` | Short |
| 56 | `vbillcode` | 不良品处理单号 | `vbillcode` | String |
| 57 | `verifystate` | 审批状态 | `verifystate` | Short |
| 58 | `inspectiontype` | 检验类型 | `inspectiontype` | String |
| 59 | `processdate` | 不良品处理日期 | `processdate` | Date |
| 60 | `inspectorderno` | 检验单号 | `inspectorderno` | String |
| 61 | `inspectdate` | 检验日期 | `inspectdate` | Date |
| 62 | `pk_material` | 物料id | `pk_material` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 63 | `pk_sku` | 物料SKU编码ID | `pk_sku` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 64 | `manufacturedate` | 生产日期 | `manufacturedate` | DateTime |
| 65 | `vbatchcode` | 批次号 | `vbatchcode` | String |
| 66 | `expiredno` | 保质期 | `expiredno` | Integer |
| 67 | `validatedate` | 有效期至 | `validatedate` | Date |
| 68 | `astunitid` | 检验单位id | `astunitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 69 | `expiredunit` | 保质期单位 | `expiredunit` | Short |
| 70 | `vchangerate` | 换算率 | `vchangerate` | String |
| 71 | `unitid` | 主单位id | `unitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 72 | `applyastnum` | 检验件数 | `applyastnum` | Decimal |
| 73 | `applynum` | 检验数量 | `applynum` | Decimal |
| 74 | `pk_inspect_plan` | 检验方案id | `pk_inspect_plan` | 14bcdfef-7982-4772-baf8-e0d6ebef507e |
| 75 | `unprocessastnum` | 待不良品处理件数 | `unprocessastnum` | Decimal |
| 76 | `unprocessnum` | 待不良品处理数量 | `unprocessnum` | Decimal |
| 77 | `pk_inspect_dept` | 检验部门id | `pk_inspect_dept` | ca871996-b447-42f9-8dac-dd7c21ee0662 |
| 78 | `pk_apply_org` | 请检组织id | `pk_apply_org` | 14302233-1394-4a70-94e1-bed51636f312 |
| 79 | `pk_apply_dept` | 请检部门id | `pk_apply_dept` | ca871996-b447-42f9-8dac-dd7c21ee0662 |
| 80 | `pk_pu_org` | 采购组织id | `pk_pu_org` | a4916c85-f087-4e87-a178-0ad37aff7cd0 |
| 81 | `pk_supplier` | 供应商id | `pk_supplier` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 82 | `pk_pu_dept` | 采购部门id | `pk_pu_dept` | ca871996-b447-42f9-8dac-dd7c21ee0662 |
| 83 | `combine` | 合并检验 | `combine` | Boolean |
| 84 | `ordercode` | 请检源头单据号 | `ordercode` | String |
| 85 | `orderrowno` | 请检源头单据行号 | `orderrowno` | String |
| 86 | `pk_order` | 请检源头单据 | `pk_order` | String |
| 87 | `pk_order_billtype` | 请检源头单据类型 | `pk_order_billtype` | String |
| 88 | `pk_order_b` | 请检源头单据行 | `pk_order_b` | String |
| 89 | `vsrctype` | 请检来源单据类型 | `vsrctype` | String |
| 90 | `vsrccode` | 请检来源单据号 | `vsrccode` | String |
| 91 | `vsrcid` | 请检来源单据 | `vsrcid` | String |
| 92 | `vsrcrowno` | 请检来源单据行号 | `vsrcrowno` | String |
| 93 | `vsrcbid` | 请检来源单据行 | `vsrcbid` | String |
| 94 | `busiperiod` | 业务期间 | `busiperiod` | String |
| 95 | `rejectnote` | 不良品情况说明 | `rejectnote` | String |
| 96 | `note` | 备注 | `note` | String |
| 97 | `pk_inspectorder` | 检验单 | `pk_inspectorder` | String |
| 98 | `returncount` | 退回次数 | `returncount` | Short |
| 99 | `pubts` | 时间戳 | `pubts` | DateTime |
| 100 | `dr` | 逻辑删除标记 | `dr` | Short |
| 101 | `initinspectorder_code` | 初始检验单号 | `initinspectorder_code` | String |
| 102 | `initinspectorder_id` | 初始检验单ID | `initinspectorder_id` | String |
| 103 | `pk_inspect_plandetail` | 检验方案主表id | `pk_inspect_plandetail` | cacc3797-7e23-44d9-aad5-ebfe0c680961 |
| 104 | `pk_checkapply` | 检验申请 | `pk_checkapply` | String |
| 105 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 106 | `auditor` | 审核人 | `auditor` | String |
| 107 | `auditTime` | 审核时间 | `audit_time` | DateTime |
| 108 | `modifier` | 修改人id | `modifier` | String |
| 109 | `creator` | 创建人id | `creator` | String |
| 110 | `auditorId` | 审核人id | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 111 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 112 | `source` | 来源单据类型 | `source` | String |
| 113 | `upcode` | 来源单据号 | `upcode` | String |
| 114 | `sourceid` | 来源单据ID | `sourceid` | Long |
| 115 | `define1` | 批次属性1 | `define1` | String |
| 116 | `define6` | 批次属性6 | `define6` | String |
| 117 | `define15` | 批次属性15 | `define15` | String |
| 118 | `define28` | 批次属性28 | `define28` | String |
| 119 | `define2` | 批次属性2 | `define2` | String |
| 120 | `define7` | 批次属性7 | `define7` | String |
| 121 | `define16` | 批次属性16 | `define16` | String |
| 122 | `define27` | 批次属性27 | `define27` | String |
| 123 | `define3` | 批次属性3 | `define3` | String |
| 124 | `define8` | 批次属性8 | `define8` | String |
| 125 | `define17` | 批次属性17 | `define17` | String |
| 126 | `define26` | 批次属性26 | `define26` | String |
| 127 | `define4` | 批次属性4 | `define4` | String |
| 128 | `define9` | 批次属性9 | `define9` | String |
| 129 | `define18` | 批次属性18 | `define18` | String |
| 130 | `define25` | 批次属性25 | `define25` | String |
| 131 | `define5` | 批次属性5 | `define5` | String |
| 132 | `creatorId` | 创建人id | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 133 | `define10` | 批次属性10 | `define10` | String |
| 134 | `define19` | 批次属性19 | `define19` | String |
| 135 | `define11` | 批次属性11 | `define11` | String |
| 136 | `define20` | 批次属性20 | `define20` | String |
| 137 | `modifierId` | 修改人id | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 138 | `define12` | 批次属性12 | `define12` | String |
| 139 | `define21` | 批次属性21 | `define21` | String |
| 140 | `define30` | 批次属性30 | `define30` | String |
| 141 | `define13` | 批次属性13 | `define13` | String |
| 142 | `define22` | 批次属性22 | `define22` | String |
| 143 | `define29` | 批次属性29 | `define29` | String |
| 144 | `define14` | 批次属性14 | `define14` | String |
| 145 | `define23` | 批次属性23 | `define23` | String |
| 146 | `define24` | 批次属性24 | `define24` | String |
| 147 | `sourceMainPubts` | 来源时间戳 | `sourceMainPubts` | DateTime |
| 148 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 149 | `free2` | 规格2 | `free2` | String |
| 150 | `free3` | 规格3 | `free3` | String |
| 151 | `free1` | 规格1 | `free1` | String |
| 152 | `free6` | 规格6 | `free6` | String |
| 153 | `free7` | 规格7 | `free7` | String |
| 154 | `free4` | 规格4 | `free4` | String |
| 155 | `free5` | 规格5 | `free5` | String |
| 156 | `free8` | 规格8 | `free8` | String |
| 157 | `free9` | 规格9 | `free9` | String |
| 158 | `free10` | 规格10 | `free10` | String |
| 159 | `auditDate` | 审批日期 | `audit_date` | Date |
| 160 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 161 | `defineh` | 不良品处理单自定义项 | `` | 740c9821-6b2d-471d-9ff9-2216f700d182 |
| 162 | `rejectbillExtList` | 不良品处理单扩展表 | `` | 4a35c1dd-ab26-406a-b1a5-372fae04a5ec |
| 163 | `rejectbillb` | 不良品处理单明细 | `` | 023ed51f-3fe4-4641-84b2-6be1031b2681 |
| 164 | `spectb` | 不良品检验信息 | `` | 1c7b905c-d1c8-4402-8a95-ebcf67b69c8c |
| 165 | `submitTime` | 提交时间 | `submit_time` | DateTime |
| 166 | `submitter` | 提交人 | `submitter` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 167 | `withdrawTime` | 撤回提交时间 | `withdraw_time` | DateTime |
| 168 | `withdrawpp` | 撤回提交的人 | `withdrawpp` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |

---

## 关联属性（46个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `pk_prod_dept` | 生产部门 | `bd.adminOrg.DeptOrgVO` | Service |  |
| 2 | `submitter` | 提交人 | `base.user.BipUser` | Service |  |
| 3 | `rejectbillExtList` | 不良品处理单扩展表 | `QMSQIT.rejectbill.rejectbillExt` | None | true |
| 4 | `pk_apply_dept` | 请检部门id | `bd.adminOrg.DeptOrgVO` | Service |  |
| 5 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 6 | `pk_inspect_dept` | 检验部门id | `bd.adminOrg.DeptOrgVO` | Service |  |
| 7 | `creatorId` | 创建人id | `base.user.User` | Service |  |
| 8 | `modifierId` | 修改人id | `base.user.User` | Service |  |
| 9 | `reservedobj` | 跟踪线索 | `st.reservation.Reservation` | Service |  |
| 10 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 11 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 12 | `salesOrg` | 销售组织 | `org.func.SalesOrg` | Service |  |
| 13 | `customId` | 客户 | `aa.merchant.Merchant` | Service |  |
| 14 | `salesDept` | 销售部门 | `bd.adminOrg.DeptOrgVO` | Service |  |
| 15 | `pk_org` | 质检组织id | `org.func.QualityOrg` | Service |  |
| 16 | `pk_inspecter` | 检验员 | `bd.staff.Staff` | Service |  |
| 17 | `pk_supplier` | 供应商id | `aa.vendor.Vendor` | Service |  |
| 18 | `pk_apply_org` | 请检组织id | `org.func.BaseOrg` | Service |  |
| 19 | `pk_material` | 物料id | `pc.product.Product` | Service |  |
| 20 | `freect_h` | 表头自由项特征组实体 | `QMSQIT.rejectbill.rejectbillFree` | None |  |
| 21 | `pk_pu_org` | 采购组织id | `org.func.PurchaseOrg` | Service |  |
| 22 | `withdrawpp` | 撤回提交的人 | `base.user.BipUser` | Service |  |
| 23 | `pk_orderprocess` | 工序 | `ed.operation.Operation` | Service |  |
| 24 | `applyPersonId` | 请检人 | `bd.staff.Staff` | Service |  |
| 25 | `pk_inspect_plan` | 检验方案id | `QMSDFM.inspectionPlan.inspectionPlan` | Service |  |
| 26 | `defineh` | 不良品处理单自定义项 | `QMSQIT.rejectbill.hdef` | None | true |
| 27 | `frozeState` | 质检冻结状态 | `st.stockStatusRecord.stockStatusRecord` | Service |  |
| 28 | `definect_h` | 表头自定义项特征实体 | `QMSQIT.rejectbill.RejectbillDefineCharacter` | None |  |
| 29 | `pk_inspect_plandetail` | 检验方案主表id | `QMSDFM.inspectionPlan.inspectionPlanDetail` | Service |  |
| 30 | `pk_workcenter` | 工作中心 | `ed.workcenter.WorkCenter` | Service |  |
| 31 | `factory` | 工厂 | `org.func.BaseOrg` | Service |  |
| 32 | `rack` | 货位 | `aa.goodsposition.GoodsPosition` | Service |  |
| 33 | `inspectionStepConfig` | 检验步骤配置 | `QMSQIT.inspectionstepconfig.InspectionStepConfig` | None |  |
| 34 | `vtranstypeid` | 交易类型id | `bd.bill.TransType` | Service |  |
| 35 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 36 | `warehouse` | 仓库 | `aa.warehouse.Warehouse` | Service |  |
| 37 | `pk_pu_dept` | 采购部门id | `bd.adminOrg.DeptOrgVO` | Service |  |
| 38 | `pk_prodbatch` | 生产批次 | `st.batchno.Batchno` | Service |  |
| 39 | `astunitid` | 检验单位id | `pc.unit.Unit` | Service |  |
| 40 | `auditorId` | 审核人id | `base.user.User` | Service |  |
| 41 | `rejectbillb` | 不良品处理单明细 | `QMSQIT.rejectbill.rejectbill_b` | None | true |
| 42 | `checkApplyStStatus` | 请检库存状态 | `st.stockStatusRecord.stockStatusRecord` | Service |  |
| 43 | `pk_sku` | 物料SKU编码ID | `pc.product.ProductSKU` | Service |  |
| 44 | `unitid` | 主单位id | `pc.unit.Unit` | Service |  |
| 45 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
| 46 | `spectb` | 不良品检验信息 | `QMSQIT.rejectbill.bspec` | None | true |
