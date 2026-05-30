---
tags: [目录权限, AccessDeniedException, Linux, setExecutable, 天九, 电档, 问题处理]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-tianjiu-dir-permission.md]
---

# 天九电档目录权限问题

> 电档采集坏账损失单据时，Java 代码创建目录后报 AccessDeniedException。

## 根因

代码中 `fdir.setExecutable(false)` 手动关闭了目录的**执行权限**（x）。

在 Linux 中，目录的 x 权限不等于"可执行"，而是**允许进入目录（cd）和访问内部文件属性**。没有 x 权限，即使有 rw 权限也无法访问。

## 修复

```java
// 修正前
fdir.setExecutable(false);  // 关闭执行权限

// 修正后
fdir.setExecutable(true);   // 放开执行权限
```

Windows 环境不会暴露此问题（NTFS 忽略目录执行权限）。

## Linux 权限要点

| 权限 | 数字 | 对目录的作用 |
|------|------|-------------|
| r | 4 | 列出目录内文件名 |
| w | 2 | 创建/删除/重命名文件 |
| x | 1 | **进入目录并访问子文件** |

755 = `rwxr-xr-x`，775 = `rwxrwxr-x`，644 = `rw-r--r--`

## 关键概念

- [[AccessDeniedException]]
- [[Linux 目录权限]]
- [[setExecutable]]
