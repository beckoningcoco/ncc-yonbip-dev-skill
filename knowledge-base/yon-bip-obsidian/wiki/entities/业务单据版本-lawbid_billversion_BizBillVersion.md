---
tags: ["BIP", "元数据", "数据字典", "lawbid.billversion.BizBillVersion"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 业务单据版本 (`lawbid.billversion.BizBillVersion`)

> **平台版本：BIP 旗舰版 V5**

>  模块 | 物理表：`biz_bill_version`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 业务单据版本 |
| 物理表 | `biz_bill_version` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `` |
| 构建时间 | `2026-06-04 19:56:45.8000` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

## 部署信息

- 部署时间: 2026-05-22 22:09:33:000

## 依赖接口（2个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 2 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |

---

## 直接属性（13个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `billLangRes` | 多语标识 | `bill_lang_res` | String |
| 2 | `billName` | 单据名称 | `bill_name` | String |
| 3 | `billNum` | 单据号 | `bill_num` | String |
| 4 | `billSceneId` | 场景ID | `bill_scene_id` | dc0761f8-0df6-448e-b205-0560fb58d933 |
| 5 | `dr` | 逻辑删除标记 | `dr` | Short |
| 6 | `endTime` | 结束时间 | `end_time` | DateTime |
| 7 | `id` | ID | `id` | Long |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime |
| 9 | `sourceBillId` | 来源单据ID | `source_bill_id` | Long |
| 10 | `sourceGroupKey` | 来源分组 | `source_group_key` | String |
| 11 | `startTime` | 起始时间 | `start_time` | DateTime |
| 12 | `subId` | 子产品号 | `sub_id` | String |
| 13 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `billSceneId` | 场景ID | `lawbid.billversion.BizBillScene` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
