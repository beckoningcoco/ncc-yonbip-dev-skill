---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.qualitycertificate.qualitycertinspectitemAll"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 整单检验项目 (`QMSQIT.qualitycertificate.qualitycertinspectitemAll`)

> QMSQIT | 物理表：`qms_qit_qualitycert_b_gds`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 整单检验项目 |
| 物理表 | `qms_qit_qualitycert_b_gds` |
| 数据库 schema | `QMS-QIT` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:43:27.9730` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（37个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ac_value` | AC | `ac_value` | Decimal |
| 2 | `attacheImage` | 结果图片 | `attacheImage` | String |
| 3 | `checkmethod` | 抽样方式(检验方式) | `checkmethod` | String |
| 4 | `definect_b_gds` | 检验项目自定义项 | `definect_b_gds` | 4d6c4c1e-31b0-495c-8977-92212c6da122 |
| 5 | `dr` | 逻辑删除标记 | `dr` | Short |
| 6 | `id` | ID | `id` | Long |
| 7 | `index_nature` | 质量指标性质 | `index_nature` | String |
| 8 | `initinspectvalue` | 原始检验值 | `initinspectvalue` | String |
| 9 | `inspectItemDetailId` | 检验项目主表id | `inspectitem_detail_id` | 3ef85f41-6ab5-4748-9805-2c9ccf03e399 |
| 10 | `inspect_max_value` | 最大值 | `inspect_max_value` | Decimal |
| 11 | `inspect_min_value` | 最小值 | `inspect_min_value` | Decimal |
| 12 | `inspectionitembId` | 检验方案项目信息id | `inspectionitemb_id` | 5b4c30ac-48b7-41ad-9875-0350d15062e2 |
| 13 | `inspectvalue` | 检验值 | `inspectvalue` | String |
| 14 | `inspectvalue_type` | 检验值类型 | `inspectvalue_type` | String |
| 15 | `inspectvalue_unit` | 检验值单位 | `inspectvalue_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 16 | `instockbatchcode` | 批次号 | `instockbatchcode` | String |
| 17 | `iteminspectResult` | 检验结果 | `iteminspectResult` | String |
| 18 | `pk_detectionbasis_item` | 检测依据 | `pk_detectionbasis_item` | f0529fa3-5e4b-444a-8212-716743519d68 |
| 19 | `pk_detectionmethod_item` | 检测方法 | `pk_detectionmethod_item` | 90d44bff-eef4-4fd8-a0c1-8ce14fbab951 |
| 20 | `pk_inspect_item` | 检验项目 | `pk_inspect_item` | 10e9d13b-12d5-44ea-8f94-ada2ea783264 |
| 21 | `pk_inspect_itemclass` | 检验项目分类 | `pk_inspect_itemclass` | c3b4c20b-a758-485f-8565-7cec8f466bf4 |
| 22 | `pk_instockbatch` | 批次id | `pk_instockbatch` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 23 | `pk_qualitycertbspec` | 质证书检验信息 | `pk_qualitycertbspec` | 17987ef5-c503-49c9-a01a-f1d881ef8347 |
| 24 | `pk_qualitycertificate` | 质证书 | `pk_qualitycertificate` | 9b2e9286-3bce-41a7-beb0-79646bc1f8f7 |
| 25 | `printnum` | 打印顺序 | `printnum` | Integer |
| 26 | `pubts` | 时间戳 | `pubts` | DateTime |
| 27 | `purchaseordercode` | 客户采购订单号 | `purchaseordercode` | String |
| 28 | `qualified_number` | 单项合格数量 | `qualified_number` | Decimal |
| 29 | `qualitycertbspec_rownum` | 详细信息行号 | `qualitycertbspec_rownum` | String |
| 30 | `re_value` | RE | `re_value` | Decimal |
| 31 | `rownum` | 行号 | `row_num` | Integer |
| 32 | `sampleplantype` | 抽样方案 | `sampleplantype` | String |
| 33 | `standard_value` | 标准值 | `standard_value` | String |
| 34 | `standardnote` | 标准描述 | `standardnote` | String |
| 35 | `tenant` | 租户ID | `tenant_id` | String |
| 36 | `unqualified_number` | 单项不合格数量 | `unqualified_number` | Decimal |
| 37 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（12个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `inspectionitembId` | 检验方案项目信息id | `QMSDFM.inspectionPlan.inspectionItemB` | Service |  |
| 2 | `pk_inspect_itemclass` | 检验项目分类 | `QMSDFM.checkProjectClass.checkProjectClass` | Service |  |
| 3 | `pk_qualitycertbspec` | 质证书检验信息 | `QMSQIT.qualitycertificate.qualitycertbspec` | None |  |
| 4 | `inspectvalue_unit` | 检验值单位 | `pc.unit.Unit` | Service |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `pk_detectionmethod_item` | 检测方法 | `QMSDFM.detectionMethod.QmsDfmDetectionMethod` | Service |  |
| 7 | `inspectItemDetailId` | 检验项目主表id | `QMSDFM.checkProject.checkProjectDetail` | Service |  |
| 8 | `pk_detectionbasis_item` | 检测依据 | `QMSDFM.detectionbasis.qam_detectionbasis` | Service |  |
| 9 | `pk_qualitycertificate` | 质证书 | `QMSQIT.qualitycertificate.qualitycertificate` | None | true |
| 10 | `pk_instockbatch` | 批次id | `st.batchno.Batchno` | Service |  |
| 11 | `definect_b_gds` | 检验项目自定义项 | `QMSQIT.qualitycertificate.QtycertinsitemDefineCharacter` | None |  |
| 12 | `pk_inspect_item` | 检验项目 | `QMSDFM.checkProject.checkProject` | Service |  |
