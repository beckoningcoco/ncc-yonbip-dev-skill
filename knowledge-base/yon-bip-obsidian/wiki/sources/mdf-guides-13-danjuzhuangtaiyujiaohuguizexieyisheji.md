---
title: "单据状态与交互规则协议设计(StateRule)"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/13-danjuzhuangtaiyujiaohuguizexieyisheji"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 2
---

# 单据状态与交互规则协议设计(StateRule)

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/13-danjuzhuangtaiyujiaohuguizexieyisheji | 所属：指南

# [](#单据状态与交互规则协议设计staterule)单据状态与交互规则协议设计(StateRule)

## [](#1-设计原则)1. 设计原则

按照状态机理论，一个状态的转化分为现态、事件、动作、次态

一个页面的状态规则可以通过状态机来描述，分为

- 事件 EventName
- 条件 Condition
- 动作 Action

## [](#2-staterule相关概念)2. StateRule相关概念

### [](#21-概念)2.1 概念

前端单据状态，借助表达式来描述前端单据状态的各种conditon、action等，主要包含以下概念：

- StateRule
- StateCondition
- ActionGroup
- Condition
- Action

### [](#22-含义)2.2 含义

- StateRule 状态规则，一个bill可以有多个StateRule
- StateCondition，状态条件，即当满足一个状态条件时，会执行ActionGroup。一个StateRule有多个StateCondition
- ActionGroup，动作组（或动作集），一个StateRule可以有多个ActionGroup

condition 条件，执行Action的条件。一个ActionGroup有0到N个Condition
- Action 动作，对页面元素的赋值操作（本质上是操作页面上的UI元数据）。一个ActionGroup有0到N个Action
总的来说，

### [](#23-关系)2.3 关系

- 1个StateRule对应0...N个StateConditon，即主-子关系
- 1个StateRule对应0...N个ActionGroup，即主-子关系
- 1个ActionGroup包含0...N个Condition，即主-子关系；Condition可以借助表达式来表达
- 1个ActionGroup包含0...N个Action，即主-子关系；Action可以借助表达式来表达

总的来说是 主-子-孙 关系另外对象和一些属性的关系如下：

- 1个StateRule只对应0...1个EventName（多事件未来根据实际需要考虑）
- 1个StateRule下的多个StateCondition之间是有先后执行顺序的，通过ordernum来表达
- 1个StateRule下的多个ActionGroup 之间是有先后执行顺序的，通过ordernum来表达

## [](#3-关键对象和属性说明)3. 关键对象和属性说明

StateRule对象

### [](#31-staterule对象)3.1 StateRule对象

- 

code：前端rule编码

- 

name：前端rule显示名

- 

type：rule的类型

- 

0 - 公式计算rule，例如：使用公式来配置新增字段值的场景，type为0，根据Action中的expression分析得出triggers

- 

1 - 事件触发rule，例如：通过指定一个或多个trigger的事件（EventName），来条件性的执行动作（Action）

- 

2、页面状态机触发，例如：当页面满足什么条件（condition）时，执行什么逻辑。一个页面可以看做是一个状态机，我们可以定义一组状态，成为页面状态集（StateSet）

逻辑可以是具体定义好的一个rule Action
- 逻辑也可以在billStatus定义好的一个状态集中的某一个具体状态（例如add、edit、browse、audit、finish、xxx自定义状态1、xxx自定义状态2）
- 状态集的定义考虑《单据状态及状态集定义》

- 

eventName：当type=0时，表示公式配置字段表达式，eventName为onFomula
当type=1时，表示通过规则配置页面而生成的规则表达式，eventName表示前端事件（组件事件、页面生命周期事件）

