---
tags: [postman, XML, 后端函数, API调用, xml2json]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-postman-xml.md]
---

# 后端函数postman传XML格式参数

> 在后端函数中通过 postman 工具发送 XML 格式的 POST 请求，并将 XML 响应解析为 JSON。

## 代码示例

```js
let header = { 'Content-Type': 'text/xml;charset=UTF-8' };
let strResponse = postman('post', url, 'xml', JSON.stringify(header), xmlString);
var jsonString = xml2json(strResponse);
```

- `postman` 第三个参数传 `'xml'` 指定请求体格式
- 使用 `xml2json` 内置函数将 XML 响应转为 JSON 对象

## 关键概念

- [[postman 函数]]
- [[xml2json]]
- [[XML 格式]]
