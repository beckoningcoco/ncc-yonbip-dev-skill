---
tags: ["BIP", "元数据", "数据字典", "ycBase", "announcement.announcement.CorporateAnnouncement"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 企业公告发布 (`announcement.announcement.CorporateAnnouncement`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_system_notice` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `announcement.announcement.CorporateAnnouncement` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 企业公告发布 |
| 物理表 | `cpu_system_notice` |
| domain/服务域 | `yonbip-cpu-bctask` |
| schema | `cpu_base_doc` |
| 所属应用 | `ycBase` |
| 业务对象ID | `6b8f7f15-f551-4ea9-bda2-af8ca4dc56b7` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:25:49.0440` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 主键 |
| 编码 | `code` | `code` | String | 编码（必填，isCode）|

## 部署信息

- **部署时间**: 2025-10-25 00:18:13:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bctask/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bctask/0010_iuap_common/DML/0270_iuap_metadata/202508270940_metadata_announcement-announcement.zip`
- **安装人**: mongoTools
- **安装排名**: `ed803252-1091-4f6c-92cf-31f61a0509ab`

## 业务场景

- `dataMultilanguage`
- `workflow`
- `UITemplate`
- `report`
- `billcode`
- `userdefine`
- `msgtemplate`
- `api`
- `bpm`

## 术语标记

`BusinessData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 7 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 审批流信息 (`IApprovalFlow`) | `base.itf.IApprovalFlow` | 134 | 3 |
| 2 | 审批信息 (`IApprovalInfo`) | `base.itf.IApprovalInfo` | 172 | 4 |
| 3 | 自动编号 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| 4 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 5 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 6 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| 7 | 审批提交信息 (`ISubmitInfo`) | `ucfbase.ucfbaseItf.ISubmitInfo` | 85 | 4 |

---

## 直接属性（共 54 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `title` | 标题 | `title` | String | `text` |  | ✓ |
| 2 | `code` | 编码 | `code` | String | `text` |  | ✓ |
| 3 | `noticeType` | 公告类型 | `notice_type_id` | 731a12c9-ac41-4db4-9a98-2fcda823fbd1 | `quote` |  | ✓ |
| 4 | `noticeTypeName` | 公告类型名称 | `notice_type_name` | String | `text` |  | ✓ |
| 5 | `noticeTypeCode` | 公告类型编码 | `notice_type_code` | String | `text` |  | ✓ |
| 6 | `publishOrg` | 发布组织 | `publish_org` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |  | ✓ |
| 7 | `publishName` | 发布者 | `publish_name` | String | `text` |  | ✓ |
| 8 | `publishTime` | 发布时间 | `publish_time` | DateTime | `timestamp` |  | ✓ |
| 9 | `enterNoticeType` | 公告分类 | `enter_notice_type_id` | 92b613a5-0e7c-4f87-8a9b-7fccc9ba556a | `quote` |  | ✓ |
| 10 | `announcementObject` | 公告对象 | `announcement_object` | Short | `short` |  | ✓ |
| 11 | `content` | 内容 | `content` | String | `text` |  | ✓ |
| 12 | `appendix` | 附件 | `appendix` | String | `text` |  | ✓ |
| 13 | `autoRevoke` | 是否自动撤销0否,1是 | `auto_revoke` | Short | `short` |  | ✓ |
| 14 | `isTop` | 是否置顶0否,1是 | `is_top` | Short | `short` |  | ✓ |
| 15 | `revocationTime` | 撤销日期 | `revocation_time` | Date | `date` |  | ✓ |
| 16 | `loginEnabled` | 允许未登录查看公告 | `login_enabled` | Short | `short` |  | ✓ |
| 17 | `isSystemNotice` | 是否系统公告 | `is_system_notice` | Short | `short` |  | ✓ |
| 18 | `unstickTime` | 取消置顶时间 | `unstick_time` | DateTime | `timestamp` |  | ✓ |
| 19 | `priority` | 优先级 | `priority` | Integer | `int` |  | ✓ |
| 20 | `stickType` | 置顶类型 | `stick_type` | Short | `short` |  | ✓ |
| 21 | `status` | 状态 | `status` | String | `text` |  | ✓ |
| 22 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |  | ✓ |
| 23 | `viewCount` | 阅读数量 | `view_count` | Integer | `int` |  | ✓ |
| 24 | `publishCode` | 发布人编码 | `publish_code` | String | `text` |  | ✓ |
| 25 | `orgs` | 采购组织 | `orgs` | String | `text` |  | ✓ |
| 26 | `tenant` | 发布的租户 | `tenant_id` | String | `text` |  | ✓ |
| 27 | `announcementDefineCharacter` | 企业公告自定义项 | `define_character_id` | 9432f5df-f58e-458c-8696-89b3f2a52c6a | `UserDefine` |  | ✓ |
| 28 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean | `switch` |  | ✓ |
| 29 | `verifystate` | 审批状态 | `verifystate` | Short | `short` |  | ✓ |
| 30 | `returncount` | 退回次数 | `returncount` | Short | `short` |  | ✓ |
| 31 | `auditor` | 审批人名称 | `auditor` | String | `text` |  | ✓ |
| 32 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 33 | `auditTime` | 审批时间 | `audit_time` | DateTime | `timestamp` |  | ✓ |
| 34 | `auditDate` | 审批日期 | `audit_date` | Date | `date` |  | ✓ |
| 35 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 36 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 37 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 38 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 39 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 40 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 41 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 42 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 43 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 44 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 45 | `submitTime` | 提交时间 | `submit_time` | DateTime | `dateTime` |  | ✓ |
| 46 | `submitter` | 提交人 | `submitter` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 47 | `withdrawTime` | 撤回提交时间 | `withdraw_time` | DateTime | `dateTime` |  | ✓ |
| 48 | `withdrawpp` | 撤回提交的人 | `withdrawpp` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 49 | `id` | 主键 | `id` | Long | `long` |  | ✓ |
| 50 | `announcementLabel` | 标签 | `tag` | String | `text` |  | ✓ |
| 51 | `disPlayLocationList` | 公告展示位置实例 | `` | 82a7844a-9ec6-4e8f-8139-812228e3134d | `` |  |  |
| 52 | `enterNoticeTypeCode` | 公告分类编码 | `enter_notice_type_code` | String | `text` |  | ✓ |
| 53 | `recordList` | 公告阅读记录 | `` | c2b591ca-6003-4b5e-bfd7-4ce2cc2a6c9d | `` |  |  |
| 54 | `visibilityScopeList` | 公告可见范围 | `` | f55551b9-d7a7-44b8-a0ae-cb2c92fabe06 | `` |  |  |

---

## 关联属性（共 13 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `submitter` | 提交人 | `base.user.BipUser` | `submitter` |  →  |  |  | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 3 | `recordList` | 公告阅读记录 | `announcement.announcement.AnnouncementRecord` | `` | recordList → announcement | 0..n | true | None |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | `creatorId` |  →  |  |  | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | `modifierId` |  →  |  |  | Service |  |
| 6 | `noticeType` | 公告类型 | `announcement.announcement.AnnouncementType` | `notice_type_id` |  →  |  |  | None |  |
| 7 | `disPlayLocationList` | 公告展示位置实例 | `announcement.announcement.AnnouncementDisPlayLocationInst` | `` | disPlayLocationList → announcement | 1..n | true | None |  |
| 8 | `auditorId` | 审批人 | `base.user.User` | `auditorId` |  →  |  |  | Service |  |
| 9 | `withdrawpp` | 撤回提交的人 | `base.user.BipUser` | `withdrawpp` |  →  |  |  | Service |  |
| 10 | `announcementDefineCharacter` | 企业公告自定义项 | `announcement.announcement.AnnouncementDefineCharacter` | `define_character_id` |  →  |  |  | None |  |
| 11 | `publishOrg` | 发布组织 | `aa.baseorg.OrgMV` | `publish_org` |  →  |  |  | Service |  |
| 12 | `visibilityScopeList` | 公告可见范围 | `announcement.announcement.AnnouncementVisibilityScope` | `` | visibilityScopeList → announcement | 0..n | true | None |  |
| 13 | `enterNoticeType` | 公告分类 | `bctask.basedoc.CustomerDocVO` | `enter_notice_type_id` |  →  |  |  | Service |  |

### Composition（子表）

- **recordList**: `recordList` → `announcement.announcement.AnnouncementRecord` | 0..n
- **disPlayLocationList**: `disPlayLocationList` → `announcement.announcement.AnnouncementDisPlayLocationInst` | 1..n
- **visibilityScopeList**: `visibilityScopeList` → `announcement.announcement.AnnouncementVisibilityScope` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `submitter` (提交人) | `base.user.BipUser` | `submitter` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `creatorId` (创建人) | `base.user.User` | `creatorId` |
| `modifierId` (修改人) | `base.user.User` | `modifierId` |
| `auditorId` (审批人) | `base.user.User` | `auditorId` |
| `withdrawpp` (撤回提交的人) | `base.user.BipUser` | `withdrawpp` |
| `publishOrg` (发布组织) | `aa.baseorg.OrgMV` | `publish_org` |
| `enterNoticeType` (公告分类) | `bctask.basedoc.CustomerDocVO` | `enter_notice_type_id` |
