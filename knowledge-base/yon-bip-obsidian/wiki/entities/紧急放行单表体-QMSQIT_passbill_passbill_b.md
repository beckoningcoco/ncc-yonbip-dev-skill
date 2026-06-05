---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.passbill.passbill_b"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 紧急放行单表体 (`QMSQIT.passbill.passbill_b`)

> QMSQIT | 物理表：`qms_qit_passbill_b`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 紧急放行单表体 |
| 物理表 | `qms_qit_passbill_b` |
| 数据库 schema | `QMS-QIT` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:43:22.3560` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（110个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `definect_b` | 表体自定义项特征 | `definect_b` | 61ec184e-83da-4450-bd83-c7053d8d0413 |
| 2 | `freect_b` | 表体物料自由项特征组实体 | `freect_b` | 41538073-5dc0-4607-9f19-a171066d8181 |
| 3 | `id` | ID | `id` | String |
| 4 | `rownum` | 行号 | `row_num` | Integer |
| 5 | `pk_material` | 物料ID | `pk_material` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 6 | `pk_materialsku` | 物料SKU | `pk_materialsku` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 7 | `pk_batchcode` | 批次号 | `pk_batchcode` | String |
| 8 | `validitydate` | 有效期至 | `validitydate` | Date |
| 9 | `castunitid` | 单位ID | `castunitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 10 | `pk_batchcodeId` | 批次 | `pk_batchcodeId` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 11 | `checkapplyId` | 检验申请Id | `checkapplyId` | 0eee67eb-f19b-41be-bd6c-2bb2c555d489 |
| 12 | `sourceOrderType` | 请检来源订单类型 | `source_order_type` | String |
| 13 | `sourceOrderCode` | 请检来源订单号 | `source_order_code` | String |
| 14 | `checkNumber` | 请检数量 | `checkNumber` | Decimal |
| 15 | `checkSubNumber` | 库存件数 | `checkSubNumber` | Decimal |
| 16 | `sourceOrderLineNo` | 请检来源订单行号 | `source_order_line_no` | Decimal |
| 17 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 18 | `cunitid` | 主单位ID | `cunitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 19 | `unitExchangeType` | 换算方式 | `unitExchangeType` | String |
| 20 | `vchangerate` | 换算率 | `vchangerate` | String |
| 21 | `nastnum` | 数量 | `nastnum` | Decimal |
| 22 | `nnum` | 件数 | `nnum` | Decimal |
| 23 | `pk_stockstate` | 放行后库存状态ID | `pk_stockstate` | 5275f074-3e60-4b90-9771-20970f1e905c |
| 24 | `sourcebilltype` | 来源单据类型 | `sourcebilltype` | String |
| 25 | `sourcebillid` | 来源单据主键 | `sourcebillid` | String |
| 26 | `sourcebillcode` | 来源单据号 | `sourcebillcode` | String |
| 27 | `sourcebillrowid` | 来源单据行主键 | `sourcebillrowid` | String |
| 28 | `sourcebillrowno` | 来源单据行号 | `sourcebillrowno` | Decimal |
| 29 | `ordertype` | 源头单据类型 | `ordertype` | String |
| 30 | `orderid` | 源头单据主键 | `orderid` | String |
| 31 | `ordercode` | 源头单据号 | `ordercode` | String |
| 32 | `orderrowid` | 源头单据行主键 | `orderrowid` | String |
| 33 | `orderrowno` | 源头单据行号 | `orderrowno` | Decimal |
| 34 | `vnote` | 备注 | `vnote` | String |
| 35 | `tenant` | 租户ID | `tenant_id` | String |
| 36 | `dr` | 逻辑删除标记 | `dr` | Short |
| 37 | `pubts` | 时间戳 | `pubts` | DateTime |
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
| 56 | `define10` | 批次号属性10 | `define10` | String |
| 57 | `define11` | 批次号属性11 | `define11` | String |
| 58 | `define12` | 批次号属性12 | `define12` | String |
| 59 | `define13` | 批次号属性13 | `define13` | String |
| 60 | `define14` | 批次号属性14 | `define14` | String |
| 61 | `define15` | 批次号属性15 | `define15` | String |
| 62 | `define16` | 批次号属性16 | `define16` | String |
| 63 | `define17` | 批次号属性17 | `define17` | String |
| 64 | `define18` | 批次号属性18 | `define18` | String |
| 65 | `define19` | 批次号属性19 | `define19` | String |
| 66 | `define20` | 批次号属性20 | `define20` | String |
| 67 | `define21` | 批次号属性21 | `define21` | String |
| 68 | `define22` | 批次号属性22 | `define22` | String |
| 69 | `define23` | 批次号属性23 | `define23` | String |
| 70 | `define24` | 批次号属性24 | `define24` | String |
| 71 | `define25` | 批次号属性25 | `define25` | String |
| 72 | `define26` | 批次号属性26 | `define26` | String |
| 73 | `define27` | 批次号属性27 | `define27` | String |
| 74 | `define28` | 批次号属性28 | `define28` | String |
| 75 | `define29` | 批次号属性29 | `define29` | String |
| 76 | `define30` | 批次号属性30 | `define30` | String |
| 77 | `producedate` | 生产日期 | `producedate` | DateTime |
| 78 | `firstStoredDate` | 首次入库日期 | `firstStoredDate` | DateTime |
| 79 | `pk_passbill` | 主表ID | `pk_passbill` | 1fbc0ce7-f0d3-429d-bd5b-dd32e25ac54b |
| 80 | `originNum` | 原始主数量 | `originNum` | Decimal |
| 81 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 82 | `standard` | 规格 | `standard` | String |
| 83 | `source` | 上游单据类型 | `source` | String |
| 84 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 85 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 86 | `upcode` | 上游单据号 | `upcode` | String |
| 87 | `type` | 型号 | `check_type` | String |
| 88 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 89 | `materialname` | 物料名称 | `materialname` | String |
| 90 | `define8` | 自定义项8 | `define8` | String |
| 91 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 92 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 93 | `bodydefines` | 紧急放行单表体自定义项 | `` | dbeb5893-1a86-44a6-a9a1-e9791739c19e |
| 94 | `checkapplySourceId` | 检验申请源单ID | `checkapplysource_id` | f52f8fb2-c97f-4bf4-b54d-6e9ea72724f4 |
| 95 | `inspectChangerate` | 质检换算率 | `inspect_changerate` | String |
| 96 | `inspectNum` | 检验件数 | `inspect_num` | Decimal |
| 97 | `inspectUnitId` | 检验单位 | `inspect_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 98 | `invExchRate` | 换算率 | `invexchrate` | Decimal |
| 99 | `invExchRateDen` | 换算率分母 | `invexchrateden` | Decimal |
| 100 | `invExchRateNum` | 换算率分子 | `invexchratenum` | Decimal |
| 101 | `invInspectExchRate` | 质检换算率 | `invinspectexchrate` | Decimal |
| 102 | `invInspectExchRateDen` | 质检换算率分母 | `invinspectexchrateden` | Decimal |
| 103 | `invInspectExchRateNum` | 质检换算率分子 | `invinspectexchratenum` | Decimal |
| 104 | `productionType` | 产出类型 | `production_type` | String |
| 105 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 106 | `reservedobj` | 跟踪线索 | `reservedobj` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 107 | `sourceOrderGrandsonId` | 请检来源订单孙表id | `source_order_grandson_id` | Long |
| 108 | `sourceOrderId` | 请检来源订单id | `source_order_id` | Long |
| 109 | `sourceOrderRowId` | 请检来源订单行id | `source_order_row_id` | Long |
| 110 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |

