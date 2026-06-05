---
tags: ["BIP", "元数据", "数据字典", "DPMPI", "bd.customerdoc_M002.M002"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 门内填充物 (`bd.customerdoc_M002.M002`)

> DPMPI | 物理表：`bd_cust_doc`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 门内填充物 |
| 物理表 | `bd_cust_doc` |
| 数据库 schema | `ucfbasedoc` |
| 所属应用 | `DPMPI` |
| 构建时间 | `2026-06-05 15:17:56.9850` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | 主键 |
| 编码 | `code` | String | 编码 |

---

## 直接属性（32个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `businessid` | 友企连标识 | `businessid` | String |
| 2 | `code` | 编码 | `code` | String |
| 3 | `countries` | 国家/地区 | `countries` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf |
| 4 | `creationtime` | 创建时间 | `creationtime` | DateTime |
| 5 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 6 | `custdocdefid` | 档案定义 | `custdocdefid` | 4a34c8c2-7819-4c05-a15b-d59fb09f6e75 |
| 7 | `description` | 备注 | `description` | String |
| 8 | `dr` | dr | `dr` | Integer |
| 9 | `enable` | 状态 | `enable` | Integer |
| 10 | `id` | 主键 | `id` | String |
| 11 | `isEnd` | 是否末级 | `isEnd` | Boolean |
| 12 | `ispreset` | 是否预置 | `ispreset` | Boolean |
| 13 | `level` | 层级 | `level` | Integer |
| 14 | `log` | 操作日志 | `log` | String |
| 15 | `modifiedtime` | 修改时间 | `modifiedtime` | DateTime |
| 16 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 17 | `name` | 名称 | `name` | String |
| 18 | `objid` | 友企联id | `objid` | String |
| 19 | `orgid` | 组织 | `orgid` | 100943a5-df56-4ec1-8105-c4b448afa02b |
| 20 | `parent` | 上级分类 | `parent_id` | f4c80a3e-e324-4009-a2ff-269d5099f7b0 |
| 21 | `parentid` | 上级档案 | `parentid` | f4c80a3e-e324-4009-a2ff-269d5099f7b0 |
| 22 | `path` | 路径 | `path` | String |
| 23 | `pubts` | 时间戳 | `pubts` | DateTime |
| 24 | `shortname` | 简称 | `shortname` | String |
| 25 | `socialMctype` | 社会化管控类型 | `social_mctype` | Integer |
| 26 | `socialSrcid` | 社会化来源id | `social_srcid` | String |
| 27 | `socialTenantid` | 社会化来源租户 | `social_tenantid` | String |
| 28 | `sort` | 排序号 | `sort_num` | Integer |
| 29 | `sortnum` | 序号 | `sortnum` | Integer |
| 30 | `sysid` | 应用标识 | `sysid` | String |
| 31 | `tenant` | 租户(废除) | `tenantid` | String |
| 32 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `parent` | 上级分类 | `bd.basedocdef.CustomerDocVO` | None |  |
| 2 | `creator` | 创建人 | `base.user.BipUser` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `modifier` | 修改人 | `base.user.BipUser` | Service |  |
| 5 | `custdocdefid` | 档案定义 | `bd.basedocdef.CustomerDocDefVO` | None |  |
| 6 | `countries` | 国家/地区 | `bd.country.CountryVO` | None |  |
| 7 | `orgid` | 组织 | `org.view.AdminOrgGlobalView` | Service |  |
| 8 | `parentid` | 上级档案 | `bd.basedocdef.CustomerDocVO` | None |  |
