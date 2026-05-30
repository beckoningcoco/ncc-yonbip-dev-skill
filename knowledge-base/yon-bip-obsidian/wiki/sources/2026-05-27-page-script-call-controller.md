---
tags: [页面脚本, Controller调用, DynamicProxy, local数据源, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-page-script-call-controller.md]
---

# 旗舰版页面脚本调用Controller

> 页面脚本通过 DynamicProxy 调用后端 Controller 获取数据，使用 local 数据源模式。

## 代码模式

```js
gridModel.setState('dataSourceMode', 'local');
gridModel.on('afterSetDataSource', (args) => {
  let mtremark = viewModel.getCache('mtremark');
  if (!mtremark) {
    viewModel.setCache('mtremark', 1);
    const baseurl = cb.env.getMainOriginUrl();
    const url = baseurl + '/c-kk-lzlj-cwgx/.../queryLinkBtnData';
    var proxy = cb.rest.DynamicProxy.create({
      ensure: { url: url, method: 'POST', options: { domainKey: 'c-kk-lzlj-cwgx' } },
    });
    proxy.ensure(param, function (err, result) {
      gridModel.setDataSource(result);
    });
  } else {
    viewModel.clearCache('mtremark');
  }
});
```

## 关键概念

- [[DynamicProxy]]
- [[页面脚本调用Controller]]
- [[local 数据源]]