---

## 关联属性（18个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `pk_stockstate` | 放行后库存状态ID | `st.stockStatusRecord.stockStatusRecord` | Service |  |
| 2 | `checkapplyId` | 检验申请Id | `QMSQIT.LLCheckApply.LLCheckApply` | None |  |
| 3 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `definect_b` | 表体自定义项特征 | `QMSQIT.passbill.PassbillbDefineCharacter` | None |  |
| 6 | `reservedobj` | 跟踪线索 | `st.reservation.Reservation` | Service |  |
| 7 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 8 | `castunitid` | 单位ID | `pc.unit.Unit` | Service |  |
| 9 | `checkapplySourceId` | 检验申请源单ID | `QMSQIT.LLCheckApply.LLSourceInformation` | None |  |
| 10 | `pk_batchcodeId` | 批次 | `st.batchno.Batchno` | Service |  |
| 11 | `cunitid` | 主单位ID | `pc.unit.Unit` | Service |  |
| 12 | `inspectUnitId` | 检验单位 | `pc.unit.Unit` | Service |  |
| 13 | `pk_materialsku` | 物料SKU | `pc.product.ProductSKU` | Service |  |
| 14 | `pk_material` | 物料ID | `pc.product.Product` | Service |  |
| 15 | `bodydefines` | 紧急放行单表体自定义项 | `QMSQIT.passbill.passbill_b_define` | None | true |
| 16 | `freect_b` | 表体物料自由项特征组实体 | `QMSQIT.passbill.PassbillFree` | None |  |
| 17 | `pk_passbill` | 主表ID | `QMSQIT.passbill.passbill` | None | true |
| 18 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
