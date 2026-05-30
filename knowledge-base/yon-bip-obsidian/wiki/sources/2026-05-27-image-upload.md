---
tags: [影像上传, 文件下载, Base64, 图片压缩, FileDownloadUtil, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-image-upload.md]
---

# 旗舰版影像上传

> 实现影像上传功能，含文件下载工具类 FileDownloadUtil（自动 HTTP→HTTPS 重试）、Base64 编解码、图片自适应压缩。

## 核心流程

1. 从外部系统获取影像 URL 列表
2. `FileDownloadUtil.downloadFileWithInfo(imageUrl)` 下载文件并获取 Base64
3. `Base64Util.base64ToBytes` 转为字节数组
4. 调用 `sscImgService.uploadImg` 上传

## FileDownloadUtil 特性

- 自动 HTTP→HTTPS 降级重试
- 根据文件大小自适应压缩（>2MB 开始压缩，质量 0.8→0.4 递减）
- 最大支持 16MB，超限抛异常
- SSL 证书自动信任

## Base64Util 特性

- 自动去除 `data:image/xxx;base64,` 前缀
- 通过 Magic Number 自动识别图片格式（PNG/JPEG/GIF/BMP）

## 关键概念

- [[影像上传]]
- [[FileDownloadUtil]]
- [[Base64 编码]]
- [[图片压缩]]
