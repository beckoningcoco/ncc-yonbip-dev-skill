---
title: "企业风格主题适配"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/03-qianduankuangjiaqiyefengge"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 14
---

# 企业风格主题适配

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/03-qianduankuangjiaqiyefengge | 所属：指南

# [](#企业风格主题适配)企业风格主题适配

**请注意：下文中需要适配的组件范围是领域单独使用了TinperNext组件，以及在扩展组件中使用了MDF相关组件。**

# [](#1-主题配置入口)1. 主题配置入口

企业风格设置------>系统框架设置------>业务界面主题

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/qiyefenggeimage1.d2835a62.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/qiyefenggeimage2.ad188023.png)

# [](#2-适配模块)2. 适配模块

适配模块包含：标题组-headerGroupData、页签组-tabsGroupData、折叠组-collapseTitleGroupData、标签状态组-tagStyleData、表单组-formStyleData、按钮组-buttonStyleGroupData目前有5个分组

MDF对外提供了两种获取配置项参数的方法，领域根据需求选用合适的方法即可：

方法1：获取当前分组下的所有配置项：cb.utils.getThemeGroup('上面分组的名称')，比如要获取页签组的数据：cb.utils.getThemeGroup('tabsGroupData')

方法2：获取当前分组下某一项配置的值：cb.utils.getThemeValueByKey('上面分组的名称', '当前分组下某一项的key')，key的取值在下文中会有说明。

## [](#21-页面标题)2.1. 页面标题

效果展示：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/qiyefenggeimage3.f51395ad.png)

页面主题主要适配的功能点：背景颜色适配

**获取页签分组下面的所有配置项：cb.utils.getThemeGroup('headerGroupData')**

||参数||说明||备注|
||参数||说明||备注|
||headerBgValue||当前选中项||key值，default：默认    solid：纯色     change：渐变|
||--browseHeaderDefaultBg||默认背景色||css变量，框架已封装好，可直接使用|
||--browseHeaderSolidBg||纯色色值||css变量，框架已封装好，可直接使用|
||--browseHeaderChangeBg||渐变色色值||css变量，框架已封装好，可直接使用|

## [](#22-页签切换)2.2. 页签切换

效果展示：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/qiyefenggeimage4.f580b92b.png)

页签共有上面三种模式，需要适配的功能点：三种模式切换，一级二级页签设置背景色，**API参考下表（重要）：**

**获取页签分组下面的所有配置项：cb.utils.getThemeGroup('tabsGroupData')**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/qiyefenggeimage5.6abe9021.png)

||参数||说明||备注|
||参数||说明||备注|
||tabsMode||default：一级页签type值为card，二级页签type值为linemode1：一级页签type值为fade ，二级页签type值为fill-linemode2：一级页签type值为card，二级页签type值为fill||key值，通过tabsMode的值给基础组件传递type即可|
||oneTabsTitleBgValue||一级页签当前选中项||key值，default：默认    solid：纯色     change：渐变|
||--browseOneTabsDefaultBg||一级页签默认背景色||css变量，框架已封装好，可直接使用|
||--browseOneTabsSolidBg||一级页签纯色色值||css变量，框架已封装好，可直接使用|
||--browseOneTabsChangeBg||一级页签渐变色色值||css变量，框架已封装好，可直接使用|
||twoTabsTitleBgValue||二级页签当前选中项||key值，default：默认    solid：纯色     change：渐变|
||--browseTwoTabsDefaultBg||二级页签默认背景色||css变量，框架已封装好，可直接使用|
||--browseTwoTabsSolidBg||二级页签纯色色值||css变量，框架已封装好，可直接使用|
||--browseTwoTabsChangeBg||二级页签渐变色色值||css变量，框架已封装好，可直接使用|

## [](#23-折叠分组)2.3. 折叠分组

效果展示：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/qiyefenggeimage6.ebc2c382.png)

分组共有上面两种模式，需要适配的功能点：两种模式切换，一级二级分组设置背景色，**API参考下表（重要）：**

**获取页签分组下面的所有配置项：cb.utils.getThemeGroup('collapseTitleGroupData')**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/qiyefenggeimage7.e6f890e1.png)

