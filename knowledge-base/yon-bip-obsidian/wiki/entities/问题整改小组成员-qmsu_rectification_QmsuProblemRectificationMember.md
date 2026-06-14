---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "qmsu.rectification.QmsuProblemRectificationMember"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 问题整改小组成员 (`qmsu.rectification.QmsuProblemRectificationMember`)

> ycSaleCoor | 物理表：`qmsu_problem_rectification_member`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 问题整改小组成员 |
| 物理表 | `qmsu_problem_rectification_member` |
| domain/服务域 | `yonbip-cpu-synergy` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:32:11.3280` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（28个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `rectificationId` | 问题整改 | `rectification_id` | 90e038b6-07e0-40bd-bfb7-f0890939dc13 |
| 3 | `buyerTenant` | 采购商租户id | `buyer_tenant_id` | String |
| 4 | `ctId` | 自定义项特征组id | `ct_id` | 45212c16-93bf-489b-8eb0-3af36220ec32 |
| 5 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 6 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 7 | `tenant` | 租户ID | `tenant_id` | String |
| 8 | `createTime` | 创建时间 | `create_time` | DateTime |
| 9 | `createDate` | 创建日期 | `create_date` | Date |
| 10 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 11 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 12 | `creator` | 创建人名称 | `creator` | String |
| 13 | `modifier` | 修改人名称 | `modifier` | String |
| 14 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 15 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime |
| 17 | `representative` | 代表方 | `representative` | String |
| 18 | `participateProcess` | 参与环节 | `participate_process` | String |
| 19 | `name` | 姓名 | `name` | String |
| 20 | `isLeader` | 是否组长 | `isLeader` | Boolean |
| 21 | `contact` | 联系方式 | `contact` | String |
| 22 | `mail` | 邮箱 | `mail` | String |
| 23 | `duty` | 职责 | `duty` | String |
| 24 | `remark` | 备注 | `remark` | String |
| 25 | `synKey` | 同步标识 | `syn_key` | String |
| 26 | `own` | 录入方 | `own` | String |
| 27 | `qmsuProblemRectificationMemberAttrextItem` | 问题整改小组成员自由自定义项 | `` | 9d9e01b1-e397-4de7-a49b-871bea6714e1 |
| 28 | `qmsuProblemRectificationMemberUserdefItem` | 问题整改小组成员固定自定义项 | `` | ef9db522-e540-4619-bcdd-0f4ef4335bd6 |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ctId` | 自定义项特征组id | `qmsu.rectification.QmsuRectificationMemberCt` | None |  |
| 2 | `rectificationId` | 问题整改 | `qmsu.rectification.QmsuProblemRectification` | None | true |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `qmsuProblemRectificationMemberAttrextItem` | 问题整改小组成员自由自定义项 | `qmsu.rectification.QmsuProblemRectificationMemberAttrextItem` | None | true |
| 5 | `qmsuProblemRectificationMemberUserdefItem` | 问题整改小组成员固定自定义项 | `qmsu.rectification.QmsuProblemRectificationMemberUserdefItem` | None | true |
| 6 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 7 | `modifierId` | 修改人 | `base.user.User` | Service |  |
