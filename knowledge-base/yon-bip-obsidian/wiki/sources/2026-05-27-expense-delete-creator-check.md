---
tags: [报销单, 预提单, 删除接口, 创建人校验, yht_access_token, 问题处理]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-expense-delete-creator-check.md]
---

# 报销单/预提单删除校验创建人问题

> 外系统调用报销单/预提单删除接口报"只能删除当前用户创建的单据"。

## 解决

不走标准 OpenAPI，改为根据单据创建人获取 `yht_access_token` 后模拟前台请求删除：

1. 外系统传入 `creator`（经办人编码）
2. 通过 `bd.staff.Staff` 查询 `user_id`
3. 根据 `user_id` 获取 `yht_access_token`（`/cas/exclusive/genLoginTokenByUserIdLimitIp`）
4. 设置请求头 `yht_access_token` 和 `Domain-Key`
5. 调用前台删除路径：`/mdf-node/uniform/bill/delete?cmdname=cmdDelete&...`

## 关键概念

- [[删除接口]]
- [[创建人校验]]
- [[yht_access_token]]
- [[前台请求模拟]]
