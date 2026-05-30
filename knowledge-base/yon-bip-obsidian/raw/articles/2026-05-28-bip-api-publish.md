# API 发布

> 来源：YonBIP 社区文档中心 - c2.yonyoucloud.com
> 抓取时间：2026-05-28
> 原始URL：https://c2.yonyoucloud.com/iuap-hc-client/ucf-wh/client/index.html#/detail/APIFB12

## 概述

业务场景：
- 原厂单据调用自建单据进行新增、修改、删除操作（跨领域，必须发布为接口）
- 三方系统调用自建单据进行CRUD操作

关键词：YonBuilder、API发布、API分组、限流控制、IP访问控制

---

## 操作步骤

### 1. 创建API分组
API发布节点 → 左侧树 + 号图标创建分组（一级目录）→ 可继续创建二、三级目录

### 2. 创建API脚本
```js
let AbstractAPIHandler = require('AbstractAPIHandler');
class MyAPIHandler extends AbstractAPIHandler {
  execute(request) {
    var sql = `select new1, new2 from AT20669A0A1CA00005.AT20669A0A1CA00005.k70734_card_demo
               where id=${request.id}`;
    var res = ObjectStore.queryByYonQL(sql);
    return { res };
  }
}
exports({ entryPoint: MyAPIHandler });
```

### 3. 发布API
左侧选中API分组 → 点击"新增" → 录入基本信息 → 输入请求路径 → 添加请求参数 → 生成请求示例 → 选择函数 → 勾选返回结果透传 → 保存 → 点击"发布"

### 4. 调试API
点击"调试"按钮 → 输入参数 → 发起调试 → 查看响应结果

---

## 常见问题

- **取消发布**：点击"取消发布"按钮
- **重新发布**：点击"重新发布"按钮
- **查看发布历史**：点击"发布历史"按钮
- **body参数根类型**：可选对象类型和数组类型
- **接口超时时间**：1~30秒之间，默认5秒，在"后端配置"页签设置
