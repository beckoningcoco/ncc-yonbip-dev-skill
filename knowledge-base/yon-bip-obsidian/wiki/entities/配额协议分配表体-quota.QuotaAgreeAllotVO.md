---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "cpubase.quota.QuotaAgreeAllotVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 配额协议分配表体 (`cpubase.quota.QuotaAgreeAllotVO`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_qtagree_alt` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `cpubase.quota.QuotaAgreeAllotVO` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 配额协议分配表体 |
| 物理表 | `cpu_qtagree_alt` |
| domain/服务域 | `cpu-base` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycPriceCenter` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:25:10.3760` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 配额协议分配表体ID |

## 部署信息

- **部署时间**: 2026-05-22 23:53:05:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202604031343_metadata_cpubase-quota_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `695fa371-431c-415a-afbe-4801b7de8f30`

## 术语标记

`ConfigData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 3 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 生单回写 (`IBackWrite`) | `base.itf.IBackWrite` | 254 | 7 |
| 2 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 3 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |

---

## 直接属性（共 29 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `supplyDocId` | 供应商ID | `supply_doc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | ✓ |
| 2 | `quota` | 配额 | `quota` | Decimal | `number` |  | ✓ |
| 3 | `sMaxPuMum` | 单次最大采购量 | `s_max_pu_num` | Decimal | `number` |  | ✓ |
| 4 | `sMinPuNum` | 单次最小采购量 | `s_min_pu_num` | Decimal | `number` |  | ✓ |
| 5 | `puMultiNum` | 采购倍量 | `pu_multi_num` | Decimal | `number` |  | ✓ |
| 6 | `iorder` | 顺序 | `iorder` | Integer | `int` |  | ✓ |
| 7 | `enable` | 启用状态 | `enable` | EBillStatus | `` |  | ✓ |
| 8 | `id` | 配额协议分配表体ID | `id` | Long | `long` |  | ✓ |
| 9 | `quotaAgreeAllotChdId` | 配额协议子表自定义项 | `chd_id` | 90706961-c93c-427d-b0fa-d7afe458e133 | `UserDefine` |  | ✓ |
| 10 | `actualQuota` | 实际配额比例 | `actual_quota` | Decimal | `number` |  | ✓ |
| 11 | `agreeId` | 配额协议ID | `agree_id` | 7c5859b8-7389-4dff-9fe8-4307e8557b30 | `quote` |  | ✓ |
| 12 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 13 | `execMoney` | 已执行金额 | `exec_money` | Decimal | `number` |  | ✓ |
| 14 | `execNum` | 已执行数量 | `exec_num` | Decimal | `number` |  | ✓ |
| 15 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String | `text` |  | ✓ |
| 16 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String | `text` |  | ✓ |
| 17 | `maxPurNum` | 最大采购量 | `max_pur_num` | Decimal | `number` |  | ✓ |
| 18 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 19 | `quotaAdjustMoney` | 配额调整金额 | `quota_adjust_money` | Decimal | `number` |  | ✓ |
| 20 | `quotaAdjustNum` | 配额调整量 | `quota_adjust_num` | Decimal | `number` |  | ✓ |
| 21 | `ratio` | 配额比例 | `ratio` | Decimal | `number` |  | ✓ |
| 22 | `source` | 上游单据类型 | `source` | String | `text` |  | ✓ |
| 23 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime | `timestamp` |  | ✓ |
| 24 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long | `long` |  | ✓ |
| 25 | `sourceid` | 上游单据主表id | `sourceid` | Long | `long` |  | ✓ |
| 26 | `totalMaxOrderMoney` | 累计最大订货金额 | `total_max_order_money` | Decimal | `number` |  | ✓ |
| 27 | `totalMaxOrderNum` | 累计最大订货量 | `total_max_order_num` | Decimal | `number` |  | ✓ |
| 28 | `upcode` | 上游单据号 | `upcode` | String | `text` |  | ✓ |
| 29 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 4 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `agreeId` | 配额协议ID | `cpubase.quota.QuotaAgreeVO` | `agree_id` | QuotaAgreeAllotVOList → agreeId | 1..n | true | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 3 | `supplyDocId` | 供应商ID | `aa.vendor.Vendor` | `supply_doc_id` |  →  |  |  | Service |  |
| 4 | `quotaAgreeAllotChdId` | 配额协议子表自定义项 | `cpubase.quota.QuotaAgreeAllotChd` | `chd_id` |  →  |  |  | None |  |

### Composition（子表）

- **agreeId**: `QuotaAgreeAllotVOList` → `cpubase.quota.QuotaAgreeVO` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `supplyDocId` (供应商ID) | `aa.vendor.Vendor` | `supply_doc_id` |
