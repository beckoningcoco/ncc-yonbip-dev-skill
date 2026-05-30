---
tags: [后端脚本, 远程调用, 消息触达, 调度任务, 事件订阅, openLinker, postman, sendMessage]
created: 2026-05-28
updated: 2026-05-28
sources: [2026-05-28-bip-backend-script-advanced]
---

# 后端脚本进阶开发

> YonBIP 社区文档中心 — 远程调用、消息触达、调度任务、事件订阅。

## 核心内容

### 远程调用方法对比

| 方法 | 适用场景 | Token管理 |
|------|----------|-----------|
| `openLinker(method, url, appCode, body)` | 调BIP内部开放平台接口 | 自动获取token |
| `openLinkerPure(method, url, appCode, body)` | 跨租户调BIP接口 | 需手动header加appKey/appSecret |
| `postman(method, url, header, body)` | 调本系统REST接口 | 携带当前上下文token |
| `postmanPure(method, url, header, body)` | 调外部/三方系统 | 不携带上下文，需手动管理token |

数据量限制：领域服务最多500条，标准服务最多2000条

### 后端函数互调
`extrequire("函数路径").execute(context, param)`

### 消息触达（sendMessage）
```js
var result = sendMessage({
  sysId: 'diwork',
  tenantId: ObjectStore.env().tenantId,
  channels: ['mail'],        // mail/sms/uspace/weixin/enterprise_wechat
  subject: '标题',
  content: '内容',
  mailReceiver: ['xx@yy.com'] // 邮件接收人
});
```

可发送类型：
- **邮件**：需先配置消息通道的发件箱
- **友空间工作通知**：`channels: ['uspace']`
- **友空间待办**：`messageType: 'createToDo'` + `createToDoExt: { webUrl }`
- **友空间预警**：`groupCode: 'prewarning'`

### 调度任务
创建后端脚本→获取函数地址→调度任务节点→新增任务→调度类型"后端脚本"→填写脚本编码→配置定时规则→保存

### 事件订阅
应用构建→集成配置→事件订阅→添加函数→**保存**（不保存函数绑定关系丢失）→新增事件订阅→选择事件

函数通过 `postman()` 将事件数据转发给三方系统的REST接口

## 相关页面
- [[API调用]]
- [[2026-05-28-bip-backend-script-intro]]
