---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "cpubase.quota.QuotaAgreeVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 配额协议 (`cpubase.quota.QuotaAgreeVO`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_qtagree` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `cpubase.quota.QuotaAgreeVO` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 配额协议 |
| 物理表 | `cpu_qtagree` |
| 数据库 schema | `cpu-base` |
| 所属应用 | `ycPriceCenter` |
| 业务对象ID | `a9b36f7b-e54d-47c7-a9f9-6d7b410f4a28` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:18:25.4930` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 协议id |
| 编码 | `code` | `code` | String | 协议编号（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-22 23:53:04:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202603311509_metadata_cpubase-quota_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `a07f38bb-a072-4caa-8355-206e94ef07cd`

## 业务场景

- `workflow`
- `UITemplate`
- `billcode`
- `userdefine`
- `api`
- `bpm`

## 术语标记

`isAssigned`, `isExtend`, `ConfigData`, `isMain`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 10 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 流程接口 (`IBusinessFlow`) | `base.itf.IBusinessFlow` | 77 | 2 |
| 2 | 生单回写 (`IBackWrite`) | `base.itf.IBackWrite` | 254 | 7 |
| 3 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 4 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 5 | 审批流信息 (`IApprovalFlow`) | `ucfbase.ucfbaseItf.IApprovalFlow` | 177 | 3 |
| 6 | 审批信息 (`IApprovalInfo`) | `ucfbase.ucfbaseItf.IApprovalInfo` | 85 | 2 |
| 7 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| 8 | 自动编码 (`IAutoCode`) | `ucfbase.ucfbaseItf.IAutoCode` | 37 | 0 |
| 9 | 启用 (`IEnable`) | `ucfbase.ucfbaseItf.IEnable` | 141 | 3 |
| 10 | 审计信息 (`YcIAuditInfo`) | `aa.priceformula.YcIAuditInfo` | 201 | 2 |

---

## 直接属性（共 58 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `orgId` | 组织id | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 2 | `code` | 协议编号 | `code` | String | `text` |  | ✓ |
| 3 | `memo` | 备注 | `memo` | String | `text` |  | ✓ |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 5 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 6 | `agreeTemplateId` | 配额协议模板ID | `agree_template_id` | cc252c54-0707-4f32-b1b1-8de1539bed0c | `quote` |  | ✓ |
| 7 | `exchRateType` | 汇率类型ID | `exch_rate_type` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | `quote` |  | ✓ |
| 8 | `overControl` | 配额超量控制 | `over_control` | Short | `short` |  | ✓ |
| 9 | `controlMethod` | 控制方式 | `control_method` | Short | `short` |  | ✓ |
| 10 | `purchaseClassId` | 采购品类ID | `purchase_class_id` | ec3f827d-4cff-462d-b74c-1dd556c96baa | `quote` |  | ✓ |
| 11 | `currency` | 币种 | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | ✓ |
| 12 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 | `quote` |  | ✓ |
| 13 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean | `switch` |  | ✓ |
| 14 | `sourceid` | 上游单据主表id | `sourceid` | Long | `long` |  | ✓ |
| 15 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long | `long` |  | ✓ |
| 16 | `source` | 上游单据类型 | `source` | String | `text` |  | ✓ |
| 17 | `upcode` | 上游单据号 | `upcode` | String | `text` |  | ✓ |
| 18 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String | `text` |  | ✓ |
| 19 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime | `timestamp` |  | ✓ |
| 20 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String | `text` |  | ✓ |
| 21 | `returncount` | 退回次数 | `returncount` | Short | `short` |  | ✓ |
| 22 | `auditor` | 审批人 | `auditor` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 23 | `auditTime` | 审批时间 | `audit_time` | DateTime | `timestamp` |  | ✓ |
| 24 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 25 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 26 | `enablets` | 启用时间 | `enablets` | DateTime | `dateTime` |  | ✓ |
| 27 | `disablets` | 停用时间 | `disablets` | DateTime | `dateTime` |  | ✓ |
| 28 | `creatorName` | 创建人名称 | `creatorName` | String | `text` |  | ✓ |
| 29 | `modifierName` | 修改人名称 | `modifierName` | String | `text` |  | ✓ |
| 30 | `tenant` | 租户ID | `tenant_id` | String | `text` |  | ✓ |
| 31 | `name` | 协议名称 | `name` | String | `multiLanguage` |  | ✓ |
| 32 | `businessType` | 业务场景 | `business_type` | String | `text` |  | ✓ |
| 33 | `allotplan` | 分配方案 | `allotplan` | EAllotPlan | `` |  | ✓ |
| 34 | `mainUnit` | 主单位ID | `main_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | ✓ |
| 35 | `id` | 协议id | `id` | Long | `long` |  | ✓ |
| 36 | `materialId` | 物料Id | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |  | ✓ |
| 37 | `manageClassId` | 物料分类ID | `material_class_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 | `quote` |  | ✓ |
| 38 | `enable` | 启用状态 | `enable` | sys_intboolean | `singleOption` |  | ✓ |
| 39 | `status` | 状态 | `status` | Short | `short` |  | ✓ |
| 40 | `isMaterialClass` | 是否物料分类 | `is_material_class` | Whether | `` |  | ✓ |
| 41 | `minSplitNum` | 最小拆分量 | `min_split_num` | Decimal | `number` |  | ✓ |
| 42 | `effectStartDate` | 有效起始日期 | `effect_start_date` | DateTime | `timestamp` |  | ✓ |
| 43 | `effectEndDate` | 有效截止日期 | `effect_end_date` | DateTime | `timestamp` |  | ✓ |
| 44 | `creatorId` | 创建人id | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 45 | `creator` | 创建人 | `creator` | String | `text` |  | ✓ |
| 46 | `vouchdate` | 协议创建日期 | `vouchdate` | Date | `date` | ✓ |  |
| 47 | `modifierId` | 更新人id | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 48 | `quotaAgreeChmId` | 物料自由项特征组 | `chm_id` | 3a473c17-111e-462d-9838-e98e3f3816bd | `FreeCT` |  | ✓ |
| 49 | `modifier` | 更新人 | `modifier` | String | `text` |  | ✓ |
| 50 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 51 | `quotaAgreeChdId` | 配额协议自定义项 | `chd_id` | 2edad68e-e44f-4f05-a675-90b9faa66d66 | `UserDefine` |  | ✓ |
| 52 | `modifyTime` | 更新时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 53 | `isWfControlled` | 是否支持审批流 | `isWfControlled` | Boolean | `switch` |  | ✓ |
| 54 | `verifystate` | 审批状态 | `verifystate` | Short | `short` |  | ✓ |
| 55 | `manageClassPath` | 物料分类内部码 | `material_class_path` | String | `text` |  | ✓ |
| 56 | `dr` | 逻辑删除 | `dr` | Short | `short` |  | ✓ |
| 57 | `QuotaAgreeAllotVOList` | 配额协议分配表体 | `` | 5e0b84a4-3569-4338-9773-f16632e21752 | `` |  |  |
| 58 | `QuotaAgreeOrgVOList` | 配额协议适用范围 | `` | 3bbffd81-79b3-4e24-8213-23e90a36de90 | `` |  |  |

---

## 关联属性（共 17 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `purchaseClassId` | 采购品类ID | `pc.cls.PurchaseClass` | `purchase_class_id` |  →  |  |  | Service |  |
| 2 | `mainUnit` | 主单位ID | `pc.unit.Unit` | `main_unit` |  →  |  |  | Service |  |
| 3 | `manageClassId` | 物料分类ID | `pc.cls.ManagementClass` | `material_class_id` |  →  |  |  | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 5 | `auditor` | 审批人 | `base.user.BipUser` | `auditor` |  →  |  |  | Service |  |
| 6 | `creatorId` | 创建人id | `base.user.User` | `creatorId` |  →  |  |  | Service |  |
| 7 | `modifierId` | 更新人id | `base.user.User` | `modifierId` |  →  |  |  | Service |  |
| 8 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | `bizFlowId` |  →  |  |  | Service |  |
| 9 | `materialId` | 物料Id | `pc.product.Product` | `material_id` |  →  |  |  | Service |  |
| 10 | `orgId` | 组织id | `org.func.BaseOrg` | `org_id` |  →  |  |  | Service |  |
| 11 | `QuotaAgreeOrgVOList` | 配额协议适用范围 | `cpubase.quota.QuotaAgreeOrgVO` | `` | QuotaAgreeOrgVOList → agreeId | 1..n | true | None |  |
| 12 | `agreeTemplateId` | 配额协议模板ID | `cpubase.quota.QuotaAgreeTemplateVO` | `agree_template_id` |  →  |  |  | None |  |
| 13 | `exchRateType` | 汇率类型ID | `bd.exchangeRate.ExchangeRateTypeVO` | `exch_rate_type` |  →  |  |  | Service |  |
| 14 | `quotaAgreeChdId` | 配额协议自定义项 | `cpubase.quota.QuotaAgreeChd` | `chd_id` |  →  |  |  | None |  |
| 15 | `QuotaAgreeAllotVOList` | 配额协议分配表体 | `cpubase.quota.QuotaAgreeAllotVO` | `` | QuotaAgreeAllotVOList → agreeId | 1..n | true | None |  |
| 16 | `currency` | 币种 | `bd.currencytenant.CurrencyTenantVO` | `currency` |  →  |  |  | Service |  |
| 17 | `quotaAgreeChmId` | 物料自由项特征组 | `cpubase.quota.QuotaAgreeChm` | `chm_id` |  →  |  |  | None |  |

### Composition（子表）

- **QuotaAgreeOrgVOList**: `QuotaAgreeOrgVOList` → `cpubase.quota.QuotaAgreeOrgVO` | 1..n
- **QuotaAgreeAllotVOList**: `QuotaAgreeAllotVOList` → `cpubase.quota.QuotaAgreeAllotVO` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `purchaseClassId` (采购品类ID) | `pc.cls.PurchaseClass` | `purchase_class_id` |
| `mainUnit` (主单位ID) | `pc.unit.Unit` | `main_unit` |
| `manageClassId` (物料分类ID) | `pc.cls.ManagementClass` | `material_class_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `auditor` (审批人) | `base.user.BipUser` | `auditor` |
| `creatorId` (创建人id) | `base.user.User` | `creatorId` |
| `modifierId` (更新人id) | `base.user.User` | `modifierId` |
| `bizFlow` (流程ID) | `bf.bizflow.BusinessFlow` | `bizFlowId` |
| `materialId` (物料Id) | `pc.product.Product` | `material_id` |
| `orgId` (组织id) | `org.func.BaseOrg` | `org_id` |
| `exchRateType` (汇率类型ID) | `bd.exchangeRate.ExchangeRateTypeVO` | `exch_rate_type` |
| `currency` (币种) | `bd.currencytenant.CurrencyTenantVO` | `currency` |
