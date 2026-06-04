---
tags: ["BIP", "元数据", "数据字典", "ycSupplierManagement", "cpu-supplymgr.certification.CertificationApplyScore"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 认证打分 (`cpu-supplymgr.certification.CertificationApplyScore`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycSupplierManagement 模块实体元数据字典。
> 物理表：`cpu_certification_apply_score` | 所属应用：`ycSupplierManagement`
> 来源：元数据API `queryByUri` 返回的 `cpu-supplymgr.certification.CertificationApplyScore` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 认证打分 |
| 物理表 | `cpu_certification_apply_score` |
| 数据库 schema | `cpu-supplymgr` |
| 所属应用 | `ycSupplierManagement` |
| 业务对象ID | `580127b6-7838-408d-9495-0deae49d5ccd` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:35:28.0630` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-05-22 23:45:54:000
- **安装来源**: `/app/data_scripts/cpu-suppliermgr-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-suppliermgr/0010_iuap_common/DML/0270_iuap_metadata/202601151125_metadata_cpu-supplymgr-certification_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `fb045217-c93d-430b-89b0-5daf8d188ccd`

## 业务场景

- `imextmp`
- `userdefine`
- `msgtemplate`

## 术语标记

`BusinessData`, `data_auth`, `isMain`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 1 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 12 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `applyId` | 任务ID | `apply_id` | 91f13b22-60f1-48bd-ad2d-34ced143fa91 | `quote` |  | ✓ |
| 2 | `detailId` | 任务ID | `detail_id` | 0f42dcd8-ba48-400e-a1ee-f007358fff85 | `quote` |  | ✓ |
| 3 | `fileId` | 附件 | `file_id` | String | `text` |  | ✓ |
| 4 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 5 | `isBizLeaderForMe` | 打分人为我 | `is_biz_leader_for_me` | String | `text` |  | ✓ |
| 6 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 7 | `scoreIndicatorList` | 认证打分认证指标 | `` | 2c03a330-0068-4bfb-92a6-92ae6a1d5375 | `` |  |  |
| 8 | `scoreQualifyList` | 认证打分认证资质 | `` | 614583f8-1a5b-4957-add0-f92d3f4b0c54 | `` |  |  |
| 9 | `scoreStatus` | 评分状态 | `score_status` | String | `text` |  | ✓ |
| 10 | `scorer` | 评分人 | `scorer` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 11 | `userDefineCharacter` | 认证打分特征属性 | `user_define_character` | 9ec716d1-b218-4d11-b4e6-e65513780490 | `UserDefine` |  | ✓ |
| 12 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 7 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `applyId` | 任务ID | `cpu-supplymgr.certification.CertificationApply` | `apply_id` |  →  |  |  | None |  |
| 2 | `scorer` | 评分人 | `bd.staff.Staff` | `scorer` |  →  |  |  | Service |  |
| 3 | `userDefineCharacter` | 认证打分特征属性 | `cpu-supplymgr.certification.CertificationScoreDefineCharacter` | `user_define_character` |  →  |  |  | None |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 5 | `scoreQualifyList` | 认证打分认证资质 | `cpu-supplymgr.certification.CertificationApplyScoreQualify` | `` | scoreQualifyList → scoreId | 0..n | true | None |  |
| 6 | `detailId` | 任务ID | `cpu-supplymgr.certification.CertificationApplyDetail` | `detail_id` |  →  |  |  | None |  |
| 7 | `scoreIndicatorList` | 认证打分认证指标 | `cpu-supplymgr.certification.CertificationApplyScoreIndicator` | `` | scoreIndicatorList → scoreId | 0..n | true | None |  |

### Composition（子表）

- **scoreQualifyList**: `scoreQualifyList` → `cpu-supplymgr.certification.CertificationApplyScoreQualify` | 0..n
- **scoreIndicatorList**: `scoreIndicatorList` → `cpu-supplymgr.certification.CertificationApplyScoreIndicator` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `scorer` (评分人) | `bd.staff.Staff` | `scorer` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
