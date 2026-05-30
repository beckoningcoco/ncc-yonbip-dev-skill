---
tags: [页面跳转, 单据跳转, 报表跳转, window.open, runCommandLine, openService]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-bill-report-jump.md]
---

# 单据、报表跳转

> 实现单据与报表之间的跳转，包括自建/原厂单据的 PC 和 Mobile 跳转，三种主要方式。

## 三种跳转方式

### 1. window.open（最通用）
```
https://{域名}/mdf-node/meta/{Voucher/VoucherList}/{单据编码}[/add|/{id}]
?domainKey={服务域}&serviceCode={服务编码}
```
- 自建单据 domainKey=developplatform
- Mobile 加 `&isMobile=true`，路径中单词首字母小写

### 2. cb.loader.runCommandLine
```js
cb.loader.runCommandLine('bill', {
  billtype: 'voucherlist',
  billno: 'pageRouteList',
  params: { mode: 'add', domainKey: 'developplatform', ... }
}, viewModel);
```

### 3. window.jDiwork.openService
```js
window.jDiwork.openService('serviceCode', { billtype: 'voucher', billno: '...', mode: 'add' });
```

## 报表跳转
```
https://{域名}/iuap-data-analytic/ucf-wh/analysis.html#/report/{serviceCode}
```

## 关键概念

- [[页面跳转]]
- [[window.open]]
- [[runCommandLine]]
- [[jDiwork]]
