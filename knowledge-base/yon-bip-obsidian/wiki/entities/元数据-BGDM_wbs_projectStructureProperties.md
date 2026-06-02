---
tags: [BIP, 元数据, 数据字典, BGDM, BGDM.wbs.projectStructureProperties]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 项目结构属性 (`BGDM.wbs.projectStructureProperties`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `` | 应用: `` | 类型: `Interface`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 项目结构属性 |
| 物理表 | `` |
| 应用 | `` |
| 元数据类型 | `Interface` |

## 部署信息

- 部署时间: 2026-05-23 00:25:26:000
- 安装来源: `/app/project_dir/pm-iuapdoc-starter/scripts/db/patch/mongodb/V5_R0_2507/0001_pm-pmc-iuapdoc/0010_iuap_common/DML/0270_iuap_metadata/202604/bgdm/wbs_doc/202604131005_metadata_BGDM-wbs.zip`

---

## 全部属性（2 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `activity` | activity | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 | `quote` |  | true |
| 2 | `wbs` | wbs | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 | `quote` |  | true |

---

## SQL 示例

```sql
SELECT activity, wbs
FROM 
```