---
title: "MDF 前端编程模型 — 核心 API 参考"
type: reference
source: "iuap-MDF前端编程模型红皮书 (V6.0, 1846页) — 第3.5章 通用JS API(p253-278)"
tags: ["BIP", "旗舰版", "MDF", "前端", "API", "ViewModel", "cb.rest", "cb.loader"]
created: 2026-06-01
updated: 2026-06-01
---

# MDF 前端核心 API 参考

> 基于 iuap-MDF 前端编程模型红皮书 V6.0，第 3.5 章通用 JS API（p253-278）逐行提取。

## 1. 页面管理 Page

### 通过 URL 打开单据

```
// 列表页
https://<业务中台>/mdf-node/meta/voucherlist/{billno}?domainKey=xxx

// 卡片新增态
https://<业务中台>/mdf-node/meta/voucher/{billno}/add?domainKey=xxx

// 卡片浏览态
https://<业务中台>/mdf-node/meta/voucher/{billno}/{id}?domainKey=xxx

// 编辑态：不支持URL直达，替代方案：
// 1. 用下面API打开edit模式 2. 浏览态后执行 viewmodel.biz.do('edit', viewmodel)
```

- `voucherlist`=列表, `voucher`=卡片
- `serviceCode` 和 `domainKey` 必传

### 通过 API 打开单据

```javascript
cb.loader.runCommandLine('bill', {
  billtype: 'voucher',         // 是: ''；voucherlist列表/voucher卡片
  billno: 'bankdot',           // 是: ''；单据编码
  newOpenTabs: false,          // 否: boolean；需在工作台企业风格中设置
  params: {
    id: '2214931147379968',    // browse/edit时需要
    mode: 'edit',              // edit/add/browse
    action: 'add',             // 否: add/copy/push
    readOnly: false,           // 否
    domainKey: '',             // 是: 使用统一Node时必输
    // mode=browse → 废弃enter接口
    // mode=edit + readOnly=false → 调用detail接口
    // mode=edit + readOnly=true → 调用detail接口(浏览态)
    query: {
      busiObj: 'xxx',          // 否: 业务对象编码
      serviceCode: '',         // 否: 服务编码
      transtype: '',           // 否: 传了交易类型字段不可编辑
      isNoQuery: false,        // 否: true=不传URL参数到下游
    },
    carryData: {},             // 否: 覆盖业务add数据
    ignoreViewModelQuery: false // 否: true=不传上游query参数
  }
}, viewModel);
```

### 打开侧滑抽屉

```javascript
cb.loader.runCommandLine('bill', {
  billtype: 'voucher',
  billno: 'bankdot',
  params: { id: '...', mode: 'edit', domainKey: '' },
  templateType: 'modal',                  // ← 关键
  extraConfig: { _innerType: 'fadeRightToLeft' }
}, viewModel);

// 列表双击进入详情需要配置
viewModel.getGridModel().on('beforeDblClick', function(args){
  args.templateType = 'modal';
  if (!args.extraConfig) args.extraConfig = {};
  args.extraConfig._innerType = 'fadeRightToLeft';
});
```

### 返回 / 刷新

```javascript
viewmodel.communication({ type: 'return' });
viewModel.execute('back');
viewModel.execute('refresh');
```

### 打开自定义页面

```javascript
// 公共路由（无需注册，路径加/platform）
// https://<业务中台>/mdf-node/platform/definepage?domainKey=xxx

// 自定义路由（需在route.jsx注册或统一Node配置）
// https://<业务中台>/mdf-node/definepage?domainKey=xxx

// API打开
viewmodel.communication({
  payload: { type: 'platform', url: 'user/login', data: {...} }
});
```

### 页面 URL 参数

| 参数 | 类型 | 说明 |
|------|------|------|
| domainKey | string | 前端服务编码 |
| serviceCode | string | 原子服务编码 |
| busiObj | string | 业务对象编码 |
| yht_access_token | string | 登录Token |
| isMobile | boolean | 移动端 |
| zoomStyle | number | 放大倍数（2=2倍） |
| skipUserAgent | boolean | 跳过Cookie种token |
| debugNode | boolean | 调试Node服务 |
| debugLogs | boolean | 调试日志 |
| noCache | boolean | 无缓存访问 |
| debug | boolean | 高质量sourcemap |
| noFlowCom / noFileServiceCom | boolean | 禁用审批/文件服务组件 |
| noShowLeft | boolean | 隐藏导航返回按钮(仅移动端) |

