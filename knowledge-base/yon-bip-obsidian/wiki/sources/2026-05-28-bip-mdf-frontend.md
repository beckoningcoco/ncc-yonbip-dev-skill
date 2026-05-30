---
title: 前端开发（MDF）
date: 2026-05-28
source_url: https://c2.yonyoucloud.com/iuap-hc-client/ucf-wh/client/index.html#/detail/QDYMKF11
version: BIP5
tags: [MDF, 前端开发, 扩展脚本, ViewModel, cb.define, Resource Override, 断点调试]
images: 21
image_paths: []
---

# 前端开发（MDF）

> 通过脚手架前端工程编写扩展脚本，基于 ViewModel 事件和 API 实现业务功能的扩展。适用私有云/专属云/本地部署。

## 扩展脚本规范

### 命名规则

`{应用编码}_{billNo}_VM.Extend.js`，存放在 `src/business/{应用编码}/` 目录下。

示例：`cpurart_kkfnProductPurchaseRequisition_VM.Extend.js`

命名来源：应用编码（cSubId）+ 单据号 billNo（cBillNo）+ `_VM.Extend.js`。也可通过 meta 接口返回的 `extendFileName` 字段确认。

### 脚本结构

```javascript
cb.define(process.env.__DOMAINKEY__, [], function () {
  const MyExtend_VM = {
      doAction: function (name, viewModel) {
          if (this[name]) this[name](viewModel);
      },
      init: function (viewModel) {
          // 业务逻辑写在这里
      }
  }
  try {
      module.exports = MyExtend_VM;
  } catch (error) {}
  return MyExtend_VM;
});
```

- **`cb.define`**：加载依赖的公共扩展脚本
- **`doAction`**：框架加载扩展脚本的入口
- **`init`**：初始化扩展脚本，业务逻辑主入口

### 公共脚本

在 `business/common/common_VM.Extend.js` 中定义公共方法。通过 `cb.define` 第二个数组参数引入：
```javascript
cb.define(process.env.__DOMAINKEY__, ['common'], function (common) {
  // common.xxx() 调用公共方法
});
```

## Resource Override 调试

YDS 集成浏览器自带 Resource Override 插件，将线上压缩后的 `extend.min.js` 代理到本地源码，即可断点调试。YDS 已默认按 domainKey 配置代理规则，无需手动设置。

启动命令：`npm run debug`

> **重要**：`debugger` 和 `console.log` 在打包时会被自动去除，生产环境不生效！

## ViewModel 模态枚举

| mode | 描述 |
|------|------|
| `browse` | 预览态，不可编辑，仅查看 |
| `edit` | 编辑态，可编辑已有数据 |
| `add` | 新增态，新增数据 |

## 示例代码

### 新增时赋默认值并禁用
```javascript
viewModel.on('modeChange', (mode) => {
    if (mode.toLocaleLowerCase() == 'add') {
        viewModel.get('inputType').setValue('1');
        viewModel.get('inputType').setDisabled(true);
    }
});
```

### 字段值改变校验
```javascript
viewModel.get('purDate').on('afterValueChange', (data) => {
    let payDate = viewModel.get('payDate').getValue();
    if (data.value && payDate && new Date(data.value) > new Date(payDate)) {
        cb.utils.alert('采购日期不能晚于付款日期！', 'error');
        viewModel.get('purDate').setValue('');
    }
});
```

## cb.utils 常用工具

| 方法 | 说明 |
|------|------|
| `cb.utils.isArray` | 判断是否为数组 |
| `cb.utils.extend` | 拷贝对象/数组 |
| `cb.utils.getNewId` | 根据前缀返回新有序 id |
| `cb.utils.getCookie` | 获取 cookie 值 |
| `cb.utils.isEmpty` | 判空 |
| `cb.utils.alert` | 弹出提示信息 |

## 常见问题

| 问题 | 解决 |
|------|------|
| YDS 预览报 401 | `Ctrl+Shift+P` → `YDS: Import Workbench Domain Certificate to JVM` |
| debugger 不生效 | 打包时自动去除，仅本地 Resource Override 调试可用 |

## 相关页面

- [[专业开发]]
- [[页面脚本]]
- [[YDS工具]]
