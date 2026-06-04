---
tags: ["BIP", "元数据", "数据字典", "ycBusinessCenter", "saleauction.bidnotice.NoticeFileVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 供应商报名资质附件表 (`saleauction.bidnotice.NoticeFileVO`)

> ycBusinessCenter | 物理表：`cpu_bid_notice_file`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应商报名资质附件表 |
| 物理表 | `cpu_bid_notice_file` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycBusinessCenter` |
| 构建时间 | `2026-06-04 23:43:55.1480` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（20个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | id | `id` | Long |
| 2 | `qualifyNo` | 资质编码 | `qualify_no` | String |
| 3 | `qualifyName` | 资质名称 | `qualify_name` | String |
| 4 | `qualifyExplain` | 资质描述 | `qualify_explain` | String |
| 5 | `isMustUpload` | 是否必须上传 | `is_must_upload` | Short |
| 6 | `fileID` | 附件 | `file_id` | String |
| 7 | `supQualifyNotes` | 供应商资质说明 | `sup_qualify_notes` | String |
| 8 | `bidNoticeId` | 供应商报名主表 | `bid_notice_id` | 9f3db86b-e723-4fde-a245-f09c2e59bab1 |
| 9 | `qualifyId` | 资质id | `qualify_id` | 24adca98-a52e-4e01-bd71-6304184e474c |
| 10 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 11 | `createTime` | 创建时间 | `create_time` | DateTime |
| 12 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 13 | `dr` | 逻辑删除标记 | `dr` | Short |
| 14 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 15 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 16 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime |
| 18 | `tenantId` | 租户 | `tenant_id` | String |
| 19 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 20 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `creator` | 创建人 | `base.user.BipUser` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `qualifyId` | 资质id | `aa.qualify.Qualify` | Service |  |
| 4 | `modifier` | 修改人 | `base.user.BipUser` | Service |  |
| 5 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 6 | `bidNoticeId` | 供应商报名主表 | `saleauction.bidnotice.NoticeVO` | None | true |
