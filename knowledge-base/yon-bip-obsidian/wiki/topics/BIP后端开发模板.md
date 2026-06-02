---
tags: [BIP, 后端, 代码模板, 架构]
created: 2026-05-28
updated: 2026-05-28
sources: [2026-05-28-maogeping-bip-v5-code-reference, 2026-05-28-bip-backend-plugin]
platform_version: "BIP V5"
project: ""
last_verified: 2026-05-31
status: verified
source_type: practice
---

# BIP后端开发模板

> 基于毛戈平 V5 旗舰版项目整理的 BIP 后端客开完整代码模板和架构模式。

## 模板目录

### 平台 API 调用
- [[YonbipUtil]] — OpenAPI 调用中心，doPost/doGet 标准写法
- [[IBillQueryRepository]] — QuerySchema 查询模式
- `IYmsJdbcApi` — 直接 SQL（ColumnProcessor / MapListProcessor）

### 实体定义
- [[SuperDO]] — 实体基类 + @YMSEntity + ILogicDelete
- 子表关联 — parent.setChildList() → bill/save 级联保存

### 扩展机制
- [[BillPlugin扩展]] — beforeSave/afterSave/afterAudit 钩子
- [[IYpdCommonRul规则]] — 审核后自动触发
- [[BusinessConvertService]] — 推单/生单转换

### 业务模式
- [[对照表模式]] — 外部编码→BIP ID 映射
- [[三选逻辑]] — MGP343 部门分配（职级→平台→承担部门）
- [[保存提交审核回滚模式]] — try { save→submit→audit } catch { unSubmit→delete }

### 基础设施
- 异步日志 — 同步创建 ID + YmsExecutors 异步更新
- MyBatis 共存 — 自定义 SqlSessionFactory bean 名称
- 外部 HTTP — Hutool + HMAC-SHA256 + Token 缓存

### 配置与组件
- `@Value` 外部化配置 — yonbip.app_key, mk.baseurl, jd.appid
- 常用注入组件速查 — ITransTypeService, IProductServiceV2, IMerchantServiceV2 等 10+ 个

## 官方插件方法速查

> 继承 `AbstractBillPlugin` + `@BillPlugin(busiObj = "xxx")`，一个业务对象仅一个插件类。

| 动作码 | 方法 | 说明 |
|--------|------|------|
| `ACTIONCODE_SAVE` | `beforeSave`、`afterSave`、`beforeDB`、`initBillConfig` | 保存（beforeDB 在持久化前） |
| `ACTIONCODE_AUDIT` | `beforeAudit`、`afterAudit` | 终审触发 |
| `ACTIONCODE_UNAUDIT` | `beforeUnAudit`、`afterUnAudit` | 弃审 |
| `ACTIONCODE_DELETE` | `beforeDelete`、`afterDelete` | 删除 |
| `ACTIONCODE_SUBMIT` | `beforeSubmit`、`afterSubmit` | 提交 |
| `ACTIONCODE_UNSUBMIT` | `beforeUnSubmit`、`afterUnSubmit` | 反提交 |
| `ACTIONCODE_ADD` | `initBillDefaultValueWhenNew` | 新增默认值 |
| `ACTIONCODE_LIST` | `beforeBillListQuery`、`afterBillListQuery` | 列表查询 |
| `ACTIONCODE_DETAIL` | `beforeBillDetailQuery`、`afterBillDetailQuery` | 卡片查询 |
| `ACTIONCODE_REFER` | `beforeRefDataQuery`、`afterRefDataQuery` 等 5 个 | 参照查询 |
| `ACTIONCODE_BIZFLOWPUSH` | `beforePush`、`afterConvert`、`afterPush` | 推单/生单 |
| `ACTIONCODE_COPY` | `beforeCopy`、`afterCopy` | 复制 |
| `ACTIONCODE_STOP` | `beforeStop`、`afterStop` | 停用 |
| `ACTIONCODE_UNSTOP` | `beforeUnStop`、`afterUnStop` | 启用 |

**0 租户插件**：`@BillPlugin` 不绑定 busiObj，作为兜底。
**YpdBillContext**：`billDO`、`billDOs`、`workflowParam`、`formulaMap`。
**额外扩展方法**：`commonDoPlugin`（租户级扩展点，所有动作执行前调用）。

## 架构分层

```
Controller (@RestController + ResultMessageDTO)
    ↓
Service (Interface + @Service Impl)
    ↓
YonbipUtil (BIP OpenAPI) / IBillQueryRepository (BIP 查询) / IYmsJdbcApi (SQL)
```

## 相关页面

- [[API调用]]
- [[保存事件]]
- [[日志记录]]
- [[旗舰版开发基础]]
- [[毛戈平 BIP V5 客开代码参考]]
