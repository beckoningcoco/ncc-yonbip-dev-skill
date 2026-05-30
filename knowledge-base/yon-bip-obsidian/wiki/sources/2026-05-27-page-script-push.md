---
tags: [转单, 下推, runCommandLine, 页面脚本, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-page-script-push.md]
---

# 旗舰版页面脚本转单功能

> 页面脚本中实现转单（下推）：先调用后端函数生成下游数据，再通过 cb.loader.runCommandLine 跳转到下游单据新建页面。

## 实现模式

```js
viewModel.get('button').on('click', function (data) {
  cb.rest.invokeFunction('...CreateExpense', { billIds: dataId }, function (err, res) {
    if (res.code == '200') {
      cb.loader.runCommandLine('bill', {
        billtype: 'voucher',
        billno: 'znbzbx_expensebill',
        domainKey: 'znbzbx',
        params: {
          mode: 'add',
          query: { serviceCode: '...', busiObj: '...', transtype: '...' },
          carryParams: { needCarryData: res.data },
          carryData: { needCarryData: res.data },
        },
      }, viewModel);
    }
  });
});
```

通过 `carryParams` / `carryData` 将上游数据传递到下游单据新建页面。

## 关键概念

- [[转单]]
- [[runCommandLine]]
- [[carryParams]]
- [[下推]]
