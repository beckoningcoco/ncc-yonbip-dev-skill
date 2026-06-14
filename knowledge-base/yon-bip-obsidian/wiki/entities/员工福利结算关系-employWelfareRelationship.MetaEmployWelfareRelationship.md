---
tags: ["BIP", "元数据", "数据字典", "ycYuncaiMall", "mall.employWelfareRelationship.MetaEmployWelfareRelationship"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 员工福利结算关系 (`mall.employWelfareRelationship.MetaEmployWelfareRelationship`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycYuncaiMall 模块实体元数据字典。
> 物理表：`cpu_employee_welfare_relationship` | 所属应用：`ycYuncaiMall`
> 来源：元数据API `queryByUri` 返回的 `mall.employWelfareRelationship.MetaEmployWelfareRelationship` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 员工福利结算关系 |
| 物理表 | `cpu_employee_welfare_relationship` |
| domain/服务域 | `yonbip-cpu-mall` |
| schema | `cpu_mall` |
| 所属应用 | `ycYuncaiMall` |
| 业务对象ID | `9dd21b3e-1aa3-40de-a44a-62a1f791fed8` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:00:43.8770` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-01-23 23:40:38:000
- **安装来源**: `/app/data_scripts/cpu-mall-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-mall/0010_iuap_common/DML/0270_iuap_metadata/202510141548_metadata_mall-employWelfareRelationship_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `4c793988-831b-4c5e-bcc1-ffbe4d9dc0ae`

## 业务场景

- `UITemplate`

## 术语标记

`ConfigData`, `isMain`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 2 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |

---

## 直接属性（共 11 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 2 | `supply_doc_id` | 供应商档案ID | `supply_doc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | ✓ |
| 3 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 4 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |  | ✓ |
| 6 | `pay_way` | 付款方式 | `pay_way` | String | `text` |  | ✓ |
| 7 | `payee` | 收款方 | `payee` | String | `text` |  | ✓ |
| 8 | `supplier_name` | 供应商 | `supplier_name` | String | `text` |  | ✓ |
| 9 | `merchant_id` | 收款商户号 | `merchant_id` | String | `text` |  | ✓ |
| 10 | `merchant_name` | 收款商户名称 | `merchant_name` | String | `text` |  | ✓ |
| 11 | `acq_sp_id` | 服务商户号 | `acq_sp_id` | String | `text` |  | ✓ |

---

## 关联属性（共 2 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 2 | `supply_doc_id` | 供应商档案ID | `aa.vendor.Vendor` | `supply_doc_id` |  →  |  |  | Service |  |

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `supply_doc_id` (供应商档案ID) | `aa.vendor.Vendor` | `supply_doc_id` |
