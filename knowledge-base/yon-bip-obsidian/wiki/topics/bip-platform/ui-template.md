---
title: "UI 模板"
type: reference
source: "iuap-UI模板红皮书 (32页)"
tags: ["BIP", "旗舰版", "UI模板", "设计器", "MDF"]
created: 2026-06-01
---

# UI 模板

三种接入：采购云自实现 / 领域应用登记 / 原子服务+单据类型登记。

关键表：`aa_regist_conf`(configKey=old-mdf-ui-template) / `mdf_design_domain` / `bill_base` / `billtemplate_base`。

接入条件：MDD>=3.1.0 + domainKey 特性开关(getTplIdFirst+newBillMeta) + Dubbo Bean 发布(MdfCommonDubboService / MdfBillMetaQueryService)。

API：`BillMetaController#getTplId` / `MdfTemplateRunTimeService#getSingleTpl` / `/billmeta/assignedtpllist`。

高级设计器：公式配置 / 参照带入 / 交互规则 / 页面布局（单卡/主子表/树卡/Wizard）。
