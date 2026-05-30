---
tags: [列表页面, local数据源, setDataSource, customInit, 页面脚本, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-list-page-local-datasource.md]
---

# 旗舰版跳转列表页面不调用默认查询

> 跳转列表页面时使用 local 数据源模式，不调用默认 list 接口，改为自定义接口获取数据。

## 实现方式

```js
gridModel.setState('dataSourceMode', 'local');  // 切换为 local 模式

gridModel.on('afterSetDataSource', (args) => {
  let mtremark = viewModel.getCache('mtremark');
  if (!mtremark) {
    viewModel.setCache('mtremark', 1);
    // 调用自定义接口获取数据
    let proxy = cb.rest.DynamicProxy.create({
      ensure: { url: '/c-kk-lzlj-cwgx/.../queryLinkBtnData', method: 'POST' }
    });
    proxy.ensure(param, function (err, result) {
      gridModel.setDataSource(result);  // 设置自定义数据
    });
  } else {
    viewModel.clearCache('mtremark');
  }
});
```

关键：`dataSourceMode: 'local'` 阻止默认 list 接口调用，使用缓存标志防止 `setDataSource` 死循环。

## 关键概念

- [[dataSourceMode]]
- [[local 数据源]]
- [[setDataSource]]
- [[customInit]]