||code||前端rule编码|||
||name||前端rule显示名|||
||type||StateRule的类型||按照场景进行分类|
||||type=0，公式计算rule，没指定事件、没指定条件，仅仅指定了Action，且仅适用了expression||例如：使用公式来配置新增一个字段，指定该字段等于一个expression，框架会自动分析得出triggers来执行该Action|
||type=1，事件触发rule，通过指定一个或多个trigger的事件（EventName），来条件性的执行动作（Action）||例如：状态规则配置页面配置出来的都属于该情况|||
||type=2，状态机触发rule(预留)||例如：当满足什么条件（condition）时，执行什么动作（Action）|||
||triggers||非必输，可以指定特定的triggers，如果指定了按照指定的  triggers来触发；如果没有指定会根据Condition和Action来自动确定运行时的触发源。triggers支持多个，用逗号（，）隔开。trigger可以是字段（cItemName）、容器（groupcode）||triggers中的一个trigger可能是一个expression，例如 xxx子表.number|
||eventName||当type=1时，触发事件，有且仅有一个（约定）||不同的eventName通过设置不同的stateRule来解决|
||||当type=0时，表示公式配置字段表达式，eventName为NULL|||
||当type=1时，表示通过规则配置页面而生成的规则表达式，eventName表示前端事件（组件事件、页面生命周期事件|||||
||caseType||可选字段，场景类型，对Type的进一步细分。例如参照运行动态获取条件的场景。取值范围：refConditionrefCallBack||定义了caseType后，会对应一些场景化的编辑或配置工具。这些配置页面或工具可以仅针对特定的caseType进行查询、编辑等。|
||disabled||INT类型，1表示停用，失效，默认null，0、null都表示启用||默认表示启用|
||dr||INT类型，逻辑删除标记，默认值为NULL，NULL和0都表示不删除；1表示删除||默认NULL，表示不是逻辑删除的记录|

### [](#32-statecondition对象)3.2 StateCondition对象

【待补充】

||属性||含义|||
||code||编码|||
||name||名称|||
||ordernum||在同一rule下的Action的执行顺序|||
||ruleid||隶属于那个rule的id|||
||ctype||表示该条件的类型，取值含义：”0“或NULL表示是mode条件，mode属性有效”1“ 表示表达式条件，即exprType、leftExprType、leftExpression、rightTarget等生效||可以理解为2大类条件mode条件表达式条件|
||mode||字符串类型，前端单据模式状态，例如编辑、浏览、新增；取值范围如下：browseeditadd||取值范围：add|
||leftLogicOper||表示该条件作为与原有条件之间的逻辑运算符，第一个SateCondition的该属性可空||当ordernum为最小时，该属性值无效 |
||exprType||表示整个condition是哪一种表达式的类型，默认是00或NULL、空字符串，表示是该条件表达式是一个逻辑比较表达式，compareOper等属性生效其他值，暂时预留|||
||disabled||INT类型，1表示停用，失效，默认null，0、null都表示启用||默认表示启用|
||dr||INT类型，逻辑删除标记，默认值为NULL，NULL和0都表示不删除；1表示删除||1表示删除|

左表达式相关属性：

||字段||含义|||
||leftExprType||表示右侧表达式类型，默认0，表示右侧是一个公式表达式，需要走公式解析||等于1时，表示leftTarget和leftProperty生效，表示是一个字段属性leftProperty无值或不存在表示取leftTarget的Value值。leftProperty存在，则示取leftTarget的属性值等于0时或不存在，表示leftExpression生效，表示是一个公式表达式|
||leftExpression||比较符（compareOper）的右侧的表达式||当leftExprType等于0时或不存在，leftExpression生效，是一个表达式|
||leftTarget||右目标字段名，如果是值则可以省略rightProperty||当rightExprType=1时有效|
||leftProperty||右目标字段的属性名，与leftTarget联合使用，如果是值则可以省略leftProperty||当leftExprType=1时有效|

逻辑比较符：

- compareOper 条件left部分和right部分之间的逻辑比较符

比较符支持如下：
- like 字符包含
- !like 字符不包含
- in 包含
- !in 不包含
- == 等于
- 

= 大于等于

- <= 小于等于
- 

大于

- < 小于
- != 不等于
- === 等于

右表达式相关属性：

