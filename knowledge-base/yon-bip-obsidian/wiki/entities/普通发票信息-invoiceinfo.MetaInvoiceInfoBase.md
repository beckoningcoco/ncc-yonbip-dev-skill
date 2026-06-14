---
tags: ["BIP", "元数据", "数据字典", "ycYuncaiMall", "mall.invoiceinfo.MetaInvoiceInfoBase"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 普通发票信息 (`mall.invoiceinfo.MetaInvoiceInfoBase`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycYuncaiMall 模块实体元数据字典。
> 物理表：`invoice_info_base` | 所属应用：`ycYuncaiMall`
> 来源：元数据API `queryByUri` 返回的 `mall.invoiceinfo.MetaInvoiceInfoBase` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 普通发票信息 |
| 物理表 | `invoice_info_base` |
| domain/服务域 | `yonbip-cpu-mall` |
| schema | `cpu_mall` |
| 所属应用 | `ycYuncaiMall` |
| 业务对象ID | `8ef03e47-33ed-4b64-89a4-5b5b3aea20fc` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:00:52.1790` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |
| 编码 | `vat_tax_no` | `vat_tax_no` | String | 纳税人识别号（必填，isCode）|

## 部署信息

- **部署时间**: 2026-01-23 23:40:40:000
- **安装来源**: `/app/data_scripts/cpu-mall-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-mall/0010_iuap_common/DML/0270_iuap_metadata/202512161522_metadata_mall-invoiceinfo_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `8fa335ae-99c9-4170-b246-b8dced03900d`

## 业务场景

- `dataMultilanguage`
- `UITemplate`
- `dataPrivacy`

## 术语标记

`MasterData`

## 约束

- **orgId_invoiceType_invoiceEnter** (transformKey): 主键翻译 — 唯一字段: `['invoiceEnterprise', 'vatTaxNo', 'invoiceType', 'orgId']`
- **migration_id** (MetaClassPrimary): 主键 — 唯一字段: `['id']`

## 依赖接口（共 2 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |

---

## 直接属性（共 23 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 2 | `invoiceType` | 开票类型 | `invoice_type` | Integer | `int` |  | ✓ |
| 3 | `vatTaxNo` | 纳税人识别号 | `vat_tax_no` | String | `text` |  | ✓ |
| 4 | `vatRegAddr` | 注册地址 | `vat_reg_addr` | String | `text` |  | ✓ |
| 5 | `vatRegTel` | 注册电话 | `vat_reg_tel` | String | `text` |  | ✓ |
| 6 | `vatBank` | 注册银行 | `vat_bank` | String | `text` |  | ✓ |
| 7 | `vatBankAccount` | 注册银行账户 | `vat_bank_account` | String | `text` |  | ✓ |
| 8 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 9 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 10 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 11 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 12 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 13 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 14 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 15 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 16 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |  | ✓ |
| 18 | `invoiceEnterprise` | 发票抬头 | `invoice_enterprise` | String | `text` |  | ✓ |
| 19 | `detailAddress` | 收票地址 | `detail_address` | String | `text` |  | ✓ |
| 20 | `mobile` | 联系方式 | `mobile` | String | `text` |  | ✓ |
| 21 | `personId` | 收票人ID | `person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 22 | `isPermit` | 是否随单默认 | `is_permit` | Boolean | `switch` |  | ✓ |
| 23 | `orgId` | 组织ID | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |

---

## 关联属性（共 5 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | `creatorId` |  →  |  |  | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | `modifierId` |  →  |  |  | Service |  |
| 4 | `personId` | 收票人ID | `bd.staff.Staff` | `person_id` |  →  |  |  | Service |  |
| 5 | `orgId` | 组织ID | `org.func.BaseOrg` | `org_id` |  →  |  |  | Service |  |

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `creatorId` (创建人) | `base.user.User` | `creatorId` |
| `modifierId` (修改人) | `base.user.User` | `modifierId` |
| `personId` (收票人ID) | `bd.staff.Staff` | `person_id` |
| `orgId` (组织ID) | `org.func.BaseOrg` | `org_id` |
