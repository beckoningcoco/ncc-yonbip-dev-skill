---
tags: ["BIP", "元数据", "数据字典", "ycYuncaiMall", "mall.operatingcustomer.CpuOperatingCustomer"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 运营客户表 (`mall.operatingcustomer.CpuOperatingCustomer`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycYuncaiMall 模块实体元数据字典。
> 物理表：`cpu_operating_customer` | 所属应用：`ycYuncaiMall`
> 来源：元数据API `queryByUri` 返回的 `mall.operatingcustomer.CpuOperatingCustomer` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 运营客户表 |
| 物理表 | `cpu_operating_customer` |
| 数据库 schema | `yonbip-cpu-mall` |
| 所属应用 | `ycYuncaiMall` |
| 业务对象ID | `4760cf91-b8b7-45f1-82f1-721b8941dad1` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:00:45.2590` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | id |

## 部署信息

- **部署时间**: 2025-10-24 23:19:34:000
- **安装来源**: `/app/data_scripts/cpu-mall-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-mall/0010_iuap_common/DML/0270_iuap_metadata/202509092019_metadata_mall-operatingcustomer.zip`
- **安装人**: mongoTools
- **安装排名**: `cd64e520-6c34-4d16-b2e8-780fd5922b8b`

## 业务场景

- `UITemplate`

## 术语标记

`BusinessData`, `isMain`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 3 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 3 | 审计信息 (`IAuditInfo`) | `ucfbase.ucfbaseItf.IAuditInfo` | 192 | 4 |

---

## 直接属性（共 21 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | id | `id` | Long | `long` |  | ✓ |
| 2 | `addType` |  | `add_type` | addType | `` |  | ✓ |
| 3 | `businessRole` | 业务类角色 | `business_role` | 6c660d78-70a8-438e-9925-f1c342df3a12 | `quote` |  | ✓ |
| 4 | `contacts` | 联系人 | `contacts` | String | `text` |  | ✓ |
| 5 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |  | ✓ |
| 6 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 7 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 8 | `email` | 邮箱 | `email` | String | `text` |  | ✓ |
| 9 | `lastOrg` | 上级组织 | `last_org` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 10 | `manageRole` | 管理类角色 | `manage_role` | 6c660d78-70a8-438e-9925-f1c342df3a12 | `quote` |  | ✓ |
| 11 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 12 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |  | ✓ |
| 13 | `name` | 企业名称 | `name` | String | `multiLanguage` |  | ✓ |
| 14 | `org` | 关联组织 | `org` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 15 | `phone` | 手机号 | `phone` | String | `text` |  | ✓ |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |  | ✓ |
| 17 | `relateCustomer` | 关联客户 | `relate_customer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |  | ✓ |
| 18 | `schedule` | 执行进度 | `schedule` | schedule | `` |  | ✓ |
| 19 | `socialCreditCode` | 企业社会信用证代码 | `social_credit_code` | String | `text` |  | ✓ |
| 20 | `status` | 单据状态 | `status` | status | `` |  | ✓ |
| 21 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 8 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `manageRole` | 管理类角色 | `sys.auth.Role` | `manage_role` |  →  |  |  | Service |  |
| 2 | `creator` | 创建人 | `base.user.BipUser` | `creator` |  →  |  |  | Service |  |
| 3 | `businessRole` | 业务类角色 | `sys.auth.Role` | `business_role` |  →  |  |  | Service |  |
| 4 | `org` | 关联组织 | `org.func.BaseOrg` | `org` |  →  |  |  | Service |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 6 | `relateCustomer` | 关联客户 | `aa.merchant.Merchant` | `relate_customer` |  →  |  |  | Service |  |
| 7 | `modifier` | 修改人 | `base.user.BipUser` | `modifier` |  →  |  |  | Service |  |
| 8 | `lastOrg` | 上级组织 | `org.func.BaseOrg` | `last_org` |  →  |  |  | Service |  |

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `manageRole` (管理类角色) | `sys.auth.Role` | `manage_role` |
| `creator` (创建人) | `base.user.BipUser` | `creator` |
| `businessRole` (业务类角色) | `sys.auth.Role` | `business_role` |
| `org` (关联组织) | `org.func.BaseOrg` | `org` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `relateCustomer` (关联客户) | `aa.merchant.Merchant` | `relate_customer` |
| `modifier` (修改人) | `base.user.BipUser` | `modifier` |
| `lastOrg` (上级组织) | `org.func.BaseOrg` | `last_org` |