||字段||含义|||
||rightExprType||表示右侧表达式类型，默认0，表示右侧是一个公式表达式，需要走公式解析||等于1时，表示rightTarget和rightProperty生效，表示是一个字段属性。rightProperty无值或不存在表示取rightTarget的Value值。rightProperty存在，则示取rightTarget的属性值等于0时或不存在，表示rightExpression生效，表示是一个公式表达式等于2表示rightExpression是一个常量表达式，需要通过rightExpressionValueType进一步指定该常量的数据类型(String,Number,Date,Object,Boolean)，如果rightExpressionValue未指定，运行时按照JS eval处理等于3，表示变量表达式，leftExpression生效，表示它是一个变量表达式（可能是字段变量、环境变量等）|
||rightExpression||比较符（compareOper）的右侧的表达式||当rightExprType等于0时或不存在，rightExpression生效，是一个表达式|
||rightExpressionValueType||rightExpression的值的类型，字符串类型，取值范围为js的基本数据类型对应的字符串。例如Strng、Date、Number||取值范围，取决于解释环境。目前是在JS运行环境下，因此取值范围为JS的数据基本类型对应的取值|
||rightTarget||右目标字段名，如果是值则可以省略rightProperty||当rightExprType=1时有效|
||rightProperty||右目标字段的属性名，与rightTarget联合使用，如果是Value值则可以省略rightProperty||当rightExprType=1时有效|

### [](#33-actiongroup对象)3.3 ActionGroup对象

||属性||含义|||
||code||编码|||
||name||名称|||
||ordernum||在同一rule下的Action的执行顺序|||
||ruleId||隶属于哪个SateRule的id|||
|||||||
|||||||
||disabled||INT类型，1表示停用，失效，默认null，0、null都表示启用||默认表示启用|
||dr||INT类型，逻辑删除标记，默认值为NULL，NULL和0都表示不删除；1表示删除||1表示删除|

### [](#34-condition对象)3.4 Condition对象

字段含义如下：

||属性||含义||说明|
||code||编码|||
||name||名称|||
||ordernum||在同一rule下的Action的执行顺序|||
||actionGroupId||隶属于哪个ActionGroup对象的id|||
||ctype||条件类型。取值含义：”0“、空、NULL表示是mode条件，mode属性有效，其他表示条件属性无效。”1“ 表示表达式条件，即exprType、leftExprType、leftExpression、rightTarget等生效|||
||mode||字符串类型，前端单据模式状态，例如编辑、浏览、新增；取值范围如下：browseeditadd|||
||leftLogicOper||表示该条件作为与原有条件之间的逻辑运算符||当ordernum为最小时，该属性值无效|
||exprType||表示整个condition表达式的类型，默认是0，表示是该条件表达式是一个逻辑比较表达式，exprType=0、空或不存在时，与compareOper联合作用，表示该条件是一个逻辑比较表达式|||
||disabled||INT类型，1表示停用，失效，默认null，0、null都表示启用||默认表示启用|
||dr||INT类型，逻辑删除标记，默认值为NULL，NULL和0都表示不删除；1表示删除||1表示删除|
||extdev||json字符串类型 用于扩展字段||leftExpressionFuns 左侧公式对应的函数leftExpressionTriggers 左侧公式对应的变量rightExpressionFuns 右侧公式对应的函数rightExpressionTriggers 右侧公式对应的变量childrenFiled 条件是否是子表条件，值对应子表的childrenField"{"leftExpressionFuns":"strToNum,syddate","rightExpressionFuns":"strToNum,syddate"}"|

左表达式相关属性：

