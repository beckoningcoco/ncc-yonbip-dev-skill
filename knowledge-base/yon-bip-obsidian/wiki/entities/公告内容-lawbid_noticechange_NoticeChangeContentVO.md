---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.noticechange.NoticeChangeContentVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 公告内容 (`lawbid.noticechange.NoticeChangeContentVO`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_notice_content`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 公告内容 |
| 物理表 | `cpu_notice_content` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:00:29.3710` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

## 部署信息

- 部署时间: 2025-10-24 23:58:03:000

## 依赖接口（5个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 变更公告内容接口 | `noticechange.itf.INoticeChangeContent` | 33 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 4 | 审计信息 | `ucfbase.ucfbaseItf.IAuditInfo` | 192 |
| 5 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |

---

## 直接属性（22个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `clearId` | 主表主键 | `clear_id` | 72d508e2-8168-48e1-a9ac-1966b3fa66a0 |
| 2 | `noticeTemplateId` | 公告模板id | `notice_template_id` | 9afba638-be6f-4d54-b870-3448a8ccf849 |
| 3 | `noticeContent` | 公告内容 | `notice_content` | String |
| 4 | `enterpriseId` | 企业 | `enterprise_id` | Long |
| 5 | `type` | 公告类型 | `type` | Integer |
| 6 | `srcbillId` | 所属单据 | `srcbill_id` | Long |
| 7 | `noticeCode` | 公告编码 | `notice_code` | String |
| 8 | `noticeName` | 公告名称 | `notice_name` | String |
| 9 | `changeReasonFileId` | 变更原因附件 | `changeReasonFile_id` | String |
| 10 | `noticeChangeFileId` | 公告附件 | `noticeChangeFile_id` | String |
| 11 | `noticeValue` | 公告内容 | `notice_value` | String |
| 12 | `ts` | 修改时间 | `ts` | DateTime |
| 13 | `status` | 是否生效 | `status` | String |
| 14 | `dr` | 逻辑删除标记 | `dr` | Short |
| 15 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 16 | `createTime` | 创建时间 | `create_time` | DateTime |
| 17 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 18 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 19 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 20 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 21 | `id` | 主键 | `id` | Long |
| 22 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `creator` | 创建人 | `base.user.BipUser` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `modifier` | 修改人 | `base.user.BipUser` | Service |  |
| 4 | `clearId` | 主表主键 | `lawbid.noticechange.NoticeChangeClearVO` | None | true |
| 5 | `noticeTemplateId` | 公告模板id | `bctask.noticetemplate.NoticeTemplate` | Service |  |
