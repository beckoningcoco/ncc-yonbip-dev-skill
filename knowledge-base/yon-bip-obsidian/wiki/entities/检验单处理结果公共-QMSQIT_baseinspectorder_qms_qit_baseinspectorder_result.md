---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.baseinspectorder.qms_qit_baseinspectorder_result"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验单处理结果公共 (`QMSQIT.baseinspectorder.qms_qit_baseinspectorder_result`)

> QMSQIT | 物理表：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验单处理结果公共 |
| 物理表 | `` |
| 数据库 schema | `QMS-QIT` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:47:38.1770` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（72个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `baditemFlag` | 不良品处理 | `baditemFlag` | String |
| 2 | `cbastunitid` | 检验单位 | `cbastunitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 3 | `cbunitid` | 主单位 | `cbunitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 4 | `define1` | 自定义项1 | `define1` | String |
| 5 | `define10` | 自定义项10 | `define10` | String |
| 6 | `define11` | 自定义项11 | `define11` | String |
| 7 | `define12` | 自定义项12 | `define12` | String |
| 8 | `define13` | 自定义项13 | `define13` | String |
| 9 | `define14` | 自定义项14 | `define14` | String |
| 10 | `define15` | 自定义项15 | `define15` | String |
| 11 | `define16` | 自定义项16 | `define16` | String |
| 12 | `define17` | 自定义项17 | `define17` | String |
| 13 | `define18` | 自定义项18 | `define18` | String |
| 14 | `define19` | 自定义项19 | `define19` | String |
| 15 | `define2` | 自定义项2 | `define2` | String |
| 16 | `define20` | 自定义项20 | `define20` | String |
| 17 | `define21` | 自定义项21 | `define21` | String |
| 18 | `define22` | 自定义项22 | `define22` | String |
| 19 | `define23` | 自定义项23 | `define23` | String |
| 20 | `define24` | 自定义项24 | `define24` | String |
| 21 | `define25` | 自定义项25 | `define25` | String |
| 22 | `define26` | 自定义项26 | `define26` | String |
| 23 | `define27` | 自定义项27 | `define27` | String |
| 24 | `define28` | 自定义项28 | `define28` | String |
| 25 | `define29` | 自定义项29 | `define29` | String |
| 26 | `define3` | 自定义项3 | `define3` | String |
| 27 | `define30` | 自定义项30 | `define30` | String |
| 28 | `define4` | 自定义项4 | `define4` | String |
| 29 | `define5` | 自定义项5 | `define5` | String |
| 30 | `define6` | 自定义项6 | `define6` | String |
| 31 | `define7` | 自定义项7 | `define7` | String |
| 32 | `define8` | 自定义项8 | `define8` | String |
| 33 | `define9` | 自定义项9 | `define9` | String |
| 34 | `dr` | 逻辑删除标记 | `dr` | Short |
| 35 | `firstStoredDate` | 首次入库日期 | `firstStoredDate` | DateTime |
| 36 | `free1` | 规格1 | `free1` | String |
| 37 | `free10` | 规格10 | `free10` | String |
| 38 | `free2` | 规格2 | `free2` | String |
| 39 | `free3` | 规格3 | `free3` | String |
| 40 | `free4` | 规格4 | `free4` | String |
| 41 | `free5` | 规格5 | `free5` | String |
| 42 | `free6` | 规格6 | `free6` | String |
| 43 | `free7` | 规格7 | `free7` | String |
| 44 | `free8` | 规格8 | `free8` | String |
| 45 | `free9` | 规格9 | `free9` | String |
| 46 | `handleType` | 处理方式 | `handleType` | 4406ea9f-9ed2-49d2-af46-8af10cca2b1a |
| 47 | `id` | ID | `id` | String |
| 48 | `inspectResult` | 检验结果 | `inspectResult` | String |
| 49 | `invaliddate` | 有效期 | `invaliddate` | DateTime |
| 50 | `is_storage` | 是否可入库 | `is_storage` | String |
| 51 | `nastnum` | 数量 | `nastnum` | Decimal |
| 52 | `nextInspectDate` | 下次检验日期 | `next_inspect_date` | Date |
| 53 | `nnum` | 主数量 | `nnum` | Decimal |
| 54 | `pk_baditem` | 不良项目 | `pk_baditem` | 3de0c23e-ee02-46b4-bae7-0a982de498ce |
| 55 | `pk_changematerial` | 改判物料 | `pk_changematerial` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 56 | `pk_changematerialsku` | 改判物料sku | `pk_changematerialsku` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 57 | `pk_inspectorder_h` | 检验单 | `pk_inspectorder_h` | 30720069-2233-4271-8edb-a442eaab5e38 |
| 58 | `pk_inspectorder_sourcelist` | 源单信息 | `pk_inspectorder_sourcelist` | 571e7669-96cf-4825-8491-42a5fd1d8a4d |
| 59 | `pk_instockbatchcode` | 批次号 | `pk_instockbatchcode` | String |
| 60 | `pk_material_h` | 表头物料 | `pk_material_h` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 61 | `pk_qualify_grade` | 质量等级 | `pk_qualify_grade` | String |
| 62 | `pk_stockstatus` | 库存状态 | `pk_stockstatus` | 5275f074-3e60-4b90-9771-20970f1e905c |
| 63 | `pk_storageunit` | 保质期单位 | `pk_storageunit` | String |
| 64 | `producedate` | 生产日期 | `producedate` | DateTime |
| 65 | `pubts` | 时间戳 | `pubts` | DateTime |
| 66 | `storage` | 保质期 | `storage` | String |
| 67 | `tenant` | 租户ID | `tenant_id` | String |
| 68 | `unitExchangeType` | 固定换算率 | `unitExchangeType` | Integer |
| 69 | `validityDate` | 有效期至 | `validityDate` | Date |
| 70 | `vbchangerate` | 换算率 | `vbchangerate` | String |
| 71 | `vbnote` | 备注 | `vbnote` | String |
| 72 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（11个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `pk_changematerialsku` | 改判物料sku | `pc.product.ProductSKU` | Service |  |
| 2 | `pk_stockstatus` | 库存状态 | `st.stockStatusRecord.stockStatusRecord` | Service |  |
| 3 | `pk_baditem` | 不良项目 | `QMSDFM.badItems.badItems` | Service |  |
| 4 | `pk_changematerial` | 改判物料 | `pc.product.Product` | Service |  |
| 5 | `cbunitid` | 主单位 | `pc.unit.Unit` | Service |  |
| 6 | `pk_material_h` | 表头物料 | `pc.product.Product` | Service |  |
| 7 | `handleType` | 处理方式 | `QMSDFM.treatmethod.treatmethod` | Service |  |
| 8 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 9 | `pk_inspectorder_h` | 检验单 | `QMSQIT.baseinspectorder.qms_qit_baseinspectorder_h` | None |  |
| 10 | `pk_inspectorder_sourcelist` | 源单信息 | `QMSQIT.baseinspectorder.qms_qit_baseinspectorder_sourcelist` | None | true |
| 11 | `cbastunitid` | 检验单位 | `pc.unit.Unit` | Service |  |
