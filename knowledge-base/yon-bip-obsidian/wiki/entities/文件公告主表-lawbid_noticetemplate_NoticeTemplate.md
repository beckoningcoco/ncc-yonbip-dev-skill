---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.noticetemplate.NoticeTemplate"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 文件公告主表 (`lawbid.noticetemplate.NoticeTemplate`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_notice_template`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 文件公告主表 |
| 物理表 | `cpu_notice_template` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:00:30.7680` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 文件公告模板 |
| 编码 | `template_code` | String | 模板编码 |

## 部署信息

- 部署时间: 2025-10-24 23:57:31:000

## 依赖接口（7个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 2 | 审计信息 | `base.itf.IAuditInfo` | 340 |
| 3 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 4 | 自动编号 | `voucher.base.IAutoCode` | 49 |
| 5 | lawbidTenant租户相关 | `lawbid.itf.ITenant` | 2 |
| 6 | 启用 | `ucfbase.ucfbaseItf.IEnable` | 141 |
| 7 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |

---

## 直接属性（35个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `templateType` | 模板类型 | `template_type` | String |
| 2 | `enable` | 状态 | `enable` | Short |
| 3 | `ts` | 修改时间 | `ts` | DateTime |
| 4 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 5 | `dr` | 逻辑删除标记 | `dr` | Short |
| 6 | `ytenant` | 租户 | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 7 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 8 | `enterpriseId` | 所属租户 | `enterprise_id` | Long |
| 9 | `pubts` | 时间戳 | `pubts` | DateTime |
| 10 | `id` | 文件公告模板 | `id` | Long |
| 11 | `code` | 模板编码 | `template_code` | String |
| 12 | `businessType` | 业务类型 | `business_type` | String |
| 13 | `templateName` | 模板名称 | `template_name` | String |
| 14 | `templateTypeId` | 模板类型 | `template_type_id` | 086170eb-e5c8-42c0-9bf5-3ad69759d862 |
| 15 | `qualificationRequire` | 招标文件 | `qualification_require` | String |
| 16 | `bidNoticeId` | 公告（废） | `bid_notice_id` | Long |
| 17 | `bidSectionId` | 标段（废） | `bid_section_id` | Long |
| 18 | `createDate` | 创建日期 | `create_date` | Date |
| 19 | `createTime` | 创建时间 | `create_time` | DateTime |
| 20 | `creator` | 创建人名称 | `creator` | String |
| 21 | `creatorId` | 创建人 | `creator_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 22 | `disablets` | 停用时间 | `disablets` | DateTime |
| 23 | `enablets` | 启用时间 | `enablets` | DateTime |
| 24 | `ifTemplate` | 是否模板（废） | `if_template` | Integer |
| 25 | `materialCategories` | 物料分类子表 | `` | fc1ec9e6-b744-47e7-8dce-b071c8746f71 |
| 26 | `modifier` | 修改人名称 | `modifier` | String |
| 27 | `modifierId` | 更新人 | `modifier_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 28 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 29 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 30 | `purchaseMode` | 采购方式子表 | `` | 044627d0-4d6d-4fd1-9296-a46876e34246 |
| 31 | `purchaseName` | 采购方式名称（废） | `purchase_name` | Long |
| 32 | `purchaseTypes` | 采购类型子表 | `` | 548adc32-d5fe-4e41-b8e3-54638ff52208 |
| 33 | `purorgs` | 采购组织子表 | `` | 1ee7536c-cee2-45b8-8274-2aa290c3b4ee |
| 34 | `status` | 是否开启（废） | `status` | String |
| 35 | `tenantId` | tenant租户 | `tenant_id` | String |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `templateTypeId` | 模板类型 | `lawbid.noticetemplate.NoticeTemplateType` | None |  |
| 2 | `ytenant` | 租户 | `yht.tenant.YhtTenant` | Service |  |
| 3 | `purchaseMode` | 采购方式子表 | `lawbid.noticetemplate.NoticeTemplatePurchaseMode` | None | true |
| 4 | `purchaseTypes` | 采购类型子表 | `lawbid.noticetemplate.NoticeTemplatePurchaseType` | None | true |
| 5 | `purorgs` | 采购组织子表 | `lawbid.noticetemplate.NoticeTemplatePurorg` | None | true |
| 6 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 7 | `modifierId` | 更新人 | `base.user.User` | Service |  |
| 8 | `materialCategories` | 物料分类子表 | `lawbid.noticetemplate.NoticeTemplateMaterialCategory` | None | true |
