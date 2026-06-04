---
tags: ["BIP", "元数据", "数据字典", "ycBusinessCenter", "saleauction.bid.BiddingFileVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 投标文件 (`saleauction.bid.BiddingFileVO`)

> ycBusinessCenter | 物理表：`cpu_bidding_file`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 投标文件 |
| 物理表 | `cpu_bidding_file` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycBusinessCenter` |
| 构建时间 | `2026-06-04 23:43:49.5140` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（36个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `enterpriseId` | 租户ID | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 2 | `enterpriseName` | 租户名 | `enterprise_name` | String |
| 3 | `backupFiles` | 投标文件 | `backup_files` | String |
| 4 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 5 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 6 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 7 | `dr` | 逻辑删除标记 | `dr` | Short |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime |
| 9 | `id` | ID | `id` | Long |
| 10 | `biddingId` | 投标主表ID | `bidding_id` | af94c771-f926-452b-8760-f06c22b53d8f |
| 11 | `bidFileDemand` | 投标文件组成要求 | `bid_file_demand` | String |
| 12 | `bidFileName` | 文件名称 | `bid_file_name` | String |
| 13 | `bidFileSource` | 文件来源 | `bid_file_source` | String |
| 14 | `submitStatus` | 文件提交状态 | `submit_status` | Integer |
| 15 | `uploadTime` | 上传时间 | `upload_time` | Date |
| 16 | `secretStatus` | 加密状态 | `secret_status` | Integer |
| 17 | `beforeEncodeId` | 加密前id | `before_encode_id` | String |
| 18 | `afterEncodeId` | 加密后 id | `after_encode_id` | String |
| 19 | `initUrl` | 初始化url | `init_url` | String |
| 20 | `afterEncodeUrl` | 加密后url | `after_encode_url` | String |
| 21 | `afterDecodeUrl` | 解密后url | `after_decode_url` | String |
| 22 | `supplydocId` | 供应商档案ID | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 23 | `qualifyNotes` | 资质备注 | `qualify_notes` | String |
| 24 | `qualifyCheckStep` | 资格审核当前流程阶段 0代表预审阶段 1代表后审阶段 | `qualify_check_step` | Integer |
| 25 | `bidfileTemplateId` | 格式模板 | `bidfile_template_id` | Long |
| 26 | `rowNo` | 排序 | `row_no` | Decimal |
| 27 | `classTag` | 分类标签 | `class_tag` | String |
| 28 | `classTagSort` | 分类页签排序 | `class_tag_sort` | Decimal |
| 29 | `necessary` | 必须提供 | `necessary` | Integer |
| 30 | `needStamp` | 是否必须盖章 | `need_stamp` | Boolean |
| 31 | `templateFile` | 文件模板 | `template_file` | String |
| 32 | `requirementFileType` | 必须提供 | `requirement_file_type` | String |
| 33 | `fileType` | 文件类型要求 | `file_type` | String |
| 34 | `files` | 上传文件 | `files` | String |
| 35 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 36 | `reviewType` | 文件类型(文件评审类型) | `review_type` | String |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplydocId` | 供应商档案ID | `aa.vendor.Vendor` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `biddingId` | 投标主表ID | `saleauction.bid.BiddingVO` | None | true |
| 4 | `enterpriseId` | 租户ID | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
