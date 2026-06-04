---
tags: ["BIP", "元数据", "数据字典", "ycSupplierManagement", "cpu-supplymgr.supplyevaluate.EvaluateScoreRefuse"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 评估人拒评表 (`cpu-supplymgr.supplyevaluate.EvaluateScoreRefuse`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycSupplierManagement 模块实体元数据字典。
> 物理表：`cpu_evaluate_psn_object_refuse` | 所属应用：`ycSupplierManagement`
> 来源：元数据API `queryByUri` 返回的 `cpu-supplymgr.supplyevaluate.EvaluateScoreRefuse` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 评估人拒评表 |
| 物理表 | `cpu_evaluate_psn_object_refuse` |
| 数据库 schema | `cpu-supplymgr` |
| 所属应用 | `ycSupplierManagement` |
| 业务对象ID | `a8accd53-f49b-4fbe-8918-37e9cc0fe94e` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:35:11.1320` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 主键 |

## 部署信息

- **部署时间**: 2026-05-22 23:45:58:000
- **安装来源**: `/app/data_scripts/cpu-suppliermgr-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-suppliermgr/0010_iuap_common/DML/0270_iuap_metadata/202601201940_metadata_cpu-supplymgr-supplyevaluate.zip`
- **安装人**: mongoTools
- **安装排名**: `381ec7c1-7af7-49f5-b852-fff1aee2ffcb`

## 术语标记

`BusinessData`

## 约束

- **migration_id** (MetaClassPrimary): 主键 — 唯一字段: `['id']`

## 依赖接口（共 1 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 10 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `evaApplyId` | 评价任务id | `eva_apply_id` | Long | `long` |  | ✓ |
| 2 | `id` | 主键 | `id` | Long | `long` |  | ✓ |
| 3 | `objectBillId` | 评价对象id | `object_bill_id` | Long | `long` |  | ✓ |
| 4 | `psnId` | 评估人id | `psn_id` | String | `text` |  | ✓ |
| 5 | `psnOrgId` | 评估人组织id | `psn_org_id` | String | `text` |  | ✓ |
| 6 | `scoreId` | 评分表id | `score_id` | Long | `long` |  | ✓ |
| 7 | `status` | 拒评状态 | `status` | String | `text` |  | ✓ |
| 8 | `supplydocId` | 供应商id | `supplydoc_id` | Long | `long` |  | ✓ |
| 9 | `yTenantId` | 租户id | `ytenant_id` | String | `text` |  | ✓ |
| 10 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 1 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
