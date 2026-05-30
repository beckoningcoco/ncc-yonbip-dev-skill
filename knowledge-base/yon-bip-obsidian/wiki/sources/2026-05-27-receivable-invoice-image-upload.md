---
tags: [应收发票, 影像上传, 专岗环节, ispostnode, img_task, 问题处理]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-receivable-invoice-image-upload.md]
---

# 应收发票接口报错：非专岗环节不允许上传影像

> 应收发票保存提交后立即上传影像报错"非专岗环节不允许上传影像"。

## 原因

单据配置了审批流，提交后需等待影像任务进入专岗环节（`ispostnode = true`）才能上传。

## 解决方案

循环查询 `img_task` 表，等待 `ispostnode` 变为 true：

```java
int i = 0;
while (i++ <= 10) {
    Thread.sleep(300);
    List<IBillDO> resList = billQueryRepository.queryBySchema("sscimg.sscimg.img_task", querySchema);
    if (resList != null && resList.size() > 0) {
        Boolean ispostnode = (Boolean) resList.get(0).getAttrValue("ispostnode");
        if (true == ispostnode) break;
    }
}
// 然后执行影像上传
```

## 关键概念

- [[img_task]]
- [[ispostnode]]
- [[影像上传]]
- [[专岗环节]]
