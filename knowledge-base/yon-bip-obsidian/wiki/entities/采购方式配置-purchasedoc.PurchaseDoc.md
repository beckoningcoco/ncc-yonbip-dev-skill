---
tags: ["BIP", "元数据", "数据字典", "ycSouring", "lawbid.purchasedoc.PurchaseDoc"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 采购方式配置 (`lawbid.purchasedoc.PurchaseDoc`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycSouring 模块实体元数据字典。
> 物理表：`cpu_purchase_doc` | 所属应用：`ycSouring`
> 来源：元数据API `queryByUri` 返回的 `lawbid.purchasedoc.PurchaseDoc` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购方式配置 |
| 物理表 | `cpu_purchase_doc` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouring` |
| 业务对象ID | `50ef7a70-1fc7-417b-be10-39bfa625880c` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:16:42.3000` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 主键 |
| 编码 | `purchase_code` | `purchase_code` | String | 采购方式编号（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-22 23:55:09:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-lawbid/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-lawbid/0010_iuap_common/DML/0270_iuap_metadata/202601281054_metadata_lawbid-purchasedoc_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `129d05b1-eac0-4343-b825-ab21ea5163ac`

## 业务场景

- `extdevelop`
- `billcode`

## 术语标记

`isMain`, `MasterData`

## 约束

- **primaryPurchasedocRule** (transformKey): 采购方式编号,采购方式名称 — 唯一字段: `['purchaseName']`
- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 7 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 跨租户采购商租户接口 (`IBuyerTenant`) | `cpu.itf.IBuyerTenant` | 10 | 1 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 3 | 自动编号 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| 4 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| 5 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 6 | 启用 (`IEnable`) | `ucfbase.ucfbaseItf.IEnable` | 141 | 3 |
| 7 | lawbidTenant租户相关 (`ITenant`) | `lawbid.itf.ITenant` | 2 | 1 |

---

## 直接属性（共 65 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `billStatus` | 是否开启(废) | `bill_status` | String | `text` |  | ✓ |
| 2 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 3 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 4 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 5 | `creatorId` | 创建人ID | `creator_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 6 | `disablets` | 停用时间 | `disablets` | DateTime | `timestamp` |  | ✓ |
| 7 | `calibrationAmendState` | 定标投票使用时是否可修改 | `calibration_amend_state` | Integer | `int` |  | ✓ |
| 8 | `calibrationVoteState` | 定标投票 | `calibration_vote_state` | Integer | `int` |  | ✓ |
| 9 | `ruleBiddersNum` | 控制开标供应商数量 | `rule_bidders_num` | Decimal | `number` |  | ✓ |
| 10 | `ruleBiddersNumControl` | 控制开标供应商数量强控标识 | `rule_bidders_num_control` | String | `text` |  | ✓ |
| 11 | `ruleBiddocSale` | 控制文件领取 | `rule_biddoc_sale` | Decimal | `number` |  | ✓ |
| 12 | `ruleBiddocSaleControl` | 控制文件领取强控标识 | `rule_biddoc_sale_control` | String | `text` |  | ✓ |
| 13 | `ruleCandidatesNum` | 控制候选人数量 | `rule_candidates_num` | Decimal | `number` |  | ✓ |
| 14 | `ruleCandidatesNumControl` | 控制候选人数量强控标识 | `rule_candidates_num_control` | String | `text` |  | ✓ |
| 15 | `ruleCandidatesTime` | 控制候选人公示期 | `rule_candidates_time` | Decimal | `number` |  | ✓ |
| 16 | `ruleCandidatesTimeControl` | 控制候选人公示期强控标识 | `rule_candidates_time_control` | String | `text` |  | ✓ |
| 17 | `ruleDecisionSupplynum` | 控制定标供应商数量 | `rule_decision_supplynum` | Decimal | `number` |  | ✓ |
| 18 | `ruleDecisionSupplynumControl` | 控制定标供应商数量强控标识 | `rule_decision_supplynum_control` | String | `text` |  | ✓ |
| 19 | `ruleDocQuestionend` | 控制询问质疑 | `rule_doc_questionend` | Decimal | `number` |  | ✓ |
| 20 | `ruleDocQuestionendControl` | 控制询问质疑强控标识 | `rule_doc_questionend_control` | String | `text` |  | ✓ |
| 21 | `ruleDocSubmitend` | 控制投标截止时间 | `rule_doc_submitend` | Decimal | `number` |  | ✓ |
| 22 | `ruleDocSubmitendControl` | 控制投标截止时间强控标识 | `rule_doc_submitend_control` | String | `text` |  | ✓ |
| 23 | `ruleEvaluationNum` | 控制评标专家数量 | `rule_evaluation_num` | Decimal | `number` |  | ✓ |
| 24 | `ruleEvaluationNumControl` | 控制评标专家数量强控标识 | `rule_evaluation_num_control` | String | `text` |  | ✓ |
| 25 | `ruleInvitationSupplynum` | 邀请供应商数量 | `rule_invitation_supplynum` | Decimal | `number` |  | ✓ |
| 26 | `ruleInvitationSupplynumControl` | 邀请供应商数量强控标识 | `rule_invitation_supplynum_control` | String | `text` |  | ✓ |
| 27 | `ruleOpenTimeControl` | 控制开标时间强控标识 | `rule_open_time_control` | String | `text` |  | ✓ |
| 28 | `ruleOpenTimeMethod` | 控制开标时间 | `rule_open_time_method` | String | `text` |  | ✓ |
| 29 | `tenantId` | tenant租户 | `tenant_id` | String | `text` |  | ✓ |
| 30 | `enablets` | 启用时间 | `enablets` | DateTime | `timestamp` |  | ✓ |
| 31 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 32 | `modifierId` | 更新人ID | `modifier_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 33 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 34 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 35 | `showSubenterprise` | 供应商是否显示(废) | `show_subenterprise` | Integer | `int` |  | ✓ |
| 36 | `supplierNum` | 供应商数量(废) | `supplier_num` | Integer | `int` |  | ✓ |
| 37 | `supplierNumPrefix` | 供应商数量限制(废) | `supplier_num_prefix` | String | `text` |  | ✓ |
| 38 | `combineNoticeAndFile` | 采购公告和文件合并 | `combine_notice_and_file` | Integer | `int` |  | ✓ |
| 39 | `ts` | 修改时间 | `ts` | DateTime | `timestamp` |  | ✓ |
| 40 | `id` | 主键 | `id` | Long | `long` |  | ✓ |
| 41 | `isUsing` | 是否使用中 | `is_using` | Boolean | `switch` |  | ✓ |
| 42 | `enable` | 状态 | `enable` | String | `text` |  | ✓ |
| 43 | `enterpriseName` | 租户名称 | `enterprise_name` | String | `text` |  | ✓ |
| 44 | `enableCA` | 是否启用CA签章 | `enable_ca` | String | `text` |  | ✓ |
| 45 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 46 | `enableCAModified` | 使用时不可修改 | `enable_ca_modified` | String | `text` |  | ✓ |
| 47 | `ytenant` | 租户 | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 48 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String | `text` |  | ✓ |
| 49 | `enterpriseId` | 所属租户 | `enterprise_id` | Long | `long` |  | ✓ |
| 50 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 51 | `code` | 采购方式编号 | `purchase_code` | String | `text` |  | ✓ |
| 52 | `purchaseName` | 采购方式名称 | `purchase_name` | String | `text` |  | ✓ |
| 53 | `bidType` | 默认竞争方式 | `bid_type` | String | `text` |  | ✓ |
| 54 | `modified` | 使用时是否可修改竞争方式 | `modified` | Integer | `int` |  | ✓ |
| 55 | `invite` | 广泛公开是否允许邀请供应商 | `invite` | Integer | `int` |  | ✓ |
| 56 | `quotationType` | 报价类型 | `quotation_type` | String | `text` |  | ✓ |
| 57 | `defaultCalibration` | 默认定标方式 | `default_calibration` | String | `text` |  | ✓ |
| 58 | `calibrationModified` | 使用时是否可修改定标方式 | `calibration_modified` | Integer | `int` |  | ✓ |
| 59 | `priceOpenType` | 价格开启方式 | `price_open_type` | String | `text` |  | ✓ |
| 60 | `decisionType` | 评审方式 | `decision_type` | String | `text` |  | ✓ |
| 61 | `viewBids` | 开标前查看投标名单 | `view_bids` | Integer | `int` |  | ✓ |
| 62 | `showCandidate` | 是否需要候选人公示 | `show_candidate` | Integer | `int` |  | ✓ |
| 63 | `transType` | 交易类型 | `trans_type` | String | `text` |  | ✓ |
| 64 | `bizTypes` | 采购方式所适用的业务类型 | `` | e5abb565-e7f8-4440-ac47-2a514f908181 | `` |  |  |
| 65 | `flows` | 采购方式所设置的采购流程 | `` | 51b620f3-fd52-4dbf-a38c-d40c310796ec | `` |  |  |

---

## 关联属性（共 5 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户 | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 2 | `flows` | 采购方式所设置的采购流程 | `lawbid.purchasedoc.PurchaseDocFlow` | `` | flows → purchaseDocId | 0..n | true | None |  |
| 3 | `creatorId` | 创建人ID | `base.user.User` | `creator_id` |  →  |  |  | Service |  |
| 4 | `modifierId` | 更新人ID | `base.user.User` | `modifier_id` |  →  |  |  | Service |  |
| 5 | `bizTypes` | 采购方式所适用的业务类型 | `lawbid.purchasedoc.PurchaseDocBizType` | `` | bizTypes → purchaseDocId | 0..n | true | None |  |

### Composition（子表）

- **flows**: `flows` → `lawbid.purchasedoc.PurchaseDocFlow` | 0..n
- **bizTypes**: `bizTypes` → `lawbid.purchasedoc.PurchaseDocBizType` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `creatorId` (创建人ID) | `base.user.User` | `creator_id` |
| `modifierId` (更新人ID) | `base.user.User` | `modifier_id` |
