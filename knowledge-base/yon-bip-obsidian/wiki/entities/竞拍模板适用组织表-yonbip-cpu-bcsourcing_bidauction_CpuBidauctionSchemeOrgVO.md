---
tags: ["BIP", "元数据", "数据字典", "yonbip-cpu-bcsourcing.bidauction.CpuBidauctionSchemeOrgVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 竞拍模板适用组织表 (`yonbip-cpu-bcsourcing.bidauction.CpuBidauctionSchemeOrgVO`)

>  | 物理表：`cpu_bidauction_scheme_org`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 竞拍模板适用组织表 |
| 物理表 | `cpu_bidauction_scheme_org` |
| domain/服务域 | `yonbip-cpu-bcsourcing` |
| schema | `cpu_pubbiz_sourcing` |
| 所属应用 | `` |
| 构建时间 | `2026-06-04 23:26:52.0090` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（12个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `pubts` | 时间戳 | `pubts` | DateTime |
| 3 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 4 | `bidSchemeId` | 竞拍方案id | `bid_scheme_id` | 4a1692f6-66f0-4e73-9c1f-694244bf7e72 |
| 5 | `dr` | 逻辑删除标记 | `dr` | Short |
| 6 | `yTenantId` | 用户中心租户id | `ytenant_id` | String |
| 7 | `ts` | 时间戳 | `ts` | DateTime |
| 8 | `orgCode` | 组织编码 | `org_code` | String |
| 9 | `orgName` | 组织名称 | `org_name` | String |
| 10 | `createTime` | 创建时间 | `create_time` | DateTime |
| 11 | `modifiedtime` | 修改时间 | `modifiedtime` | DateTime |
| 12 | `orgId` | 组织Id | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `bidSchemeId` | 竞拍方案id | `yonbip-cpu-bcsourcing.bidauction.BidauctionVO` | None | true |
| 3 | `orgId` | 组织Id | `org.func.BaseOrg` | Service |  |
