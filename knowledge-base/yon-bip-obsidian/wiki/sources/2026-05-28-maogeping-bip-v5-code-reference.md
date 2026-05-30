---
tags: [BIP, 客开, 代码模板, 后端, OpenAPI, V5]
created: 2026-05-28
updated: 2026-05-28
sources: [raw/notes/2026-05-28-maogeping-bip-v5-code-reference.md]
---

# 毛戈平 BIP V5 客开代码参考

> 基于毛戈平供应链外部平台 (c-scm-xfp-mgpkk) 项目代码，系统整理 BIP V5 旗舰版客开代码模板和架构模式。

## 项目背景

- **项目**: 毛戈平供应链外部平台
- **BIP 版本**: V5 (旗舰版)
- **核心功能**: BIP 与每刻(Maycur)、佳碟(JD)、巨益(Juyi)等外部系统的双向数据集成
- **业务范围**: 应付结算、付款单、收款单、资金付款、委外消耗、BOM变更、销售对照表

## 架构分层

```
Controller → Service (Interface + Impl) → YonbipUtil / IBillQueryRepository / IYmsJdbcApi
```

## 核心概念

- [[YonbipUtil]] — BIP OpenAPI 调用中心，封装 60+ 个平台 API 方法
- [[IBillQueryRepository]] — BIP 平台标准查询接口
- [[SuperDO]] — BIP 实体基类，配合 @YMSEntity 注解使用
- [[BillPlugin扩展]] — 单据生命周期钩子（beforeSave/afterSave/afterAudit）
- [[BusinessConvertService]] — 推单/生单服务，上下游单据自动生成
- [[IYpdCommonRul规则]] — 审核后自动触发规则

## 16 大代码模板

### 1. OpenAPI 调用
`OpenServiceBuilder` + `InputParam` + `Invoke.getResult()` 标准模式，支持 doPost/doGet，180s socket 超时。

### 2. IBillQueryRepository 查询
`QuerySchema.create().addSelect().appendQueryCondition()` 链式查询，支持按条件、按 ID、按外部单号查询。

### 3. Entity / SuperDO 定义
继承 `SuperDO` + 实现 `ILogicDelete`，`@YMSEntity` 声明表映射，每个字段定义 static final 常量。

### 4. bill/save 自定义实体保存
OkHttp3 + RestTemplate + Domain-Key 头，POST 到 `/bill/save` 端点。

### 5. BillPlugin 扩展
`@BillPlugin(busiObj="xxx")` + `extends AbstractBillPlugin`，覆盖 beforeSave 做唯一性校验。

### 6. IYpdCommonRul 规则
`implements IYpdCommonRul`，审核后异步执行推单逻辑。

### 7. BusinessConvertService 推单
`businessConvertService.doConvert()` + 转换规则编码，生成下游单据。

### 8. 异步日志
先同步创建日志拿 ID，再用 `YmsExecutors` 异步更新成功/失败结果。

### 9. 直接 SQL
`IYmsJdbcApi` + `SQLParameter`，支持 ColumnProcessor / MapListProcessor / ColumnListProcessor。

### 10. MyBatis 共存
自定义 `SqlSessionFactory` bean 名称避免与 BIP 内置冲突。

### 11. Controller 标准写法
`@RestController` + `@RequestMapping` + `ResultMessageDTO` 统一返回格式。

### 12. 外部 HTTP 调用
Hutool HttpRequest（每刻）+ HMAC-SHA256 签名（佳碟）+ Token 缓存模式。

### 13. 参数校验
交易类型/币种/物料/项目/客户/自定义档案的编码→ID 翻译方法。

### 14. 核心业务模式
- [[对照表模式]] — 外部编码→BIP ID 映射
- [[三选逻辑]] — MGP343 部门分配
- [[保存提交审核回滚模式]] — try-catch 保证数据一致性
- 下游单据轮询 — 最多 30 秒等待异步生成
- 并发查询 — CompletableFuture + 线程池

### 15. 配置属性
`@Value` 注入：yonbip.app_key, mk.baseurl, jd.appid 等 10 个外部化配置。

### 16. 常用组件速查
10+ 个 BIP 标准注入组件：ITransTypeService, ITenantCurrencyService, IProductServiceV2, IMerchantServiceV2 等。

## 原文精彩摘录

> BIP OpenAPI 调用：`OpenServiceBuilder.build().appKey(appKey).appSecret(appSecret).env(env)` → `InputParam.build().setUrl(url).setBody(reqBody)` → `Invoke.getResult()`

> 三选逻辑：如果 MGPMK018（人员职级）有值 → 按职级查部门；否则如果 MGPMK015（平台）有值 → 按平台查部门；否则 → 使用承担部门

> 保存→提交→审核→失败回滚：try { save → submit → audit } catch { unSubmit → delete }

## 相关页面

- [[API调用]]
- [[保存事件]]
- [[日志记录]]
- [[BIP后端开发模板]]
