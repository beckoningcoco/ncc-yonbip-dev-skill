---
title: "MDD 后端编程模型与单据开发"
type: reference
source: "iuap-MDD后端编程模型红皮书 (V5.0.0, 2022-05)"
tags: ["BIP", "旗舰版", "MDD", "元数据", "单据", "审批流", "RESTful"]
created: 2026-06-01
---

# MDD 后端编程模型与单据开发

> MDD = Model Driven Development，以元数据为核心资产，通过三大驱动引擎（UI 模板引擎、规则引擎、元数据引擎）将模型转换为运行时代码。

## 开发环境搭建

### 脚手架来源

```
git clone http://git.yonyou.com/mdd-pub/ucf-mdf-pub/tree/develop/mddfw-be-3.0.8-dev
```

数据库初始化脚本位于 `mdd-pub/mdd-db/tree/u8cdev/mysql`。

### 启动配置

```properties
spring.application.name=[iris-domain]
spring.domain.name=[iris-domain]
server.servlet.context-path=/
server.port=8080

# IRIS 注册中心
mdd.mw.profiles.active=combine
mdd.access.key=4ceHfnmlKbR1OyW9
mdd.access.secret=Up6wkdGE5w3CgKnJG864U7D9uJRHsH
```

YMS 控制台额外配置 Redis、DB 等中间件地址。启动类：`com.yonyou.ucf.mdd.bootstrap.server.Startup`。

### 模块结构

| 模块 | 依赖 | 功能 |
|------|------|------|
| mddfw-api | - | 对外服务层（RPC 接口定义） |
| mddfw-bootstrap | - | 启动模块 |
| mddfw-domain | mddfw-api | 领域业务模块 |
| mddfw-conf | - | 配置模块 |
| mdd-framework-api | - | 框架接口模型 |
| mdd-framework-core | mdd-framework-api | MDD 核心驱动 |
| mdd-framework-support | mdd-framework-core | 业务规则支持 |
| mdd-pub-jar | all | 统一接入包 |

### Spring XML 配置

| 配置文件 | 用途 |
|------|------|
| `applicationContext.xml` | 分词配置、国际化、OSS |
| `applicationContext-db.xml` | 数据库连接、事务 |
| `applicationContext-imeta.xml` | 元数据公式、实体扫描 |
| `applicationContext-mvc.xml` | 请求拦截 |
| `applicationContext-redis.xml` | Redis |

## 元数据建模（XML）

### 实体定义

```xml
<component domain="myDomain" name="staff" moduleName="hr" title="员工">
  <entity name="Staff" title="员工" tableName="hr_staff">
    <attribute name="id" columnName="id" title="主键" type="String" 
               iLength="36" isKey="true"/>
    <attribute name="code" columnName="code" title="编码" type="String" 
               iLength="50" isCode="true"/>
    <attribute name="name" columnName="name" title="名称" type="String" 
               iLength="100" isRequired="true"/>
  </entity>
</component>
```

属性标签说明：

| 标签 | 说明 |
|------|------|
| `isKey` | 主键 |
| `isCode` | 编码字段 |
| `isUnique` | 唯一约束 |
| `isRequired` | 必填 |
| `jointUnique` | 组合唯一 |
| `isMasterOrg` | 主组织标记 |

### 继承与接口

```xml
<!-- 继承基类 -->
<extends baseEntity="base.itf.BaseEntity"/>

<!-- 实现接口: 租户、停启用、逻辑删除 -->
<interface name="ITenant" moduleName="base"/>
<interface name="IEnable" moduleName="base"/>
<interface name="ILogicDelete" moduleName="base"/>
```

元数据配置完成后导入 Web 元数据管理后台，或通过设计器在线编辑。

## UI 元数据建模（Excel）

用 Excel 工具生成 SQL，每个 Sheet 对应 DB 中的一张表：

| Excel Sheet | 对应表 | 说明 |
|-------------|--------|------|
| bill | `bill_base` | 单据信息 |
| entity | `billentity_base` | 实体信息 |
| template | `billtemplate_base` | 模板信息 |
| tplgroup | `billtplgroup_base` | 模板分组 |
| item | `billitem_base` | 控件字段 |
| filters | `pb_meta_filters` | 过滤组件 |
| filter_item | `pb_meta_filter_item` | 过滤条件 |
| toolbar | `bill_toolbar` | 工具栏 |
| toolbaritem | `bill_toolbaritem` | 工具栏按钮 |
| command | `bill_command` | 单据动作 |

配置完成后需清理 Redis 缓存 `key:viewmodel*`。

## 审批流对接

### 元数据要求

实体必须实现接口 `base.itf.IApprovalFlow`：

```java
public interface IApprovalFlow {
    Boolean isWfControlled();  // 是否审批流控制, defaultValue=false
    Short verifystate();       // 审批状态, defaultValue=0
    Short returncount();       // 退回次数, defaultValue=0
}
```

