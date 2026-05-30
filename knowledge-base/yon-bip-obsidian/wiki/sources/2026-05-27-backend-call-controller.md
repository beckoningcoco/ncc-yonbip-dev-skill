---
tags: [后端函数, Controller, postman, 调试, 页面脚本, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-backend-call-controller.md]
---

# 后端函数调用后端Controller

> 在后端函数（JavaScript）中通过 postman 调用后端 Java Controller，包括传参、Cookie 设置、调试方法。

## 后端函数调用写法

```js
let token = ObjectStore.env().token;
let header = {
  'Content-Type': 'application/json;charset=UTF-8',
  Cookie: 'yht_access_token=' + token,
};
let url = ObjectStore.env().url + '/c-fi-sasac-cnmc/szcontract/effect';
let strInfo = postman('post', url, JSON.stringify(header), JSON.stringify(body));
let info = JSON.parse(strInfo);
```

关键点：Cookie 中传 `yht_access_token`，Controller 返回值用 `Map<String,Object>`。

## 后端函数调试方法

1. 后端函数点调试 → 复制调试码
2. 进入单据页面，`Shift+Alt+D` 输入调试码
3. 执行操作进入调试

## 验证调用（阿尔萨斯）

在微服务管理控制台执行：
```
watch com.xxx.controller.XxxController handle '{params,returnObj,throwExp}' -n 500 -x 3
```

## 关键概念

- [[后端函数]]
- [[Controller 调用]]
- [[postman 函数]]
- [[阿尔萨斯调试]]
