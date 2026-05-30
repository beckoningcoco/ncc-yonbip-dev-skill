---
tags: [问题处理, API, OrgId, 权限, 开放平台]
created: 2026-05-27
updated: 2026-05-27
sources: [问题处理/封装api调用原厂api报错OrgId无使用权限]
---

# 封装 API 调用原厂 API 报错 OrgId 无使用权限

> 自己封装的 API 报"组织无使用权限"，但直接调原厂 API 正常。

## 原因

API 调用时的身份绑定有关。后台任务中框架默认使用机器人身份的 `yht_access_token`，该身份可能无目标组织的权限。

## 解决

参考 [[开放平台接口使用需要绑定用户]]，通过获取真实用户的 `yht_access_token` 并覆盖请求头，或新建独立线程执行。

## 相关页面
- [[开放平台接口使用需要绑定用户]]
- [[yht_access_token]]
