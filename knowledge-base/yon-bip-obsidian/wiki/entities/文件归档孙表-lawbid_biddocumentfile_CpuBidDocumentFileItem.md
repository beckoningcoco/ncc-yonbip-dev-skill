---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.biddocumentfile.CpuBidDocumentFileItem"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 文件归档孙表 (`lawbid.biddocumentfile.CpuBidDocumentFileItem`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_bid_document_file_item`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 文件归档孙表 |
| 物理表 | `cpu_bid_document_file_item` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:14:27.8990` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2025-03-06 21:06:36:000

## 依赖接口（4个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 3 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 4 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |

---

## 直接属性（31个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 2 | `dr` | 删除标志 | `dr` | Short |
| 3 | `enterpriseId` | 企业 | `enterprise_id` | Long |
| 4 | `enterpriseName` | 企业名称 | `enterprise_name` | String |
| 5 | `errorMsg` | 规则执行异常信息 | `error_msg` | String |
| 6 | `fileSourceId` | 文件来源主键 | `file_source_id` | Long |
| 7 | `isWrong` | 是否异常 | `is_wrong` | Integer |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime |
| 9 | `ts` | 默认值 | `ts` | DateTime |
| 10 | `ytenant` | 租户 | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 11 | `ytenantId` | 租户 | `ytenant_id` | String |
| 12 | `fileName` | 文件名称 | `file_name` | String |
| 13 | `billcode` | 单据编号 | `billcode` | String |
| 14 | `pagenum` | 页数 | `pagenum` | Integer |
| 15 | `fileId` | 附件 | `file_id` | String |
| 16 | `replenishFileId` | 补充上传附件 | `replenish_file_id` | String |
| 17 | `replenishUploadPersonName` | 补充上传人 | `replenish_upload_person_name` | String |
| 18 | `isFromTemplate` | 是否是参照带过来的 | `isFromTemplate` | Boolean |
| 19 | `replenishUploadTime` | 补充上传时间 | `replenish_upload_time` | DateTime |
| 20 | `fileSource` | 文件来源 | `file_source` | String |
| 21 | `remarks` | 备注 | `remarks` | String |
| 22 | `ifUpload` | 支持补充上传 | `if_upload` | Short |
| 23 | `rowNo` | 行号 | `row_no` | Integer |
| 24 | `bidDocumentCategoryId` | 归档环节主表id | `bid_document_category_id` | 7be1d6ea-5d90-409b-94bd-90983e9a9925 |
| 25 | `id` | id | `id` | Long |
| 26 | `increasing` | 是否文件归档增行 | `increasing` | Short |
| 27 | `tenantId` | 租户 | `tenant_id` | String |
| 28 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 29 | `bidDocumentId` | 归档主表 | `bid_document_id` | Long |
| 30 | `uploadTime` | 上传时间 | `upload_time` | DateTime |
| 31 | `uploadPersonName` | 上传人名称 | `upload_person_name` | String |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bidDocumentCategoryId` | 归档环节主表id | `lawbid.biddocumentfile.CpuBidDocumentFileCategory` | None | true |
| 2 | `ytenant` | 租户 | `yht.tenant.YhtTenant` | Service |  |
