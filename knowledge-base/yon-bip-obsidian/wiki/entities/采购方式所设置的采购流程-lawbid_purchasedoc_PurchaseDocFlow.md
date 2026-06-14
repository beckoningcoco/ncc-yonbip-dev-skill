---
tags: ["BIP", "元数据", "数据字典", "ycSouring", "lawbid.purchasedoc.PurchaseDocFlow"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 采购方式所设置的采购流程 (`lawbid.purchasedoc.PurchaseDocFlow`)

> **平台版本：BIP 旗舰版 V5**

> ycSouring 模块 | 物理表：`cpu_purchase_doc_flow`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购方式所设置的采购流程 |
| 物理表 | `cpu_purchase_doc_flow` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouring` |
| 构建时间 | `2026-06-04 20:00:33.4130` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

## 部署信息

- 部署时间: 2026-01-23 23:56:15:000

## 依赖接口（3个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 2 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 3 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |

---

## 直接属性（28个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bidOpenMode` | 开标方式 | `bid_open_mode` | String |
| 2 | `bidType` | 竞争方式编码 | `bid_type` | String |
| 3 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 4 | `combineNoticeAndFile` | 采购公告和文件合并 | `combine_notice_and_file` | Integer |
| 5 | `decisionType` | 评审方式 | `decision_type` | String |
| 6 | `defaultFlow` | 默认流程 | `default_flow` | Short |
| 7 | `disablets` | 停用时间 | `disablets` | DateTime |
| 8 | `dr` | 逻辑删除标记 | `dr` | Short |
| 9 | `enable` | 启用状态 | `enable` | Short |
| 10 | `enablets` | 启用时间 | `enablets` | DateTime |
| 11 | `evalBidMode` | 评标方式 | `eval_bid_mode` | String |
| 12 | `firstStageContainPrice` | 一阶段是否包含价格 | `first_stage_contain_price` | Short |
| 13 | `flowDefId` | 流程档案 | `flow_def_id` | 63da33d0-e4a3-40b5-8e85-839d78680826 |
| 14 | `hasFileEncrypt` | 投标文件是否加密 | `has_file_encrypt` | Short |
| 15 | `id` | ID | `id` | Long |
| 16 | `isContainPreQualification` | 是否包含初审 | `is_contain_pre_qualification` | Short |
| 17 | `isSupplementNotice` | 是否补录招标公告 | `is_supplement_notice` | Short |
| 18 | `issuance` | 选择文件发售 | `issuance` | Short |
| 19 | `multipleStageBid` | 是否两阶段招标 | `multiple_stage_bid` | Integer |
| 20 | `noticeGetBiddoc` | 报名是否需要领取标书 | `notice_get_biddoc` | Short |
| 21 | `pubts` | 时间戳 | `pubts` | DateTime |
| 22 | `purchaseDocId` | 采购方式档案 | `purchase_doc_id` | 81c6880b-694a-4667-987f-81b5615f2401 |
| 23 | `secondStageContainPrice` | 二阶段是否包含价格 | `second_stage_contain_price` | Short |
| 24 | `secondStageDecisionType` | 二阶段评审方式 | `second_stage_decision_type` | String |
| 25 | `showCandidate` | 是否需要候选人公示 | `show_candidate` | Integer |
| 26 | `showTenderSummary` | 是否需要招标小结 | `show_tendersummary` | Short |
| 27 | `supplementItem` | 补录项目 | `supplement_item` | Short |
| 28 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `flowDefId` | 流程档案 | `flow.flowdef.FlowDefBasicInfo` | Service |  |
| 3 | `purchaseDocId` | 采购方式档案 | `lawbid.purchasedoc.PurchaseDoc` | None | true |