||字段||含义|||
||leftExprType||表示右侧表达式类型，默认0，表示右侧是一个公式表达式，需要走公式解析||等于0、空值、不存在，表示leftExpression生效，表示是一个公式表达式等于1时，表示leftTarget和leftProperty生效，表示是一个字段属性leftProperty无值或不存在表示取leftTarget的Value值。leftProperty存在，则示取leftTarget的属性值等于2，常量表达式，表示leftExpression生效，表示它是一个常量表达式，需要通过rightExpressionValueType进一步指定该常量的数据类型(String,Number,Date,Object,Boolean)，如果rightExpressionValue未指定，运行时按照JS eval处理。等于3，变量表达式，表示leftExpression生效，表示它是一个变量表达式（可能是字段变量、环境变量等）|
||leftExpression||比较符（compareOper）的右侧的表达式||当leftExprType不等于1时（等于0、2、3时或不存在），leftExpression生效，是一个表达式|
||leftExpressionValueType||leftExpression的值的类型，字符串类型，取值范围为js的基本数据类型对应的字符串。例如Strng、Date、Number||取值范围，取决于解释环境。目前是在JS运行环境下，因此取值范围为JS的数据基本类型对应的取值|
||leftTarget||右目标字段名，如果是值则可以省略rightProperty||当lefttExprType=1时有效|
||leftProperty||右目标字段的属性名，与leftTarget联合使用，如果是值则可以省略leftProperty||当leftExprType=1时有效|
||逻辑比较符：|||||

- compareOper 条件left部分和right部分之间的逻辑比较符

右表达式相关属性：

||字段||含义|||
||rightExprType||表示右侧表达式类型，默认0，表示右侧是一个公式表达式，需要走公式解析||等于0、空值、不存在，表示rightExpression生效，表示是一个公式表达式等于1时，表示rightTarget和rightProperty生效，表示是一个字段属性。rightProperty无值或不存在表示取rightTarget的Value值。rightProperty存在，则示取rightTarget的属性值2常量表达式，表示rightExpression生效，表示它是一个常量表达式    3变量表达式，表示rightExpression生效，表示它是一个变量表达式（可能是字段变量、环境变量等）|
||rightExpression||比较符（compareOper）的右侧的表达式||当rightExprType不等于1（等于0、2、3时或不存在），rightExpression生效，是一个表达式|
||rightExpressionValueType||rightExpression的值的类型，字符串类型，取值范围为js的基本数据类型对应的字符串。例如Strng、Date、Number||取值范围，取决于解释环境。目前是在JS运行环境下，因此取值范围为JS的数据基本类型对应的取值|
||rightTarget||右目标字段名，如果是值则可以省略rightProperty||当rightExprType=1时有效|
||rightProperty||右目标字段的属性名，与rightTarget联合使用，如果是Value值则可以省略rightProperty||当rightExprType=1时有效|

### [](#35-action对象)3.5 Action对象

- 

**code**: 编码

- 

**name**: 名称

- 

**ordernum**: 在同一 rule 下的 Action 的执行顺序

- 

**actionGroupId**: 隶属于哪个 ActionGroup 对象的 ID

- 

**exprType**: 必输，表达式类型

**0**: 赋（字段）值表达式，例如设置 `totalMoney = 数量 * 单价`
- **1**: 赋属性表达式，`target` 和 `property` 生效。例如设置某字段不可见

`property` 无值或不存在，表示给 `target` 赋 Value 值。
- `property` 存在，表示给 `target` 赋属性（property）值。

- **2**: 设置容器，例如设置某一个卡片 `card0` 的 Visible 为 false，利用 `updateViewMeta` 来触发执行。
- **3**: 显示弹窗，`target` 控制弹窗类型 `modal/message`，`property` 控制是否禁止下一步 `disabled/''`。

- 

**target**: 必输，执行表达式的目标名，支持 `order` 主实体、`order.orderLine` 子实体

- 

**property**: 非必输，当 `exprType` 为 1 时，`property` 有值，表示 `target` 对象的属性名

- 

**srcExprType**:

等于 0 时或不存在，表示 `srcExpression` 生效，表示是一个公式表达式
- 等于 1 时，表示 `source` 和 `srcProperty` 生效，表示是一个字段属性（包含 value）

`srcProperty` 无值或不存在，表示取 `source` 的 Value 值。
- `srcProperty` 存在，则取 `source` 的属性值。

- 

**srcExpression**: 表示赋值符号右侧是一个表达式，当 `srcExprType=0` 时有效

- 

**source**: 右目标字段，当 `srcExprType=1` 时有效

