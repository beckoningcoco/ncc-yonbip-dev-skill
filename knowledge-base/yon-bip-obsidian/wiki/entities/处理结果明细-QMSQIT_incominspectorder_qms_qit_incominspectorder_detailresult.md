---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.incominspectorder.qms_qit_incominspectorder_detailresult"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 处理结果明细 (`QMSQIT.incominspectorder.qms_qit_incominspectorder_detailresult`)

> QMSQIT | 物理表：`qms_qit_incom_detailresult`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 处理结果明细 |
| 物理表 | `qms_qit_incom_detailresult` |
| domain/服务域 | `QMS-QIT` |
| schema | `qms_qit_rejectbill` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:45:36.8860` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（98个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `tenant` | 租户ID | `tenant_id` | String |
| 3 | `id` | ID | `id` | String |
| 4 | `pk_inspectorder_sourcelist` | 源单信息id | `pk_inspectorder_sourcelist` | 6507f2f0-2c04-4704-9c28-117c95d14a51 |
| 5 | `pk_inspectorder_h` | 检验单id | `pk_inspectorder_h` | d4ef5893-2422-4c08-8e7e-df2087db7a8f |
| 6 | `badReasonId` | 不良原因 | `bad_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 7 | `reworkProcessId` | 建议返工工序 | `rework_process_id` | Long |
| 8 | `scrapDeptId` | 责任部门 | `scrap_dept_id` | ca871996-b447-42f9-8dac-dd7c21ee0662 |
| 9 | `scrapLeaderId` | 责任人 | `scrap_leader_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 10 | `scrapProcessId` | 责任工序 | `scrap_process_id` | Long |
| 11 | `definect_d` | 结果明细自定义项特征实体 | `definect_d` | f4f9a54f-5e27-439e-9726-8a5e8aa1b607 |
| 12 | `is_storage` | 是否可入库 | `is_storage` | String |
| 13 | `destroySimpleResult` | 是否破坏性样本处理结果 | `destroy_simple_result` | Short |
| 14 | `pk_materialsku` | 判定物料SKU | `pk_materialsku` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 15 | `freect_bchg` | 处理结果明细改判物料自由项特征组 | `freect_bchg` | 9c02f500-5a2a-4109-bf71-f3a30d9df9a7 |
| 16 | `freect_b` | 处理结果明细物料自由项特征组 | `freect_b` | 1dc920ee-a4f9-489d-b355-535c8570d37d |
| 17 | `qualityGrade` | 质量计分 | `quality_grade` | Decimal |
| 18 | `party_responsible` | 责任方 | `party_responsible` | String |
| 19 | `pk_baditem` | 不良项目 | `pk_baditem` | 3de0c23e-ee02-46b4-bae7-0a982de498ce |
| 20 | `pk_material_h` | 表头物料 | `pk_material_h` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 21 | `inspectResult` | 检验结果 | `inspectResult` | String |
| 22 | `pk_qualify_grade` | 质量等级 | `pk_qualify_grade` | String |
| 23 | `nastnum` | 件数 | `nastnum` | Decimal |
| 24 | `cbastunitid` | 检验单位id | `cbastunitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 25 | `nnum` | 数量 | `nnum` | Decimal |
| 26 | `cbunitid` | 主计量id | `cbunitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 27 | `vbchangerate` | 换算率 | `vbchangerate` | String |
| 28 | `pk_instockbatchcode` | 批次号 | `pk_instockbatchcode` | String |
| 29 | `handleType` | 处理方式id | `handleType` | 4406ea9f-9ed2-49d2-af46-8af10cca2b1a |
| 30 | `pk_stockstatus` | 库存状态id | `pk_stockstatus` | 5275f074-3e60-4b90-9771-20970f1e905c |
| 31 | `pk_changematerial` | 改判物料id | `pk_changematerial` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 32 | `pk_changematerialsku` | 改判物料skuid | `pk_changematerialsku` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 33 | `storage` | 保质期 | `storage` | String |
| 34 | `pk_storageunit` | 保质期单位 | `pk_storageunit` | String |
| 35 | `validityDate` | 有效期至 | `validityDate` | Date |
| 36 | `baditemFlag` | 不良品处理 | `baditemFlag` | String |
| 37 | `vbnote` | 备注 | `vbnote` | String |
| 38 | `free1` | 物料规格1 | `free1` | String |
| 39 | `free2` | 物料规格2 | `free2` | String |
| 40 | `free3` | 物料规格3 | `free3` | String |
| 41 | `free4` | 物料规格4 | `free4` | String |
| 42 | `free5` | 物料规格5 | `free5` | String |
| 43 | `free6` | 物料规格6 | `free6` | String |
| 44 | `free7` | 物料规格7 | `free7` | String |
| 45 | `free8` | 物料规格8 | `free8` | String |
| 46 | `free9` | 物料规格9 | `free9` | String |
| 47 | `free10` | 物料规格10 | `free10` | String |
| 48 | `define1` | 批次号属性1 | `define1` | String |
| 49 | `define2` | 批次号属性2 | `define2` | String |
| 50 | `define3` | 批次号属性3 | `define3` | String |
| 51 | `define4` | 批次号属性4 | `define4` | String |
| 52 | `define5` | 批次号属性5 | `define5` | String |
| 53 | `define6` | 批次号属性6 | `define6` | String |
| 54 | `define7` | 批次号属性7 | `define7` | String |
| 55 | `define9` | 批次号属性9 | `define9` | String |
| 56 | `define8` | 批次属性8 | `define8` | String |
| 57 | `define10` | 批次号属性10 | `define10` | String |
| 58 | `define11` | 批次号属性11 | `define11` | String |
| 59 | `define12` | 批次号属性12 | `define12` | String |
| 60 | `define13` | 批次号属性13 | `define13` | String |
| 61 | `define14` | 批次号属性14 | `define14` | String |
| 62 | `define15` | 批次号属性15 | `define15` | String |
| 63 | `define16` | 批次号属性16 | `define16` | String |
| 64 | `define17` | 批次号属性17 | `define17` | String |
| 65 | `define18` | 批次号属性18 | `define18` | String |
| 66 | `define19` | 批次号属性19 | `define19` | String |
| 67 | `define20` | 批次号属性20 | `define20` | String |
| 68 | `define21` | 批次号属性21 | `define21` | String |
| 69 | `define22` | 批次号属性22 | `define22` | String |
| 70 | `define23` | 批次号属性23 | `define23` | String |
| 71 | `define24` | 批次号属性24 | `define24` | String |
| 72 | `define25` | 批次号属性25 | `define25` | String |
| 73 | `define26` | 批次号属性26 | `define26` | String |
| 74 | `define27` | 批次号属性27 | `define27` | String |
| 75 | `define28` | 批次号属性28 | `define28` | String |
| 76 | `define29` | 批次号属性29 | `define29` | String |
| 77 | `define30` | 批次号属性30 | `define30` | String |
| 78 | `producedate` | 生产日期 | `producedate` | DateTime |
| 79 | `invaliddate` | 有效期 | `invaliddate` | DateTime |
| 80 | `firstStoredDate` | 首次入库日期 | `firstStoredDate` | DateTime |
| 81 | `unitExchangeType` | 固定换算率 | `unitExchangeType` | Integer |
| 82 | `dr` | 逻辑删除标记 | `dr` | Short |
| 83 | `pubts` | 时间戳 | `pubts` | DateTime |
| 84 | `checkSubNumber` | 库存件数 | `check_subnumber` | Decimal |
| 85 | `exchangeRate` | 库存换算率 | `exchange_rate` | Decimal |
| 86 | `incom_detailresult_define` | 来料检验单结果明细处理结果自定义项 | `` | fb7ad18d-7854-496d-8840-8448d05d2eba |
| 87 | `invInspectExchRate` | 质检换算率 | `invinspectexchrate` | Decimal |
| 88 | `invInspectExchRateDen` | 质检换算率分母 | `invinspectexchrateden` | Decimal |
| 89 | `invInspectExchRateNum` | 质检换算率分子 | `invinspectexchratenum` | Decimal |
| 90 | `invStockExchRateDen` | 库存换算率分母 | `invstockexchrateden` | Decimal |
| 91 | `invStockExchRateNum` | 库存换算率分子 | `invstockexchratenum` | Decimal |
| 92 | `nextInspectDate` | 下次检验日期 | `next_inspect_date` | Date |
| 93 | `pk_instockbatchcodeId` | 批次号id | `pk_instockbatchcodeId` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 94 | `pushRejectbillNum` | 已推不良品数量 | `push_rejectbill_num` | Decimal |
| 95 | `qms_qit_detailresult_bad_itemsList` | 处理结果明细不良项目详情 | `` | 0a359230-adee-4700-8e1e-4d20fd0d2e12 |
| 96 | `reworkOperationId` | 标准建议返工工序ID | `rework_operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 97 | `scrapOperationId` | 标准责任工序ID | `scrap_operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 98 | `stockUnit` | 库存单位 | `stock_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |

