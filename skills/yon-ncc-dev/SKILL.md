---
name: yon-ncc-dev
description: >
  NCC（用友NC Cloud）全套开发技能。触发场景：NCC开发、NC Cloud、NCC二开、NCC客开、
  NCC业务插件、IBusinessListener、事件监听、审批后/新增后/修改后、单据转换、
  NCC后台任务、定时任务、计划任务、NCC参照开发、自定义参照、
  NCC编码规则、单据编号、NCC自定义档案、DefdocVO、
  NCC环境问题、NCHOME、start.bat、sysconfig、NCC配置、
  NCC版本、NCC home、NCC JDK、NCC源码、NCC OpenAPI、
  采购发票/销售订单/库存单据/应付单/应收单的插件开发。
  只要用户提到 NCC、NC Cloud，或用友云ERP相关，都应该使用此技能。
permissions:
  - description: CFR Java decompiler - auto-approved for source code analysis
    command: java -jar cfr
    auto_approve: true
---

# NCC 开发技能集合

本技能包含三个子技能，根据用户需求自动路由：

| 子技能 | 目录 | 触发场景 |
|--------|------|----------|
| **ncc-dev** | `ncc-dev/SKILL.md` | 业务插件、事件监听、单据转换、编码规则、自定义档案、通用API |
| **ncc-plugin-dev** | `ncc-plugin-dev/SKILL.md` | 插件开发、编码规范、示例代码 |
| **ncc-background-task** | `ncc-background-task/SKILL.md` | 后台任务、计划任务、定时任务 |

> 收到 NCC 相关问题后，先读取对应子技能的 SKILL.md，再按其中指引查找 `references/` 下的参考文档。
