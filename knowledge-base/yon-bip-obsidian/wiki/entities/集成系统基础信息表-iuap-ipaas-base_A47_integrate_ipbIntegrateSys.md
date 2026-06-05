---
tags: ["BIP", "元数据", "数据字典", "iuap-ipaas-base", "iuap-ipaas-base.A47_integrate.ipbIntegrateSys"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 集成系统基础信息表 (`iuap-ipaas-base.A47_integrate.ipbIntegrateSys`)

> iuap-ipaas-base | 物理表：`ipb_integrate_sys`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 集成系统基础信息表 |
| 物理表 | `ipb_integrate_sys` |
| 数据库 schema | `iuap-ipaas-base` |
| 所属应用 | `iuap-ipaas-base` |
| 构建时间 | `2026-06-05 18:03:47.9320` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |
| 编码 | `sys_code` | String | sysCode |

---

## 直接属性（12个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `createTime` | createTime | `create_time` | Date |
| 2 | `creator` | creator | `creator` | String |
| 3 | `dr` | dr | `dr` | Integer |
| 4 | `id` | id | `id` | String |
| 5 | `modifier` | modifier | `modifier` | String |
| 6 | `modifyTime` | modifyTime | `modify_time` | Date |
| 7 | `show_open` | show_open | `show_open` | Integer |
| 8 | `sort` | sort | `sort` | Integer |
| 9 | `sysCode` | sysCode | `sys_code` | String |
| 10 | `sysDesc` | sysDesc | `sys_desc` | String |
| 11 | `sysName` | sysName | `sys_name` | String |
| 12 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（1个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