三个关键标签：

| 属性 | 标签 | 说明 |
|------|------|------|
| orgId | `isMasterOrg="true"` | 主组织字段 |
| bustype | `isTransactionType="true"` | 交易类型字段 |
| code | `isCode="true"` | 编码字段 |

### YMS 配置

```
A63.bpmrest.source=[appsource]
```

### 规则注册（billruleregister）

```sql
-- 提交规则
INSERT INTO billruleregister (billnum, action, ruleId, iorder, isSystem)
VALUES ('common', 'submit', 'submitBillRule', 30.00, b'1');

-- 撤回规则
VALUES ('common', 'unsubmit', 'unsubmitBillRule', 30.00, b'1');

-- 审核规则
VALUES ('common', 'audit', 'auditBillRule', 30.00, b'1');

-- 弃审规则
VALUES ('common', 'unaudit', 'unauditBillRule', 30.00, b'1');

-- 流程回调
VALUES ('common', 'deleteBpm', 'deleteBpmRule', 30.00, b'1');

-- 删除单据时取消流程
VALUES ('common', 'delete', 'cancelBpmRule', 50.00, b'1');
```

### 工具栏按钮配置

| Name | Text | Command | Action | Url |
|------|------|---------|--------|-----|
| btnSubmit | 提交 | cmdSubmit | submit | /bill/submit |
| btnUnsubmit | 撤回 | cmdUnsubmit | unsubmit | /bill/unsubmit |
| btnWorkflow | 审批流 | cmdWorkflow | workflow | - |

### 前端配置

MDF 配置中心设置 `appSource` 和审批流 env，用于弹出公共审批组件。

## RESTful API

### 获取模板 ID

```http
POST /billmeta/getTplId?token=bttZE5
```

请求体：
```json
{
  "serviceCode": "st_purchaseorderlist",
  "metaType": "voucherlist",
  "billNo": "st_purchaseorderlist",
  "noCache": false
}
```

返回值：`{ "code": 200, "data": { "tplId": 435648168, "branch": "defaultTpl", "hasMultiMode": false } }`

服务端代码：`BillMetaController#getTplId`

参数说明：

| 参数 | 必须 | 说明 |
|------|------|------|
| billno | 是 | 表单 billno |
| id | 否 | 详情时传入 |
| terminalType | 是 | 端类型(1=PC, 3/4=移动) |
| transtype | 否 | 交易类型，发布菜单时必须 |
| serviceCode | 否 | 通过 serviceCode 联查模板分配关系 |

### 获取 Meta 数据

```http
前端: GET /meta?terminalType=1&serviceCode=st_purchaseorderlist
后端: POST /billmeta/getfebill
```

请求体：
```json
{
  "isSum": true,
  "bIncludeViewModel": true,
  "bIncludeView": true,
  "tplid": 2056758,
  "billNo": "st_purchaseorderlist",
  "bDesignMode": false
}
```

返回值包含 `viewApplication`（UI 布局）和 `viewmodel`（数据模型）。

服务端代码：`BillMetaController#getFeBill → ViewModelLoader#load → ViewLoader#load`

### 过滤接口

```http
前端: GET /client/getInitFilterInfo?billnum=st_purchaseorder
后端(三合一): /filterDesign/loadDefaultSolution
后端(分开): GET /filterDesign/getFilterBase
           GET /filterDesign/getSolutionList
           GET /filter/{solutionId}/solutionFilters
```

### 规则接入

规则分为系统级和租户级：
- 系统级：开发预置，`isSystem=b'1'`
- 租户级：开通时从系统级拷贝，运行期全部使用租户级

模块级别规则 `billnum` 取 `bill_base` 上的 `subId`。

缓存 key：`billrule*`，修改后需清理。

### 参照扩展

`pub_ref` 表注册参照，`datasourceType` 支持类型：

| 类型 | 处理器命名 | 
|------|-----------|
| sql | sqlRefDataHandler |
| meta | metaRefDataHandler |
| mapper | mapperRefDataHandler |
| es | esRefDataHandler |
| rpc | rpcRefDataHandler |
| 自定义 | `[你的类型]RefDataHandler` (Spring Bean) |

前后置扩展：通过 `IRefEvent` 接口实现，在 `pub_ref` 的 `eventbean` 列指定 Spring BeanName。

## 规则缓存

| 缓存 Key | 说明 |
|-----------|------|
| `viewmodel*` | UI 元数据缓存 |
| `billrule*` | 规则缓存 |
| `enumCache*` | 枚举缓存 |

## 相关文档

- [[yms-dev-process]] — YMS 中间件是 MDD 工程的基础运行时
- [[metadata-bizobject]] — 元数据模型是 MDD 模型驱动的核心
- [[permission-system]] — 权限是 MDD 框架集成的核心特性
- [[mdf-frontend]] — MDF 前端与 MDD 后端共享元数据协议
