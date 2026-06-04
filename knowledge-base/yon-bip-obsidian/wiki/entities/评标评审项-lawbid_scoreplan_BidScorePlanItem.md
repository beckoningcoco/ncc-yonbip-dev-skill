---
tags: ["BIP", "元数据", "数据字典", "lawbid.scoreplan.BidScorePlanItem"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 评标评审项 (`lawbid.scoreplan.BidScorePlanItem`)

> **平台版本：BIP 旗舰版 V5**

>  模块 | 物理表：`cpu_bid_score_item`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 评标评审项 |
| 物理表 | `cpu_bid_score_item` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `` |
| 构建时间 | `2026-06-04 20:16:47.3090` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

## 部署信息

- 部署时间: 2026-05-22 23:55:05:000

## 依赖接口（4个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 企业ID | `cpu-base.itf.IEnterprise` | 7 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 4 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |

---

## 直接属性（39个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `agoItemId` | 上一阶段对应的itemid | `ago_item_id` | Long |
| 2 | `belowPercentage` | 低于百分比 | `below_percentage` | String |
| 3 | `belowReduceScore` | 低于百分比扣除分数 | `below_reduce_score` | String |
| 4 | `benchmarkPrice` | 基准价取值 | `benchmark_price` | String |
| 5 | `bidDocumentSectionFileId` | 投标文件设置 | `bidfile_template_id` | String |
| 6 | `bidScorePlanId` | 评分模板主键 | `bid_score_template_id` | 47d2f6a7-a9be-4eb1-af5f-b15b0564d14a |
| 7 | `bidScorePlanItemFiles` | 评标指标与评标文件模板关联表 | `` | e374c96e-5379-4875-bf8e-1778d8c86dad |
| 8 | `bidScorePlanSegmentId` | 评分环节主键 | `bid_score_segment_id` | 89b6414c-2d9a-4b4f-9faa-a2cbdd58f101 |
| 9 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 10 | `calculationFormula` | 计算公式 | `calculation_formula` | String |
| 11 | `computingMode` | 计算模式 | `computing_mode` | String |
| 12 | `deviation` | 偏离度 | `deviation` | Decimal |
| 13 | `deviationControl` | 偏离度控制 | `deviation_control` | Integer |
| 14 | `dr` | 逻辑删除标记 | `dr` | Short |
| 15 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 16 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 17 | `formulaTemplateCopyId` | 价格分模板复制 | `formula_template_copy_id` | Long |
| 18 | `formulaTemplateId` | 价格分模板ID | `formula_template_id` | Long |
| 19 | `formulaTemplateName` | 价格分模板名称 | `formula_template_name` | String |
| 20 | `id` | ID | `id` | Long |
| 21 | `ifVetoItem` | 否决项 | `if_veto_item` | String |
| 22 | `maxScore` | 分值上限 | `max_score` | Decimal |
| 23 | `maxVoteNum` | 最多投票数量 | `max_vote_num` | Integer |
| 24 | `minScore` | 分值下限 | `min_score` | Decimal |
| 25 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 26 | `overPercentage` | 超过百分比 | `over_percentage` | String |
| 27 | `overReduceScore` | 超过百分比扣除分数 | `over_reduce_score` | String |
| 28 | `pubts` | 时间戳 | `ts` | DateTime |
| 29 | `quotaDescribe` | 指标描述 | `quota_describe` | String |
| 30 | `quotaName` | 指标名称 | `quota_name` | String |
| 31 | `quotaType` | 指标类型 | `quota_type` | String |
| 32 | `reviewFactor` | 评审因素 | `review_factor` | String |
| 33 | `reviewProject` | 评审项目 | `review_project` | String |
| 34 | `reviewStandard` | 评分标准 | `review_standard` | String |
| 35 | `scoreMaximum` | 分数上限 | `score_maximum` | Decimal |
| 36 | `scoreMinimum` | 分数下限 | `score_minimum` | Decimal |
| 37 | `serialNumber` | 序号 | `serial_number` | Integer |
| 38 | `voteType` | 投票类型 | `vote_type` | String |
| 39 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bidScorePlanItemFiles` | 评标指标与评标文件模板关联表 | `lawbid.scoreplan.BidScorePlanItemFile` | None | true |
| 2 | `bidScorePlanSegmentId` | 评分环节主键 | `lawbid.scoreplan.BidScorePlanSegment` | None | true |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `bidScorePlanId` | 评分模板主键 | `lawbid.scoreplan.BidScorePlan` | None |  |
| 5 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
