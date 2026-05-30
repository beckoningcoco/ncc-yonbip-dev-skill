---
tags: [ObjectStore, YonQL, 实体操作, CRUD, 查询]
created: 2026-05-28
updated: 2026-05-28
sources: [2026-05-28-bip-entity-operations]
---

# 实体操作（ObjectStore + YonQL）

> YonBIP 社区文档中心 — 后端脚本中的实体CRUD和YonQL查询。

## 核心内容

### ObjectStore 方法速查

| 操作 | 方法 | 说明 |
|------|------|------|
| 新增 | `insert(URI, object, billnum)` | 单条新增 |
| 批量新增 | `insertBatch(URI, array, billnum)` | 批量新增 |
| 按ID更新 | `updateById(URI, object, billnum)` | 子表通过 `_status` 控制 |
| 批量更新 | `updateBatch(URI, array, billnum)` | 子表通过 `_status` 控制 |
| 条件更新 | `update(URI, toUpdate, wrapper, billnum)` | Wrapper.eq/ne/gt/lt/ge/le |
| 按ID删除 | `deleteById(URI, {id}, billnum)` | 逻辑删除，级联删子表 |
| 条件删除 | `deleteByMap(URI, {key: val}, billnum)` | 基于Map条件删除 |
| 批量删除 | `deleteBatch(URI, [{id}], billnum)` | 基于多ID删除 |
| 按ID查 | `selectById(URI, {id, compositions})` | 可指定返回子表 |
| 批量ID查 | `selectBatchIds(URI, {ids, compositions})` | 批量查询 |
| 条件查 | `selectByMap(URI, {key: val})` | Map条件查询 |
| YonQL查 | `queryByYonQL(sql, domainKey)` | 原厂表必填domainKey |

### Wrapper 条件操作符
`eq`(等于) `ne`(不等于) `gt`(大于) `lt`(小于) `ge`(大于等于) `le`(小于等于)

### 子表 _status 标记
- `"Insert"` — 新增子表行
- `"Update"` — 更新子表行
- `"Delete"` — 删除子表行

### YonQL 关键差异（vs MySQL）
- 主元数据不允许别名，子元数据必须有别名
- `like '山'` 自动转 `%山%`（不需要手动加%）
- `leftlike '河'` = MySQL `like '河%'`
- `rightlike '东'` = MySQL `like '%东'`
- 支持 `left join` / `inner join`，不支持 `right join`

### 重要限制
- 自建表和系统表不支持关联查询（domainKey不同，不在同一库）
- 跨领域原厂表不支持关联查询
- YonQL 只能查询原厂数据，不能增删改（用开放平台接口）

## 相关页面
- [[搜索查询]]
- [[API调用]]
