---
title: 组织权限开发
source: https://c2.yonyoucloud.com/iuap-hc-client/ucf-wh/client/index.html#/detail/ZZQXKK11
date: 2025-04-27
ingested: 2026-05-28
tags: [权限, 组织权限, 主组织, 角色授权]
images: 10
image_paths: []
---

# 组织权限开发

> 组织权限（主组织权限）的开发接入指南：用户-角色-组织三维授权模型的开发实现。

## 概述

主组织权限作为强管控模型，默认不分配组织权限时无法访问任何业务数据。核心要素：**用户身份 + 角色 + 组织**——即什么用户在什么角色下拥有哪些组织的访问权限。

## 核心特性

- 支持一个用户在不同角色下定义不同的组织权限范围
- 主组织影响该业务数据的数据权限
- 组织权限是功能权限和数据权限的前提

## 与其他文档关联

- [[2026-05-28-bip-auth-management]] — 权限管理总览
- [[2026-05-28-bip-org-management]] — 组织管理
- [[2026-05-28-bip-main-org-config]] — 主组织配置方案
