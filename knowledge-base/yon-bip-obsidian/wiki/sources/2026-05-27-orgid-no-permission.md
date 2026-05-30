---
tags: [API调用, OrgId, 权限, 用户绑定, 问题处理]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-orgid-no-permission.md]
---

# 封装API调用原厂API报错OrgId无使用权限

> 自己封装的 API 调用原厂 API 报"组织无使用权限"，但直接拿报文调原厂 API 正常。

## 原因

与 API 调用时的身份绑定有关 — 参考 [[开放平台接口使用需要绑定用户]]。自己封装的 API 在调用链中缺少有效的用户身份信息。

## 解决

为请求头添加 `yht_access_token` 绑定具体用户身份。

## 关键概念

- [[OrgId 权限]]
- [[用户身份绑定]]
- [[yht_access_token]]
