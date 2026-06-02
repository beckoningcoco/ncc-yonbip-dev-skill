---
tags: [BIP, 元数据, 数据字典, les, les.carrier.carrier]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 承运商 (`les.carrier.carrier`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `ils_les_carrier` | 应用: `DPMSI`

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | String |
| 编码 | `code` | `code` | |

## 全部属性（34 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `defines` | defines | `` | b787cd88-0a54-4d62-892e-be42087f78f3 | `` |  |  |
| 2 | `id` | 主键ID | `id` | String | `text` |  | true |
| 3 | `code` | 编码 | `code` | String | `text` |  | true |
| 4 | `name` | 名称 | `name` | String | `text` |  | true |
| 5 | `shortname` | shortname | `shortname` | String | `text` |  | true |
| 6 | `license` | license | `license` | String | `text` |  | true |
| 7 | `legalperson` | legalperson | `legalperson` | String | `text` |  | true |
| 8 | `ymsenc_legalpersonIdentity` | ymsenc_legalpersonIdentity | `ymsenc_legalpersonIdentity` | String | `text` |  | true |
| 9 | `contacts` | contacts | `contacts` | String | `text` |  | true |
| 10 | `ymsenc_contactsphone` | ymsenc_contactsphone | `ymsenc_contactsphone` | String | `text` |  | true |
| 11 | `email` | email | `email` | String | `text` |  | true |
| 12 | `fax` | fax | `fax` | String | `text` |  | true |
| 13 | `address` | address | `address` | String | `text` |  | true |
| 14 | `supplier` | supplier | `supplier` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | true |
| 15 | `startbill` | startbill | `startbill` | Date | `date` |  | true |
| 16 | `endbill` | endbill | `endbill` | Date | `date` |  | true |
| 17 | `generatebill` | generatebill | `generatebill` | Date | `date` |  | true |
| 18 | `benable` | benable | `benable` | String | `text` |  | true |
| 19 | `remark` | remark | `remark` | String | `text` |  | true |
| 20 | `transportlicence` | transportlicence | `transportlicence` | String | `text` |  | true |
| 21 | `dangerouslicence` | dangerouslicence | `dangerouslicence` | String | `text` |  | true |
| 22 | `taxpayerlicence` | taxpayerlicence | `taxpayerlicence` | String | `text` |  | true |
| 23 | `dr` | 逻辑删除 | `dr` | Integer | `int` |  | true |
| 24 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 25 | `definect` | definect | `definect` | ee6ac8c5-77e3-4ffb-b03d-1cfede21d308 | `UserDefine` |  | true |
| 26 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |  | true |
| 27 | `contactsphone` | contactsphone | `contactsphone` | String | `text` |  | true |
| 28 | `legalpersonIdentity` | legalpersonIdentity | `legalpersonIdentity` | String | `text` |  | true |
| 29 | `tenant` | tenant | `tenant_id` | String | `text` |  | true |
| 30 | `carrierRelationList` | carrierRelationList | `` | ee1b04ad-78c1-4b95-93b9-25db43be7fc8 | `` |  |  |
| 31 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 32 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |  | true |
| 33 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 34 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |  | true |

## 关联属性（7 个）

| # | 字段 | 目标实体 | 列 | 多重性 | 组合 | 废弃 |
|---|------|---------|-----|--------|------|------|
| 1 | `creator` | `base.user.BipUser` | `creator` |  |  |  |
| 2 | `ytenant` | `yht.tenant.YhtTenant` | `ytenant_id` |  |  |  |
| 3 | `supplier` | `aa.vendor.Vendor` | `supplier` |  |  |  |
| 4 | `modifier` | `base.user.BipUser` | `modifier` |  |  |  |
| 5 | `definect` | `les.carrier.carrierDefinect` | `definect` |  |  |  |
| 6 | `carrierRelationList` | `les.carrier.carrierRelation` | `` | 0..n | Y |  |
| 7 | `defines` | `les.carrier.carrierDefine` | `` | 1 | Y |  |

## 依赖接口（1 个）

- `carrierExtand` → `les.carrier.carrierExtand` (v288)

## SQL 示例

```sql
SELECT id, code, name, shortname, license, legalperson, ymsenc_legalpersonIdentity, contacts
FROM ils_les_carrier
```