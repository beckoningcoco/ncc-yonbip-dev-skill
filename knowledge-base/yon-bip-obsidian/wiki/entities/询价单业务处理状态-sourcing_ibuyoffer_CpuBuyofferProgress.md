---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.ibuyoffer.CpuBuyofferProgress"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 询价单业务处理状态 (`sourcing.ibuyoffer.CpuBuyofferProgress`)

> ycSouringInquiry | 物理表：`cpu_buyoffer_progress`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 询价单业务处理状态 |
| 物理表 | `cpu_buyoffer_progress` |
| domain/服务域 | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 构建时间 | `2026-06-04 23:06:19.7120` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（21个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `creator` | 提交审批人 | `creator` | String |
| 3 | `createTime` | 提交时间 | `create_time` | DateTime |
| 4 | `enterpriseName` | 提交备注说明 | `enterprise_name` | String |
| 5 | `processType` | 1:1688,2:微信消息,3:广泛供应商消息,4:指定供应商消息,5:.. | `process_type` | String |
| 6 | `processStatus` | 1:已发出,2:成功接收(1688),3:收到报价,4:... | `process_status` | String |
| 7 | `quotationid` | 询价单id | `quotationid` | 5232ab96-f504-4bac-95bc-c1cba8d49f63 |
| 8 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 9 | `buyofferDetailId` | 询价单表体id | `buyoffer_detail_id` | 82d935cb-9072-4a12-b50a-8c1950dfd402 |
| 10 | `dr` |  | `dr` | String |
| 11 | `ecBuyofferDetailId` | 电商询价单表体id | `ec_buyoffer_detail_id` | String |
| 12 | `ecBuyofferId` | 电商询价单id | `ec_buyoffer_id` | String |
| 13 | `enterpriseId` | 企业id | `enterprise_id` | Long |
| 14 | `errorMsg` | 错误信息 | `error_msg` | String |
| 15 | `modifiedtime` | 更新时间 | `modifiedtime` | DateTime |
| 16 | `modifier` | 更新人 | `modifier` | String |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime |
| 18 | `supplierDocId` | 云采供应商档案id | `supplier_doc_id` | Long |
| 19 | `sysVersion` | 系统版本 | `sys_version` | Long |
| 20 | `targetId` | 消息id | `target_id` | String |
| 21 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `quotationid` | 询价单id | `sourcing.ibuyoffer.BuyOfferVO` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `buyofferDetailId` | 询价单表体id | `sourcing.ibuyoffer.BuyOfferBodyVO` | None |  |
