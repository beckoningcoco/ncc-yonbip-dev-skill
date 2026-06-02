---
tags: [BIP, 元数据, 数据字典, base, base.tenant.Tenant]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 租户 (`base.tenant.Tenant`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `tenant` | 应用: `GZTBDM` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 租户 |
| 物理表 | `tenant` |
| 应用 | `GZTBDM` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |

## 部署信息

- 部署时间: 2026-05-22 23:00:20:000
- 安装来源: `/app/ugoods/upc/src/upc-server/scripts/db/patch/mongodb/V7_R0_2507/0004_other/0010_iuap_common/DML/0270_iuap_metadata/20260515-itr/202603161658_metadata_base-tenant_delta.zip`

## 术语标记

`ConfigData`, `data_auth`

## 依赖接口（2 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| IAvailable (`IAvailable`) | `base.itf.IAvailable` | 131 | 3 |
| IYTenant (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 全部属性（36 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `address` | 地址 | `address` | String | `text` |  | true |
| 2 | `alias` | alias | `alias` | String | `text` | true | false |
| 3 | `appId` | appId | `appid` | String | `text` |  | true |
| 4 | `comment` | omment | `comment` | String | `text` |  | true |
| 5 | `contact` | ontact | `contact` | String | `text` |  | true |
| 6 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | true |
| 7 | `disableTime` | disableTime(时间) | `disable_time` | DateTime | `timestamp` |  | true |
| 8 | `email` | 邮箱 | `email` | String | `text` |  | true |
| 9 | `enableTime` | enableTime(时间) | `enable_time` | DateTime | `timestamp` |  | true |
| 10 | `fax` | 传真 | `fax` | String | `text` |  | true |
| 11 | `id` | 主键ID | `id` | Long | `long` |  | true |
| 12 | `industry` | ndustry(ID) | `industry` | Short | `short` |  | true |
| 13 | `integrateConfigUrl` | ntegrateConfigUrl(ID) | `integrateConfigUrl` | String | `text` |  | true |
| 14 | `introduction` | ntroduction(ID) | `introduction` | String | `text` |  | true |
| 15 | `isAvailable` | 是否Available | `is_available` | Boolean | `switch` | true | false |
| 16 | `isIndustrySuccess` | 是否IndustrySuccess | `isindustrysuccess` | Boolean | `switch` |  | true |
| 17 | `isOpen` | 是否Open | `isOpen` | Boolean | `switch` |  | true |
| 18 | `isOpenUdh` | 是否OpenUdh | `isOpenUdh` | Boolean | `switch` |  | true |
| 19 | `isPrintSuccess` | 是否PrintSuccess | `isprintsuccess` | Boolean | `switch` |  | true |
| 20 | `logo` | logo | `logo` | String | `text` |  | true |
| 21 | `name` | 名称 | `name` | String | `text` | true | false |
| 22 | `overTime` | overTime(时间) | `over_time` | DateTime | `timestamp` |  | true |
| 23 | `phone` | phone | `phone` | String | `text` |  | true |
| 24 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 25 | `region` | region | `region` | Short | `short` |  | true |
| 26 | `regionCode` | region编码 | `region_code` | String | `text` |  | true |
| 27 | `size` | 尺码 | `corp_size` | Short | `short` |  | true |
| 28 | `source` | source | `source` | Integer | `int` |  | true |
| 29 | `startTime` | startTime(时间) | `start_time` | DateTime | `timestamp` |  | true |
| 30 | `taxId` | taxId | `tax_id` | String | `text` |  | true |
| 31 | `tenantCenter` | tenantCenter | `tenantcenter_id` | String | `text` |  | true |
| 32 | `theme` | theme | `theme` | String | `text` |  | true |
| 33 | `webdomain` | webdomain | `webdomain` | String | `text` |  | true |
| 34 | `website` | website | `website` | String | `text` |  | true |
| 35 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 36 | `yxyTenantId` | yxyTenantId | `yxytenantid` | String | `text` |  | true |

## 关联属性（1 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |

---

## SQL 示例

```sql
SELECT address, alias, appid, comment, contact, create_time, disable_time, email
FROM tenant
```