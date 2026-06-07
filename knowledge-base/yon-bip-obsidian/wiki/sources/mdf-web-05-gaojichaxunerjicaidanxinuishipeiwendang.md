---
title: "--高级查询二级菜单新UI适配文档"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/05-gaojichaxunerjicaidanxinuishipeiwendang"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 8
---

# --高级查询二级菜单新UI适配文档

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/05-gaojichaxunerjicaidanxinuishipeiwendang | 所属：Web组件

# [](#高级查询二级菜单新ui适配文档)高级查询二级菜单新UI适配文档

extAdvanceStyle

## [](#效果展示)效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/GaoJiChaXunErJiCaiDanXinUIShiPeiWenDangimage1.9d1e257a.png)

如上图所示，这是高级查询二级菜单的配置完成效果图，将页签形式展现为平铺的选项，而且可以根据业务需求配置扩展组件。

## [](#配置方式)配置方式

配置方式很简单，但是大前提是配置好了高级查询二级菜单，如果没配，移步文档[高级查询二级菜单使用及数据库配置](#/components-web/05-gaojichaxunerjicaidanshiyongjishujukupeizhi)。

如果配置好二级菜单了，请在UI模板上的查询区 ConvenientQuery 配置cStyle:
{"NewAdvanceUI": true}, 即可完成配置

或者也可以通过查询区扩展脚本来开启：

// 这里的viewmodel是查询区的FilterViewModel

viewmodel.getParams().NewAdvanceUI = true; // 这里的viewmodel是查询区的FilterViewModel

// 这里的viewmodel是查询区的FilterViewModel，如果不知道这是啥，请查文档了解。

### [](#配置扩展组件)配置扩展组件

**如果想配置扩展组件，也是配置cStyle或者扩展脚本修改，cStyle：{"extControlType":
"你的扩展组件类型，比如extInput"}**

其中，这个扩展组件只能是basic组件，在脚手架的src/client/web/components/basic目录下扩展。

viewmodel.getParams().extControlType = "你的扩展组件类型，比如extInput"

**配置完高级查询二级菜单是没有图标的，需要单独配置图标**

**在pb_filter_solution_advance表中配置条件的时候需要在对应的tab
行的cExtProps字段中配置icon，这是平台的[图标库](https://iuap-design-cdn.oss-cn-beijing.aliyuncs.com/static/fonts/full-iconfont/demo_index.html)（这个图标库不一定是最新的，因此可以找对应的设计师访问iconFont的bip彩色图标项目，如果不清楚这是什么，请咨询平台UE王敏之）**

**如果想用自己领域的图标库资源，请在cExtProps中配置fontFamily，fontFamily信息在领域图标库内自行查找。**

**领域配置自己的图标库请看：[领域图标资源扩展（彩色图标）](#/guides/03-lingyutubiaoziyuankuozhan)**

**如果表里没有cExtProps字段，请联系MDD-王思懿**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/GaoJiChaXunErJiCaiDanXinUIShiPeiWenDangimage2.4c71bda0.png)

**icon配置这个symbol值，完整的json就是：{"icon": "riqilei_hong"}**

**fontfamily值在这看：**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/GaoJiChaXunErJiCaiDanXinUIShiPeiWenDangimage3.d12ffa7d.png)

**这个FontClass/Symbol前缀 hr就是fontfamily，并非下面那个，请注意。**

**使用领域自己的图标资源，完整的json就是：{"icon": "riqilei_hong",
"fontFamily": "hr"}**

### [](#配置扩展样式)配置扩展样式

**二级菜单新UI支持配置部分自定义样式，自定义样式分为容器样式和标签样式，具体配置方式如下：**

**配置分为containerStyle和tabStyle，如下图所示：**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/GaoJiChaXunErJiCaiDanXinUIShiPeiWenDangimage4.68133526.png)

