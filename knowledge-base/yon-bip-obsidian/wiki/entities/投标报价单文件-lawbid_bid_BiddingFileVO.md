---
tags: ["BIP", "元数据", "数据字典", "ycBusinessCenter", "lawbid.bid.BiddingFileVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 投标报价单文件 (`lawbid.bid.BiddingFileVO`)

> **平台版本：BIP 旗舰版 V5**

> ycBusinessCenter 模块 | 物理表：`cpu_bidding_file`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 投标报价单文件 |
| 物理表 | `cpu_bidding_file` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycBusinessCenter` |
| 构建时间 | `2026-06-04 20:14:16.3280` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

## 部署信息

- 部署时间: 2025-10-24 23:58:29:000

## 依赖接口（5个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 投标单文件子表接口 | `bid.itf.IBiddingFile` | 189 |
| 2 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 3 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 4 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 5 | 跨租户供应商租户接口 | `cpu.itf.IVendorTenant` | 14 |

---

## 直接属性（38个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `biddingId` | 投标主表 | `bidding_id` | 560d390c-4459-4448-8e73-f6ce26a04dba |
| 2 | `encryptFileKey` | 加密文件的文件密码 | `encrypt_file_key` | String |
| 3 | `reviewTypeId` | 招标文件类型 | `review_type_id` | 92b613a5-0e7c-4f87-8a9b-7fccc9ba556a |
| 4 | `enterpriseId` | 企业 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 5 | `enterpriseName` | 租户名 | `enterprise_name` | String |
| 6 | `bidFileDemand` | 投标文件组成要求 | `bid_file_demand` | String |
| 7 | `bidFileSource` | 文件来源 | `bid_file_source` | String |
| 8 | `submitStatus` | 文件提交状态 | `submit_status` | Integer |
| 9 | `uploadTime` | 上传时间 | `upload_time` | Date |
| 10 | `secretStatus` | 加密状态 | `secret_status` | Integer |
| 11 | `beforeEncodeId` | 加密前 | `before_encode_id` | String |
| 12 | `afterEncodeId` | 加密后  | `after_encode_id` | String |
| 13 | `initUrl` | 初始化url | `init_url` | String |
| 14 | `afterEncodeUrl` | 加密后 | `after_encode_url` | String |
| 15 | `afterDecodeUrl` | 解密后 | `after_decode_url` | String |
| 16 | `qualifyNotes` | 资质备注 | `qualify_notes` | String |
| 17 | `qualifyCheckStep` | 资格审核当前流程阶段 | `qualify_check_step` | Integer |
| 18 | `bidfileTemplateId` | 文件模板 | `bidfile_template_id` | Long |
| 19 | `templateFile` | 模板格式 | `template_file` | String |
| 20 | `rowNo` | 排序 | `row_no` | Decimal |
| 21 | `classTag` | 分类标签 | `class_tag` | String |
| 22 | `classTagSort` | 分类页签排序 | `class_tag_sort` | Decimal |
| 23 | `necessary` | 是否必须文件 | `necessary` | Integer |
| 24 | `needStamp` | 是否必须盖章 | `need_stamp` | Boolean |
| 25 | `requirementFileType` | 文件要求类型 | `requirement_file_type` | String |
| 26 | `fileType` | 文件类型 | `file_type` | String |
| 27 | `files` | 投标文件 | `files` | String |
| 28 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 29 | `reviewType` | 文件类型(文件评审类型) | `review_type` | String |
| 30 | `backupFiles` | 投标文件 | `backup_files` | String |
| 31 | `supplydocId` | 供应商档案 | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 32 | `bidFileName` | 文件名称 | `bid_file_name` | String |
| 33 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 34 | `dr` | 逻辑删除标记 | `dr` | Short |
| 35 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 36 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 37 | `id` | 主键 | `id` | Long |
| 38 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplydocId` | 供应商档案 | `aa.vendor.Vendor` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `biddingId` | 投标主表 | `lawbid.bid.BiddingVO` | None | true |
| 4 | `enterpriseId` | 企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 5 | `reviewTypeId` | 招标文件类型 | `bctask.basedoc.CustomerDocVO` | Service |  |
