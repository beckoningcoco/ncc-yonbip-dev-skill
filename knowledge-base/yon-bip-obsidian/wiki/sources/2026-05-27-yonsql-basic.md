---
tags: [YonQL, ObjectStore, 后端函数, CRUD, 主子表, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-yonsql-basic.md]
---

# YonSQL基本操作

> 后端函数中 YonQL / ObjectStore API 的增删改查完整示例，涵盖单表查询、主子表组合查询、关联查询、子查询、新增、更新、删除等。

## 核心操作

| 操作 | API | 说明 |
|------|-----|------|
| 批量查询 | `ObjectStore.selectBatchIds(uri, {ids})` | 按 ID 批量查 |
| 组合查询（主子表） | `ObjectStore.queryByYonQL("select ... (select ... from child) from parent")` | YonQL 嵌套子查询 |
| 关联查询 | `ObjectStore.queryByYonQL("select ... from A left join B on ...")` | left join 关联 |
| 新增 | `ObjectStore.insert(uri, object, moduleId)` | 支持主子表一次性插入 |
| 批量新增 | `ObjectStore.insertBatch(uri, objects, moduleId)` | 数组批量插 |
| 更新 | `ObjectStore.updateById(uri, object, moduleId)` | 主子表通过 `_status` 控制 Update/Insert/Delete |
| 批量更新 | `ObjectStore.updateBatch(uri, objects, moduleId)` | 批量更新 |
| 条件更新 | `ObjectStore.update(uri, toUpdate, wrapper, moduleId)` | Wrapper 条件更新 |
| 删除 | `ObjectStore.deleteById(uri, {id})` | 按 ID 删除 |

## 关键概念

- [[YonQL]]
- [[ObjectStore]]
- [[后端函数]]
