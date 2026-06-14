---
tags: ["BIP", "元数据", "数据字典", "lawbid.billversion.BizBillScene"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 业务场景 (`lawbid.billversion.BizBillScene`)

> **平台版本：BIP 旗舰版 V5**

>  模块 | 物理表：`biz_bill_scene`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 业务场景 |
| 物理表 | `biz_bill_scene` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `` |
| 构建时间 | `2026-06-04 20:14:30.6490` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

## 部署信息

- 部署时间: 2026-05-22 22:09:33:000

## 依赖接口（3个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 2 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 3 | 树型结构 | `ucfbase.ucfbaseItf.ITree` | 339 |

---

## 直接属性（15个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `parent` | 上级分类 | `parent_id` | String |
| 2 | `systemId` | 系统ID | `system_id` | Long |
| 3 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 4 | `level` | 层级 | `level` | Integer |
| 5 | `sceneName` | 场景名称 | `scene_name` | String |
| 6 | `sort` | 排序号 | `sort_num` | Integer |
| 7 | `isEnd` | 是否末级 | `isEnd` | Boolean |
| 8 | `dr` | 逻辑删除标记 | `dr` | Short |
| 9 | `parentSceneCode` | 父场景编码 | `parent_scene_code` | String |
| 10 | `subId` | 子产品号 | `sub_id` | String |
| 11 | `path` | 路径 | `path` | String |
| 12 | `sceneCode` | 场景编码 | `scene_code` | String |
| 13 | `name` | 节点标题 | `name` | String |
| 14 | `id` | ID | `id` | Long |
| 15 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（1个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
