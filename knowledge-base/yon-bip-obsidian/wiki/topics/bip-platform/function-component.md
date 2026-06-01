---
title: "YonScript 函数组件"
type: reference
source: "iuap-函数组件红皮书 (59页)"
tags: ["BIP", "旗舰版", "函数", "前端函数", "后端函数", "YonScript", "J2V8"]
created: 2026-06-01
---

# YonScript 函数组件

基于 J2V8（Google V8 Java 封装），提供四种预制扩展类型：API 扩展(`AbstractAPIHandler`) / 事件扩展 / 触发器扩展 / 工作流扩展。通过 SPI 注册自定义函数。

## 前端函数示例

```javascript
// beforeSearch 自动筛选
viewModel.on('beforeSearch',function(args){
    let res = cb.rest.invokeFunctionSync("后端函数id", {}, option);
    commonVOs.push({itemName:"zuzhi", value1: res.result.orgId});
});

// 跳转页面
cb.loader.runCommandLine('bill', {
    billtype: 'voucherList', billno: 'b584b8e2List',
    params: {perData:'测试父页面数据传递'}
}, viewModel);

// 刷新 / 返回 / 修改页面状态
viewModel.execute('refresh');
viewModel.communication({type:'return'});
viewModel.biz.do('edit', viewModel);

// 获取单据上下文
let {mode, billType, billNo, billData} = viewModel.getParams();
```

## 后端函数（API Handler）

```javascript
let AbstractAPIHandler = require('AbstractAPIHandler');
class MyAPIHandler extends AbstractAPIHandler {
    execute(request){
        var r = request.r;
        return {apidata: 3*r};
    }
}
exports({"entryPoint": MyAPIHandler});
```

前端调用：`cb.rest.invokeFunction("GT44321AT46.backDefaultGroup.apitest0914", {r:2}, callback)`

## SPI 自定义函数

实现 `YonScriptNativeFunction` 接口，通过 `ServiceLoader` 自动注册到 V8 运行时。

## 缓存

本地缓存 + inotify 同步策略，脚本变更实时同步。
