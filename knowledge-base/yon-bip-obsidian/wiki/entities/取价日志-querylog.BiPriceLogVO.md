---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "aa.querylog.BiPriceLogVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 取价日志 (`aa.querylog.BiPriceLogVO`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_bi_price_query_record` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `aa.querylog.BiPriceLogVO` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 取价日志 |
| 物理表 | `cpu_bi_price_query_record` |
| 数据库 schema | `cpu-bi-service` |
| 所属应用 | `ycPriceCenter` |
| 业务对象ID | `ba32c105-072f-4e41-b214-aeace4799ec7` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:17:53.8870` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |
| 编码 | `code` | `code` | String | 单据编号（必填，isCode）|

## 部署信息

- **部署时间**: 2025-10-24 23:29:29:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202509191414_metadata_aa-querylog_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `5f8235b0-3778-4fd3-ae39-02b53d66d523`

## 术语标记

`BusinessData`, `data_auth`, `isMain`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 1 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 16 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `billType` | 取价单据 | `bill_type` | String | `text` |  | ✓ |
| 2 | `code` | 单据编号 | `code` | String | `text` |  | ✓ |
| 3 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 4 | `log_detail` | 取价日志详情 | `` | 90641029-64d3-462f-ba42-4fef1fd2e8d0 | `` |  |  |
| 5 | `operatorId` | 操作人ID | `operator_id` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 6 | `operatorName` | 操作人 | `operator_name` | String | `text` |  | ✓ |
| 7 | `pricingEndTime` | 取价时间止 | `pricing_end_time` | DateTime | `timestamp` |  | ✓ |
| 8 | `pricingStartTime` | 取价时间起 | `pricing_start_time` | DateTime | `timestamp` |  | ✓ |
| 9 | `pricingTime` | 取价时间 | `pricing_time` | DateTime | `timestamp` |  | ✓ |
| 10 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 11 | `queryPriceLogMark` | 取价日志标识 | `query_price_log_mark` | String | `text` |  | ✓ |
| 12 | `retrievalStatus` | 取价状态 | `retrieval_status` | String | `text` |  | ✓ |
| 13 | `rowNum` | 单据行号 | `row_num` | Long | `long` |  | ✓ |
| 14 | `tenant` | 租户id | `ytenant_id` | String | `text` |  | ✓ |
| 15 | `vbusinessType` | 业务类型 | `vbusiness_type` | String | `text` |  | ✓ |
| 16 | `ytenant` | 租户id | `ytenant_id` | String | `text` | ✓ | ✓ |

---

## 关联属性（共 2 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `log_detail` | 取价日志详情 | `aa.querylog.BiPriceLogDetailVO` | `` | log_detail → logId | 1..n | true | None |  |
| 2 | `operatorId` | 操作人ID | `base.user.BipUser` | `operator_id` |  →  |  |  | Service |  |

### Composition（子表）

- **log_detail**: `log_detail` → `aa.querylog.BiPriceLogDetailVO` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `operatorId` (操作人ID) | `base.user.BipUser` | `operator_id` |