||参数||说明||备注|
||参数||说明||备注|
||groupTitleMode||default：默认模式newMode：新主题||key值|
||titleFollowPrimary||标题前面的图标颜色是否跟随主题色变化||key值，true：跟随变化   false：不跟随|
||oneTitleBgValue||一级分组当前选中项||key值，default：默认    solid：纯色     change：渐变|
||--browseOneTitleSolidBg||默认颜色色值/一级分组纯色色值||css变量，框架已封装好，可直接使用|
||--browseOneTitleChangeBg||一级分组渐变色色值||css变量，框架已封装好，可直接使用|
||twoTitleBgValue||二级分组当前选中项||key值，default：默认    solid：纯色     change：渐变|
||--browseTwoTitleSolidBg||默认颜色色值/二级分组纯色色值||css变量，框架已封装好，可直接使用|
||--browseTwoTitleChangeBg||二级分组渐变色色值||css变量，框架已封装好，可直接使用|

## [](#24-标签状态)2.4. 标签状态

效果展示：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/qiyefenggeimage8.7e1431e9.png)

状态共有上面三种默认，值有三个default、filled、bordered（和钉耙组件的tag组件属性值一样），获取值的方法：**cb.utils.getThemeValueByKey('tagStyleData',
'tagMode')**

适配方法：

**情况一：使用了钉耙的tag组件**

给组件传递type属性，比如type：'filled'

**情况二：自定义写的样式**

获取到对应的模式写css代码即可，上述三种模式的css变化规律是：字体颜色变成背景颜色变成边框颜色

## [](#25-表单模式)2.5. 表单模式

效果展示：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/qiyefenggeimage9.100df59b.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/qiyefenggeimage10.0944a3f7.png)

### [](#251-边框模式适配)2.5.1. 边框模式适配

表单编辑态可以设置四周带边框和只有底边框的模式
，浏览态可以给文字设置底边框或者背景色，**但是如果编辑态设置四周有边框，浏览态只能设置背景色；如果编辑态设置只显示下边框，浏览态只能设置下边框颜色，领域在适配过程中请注意这一点。**

获取表单边框模式：**cb.utils.getThemeValueByKey('formStyleData','formBorderStyle')，** border：四周有边框，bottom：显示底边框。

**单据编辑态适配方法：**

表单编辑态可以设置四周带边框和只有底边框的模式 ，浏览态可以给文字设置底边框或者背景色，但是如果编辑态设置四周有边框，浏览态只能设置背景色，编辑态设置只显示下边框，浏览态只能设置下边框颜色，领域在适配过程中请注意这一点。

获取表单边框模式：cb.utils.getThemeValueByKey('formStyleData', 'formBorderStyle')，border：四周有边框，bottom：显示底边框。

如果直接引用MDF组件，需要给组件传递formBorderStyle属性：

<MDFComponent formBorderStyle={border} />

如果直接引用Tinper组件，需要给组件传递bordered属性：

<TinperComponent bordered={border} />

下划线模式请注意：下划线模式下，如果字段是必填，需要给钉耙基础组件和MDF组件传递 **requiredStyle:true**，这样才能凸出显示下边框必填颜色。

**单据浏览态适配方法：**

**凡是没有直接使用MDF组件都需要领域写扩展样式适配，可以审查元素参考MDF的写法。MDF是通过css伪类给元素加的边框，这样的好处是不影响组件高度，不会影响卡片主表字段的浮动布局，建议领域也采用此方案。**

**！！！请注意------重要：**

**情况一：如果领域单据是通过MDF打开的，那么MDF框架已经在最外层dom上挂载上了边框模式的类名，border-bottom-color-mode代表当前是只显示下边框模式，browse-background-color代表四周都有边框，领域可以直接使用者两个类名，在对应的类名下给扩展组件写对应的样式即可，css变量见下表。**

**情况一：如果领域单据和MDF没有任何关系，那么就需要领域自己根据表单模式去实现对应的css效果，下表中的css变量依然可以使用。**

生效范围：

UE目前定的规范是卡片页面主表区域表单字段、弹窗中的表单字段、侧滑弹窗中的表单字段三个模块的表单样式需要跟随主题变化，除了这三个模块，如果其他区域的字段不需要跟随主题变化，需要在容器的扩展属性cStyle中配置 **{"followThemeChange":false}**

### [](#252-上下布局适配)2.5.2. 上下布局适配

获取布局方式：**cb.utils.getThemeValueByKey('formStyleData','inputLayout')，** leftRight：左右布局，topBottom：上下布局。

MDF实现方式：如果是上下布局，MDF会在dom上挂载verticalLayout的类名，通过css把布局变成上下布局

领域扩展组件适配方式：可以直接使用verticalLayout的类名给扩展组件写样式变成上下布局即可，

