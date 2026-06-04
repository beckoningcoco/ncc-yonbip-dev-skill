---
tags: ["BIP", "元数据", "数据字典", "ycBusinessCenter", "lawbid.bidnotice.NoticeFileVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 报名文件子表 (`lawbid.bidnotice.NoticeFileVO`)

> ycBusinessCenter | 物理表：`cpu_bid_notice_file`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 报名文件子表 |
| 物理表 | `cpu_bid_notice_file` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycBusinessCenter` |
| 构建时间 | `2026-06-04 23:43:40.9890` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（20个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 2 | `createTime` | 创建时间 | `create_time` | DateTime |
| 3 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 4 | `dr` | 逻辑删除标记 | `dr` | Short |
| 5 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 6 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 7 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime |
| 9 | `tenantId` | 租户id | `tenant_id` | String |
| 10 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 11 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 12 | `id` | id | `id` | Long |
| 13 | `qualifyNo` | 证件编码 | `qualify_no` | String |
| 14 | `qualifyName` | 证件名称 | `qualify_name` | String |
| 15 | `qualifyExplain` | 证件描述 | `qualify_explain` | String |
| 16 | `isMustUpload` | 是否必须上传 | `is_must_upload` | Short |
| 17 | `fileID` | 附件 | `file_id` | String |
| 18 | `supQualifyNotes` | 供应商资质说明 | `sup_qualify_notes` | String |
| 19 | `bidNoticeId` | 供应商报名主表 | `bid_notice_id` | 9856b255-b5b6-4b2e-a8b9-a2c4ae9962b5 |
| 20 | `qualifyId` | 资质id | `qualify_id` | 24adca98-a52e-4e01-bd71-6304184e474c |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `creator` | 创建人 | `base.user.BipUser` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `qualifyId` | 资质id | `aa.qualify.Qualify` | Service |  |
| 4 | `modifier` | 修改人 | `base.user.BipUser` | Service |  |
| 5 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 6 | `bidNoticeId` | 供应商报名主表 | `lawbid.bidnotice.NoticeVO` | None | true |
