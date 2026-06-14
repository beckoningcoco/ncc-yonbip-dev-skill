---
tags: ["BIP", "元数据", "数据字典", "ycYuncaiMall", "mall.matchPolicy.MatchPolicy"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 清单匹配策略 (`mall.matchPolicy.MatchPolicy`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycYuncaiMall 模块实体元数据字典。
> 物理表：`match_policy` | 所属应用：`ycYuncaiMall`
> 来源：元数据API `queryByUri` 返回的 `mall.matchPolicy.MatchPolicy` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 清单匹配策略 |
| 物理表 | `match_policy` |
| domain/服务域 | `yonbip-cpu-mall` |
| schema | `cpu_mall` |
| 所属应用 | `ycYuncaiMall` |
| 业务对象ID | `3d08ac04-69dd-4152-b441-8bb16e7a5aab` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:00:48.2200` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | id |

## 部署信息

- **部署时间**: 2025-10-24 23:19:30:000
- **安装来源**: `/app/data_scripts/cpu-mall-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-mall/0010_iuap_common/DML/0270_iuap_metadata/202508061549_metadata_mall-matchPolicy.zip`
- **安装人**: mongoTools
- **安装排名**: `3b635bfd-1fd7-4499-90bd-df3ae666ba67`

## 业务场景

- `UITemplate`
- `bpm`

## 术语标记

`BusinessData`, `isMain`

## 约束

- **bizUniqueIndex_transform** (transformKey): 唯一业务规则 — 唯一字段: `['id']`
- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`
- **bizUniqueIndex** (Unique): 唯一业务规则 — 唯一字段: `['id']`

## 依赖接口（共 5 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 3 | 企业ID (`IEnterprise`) | `cpu-base.itf.IEnterprise` | 7 | 1 |
| 4 | 审批流信息 (`IApprovalFlow`) | `base.itf.IApprovalFlow` | 134 | 3 |
| 5 | 审批信息 (`IApprovalInfo`) | `base.itf.IApprovalInfo` | 172 | 4 |

---

## 直接属性（共 20 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | id | `id` | Long | `long` |  | ✓ |
| 2 | `code` | 编码 | `code` | String | `text` |  | ✓ |
| 3 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 4 | `creator` | 创建人 | `creator` | String | `text` |  | ✓ |
| 5 | `creatorName` | 创建人名称 | `creator_name` | String | `text` |  | ✓ |
| 6 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 7 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 8 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean | `switch` |  | ✓ |
| 9 | `verifystate` | 审批状态 | `verifystate` | Short | `short` |  | ✓ |
| 10 | `returncount` | 退回次数 | `returncount` | Short | `short` |  | ✓ |
| 11 | `auditor` | 审批人名称 | `auditor` | String | `text` |  | ✓ |
| 12 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 13 | `auditTime` | 审批时间 | `audit_time` | DateTime | `timestamp` |  | ✓ |
| 14 | `auditDate` | 审批日期 | `audit_date` | Date | `date` |  | ✓ |
| 15 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |  | ✓ |
| 16 | `status` | 状态 | `status` | String | `text` |  | ✓ |
| 17 | `enterpriseId` | enterpriseId | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 | `quote` | ✓ |  |
| 18 | `purchaseOrg` | 采购组织id | `purchase_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 19 | `purchaseOrgName` | 采购组织 | `purchase_org_name` | String | `text` |  | ✓ |
| 20 | `matchPolicyDetail` | 清单匹配策略详情 | `` | 20821437-110c-4d0e-98db-a4ba30dfb900 | `` |  |  |

---

## 关联属性（共 5 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `auditorId` | 审批人 | `base.user.User` | `auditorId` |  →  |  |  | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 3 | `enterpriseId` | enterpriseId | `cpu-privilege.enterprise.EnterprisePOJO` | `enterprise_id` |  →  |  |  | Service |  |
| 4 | `matchPolicyDetail` | 清单匹配策略详情 | `mall.matchPolicy.MatchPolicyDetail` | `` | matchPolicyDetail → policyId | 1..n | true | None |  |
| 5 | `purchaseOrg` | 采购组织id | `org.func.BaseOrg` | `purchase_org_id` |  →  |  |  | Service |  |

### Composition（子表）

- **matchPolicyDetail**: `matchPolicyDetail` → `mall.matchPolicy.MatchPolicyDetail` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `auditorId` (审批人) | `base.user.User` | `auditorId` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `enterpriseId` (enterpriseId) | `cpu-privilege.enterprise.EnterprisePOJO` | `enterprise_id` |
| `purchaseOrg` (采购组织id) | `org.func.BaseOrg` | `purchase_org_id` |
