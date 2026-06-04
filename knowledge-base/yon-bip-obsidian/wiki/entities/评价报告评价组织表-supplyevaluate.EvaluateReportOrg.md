---
tags: ["BIP", "元数据", "数据字典", "ycSupplierManagement", "cpu-supplymgr.supplyevaluate.EvaluateReportOrg"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 评价报告评价组织表 (`cpu-supplymgr.supplyevaluate.EvaluateReportOrg`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycSupplierManagement 模块实体元数据字典。
> 物理表：`cpu_evaluate_report_org` | 所属应用：`ycSupplierManagement`
> 来源：元数据API `queryByUri` 返回的 `cpu-supplymgr.supplyevaluate.EvaluateReportOrg` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 评价报告评价组织表 |
| 物理表 | `cpu_evaluate_report_org` |
| 数据库 schema | `cpu-supplymgr` |
| 所属应用 | `ycSupplierManagement` |
| 业务对象ID | `0065d820-a399-440c-b0ed-d11253151b79` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:35:20.8890` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | id |

## 部署信息

- **部署时间**: 2026-05-22 23:45:58:000
- **安装来源**: `/app/data_scripts/cpu-suppliermgr-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-suppliermgr/0010_iuap_common/DML/0270_iuap_metadata/202601201940_metadata_cpu-supplymgr-supplyevaluate.zip`
- **安装人**: mongoTools
- **安装排名**: `381ec7c1-7af7-49f5-b852-fff1aee2ffcb`

## 术语标记

`BusinessData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 1 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 13 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `evaOrgId` | 评价组织id | `eva_org_id` | Long | `long` |  | ✓ |
| 2 | `evaOrgName` | 评价组织名称 | `eva_org_name` | String | `text` |  | ✓ |
| 3 | `evaReportId` | 评估报告id | `eva_report_id` | 4adb01ab-5983-467b-a459-8c00966fa86e | `quote` |  | ✓ |
| 4 | `id` | id | `id` | Long | `long` |  | ✓ |
| 5 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |  | ✓ |
| 6 | `score` | 得分 | `score` | Decimal | `number` |  | ✓ |
| 7 | `scoreMemo` | 评分说明 | `score_memo` | String | `text` |  | ✓ |
| 8 | `supplyBillCode` | 单据号 | `supply_bill_code` | String | `text` |  | ✓ |
| 9 | `supplyBillId` | 业务单据id | `supply_bill_id` | Long | `long` |  | ✓ |
| 10 | `supplyBillName` | 单据号 | `supply_bill_name` | String | `text` |  | ✓ |
| 11 | `supplyBillNum` | 业务单据 | `supply_bill_num` | String | `text` |  | ✓ |
| 12 | `supplydocId` | 供应商档案id | `supply_doc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | ✓ |
| 13 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 3 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `supplydocId` | 供应商档案id | `aa.vendor.Vendor` | `supply_doc_id` |  →  |  |  | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 3 | `evaReportId` | 评估报告id | `cpu-supplymgr.supplyevaluate.EvaluateReport` | `eva_report_id` |  →  |  |  | None |  |

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `supplydocId` (供应商档案id) | `aa.vendor.Vendor` | `supply_doc_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
