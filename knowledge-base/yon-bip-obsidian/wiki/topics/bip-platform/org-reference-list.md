---
title: "组织参照完整列表"
type: reference
source: "iuap-组织管理红皮书 (90页)"
tags: ["BIP", "旗舰版", "组织", "参照", "业务单元", "部门"]
created: 2026-06-01
---

# 组织参照完整列表

## 核心参照

| code | 说明 | 包含组织 | 包含部门 | 支持全局 | 权限控制 |
|------|------|----------|----------|----------|----------|
| `org_pure_tree_ref` | 业务单元（纯组织） | Y | N | Y | Y |
| `org_unit_tree_ref` | 组织部门树（业务树） | Y | Y(业务部门) | Y | Y |
| `bd_adminorgsharetreeref` | 业务部门树（含职能共享） | N | Y(业务部门) | N | N |
| `org_unit_manager_auth_ref` | 业务单元（权限节点专用） | Y(懒加载) | N | Y | N |

## 人力组织

| code | 说明 | 包含组织 | 包含部门 |
|------|------|----------|----------|
| `admin_dept_tree_ref` | 人力部门树 | N | Y(人力部门) |
| `bd_dept_list_ref` | 人力部门列表 | N | Y(人力部门) |
| `orgcenter_admin_tree_ref` | 人力资源组织 | Y(人力组织) | N |
| `org_admin_dept_tree_ref` | 人力资源组织部门树(懒加载) | Y | Y(人力部门) |

## 业务职能组织

| code | 职能 |
|------|------|
| `bd_purchaseorg` | 采购组织 |
| `bd_salesorg` | 销售组织 |
| `bd_inventoryorg` | 库存组织 |
| `bd_factoryorg` | 工厂组织 |
| `bd_financeorgtreeref` | 会计主体 |
| `bd_planorg` | 计划中心 |
| `bd_qualityorg` | 质检中心 |
| `bd_logisticsorg` | 物流组织 |
| `bd_maintainorg` | 维修组织 |
| `bd_energyorg` | 能源组织 |
| `bd_rdorg` | 研发中心 |
| `bd_safetyorg` | 安环组织 |
| `org_assets_tree_ref` | 资产组织 |
| `org_taxpayer_tree_ref` | 纳税主体 |

## 使用方式

```javascript
// 参照过滤参数
referModel.setState('ref_parentorgid', '上级组织ID');    // 部门过滤
referModel.setState('noPermissionRequired', true);        // 跳过权限
referModel.setState('funcCodes', ['finance', 'purchase']); // 职能过滤
```
