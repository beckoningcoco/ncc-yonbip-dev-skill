---
tags: [附件上传, Base64, CooperationFileUploadService, 文件下载, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-attachment-upload-methods.md]
---

# 旗舰版附件上传的接口方法

> 两种附件上传方式：对方传 Base64 编码、对方传下载文件地址。

## 方式一：Base64 编码上传

```java
@Resource
private CooperationFileUploadService cooperationFileUploadService;

byte[] fileBytes = decodeBase64ToBytes(content);
cooperationFileUploadService.uploadFile(businessType, businessId, fileBytes, fileName, null);
```

`businessType` 需从前台上传文件时从控制台抓取，格式如 `c-kk-lzlj-cwgx+mdf`。

## 方式二：下载文件地址上传

先通过 `FileDownloadUtil.downloadFileWithInfo(fileUrl)` 下载文件获取 Base64，再调用上传。

## 上传后关联单据

将生成的 `businessId`（UUID）赋值给单据的附件字段（如 `vattachmentass`），单据展示时自动关联附件。

## 关键概念

- [[CooperationFileUploadService]]
- [[附件上传]]
- [[FileDownloadUtil]]
- [[Base64Util]]
