---
tags: [BIP, 元数据, 数据字典, vc, vc.variantConfiguration.VariantConfiguration]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 选配参数文件 (`vc.variantConfiguration.VariantConfiguration`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `vc_variant_configuration` | 应用: `ED` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 选配参数文件 |
| 物理表 | `vc_variant_configuration` |
| 应用 | `ED` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |
| 编码 | `code` | `code` | |

## 部署信息

- 部署时间: 2026-05-22 23:54:50:000
- 安装来源: `/app/project_dir/src/manufacturing-server/scripts/db/patch/mongodb/V5_R0_2507/0001_engineeringdata/0010_iuap_common/DML/0270_iuap_metadata/0020_metadata/202604/202603242045_metadata_vc-variantConfiguration_delta.zip`

## 术语标记

`isAssigned`, `isExtend`, `ConfigData`

## 依赖接口（3 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| IAuto编码 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| IYTenant (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| IAuditInfo (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |

---

## 全部属性（39 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `id` | 主键ID | `id` | Long | `long` |  | true |
| 2 | `description` | 描述 | `description` | String | `multiLanguage` |  | true |
| 3 | `productId` | productId | `productId` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |  | true |
| 4 | `code` | 编码 | `code` | String | `text` |  | true |
| 5 | `effectiveDate` | effectiveDate(日期) | `effectiveDate` | DateTime | `timestamp` |  | true |
| 6 | `purpose` | purpose | `purpose` | PurposeEnum | `` |  | true |
| 7 | `checkDerivedMaterial` | heckDerivedMaterial | `check_derived_material` | String | `text` |  | true |
| 8 | `replaceDerivedMaterial` | replaceDerivedMaterial | `replace_derived_material` | String | `text` |  | true |
| 9 | `expiryDate` | expiryDate(日期) | `expiryDate` | DateTime | `timestamp` |  | true |
| 10 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 11 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 12 | `creator` | 创建人 | `creator` | String | `text` |  | true |
| 13 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | true |
| 14 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | true |
| 15 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 16 | `modifier` | 修改人 | `modifier` | String | `text` |  | true |
| 17 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | true |
| 18 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | true |
| 19 | `vcFreeCharacteristics` | vcFreeCharacteristics | `vc_free_characteristics` | 39f8975e-3ec5-4295-90a9-0da6b833e5e6 | `OptionCT` |  | true |
| 20 | `vouchdate` | vouchdate | `vouchdate` | Date | `date` |  | true |
| 21 | `VCAttr` | VCAttr | `` | db6dc82c-2be2-4a8b-bafc-f98d76c2fe7b | `` |  |  |
| 22 | `VCComponent` | VCComponent | `` | b0268271-cf88-4d00-bcff-07c7c70a92ff | `` |  |  |
| 23 | `bomId` | bomId | `bom_id` | f494c08f-f466-474b-937a-4773d56696ed | `quote` |  | true |
| 24 | `characterId` | characterId | `character_id` | 1a5d304f-40a4-47a2-a075-f8b5ab6af37b | `quote` |  | true |
| 25 | `createConfigType` | createConfigType(类型) | `create_config_type` | String | `text` |  | true |
| 26 | `newVersion` | newVersion | `new_version` | Integer | `int` |  | true |
| 27 | `orgId` | 组织ID | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |  | true |
| 28 | `refSupperBom` | refSupperBom | `ref_supper_bom` | Short | `short` |  | true |
| 29 | `showGroup` | showGroup | `show_group` | Short | `short` |  | true |
| 30 | `status` | 状态 | `status` | Short | `short` |  | true |
| 31 | `subVersion` | subVersion | `sub_version` | String | `text` |  | true |
| 32 | `substituteFlag` | substituteFlag | `substitute_flag` | String | `text` |  | true |
| 33 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` | true | true |
| 34 | `tplid` | tplid | `tplid` | Long | `long` |  | true |
| 35 | `vcConfigType` | vcConfigType(类型) | `vc_config_type` | String | `text` |  | true |
| 36 | `vcFreeCts` | vcFreeCts | `vc_free_cts` | 4f52bf42-3815-40fa-b91f-b9039441c1e6 | `UserDefine` |  | true |
| 37 | `vcType` | vcType(类型) | `vc_type` | Short | `short` |  | true |
| 38 | `version` | 版本号 | `version` | String | `text` |  | true |
| 39 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |

## 关联属性（12 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `bomId` | bomId | `ed.bom.Bom` | `bom_id` | 外键 |  |  | None |  |
| 2 | `vcFreeCts` | vcFreeCts | `vc.variantConfiguration.VariantConfigFCT` | `vc_free_cts` | 外键 |  |  | None |  |
| 3 | `productId` | productId | `pc.product.Product` | `productId` | 外键 |  |  | Service |  |
| 4 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 5 | `creatorId` | 创建人ID | `base.user.User` | `creatorId` | 外键 |  |  | Service |  |
| 6 | `modifierId` | 修改人ID | `base.user.User` | `modifierId` | 外键 |  |  | Service |  |
| 7 | `vcFreeCharacteristics` | vcFreeCharacteristics | `vc.variantConfiguration.VcFreeCharacteristics` | `vc_free_characteristics` | 外键 |  |  | None |  |
| 8 | `characterId` | characterId | `base.character.Character` | `character_id` | 外键 |  |  | Service |  |
| 9 | `VCComponent` | VCComponent | `vc.variantConfiguration.VariantConfigurationComponent` | `` | VCComponent → variantConfiguration | 0..n | Y | None |  |
| 10 | `orgId` | 组织ID | `aa.baseorg.OrgMV` | `org_id` | 外键 |  |  | Service |  |
| 11 | `tenant` | tenant | `base.tenant.Tenant` | `tenant_id` | 外键 |  |  | Service |  |
| 12 | `VCAttr` | VCAttr | `vc.variantConfiguration.VariantConfigurationAttr` | `` | VCAttr → variantConfiguration | 0..n | Y | None |  |

---

## SQL 示例

```sql
SELECT id, description, productId, code, effectiveDate, purpose, check_derived_material, replace_derived_material
FROM vc_variant_configuration
```