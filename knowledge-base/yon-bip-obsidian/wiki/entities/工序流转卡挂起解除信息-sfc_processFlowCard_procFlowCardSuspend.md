---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.processFlowCard.procFlowCardSuspend"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工序流转卡挂起解除信息 (`sfc.processFlowCard.procFlowCardSuspend`)

> IMPSFC | 物理表：`imp_sfc_procflowcard_suspend`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工序流转卡挂起解除信息 |
| 物理表 | `imp_sfc_procflowcard_suspend` |
| 数据库 schema | `IMP-SFC` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:21:08.4260` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 启用 |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（18个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `selfDefineCharacterSuspend` | 工序流转卡挂起解除信息自定义项 | `self_define_character` | c7f4704a-52b3-41b8-8c49-436649bb98ee |
| 2 | `rowno` | 序号 | `rowno` | Integer |
| 3 | `holdReasonId` | 挂起原因ID | `hold_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 4 | `holdUserId` | 挂起人ID | `hold_person_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 5 | `id` | 启用 | `id` | Long |
| 6 | `pubts` | 时间戳 | `pubts` | DateTime |
| 7 | `holdTime` | 挂起时间 | `hold_time` | DateTime |
| 8 | `releaseReasonId` | 解挂原因D | `release_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 9 | `holdDate` | 挂起日期 | `hold_date` | Date |
| 10 | `processFlowCardId` | 工序流转卡ID | `process_flow_card_id` | a1d46721-c171-401e-9f07-ef70a36e2abf |
| 11 | `dr` | 逻辑删除标记 | `dr` | Short |
| 12 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 13 | `releaseUserId` | 解除人ID | `release_user_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 14 | `releaseTime` | 解除时间 | `release_time` | DateTime |
| 15 | `releaseDate` | 解挂日期 | `release_date` | Date |
| 16 | `holdDesc` | 挂起说明 | `hold_desc` | String |
| 17 | `procFlowCardSuspendDefine` | 工序流转卡挂起解除信息自定义项 | `` | 4bca3b99-a804-4ab2-9832-4b2552f59d01 |
| 18 | `releaseDesc` | 解除说明 | `release_desc` | String |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `releaseUserId` | 解除人ID | `base.user.User` | Service |  |
| 2 | `holdUserId` | 挂起人ID | `base.user.User` | Service |  |
| 3 | `selfDefineCharacterSuspend` | 工序流转卡挂起解除信息自定义项 | `sfc.processFlowCard.ProcFlowCardSuspendSelfDefineCharacter` | None |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `procFlowCardSuspendDefine` | 工序流转卡挂起解除信息自定义项 | `sfc.processFlowCard.procFlowCardSuspendDefine` | None | true |
| 6 | `releaseReasonId` | 解挂原因D | `aa.reason.Reason` | Service |  |
| 7 | `processFlowCardId` | 工序流转卡ID | `sfc.processFlowCard.processFlowCard` | None | true |
| 8 | `holdReasonId` | 挂起原因ID | `aa.reason.Reason` | Service |  |