**依旧是查询区 ConvenientQuery 配置cStyle或者getParams()改， 增加key
extAdvanceStyle**

**示例：'{"extAdvanceStyle":{"containerStyle":{"float":"left"},"tabStyle":{"width":160,"backgroundColor":"#d6fed6"}}}'**

**或者扩展脚本改：FilterViewModel.getParams().extAdvanceStyle =
'{"containerStyle":{"float":"left"},"tabStyle":{"width":160,"backgroundColor":"#d6fed6"}}'
// String类型**

**效果为：**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/GaoJiChaXunErJiCaiDanXinUIShiPeiWenDangimage5.9b202399.png)

### [](#配置扩展类名)配置扩展类名

和上文描述一样，还是在cStyle中增加这个key：extAdvanceStyle，示例：**'{"extAdvanceStyle":{"className":
"myClassName"}}'**

### [](#分组配置效果)分组配置效果

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/GaoJiChaXunErJiCaiDanXinUIShiPeiWenDangimage6.648cc970.png)

如上图，可以看到各个指标菜单分成了三个组，这个配置很简单，只需要在前面配置的基础上，在相应的条件的cExtProps中增加一个配置为groupKey的属性，value自定义，只要能体现是一个分组即可。

分组上方可以增加标题（供应链需求）在对应条件的cExtProps中增加一个groupTitle的属性，value就是对应的标题（多语可能有影响，需讨论方案）,groupTitle和groupKey必须分类一致，比如说groupKey是1，那么所有groupKey是1的条件，groupTitle都要起一个名字，比如都叫标题1.

示例数据：

![](data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAPoAAAD6CAMAAAC/MqoPAAADAFBMVEX19fXv7+98fHx1dXV9fX23t7eenp5wcHDn5+f09PTz8/Pd3d2SkpLY2Njt7e3Q0NCioqJycnKqqqq7u7uurq6CgoKGhobOzs7Dw8PR0dGNjY3Hx8fj4+PGxsbS0tKoqKgAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABYhwFnAAAE60lEQVR42u3cC1faSBTA8UkyYUIgIZaXWFH7WfeDrmfPnrqtSzmAPNMkmwB54EILrRUL/9856sCdy8x1QgIkKgQAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA/Aa01xnGCkNjz66Brs9O6BdsSdPau6+pWydUesk8pLdZepVJ6a8yyt5b+5IRntCqq1/a/U2v+pt0xqUbrzKKDJ7f416W5nqjGc33635CpTsTY7qIRPDkzI9W+nF2c23VWTU6yjnabu4opbvyJm3WDPes9vAX3l9pc1C7ONZ6yGMMOpnm7bkUJ+3ZFmwU3jS5xv/jp7vBl2WU3xgebdV5NUfplE7plP4m3sKz6pRO6ZRO6ZRO6ZRO6ZT+tkq3bfucSk+K9ddnkg1zIsr2uZQ+HVjxYnurG04oRDQ4n1WviYnXvxTJJ/K9iRC1o6z6UU48RfpMDG2jojf6ThSXbk7Db3U/pdKrI9sXC+EYY33kC1GZ2vMjlH6czyW6qnC5jKW//073Uypd1GUlbTqqLs6pdNHVvbZVLlttT74X51W6cM2qVBeyamri3Ep/we68hqf0N1Z6cNCln1ZwQqXrBxUT6KdUenTI5cGvVDoXhQMAAAAAAAAAjkxdbd62pbprq1YcaB32OK3v37OT/vN/Cbd1tMM+7feN5v2nH5j9j1b9Sx1Wuib+FmL++QXGfZEH+Tlbz4koTSvJduAL+bRurFw0HW8aqPpYSGusX5ueFxi6lLI2Xeekp9YufSkN5WtXCymbTyLpLpQRRw0jXOVp8YNkYfVuVpL1KB1GNFveVNqL+FfdDOS7r1F4O1Nx0CgFWSRLKScTuBytftamm+Mn6YEWLsffc9WvDa3V+1psLPU/Ptxn1zqFD5P7+5Gheao1Tv7tjH+t0pjbLytZqolOz9PMfmXzsVd5SSsPf36nvEF+Vu7x/r7pLuy4x9DStI4Qn0Q5ucYuzCNZiqFVlbdIfqYTKYy/Tj/k2Zhc1lBShcbaspnu5pIvTSUX/lXTrmuVu2W5mmoUuyf/aMeQ6+d6/K0QTv6G3dhcBS26iXvEpdgqyYmDDaVlkSzFVberO7OJFMfP0rftXrbvPd1HIdrGl2He2MG9+DP+/uEh/lb/WFhYcTX/ElXrvaTLrqtAC+FyP84fZBuUsxCzDx/GcY9HX0ySckJTDUdBlEWyFK3Tez6Rwvhp+oH74O6dmzd2rXr7ztl2HCx3q0o5zjLYVDtWvRBOclvZHMuqWbHtyIx7JKuXLFu8hVxH3TySpaQTyCdSHD9N3/+gsv8G76rSjpcA8R3PNvhqcR6bG/xm6ddJGbU7s7DFCqk8ZeeRLCXd4POJFMf/5ga/fTfXKbldLSo2tqgNXDE0tYZbua1uRtrNTrx3MaP6qG1VxXrnavqOW+qs8xKb4YIvD5F7k5xjj2p6zaou91ON2bQ+ySOZoflP3W03CxOJn+/p+Hn63gc3OQijcX3h5420txasjlTLo0UYdIMnZxyERmUopD3K8iPv0ZiaY/+p1RfhRX+VYs1E4P0bhau8IL4nDye5lXl6aPSb42AcPcVdJyIUqrfM+aOjDQqRLMUI/WDmjMQinUgpDNLxs/StB7e9Xr/+1na+Dj7ji8f2emvgrC/g7Y1ept+vSQcAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAFPwHQtqBoXRspJoAAAAASUVORK5CYII=)

上面的SQL仅供参考，具体情况请根据自己业务调整；上面SQL中的cExtProps中的
'{"groupKey": "firstGroup"}'、'{"groupKey":
"secondGroup"}'、'{"groupKey":
"thirdGroup"}'，就是分别给分了三个组。

