---
title: "规则引擎（Drools）"
type: reference
source: "iuap-规则引擎红皮书 (26页)"
tags: ["BIP", "旗舰版", "规则引擎", "Drools", "表达式"]
created: 2026-06-01
---

# 规则引擎

基于 Drools，将业务逻辑从代码剥离。设计器 + 执行引擎两部分。

三层场景：基础数据项规则（字段级）、单据数据规则（单据级校验）、相关性规则（字段联动）。

配置流程：配置规则 → 分配 Scope（哪些单据的哪个字段）→ 执行。

执行方式：直接引入 SDK 执行 或 通过 MDD 框架自动执行。前端表达式组件 `npm install iuap-expression`，React/Vue 通用。
