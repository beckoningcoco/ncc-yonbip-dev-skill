---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "aa.priceformula.PriceFactorAdjust"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 采购定价要素 (`aa.priceformula.PriceFactorAdjust`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_price_factor_adjust` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `aa.priceformula.PriceFactorAdjust` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购定价要素 |
| 物理表 | `cpu_price_factor_adjust` |
| 数据库 schema | `cpu-bi-service` |
| 所属应用 | `ycPriceCenter` |
| 业务对象ID | `dc18d939-1c2b-4272-81c4-9d299b956018` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:18:07.9120` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |
| 编码 | `code` | `code` | String | 调整单号（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-22 23:53:07:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202604200925_metadata_aa-priceformula_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `d113ede2-2046-4f14-aa9b-92e189959780`

## 业务场景

- `FieldAuth`
- `DataAuth`
- `imextmp`
- `billcode`
- `userdefine`
- `bpm`
- `prewarning`

## 术语标记

`BusinessData`, `dataAuth`, `data_auth`

## 约束

- **code,ytenant_transform** (transformKey): code,ytenant — 唯一字段: `['code', 'ytenant']`
- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 6 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 审计信息 (`IAuditInfo`) | `ucfbase.ucfbaseItf.IAuditInfo` | 192 | 4 |
| 2 | 审计信息 (`YcIAuditInfo`) | `aa.priceformula.YcIAuditInfo` | 201 | 2 |
| 3 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 4 | 自动编码 (`IAutoCode`) | `ucfbase.ucfbaseItf.IAutoCode` | 37 | 0 |
| 5 | 审批流信息 (`IApprovalFlow`) | `ucfbase.ucfbaseItf.IApprovalFlow` | 177 | 3 |
| 6 | 审批信息 (`IApprovalInfo`) | `ucfbase.ucfbaseItf.IApprovalInfo` | 85 | 2 |

---

## 直接属性（共 25 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 2 | `code` | 调整单号 | `code` | String | `text` |  | ✓ |
| 3 | `bustype` | 交易类型 | `iBusType` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | ✓ |
| 4 | `approvalTime` | 审批时间 | `approval_time` | String | `text` |  | ✓ |
| 5 | `remark` | 备注 | `remark` | String | `text` |  | ✓ |
| 6 | `auditorName` | 审批人姓名 | `auditorName` | String | `text` |  | ✓ |
| 7 | `priceFactorAdjustChdId` | 采购定价要素主表自定义项 | `chd_id` | 7b59a373-a524-41e4-8d11-e937c13644ff | `UserDefine` |  | ✓ |
| 8 | `formulaId` | 参考价格公式ID | `formula_id` | 97790819-6d1f-4b4b-8d1c-f6d78b6531e4 | `quote` |  | ✓ |
| 9 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |  | ✓ |
| 10 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |  | ✓ |
| 11 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 12 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 13 | `creatorName` | 创建人名称 | `creatorName` | String | `text` |  | ✓ |
| 14 | `modifierName` | 修改人名称 | `modifierName` | String | `text` |  | ✓ |
| 15 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 16 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean | `switch` |  | ✓ |
| 17 | `verifystate` | 审批状态 | `verifystate` | Short | `short` |  | ✓ |
| 18 | `returncount` | 退回次数 | `returncount` | Short | `short` |  | ✓ |
| 19 | `auditor` | 审批人 | `auditor` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 20 | `auditTime` | 审批时间 | `audit_time` | DateTime | `timestamp` |  | ✓ |
| 21 | `vouchdate` | 单据日期 | `vouchdate` | Date | `date` | ✓ |  |
| 22 | `status` | 单据状态 | `status` | Short | `short` |  | ✓ |
| 23 | `tenant` | 租户ID | `tenant_id` | String | `text` |  | ✓ |
| 24 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |  | ✓ |
| 25 | `priceadjustdetail` | 采购定价要素详情 | `` | 5a059f4d-7585-42dc-b121-d4945d11387b | `` |  |  |

---

## 关联属性（共 8 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `formulaId` | 参考价格公式ID | `aa.priceformula.PriceFormula` | `formula_id` |  →  |  |  | None |  |
| 2 | `creator` | 创建人 | `base.user.BipUser` | `creator` |  →  |  |  | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 4 | `modifier` | 修改人 | `base.user.BipUser` | `modifier` |  →  |  |  | Service |  |
| 5 | `auditor` | 审批人 | `base.user.BipUser` | `auditor` |  →  |  |  | Service |  |
| 6 | `priceFactorAdjustChdId` | 采购定价要素主表自定义项 | `aa.priceformula.PriceFactorAdjustChd` | `chd_id` |  →  |  |  | None |  |
| 7 | `priceadjustdetail` | 采购定价要素详情 | `aa.priceformula.PriceFactorAdjustDetail` | `` | priceadjustdetail → adjustId | 1..n | true | None |  |
| 8 | `bustype` | 交易类型 | `bd.bill.TransType` | `iBusType` |  →  |  |  | Service |  |

### Composition（子表）

- **priceadjustdetail**: `priceadjustdetail` → `aa.priceformula.PriceFactorAdjustDetail` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `creator` (创建人) | `base.user.BipUser` | `creator` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `modifier` (修改人) | `base.user.BipUser` | `modifier` |
| `auditor` (审批人) | `base.user.BipUser` | `auditor` |
| `bustype` (交易类型) | `bd.bill.TransType` | `iBusType` |
