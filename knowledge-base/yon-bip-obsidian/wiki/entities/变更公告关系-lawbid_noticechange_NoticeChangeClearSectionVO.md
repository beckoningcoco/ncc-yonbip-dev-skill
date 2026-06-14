---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.noticechange.NoticeChangeClearSectionVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 变更公告关系 (`lawbid.noticechange.NoticeChangeClearSectionVO`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_bid_pjt_clear_section`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 变更公告关系 |
| 物理表 | `cpu_bid_pjt_clear_section` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:00:28.0030` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 变更公告关系id |

## 部署信息

- 部署时间: 2025-10-24 23:58:03:000

## 依赖接口（5个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 变更公告标段关系接口 | `noticechange.itf.INoticeChangeClearSection` | 21 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 4 | 审计信息 | `ucfbase.ucfbaseItf.IAuditInfo` | 192 |
| 5 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |

---

## 直接属性（16个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bidSectionName` | 标段包名称 | `bid_section_name` | String |
| 2 | `bidSectionId` | 标段包 | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 3 | `id` | 变更公告关系id | `id` | Long |
| 4 | `pubts` | 修改时间 | `pubts` | DateTime |
| 5 | `dr` | 是否删除状态 | `dr` | Short |
| 6 | `bidProjectId` | 采购项目 | `bid_project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 7 | `bidSectionCode` | 标包编码 | `bid_section_code` | String |
| 8 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 9 | `clearId` | 主表主键 | `clear_id` | 72d508e2-8168-48e1-a9ac-1966b3fa66a0 |
| 10 | `createTime` | 创建时间 | `create_time` | DateTime |
| 11 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 12 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 13 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 14 | `state` | 审批状态（自由、发布、审批中） | `state` | String |
| 15 | `ts` | ts | `ts` | DateTime |
| 16 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `creator` | 创建人 | `base.user.BipUser` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `modifier` | 修改人 | `base.user.BipUser` | Service |  |
| 4 | `clearId` | 主表主键 | `lawbid.noticechange.NoticeChangeClearVO` | None | true |
| 5 | `bidProjectId` | 采购项目 | `lawbid.project.LawbidProject` | None |  |
| 6 | `bidSectionId` | 标段包 | `lawbid.section.LawbidSection` | None |  |
