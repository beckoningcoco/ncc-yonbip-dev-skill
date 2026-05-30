# 后端脚本开发入门

> 来源：YonBIP 社区文档中心 - c2.yonyoucloud.com
> 抓取时间：2026-05-28
> 原始URL：https://c2.yonyoucloud.com/iuap-hc-client/ucf-wh/client/index.html#/detail/RMBD121

## 概述

本文讲解后端函数的基础内容：
1. 后端脚本与API脚本的能力及区别
2. 后端脚本如何改变上下文传参
3. 后端函数如何进行代码调试
4. 后端函数如何处理异常
5. 前端函数如何调用API脚本
6. 后端脚本如何配置规则链

---

## 后端脚本与API脚本区别

- **后端脚本**：用于规则链、调度任务
- **API脚本**：用于前端调用后端；发布为对外接口供三方系统调用

常见问题：前端脚本需要调用后端函数时选不到 → 因为创建成了后端脚本而非API脚本

---

## 后端脚本示例 (AbstractTrigger)

```js
let AbstractTrigger = require('AbstractTrigger');
class MyTrigger extends AbstractTrigger {
  execute(context, param) {
    var email = param.data[0].email;     // 从param中取规则链中传递的值
    param.data[0].set('new1', '22' + ""); // 回写修改值
    return {};
  }
}
exports({"entryPoint": MyTrigger});
```

---

## API脚本示例 (AbstractAPIHandler)

```js
let AbstractAPIHandler = require('AbstractAPIHandler');
class MyAPIHandler extends AbstractAPIHandler {
  execute(request) {
    // 直接根据传参格式从request中取值
    return {};
  }
}
exports({"entryPoint": MyAPIHandler});
```

---

## 后端函数代码调试

仅对商开环境开放（测试沙箱/开发沙箱租户）

步骤：
1. 页面上配置后端或API函数
2. 编辑器右上方点击"调试"
3. 复制调试脚本
4. 打开函数配置页面的运行时
5. Alt+Shift+D，粘贴信息保存
6. 执行后端函数，查看调试结果

---

## 后端函数相互调用

API脚本和后端脚本之间可以相互调用：
```js
let func1 = extrequire("函数路径地址");
let res = func1.execute(context, param);
```

---

## 后端函数异常处理

```js
try {
  // 业务逻辑
} catch (e) {
  // 异常处理
} finally {
  // 清理
}
```

---

## 前端函数调用API函数

```js
cb.rest.invokeFunction("AMPUB.backDefaultGroup.ceshi001", {"key": value},
  function(err, res) {
    alert(JSON.stringify(res));
  }
, viewModel, {"domainKey": "developplatform"})
```

**注意**：非ObjectStore操作的前端调后端，必须加 `{"domainKey": "developplatform"}` 参数，将流量转移到标准服务。

后端函数路径获取：添加前端调用后端(API函数)系统预制方法 → 右侧选择API函数点击即可生成路径

---

## 后端脚本添加到规则链

以保存方法添加后端函数为例：
1. 点击配置进入编辑页面
2. 选择规则链最后的规则 → 点击后面的按钮 → 添加新规则
3. 规则选择"执行函数" → 函数选择自己新建的后端函数
4. 拖动调整执行顺序 → 保存
