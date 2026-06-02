---
tags: [BIP, 元数据, 数据字典, base, base.user.BipUser]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# BIP用户 (`base.user.BipUser`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `ba_user` | 应用: `GZTACT` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | BIP用户 |
| 物理表 | `ba_user` |
| 应用 | `GZTACT` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | 3991fd81-191b-4fb2-bd23-f484e057e116 |
| 编码 | `code` | `code` | |

## 部署信息

- 部署时间: 2026-01-23 23:10:38:000
- 安装来源: `/app/auth/iuap-auth-bootstrap/scripts/db/patch/mongodb/V7_R0_2507/0001_iuap_apcom_auth/0010_iuap_common/DML/0270_iuap_metadata/202512151534_metadata_base-user_delta.zip`

## 术语标记

`bill_add`, `bill_query`, `data_auth`, `DirectConnection`, `doc`, `MasterData`

## 依赖接口（1 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| IYTenant (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 全部属性（17 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `code` | 编码 | `code` | String | `text` |  | true |
| 2 | `name` | 名称 | `name` | String | `text` |  | true |
| 3 | `mobile` | 手机号 | `mobile` | String | `text` |  | true |
| 4 | `email` | 邮箱 | `email` | String | `text` |  | true |
| 5 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |  | true |
| 6 | `userId` | userId | `user_id` | 3991fd81-191b-4fb2-bd23-f484e057e116 | `quote` |  | true |
| 7 | `staff` | staff | `staff_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | true |
| 8 | `creator` | 创建人 | `creator` | String | `text` |  | true |
| 9 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | true |
| 10 | `modifier` | 修改人 | `modifier` | String | `text` |  | true |
| 11 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | true |
| 12 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 13 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 14 | `userName` | 用户名 | `name` | String | `text` |  | true |
| 15 | `id` | 主键ID | `id` | 3991fd81-191b-4fb2-bd23-f484e057e116 | `quote` |  | true |
| 16 | `snowflake_id` | snowflake_id | `snowflake_id` | Long | `long` |  | true |
| 17 | `orgId` | 组织ID | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | true |

## 关联属性（5 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 2 | `staff` | staff | `bd.staff.Staff` | `staff_id` | 外键 |  |  | Service |  |
| 3 | `id` | 主键ID | `ucfbase.yht.PubUserTenant` | `id` | 外键 |  |  | Service | false |
| 4 | `userId` | userId | `ucfbase.yht.PubUserTenant` | `user_id` | 外键 |  |  | Service | false |
| 5 | `orgId` | 组织ID | `org.func.BaseOrg` | `org_id` | 外键 |  |  | Service | false |

---

## SQL 示例

```sql
SELECT code, name, mobile, email, stopstatus, user_id, staff_id, creator
FROM ba_user
```