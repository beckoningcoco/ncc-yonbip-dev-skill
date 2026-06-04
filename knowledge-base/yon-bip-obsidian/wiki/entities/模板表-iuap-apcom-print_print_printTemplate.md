---
tags: ["BIP", "元数据", "数据字典", "BMMPT", "iuap-apcom-print.print.printTemplate"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 模板表 (`iuap-apcom-print.print.printTemplate`)

> BMMPT | 物理表：`print_template`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 模板表 |
| 物理表 | `print_template` |
| 数据库 schema | `iuap-apcom-print` |
| 所属应用 | `BMMPT` |
| 构建时间 | `2026-06-04 23:34:31.0540` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `pk_print_template` | String | pkPrintTemplate |
| 编码 | `templatecode` | String | 模板编码 |

---

## 直接属性（50个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `A17_PrintTemplateContentList` | 模板多语内容表 | `` | 5b79c381-5c96-4f2a-a941-259c60828766 |
| 2 | `A17_RefDataRecordList` | 打印模板引用元数据记录表 | `` | f565fd5a-fb28-42c5-b391-c305b1c87b22 |
| 3 | `appId` | appId | `app_id` | String |
| 4 | `applicationCode` | applicationcode | `applicationCode` | String |
| 5 | `application_code` | applicationCode | `application_code` | String |
| 6 | `busiext1` | busiext1 | `busiext1` | String |
| 7 | `busiext10` | busiext10 | `busiext10` | String |
| 8 | `busiext2` | busiext2 | `busiext2` | String |
| 9 | `busiext3` | busiext3 | `busiext3` | String |
| 10 | `busiext4` | busiext4 | `busiext4` | String |
| 11 | `busiext5` | busiext5 | `busiext5` | String |
| 12 | `busiext6` | busiext6 | `busiext6` | String |
| 13 | `busiext7` | busiext7 | `busiext7` | String |
| 14 | `busiext8` | busiext8 | `busiext8` | String |
| 15 | `busiext9` | busiext9 | `busiext9` | String |
| 16 | `createby` | 创建人 | `createby` | String |
| 17 | `createtime` | 创建时间 | `createtime` | Date |
| 18 | `domainCode` | 领域编码 | `domain_code` | String |
| 19 | `isdefault` | 是否默认 | `isdefault` | String |
| 20 | `issystem` | 是否系统级 | `issystem` | String |
| 21 | `isvtag` | isvtag | `isvtag` | String |
| 22 | `microServiceCode` | 微服务编码 | `micro_service_code` | String |
| 23 | `modifiedby` | 修改人 | `modifiedby` | String |
| 24 | `modifiedtime` | 修改时间 | `modifiedtime` | Date |
| 25 | `parentcode` | 父级编码 | `parentcode` | String |
| 26 | `pkBo` | 元数据编码 | `pk_bo` | String |
| 27 | `pkParent` | 父级主键 | `pk_parent` | a7d321f2-7d04-40bd-83d0-cfeb57c8a100 |
| 28 | `pkPrintTemplate` | pkPrintTemplate | `pk_print_template` | String |
| 29 | `pkPrinttemplatetype` | 模板类型 | `pk_printtemplatetype` | String |
| 30 | `resid` | 多语资源Id | `resid` | String |
| 31 | `templateContent` | 模板内容 | `template_content` | String |
| 32 | `templateContent2` | 模板内容_en | `template_content2` | String |
| 33 | `templateContent3` | 模板内容_tw | `template_content3` | String |
| 34 | `templateContent4` | templateContent4 | `template_content4` | String |
| 35 | `templateContent5` | templateContent5 | `template_content5` | String |
| 36 | `templateContent6` | templateContent6 | `template_content6` | String |
| 37 | `templateContent7` | templateContent7 | `template_content7` | String |
| 38 | `templateNameExt4` | templateNameExt4 | `template_name_ext4` | String |
| 39 | `templateNameExt5` | templateNameExt5 | `template_name_ext5` | String |
| 40 | `templateNameExt6` | templateNameExt6 | `template_name_ext6` | String |
| 41 | `templatecode` | 模板编码 | `templatecode` | String |
| 42 | `templatename` | 模板名称 | `templatename` | String |
| 43 | `templatename2` | 模板名称_en | `templatename2` | String |
| 44 | `templatename3` | 模板名称_tw | `templatename3` | String |
| 45 | `templatename4` | 模板名称4 | `templatename4` | String |
| 46 | `templatename5` | 模板名称5 | `templatename5` | String |
| 47 | `templatename6` | 模板名称6 | `templatename6` | String |
| 48 | `tenantId` | 租户Id | `tenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 49 | `versionid` | 版本号 | `versionid` | Integer |
| 50 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `A17_PrintTemplateContentList` | 模板多语内容表 | `iuap-apcom-print.print.A17_PrintTemplateContent` | None | true |
| 2 | `A17_RefDataRecordList` | 打印模板引用元数据记录表 | `iuap-apcom-print.print.A17_RefDataRecord` | None | true |
| 3 | `tenantId` | 租户Id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `pkParent` | 父级主键 | `iuap-apcom-print.print.printTemplate` | None |  |
| 5 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
