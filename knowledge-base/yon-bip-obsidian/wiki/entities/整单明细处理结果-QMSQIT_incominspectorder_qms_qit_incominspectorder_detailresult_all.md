---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.incominspectorder.qms_qit_incominspectorder_detailresult_all"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 整单明细处理结果 (`QMSQIT.incominspectorder.qms_qit_incominspectorder_detailresult_all`)

> QMSQIT | 物理表：`qms_qit_incom_detailresult`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 整单明细处理结果 |
| 物理表 | `qms_qit_incom_detailresult` |
| domain/服务域 | `QMS-QIT` |
| schema | `qms_qit_rejectbill` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:43:02.8700` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（97个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `badReasonId` | 不良原因 | `bad_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 2 | `baditemFlag` | 不良品处理 | `baditemFlag` | String |
| 3 | `cbastunitid` | 检验单位 | `cbastunitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 4 | `cbunitid` | 主单位 | `cbunitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 5 | `checkSubNumber` | 库存件数 | `check_subnumber` | Decimal |
| 6 | `define1` | 自定义项1 | `define1` | String |
| 7 | `define10` | 自定义项10 | `define10` | String |
| 8 | `define11` | 自定义项11 | `define11` | String |
| 9 | `define12` | 自定义项12 | `define12` | String |
| 10 | `define13` | 自定义项13 | `define13` | String |
| 11 | `define14` | 自定义项14 | `define14` | String |
| 12 | `define15` | 自定义项15 | `define15` | String |
| 13 | `define16` | 自定义项16 | `define16` | String |
| 14 | `define17` | 自定义项17 | `define17` | String |
| 15 | `define18` | 自定义项18 | `define18` | String |
| 16 | `define19` | 自定义项19 | `define19` | String |
| 17 | `define2` | 自定义项2 | `define2` | String |
| 18 | `define20` | 自定义项20 | `define20` | String |
| 19 | `define21` | 自定义项21 | `define21` | String |
| 20 | `define22` | 自定义项22 | `define22` | String |
| 21 | `define23` | 自定义项23 | `define23` | String |
| 22 | `define24` | 自定义项24 | `define24` | String |
| 23 | `define25` | 自定义项25 | `define25` | String |
| 24 | `define26` | 自定义项26 | `define26` | String |
| 25 | `define27` | 自定义项27 | `define27` | String |
| 26 | `define28` | 自定义项28 | `define28` | String |
| 27 | `define29` | 自定义项29 | `define29` | String |
| 28 | `define3` | 自定义项3 | `define3` | String |
| 29 | `define30` | 自定义项30 | `define30` | String |
| 30 | `define4` | 自定义项4 | `define4` | String |
| 31 | `define5` | 自定义项5 | `define5` | String |
| 32 | `define6` | 自定义项6 | `define6` | String |
| 33 | `define7` | 自定义项7 | `define7` | String |
| 34 | `define8` | 自定义项8 | `define8` | String |
| 35 | `define9` | 自定义项9 | `define9` | String |
| 36 | `definect_d` | 来料检验结果明细自定义项 | `definect_d` | f4f9a54f-5e27-439e-9726-8a5e8aa1b607 |
| 37 | `destroySimpleResult` | 是否破坏性样本处理结果 | `destroy_simple_result` | Short |
| 38 | `dr` | 逻辑删除标记 | `dr` | Short |
| 39 | `exchangeRate` | 库存换算率 | `exchange_rate` | Decimal |
| 40 | `firstStoredDate` | 首次入库日期 | `firstStoredDate` | DateTime |
| 41 | `free1` | 规格1 | `free1` | String |
| 42 | `free10` | 规格10 | `free10` | String |
| 43 | `free2` | 规格2 | `free2` | String |
| 44 | `free3` | 规格3 | `free3` | String |
| 45 | `free4` | 规格4 | `free4` | String |
| 46 | `free5` | 规格5 | `free5` | String |
| 47 | `free6` | 规格6 | `free6` | String |
| 48 | `free7` | 规格7 | `free7` | String |
| 49 | `free8` | 规格8 | `free8` | String |
| 50 | `free9` | 规格9 | `free9` | String |
| 51 | `freect_b` | 处理结果明细物料自由项特征组 | `freect_b` | 1dc920ee-a4f9-489d-b355-535c8570d37d |
| 52 | `freect_bchg` | 处理结果明细改判物料自由项特征组 | `freect_bchg` | 9c02f500-5a2a-4109-bf71-f3a30d9df9a7 |
| 53 | `handleType` | 处理方式 | `handleType` | 4406ea9f-9ed2-49d2-af46-8af10cca2b1a |
| 54 | `id` | ID | `id` | String |
| 55 | `inspectResult` | 检验结果 | `inspectResult` | String |
| 56 | `invInspectExchRate` | 质检换算率 | `invinspectexchrate` | Decimal |
| 57 | `invInspectExchRateDen` | 质检换算率分母 | `invinspectexchrateden` | Decimal |
| 58 | `invInspectExchRateNum` | 质检换算率分子 | `invinspectexchratenum` | Decimal |
| 59 | `invStockExchRateDen` | 库存换算率分母 | `invstockexchrateden` | Decimal |
| 60 | `invStockExchRateNum` | 库存换算率分子 | `invstockexchratenum` | Decimal |
| 61 | `invaliddate` | 有效期 | `invaliddate` | DateTime |
| 62 | `is_storage` | 是否可入库 | `is_storage` | String |
| 63 | `nastnum` | 数量 | `nastnum` | Decimal |
| 64 | `nextInspectDate` | 下次检验日期 | `next_inspect_date` | Date |
| 65 | `nnum` | 主数量 | `nnum` | Decimal |
| 66 | `party_responsible` | 责任方 | `party_responsible` | String |
| 67 | `pk_baditem` | 不良项目 | `pk_baditem` | 3de0c23e-ee02-46b4-bae7-0a982de498ce |
| 68 | `pk_changematerial` | 改判物料 | `pk_changematerial` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 69 | `pk_changematerialsku` | 改判物料sku | `pk_changematerialsku` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 70 | `pk_inspectorder_h` | 检验单id | `pk_inspectorder_h` | d4ef5893-2422-4c08-8e7e-df2087db7a8f |
| 71 | `pk_inspectorder_sourcelist` | 源单信息id | `pk_inspectorder_sourcelist` | 6507f2f0-2c04-4704-9c28-117c95d14a51 |
| 72 | `pk_instockbatchcode` | 批次号 | `pk_instockbatchcode` | String |
| 73 | `pk_instockbatchcodeId` | 批次号id | `pk_instockbatchcodeId` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 74 | `pk_material_h` | 表头物料 | `pk_material_h` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 75 | `pk_materialsku` | 判定物料SKU | `pk_materialsku` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 76 | `pk_qualify_grade` | 质量等级 | `pk_qualify_grade` | String |
| 77 | `pk_stockstatus` | 库存状态 | `pk_stockstatus` | 5275f074-3e60-4b90-9771-20970f1e905c |
| 78 | `pk_storageunit` | 保质期单位 | `pk_storageunit` | String |
| 79 | `producedate` | 生产日期 | `producedate` | DateTime |
| 80 | `pubts` | 时间戳 | `pubts` | DateTime |
| 81 | `pushRejectbillNum` | 已推不良品数量 | `push_rejectbill_num` | Decimal |
| 82 | `qms_qit_detailresultall_bad_itemsList` | 表头处理结果明细不良项目详情 | `` | a5ec00e7-2f12-463b-b485-f4699a2b1fa5 |
| 83 | `qualityGrade` | 质量计分 | `quality_grade` | Decimal |
| 84 | `reworkOperationId` | 标准建议返工工序ID | `rework_operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 85 | `reworkProcessId` | 建议返工工序 | `rework_process_id` | Long |
| 86 | `scrapDeptId` | 责任部门 | `scrap_dept_id` | ca871996-b447-42f9-8dac-dd7c21ee0662 |
| 87 | `scrapLeaderId` | 责任人 | `scrap_leader_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 88 | `scrapOperationId` | 标准责任工序ID | `scrap_operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 89 | `scrapProcessId` | 责任工序 | `scrap_process_id` | Long |
| 90 | `stockUnit` | 库存单位 | `stock_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 91 | `storage` | 保质期 | `storage` | String |
| 92 | `tenant` | 租户ID | `tenant_id` | String |
| 93 | `unitExchangeType` | 固定换算率 | `unitExchangeType` | Integer |
| 94 | `validityDate` | 有效期至 | `validityDate` | Date |
| 95 | `vbchangerate` | 换算率 | `vbchangerate` | String |
| 96 | `vbnote` | 备注 | `vbnote` | String |
| 97 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（23个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `pk_changematerialsku` | 改判物料sku | `pc.product.ProductSKU` | Service |  |
| 2 | `pk_stockstatus` | 库存状态 | `st.stockStatusRecord.stockStatusRecord` | Service |  |
| 3 | `cbunitid` | 主单位 | `pc.unit.Unit` | Service |  |
| 4 | `badReasonId` | 不良原因 | `aa.reason.Reason` | Service |  |
| 5 | `scrapDeptId` | 责任部门 | `bd.adminOrg.DeptOrgVO` | Service |  |
| 6 | `scrapLeaderId` | 责任人 | `bd.staff.Staff` | Service |  |
| 7 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 8 | `reworkOperationId` | 标准建议返工工序ID | `ed.operation.Operation` | Service |  |
| 9 | `pk_inspectorder_sourcelist` | 源单信息id | `QMSQIT.incominspectorder.qms_qit_incominspectorder_sourcelist` | None |  |
| 10 | `freect_bchg` | 处理结果明细改判物料自由项特征组 | `QMSQIT.incominspectorder.InComInspectResultDetailchgFree` | None |  |
| 11 | `stockUnit` | 库存单位 | `pc.unit.Unit` | Service |  |
| 12 | `pk_materialsku` | 判定物料SKU | `pc.product.ProductSKU` | Service |  |
| 13 | `pk_baditem` | 不良项目 | `QMSDFM.badItems.badItems` | Service |  |
| 14 | `pk_changematerial` | 改判物料 | `pc.product.Product` | Service |  |
| 15 | `pk_material_h` | 表头物料 | `pc.product.Product` | Service |  |
| 16 | `freect_b` | 处理结果明细物料自由项特征组 | `QMSQIT.incominspectorder.InComInspectResulthDetailFree` | None |  |
| 17 | `pk_instockbatchcodeId` | 批次号id | `st.batchno.Batchno` | Service |  |
| 18 | `handleType` | 处理方式 | `QMSDFM.treatmethod.treatmethod` | Service |  |
| 19 | `scrapOperationId` | 标准责任工序ID | `ed.operation.Operation` | Service |  |
| 20 | `definect_d` | 来料检验结果明细自定义项 | `QMSQIT.incominspectorder.IncomInspectResultDetailDefineCharacter` | None |  |
| 21 | `pk_inspectorder_h` | 检验单id | `QMSQIT.incominspectorder.qms_qit_incominspectorder_h` | None | true |
| 22 | `qms_qit_detailresultall_bad_itemsList` | 表头处理结果明细不良项目详情 | `QMSQIT.incominspectorder.qms_qit_incom_bad_items_detailresult_all` | None | true |
| 23 | `cbastunitid` | 检验单位 | `pc.unit.Unit` | Service |  |
