---
tags: ["BIP", "元数据", "数据字典", "ST", "sn.serialnumber.SNCustomItem"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 序列号属性 (`sn.serialnumber.SNCustomItem`)

> ST | 物理表：`sn_customitem`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 序列号属性 |
| 物理表 | `sn_customitem` |
| 数据库 schema | `ustock` |
| 所属应用 | `ST` |
| 构建时间 | `2026-06-04 23:34:32.4040` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | 4bb2bc3d-effd-4ebd-bde2-2d925594d47e | 序列号id |

---

## 直接属性（32个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `define1` | 自定义项1 | `define1` | String |
| 2 | `define10` | 自定义项10 | `define10` | String |
| 3 | `define11` | 自定义项11 | `define11` | String |
| 4 | `define12` | 自定义项12 | `define12` | String |
| 5 | `define13` | 自定义项13 | `define13` | String |
| 6 | `define14` | 自定义项14 | `define14` | String |
| 7 | `define15` | 自定义项15 | `define15` | String |
| 8 | `define16` | 自定义项16 | `define16` | String |
| 9 | `define17` | 自定义项17 | `define17` | String |
| 10 | `define18` | 自定义项18 | `define18` | String |
| 11 | `define19` | 自定义项19 | `define19` | String |
| 12 | `define2` | 自定义项2 | `define2` | String |
| 13 | `define20` | 自定义项20 | `define20` | String |
| 14 | `define21` | 自定义项21 | `define21` | String |
| 15 | `define22` | 自定义项22 | `define22` | String |
| 16 | `define23` | 自定义项23 | `define23` | String |
| 17 | `define24` | 自定义项24 | `define24` | String |
| 18 | `define25` | 自定义项25 | `define25` | String |
| 19 | `define26` | 自定义项26 | `define26` | String |
| 20 | `define27` | 自定义项27 | `define27` | String |
| 21 | `define28` | 自定义项28 | `define28` | String |
| 22 | `define29` | 自定义项29 | `define29` | String |
| 23 | `define3` | 自定义项3 | `define3` | String |
| 24 | `define30` | 自定义项30 | `define30` | String |
| 25 | `define4` | 自定义项4 | `define4` | String |
| 26 | `define5` | 自定义项5 | `define5` | String |
| 27 | `define6` | 自定义项6 | `define6` | String |
| 28 | `define7` | 自定义项7 | `define7` | String |
| 29 | `define8` | 自定义项8 | `define8` | String |
| 30 | `define9` | 自定义项9 | `define9` | String |
| 31 | `id` | 序列号id | `id` | 4bb2bc3d-effd-4ebd-bde2-2d925594d47e |
| 32 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `id` | 序列号id | `sn.serialnumber.SNstate` | None | true |
