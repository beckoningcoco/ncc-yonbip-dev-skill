---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.baseinspectorder.qms_qit_baseinspectorder_h"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验单表头公共 (`QMSQIT.baseinspectorder.qms_qit_baseinspectorder_h`)

> QMSQIT | 物理表：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验单表头公共 |
| 物理表 | `` |
| domain/服务域 | `QMS-QIT` |
| schema | `qms_qit_rejectbill` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:45:15.4430` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |
| 编码 | `code` | String | 检验单号 |

---

## 直接属性（137个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `applycheckDate` | 请检日期 | `applycheckDate` | Date |
| 2 | `applycheckbillType` | 检验申请单类型 | `applycheckbillType` | String |
| 3 | `attachmentId` | 附件 | `attachmentId` | String |
| 4 | `auditDate` | 审批日期 | `audit_date` | Date |
| 5 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 6 | `auditor` | 审批人名称 | `auditor` | String |
| 7 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 8 | `billtype` | 检验类型 | `check_type` | String |
| 9 | `busiendDate` | 业务日期止 | `busiendDate` | Date |
| 10 | `busistartDate` | 业务日期起 | `busistartDate` | Date |
| 11 | `castunitid` | 检验单位 | `castunitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 12 | `chastnum` | 改判数量 | `chastnum` | Decimal |
| 13 | `checkPlanDetailId` | 检验方案主表id | `checkPlanDetailId` | cacc3797-7e23-44d9-aad5-ebfe0c680961 |
| 14 | `checkrule` | 检验规则 | `checkrule` | Short |
| 15 | `chnum` | 改判主数量 | `chnum` | Decimal |
| 16 | `chrate` | 改判率(%) | `chrate` | Decimal |
| 17 | `code` | 检验单号 | `code` | String |
| 18 | `combinecheck` | 合并检验 | `combinecheck` | Boolean |
| 19 | `createDate` | 创建日期 | `create_date` | Date |
| 20 | `createTime` | 创建时间 | `create_time` | DateTime |
| 21 | `creator` | 创建人名称 | `creator` | String |
| 22 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 23 | `cunitid` | 主单位 | `cunitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 24 | `currentStage` | 当前检验阶段 | `currentStage` | String |
| 25 | `define1` | 自定义项1 | `define1` | String |
| 26 | `define10` | 自定义项10 | `define10` | String |
| 27 | `define11` | 自定义项11 | `define11` | String |
| 28 | `define12` | 自定义项12 | `define12` | String |
| 29 | `define13` | 自定义项13 | `define13` | String |
| 30 | `define14` | 自定义项14 | `define14` | String |
| 31 | `define15` | 自定义项15 | `define15` | String |
| 32 | `define16` | 自定义项16 | `define16` | String |
| 33 | `define17` | 自定义项17 | `define17` | String |
| 34 | `define18` | 自定义项18 | `define18` | String |
| 35 | `define19` | 自定义项19 | `define19` | String |
| 36 | `define2` | 自定义项2 | `define2` | String |
| 37 | `define20` | 自定义项20 | `define20` | String |
| 38 | `define21` | 自定义项21 | `define21` | String |
| 39 | `define22` | 自定义项22 | `define22` | String |
| 40 | `define23` | 自定义项23 | `define23` | String |
| 41 | `define24` | 自定义项24 | `define24` | String |
| 42 | `define25` | 自定义项25 | `define25` | String |
| 43 | `define26` | 自定义项26 | `define26` | String |
| 44 | `define27` | 自定义项27 | `define27` | String |
| 45 | `define28` | 自定义项28 | `define28` | String |
| 46 | `define29` | 自定义项29 | `define29` | String |
| 47 | `define3` | 自定义项3 | `define3` | String |
| 48 | `define30` | 自定义项30 | `define30` | String |
| 49 | `define4` | 自定义项4 | `define4` | String |
| 50 | `define5` | 自定义项5 | `define5` | String |
| 51 | `define6` | 自定义项6 | `define6` | String |
| 52 | `define7` | 自定义项7 | `define7` | String |
| 53 | `define8` | 自定义项8 | `define8` | String |
| 54 | `define9` | 自定义项9 | `define9` | String |
| 55 | `directPrintCount` | 直接打印次数 | `directPrintCount` | Integer |
| 56 | `dr` | 逻辑删除标记 | `dr` | Short |
| 57 | `firstStoredDate` | 首次 入库日期 | `firstStoredDate` | DateTime |
| 58 | `free1` | 规格1 | `free1` | String |
| 59 | `free10` | 规格10 | `free10` | String |
| 60 | `free2` | 规格2 | `free2` | String |
| 61 | `free3` | 规格3 | `free3` | String |
| 62 | `free4` | 规格4 | `free4` | String |
| 63 | `free5` | 规格5 | `free5` | String |
| 64 | `free6` | 规格6 | `free6` | String |
| 65 | `free7` | 规格7 | `free7` | String |
| 66 | `free8` | 规格8 | `free8` | String |
| 67 | `free9` | 规格9 | `free9` | String |
| 68 | `id` | ID | `id` | String |
| 69 | `initinspectorder_code` | 初始检验单号 | `initinspectorder_code` | String |
| 70 | `initinspectorder_id` | 初始检验单ID | `initinspectorder_id` | String |
| 71 | `inspectDate` | 检验日期 | `inspectDate` | Date |
| 72 | `inspectResult` | 检验结果 | `inspectResult` | String |
| 73 | `inspectRule` | 检验规则 | `inspectRule` | String |
| 74 | `inspectastnum` | 检验数量 | `inspectastnum` | Decimal |
| 75 | `inspectionplanMethod` | 检验方案质量等级 | `inspectionplanMethod` | String |
| 76 | `inspectionplanSingle` | 是否单一取样 | `inspectionplanSingle` | Boolean |
| 77 | `inspectionplanVersion` | 检验方案版本 | `inspectionplanVersion` | String |
| 78 | `inspectnum` | 检验主数量 | `inspectnum` | Decimal |
| 79 | `invaliddate` | 有效期 | `invaliddate` | DateTime |
| 80 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 81 | `manufacture_date` | 生产日期 | `manufacture_date` | DateTime |
| 82 | `modifier` | 修改人名称 | `modifier` | String |
| 83 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 84 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 85 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 86 | `note` | 备注 | `note` | String |
| 87 | `nqastnum` | 不合格数量 | `nqastnum` | Decimal |
| 88 | `nqnum` | 不合格主数量 | `nqnum` | Decimal |
| 89 | `orderbilltype` | 请检源头单据类型 | `orderbilltype` | String |
| 90 | `pk_applycheck` | 检验申请单id | `pk_applycheck` | String |
| 91 | `pk_batchcode` | 批次号 | `pk_batchcode` | String |
| 92 | `pk_busiperiod` | 业务期间 | `pk_busiperiod` | String |
| 93 | `pk_inspectionplan` | 检验方案 | `pk_inspectionplan` | 14bcdfef-7982-4772-baf8-e0d6ebef507e |
| 94 | `pk_materialsku` | 物料sku | `pk_materialsku` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 95 | `pk_orderbill` | 请检源头单据id | `pk_orderbill` | String |
| 96 | `pk_sample` | 取样方式 | `pk_sample` | d21eaba0-3431-4238-b178-c6216a31b34b |
| 97 | `pk_sourcebill` | 请检来源单据id | `pk_sourcebill` | String |
| 98 | `pk_sourcebill_b` | 请检来源单据行id | `pk_sourcebill_b` | String |
| 99 | `pk_storageunit` | 保质期单位(废弃) | `pk_storageunit` | String |
| 100 | `pk_test` | 检测依据 | `pk_test` | f0529fa3-5e4b-444a-8212-716743519d68 |
| 101 | `previewPrintCount` | 预览打印次数 | `previewPrintCount` | Integer |
| 102 | `printCount` | 打印次数 | `printCount` | Integer |
| 103 | `producedate` | 生产日期(废弃) | `producedate` | DateTime |
| 104 | `pubts` | 时间戳 | `pubts` | DateTime |
| 105 | `qastnum` | 合格数量 | `qastnum` | Decimal |
| 106 | `qms_qit_baseinspectorder_b` | 检验单检验项目公共 | `` | a1b81a14-9291-44cb-8043-cf3dc2508233 |
| 107 | `qms_qit_baseinspectorder_sourcelistList` | 检验单源单信息公共 | `` | 571e7669-96cf-4825-8491-42a5fd1d8a4d |
| 108 | `qnum` | 合格主数量 | `qnum` | Decimal |
| 109 | `qrate` | 合格率(%) | `qrate` | Decimal |
| 110 | `recheck` | 复检 | `recheck` | Boolean |
| 111 | `returncount` | 退回次数 | `returncount` | Short |
| 112 | `rnote` | 备注 | `rnote` | String |
| 113 | `samnum` | 样本合格数 | `samnum` | Decimal |
| 114 | `sourcebilltype` | 请检来源单据类型 | `sourcebilltype` | String |
| 115 | `sourcerowno` | 请检来源单据行号 | `sourcerowno` | String |
| 116 | `spotchekastnum` | 抽检件数 | `spotchekastnum` | Decimal |
| 117 | `spotcheknum` | 抽检主数量 | `spotcheknum` | Decimal |
| 118 | `status` | 单据状态 | `status` | Short |
| 119 | `storage` | 保质期(废弃) | `storage` | String |
| 120 | `tenant` | 租户ID | `tenant_id` | String |
| 121 | `tplid` | 模板id | `tplid` | Long |
| 122 | `unitExchangeType` | 固定换算率 | `unitExchangeType` | Integer |
| 123 | `unsamnum` | 样本不合格数 | `unsamnum` | Decimal |
| 124 | `validityDate` | 有效期至 | `validityDate` | Date |
| 125 | `vapplycheckcode` | 检验申请单号 | `vapplycheckcode` | String |
| 126 | `vbaditemcode` | 不良品处理单号 | `vbaditemcode` | String |
| 127 | `vbillcode` | 检验单号 | `vbillcode` | String |
| 128 | `vchangerate` | 换算率 | `vchangerate` | String |
| 129 | `verifystate` | 审批状态 | `verifystate` | Short |
| 130 | `version` | 版本号 | `version` | String |
| 131 | `vordercode` | 请检源头单据号 | `vordercode` | String |
| 132 | `vorderrowno` | 请检源头单据行号 | `vorderrowno` | String |
| 133 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 134 | `vsourcecode` | 请检来源单据号 | `vsourcecode` | String |
| 135 | `warranty_date` | 保质期 | `warranty_date` | Integer |
| 136 | `warranty_unit` | 保质期单位 | `warranty_unit` | Short |
| 137 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（13个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `pk_inspectionplan` | 检验方案 | `QMSDFM.inspectionPlan.inspectionPlan` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `castunitid` | 检验单位 | `pc.unit.Unit` | Service |  |
| 6 | `pk_sample` | 取样方式 | `QMSDFM.sampleMethod.sampleMethod` | Service |  |
| 7 | `cunitid` | 主单位 | `pc.unit.Unit` | Service |  |
| 8 | `qms_qit_baseinspectorder_sourcelistList` | 检验单源单信息公共 | `QMSQIT.baseinspectorder.qms_qit_baseinspectorder_sourcelist` | None | true |
| 9 | `pk_materialsku` | 物料sku | `pc.product.ProductSKU` | Service |  |
| 10 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 11 | `pk_test` | 检测依据 | `QMSDFM.detectionbasis.qam_detectionbasis` | Service |  |
| 12 | `qms_qit_baseinspectorder_b` | 检验单检验项目公共 | `QMSQIT.baseinspectorder.qms_qit_baseinspectorder_b` | None | true |
| 13 | `checkPlanDetailId` | 检验方案主表id | `QMSDFM.inspectionPlan.inspectionPlanDetail` | Service |  |
