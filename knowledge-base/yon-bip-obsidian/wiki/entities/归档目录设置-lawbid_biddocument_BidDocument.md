---
tags: ["BIP", "元数据", "数据字典", "lawbid.biddocument.BidDocument"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 归档目录设置 (`lawbid.biddocument.BidDocument`)

> **平台版本：BIP 旗舰版 V5**

>  模块 | 物理表：`cpu_bid_document`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 归档目录设置 |
| 物理表 | `cpu_bid_document` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `` |
| 构建时间 | `2026-06-04 19:56:28.6280` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |
| 编码 | `template_code` | String | 模板编码 |

## 部署信息

- 部署时间: 2025-10-24 23:57:20:000

## 依赖接口（7个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 2 | 自动编号 | `voucher.base.IAutoCode` | 49 |
| 3 | 启用 | `ucfbase.ucfbaseItf.IEnable` | 141 |
| 4 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 5 | 审计信息 | `base.itf.IAuditInfo` | 340 |
| 6 | lawbidTenant租户相关 | `lawbid.itf.ITenant` | 2 |
| 7 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |

---

## 直接属性（43个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 主键 | `id` | Long |
| 2 | `enable` | 状态 | `enable` | Short |
| 3 | `enablets` | 启用时间 | `enablets` | DateTime |
| 4 | `disablets` | 停用时间 | `disablets` | DateTime |
| 5 | `dr` | 逻辑删除标记 | `dr` | Short |
| 6 | `ytenant` | 租户 | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 7 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 8 | `enterpriseId` | 所属租户 | `enterprise_id` | Long |
| 9 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 10 | `pubts` | 时间戳 | `pubts` | DateTime |
| 11 | `createTime` | 创建时间 | `create_time` | DateTime |
| 12 | `archiveSource` | 归档数据来源 | `archive_source` | Integer |
| 13 | `code` | 模板编码 | `template_code` | String |
| 14 | `templateName` | 模板名称 | `template_name` | String |
| 15 | `fileSort` | 允许文档分类 | `file_sort` | Integer |
| 16 | `addDirectory` | 允许补充分类 | `add_directory` | Integer |
| 17 | `documentStartRing` | 归档时机 | `document_start_ring` | String |
| 18 | `bidProjectCode` | 采购方案项目编号（废） | `bid_project_code` | String |
| 19 | `bidProjectName` | 采购方案项目名称（废） | `bid_project_name` | String |
| 20 | `bidSectionCode` | 标段编码（废） | `bid_section_code` | String |
| 21 | `bidSectionId` | 标段ID（废） | `bid_section_id` | Long |
| 22 | `bidSectionName` | 标段名称（废） | `bid_section_name` | String |
| 23 | `bidType` | 适用竞争方式 | `bid_type` | String |
| 24 | `bidTypes` | 归档目录设置适用的竞争方式 | `` | edd458bd-59ae-4320-9a6c-3eebbecde82e |
| 25 | `createDate` | 创建日期 | `create_date` | Date |
| 26 | `creator` | 创建人名称 | `creator` | String |
| 27 | `creatorId` | 创建人ID | `creator_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 28 | `documentCategories` | 归档目录设置归档目录信息 | `` | 288de4db-a864-490a-b879-751bad3c0fda |
| 29 | `ifTemplate` | 是否为模板（废） | `if_template` | Integer |
| 30 | `modifier` | 修改人名称 | `modifier` | String |
| 31 | `modifierId` | 更新人ID | `modifier_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 32 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 33 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 34 | `purOrgId` | 采购组织ID（废） | `pur_org_id` | Long |
| 35 | `purOrgName` | 采购组织名称（废） | `pur_org_name` | String |
| 36 | `purchaseCode` | 采购方式编码（废） | `purchase_code` | String |
| 37 | `purchaseMode` | 归档目录设置适用的采购方式 | `` | 5493b9dc-c195-49fe-b8b4-bbee71ef18f3 |
| 38 | `purchaseName` | 采购方式名称（废） | `purchase_name` | String |
| 39 | `purchaseType` | 适用采购类型 | `purchase_type` | String |
| 40 | `purchaseTypes` | 归档目录设置适用的采购类型 | `` | 9f9522f0-1d48-4407-9e07-6dd6f29d5456 |
| 41 | `status` | 是否开启（废） | `status` | String |
| 42 | `tenantId` | tenant租户 | `tenant_id` | String |
| 43 | `uapProjectName` | 项目名称（废） | `uap_project_name` | String |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bidTypes` | 归档目录设置适用的竞争方式 | `lawbid.biddocument.ArchiveTemplateBidType` | None | true |
| 2 | `documentCategories` | 归档目录设置归档目录信息 | `lawbid.biddocument.BidDocumentCategory` | None | true |
| 3 | `ytenant` | 租户 | `yht.tenant.YhtTenant` | Service |  |
| 4 | `purchaseMode` | 归档目录设置适用的采购方式 | `lawbid.biddocument.ArchiveTemplatePurchaseMode` | None | true |
| 5 | `purchaseTypes` | 归档目录设置适用的采购类型 | `lawbid.biddocument.ArchiveTemplatePurchaseType` | None | true |
| 6 | `creatorId` | 创建人ID | `base.user.User` | Service |  |
| 7 | `modifierId` | 更新人ID | `base.user.User` | Service |  |
