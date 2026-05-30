---
tags: [事项分录, 传送状态, 总账凭证, API调用, aai_data_clue, aai_voucher]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-modify-voucher-status.md]
---

# 修改事项分录传送状态字段

> 修改事项分录的传送状态，包括调用 API 接口和直接操作数据库表。

## 调用 API

通过 `yonBipUtil.sendEventVoucher(reqMap)` 修改传送状态。关键参数：
- `code: "209"` 表示传送失败，`"200"` 表示成功
- `dataInfo` 中需传 `busiId` 和 `billVersion`（版本号不能乱填）

## 数据库表

| 表名 | 说明 | 关键字段 |
|------|------|----------|
| `fieaai.aai_data_clue` | 生成总账凭证节点 | `target_send_status` |
| `fieaai.aai_voucher` | 事项分录节点 | `send_gl_state`（0=成功, 4=传送中） |

## 关键概念

- [[事项分录]]
- [[总账凭证]]
- [[传送状态]]
