---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.incominspectorder.qms_qit_incominspectorder_result"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验结果 (`QMSQIT.incominspectorder.qms_qit_incominspectorder_result`)

> QMSQIT | 物理表：`qms_qit_incom_result`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验结果 |
| 物理表 | `qms_qit_incom_result` |
| 数据库 schema | `QMS-QIT` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:43:05.5620` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（100个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `tenant` | 租户ID | `tenant_id` | String |
| 3 | `id` | ID | `id` | String |
| 4 | `pk_inspectorder_h` | 检验单id | `pk_inspectorder_h` | d4ef5893-2422-4c08-8e7e-df2087db7a8f |
| 5 | `handleType` | 处理方式id | `handleType` | 4406ea9f-9ed2-49d2-af46-8af10cca2b1a |
| 6 | `checkSubNumber` | 库存件数 | `checkSubNumber` | Decimal |
| 7 | `exchangeRate` | 库存换算率 | `exchangeRate` | Decimal |
| 8 | `pk_instockbatchcodeId` | 批次号id | `pk_instockbatchcodeId` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 9 | `stockUnit` | 库存单位 | `stockUnit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 10 | `stockstats_result` | 同步库存单据状态 | `stockstats_result` | String |
| 11 | `badReasonId` | 不良原因 | `bad_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 12 | `reworkProcessId` | 建议返工工序 | `rework_process_id` | Long |
| 13 | `scrapDeptId` | 责任部门 | `scrap_dept_id` | ca871996-b447-42f9-8dac-dd7c21ee0662 |
| 14 | `destroySimpleResult` | 是否破坏性样本处理结果 | `destroy_simple_result` | Short |
| 15 | `pk_materialsku` | 判定物料SKU | `pk_materialsku` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 16 | `pushRejectbillNum` | 已推不良品数量 | `push_rejectbill_num` | Decimal |
| 17 | `qualityGrade` | 质量计分 | `quality_grade` | Decimal |
| 18 | `scrapLeaderId` | 责任人 | `scrap_leader_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 19 | `scrapProcessId` | 责任工序 | `scrap_process_id` | Long |
| 20 | `definect_r` | 检验结果自定义项特征实体 | `definect_r` | 12ef36e9-e7fd-424b-bf72-86d21e4c2138 |
| 21 | `freect_b` | 表体物料自由项特征组实体 | `freect_b` | 57b4a7e9-67d0-42a9-8c8c-c508beabd060 |
| 22 | `freect_bchg` | 表体改判物料自由项特征组实体 | `freect_bchg` | c8a21500-e9e8-4ce0-a4f8-585501a17f9a |
| 23 | `pk_material_h` | 表头物料 | `pk_material_h` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 24 | `is_storage` | 是否可入库 | `is_storage` | String |
| 25 | `pk_inspectorder_sourcelist` | 源单信息 | `pk_inspectorder_sourcelist` | 571e7669-96cf-4825-8491-42a5fd1d8a4d |
| 26 | `inspectResult` | 检验结果 | `inspectResult` | String |
| 27 | `party_responsible` | 责任方 | `party_responsible` | String |
| 28 | `pk_qualify_grade` | 质量等级 | `pk_qualify_grade` | String |
| 29 | `nastnum` | 数量 | `nastnum` | Decimal |
| 30 | `cbastunitid` | 单位id | `cbastunitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 31 | `nnum` | 主数量 | `nnum` | Decimal |
| 32 | `cbunitid` | 主单位id | `cbunitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 33 | `vbchangerate` | 换算率 | `vbchangerate` | String |
| 34 | `pk_baditem` | 不良项目ID | `pk_baditem` | 3de0c23e-ee02-46b4-bae7-0a982de498ce |
| 35 | `pk_instockbatchcode` | 批次号 | `pk_instockbatchcode` | String |
| 36 | `baditemFlag` | 不良品处理 | `baditemFlag` | String |
| 37 | `pk_stockstatus` | 库存状态id | `pk_stockstatus` | 5275f074-3e60-4b90-9771-20970f1e905c |
| 38 | `pk_changematerial` | 改判物料id | `pk_changematerial` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 39 | `pk_changematerialsku` | 改判物料SKUid | `pk_changematerialsku` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 40 | `storage` | 保质期 | `storage` | String |
| 41 | `validityDate` | 有效期至 | `validityDate` | Date |
| 42 | `vbnote` | 备注 | `vbnote` | String |
| 43 | `free1` | 物料规格1 | `free1` | String |
| 44 | `free2` | 物料规格2 | `free2` | String |
| 45 | `free3` | 物料规格3 | `free3` | String |
| 46 | `free4` | 物料规格4 | `free4` | String |
| 47 | `free5` | 物料规格5 | `free5` | String |
| 48 | `free6` | 物料规格6 | `free6` | String |
| 49 | `free7` | 物料规格7 | `free7` | String |
| 50 | `free8` | 物料规格8 | `free8` | String |
| 51 | `free9` | 物料规格9 | `free9` | String |
| 52 | `free10` | 物料规格10 | `free10` | String |
| 53 | `define1` | 批次号属性1 | `define1` | String |
| 54 | `define2` | 批次号属性2 | `define2` | String |
| 55 | `define3` | 批次号属性3 | `define3` | String |
| 56 | `define4` | 批次号属性4 | `define4` | String |
| 57 | `define5` | 批次号属性5 | `define5` | String |
| 58 | `define6` | 批次号属性6 | `define6` | String |
| 59 | `define7` | 批次号属性7 | `define7` | String |
| 60 | `define9` | 批次号属性9 | `define9` | String |
| 61 | `define10` | 批次号属性10 | `define10` | String |
| 62 | `define11` | 批次号属性11 | `define11` | String |
| 63 | `define12` | 批次号属性12 | `define12` | String |
| 64 | `define13` | 批次号属性13 | `define13` | String |
| 65 | `define14` | 批次号属性14 | `define14` | String |
| 66 | `define15` | 批次号属性15 | `define15` | String |
| 67 | `define16` | 批次号属性16 | `define16` | String |
| 68 | `define17` | 批次号属性17 | `define17` | String |
| 69 | `define18` | 批次号属性18 | `define18` | String |
| 70 | `define19` | 批次号属性19 | `define19` | String |
| 71 | `define20` | 批次号属性20 | `define20` | String |
| 72 | `define21` | 批次号属性21 | `define21` | String |
| 73 | `define22` | 批次号属性22 | `define22` | String |
| 74 | `define23` | 批次号属性23 | `define23` | String |
| 75 | `define24` | 批次号属性24 | `define24` | String |
| 76 | `define25` | 批次号属性25 | `define25` | String |
| 77 | `define26` | 批次号属性26 | `define26` | String |
| 78 | `define27` | 批次号属性27 | `define27` | String |
| 79 | `define28` | 批次号属性28 | `define28` | String |
| 80 | `define29` | 批次号属性29 | `define29` | String |
| 81 | `define30` | 批次号属性30 | `define30` | String |
| 82 | `producedate` | 生产日期 | `producedate` | DateTime |
| 83 | `invaliddate` | 有效期 | `invaliddate` | DateTime |
| 84 | `firstStoredDate` | 首次入库日期 | `firstStoredDate` | DateTime |
| 85 | `unitExchangeType` | 固定换算率 | `unitExchangeType` | Integer |
| 86 | `pk_storageunit` | 保质期单位 | `pk_storageunit` | String |
| 87 | `define8` | 批次属性8 | `define8` | String |
| 88 | `pubts` | 时间戳 | `pubts` | DateTime |
| 89 | `dr` | 逻辑删除标记 | `dr` | Short |
| 90 | `incom_result_define` | 检验结果自定义项 | `` | 00bf41e7-5a28-458d-814c-85c16cbe99e1 |
| 91 | `invInspectExchRate` | 质检换算率 | `invinspectexchrate` | Decimal |
| 92 | `invInspectExchRateDen` | 质检换算率分母 | `invinspectexchrateden` | Decimal |
| 93 | `invInspectExchRateNum` | 质检换算率分子 | `invinspectexchratenum` | Decimal |
| 94 | `invStockExchRateDen` | 库存换算率分母 | `invstockexchrateden` | Decimal |
| 95 | `invStockExchRateNum` | 库存换算率分子 | `invstockexchratenum` | Decimal |
| 96 | `nextInspectDate` | 下次检验日期 | `next_inspect_date` | Date |
| 97 | `qms_qit_incom_bad_itemsList` | 不良项目详情 | `` | ddedaead-d0ab-4751-b485-dfb024e3c8eb |
| 98 | `qms_qit_incominspectorder_resultSn` | 检验单处理结果序列号 | `` | 2ca08de4-8bbd-4c4e-a2f5-1a3d8682e577 |
| 99 | `reworkOperationId` | 标准建议返工工序ID | `rework_operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 100 | `scrapOperationId` | 标准责任工序ID | `scrap_operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |

