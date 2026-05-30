---
tags: [科学计数法, 格式化, DecimalFormat, Java, 数值转换]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-scientific-notation-format.md]
---

# 取值科学计数法格式如何格式化

> 调用标准接口返回的数值可能是科学计数法格式，使用 DecimalFormat 转换。

## 解决方案

```java
private String getRealDecimal(Object moneny) {
    if (moneny == null) return null;
    DecimalFormat df = new DecimalFormat("0.##########");
    return df.format(moneny);
}
```

`DecimalFormat("0.##########")` 保留所有小数位，自动处理科学计数法和正常格式。

## 关键概念

- [[DecimalFormat]]
- [[科学计数法]]
- [[数值格式化]]