---

## 关联属性（24个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `pk_changematerialsku` | 改判物料skuid | `pc.product.ProductSKU` | Service |  |
| 2 | `pk_stockstatus` | 库存状态id | `st.stockStatusRecord.stockStatusRecord` | Service |  |
| 3 | `qms_qit_detailresult_bad_itemsList` | 处理结果明细不良项目详情 | `QMSQIT.incominspectorder.qms_qit_incom_bad_items_detailresult` | None | true |
| 4 | `cbunitid` | 主计量id | `pc.unit.Unit` | Service |  |
| 5 | `badReasonId` | 不良原因 | `aa.reason.Reason` | Service |  |
| 6 | `scrapDeptId` | 责任部门 | `bd.adminOrg.DeptOrgVO` | Service |  |
| 7 | `scrapLeaderId` | 责任人 | `bd.staff.Staff` | Service |  |
| 8 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 9 | `reworkOperationId` | 标准建议返工工序ID | `ed.operation.Operation` | Service |  |
| 10 | `pk_inspectorder_sourcelist` | 源单信息id | `QMSQIT.incominspectorder.qms_qit_incominspectorder_sourcelist` | None | true |
| 11 | `freect_bchg` | 处理结果明细改判物料自由项特征组 | `QMSQIT.incominspectorder.InComInspectResultDetailchgFree` | None |  |
| 12 | `stockUnit` | 库存单位 | `pc.unit.Unit` | Service |  |
| 13 | `pk_materialsku` | 判定物料SKU | `pc.product.ProductSKU` | Service |  |
| 14 | `pk_baditem` | 不良项目 | `QMSDFM.badItems.badItems` | Service |  |
| 15 | `pk_changematerial` | 改判物料id | `pc.product.Product` | Service |  |
| 16 | `pk_material_h` | 表头物料 | `pc.product.Product` | Service |  |
| 17 | `freect_b` | 处理结果明细物料自由项特征组 | `QMSQIT.incominspectorder.InComInspectResulthDetailFree` | None |  |
| 18 | `pk_instockbatchcodeId` | 批次号id | `st.batchno.Batchno` | Service |  |
| 19 | `handleType` | 处理方式id | `QMSDFM.treatmethod.treatmethod` | Service |  |
| 20 | `scrapOperationId` | 标准责任工序ID | `ed.operation.Operation` | Service |  |
| 21 | `definect_d` | 结果明细自定义项特征实体 | `QMSQIT.incominspectorder.IncomInspectResultDetailDefineCharacter` | None |  |
| 22 | `pk_inspectorder_h` | 检验单id | `QMSQIT.incominspectorder.qms_qit_incominspectorder_h` | None |  |
| 23 | `incom_detailresult_define` | 来料检验单结果明细处理结果自定义项 | `QMSQIT.incominspectorder.incom_detailresult_define` | None | true |
| 24 | `cbastunitid` | 检验单位id | `pc.unit.Unit` | Service |  |