---

## 关联属性（25个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `pk_changematerialsku` | 改判物料SKUid | `pc.product.ProductSKU` | Service |  |
| 2 | `pk_stockstatus` | 库存状态id | `st.stockStatusRecord.stockStatusRecord` | Service |  |
| 3 | `badReasonId` | 不良原因 | `aa.reason.Reason` | Service |  |
| 4 | `scrapDeptId` | 责任部门 | `bd.adminOrg.DeptOrgVO` | Service |  |
| 5 | `pk_inspectorder_sourcelist` | 源单信息 | `QMSQIT.baseinspectorder.qms_qit_baseinspectorder_sourcelist` | None |  |
| 6 | `pk_materialsku` | 判定物料SKU | `pc.product.ProductSKU` | Service |  |
| 7 | `qms_qit_incom_bad_itemsList` | 不良项目详情 | `QMSQIT.incominspectorder.qms_qit_incom_bad_items` | None | true |
| 8 | `pk_material_h` | 表头物料 | `pc.product.Product` | Service |  |
| 9 | `freect_b` | 表体物料自由项特征组实体 | `QMSQIT.incominspectorder.InComInspectResulthFree` | None |  |
| 10 | `pk_instockbatchcodeId` | 批次号id | `st.batchno.Batchno` | Service |  |
| 11 | `definect_r` | 检验结果自定义项特征实体 | `QMSQIT.incominspectorder.IncomInspectResultDefineCharacter` | None |  |
| 12 | `cbunitid` | 主单位id | `pc.unit.Unit` | Service |  |
| 13 | `scrapLeaderId` | 责任人 | `bd.staff.Staff` | Service |  |
| 14 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 15 | `reworkOperationId` | 标准建议返工工序ID | `ed.operation.Operation` | Service |  |
| 16 | `incom_result_define` | 检验结果自定义项 | `QMSQIT.incominspectorder.incom_result_define` | None | true |
| 17 | `freect_bchg` | 表体改判物料自由项特征组实体 | `QMSQIT.incominspectorder.InComInspectResultchgFree` | None |  |
| 18 | `stockUnit` | 库存单位 | `pc.unit.Unit` | Service |  |
| 19 | `pk_baditem` | 不良项目ID | `QMSDFM.badItems.badItems` | Service |  |
| 20 | `pk_changematerial` | 改判物料id | `pc.product.Product` | Service |  |
| 21 | `qms_qit_incominspectorder_resultSn` | 检验单处理结果序列号 | `QMSQIT.incominspectorder.qms_qit_incominspectorder_result_sn` | None | true |
| 22 | `handleType` | 处理方式id | `QMSDFM.treatmethod.treatmethod` | Service |  |
| 23 | `scrapOperationId` | 标准责任工序ID | `ed.operation.Operation` | Service |  |
| 24 | `pk_inspectorder_h` | 检验单id | `QMSQIT.incominspectorder.qms_qit_incominspectorder_h` | None | true |
| 25 | `cbastunitid` | 单位id | `pc.unit.Unit` | Service |  |
