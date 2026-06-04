---
tags: ["BIP", "元数据", "数据字典", "ycBusinessCenter", "ewallet.suppliertransapply.SupplierTransApplyLog"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 电子钱包供应商交易申请日志表 (`ewallet.suppliertransapply.SupplierTransApplyLog`)

> ycBusinessCenter | 物理表：`cpu_ew_supplier_trans_apply_log`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 电子钱包供应商交易申请日志表 |
| 物理表 | `cpu_ew_supplier_trans_apply_log` |
| 数据库 schema | `yonbip-cpu-bcsourcing` |
| 所属应用 | `ycBusinessCenter` |
| 构建时间 | `2026-06-04 23:43:38.3930` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（13个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `applyId` | 交易申请单 | `apply_id` | 4e17edaa-83d2-44c6-bb42-7e2c52098b9e |
| 2 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 3 | `dr` | 逻辑删除标记 | `dr` | Short |
| 4 | `id` | ID | `id` | Long |
| 5 | `operateStatus` | 操作状态 | `operate_status` | String |
| 6 | `operateType` | 操作类别 | `operate_type` | String |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime |
| 8 | `remark` | 备注信息 | `remark` | String |
| 9 | `requestParam` | 请求参数 | `request_param` | String |
| 10 | `requestUrl` | 请求地址 | `request_url` | String |
| 11 | `responseResult` | 响应结果 | `response_result` | String |
| 12 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 13 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `applyId` | 交易申请单 | `ewallet.suppliertransapply.SupplierTransApply` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
