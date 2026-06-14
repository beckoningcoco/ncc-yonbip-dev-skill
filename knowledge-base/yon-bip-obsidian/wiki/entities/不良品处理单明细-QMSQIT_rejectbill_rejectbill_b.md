---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.rejectbill.rejectbill_b"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 不良品处理单明细 (`QMSQIT.rejectbill.rejectbill_b`)

> QMSQIT | 物理表：`qms_qit_rejectbill_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 不良品处理单明细 |
| 物理表 | `qms_qit_rejectbill_detail` |
| domain/服务域 | `QMS-QIT` |
| schema | `qms_qit_rejectbill` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:43:35.1520` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（132个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `tenant` | 租户ID | `tenant_id` | String |
| 3 | `id` | ID | `id` | String |
| 4 | `pk_org` | 质检组织id | `pk_org` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 5 | `pk_material_h` | 判定物料 | `pk_material_h` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 6 | `pk_rejectbill` | 不良品处理单表头id | `pk_rejectbill` | 41f6d3f3-61a7-4bfd-a749-fc8d48b9f4e7 |
| 7 | `qualityGrade` | 质量记分 | `quality_grade` | Decimal |
| 8 | `checkSubNumber` | 库存件数 | `checkSubNumber` | Decimal |
| 9 | `exchangeRate` | 库存换算率 | `exchangeRate` | Decimal |
| 10 | `pk_badreason` | 不良原因 | `pk_badreason` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 11 | `pk_reworkprocess` | 建议返工工序 | `pk_reworkprocess` | Long |
| 12 | `pk_scrapprocess` | 责任工序 | `pk_scrapprocess` | Long |
| 13 | `stockUnit` | 库存单位 | `stockUnit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 14 | `definect_b` | 来料不良品处理单明细自定义项 | `definect_b` | 22a0bba2-fcc4-4c00-9ea2-12e4477cc1e2 |
| 15 | `freect_b` | 表体物料自由项特征组实体 | `freect_b` | 2f5f12b7-8585-406f-8e23-1ff61f916d98 |
| 16 | `freect_bchg` | 表体改判物料自由项特征组实体 | `freect_bchg` | 98bafe4a-a3d8-4d99-ac3e-27b78adaf6ee |
| 17 | `sourceOrderId` | 请检来源订单id | `source_order_id` | Long |
| 18 | `sourceOrderRowId` | 请检来源订单行id | `source_order_row_id` | Long |
| 19 | `sourceOrderType` | 请检来源订单类型 | `source_order_type` | String |
| 20 | `sourceOrderCode` | 请检来源订单号 | `source_order_code` | String |
| 21 | `sourceOrderLineNo` | 请检来源订单行号 | `source_order_line_no` | Decimal |
| 22 | `pk_sku_h` | 判定物料SKU | `pk_sku_h` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 23 | `combine` | 合并检验 | `combine` | Boolean |
| 24 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 25 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 26 | `source` | 上游单据类型 | `source` | String |
| 27 | `upcode` | 上游单据号 | `upcode` | String |
| 28 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 29 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 30 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 31 | `pk_baditem` | 检验单不良项目 | `pk_baditem` | 3de0c23e-ee02-46b4-bae7-0a982de498ce |
| 32 | `pk_judgebaditem` | 判定不良项目 | `pk_judgebaditem` | 3de0c23e-ee02-46b4-bae7-0a982de498ce |
| 33 | `rejectastnum` | 检验单不良件数 | `rejectastnum` | Decimal |
| 34 | `rejectnum` | 检验单不良数量 | `rejectnum` | Decimal |
| 35 | `pk_suggprocess` | 检验单处理方式id | `pk_suggprocess` | 4406ea9f-9ed2-49d2-af46-8af10cca2b1a |
| 36 | `pk_qualitylv` | 检验单质量等级id | `pk_qualitylv` | 8a7f6d68-6241-4364-be90-2b4b3d57e135 |
| 37 | `noteb` | 检验单备注 | `noteb` | String |
| 38 | `fprocessjudge` | 处理方式判定id | `fprocessjudge` | 4406ea9f-9ed2-49d2-af46-8af10cca2b1a |
| 39 | `qualitylvjudge` | 质量等级判定id | `qualitylvjudge` | 8a7f6d68-6241-4364-be90-2b4b3d57e135 |
| 40 | `party_responsible` | 责任方 | `party_responsible` | String |
| 41 | `is_storage` | 是否可入库 | `is_storage` | String |
| 42 | `judgeastnum` | 判定件数 | `judgeastnum` | Decimal |
| 43 | `judgenum` | 判定数量 | `judgenum` | Decimal |
| 44 | `finaljudge` | 最终判定结果 | `finaljudge` | String |
| 45 | `pk_chargedept` | 责任部门id | `pk_chargedept` | ca871996-b447-42f9-8dac-dd7c21ee0662 |
| 46 | `pk_chargepsn` | 责任人id | `pk_chargepsn` | 78bff1de-ddf1-4814-90de-b0b5f1eac78a |
| 47 | `pk_chgmrl` | 改判物料id | `pk_chgmrl` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 48 | `pk_chgsku` | 改判物料SKU编码id | `pk_chgsku` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 49 | `pk_instockbatch` | 入库批次 | `pk_instockbatch` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 50 | `instockbatchcode` | 入库批次号 | `instockbatchcode` | String |
| 51 | `qualitynum` | 保质期 | `qualitynum` | String |
| 52 | `qualityunit` | 保质期单位 | `qualityunit` | Short |
| 53 | `validatedate` | 有效期至 | `validatedate` | Date |
| 54 | `resultid` | 检验结果行ID | `resultid` | String |
| 55 | `resultbid` | 检验结果明细行ID | `resultbid` | String |
| 56 | `pubts` | 时间戳 | `pubts` | DateTime |
| 57 | `dr` | 逻辑删除标记 | `dr` | Short |
| 58 | `free5` | 物料规格5 | `free5` | String |
| 59 | `free6` | 物料规格6 | `free6` | String |
| 60 | `free3` | 物料规格3 | `free3` | String |
| 61 | `free9` | 物料规格9 | `free9` | String |
| 62 | `free4` | 物料规格4 | `free4` | String |
| 63 | `free10` | 物料规格10 | `free10` | String |
| 64 | `free1` | 物料规格1 | `free1` | String |
| 65 | `free7` | 物料规格7 | `free7` | String |
| 66 | `free2` | 物料规格2 | `free2` | String |
| 67 | `free8` | 物料规格8 | `free8` | String |
| 68 | `unitid` | 主单位 | `unitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 69 | `astunitid` | 单位 | `astunitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 70 | `changeType` | 换算方式 | `changeType` | String |
| 71 | `vchangerate` | 换算率 | `vchangerate` | String |
| 72 | `define1` | 批次号属性1 | `define1` | String |
| 73 | `define4` | 批次号属性4 | `define4` | String |
| 74 | `define9` | 批次号属性9 | `define9` | String |
| 75 | `define2` | 批次号属性2 | `define2` | String |
| 76 | `define5` | 批次号属性5 | `define5` | String |
| 77 | `define3` | 批次号属性3 | `define3` | String |
| 78 | `define6` | 批次号属性6 | `define6` | String |
| 79 | `define7` | 批次号属性7 | `define7` | String |
| 80 | `define8` | 批次号属性8 | `define8` | String |
| 81 | `define21` | 批次号属性21 | `define21` | String |
| 82 | `define12` | 批次号属性12 | `define12` | String |
| 83 | `define14` | 批次号属性14 | `define14` | String |
| 84 | `define18` | 批次号属性18 | `define18` | String |
| 85 | `define23` | 批次号属性23 | `define23` | String |
| 86 | `define26` | 批次号属性26 | `define26` | String |
| 87 | `define30` | 批次号属性30 | `define30` | String |
| 88 | `define13` | 批次号属性13 | `define13` | String |
| 89 | `define17` | 批次号属性17 | `define17` | String |
| 90 | `define22` | 批次号属性22 | `define22` | String |
| 91 | `define27` | 批次号属性27 | `define27` | String |
| 92 | `define10` | 批次号属性10 | `define10` | String |
| 93 | `define16` | 批次号属性16 | `define16` | String |
| 94 | `define20` | 批次号属性20 | `define20` | String |
| 95 | `define25` | 批次号属性25 | `define25` | String |
| 96 | `define28` | 批次号属性28 | `define28` | String |
| 97 | `define11` | 批次号属性11 | `define11` | String |
| 98 | `define15` | 批次号属性15 | `define15` | String |
| 99 | `define19` | 批次号属性19 | `define19` | String |
| 100 | `define24` | 批次号属性24 | `define24` | String |
| 101 | `define29` | 批次号属性29 | `define29` | String |
| 102 | `state` | 库存状态ID | `state` | 5275f074-3e60-4b90-9771-20970f1e905c |
| 103 | `ordercode` | 请检源头单据号 | `ordercode` | String |
| 104 | `orderrowno` | 请检源头单据行号 | `orderrowno` | String |
| 105 | `pk_order` | 请检源头单据 | `pk_order` | String |
| 106 | `pk_order_billtype` | 请检源头单据类型 | `pk_order_billtype` | String |
| 107 | `pk_order_b` | 请检源头单据行 | `pk_order_b` | String |
| 108 | `vsrctype` | 请检来源单据类型 | `vsrctype` | String |
| 109 | `vsrccode` | 请检来源单据号 | `vsrccode` | String |
| 110 | `vsrcid` | 请检来源单据 | `vsrcid` | String |
| 111 | `vsrcrowno` | 请检来源单据行号 | `vsrcrowno` | String |
| 112 | `vsrcbid` | 请检来源单据行 | `vsrcbid` | String |
| 113 | `busidate` | 业务期间 | `busidate` | DateTime |
| 114 | `producedate` | 生产日期 | `producedate` | DateTime |
| 115 | `firstStoredDate` | 首次入库日期 | `firstStoredDate` | DateTime |
| 116 | `invaliddate` | 有效期 | `invaliddate` | DateTime |
| 117 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 118 | `cargospaceId` | 货位id | `cargospace_id` | 79b90356-9fc7-4bc2-ac1a-400520fa80cc |
| 119 | `defineb` | 不良品处理单明细自定义项 | `` | 7fefdc00-f5c0-4b6a-bb26-9b25cfca93ec |
| 120 | `detailSnList` | 序列号信息 | `` | 54731d9a-1bb4-4d93-8c25-bd8355cbb240 |
| 121 | `inspectOrderSourceId` | 检验单源单信息ID | `inspectordersource_id` | 6507f2f0-2c04-4704-9c28-117c95d14a51 |
| 122 | `invInspectExchRate` | 质检换算率 | `invinspectexchrate` | Decimal |
| 123 | `invInspectExchRateDen` | 质检换算率分母 | `invinspectexchrateden` | Decimal |
| 124 | `invInspectExchRateNum` | 质检换算率分子 | `invinspectexchratenum` | Decimal |
| 125 | `invStockExchRateDen` | 库存换算率分母 | `invstockexchrateden` | Decimal |
| 126 | `invStockExchRateNum` | 库存换算率分子 | `invstockexchratenum` | Decimal |
| 127 | `prodDeptId` | 生产部门id | `prod_dept_id` | ca871996-b447-42f9-8dac-dd7c21ee0662 |
| 128 | `projectId` | 项目id | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 129 | `reworkOperationId` | 标准建议返工工序ID | `rework_operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 130 | `scrapOperationId` | 标准责任工序ID | `scrap_operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 131 | `wareHouseId` | 仓库id | `ware_house_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 132 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |

---

## 关联属性（35个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `qualitylvjudge` | 质量等级判定id | `QMSDFM.qualityGrade.qualityGrade` | Service |  |
| 2 | `pk_chargedept` | 责任部门id | `bd.adminOrg.DeptOrgVO` | Service |  |
| 3 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 4 | `definect_b` | 来料不良品处理单明细自定义项 | `QMSQIT.rejectbill.RejectbillBDefineCharacter` | None |  |
| 5 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 6 | `pk_instockbatch` | 入库批次 | `st.batchno.Batchno` | Service |  |
| 7 | `inspectOrderSourceId` | 检验单源单信息ID | `QMSQIT.incominspectorder.qms_qit_incominspectorder_sourcelist` | None |  |
| 8 | `pk_badreason` | 不良原因 | `aa.reason.Reason` | Service |  |
| 9 | `prodDeptId` | 生产部门id | `bd.adminOrg.DeptOrgVO` | Service |  |
| 10 | `fprocessjudge` | 处理方式判定id | `QMSDFM.treatmethod.treatmethod` | Service |  |
| 11 | `cargospaceId` | 货位id | `aa.goodsposition.GoodsPosition` | Service |  |
| 12 | `pk_org` | 质检组织id | `org.func.QualityOrg` | Service |  |
| 13 | `defineb` | 不良品处理单明细自定义项 | `QMSQIT.rejectbill.bdef` | None | true |
| 14 | `pk_chgmrl` | 改判物料id | `pc.product.Product` | Service |  |
| 15 | `pk_material_h` | 判定物料 | `pc.product.Product` | Service |  |
| 16 | `freect_b` | 表体物料自由项特征组实体 | `QMSQIT.rejectbill.rejectbillBFree` | None |  |
| 17 | `wareHouseId` | 仓库id | `aa.warehouse.Warehouse` | Service |  |
| 18 | `state` | 库存状态ID | `st.stockStatusRecord.stockStatusRecord` | Service |  |
| 19 | `pk_rejectbill` | 不良品处理单表头id | `QMSQIT.rejectbill.rejectbill` | None | true |
| 20 | `pk_suggprocess` | 检验单处理方式id | `QMSDFM.treatmethod.treatmethod` | Service |  |
| 21 | `pk_sku_h` | 判定物料SKU | `pc.product.ProductSKU` | Service |  |
| 22 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 23 | `reworkOperationId` | 标准建议返工工序ID | `ed.operation.Operation` | Service |  |
| 24 | `pk_chgsku` | 改判物料SKU编码id | `pc.product.ProductSKU` | Service |  |
| 25 | `freect_bchg` | 表体改判物料自由项特征组实体 | `QMSQIT.rejectbill.rejectbillBchgFree` | None |  |
| 26 | `stockUnit` | 库存单位 | `pc.unit.Unit` | Service |  |
| 27 | `astunitid` | 单位 | `pc.unit.Unit` | Service |  |
| 28 | `detailSnList` | 序列号信息 | `QMSQIT.rejectbill.DetailSn` | None | true |
| 29 | `pk_qualitylv` | 检验单质量等级id | `QMSDFM.qualityGrade.qualityGrade` | Service |  |
| 30 | `pk_baditem` | 检验单不良项目 | `QMSDFM.badItems.badItems` | Service |  |
| 31 | `pk_chargepsn` | 责任人id | `bd.staff.StaffNew` | Service |  |
| 32 | `pk_judgebaditem` | 判定不良项目 | `QMSDFM.badItems.badItems` | Service |  |
| 33 | `scrapOperationId` | 标准责任工序ID | `ed.operation.Operation` | Service |  |
| 34 | `unitid` | 主单位 | `pc.unit.Unit` | Service |  |
| 35 | `projectId` | 项目id | `bd.project.ProjectVO` | Service |  |
