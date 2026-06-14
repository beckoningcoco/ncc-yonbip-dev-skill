---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.LLCheckApply.PreparationInfo"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 制样信息 (`QMSQIT.LLCheckApply.PreparationInfo`)

> QMSQIT | 物理表：`qms_qit_llapply_prepareinfo`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 制样信息 |
| 物理表 | `qms_qit_llapply_prepareinfo` |
| domain/服务域 | `QMS-QIT` |
| schema | `qms_qit_rejectbill` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:42:45.9840` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

---

## 直接属性（12个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | 主键 | `id` | Long |
| 3 | `inspectStepOrder` | 检验步骤顺序 | `inspectstep_order` | Integer |
| 4 | `inspectStepId` | 检验步骤 | `inspectstep_id` | 0267b439-f9c9-4267-916c-66139b0f3627 |
| 5 | `preparationPlanId` | 制样方案 | `preparationplan_id` | d0c92763-f04e-4002-9fbb-7e88ab1acdf0 |
| 6 | `preparationNum` | 制样个数 | `preparation_num` | Integer |
| 7 | `parentId` | 检验申请ID | `parent_id` | 0eee67eb-f19b-41be-bd6c-2bb2c555d489 |
| 8 | `preparationSize` | 制样大小 | `preparation_size` | String |
| 9 | `preparationForm` | 制样样品形态 | `preparation_form` | String |
| 10 | `preparationDesc` | 制样说明 | `preparation_desc` | String |
| 11 | `dr` | 逻辑删除标记 | `dr` | Short |
| 12 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `inspectStepId` | 检验步骤 | `QMSQIT.inspectstepdefine.InspectStepDefine` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `preparationPlanId` | 制样方案 | `QMSQIT.samplepreparationplan.SamplePreparationPlan` | None |  |
| 4 | `parentId` | 检验申请ID | `QMSQIT.LLCheckApply.LLCheckApply` | None | true |
