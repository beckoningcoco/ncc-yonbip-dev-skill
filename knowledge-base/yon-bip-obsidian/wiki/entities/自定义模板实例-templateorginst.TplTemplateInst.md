---
tags: ["BIP", "元数据", "数据字典", "ycBase", "tpl.templateorginst.TplTemplateInst"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 自定义模板实例 (`tpl.templateorginst.TplTemplateInst`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_tpl_template_inst` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `tpl.templateorginst.TplTemplateInst` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 自定义模板实例 |
| 物理表 | `cpu_tpl_template_inst` |
| domain/服务域 | `yonbip-cpu-bcsourcing` |
| schema | `cpu_pubbiz_sourcing` |
| 所属应用 | `ycBase` |
| 业务对象ID | `13b5c011-4056-4847-8213-c4b392c54024` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:17:00.7770` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2025-05-23 23:44:34:000
- **安装来源**: `/app/iuap-metadata-base-common/iuap-metadata-base/metadata-bootstrap/scripts/db/patch/mongodb/V6_R6_2407/0001_iuap-metadata-base/0010_iuap_common/DML/0270_iuap_metadata/202504/202504081039_metadata_voucher-base_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `eb42c52e-f0fd-4fb3-92ba-662aa779b6ee`

## 术语标记

`BusinessData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 7 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| 2 | 自动编号 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| 3 | 启用 (`IEnable`) | `ucfbase.ucfbaseItf.IEnable` | 141 | 3 |
| 4 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 5 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 6 | 跨租户采购商租户接口 (`IBuyerTenant`) | `cpu.itf.IBuyerTenant` | 10 | 1 |
| 7 | 跨租户供应商租户接口 (`IVendorTenant`) | `cpu.itf.IVendorTenant` | 14 | 1 |

---

## 直接属性（共 21 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `InstOrgs` | 采购模板适用组织实例 | `` | 066e209b-c507-456d-84fe-5f5aebbcfa72 | `` |  |  |
| 2 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String | `text` |  | ✓ |
| 3 | `code` | 编码 | `code` | String | `text` |  | ✓ |
| 4 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 5 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 6 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 7 | `creatorId` | 创建人 | `creator_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 8 | `disablets` | 停用时间 | `disablets` | DateTime | `dateTime` |  | ✓ |
| 9 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 10 | `enable` | 启用 | `enable` | sys_intboolean | `singleOption` |  | ✓ |
| 11 | `enablets` | 启用时间 | `enablets` | DateTime | `dateTime` |  | ✓ |
| 12 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 13 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 14 | `modifierId` | 更新人 | `modifier_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 15 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 16 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 17 | `name` | 模板名称 | `name` | String | `text` |  | ✓ |
| 18 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 19 | `templateId` | 采购模板主键 | `template_id` | Long | `long` |  | ✓ |
| 20 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String | `text` |  | ✓ |
| 21 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 4 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | `creator_id` |  →  |  |  | Service |  |
| 3 | `modifierId` | 更新人 | `base.user.User` | `modifier_id` |  →  |  |  | Service |  |
| 4 | `InstOrgs` | 采购模板适用组织实例 | `tpl.templateorginst.TplTemplateInstOrg` | `` | InstOrgs → templateInstId | 1..n | true | None |  |

### Composition（子表）

- **InstOrgs**: `InstOrgs` → `tpl.templateorginst.TplTemplateInstOrg` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `creatorId` (创建人) | `base.user.User` | `creator_id` |
| `modifierId` (更新人) | `base.user.User` | `modifier_id` |