||参数||说明||备注|
||参数||说明||备注|
||formBorderStyle||border：四周有边框，bottom：显示底边框||key值|
||inputLayout||leftRight：左右布局，topBottom：上下布局||key值|
||--browseContentBgColor||浏览态内容背景色||css变量，框架已封装好，可直接使用|
||--browseValueColor||浏览态文字背景色||css变量，框架已封装好，可直接使用|
||--browseBottomBorderColor||浏览态底边框背景色||css变量，框架已封装好，可直接使用|

## [](#26-按钮组)2.6. 按钮组

效果展示：

![](data:image/png;base64,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)

按钮组有两种模式：一种是常规模式，另一种模式是按钮的边框和文字颜色都根据主题色。

获取按钮模式：**cb.utils.getThemeValueByKey('buttonStyleGroupData','buttonMode')**，值有两个onlyPrimary和followPrimary。

onlyPrimary：默认模式，按钮不跟随主题色变

followPrimary：跟随主题色变，主题色css变量：**--wui-primary-color**

获取到对应的模式写css代码即可，如果基础组件支持传递属性也可以通过传递属性实现。

**注意：按钮适配不是单据中的所有按钮，目前UE定的范围如下:**

1、列表页面表格右上角按钮

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/qiyefenggeimage13.d3780c1e.png)

2、卡片页面标题右侧按钮

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/qiyefenggeimage14.baafb667.png)

3、卡片子表右上按钮

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/qiyefenggeimage15.3be9ce3e.png)

# [](#3-数据获取)3. 数据获取

## [](#31-mdf获取方式)3.1. MDF获取方式

主要针对环境中没有cb的情况

**上文在cb上封装了一些获取配置项的方法，如果领域单据加载了MDF资源，上文封装在cb上的方法直接使用即可；如果领域环境中没有cb，就需要领域自行开发。所有配置项信息在工作台上下文信息中，下面是MDF获取配置项的代码，仅供参考：**

//-----------------------此处代码仅供参考------------------------------

const diworkContext = window.jDiwork?.diworkContext?.() || {};

const { businessTemplateContent } = diworkContext; //businessTemplateContent 当前主题的所有数据

// 整理数据格式

cb.utils.getPreferConfig = (data) => {

 const obj = {};

 if (data) {

 data.map((item) => {

 obj[item.configCode] = item.configCodeValue

 })

 }

 return obj;

}

// 获取当前分组下的数据

cb.utils.getThemeGroup = (group) => {

 const diworkContext = window.jDiwork?.diworkContext?.() || {};

 const { businessTemplateContent } = diworkContext;

 if(!cb.utils.isEmptyObject(cb.utils.stringToJSON(businessTemplateContent))){

 const preferConfig = cb.utils.stringToJSON(businessTemplateContent) ||{};

 const { content = {} } = preferConfig;

 const groupOptions = cb.utils.getPreferConfig(content[group]);

 return groupOptions;

 } else {

 return {};

 }

}

// 通过分组和配置项的key获取当前配置项的值

cb.utils.getThemeValueByKey = (group, Key) => {

 let value;

 const diworkContext = window.jDiwork?.diworkContext?.() || {};

 const { businessTemplateContent } = diworkContext;

 if(!cb.utils.isEmptyObject(cb.utils.stringToJSON(businessTemplateContent))){

 const preferConfig = cb.utils.stringToJSON(businessTemplateContent) ||{};

 const { content = {} } = preferConfig;

 const groupOptions = cb.utils.getPreferConfig(content[group]);

 if (groupOptions[Key] != undefined) {

 value = groupOptions[Key];

 }

 }

 return value;

}

## [](#32-ynf获取方式)3.2. YNF获取方式

import { utils } from 'ynf-core-middleware'

const { contextUtils } = utils

// contextUtils?.getThemeObj 获取当前分组下的数据, 例如:

const formStyleData = contextUtils?.getThemeObj?.('formStyleData');

const headerGroupData =contextUtils?.getThemeObj?.('headerGroupData');

const tabsGroupData = contextUtils?.getThemeObj?.('tabsGroupData');

const collapseTitleGroupData =contextUtils?.getThemeObj?.('collapseTitleGroupData');

// contextUtils?.getThemeValueByKey通过分组和配置项的key获取当前配置项的值, 例如:

const inputLayout =contextUtils?.getThemeValueByKey?.('formStyleData', 'inputLayout');

# [](#4-其他)4. 其他

平台开发对接人：付玉峰

平台UE对接人：王敏之