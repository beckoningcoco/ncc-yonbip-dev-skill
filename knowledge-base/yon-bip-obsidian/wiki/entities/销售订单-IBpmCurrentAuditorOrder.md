---
tags: [BIP, 元数据, 数据字典, 销售订单, SCMSA, voucher.order.IBpmCurrentAuditorOrder]
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

# 当前审批人 (`voucher.order.IBpmCurrentAuditorOrder`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP 供应链（SCMSA）模块销售订单的子实体元数据字典。
> 物理表：`order_ibpmcurauditor` | 所属应用：`SCMSA`
> 父实体：[[销售订单元数据]] (`voucher.order.Order`)

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 当前审批人 |
| 描述 |  |
| 物理表 | `order_ibpmcurauditor` |
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

- **部署时间**: 2026-05-22 22:09:33:000
- **安装来源**: `/app/iuap-metadata-base-common/iuap-metadata-base/metadata-bootstrap/scripts/db/patch/mongodb/V7_R0_2507/0001_iuap-metadata-base/0010_iuap_common/DML/0270_iuap_metadata/202604/202604161115_metadata_ucfbase-ucfbaseItf.zip`
- **安装人**: mongoTools

## 术语标记

`BusinessData`

## 约束

- **migration_id** (MetaClassPrimary): id — 唯一字段: `['id']`

---