- 

**srcProperty**: 右目标字段的属性名，与 `source` 联合使用，当 `srcExprType=1` 时有效

||exprType||必输，该Action表达式类型，取值为0、1、2|||
||0 - 赋（字段）值表达式，例如设置totalMoney = 数量*单价|||||
||1 - 赋属性表达式，target和property生效。例如设置xxx字段不可见property无值或不存在，表示给target赋Value值。property存在，表示给target赋属性（property）值|||||
|| 2- 设置容器Action表达式，例如设置某一个卡片 card0的Visible为false，利用“updateViewMeta”来触发执行|||||
||target||action的左侧目标对象，Action是对target进行操作的|||
||property||target的属性，可空。系统默认按值（value）进行解释。|||
||srcExprType||右边的表达式类型，取值0、1、2、30时，srcExpression表示一个公式表达式1时，右边是字段，source和srcProperty（可空）生效，srcExPression无效。2时，srcExpression表示一个常量表达式3时，srcExpression表示一个变量表达式|||
||source||srcExprType=1时，source和srcProperty生效|||
||srcPropperty||source对象的属性，可空，系统默认把空按value处理|||
||srcExpression||srcExprType=0、2、3时，生效。表达式，可以是公式表达式、常量表达式、变量表达式(字段表达式属于变量表达式)|||
||srcExpressionValueType||srcExpression的值的类型，字符串类型，取值范围为js的基本数据类型对应的字符串。例如Strng、Date、Number||取值范围，取决于解释环境。目前是在JS运行环境下，因此取值范围为JS的数据基本类型对应的取值|
||disabled||INT类型，1表示停用，失效，默认null，0、null都表示启用||默认表示启用|
||dr||INT类型，逻辑删除标记，默认值为NULL，NULL和0都表示不删除；1表示删除||1表示删除|
||extdev||json字符串类型 用于扩展字段||srcExpressionFuns srcExpression公式对应的函数srcExpressionTriggers srcExpression公式对应的变量childrenFiled 动作是否是子表动作，值对应子表的childrenFieldlogicOper 逻辑操作符 true/false"parentRelation 值为single，代表target为表格侧滑里元素{"srcExpressionFuns":"strToNum,syddate"}"|

新加字段参见：[运行时动态参照过滤条件](#/guides/13-danjuzhuangtaiyujiaohuguizexieyisheji/yunxingshidongtaicanzhaoguolvtiaojian.md)

## [](#4-表达式支持环境变量)4. 表达式支持环境变量

||变量名||含义|||
||$mode||环境变量，表示当前页面状态兼容原有写法的mode（不建议）||等于browse时，表示浏览态等于add时，表示新增态等于edit时，表示编辑态等同于API common.getMode(viewmodel)|
||$data||例如 $data.name，含义是获取单据字段name的值。$data可省略，直接写name。也可写成data.name(兼容老的)||等同于viewmodel.getAllData()data.params  等同于viewmodel.getParams()页面参数|
||函数||数学函数和自定义函数||前端支持计算白名单：scalelncotmoment（特殊）所有数学函数前端不支持计算的后端去算sumgetValuestrToNum...(后端公式通过调用 /bill/executeFormulaCalculate获取计算结果，计算逻辑可联系 赵东升([zhaodshf@yonyou.com](mailto:zhaodshf@yonyou.com)))|
||$viewmodel||环境变量，表示viewmodel||等同于viewmodel|

// 例子

$mode=='browse' //当前环境为浏览态, 等同于mode=='browse'

price //price字段的值 等同于data.price和$data.price

sin(price) //price字段的值求sin值

length(price) //price字段值的字符串长度

## [](#5-使用场景示例)5. 使用场景示例

参见：页面状态规则配置使用及示例

## [](#6-架构图)6. 架构图

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/danjuzhuangtaiyujiaohuguizexieyishejiimage1.9684a14b.png)
模型绑定
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/danjuzhuangtaiyujiaohuguizexieyishejiimage2.92f27d2b.png)