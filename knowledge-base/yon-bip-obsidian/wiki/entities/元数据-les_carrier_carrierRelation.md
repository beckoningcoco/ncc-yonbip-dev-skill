---
tags: [BIP, 元数据, 数据字典, les.carrier.carrierRelation]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 承运关系 (`les.carrier.carrierRelation`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `ils_les_c_relation` | 应用: `DPMSI` | 类型: `Class`

## 属性（13 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | String | `text` |
| 2 | `logistics_org` | logistics_org | `logistics_org` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 3 | `pk_carrier` | pk_carrier | `pk_carrier` | 1b03840a-b023-48e5-8ef4-0e613721e2d0 | `quote` |
| 4 | `dr` | 逻辑删除 | `dr` | Integer | `int` |
| 5 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 6 | `definect` | definect | `definect` | 775a2938-31c2-4afe-b677-a1542512ba36 | `UserDefine` |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 8 | `tenant` | tenant | `tenant_id` | String | `text` |
| 9 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 10 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 11 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 12 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 13 | `bodydefines` | bodydefines | `` | b7386892-a5be-495e-b86f-0187c7c11ed1 | `` |

## 关联（7 个）

- `pk_carrier` -> `les.carrier.carrier` (0..n)
- `creator` -> `base.user.BipUser` ()
- `bodydefines` -> `les.carrier.carrierRelationDefine` (1)
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `modifier` -> `base.user.BipUser` ()
- `definect` -> `les.carrier.carrierRelationDefinect` ()
- `logistics_org` -> `org.func.BaseOrg` ()
