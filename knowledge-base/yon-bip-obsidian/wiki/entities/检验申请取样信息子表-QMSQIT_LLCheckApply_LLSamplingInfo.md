---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.LLCheckApply.LLSamplingInfo"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验申请取样信息子表 (`QMSQIT.LLCheckApply.LLSamplingInfo`)

> QMSQIT | 物理表：`qms_qit_llapply_samping`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验申请取样信息子表 |
| 物理表 | `qms_qit_llapply_samping` |
| domain/服务域 | `QMS-QIT` |
| schema | `qms_qit_rejectbill` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:42:43.2340` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

---

## 直接属性（16个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | 主键 | `id` | Long |
| 3 | `parentId` | 来料检验申请ID | `parent_id` | 0eee67eb-f19b-41be-bd6c-2bb2c555d489 |
| 4 | `inspectStepOrder` | 检验步骤顺序 | `inspect_step_order` | Integer |
| 5 | `inspectStepId` | 检验步骤 | `inspect_step_id` | 0267b439-f9c9-4267-916c-66139b0f3627 |
| 6 | `samplingNum` | 取样个数 | `sampling_num` | Integer |
| 7 | `samplingLocation` | 取样位置 | `sampling_location` | String |
| 8 | `samplingDirection` | 取样方向 | `sampling_direction` | String |
| 9 | `samplingSize` | 取样大小 | `sampling_size` | String |
| 10 | `samplingSite` | 取样地点 | `sampling_site` | String |
| 11 | `samplingContainer` | 取样容器 | `sampling_container` | String |
| 12 | `samplingMorphology` | 取样形态 | `sampling_morphology` | String |
| 13 | `samplingMemo` | 取样说明 | `sampling_memo` | String |
| 14 | `sampleplanId` | 取样方案 | `sampling_plan` | 5961aff7-b759-4498-a39b-6aef93301023 |
| 15 | `dr` | 逻辑删除标记 | `dr` | Short |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `inspectStepId` | 检验步骤 | `QMSQIT.inspectstepdefine.InspectStepDefine` | None |  |
| 2 | `sampleplanId` | 取样方案 | `QMSQIT.samplingplan.SamplingPlan` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `parentId` | 来料检验申请ID | `QMSQIT.LLCheckApply.LLCheckApply` | None | true |
