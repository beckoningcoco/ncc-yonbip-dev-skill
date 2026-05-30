---
tags: [UI模板, 设计器, sceneData, domain, 按钮组件]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-ui-template-designer-button.md]
---

# UI模板的设计器放出按钮来

> 在 UI 模板设计器中看不到拖入的按钮组件时，将 URL 中的 `sceneData=simple` 替换为 `sceneData=domain` 即可显示完整设计器界面。

## 解决方案

将页面地址中 `sceneData=simple` 改成 `sceneData=domain`，复制链接在新页面打开即可看到按钮等更多组件。

示例 URL：
```
https://gxdev.lzlj.com/iuap-yonbuilder-designer/.../index.html#/onepage/design/EAR/...?sceneData=domain&...
```

## 关键概念

- [[UI 模板设计器]]
- [[sceneData 参数]]
