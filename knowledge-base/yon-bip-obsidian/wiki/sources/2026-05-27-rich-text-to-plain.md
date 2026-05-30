---
tags: [富文本, HTML转文本, 正则, JavaScript, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-rich-text-to-plain.md]
---

# 旗舰版富文本转成普通字符串

> 将 BIP 富文本字段（含 HTML 标签如 `<div class="mdf_rich_text">`）转换为纯文本字符串。

## 解决方案

使用纯 JavaScript 正则处理（无需 DOM/Document）：

```js
function htmlToText(html) {
  return html
    .replace(/<style[^>]*>[\s\S]*?<\/style>/gi, '')
    .replace(/<script[^>]*>[\s\S]*?<\/script>/gi, '')
    .replace(/<[^>]+>/g, '')        // 移除所有 HTML 标签
    .replace(/&nbsp;/gi, ' ')
    .replace(/&amp;/gi, '&')
    .replace(/&lt;/gi, '<')
    .replace(/&gt;/gi, '>')
    .replace(/\s+/g, ' ')
    .trim();
}
```

## 关键概念

- [[富文本]]
- [[HTML 转义]]
- [[正则表达式]]
