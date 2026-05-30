---
tags: [翻译, 交易类型, ITransTypeService, 编码转ID, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-translate-transtype.md]
---

# 旗舰版翻译交易类型

> 通过交易类型编码翻译交易类型 ID，使用 ITransTypeService。

## 代码

```java
@Resource
private ITransTypeService transTypeService;

TransTypeQueryParam param = new TransTypeQueryParam();
param.setTransTypeCode("G001");
param.setTenantId(InvocationInfoProxy.getTenantid());
List<TransType> list = transTypeService.queryMultiLTransTypes(param);
data.put("bustype", list.get(0).getId());
```

## 关键概念

- [[ITransTypeService]]
- [[交易类型翻译]]
- [[翻译档案]]
