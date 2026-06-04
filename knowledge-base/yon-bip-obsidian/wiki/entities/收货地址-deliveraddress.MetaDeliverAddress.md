---
tags: ["BIP", "元数据", "数据字典", "ycYuncaiMall", "mall.deliveraddress.MetaDeliverAddress"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 收货地址 (`mall.deliveraddress.MetaDeliverAddress`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycYuncaiMall 模块实体元数据字典。
> 物理表：`deliver_address` | 所属应用：`ycYuncaiMall`
> 来源：元数据API `queryByUri` 返回的 `mall.deliveraddress.MetaDeliverAddress` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 收货地址 |
| 物理表 | `deliver_address` |
| 数据库 schema | `yonbip-cpu-mall` |
| 所属应用 | `ycYuncaiMall` |
| 业务对象ID | `5700e099-e9c3-4830-9ee9-00d81dbfecee` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:00:50.1760` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `ID` | `ID` | Long | ID |

## 部署信息

- **部署时间**: 2026-05-23 00:59:45:000
- **安装来源**: `/app/data_scripts/cpu-mall-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-mall/0010_iuap_common/DML/0270_iuap_metadata/202601231626_metadata_mall-deliveraddress_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `d3705774-d90a-4e26-ae67-dd11712ba696`

## 业务场景

- `FieldAuth`
- `dataMultilanguage`
- `UITemplate`
- `DataAuth`
- `imextmp`
- `dataPrivacy`
- `userdefine`
- `api`

## 术语标记

`BusinessData`, `data_auth`, `doc`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 3 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 3 | 审计信息 (`IAuditInfo`) | `ucfbase.ucfbaseItf.IAuditInfo` | 192 | 4 |

---

## 直接属性（共 20 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | ID | `ID` | Long | `long` |  | ✓ |
| 2 | `consignee` | 收货人ID | `CONSIGNEE` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 3 | `phoneNumber` | 电话号码 | `PHONE_NUMBER` | String | `text` |  | ✓ |
| 4 | `userId` | 用户id | `USER_ID` | a2f7c666-0173-4f52-bf36-ed780414b2f3 | `quote` |  | ✓ |
| 5 | `isDefault` | 是否默认 | `IS_DEFAULT` | String | `text` |  | ✓ |
| 6 | `zip` | 邮编 | `ZIP` | String | `text` |  | ✓ |
| 7 | `consigneeOrgId` | 收货组织id | `CONSIGNEE_ORG_ID` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 8 | `addressType` | 地址类型 | `ADDRESS_TYPE` | String | `text` |  | ✓ |
| 9 | `warehouseId` | 仓库档案ID | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | `quote` |  | ✓ |
| 10 | `extraErpId` | ERP收货地址ID | `extra_erp_id` | String | `text` |  | ✓ |
| 11 | `detailAddress` | 详细地址 | `detail_address` | String | `text` |  | ✓ |
| 12 | `dr` | 逻辑删除标识 | `DR` | Integer | `int` |  | ✓ |
| 13 | `ctId` | 自定义项特征组id | `ct_id` | b14f22f2-2ec1-4437-832e-65d7b797ae57 | `UserDefine` |  | ✓ |
| 14 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 15 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |  | ✓ |
| 16 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |  | ✓ |
| 17 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 18 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 19 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |  | ✓ |
| 20 | `metaDeliverAddressMappings` | 收货地址映射 | `` | 373c40aa-41a2-4413-a1e1-ad7d25d21131 | `` |  |  |

---

## 关联属性（共 9 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ctId` | 自定义项特征组id | `mall.deliveraddress.MetaDeliverAddressCt` | `ct_id` |  →  |  |  | None |  |
| 2 | `creator` | 创建人 | `base.user.BipUser` | `creator` |  →  |  |  | Service |  |
| 3 | `consignee` | 收货人ID | `bd.staff.Staff` | `CONSIGNEE` |  →  |  |  | Service |  |
| 4 | `warehouseId` | 仓库档案ID | `aa.warehouse.Warehouse` | `warehouse_id` |  →  |  |  | Service |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 6 | `metaDeliverAddressMappings` | 收货地址映射 | `mall.deliveraddress.MetaDeliverAddressMapping` | `` | metaDeliverAddressMappings → deliverAddressId | 1..n | true | None |  |
| 7 | `modifier` | 修改人 | `base.user.BipUser` | `modifier` |  →  |  |  | Service |  |
| 8 | `consigneeOrgId` | 收货组织id | `org.func.BaseOrg` | `CONSIGNEE_ORG_ID` |  →  |  |  | Service |  |
| 9 | `userId` | 用户id | `cpu-privilege.user.MgrUser` | `USER_ID` |  →  |  |  | Service |  |

### Composition（子表）

- **metaDeliverAddressMappings**: `metaDeliverAddressMappings` → `mall.deliveraddress.MetaDeliverAddressMapping` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `creator` (创建人) | `base.user.BipUser` | `creator` |
| `consignee` (收货人ID) | `bd.staff.Staff` | `CONSIGNEE` |
| `warehouseId` (仓库档案ID) | `aa.warehouse.Warehouse` | `warehouse_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `modifier` (修改人) | `base.user.BipUser` | `modifier` |
| `consigneeOrgId` (收货组织id) | `org.func.BaseOrg` | `CONSIGNEE_ORG_ID` |
| `userId` (用户id) | `cpu-privilege.user.MgrUser` | `USER_ID` |
