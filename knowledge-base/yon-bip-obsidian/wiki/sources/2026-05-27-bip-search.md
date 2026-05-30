---
tags: [搜索, 查询, beforeSearch, YonQL, FilterViewModel, BIP]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-bip-search.md]
---

# 20个BIP搜索查询代码片段

> BIP 搜索查询的完整方案：FilterViewModel 操作、条件构建、参照过滤、YonQL 查询。

## 查询区操作

### FilterViewModel
- 获取：`viewModel.getCache('FilterViewModel')`
- 阻止自动查询：`filtervm.getParams().autoLoad = false`
- 阻止默认搜索：`viewModel.on('beforeSearch', () => false)`
- 重置后阻止查询：`filtervm.on("afterResetClick", () => false)`

### beforeSearch 动态条件
```javascript
args.params.condition.simpleVOs = [
    { field: 'xxx', op: 'eq', value1: 'value' }
];
```

### 条件操作符
- `eq` 等于、`in` 在范围内、`elt` 小于等于、`egt` 大于等于
- `like` 模糊匹配、`is_null` 为空、`is_not_null` 非空
- 支持 `logicOp: "or"` 构建 OR 条件组合

### 参照过滤
- 普通参照：`.setFilter(condition)`
- 树形参照：`.setTreeFilter(condition)`

## 后端查询

### YonQL
```javascript
ObjectStore.queryByYonQL('select ... from entity where ...');
```

### 安全查询
```javascript
ObjectStore.selectByMap(entity, condition);
```

<!-- confidence: EXTRACTED -->
