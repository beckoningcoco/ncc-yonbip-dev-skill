---
tags: ["BIP", "元数据", "数据字典", "BMMPT", "iuap-apcom-print.print.A17_PrintTemplateContent"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 模板多语内容表 (`iuap-apcom-print.print.A17_PrintTemplateContent`)

> BMMPT | 物理表：`print_template_content`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 模板多语内容表 |
| 物理表 | `print_template_content` |
| domain/服务域 | `iuap-apcom-print` |
| 所属应用 | `BMMPT` |
| 构建时间 | `2026-06-04 23:34:41.6490` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | 主键 |

---

## 直接属性（14个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `createTime` | 创建时间 | `create_time` | DateTime |
| 2 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 3 | `dr` | 逻辑删除 | `dr` | Short |
| 4 | `id` | 主键 | `id` | String |
| 5 | `locale` | 语种 | `locale` | String |
| 6 | `metaContent` | 查询变量 | `meta_content` | String |
| 7 | `microServiceCode` | 微服务编码 | `micro_service_code` | String |
| 8 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 9 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 10 | `pubts` | 时间戳 | `pubts` | DateTime |
| 11 | `templateContent` | 模板内容 | `template_content` | String |
| 12 | `templateId` | 模板Id | `template_id` | a7d321f2-7d04-40bd-83d0-cfeb57c8a100 |
| 13 | `templateName` | 模板名称 | `template_name` | String |
| 14 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `creator` | 创建人 | `base.user.BipUser` | Service |  |
| 2 | `modifier` | 修改人 | `base.user.BipUser` | Service |  |
| 3 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `templateId` | 模板Id | `iuap-apcom-print.print.printTemplate` | None | true |
