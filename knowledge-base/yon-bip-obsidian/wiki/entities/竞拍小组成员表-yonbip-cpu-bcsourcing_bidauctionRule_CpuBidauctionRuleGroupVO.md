---
tags: ["BIP", "元数据", "数据字典", "ycSouring", "yonbip-cpu-bcsourcing.bidauctionRule.CpuBidauctionRuleGroupVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 竞拍小组成员表 (`yonbip-cpu-bcsourcing.bidauctionRule.CpuBidauctionRuleGroupVO`)

> ycSouring | 物理表：`cpu_bidauction_rule_group`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 竞拍小组成员表 |
| 物理表 | `cpu_bidauction_rule_group` |
| domain/服务域 | `yonbip-cpu-bcsourcing` |
| schema | `cpu_pubbiz_sourcing` |
| 所属应用 | `ycSouring` |
| 构建时间 | `2026-06-04 23:42:45.6820` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（16个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bidauctionRuleId` | 竞拍规则表主表id | `bidauction_rule_id` | 7fc80044-d3dc-45e7-93a2-be1e14558b64 |
| 2 | `dr` | dr | `dr` | Short |
| 3 | `enterpriseId` | 租户id | `enterprise_id` | Long |
| 4 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 5 | `id` | ID | `id` | Long |
| 6 | `psnDeptId` | 人员部门id | `psn_dept_id` | Long |
| 7 | `psnDeptName` | 人员部门名称 | `psn_dept_name` | String |
| 8 | `psnId` | 人员id | `psn_id` | Long |
| 9 | `psnName` | 成员名称 | `psn_name` | String |
| 10 | `psnOrgId` | 组织id | `psn_org_id` | Long |
| 11 | `psnOrgName` | 组织名称 | `psn_org_name` | String |
| 12 | `psnPosition` | 人员职责 | `psn_position` | String |
| 13 | `pubts` | 时间戳 | `pubts` | DateTime |
| 14 | `ts` | 默认值 | `ts` | DateTime |
| 15 | `yTenantId` | 用户中心租户id | `ytenant_id` | String |
| 16 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bidauctionRuleId` | 竞拍规则表主表id | `yonbip-cpu-bcsourcing.bidauctionRule.CpuBidauctionRuleVO` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
