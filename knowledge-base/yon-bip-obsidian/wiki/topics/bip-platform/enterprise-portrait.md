---
title: "企业画像服务"
type: reference
source: "iuap-企业画像红皮书 (41页)"
tags: ["BIP", "旗舰版", "企业画像", "工商数据", "风险监控"]
created: 2026-06-01
---

# 企业画像

数据基础：2+ 亿企业记录（工商/司法/经营/知识产权/新闻）。

7 大服务：查企业(7类×33子类)、批量校准客商、风险监控(22维度3级)、企业评分报告(9章)、关系筛查(股权穿透/控制链)、高级搜索(150+标签)、招投标数据。

三种接入：纯 API(`api.yonyoucloud.com`) / 纯服务(iframe) / 混合。

浮层组件：`import {Corpinfo} from 'ac-ep-utils'`，`<Corpinfo trigger="hover">企业名</Corpinfo>`。

单点登录：NCC(`getLoginUrl4ncc()`)、专属云(Token)、公有云(友户通)。
