---
tags: [BIP, 元数据, 数据字典, usp, usp.deliverymethod.Deliverymethod]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 交付方式档案表 (`usp.deliverymethod.Deliverymethod`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `usp_deliverymethod` | 应用: `SCCS` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 交付方式档案表 |
| 物理表 | `usp_deliverymethod` |
| 应用 | `SCCS` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |

## 部署信息

- 部署时间: 2026-05-23 01:50:24:000
- 安装来源: `/app/newustock/src/yonbip-scm-scmf/scripts/db/patch/mongodb/V5_R0_2507/0003_scmpub/0010_iuap_common/DML/0270_iuap_metadata/202603/202601301638_metadata_usp-deliverymethod_delta.zip`

## 术语标记

`ConfigData`

## 依赖接口（4 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| IStopping (`IStopping`) | `base.itf.IStopping` | 111 | 2 |
| ITenant (`ITenant`) | `base.itf.ITenant` | 73 | 1 |
| IAuditInfo (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| IYTenant (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 全部属性（19 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `code` | 编码 | `code` | String | `text` |  | true |
| 2 | `name` | 名称 | `name` | String | `multiLanguage` |  | true |
| 3 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |  | true |
| 4 | `remark` | 备注 | `remark` | String | `text` |  | true |
| 5 | `creator` | 创建人 | `creator` | String | `text` |  | true |
| 6 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | true |
| 7 | `modifier` | 修改人 | `modifier` | String | `text` |  | true |
| 8 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | true |
| 9 | `id` | 主键ID | `id` | Long | `long` |  | true |
| 10 | `system` | system | `system` | SystemEnum | `` |  | true |
| 11 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | true |
| 12 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 13 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 14 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | true |
| 15 | `orgId` | 组织ID | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |  | true |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 17 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |  | true |
| 18 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` | true | true |
| 19 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |

## 关联属性（5 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 2 | `creatorId` | 创建人ID | `base.user.User` | `creatorId` | 外键 |  |  | Service |  |
| 3 | `modifierId` | 修改人ID | `base.user.User` | `modifierId` | 外键 |  |  | Service |  |
| 4 | `orgId` | 组织ID | `aa.baseorg.OrgMV` | `org_id` | 外键 |  |  | Service |  |
| 5 | `tenant` | tenant | `base.tenant.Tenant` | `tenant_id` | 外键 |  |  | Service |  |

---

## SQL 示例

```sql
SELECT code, name, stopstatus, remark, creator, create_time, modifier, modify_time
FROM usp_deliverymethod
```