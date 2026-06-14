---
tags: ["BIP", "元数据", "数据字典", "DPMPI", "bd.customerdoc_10001.10001"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 品牌LJ (`bd.customerdoc_10001.10001`)

> DPMPI | 物理表：`bd_cust_doc`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 品牌LJ |
| 物理表 | `bd_cust_doc` |
| domain/服务域 | `ucfbasedoc` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `DPMPI` |
| 构建时间 | `2026-06-04 23:08:11.0330` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | 主键 |
| 编码 | `code` | String | 编码 |

---

## 直接属性（30个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `code` | 编码 | `code` | String |
| 2 | `creationtime` | 创建时间 | `creationtime` | DateTime |
| 3 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 4 | `custdocdefid` | 档案定义id | `custdocdefid` | 4a34c8c2-7819-4c05-a15b-d59fb09f6e75 |
| 5 | `description` | 备注 | `description` | String |
| 6 | `dr` | 逻辑删除标记 | `dr` | Short |
| 7 | `enable` | 状态 | `enable` | Integer |
| 8 | `id` | 主键 | `id` | String |
| 9 | `isEnd` | 是否末级 | `isEnd` | Boolean |
| 10 | `ispreset` | 是否预置 | `ispreset` | Boolean |
| 11 | `level` | 层级 | `level` | Integer |
| 12 | `log` | 操作日志 | `log` | String |
| 13 | `modifiedtime` | 修改时间 | `modifiedtime` | DateTime |
| 14 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 15 | `name` | 名称 | `name` | String |
| 16 | `objid` | 友企联id | `objid` | String |
| 17 | `orgid` | 所属组织 | `orgid` | 100943a5-df56-4ec1-8105-c4b448afa02b |
| 18 | `parent` | 上级分类 | `parent_id` | f4c80a3e-e324-4009-a2ff-269d5099f7b0 |
| 19 | `parentid` | 上级档案 | `parentid` | f4c80a3e-e324-4009-a2ff-269d5099f7b0 |
| 20 | `path` | 路径 | `path` | String |
| 21 | `pubts` | 时间戳 | `pubts` | DateTime |
| 22 | `shortname` | 简称 | `shortname` | String |
| 23 | `socialMctype` | 社会化管控类型 | `social_mctype` | Integer |
| 24 | `socialSrcid` | 社会化来源id | `social_srcid` | String |
| 25 | `socialTenantid` | 社会化来源租户 | `social_tenantid` | String |
| 26 | `sort` | 排序号 | `sort_num` | Integer |
| 27 | `sortnum` | 序号 | `sortnum` | Integer |
| 28 | `sysid` | 系统id | `sysid` | String |
| 29 | `tenant` | 租户废弃 | `tenantid` | String |
| 30 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `parent` | 上级分类 | `bd.basedocdef.CustomerDocVO` | None |  |
| 2 | `creator` | 创建人 | `base.user.BipUser` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `modifier` | 修改人 | `base.user.BipUser` | Service |  |
| 5 | `custdocdefid` | 档案定义id | `bd.basedocdef.CustomerDocDefVO` | None |  |
| 6 | `orgid` | 所属组织 | `org.view.AdminOrgGlobalView` | Service |  |
| 7 | `parentid` | 上级档案 | `bd.basedocdef.CustomerDocVO` | None |  |