## [](#常见问题)常见问题

**Q: 我配置了二级页签，明明有数据，但是为什么上面的数字是0呢？**

**A:**
请排查是否开了autoGetAdvanceTitles，如果没开，那请排查扩展脚本是否监听了getAdvanceTitles事件，如果是，请排查此处的赋值逻辑是否有误；如果开了autoGetAdvanceTitles还是有问题，请联系MDF-张昊进行排查。

记得参考这篇文档：[高级查询二级菜单使用及数据库配置](#/components-web/05-gaojichaxunerjicaidanshiyongjishujukupeizhi)

**Q: 如何默认选中某一项？**

**A：**

filterViewModel.on('beforeGetAdvanceTitles', (states) => {

states.activeTabKey = '508' // 这里写你要选中的那一项的id即可

})

写上面的扩展脚本即可

**Q: 如何默认不选中页签呢？**

**A:**

**通过扩展脚本修改不会默认选中第一条：**

filterViewModel.on('afterInit', () => {

filterViewModel.on('beforeGetAdvanceTitles', states => {

states.activeTabKey = 'not-selected'

})

})

**Q: 如何在指标卡样式的面板上配置tips呢？**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/GaoJiChaXunErJiCaiDanXinUIShiPeiWenDangimage8.10fffc23.png)

**A:在对应项的cExtProps中配置{"tips": "UID:P_FW_174E6C8C0528009D"},
这个tips内容是对应文字的多语资源id**

目前大规模适配的领域有大人力、大供应链事业部部分领域

功能完善中，有任何问题与MDF-张昊沟通。