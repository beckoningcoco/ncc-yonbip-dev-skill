---
title: 多语开发
source: https://c2.yonyoucloud.com/iuap-hc-client/ucf-wh/client/index.html#/detail/DYKK11
author: 张宏涛
date: 2026-01-13
ingested: 2026-05-28
tags: [多语, 国际化, i18n, 翻译工作台, 多语抽取工具]
images: 15
image_paths: []
---

# 多语开发

> YonBIP 旗舰版多语言开发实战：从应用创建到代码实现国际化支持的完整流程。

## 适用场景

适用于**所有部署方案**。

## 三大核心环节

1. **租户多语启用**
2. **开发过程配置多语**
3. **翻译工作台**

## 翻译工作台

左侧资源结构树通常对应领域应用。核心字段：
- 资源编号：系统自动编制，不可修改
- 源语言内容：企业首选语言，作为翻译依据
- 目标语言内容：被翻译的语言内容
- 状态：目标语言翻译状态

## 多语抽取工具

### 配置

1. `/config/application.properties` 中配置 `multilang.server`（环境地址）
2. 保存后在工程目录自动生成 `multilangconfig.properties`，配置 `serverurl`

### 使用流程

1. 启动工具 → 浏览器打开 `http://localhost:18341/multilang/index.html`
2. 输入代码路径 → 选择抽取类型（前端/Java）
3. 配置租户 → 选择应用 → 查询 → 下一步
4. 勾选需翻译条目 → 批量设置分类 → 下一步
5. 选择抽取模式：测试抽取（本地）/ 在线抽取（上传翻译工作台）
6. 在翻译工作台中下载 → 翻译 → 回传

## 前端代码多语

### 脚手架注册

```javascript
// xx-fe/src/client/web/index.jsx
cb.lang.registerLang(process.env.DOMAINKEY, require("../../pack"), "YB_TLNT_HRCP_CODEFE-EXT");
```

### 使用语法

抽取工具自动替换为：

```javascript
cb.lang.templateByUuid('UID:P_FW_174EA2BC04D80073', '不能为空');
```

- 第一个参数：多语 UUID（翻译工作台可查）
- 第二个参数：默认中文（多语资源找不到时的回退）

> 无前端脚手架时，需在每个线上前端函数内都执行注册。推荐启用前端脚手架进行 Git 版本管理。

### 调试

控制台执行 `cb.lang.packDoneAll` 查看客开多语资源分组是否加载。未生效通常是注册问题。

## 后端代码多语

抽取工具自动替换为：

```java
log.info(InternationalUtils.getMessageWithDefault(
  "Z_TEST_YB_5FD61E39-...-EXT_XS0F256R_1946317043929186313",
  "数据错误"
));
```

- 第一个参数：多语资源编号（与前端 UUID 不同）
- 第二个参数：默认信息（加载不到时使用）

## 常见问题

| 问题 | 解决 |
|------|------|
| API函数/后端函数不支持多语 | 使用后端脚手架代码方式替代 |
| 页面名称没有多语 | 页面名称是开发态使用；发布后在"我的应用"中配置服务多语 |
| 前端多语 UUID 存在但不生效 | 控制台执行 `cb.lang.packDoneAll` 检查注册；检查前端脚手架是否正常运行 |
| R6 升级后开发服务多语不生效 | 检查 `MdfSmartLifecycle` 类是否匹配新缓存中心；老版本脚手架需升级 |

## 与其他文档关联

- [[2026-05-28-bip-i18n]] — 多语红皮书（架构与原理）
- [[专业开发]] — 全球化开发
