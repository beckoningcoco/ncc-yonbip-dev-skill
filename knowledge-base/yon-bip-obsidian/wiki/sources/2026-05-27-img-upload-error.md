---
tags: [问题处理, 影像上传, 应收发票, img_task, ispostnode]
created: 2026-05-27
updated: 2026-05-27
sources: [问题处理/应收发票接口报错非专岗环节不允许上传影像]
---

# 应收发票接口上传影像报错

> 保存提交后立即上传影像报错"非专岗环节不允许上传影像"。

## 原因

单据配置了审批流，提交后需要等影像任务进入专岗环节（`ispostnode = true`）才能上传。

## 解决方案

循环查询 `ssc_img.img_task` 表，等待 `ispostnode = true`（最多 10 次 × 300ms = 3 秒），然后再上传影像。

```java
while (i++ <= 10) {
    Thread.sleep(300);
    // 查询 img_task 表
    if (ispostnode == true) break;
}
// 然后执行上传
```