## 2. 网络请求 Proxy

### viewmodel.setProxy（推荐）

框架自动处理 `domainKey` 参数：

```javascript
const proxy = viewmodel.setProxy({
  saveByToken: {
    url: '/xxx/xxx/saveByToken',
    method: 'POST',
    options: { mask: false }
  }
});

// 异步调用
proxy.saveByToken(params, function (data) { console.log('success', data) });

// 同步调用（options.async=false）
const data = proxy.saveByToken(params);
```

**options 参数：**

| 参数 | 类型 | 默认 | 说明 |
|------|------|------|------|
| mask | boolean | true | Loading遮罩 |
| uniform | boolean | true | 走uniform路由转发 |
| async | boolean | true | 异步/同步 |
| deflate | boolean | false | 压缩传输 |
| timeout | number | - | 超时毫秒 |
| contentType | '' | application/json | Content-Type |
| domainKey | '' | 取viewmodel | 目标服务domainKey |
| dateType | '' | json/file | - |
| withCredentials | boolean | false | 跨域携带cookie |
| jsonp | boolean | false | JSONP请求 |
| serviceCode | '' | - | 指定serviceCode |
| query | {} | - | 添加query参数 |

### cb.rest.DynamicProxy（不推荐，需自行传 domainKey）

```javascript
var proxy = cb.rest.DynamicProxy.create({
  autoPick: { url: '/xxx/xxx/autoPick', method: 'POST' }
});
proxy.autoPick(params, function (err, result) { ... });
```

> ⚠️ 新版规范禁用 `cb.rest.DynamicProxy.create`，应使用 `viewmodel.setProxy`。

## 3. 公共转发规则

| 前缀 | 说明 |
|------|------|
| `/uniform` | JSON透传到Java服务 |
| `/formdata` | FormData透传 |
| `/uniformdata` | 原始透传（大数据慎用） |

Node 对过境请求流量限制最大 **50M**。

## 4. 跨域转发 Transfer

解决跨服务调用越权问题：

```javascript
cb.rest.transferCommonRest(viewmodel, {
  params: {
    url: '/log-pub/rest/operation/save',
    targetServiceKey: 'iuap-apcom-auditlog',  // 必输：微服务编码
    method: 'POST',
    parameter: { aaa: true }
  },
  domainKey: 'xx',       // 原请求方domainKey
  query: {xx: xx},       // URL携带参数
  mask: true              // 遮罩层
}, callback);

// 或同步
const result = cb.rest.transferCommonRest(viewmodel, {...});
```

参数：`viewmodel`(是), `targetServiceKey`(是), `method`(是), `parameter`(是), `url`(是), `query`(否), `domainKey`(否), `proxyKey`(否,同参数复用性能优化), `callback`(否)。

## 5. 上下文 Context

```javascript
// 获取领域自定义上下文（需开特性开关 queryLoginUser）
cb.context.getExtra(viewmodel, property);
```

## 6. cb.utils.alert

```javascript
cb.utils.alert({
  type: 'error',         // error/warning/success/info
  content: '消息内容',
  size: 'lg',            // sm/md/lg
  complexType: true,     // 复杂内容
  containerObj: {},
  viewmodel
});
```

## 7. 数据模型速查

| 模型 | 说明 |
|------|------|
| `viewModel.get('字段编码')` | 获取字段模型 |
| `viewModel.getGridModel()` | 获取表格模型 |
| `viewModel.getGridModel().getEditRowModel()` | 获取编辑行模型 |
| `viewModel.getCache('FilterViewModel')` | 获取查询区模型 |
| `gridModel.setColumnState(col, 'bJointQuery', true)` | 设置列属性 |
| `gridModel.on('beforeCellJointQuery', cb)` | 联查点击事件 |
| `gridModel.setState('dataSourceMode', 'local')` | 切换本地数据源 |

---

> **深读进度**: 第3.5章(p253-278)已读，覆盖 Page/Proxy/Transfer/Context/Alert。
> **待补全**: 3.2数据模型(p148) / 3.3业务模型(p216) / 3.4表单模型(p235) / 后续章节API。

## 相关文档

- [[ui-template]] — UI模板是MDF的运行时配置
- [[function-component]] — 前端函数在MDF运行时内执行
- [[yonbuilder-app]] — YonBuilder产出MDF协议
- [[mdd-backend]] — 前后端共享元数据协议
- [[factory-ext]] — 前端扩展机制详解