## 依赖接口（共 4 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | IUordercorp (`IUordercorp`) | `base.itf.IUordercorp` | 73 | 1 |
| 2 | Deletable (`Deletable`) | `base.itf.Deletable` | 67 | 1 |
| 3 | IYTenant (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 4 | IBpmApprovalTask (`IBpmApprovalTask`) | `ucfbase.ucfbaseItf.IBpmApprovalTask` | 93 | 11 |

### IUordercorp (`IUordercorp`)
> URI: `base.itf.IUordercorp` | 版本: 73

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `uordercorp` (公司(分区键)) | `iCorpId` | `long` | `Long` |

### Deletable (`Deletable`)
> URI: `base.itf.Deletable` | 版本: 67

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `isDeleted` (isDeleted) | `iDeleted` | `switch` | `Boolean` |

### IYTenant (`IYTenant`)
> URI: `ucfbase.ucfbaseItf.IYTenant` | 版本: 40

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `ytenant` (租户) | `ytenant_id` | `quote` | `yht.tenant.YhtTenant` |

### IBpmApprovalTask (`IBpmApprovalTask`)
> URI: `ucfbase.ucfbaseItf.IBpmApprovalTask` | 版本: 93

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `approvalActivityId` (approvalActivityId) | `approval_activity_id` | `text` | `String` |
| `approvalActivityName` (approvalActivityName) | `approval_activity_name` | `text` | `String` |
| `approvalActivityResid` (approvalActivityResid) | `approval_activity_resid` | `text` | `String` |
| `approvalComment` (approvalComment) | `approval_comment` | `text` | `String` |
| `approvalInstId` (approvalInstId) | `approval_instid` | `text` | `String` |
| `approvalResult` (approvalResult) | `approval_result` | `text` | `String` |
| `approvalSign` (approvalSign) | `approval_sign` | `text` | `String` |
| `approvalTime` (approvalTime) | `approval_time` | `dateTime` | `Timestamp` |
| `auditor` (审批人) | `auditor` | `quote` | `base.user.BipUser` |
| `taskId` (taskId) | `taskid` | `text` | `String` |
| `taskStatus` (taskStatus) | `task_status` | `text` | `String` |

---

## 全部直接属性（共 17 个）

> 含直接映射数据库列的字段。类型为 UUID 的为外键引用（详见关联属性节）。

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 | URI |
|---|--------|--------|---------|------|---------|------|------|-----|
| 1 | `approvalActivityId` | approvalActivityId | `approval_activity_id` | String | `text` |  | true | `ucfbase.ucfbaseItf.IBpmApprovalTask.approvalActivityId` |
| 2 | `approvalActivityName` | approvalActivityName | `approval_activity_name` | String | `text` |  | true | `ucfbase.ucfbaseItf.IBpmApprovalTask.approvalActivityName` |
| 3 | `approvalActivityResid` | approvalActivityResid | `approval_activity_resid` | String | `text` |  | true | `ucfbase.ucfbaseItf.IBpmApprovalTask.approvalActivityResid` |
| 4 | `approvalComment` | approvalComment | `approval_comment` | String | `text` |  | true | `ucfbase.ucfbaseItf.IBpmApprovalTask.approvalComment` |
| 5 | `approvalInstId` | approvalInstId | `approval_instid` | String | `text` |  | true | `ucfbase.ucfbaseItf.IBpmApprovalTask.approvalInstId` |
| 6 | `approvalResult` | approvalResult | `approval_result` | String | `text` |  | true | `ucfbase.ucfbaseItf.IBpmApprovalTask.approvalResult` |
| 7 | `approvalSign` | approvalSign | `approval_sign` | String | `text` |  | true | `ucfbase.ucfbaseItf.IBpmApprovalTask.approvalSign` |
| 8 | `approvalTime` | approvalTime | `approval_time` | DateTime | `dateTime` |  | true | `ucfbase.ucfbaseItf.IBpmApprovalTask.approvalTime` |
| 9 | `auditor` | 审批人 | `auditor` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true | `ucfbase.ucfbaseItf.IBpmApprovalTask.auditor` |
| 10 | `id` | 主键ID | `id` | Long | `long` |  | true | `voucher.order.IBpmCurrentAuditorOrder.id` |
| 11 | `isDeleted` | isDeleted | `iDeleted` | Boolean | `switch` |  | true | `base.itf.Deletable.isDeleted` |
| 12 | `orderId` | 订单ID | `iorderId` | c7c0beb4-f830-486d-83e1-51072b319fd2 | `quote` |  | true | `voucher.order.IBpmCurrentAuditorOrder.orderId` |
| 13 | `pubts` | 时间戳 | `pubuts` | DateTime | `timestamp` |  | true | `uorder.voucher.UorderBizObject.pubts` |
| 14 | `taskId` | taskId | `taskid` | String | `text` |  | true | `ucfbase.ucfbaseItf.IBpmApprovalTask.taskId` |
| 15 | `taskStatus` | taskStatus | `task_status` | String | `text` |  | true | `ucfbase.ucfbaseItf.IBpmApprovalTask.taskStatus` |
| 16 | `uordercorp` | 公司(分区键) | `iCorpId` | Long | `long` |  | true | `base.itf.IUordercorp.uordercorp` |
| 17 | `ytenant` | 租户 | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true | `ucfbase.ucfbaseItf.IYTenant.ytenant` |

---

## 关联属性（共 3 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `orderId` | 订单ID | `voucher.order.Order` | `iorderId` | orderBpmCurAuditors → orderId | 0..n | Y | None |  |
| 2 | `ytenant` | 租户 | `yht.tenant.YhtTenant` | `ytenant_id` | 外键引用 |  |  | Service |  |
| 3 | `auditor` | 审批人 | `base.user.BipUser` | `auditor` | 外键引用 |  |  | Service |  |

### Composition（子表）

- **订单ID**: `orderId` → `voucher.order.Order` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `auditor` (审批人) | `base.user.BipUser` | `auditor` |

---

## 使用示例

```sql
-- 查询 当前审批人 数据
SELECT approval_activity_id, approval_activity_name, approval_activity_resid, approval_comment, approval_instid, approval_result, approval_sign, approval_time, auditor, id
FROM order_ibpmcurauditor
WHERE orderId = ? -- 关联订单ID
```

### 通过 API 获取元数据

```bash
python bip_metadata_query.py voucher.order.IBpmCurrentAuditorOrder
```
