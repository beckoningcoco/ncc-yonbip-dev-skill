---
tags: [BIP, 元数据, 数据字典, drft.drftbillpoolagreemen.DrftMembersOfTheUnit]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 成员单位 (`drft.drftbillpoolagreemen.DrftMembersOfTheUnit`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`drft_membersoftheunit` | domain：`drft` | 应用：`DRFT` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 成员单位 |
| 物理表 | `drft_membersoftheunit` |
| domain/服务域 | `drft` |
| schema | `ctmdrft` |
| 所属应用 | `DRFT` |
| 直连字段 | 10 个 |
| 子表 | 0 个 |
| 关联引用 | 7 个 |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `securityaccount` | `bd_enterprisebankacctref` |
| `ytenant_id` | `` |
| `member_accentity_raw` | `bd_accbody` |
| `mainid` | `` |
| `sign_up_account` | `yonbip-fi-ctmtmsp.tmsp_elebankaccountref` |
| `member_accentity` | `ucf-org-center.bd_fundsorg_na` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 10 个直连字段

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 主表关联标识 |
| `member_accentity_raw` | `member_accentity_raw` | `accentityRaw` | 成员单位核算会计主体名称 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `member_accentity` | `member_accentity` | `accentity` | 下拨资金组织id |
| `sign_up_account` | `sign_up_account` | `signupaccount` | 签约主账号id |
| `securityaccount` | `securityaccount` | `securityaccount` | 保证金主账号id |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rowno` | `rowno` | `rowno` | 序号 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 人员明细表id |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
