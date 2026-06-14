---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "aa.costitem.CostItemTemplate"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 成本项报价模板 (`aa.costitem.CostItemTemplate`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_costpricing_template` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `aa.costitem.CostItemTemplate` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 成本项报价模板 |
| 物理表 | `cpu_costpricing_template` |
| domain/服务域 | `cpu-bi-service` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycPriceCenter` |
| 业务对象ID | `6de61053-ab93-43e2-8647-487040c33914` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:19:15.1130` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |
| 编码 | `code` | `code` | String | 模板编码（必填，isCode）|

## 部署信息

- **部署时间**: 2025-10-24 23:29:25:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202509142058_metadata_aa-costitem_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `33d818a2-9adb-461a-9aa4-915dfec0269f`

## 业务场景

- `UITemplate`
- `imextmp`
- `billcode`
- `userdefine`

## 术语标记

`isAssigned`, `isExtend`, `data_auth`, `ConfigData`, `isMain`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 4 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 自动编号 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| 3 | 启用 (`IEnable`) | `ucfbase.ucfbaseItf.IEnable` | 141 | 3 |
| 4 | 审计信息 (`IAuditInfo`) | `ucfbase.ucfbaseItf.IAuditInfo` | 192 | 4 |

---

## 直接属性（共 22 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `applyScopes` | 适用范围 | `` | 6748a90f-5cd2-4116-9525-be96979665b0 | `` |  |  |
| 2 | `canmodifyBySupplier` | 供应商是否可修改成本项结构 | `canmodify_by_supplier` | Short | `singleOption` |  | ✓ |
| 3 | `code` | 模板编码 | `code` | String | `text` |  | ✓ |
| 4 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |  | ✓ |
| 5 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 6 | `detail` | 成本项报价模板详情 | `` | 7e287994-88f0-4ee4-b700-5c20c6e96fff | `` |  |  |
| 7 | `disablets` | 停用时间 | `disablets` | DateTime | `dateTime` |  | ✓ |
| 8 | `enable` | 启用 | `enable` | sys_intboolean | `singleOption` |  | ✓ |
| 9 | `enablets` | 启用时间 | `enablets` | DateTime | `dateTime` |  | ✓ |
| 10 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 11 | `isSys` | 是否预置模板 | `is_sys` | Long | `long` |  | ✓ |
| 12 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 13 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |  | ✓ |
| 14 | `name` | 模板名称 | `name` | String | `multiLanguage` |  | ✓ |
| 15 | `orgId` | 采购组织 | `org_id` | a4916c85-f087-4e87-a178-0ad37aff7cd0 | `quote` |  | ✓ |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 17 | `remark` | 备注 | `remark` | String | `text` |  | ✓ |
| 18 | `source_bid` | 来源单据行id | `source_bid` | Long | `long` |  | ✓ |
| 19 | `source_billtype` | 来源单据类型 | `source_billtype` | String | `text` |  | ✓ |
| 20 | `source_hid` | 来源单据id | `source_hid` | Long | `long` |  | ✓ |
| 21 | `sysId` | 引用模板id | `sys_id` | Long | `long` |  | ✓ |
| 22 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 6 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `creator` | 创建人 | `base.user.BipUser` | `creator` |  →  |  |  | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 3 | `modifier` | 修改人 | `base.user.BipUser` | `modifier` |  →  |  |  | Service |  |
| 4 | `applyScopes` | 适用范围 | `aa.costitem.CostItemTemplateApplyScope` | `` | applyScopes → costItemTemplateId | 0..n | true | None |  |
| 5 | `detail` | 成本项报价模板详情 | `aa.costitem.CostItemTemplateDetail` | `` | detail → costItemTemplateId | 1..n | true | None |  |
| 6 | `orgId` | 采购组织 | `org.func.PurchaseOrg` | `org_id` |  →  |  |  | Service |  |

### Composition（子表）

- **applyScopes**: `applyScopes` → `aa.costitem.CostItemTemplateApplyScope` | 0..n
- **detail**: `detail` → `aa.costitem.CostItemTemplateDetail` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `creator` (创建人) | `base.user.BipUser` | `creator` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `modifier` (修改人) | `base.user.BipUser` | `modifier` |
| `orgId` (采购组织) | `org.func.PurchaseOrg` | `org_id` |
