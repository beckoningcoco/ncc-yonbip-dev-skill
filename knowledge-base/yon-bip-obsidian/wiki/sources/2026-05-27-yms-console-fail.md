---
tags: [启动报错, YMS控制台, VPN, HTTPS, 配置检查, 问题处理]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-yms-console-fail.md]
---

# 启动报错：请求YMS控制台失败

> 请求YMS控制台失败，请检查YMS控制台。

## 排查步骤

1. **检查两处配置**：YDS 全局配置和项目配置中的注册中心地址是否正确
2. **检查 VPN 连接**：是否已连 VPN
3. **尝试 HTTP**：如果使用了 HTTPS，尝试换为 HTTP（正常应该是 HTTPS）

## 关键概念

- [[YMS 控制台]]
- [[启动报错]]
- [[VPN]]
