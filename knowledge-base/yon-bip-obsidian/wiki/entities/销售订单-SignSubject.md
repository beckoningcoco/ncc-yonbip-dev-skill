---
tags: [BIP, 元数据, 数据字典, 销售订单, SCMSA, voucher.order.SignSubject]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
parent_entity: voucher.order.Order
---

# 合同签署主体 (`voucher.order.SignSubject`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP 供应链（SCMSA）模块销售订单的子实体元数据字典。
> 物理表：`order_signsubject` | 所属应用：`SCMSA`
> 父实体：[[销售订单元数据]] (`voucher.order.Order`)

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同签署主体 |
| 描述 |  |
| 物理表 | `order_signsubject` |
| 所属应用 | `SCMSA` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 数据权限场景 | `` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 主键ID |

## 部署信息

- **部署时间**: 2025-10-24 23:38:51:000
- **安装来源**: `/app/uorders/ubill/src/ubill-server/scripts/db/patch/mongodb/V5_R0_2507/0001_udinghuo/0010_iuap_common/DML/0270_iuap_metadata/202510/202508291052_metadata_voucher-order_delta.zip`
- **安装人**: mongoTools

## 术语标记

`BusinessData`

## 约束

- **migration_id** (MetaClassPrimary): 合同签署主体子表ID — 唯一字段: `['id']`

---

## 依赖接口（共 1 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | IYTenant (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

### IYTenant (`IYTenant`)
> URI: `ucfbase.ucfbaseItf.IYTenant` | 版本: 40

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `ytenant` (租户) | `ytenant_id` | `quote` | `yht.tenant.YhtTenant` |

---

## 全部直接属性（共 18 个）

> 含直接映射数据库列的字段。类型为 UUID 的为外键引用（详见关联属性节）。

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 | URI |
|---|--------|--------|---------|------|---------|------|------|-----|
| 1 | `address` | 注册地址 | `address` | String | `text` |  | true | `voucher.order.SignSubject.address` |
| 2 | `bankAccount` | 银行账号 | `bank_account` | String | `text` |  | true | `voucher.order.SignSubject.bankAccount` |
| 3 | `bankOfDeposit` | bankOfDeposit | `bank_of_deposit` | String | `text` |  | true | `voucher.order.SignSubject.bankOfDeposit` |
| 4 | `facsimile` | facsimile | `facsimile` | String | `text` |  | true | `voucher.order.SignSubject.facsimile` |
| 5 | `id` | 主键ID | `id` | Long | `long` |  | true | `voucher.order.SignSubject.id` |
| 6 | `isDefault` | isDefault | `is_default` | Boolean | `switch` |  | true | `voucher.order.SignSubject.isDefault` |
| 7 | `isOriginator` | isOriginator | `is_originator` | Boolean | `switch` |  | true | `voucher.order.SignSubject.isOriginator` |
| 8 | `mainid` | 主表ID | `main_id` | c7c0beb4-f830-486d-83e1-51072b319fd2 | `quote` |  | true | `voucher.order.SignSubject.mainid` |
| 9 | `memo` | 备注 | `memo` | String | `text` |  | true | `voucher.order.SignSubject.memo` |
| 10 | `merchantAuth` | 客户权限 | `sign_agent_id` | 7cc86f92-b244-4581-8dcf-a6b7cb76516f | `quote` |  | true | `voucher.order.SignSubject.merchantAuth` |
| 11 | `postalCode` | postalCode | `postal_code` | String | `text` |  | true | `voucher.order.SignSubject.postalCode` |
| 12 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true | `voucher.order.SignSubject.pubts` |
| 13 | `signAgentId` | signAgentId | `sign_agent_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` | false | true | `voucher.order.SignSubject.signAgentId` |
| 14 | `signOrder` | signOrder | `sign_order` | Decimal | `number` |  | true | `voucher.order.SignSubject.signOrder` |
| 15 | `signOrgId` | signOrgId | `sign_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` | false | true | `voucher.order.SignSubject.signOrgId` |
| 16 | `signSubjectType` | signSubjectType | `sign_subject_type` | Short | `short` |  | true | `voucher.order.SignSubject.signSubjectType` |
| 17 | `telephone` | 注册电话 | `telephone` | String | `text` |  | true | `voucher.order.SignSubject.telephone` |
| 18 | `ytenant` | 租户 | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true | `ucfbase.ucfbaseItf.IYTenant.ytenant` |

---

## 关联属性（共 5 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `signAgentId` | signAgentId | `aa.merchant.Merchant` | `sign_agent_id` | 外键引用 |  |  | Service |  |
| 2 | `ytenant` | 租户 | `yht.tenant.YhtTenant` | `ytenant_id` | 外键引用 |  |  | Service |  |
| 3 | `merchantAuth` | 客户权限 | `pb.dataauth.MerchantAuthDataAuth` | `sign_agent_id` | 外键引用 |  |  | None |  |
| 4 | `mainid` | 主表ID | `voucher.order.Order` | `main_id` | signSubjects → mainid | 0..n | Y | None |  |
| 5 | `signOrgId` | signOrgId | `org.func.BaseOrg` | `sign_org_id` | 外键引用 |  |  | Service |  |

### Composition（子表）

- **主表ID**: `mainid` → `voucher.order.Order` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `signAgentId` (signAgentId) | `aa.merchant.Merchant` | `sign_agent_id` |
| `ytenant` (租户) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `signOrgId` (signOrgId) | `org.func.BaseOrg` | `sign_org_id` |

---

## 使用示例

```sql
-- 查询 合同签署主体 数据
SELECT address, bank_account, bank_of_deposit, facsimile, id, is_default, is_originator, main_id, memo, sign_agent_id
FROM order_signsubject
WHERE mainid = ? -- 关联主表ID
```

### 通过 API 获取元数据

```bash
python bip_metadata_query.py voucher.order.SignSubject
```
