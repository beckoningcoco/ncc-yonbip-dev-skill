---
tags: ["BIP", "元数据", "数据字典", "lawbid.scoreplan.BidScorePlan"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 方案标段评标模板 (`lawbid.scoreplan.BidScorePlan`)

> **平台版本：BIP 旗舰版 V5**

>  模块 | 物理表：`cpu_bid_score_template`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 方案标段评标模板 |
| 物理表 | `cpu_bid_score_template` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `` |
| 构建时间 | `2026-06-04 20:02:45.8970` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

## 部署信息

- 部署时间: 2025-10-24 23:57:33:000

## 依赖接口（4个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 企业ID | `cpu-base.itf.IEnterprise` | 7 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 4 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |

---

## 直接属性（49个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `applicableOrgCode` | 适用组织编码 | `applicable_org_code` | String |
| 2 | `applicableOrgId` | 适用单位主键 | `applicable_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 3 | `applicableOrgName` | 适用组织名称 | `applicable_org_name` | String |
| 4 | `applicableProjectType` | 适用项目类型 | `applicable_project_type` | String |
| 5 | `applicablePurContent` | 适用采购内容 | `applicable_pur_content` | String |
| 6 | `applicablePurMethod` | 适用采购方式 | `applicable_pur_method` | String |
| 7 | `baseType` | 基准值 | `base_type` | Integer |
| 8 | `beTemplate` | 是否模板 | `be_template` | Integer |
| 9 | `bidPriceWeight` | 价格分权重 | `bid_price_weight` | Decimal |
| 10 | `bidScorePlanSegments` | 评标环节 | `` | 89b6414c-2d9a-4b4f-9faa-a2cbdd58f101 |
| 11 | `bidSectionId` | 标段ID | `bid_section_id` | Long |
| 12 | `bidType` | 竞争方式 | `bid_type` | String |
| 13 | `billMakerId` | 制单人ID | `bill_maker_id` | String |
| 14 | `billMakerName` | 制单人名称 | `bill_maker_name` | String |
| 15 | `billVersionId` | 版本id | `bill_version_id` | Long |
| 16 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 17 | `code` | 模板编码 | `template_code` | String |
| 18 | `defaults` | 默认值 | `defaults` | Integer |
| 19 | `dr` | 逻辑删除标记 | `dr` | Short |
| 20 | `e1` | 减分系数-投标价格大于基准价 | `e1` | Decimal |
| 21 | `e2` | 减分系数-投标价格小于基准价 | `e2` | Decimal |
| 22 | `effectiveStatus` | 生效状态 | `effective_status` | String |
| 23 | `enable` | 状态 | `enable_status` | Integer |
| 24 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 25 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 26 | `evaluationMethod` | 评分形式 | `evaluation_method` | String |
| 27 | `evaluationStageList` | 评审步骤 | `` | b0c01a2d-313f-47c3-935e-cd1dcf661e29 |
| 28 | `floatingRatio` | 浮动比例 | `floating_ratio` | Decimal |
| 29 | `formulaTxt` | 公式内容 | `formula_txt` | String |
| 30 | `formulaType` | 公式类型 | `formula_type` | Integer |
| 31 | `id` | ID | `id` | Long |
| 32 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 33 | `overall` | 是否全局 | `overall` | Integer |
| 34 | `parentId` | 模板ID | `parent_id` | Long |
| 35 | `planName` | 模板名称 | `template_name` | String |
| 36 | `planType` | 单据类型 | `template_type` | String |
| 37 | `priceCalcType` | 价格分计算依据 | `price_calc_type` | Integer |
| 38 | `priceScore` | 价格分总分 | `price_score` | Decimal |
| 39 | `pubts` | 时间戳 | `ts` | DateTime |
| 40 | `purchaseCode` | 采购方式编码 | `purchase_code` | String |
| 41 | `purchaseName` | 采购方式名称 | `purchase_name` | String |
| 42 | `qualifyCheckType` | 资格审核方式 | `qualify_check_type` | Integer |
| 43 | `round` | 当前评标模板轮次 | `round` | Integer |
| 44 | `scoreDimension` | 评标维度 | `score_dimension` | String |
| 45 | `scoreMethod` | 模板类型 | `score_method` | String |
| 46 | `scoreMethodValue` | 模板类型名称 | `score_method_value` | String |
| 47 | `totalScore` | 评审总分 | `total_score` | Decimal |
| 48 | `version` | 版本 | `version` | String |
| 49 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `bidScorePlanSegments` | 评标环节 | `lawbid.scoreplan.BidScorePlanSegment` | None | true |
| 3 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 4 | `evaluationStageList` | 评审步骤 | `lawbid.scoreplan.BidScoreEvaluationStage` | None | true |
| 5 | `applicableOrgId` | 适用单位主键 | `org.func.BaseOrg` | Service |  |
