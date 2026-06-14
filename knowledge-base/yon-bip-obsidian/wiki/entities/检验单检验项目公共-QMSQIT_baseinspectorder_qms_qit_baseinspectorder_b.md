---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.baseinspectorder.qms_qit_baseinspectorder_b"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验单检验项目公共 (`QMSQIT.baseinspectorder.qms_qit_baseinspectorder_b`)

> QMSQIT | 物理表：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验单检验项目公共 |
| 物理表 | `` |
| domain/服务域 | `QMS-QIT` |
| schema | `qms_qit_rejectbill` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:47:35.8990` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（46个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ac_value` | AC | `ac_value` | Decimal |
| 2 | `accuracy` | 小数位数 | `accuracy` | Integer |
| 3 | `attach_sample_b` | 附加样本 | `attach_sample_b` | String |
| 4 | `attachmentId` | 附件 | `attachmentId` | String |
| 5 | `badItemFlag` | 不良项目标识 | `badItemFlag` | String |
| 6 | `dr` | 逻辑删除标记 | `dr` | Short |
| 7 | `feature` | 特征 | `characteristic` | 1a5d304f-40a4-47a2-a075-f8b5ab6af37b |
| 8 | `fixed_samples` | 固定抽样数 | `fixed_samples` | Integer |
| 9 | `formula` | 计算公式 | `formula` | String |
| 10 | `id` | ID | `id` | String |
| 11 | `index_nature` | 质量指标性质 | `index_nature` | String |
| 12 | `inspect_avg_value` | 平均值 | `inspect_avg_value` | Decimal |
| 13 | `inspect_max_value` | 最大值 | `inspect_max_value` | Decimal |
| 14 | `inspect_min_value` | 最小值 | `inspect_min_value` | Decimal |
| 15 | `inspect_type` | 检验方式 | `inspect_type` | String |
| 16 | `inspectdate` | 检验日期 | `inspectdate` | Date |
| 17 | `inspectionValueEnum` | 检验值枚举 | `inspectionValueEnum` | String |
| 18 | `inspectionitembId` | 检验方案项目信息id | `inspectionitemb_id` | 5b4c30ac-48b7-41ad-9875-0350d15062e2 |
| 19 | `inspector` | 检验员 | `inspector` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 20 | `inspecttime` | 检验时间 | `inspecttime` | DateTime |
| 21 | `inspectvalue_actually` | 检验值 | `inspectvalue_actually` | String |
| 22 | `inspectvalue_type` | 检验值类型 | `inspectvalue_type` | String |
| 23 | `inspectvalue_unit` | 检验值单位 | `inspectvalue_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 24 | `judgment_result` | 判定结果 | `judgment_result` | String |
| 25 | `keyitem_b` | 关键项目 | `keyitem_b` | String |
| 26 | `multisample_inspectval_type` | 多样本检验值 | `multisample_inspectval_type` | String |
| 27 | `pk_inspect_detectbasis` | 检测依据 | `pk_inspect_detectbasis` | f0529fa3-5e4b-444a-8212-716743519d68 |
| 28 | `pk_inspect_item` | 检验项目 | `pk_inspect_item` | 10e9d13b-12d5-44ea-8f94-ada2ea783264 |
| 29 | `pk_inspect_method` | 检测方法 | `pk_inspect_method` | 90d44bff-eef4-4fd8-a0c1-8ce14fbab951 |
| 30 | `pk_inspectorder_h` | 检验单id | `pk_inspectorder_h` | 30720069-2233-4271-8edb-a442eaab5e38 |
| 31 | `pk_sample_method` | 取样方式 | `pk_sample_method` | d21eaba0-3431-4238-b178-c6216a31b34b |
| 32 | `pubts` | 时间戳 | `pubts` | DateTime |
| 33 | `qms_qit_inspectorder_sim_recordList_fixed` | 样本记录公共 | `` | b4fec3eb-7e82-44a8-a4a9-c83b2c15eeff |
| 34 | `qualified_number` | 合格数量 | `qualified_number` | Decimal |
| 35 | `qualify_grade_result` | 质量等级结果 | `qualify_grade_result` | String |
| 36 | `re_value` | RE | `re_value` | Decimal |
| 37 | `record_value_b` | 记录样本值 | `record_value_b` | String |
| 38 | `round_off_rule` | 修约规则 | `round_off_rule` | String |
| 39 | `rownum` | 行号 | `row_num` | Integer |
| 40 | `spotcheck_rate` | 抽检率 | `spotcheck_rate` | Decimal |
| 41 | `standard_value` | 标准值1N | `standard_value` | String |
| 42 | `tenant` | 租户ID | `tenant_id` | String |
| 43 | `unqualified_number` | 不合格数量 | `unqualified_number` | Decimal |
| 44 | `unqualified_proj` | 不良项目 | `unqualified_proj` | 3de0c23e-ee02-46b4-bae7-0a982de498ce |
| 45 | `vnote` | 备注 | `vnote` | String |
| 46 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（12个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `inspectionitembId` | 检验方案项目信息id | `QMSDFM.inspectionPlan.inspectionItemB` | Service |  |
| 2 | `pk_inspect_method` | 检测方法 | `QMSDFM.detectionMethod.QmsDfmDetectionMethod` | Service |  |
| 3 | `feature` | 特征 | `base.character.Character` | Service |  |
| 4 | `unqualified_proj` | 不良项目 | `QMSDFM.badItems.badItems` | Service |  |
| 5 | `inspectvalue_unit` | 检验值单位 | `pc.unit.Unit` | Service |  |
| 6 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 7 | `qms_qit_inspectorder_sim_recordList_fixed` | 样本记录公共 | `QMSQIT.baseinspectorder.qms_qit_baseinspectorder_sim_record` | None | true |
| 8 | `inspector` | 检验员 | `bd.staff.Staff` | Service |  |
| 9 | `pk_inspect_detectbasis` | 检测依据 | `QMSDFM.detectionbasis.qam_detectionbasis` | Service |  |
| 10 | `pk_inspectorder_h` | 检验单id | `QMSQIT.baseinspectorder.qms_qit_baseinspectorder_h` | None | true |
| 11 | `pk_inspect_item` | 检验项目 | `QMSDFM.checkProject.checkProject` | Service |  |
| 12 | `pk_sample_method` | 取样方式 | `QMSDFM.sampleMethod.sampleMethod` | Service |  |
