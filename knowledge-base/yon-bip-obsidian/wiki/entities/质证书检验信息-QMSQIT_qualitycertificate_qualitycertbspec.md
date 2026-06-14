---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.qualitycertificate.qualitycertbspec"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 质证书检验信息 (`QMSQIT.qualitycertificate.qualitycertbspec`)

> QMSQIT | 物理表：`qms_qit_qualitycert_b`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 质证书检验信息 |
| 物理表 | `qms_qit_qualitycert_b` |
| domain/服务域 | `QMS-QIT` |
| schema | `qms_qit_rejectbill` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:43:26.5980` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

---

## 直接属性（73个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `tenant` | 租户ID | `tenant_id` | String |
| 3 | `id` | 主键 | `id` | Long |
| 4 | `pk_qualitycertificate` | 质证书 | `pk_qualitycertificate` | 9b2e9286-3bce-41a7-beb0-79646bc1f8f7 |
| 5 | `rownum` | 行号 | `row_num` | Integer |
| 6 | `inspectordercode` | 检验单号 | `inspectordercode` | String |
| 7 | `inspectiontype` | 检验类型 | `inspectiontype` | String |
| 8 | `inspectdate` | 检验日期 | `inspectdate` | Date |
| 9 | `pk_inspect_plan` | 检验方案 | `pk_inspect_plan` | 14bcdfef-7982-4772-baf8-e0d6ebef507e |
| 10 | `pk_inspect_plandetail` | 检验方案主表id | `pk_inspect_plandetail` | cacc3797-7e23-44d9-aad5-ebfe0c680961 |
| 11 | `inspectResult` | 检验结果 | `inspectResult` | String |
| 12 | `pk_stockorg` | 库存组织 | `pk_stockorg` | e18e914b-4518-4e8c-ac21-783145fe7da1 |
| 13 | `purchaseordercode` | 客户采购订单号 | `purchaseordercode` | String |
| 14 | `ordercode` | 源头单据号 | `ordercode` | String |
| 15 | `orderrowno` | 源头单据行号 | `orderrowno` | String |
| 16 | `pk_order` | 源头单据 | `pk_order` | String |
| 17 | `pk_order_billtype` | 源头单据类型 | `pk_order_billtype` | String |
| 18 | `pk_order_b` | 源头单据行 | `pk_order_b` | String |
| 19 | `vsrctype` | 来源单据类型 | `vsrctype` | String |
| 20 | `vsrccode` | 来源单据号 | `vsrccode` | String |
| 21 | `vsrcid` | 来源单据 | `vsrcid` | String |
| 22 | `vsrcrowno` | 来源单据行号 | `vsrcrowno` | String |
| 23 | `vsrcbid` | 来源单据行 | `vsrcbid` | String |
| 24 | `pk_instockbatch` | 批次id | `pk_instockbatch` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 25 | `instockbatchcode` | 批次号 | `instockbatchcode` | String |
| 26 | `num` | 数量 | `num` | Decimal |
| 27 | `outstockdate` | 出库日期 | `outstockdate` | DateTime |
| 28 | `keyitem_b` | 关键项目 | `keyitem_b` | Boolean |
| 29 | `outstockcode` | 出库单号 | `outstockcode` | String |
| 30 | `definect_b` | 检验信息自定义项 | `definect_b` | 599c7c9a-7ce4-4f04-9f25-45233cc39a48 |
| 31 | `pkDfmCheckRecord` | 检验记录id | `pk_dfmcheckrecord` | 631cb01f-3080-4010-9744-e5b5bea34d6a |
| 32 | `unitid` | 计量单位 | `unitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 33 | `makeRuleCode` | 生单规则编码 | `makerule_code` | String |
| 34 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 35 | `pk_detectbasis` | 检测依据 | `pk_detectbasis` | f0529fa3-5e4b-444a-8212-716743519d68 |
| 36 | `dr` | 逻辑删除标记 | `dr` | Short |
| 37 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 38 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 39 | `source` | 上游单据类型 | `source` | String |
| 40 | `upcode` | 上游单据号 | `upcode` | String |
| 41 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 42 | `define1` | 自定义项1 | `define1` | String |
| 43 | `define2` | 自定义项2 | `define2` | String |
| 44 | `define3` | 自定义项3 | `define3` | String |
| 45 | `define4` | 自定义项4 | `define4` | String |
| 46 | `define5` | 自定义项5 | `define5` | String |
| 47 | `define6` | 自定义项6 | `define6` | String |
| 48 | `define7` | 自定义项7 | `define7` | String |
| 49 | `define8` | 自定义项8 | `define8` | String |
| 50 | `define9` | 自定义项9 | `define9` | String |
| 51 | `define10` | 自定义项10 | `define10` | String |
| 52 | `define11` | 自定义项11 | `define11` | String |
| 53 | `define12` | 自定义项12 | `define12` | String |
| 54 | `define13` | 自定义项13 | `define13` | String |
| 55 | `define14` | 自定义项14 | `define14` | String |
| 56 | `define15` | 自定义项15 | `define15` | String |
| 57 | `define16` | 自定义项16 | `define16` | String |
| 58 | `define17` | 自定义项17 | `define17` | String |
| 59 | `define18` | 自定义项18 | `define18` | String |
| 60 | `define19` | 自定义项19 | `define19` | String |
| 61 | `define20` | 自定义项20 | `define20` | String |
| 62 | `define21` | 自定义项21 | `define21` | String |
| 63 | `define22` | 自定义项22 | `define22` | String |
| 64 | `define23` | 自定义项23 | `define23` | String |
| 65 | `define24` | 自定义项24 | `define24` | String |
| 66 | `define25` | 自定义项25 | `define25` | String |
| 67 | `define26` | 自定义项26 | `define26` | String |
| 68 | `define27` | 自定义项27 | `define27` | String |
| 69 | `define28` | 自定义项28 | `define28` | String |
| 70 | `define29` | 自定义项29 | `define29` | String |
| 71 | `define30` | 自定义项30 | `define30` | String |
| 72 | `pubts` | 时间戳 | `pubts` | DateTime |
| 73 | `qualitycertinspectitemList` | 质证书检验项目 | `` | 1d7d6cf9-ae14-4d17-8942-60b552df75af |

---

## 关联属性（11个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `definect_b` | 检验信息自定义项 | `QMSQIT.qualitycertificate.QtycertbspecDefineCharacter` | None |  |
| 3 | `pk_qualitycertificate` | 质证书 | `QMSQIT.qualitycertificate.qualitycertificate` | None | true |
| 4 | `qualitycertinspectitemList` | 质证书检验项目 | `QMSQIT.qualitycertificate.qualitycertinspectitem` | None | true |
| 5 | `pk_detectbasis` | 检测依据 | `QMSDFM.detectionbasis.qam_detectionbasis` | Service |  |
| 6 | `unitid` | 计量单位 | `pc.unit.Unit` | Service |  |
| 7 | `pkDfmCheckRecord` | 检验记录id | `QMSDFM.dfmCheck.QmsDfmCheckRecord` | Service |  |
| 8 | `pk_inspect_plan` | 检验方案 | `QMSDFM.inspectionPlan.inspectionPlan` | Service |  |
| 9 | `pk_instockbatch` | 批次id | `st.batchno.Batchno` | Service |  |
| 10 | `pk_inspect_plandetail` | 检验方案主表id | `QMSDFM.inspectionPlan.inspectionPlanDetail` | Service |  |
| 11 | `pk_stockorg` | 库存组织 | `org.func.InventoryOrg` | Service |  |
