---
title: "自定义档案 / 交易类型 / 安装器 / 数据分级"
type: reference
source: "iuap-自定义档案+交易类型+安装器+基础数据分级红皮书"
tags: ["BIP", "旗舰版", "档案", "交易类型", "安装器", "数据分级"]
created: 2026-06-01
---

# 自定义档案

流程：创建档案 → 定义字段 → 设置层级 → 发布。SDK: `basedoc-sdk` + accessKey/accessSecret。API: `DefDocListService` / `DefDocService` / `DefDocDataService`。三大场景：自定义项引用 / 低代码设计器引用 / 数据集成。

# 交易类型

交易类型 = 业务对象 + 审批流 + 业务流 + 单据动作 + UI模板 + 打印模板。一个业务对象可有多个交易类型。单据动作插件：`IBillActionPlugin`（beforeAction/afterAction）。发布菜单后用户可见。

# 安装器插件

三类：工具类(common-tool) / 中间件 / 云原生。ypr.xml + model.xml 配置。17 个 Go Template 方法（GetNodeStr/GetNodeInt/GetGlobalVar/GetMiddlewareVar 等）。全局变量：INSTALL_HOME, SERVICE_PORT, DOMAIN 等。

# 基础数据分级

三级：社会级 / 租户级 / 组织级。两种模式：纯共享 + 分配。8 个核心 API（`MCSetManageService`）：isSettingShareRange, orgMCFilter, shareOrgShareSubDetail 等。SDK: `basedoc-mc-sdk`。
