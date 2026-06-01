---
title: "组件化开发（YonUI）"
type: reference
source: "iuap-YonBuilder组件化开发红皮书 (55页)"
tags: ["BIP", "旗舰版", "组件", "YonUI", "React", "manifest"]
created: 2026-06-01
---

# 组件化开发

架构：`manifest 配置 + 纯 React 组件`。CLI：`yonui create/build/start`。

目录：`components/`(扁平), `locales/`(zh_CN/en_US), `_style/`, `_utils/mdf-ext/`。

组件类型：BasicControls / FormControls / LayoutContainer / DataContainer。

manifest.js：name, type, props[](type/editType), events[](name+transformers)。

扩展快捷键自动继承：disabled, required, bIsNull, maxLength。发布：组件扩展中心 → 资源库 → 打包。
