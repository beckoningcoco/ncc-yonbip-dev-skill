---
tags: ["BIP", "元数据", "数据字典", "ycYuncaiMall", "mall.matchPolicy.MatchPolicyDetail"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 清单匹配策略详情 (`mall.matchPolicy.MatchPolicyDetail`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycYuncaiMall 模块实体元数据字典。
> 物理表：`match_policy_detail` | 所属应用：`ycYuncaiMall`
> 来源：元数据API `queryByUri` 返回的 `mall.matchPolicy.MatchPolicyDetail` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 清单匹配策略详情 |
| 物理表 | `match_policy_detail` |
| domain/服务域 | `yonbip-cpu-mall` |
| schema | `cpu_mall` |
| 所属应用 | `ycYuncaiMall` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:08:12.9430` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | id |

## 部署信息

- **部署时间**: 2025-10-24 23:19:30:000
- **安装来源**: `/app/data_scripts/cpu-mall-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-mall/0010_iuap_common/DML/0270_iuap_metadata/202508061549_metadata_mall-matchPolicy.zip`
- **安装人**: mongoTools
- **安装排名**: `3b635bfd-1fd7-4499-90bd-df3ae666ba67`

## 术语标记

`BusinessData`

## 约束

- **bizUniqueIndex_transform** (transformKey): 唯一业务规则 — 唯一字段: `['id']`
- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`
- **bizUniqueIndex** (Unique): 唯一业务规则 — 唯一字段: `['id']`

## 依赖接口（共 3 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 3 | 企业ID (`IEnterprise`) | `cpu-base.itf.IEnterprise` | 7 | 1 |

---

## 直接属性（共 28 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | id | `id` | Long | `long` |  | ✓ |
| 2 | `enterpriseId` | enterpriseId | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 | `quote` | ✓ |  |
| 3 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 4 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |  | ✓ |
| 6 | `policyId` | 匹配策略id | `policy_id` | 1a16ebd2-960c-461c-be67-225e1832bc13 | `quote` |  | ✓ |
| 7 | `material` | 物料id | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |  | ✓ |
| 8 | `materialName` | 物料名称 | `material_name` | String | `text` |  | ✓ |
| 9 | `materialCode` | 物料编码 | `material_code` | String | `text` |  | ✓ |
| 10 | `purchaseUnit` | 采购单位 | `purchase_unit` | String | `text` |  | ✓ |
| 11 | `applyOriginQuantity` | 采购数量 | `apply_origin_quantity` | Decimal | `number` |  | ✓ |
| 12 | `applyPurchaseOrg` | 需求组织id | `apply_purchase_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 13 | `applyPurchaseOrgName` | 需求组织 | `apply_purchase_org_name` | String | `text` |  | ✓ |
| 14 | `applyPurchaseDept` | 需求部门id | `apply_purchase_dept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |  | ✓ |
| 15 | `applyPurchaseDeptName` | 需求部门 | `apply_purchase_dept_name` | String | `text` |  | ✓ |
| 16 | `applyPerson` | 需求人员id | `apply_person_id` | 78bff1de-ddf1-4814-90de-b0b5f1eac78a | `quote` |  | ✓ |
| 17 | `applyPersonName` | 需求人员 | `apply_person_name` | String | `text` |  | ✓ |
| 18 | `consigneePerson` | 收货人id | `consignee_person_id` | 78bff1de-ddf1-4814-90de-b0b5f1eac78a | `quote` |  | ✓ |
| 19 | `consigneePersonName` | 收货人 | `consignee_person_name` | String | `text` |  | ✓ |
| 20 | `consigneeOrg` | 收货组织id | `consignee_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 21 | `consigneeOrgName` | 收货组织 | `consignee_org_name` | String | `text` |  | ✓ |
| 22 | `consigneeAddress` | 收货地址 | `consignee_address` | String | `text` |  | ✓ |
| 23 | `memo` | 备注 | `memo` | String | `text` |  | ✓ |
| 24 | `attachment` | 附件 | `attachment_id` | String | `text` |  | ✓ |
| 25 | `ipuReqCode` | 采购任务编码 | `ipu_req_code` | String | `text` |  | ✓ |
| 26 | `ipuReqId` | 采购任务ID | `ipu_req_id` | Long | `long` |  | ✓ |
| 27 | `sourceBillno` | 来源单据类型 | `source_billno` | String | `text` |  | ✓ |
| 28 | `matchPolicyProduct` | 清单匹配商品 | `` | 2eabc7f3-0d54-49a2-8156-950cdb83e97f | `` |  |  |

---

## 关联属性（共 10 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `applyPerson` | 需求人员id | `bd.staff.StaffNew` | `apply_person_id` |  →  |  |  | Service |  |
| 2 | `applyPurchaseDept` | 需求部门id | `bd.adminOrg.AdminOrgVO` | `apply_purchase_dept_id` |  →  |  |  | Service |  |
| 3 | `consigneePerson` | 收货人id | `bd.staff.StaffNew` | `consignee_person_id` |  →  |  |  | Service |  |
| 4 | `applyPurchaseOrg` | 需求组织id | `org.func.BaseOrg` | `apply_purchase_org_id` |  →  |  |  | Service |  |
| 5 | `material` | 物料id | `pc.product.Product` | `material_id` |  →  |  |  | Service |  |
| 6 | `policyId` | 匹配策略id | `mall.matchPolicy.MatchPolicy` | `policy_id` | matchPolicyDetail → policyId | 1..n | true | None |  |
| 7 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 8 | `enterpriseId` | enterpriseId | `cpu-privilege.enterprise.EnterprisePOJO` | `enterprise_id` |  →  |  |  | Service |  |
| 9 | `consigneeOrg` | 收货组织id | `org.func.BaseOrg` | `consignee_org_id` |  →  |  |  | Service |  |
| 10 | `matchPolicyProduct` | 清单匹配商品 | `mall.matchPolicy.MatchPolicyProduct` | `` | matchPolicyProduct → detailId | 0..n | true | None |  |

### Composition（子表）

- **policyId**: `matchPolicyDetail` → `mall.matchPolicy.MatchPolicy` | 1..n
- **matchPolicyProduct**: `matchPolicyProduct` → `mall.matchPolicy.MatchPolicyProduct` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `applyPerson` (需求人员id) | `bd.staff.StaffNew` | `apply_person_id` |
| `applyPurchaseDept` (需求部门id) | `bd.adminOrg.AdminOrgVO` | `apply_purchase_dept_id` |
| `consigneePerson` (收货人id) | `bd.staff.StaffNew` | `consignee_person_id` |
| `applyPurchaseOrg` (需求组织id) | `org.func.BaseOrg` | `apply_purchase_org_id` |
| `material` (物料id) | `pc.product.Product` | `material_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `enterpriseId` (enterpriseId) | `cpu-privilege.enterprise.EnterprisePOJO` | `enterprise_id` |
| `consigneeOrg` (收货组织id) | `org.func.BaseOrg` | `consignee_org_id` |
