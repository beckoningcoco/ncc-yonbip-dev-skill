公式组件
最后更新时间：2024-02-20
基本概念
背景

在业务系统中，存在某些字段数据比较灵活。不是固定的一个值，而是需要在系统运行的时候通过计算动态获取到。这些计算可能是简单的几个字段之间计算联动。也可能是一些复杂的函数计算。

公式组件是用来封装这些底层计算规则算法的组件。里面包含了常见的四则运算、逻辑运算、时间运算、字符串运算、自定义其他函数等。

用户可以基于公式组件的扩展规则去扩写自定义的算法。来实现自己内部的复杂场景

名词解释

**设计态：**指在设计公式时使用的场景。重点是新建公式的准备配置场景。

**运行态：**指公式在实际运算当中所需上下文以及计算过程

公式：指在各种场景中定义的四则计算表达式，或者逻辑表达式，以及其他表达式。

**变量：**指公式在设计的时候无法确认数据指，先使用占位符进行替代。与常规程序里的变量意义类似

常量：指在公式设计的时候就可以确定的数据，通常是字符（引号引起来）或者数字。

产品亮点

公式基于springEl引擎进行封装，更贴近公司技术栈（java语法）。可以直接使用java语法进行公式编写。同时采用sdk方式对外发布，可以有效减缓计算密集型对服务器要求。使用方也可以基于sdk灵活的扩展自己的公式以及变量常量等

技术架构
总体架构设计

架构设计

公式使用配置文件的方式将场景的公式变量常量等注册起来。同时结合前端展示页面，可以形成一个轻量级服务。将其封装成一个sdk形式对外发布对目标服务无侵入。同时留有足够的扩展可以让目标服务在原sdk的基础上扩展自己的公式

公式设计态

设计态扫描所有resource下的公式目录下的公式配置文件。形成公式自定义的前端展示协议。前端可以直接展示相关的函数、变量、常量等。配合前端可视化页面可以设计符合业务需求的公式

公式运行态

运行态公式采用服务式调用和组件式调用两种。可以让调用方决定使用java后端直接调用还是将其暴露成一个服务供web端或者别的服务端进行远程调用。

入口参数采用公式+数据的形式。可以让公式引擎负责底层的数据计算，数据来源则有调用方获取，最大程度解耦与调用方的取数逻辑。

功能介绍
功能概述

公式组件提供对业务中需要动态计算的一些算法进行封装。使用方可以基于这些算法编写出强大的算法组合。从而满足业务上一些动态计算的需求

公式定义

如下图所示,公式组件提供了相关的公式设计元素，可以快速设计出相关的公式：

图 2

函数

公式组件目前包含如下几类函数：

数学函数：处理数学计算相关的函数，如正弦函数、余弦函数等；

字符串函数：处理字符相关的函数，如字符截取函数等

时间函数：处理日期，时间相关的函数，如时间格式化函数、获取系统时间函数等

系统函数：获取当前系统相关信息函数，如获取组织id、获取租户id等

聚合函数：处理子表数据相关行数，如求和函数、最大值函数等

业务函数：与业务相关的函数。如getValue函数等

变量

单据字段：通常是封装了当前某个实体或者表单所用到的字段

档案：获取系统内当前所有用到的档案实体信息

自定义变量：展示目标服务的自定义的相关变量信息

自定义常量：展示目标服务自定义的相关常量的信息

开发示例
前端接入
安装与导入
安装

npm i -S yyuap-formula

导入

const Formula = React.lazy(() => import(/* formula */ 'yyuap-formula'));

// import Formula from 'yyuap-formula'

import 'yyuap-formula/dist/main.css'

使用代码

function FormulaWrap(props){

const [formulaExpression,setFormulaExpression] = useState('')

const [formulaExpressionDisplay,setFormulaExpressionDisplay] = useState('')

return (

<Formula

userVar={true} //是否需要自定义变量

disabled // 是否禁用

con-firm={(formulaExpression:any,formulaExpressionDisplay:any,formulaList:any)=>{

setFormulaExpression(formulaExpression);

setFormulaExpressionDisplay(formulaExpressionDisplay);

}

}

formula={formulaExpression || ''}

formuladisplay = {formulaExpressionDisplay || ''}

contextData={[{code:'case1',name:'c1测试',paramType:'STRING'}]} // 上下文

)

}

function FormulaWrap(props){

const [case1,setCase1] = useState(2);

const [formulaExpression,setFormulaExpression] = useState('')

const [formulaExpressionDisplay,setFormulaExpressionDisplay] = useState('')

return (

<>

<input value={case1} onChange={ e => setCase1(e.target.value) } />

<Formula

autoCalc //基于paramList的前端自动计算

userVar={true} //是否需要自定义变量

formula={formulaExpression}

formuladisplay={formulaExpressionDisplay||''}

con-firm={ (formulaExpression:any,formulaExpressionDisplay:any,formulaList:any,value:any) => {

setFormulaExpression(formulaExpression);

setFormulaExpressionDisplay(formulaExpressionDisplay);

}}

contextData={[{code:'case1',name:'c1测试',paramType:'STRING'},]}

paramList = {{case1:case1}}

/>

</>

)

}

后端引擎接入
Maven依赖

com.yonyou.iuap

bPaaS_formula

0.0.1-SNAPSHOT

注入服务接口

@Resource

private FormulaService formulaService;

典型业务场景介绍
后台调用公式计算

@Autowired

public FormulaService formulaService;

//调用公式服务计算

FormulaExcuteDTO formulaExcuteDTO = new FormulaExcuteDTO();

formulaExcuteDTO.setFormulaExpression("max(vs1_code1,vs1_code2)");//设置公式

Map<String, Object> paramMap = new LinkedHashMap<>();//设置公式需要的参数值

paramMap.put("vs1_code1", 1);

paramMap.put("vs1_code2", 2);

formulaExcuteDTO.setParamValue(paramMap);

FormulaExcuteResultDTO formulaResult = formulaService.executeFormula(formulaExcuteDTO);

if (!formulaResult.getIsSuccess()) { //执行失败

throw new BillCodeException(ExceptionCode.BILLCODE_OUT_025, new Ob-ject[]{elem.getCprefix()});

} else {

result = formulaResult.getExcuteResult();//执行成功，获取执行结果

}

自定义函数扩展
注册自定义函数

在resources/formulaconfig文件夹下添加xml文件，一个xml中可以注册多个函数， 以注册getValue函数为例，xml格式如下

0

getValue

getValue(,,,)

com.yonyou.iuap.formula.engine.formulaset.CustomFunction

函数实现

5.2.1.章节里functionClass类即为自定义函数的类名，functionName即为自定义函数的方法名，需要一一对应。示例代码如下：

package com.yonyou.iuap.formula.engine.formulaset;

/**

自定义函数实现类，示例

*/

public class CustomFunction {

/**

查询表单数据

@param fullName

@param selectFiled

@param conditionField

@param conditionValue

@return

*/

public static Object getValue(String fullName, String selectFiled, String conditionField, Object conditionValue) {

//TODO 此处实现自定函数业务逻辑

return null;

}

自定义变量扩展
实现接口变量接口

需要实现注册变量接口com.yonyou.iuap.formula.engine.VariableSet

如：

/**

自定义结果集demo

*/

public class DemoVariableSetImpl implements VariableSet {

/**

获取结果集

@return 结果集

*/

@Override

public Set getVariables() {

Set voSet = new HashSet<>();

voSet.add(new VariableDTO("code1", "国籍地区", ParamTypeEnum.CHAR, 1));

voSet.add(new VariableDTO("code2", "所属组织", ParamTypeEnum.FLOAT, 2));

voSet.add(new VariableDTO("code3", "出生日期", ParamTypeEnum.DOUBLE, 3));

voSet.add(new VariableDTO("code4", "婚姻状况", ParamTypeEnum.DOUBLE, 4));

return voSet;

}

}

注册变量

在resources/formulavariableconfig 文件夹下 添加xml文件，一个xml中可以注册多个自定义变量集，xml格式如下

自定义变量集1

DefVariableSet1

com.yonyou.iuap.formula.engine.formulaset.DemoVariableSetImpl

varibleSetName：变量集的显示名称
varibleSetCode：变量集的编码
queryClass ： 变量集的实现类
公式多语
Xml函数注册多语

支持XML注册中方法名称()节点与方法描述()节点的多语配置，如果需要配置的话用对应的多语标签将对应语言的内容包住即可。具体的标签如下：

中文--<zh_CN></zh_CN>

英文--<en_US></en_US>

繁体--<zh_TW></zh_TW>

法语--<fr_FR></fr_FR>

例如，要翻译description节点：

<zh_CN><![CDATA[

getValue(fullName,selectFiled,conditionField,conditionValue)

功能: 根据条件查询元数据的值

参数:fullName--元数据的uri

selectFiled--要查询的字段 比如 code

conditionField--条件字段 比如 id

conditionValue -- 条件值

]]></zh_CN>

<en_US><![CDATA[

getValue(fullName,selectFiled,conditionField,conditionValue)

Function: Query metadata value based on conditions.

Parameter: fullName, metadata URI

selectFiled: field to query, for example, code

conditionField: condition, for example, id

conditionValue: condition value

]]></en_US>

<zh_TW><![CDATA[

getValue(fullName,selectFiled,conditionField,conditionValue)

功能: 根據條件查詢元數據的值

參數:fullName--元數據的uri

selectFiled--要查詢的字段 比如 code

conditionField--條件字段 比如 id

conditionValue -- 條件值

]]>

</zh_TW>

代码批量注册函数多语

用代码注册公式返回的对象为FunctionDTO，该对象的functionName与description字段类型为：MultiLangText。如下：

/**

函数名称

*/

private MultiLangText functionName;

/**

方法描述，如： 求和， sum（参数1，参数2）

*/

private MultiLangText description;

MultiLangText对象有addText(MultiLangEnum langEnum, String text)方法可以向其中注册多语信息。其中MultiLangEnum为多语语种类型枚举。注册不同的语种使用不同的枚举。如：

MultiLangText text = new MultiLangText();

text.addText(MultiLangEnum.CN,"方法描述");

如果需要使用多语可以在设置函数名称和方法描述这两个字段的值时构建一个MultiLangText对象，并将多语信息封装在里面。完整示例如下：

public Set getFunctionDefinition() {

Set funcSet = new HashSet<>();

FunctionDTO funcDTO = new FunctionDTO();

funcDTO.setCustomType(FunctionTypeEnum.Custom);

funcDTO.setFunctionClass("com.yonyou.iuap.formula.engine.formulaset.CustomFunction");

funcDTO.setFunctionName("nanergy");//调用公式

funcDTO.setMethodName("def("nanergy",,,)");//定义公式在编辑器中的显示名称

MultiLangText description = new MultiLangText();

description.addText(MultiLangEnum.CN,"nanergy函数");

description.addText(MultiLangEnum.US,"nanergy function");

description.addText(MultiLangEnum.TW,"nanergy 函數");

funcDTO.setDescription(description);

funcSet.add(funcDTO);

return funcSet;

}

公式串多语翻译

注意：此功能依赖多语运行时组件，领域需提前接入多语运行时，查询多语时会调用MessageUtils.getMessage(resid)

可以调用以下api实现基于某个实体将公式编码翻译成多语表达式

类：com.yonyou.iuap.formula.service.FormulaService

方法：String translateFormula(String formula,String uri)

参数：formula公式串，元数据uri

示例：

@Test

public void testTranslateFormula() {

InvocationInfoProxy.setTenantid("slpeio66");

InvocationInfoProxy.setLocale("en_US");

String formula = "getID('entity','name','b9414d76-90cc-42e1-8b7d-68daf2e08664')+countryId.id"; //componentId 4f570ea3-ad9c-45a2-b9bc-d1012fdc1e03

String s = formulaService.translateFormula(formula, "international.model.GlobalSet");

System.out.println("s ==================== " + s);

}

开放接口说明
api接口
执行公式

接口：com.yonyou.iuap.formula.service.FormulaService

方法：FormulaExcuteResultDTO executeFormula(FormulaExcuteDTO formulaExcuteDTO)

参数FormulaExcuteDTO结构如下:

/**

公式表达式

*/

private String formulaExpression;

/**

公式计算需要的数据 Map格式，子表是 List

*/

private Map<String,Object> paramValue;

返回值FormulaExcuteResultDTO

/**

公式表达式

*/

private String formulaExpression;

/**

执行成功标志

*/

private Boolean isSuccess = true;

/**

公式执行结果

*/

private Object excuteResult;

/**

错误信息

*/

private String errorMessage = "";

批量执行公式计算

接口：com.yonyou.iuap.formula.service.FormulaService

方法：List batchExecuteFormula(List formulaExcuteDTOList);

参数以及返回结果参考6.1.1节

校验公式

接口：com.yonyou.iuap.formula.service.FormulaService

方法：FormulaValidateResultDTO validateFormula(FormulaValidateDTO formulaValidateDTO)

参数FormulaValidateDTO结构如下:

/**

公式表达式

*/

private String formulaExpression;

返回值FormulaValidateResultDTO结构如下：

/**

公式表达式

*/

private String formulaExpression;

/**

校验成功标志

*/

private Boolean isSuccess = true;

/**

错误信息

*/

private String errorMessage = "";

批量校验公式

接口：com.yonyou.iuap.formula.service.FormulaService

方法：List batchValidateFormula(List formulaValidateDTOList)

参数以及返回结果参考6.1.3

前端api
组件传参定义

| locale(新) | 语种信息| serviceName(新) | 应用名(上线文路径,可带域名)

| iMaxLength(新) | 确认时最大值控制

| disableDrag(新) | 禁用拖拽(防止拖拽事件冲突)

| uiMode | 是否以 UI 组件形式提供(min 提供较小的面板)

| useBusiness(新) | 是否使用业务对象 | Boolean | false || onChange(新) | 是UI组件实时数据变化

| leftPannel | 左侧面板项 | rightPannel | 右侧面板项

| disabled | 禁用

| confirm | 确认回掉

| formula | 公式表达式

| formuladisplay | 公式显示式

| autoCalc | 自动计算

| contextData | 上下文变量(新增对树支持 节点需children属性节点可增加disabld属性)

| paramList | 自定计算时变量值(需autoCalc) 支持提供前端函数| requestParams(新增) | 提供请求时参数

| onFocus\onBlur(新增) | input框事件

| onTextFocus\onTextBlur(新增) | textarea框事件| beforeVerify(新增) | 校验前调整参数(26加方法)

| funcFilter(新增) | 前端函数过滤(字符串数组 | 正则对象 | 正则字符串) || refEnv | 参照对应环境地址(不传感知 url) | verifyBeforeConfirm | 保存前校验| leftDefaultOpenKey | 左侧默认展开

|rightDefaultOpenKey | 右侧默认展开

| inputOpen | 点击 input 弹窗

| beforeOpenHook | 打开公式弹窗前 hook 函数

| allowEmpty | 校验支持空值| className, mask, destory 等 | 支持 modal 参数与 class 名| CompatibleMode | 是否做格式兼容

|customShowFn | 自定义变量显示值 | showMetaCode | 是否显示属性编码 | extend | 自定义模块| multiBillNo | 是否多单据

组件解析方法

import { core } from 'yyuap-formula'

//接受 表达式串(组) 生成 包含 公式数据结构

core.parse()

//异步请求 接受公式参数 与 表达式串(组) 生成 包含 公式、翻译公式、含数据的数据结构 的对象(对象数组))

core.ajaxToParse()

//前端校验 参数为confirm、onChange参数中获得的 formulaList 或 对公式表达式做解析(功能1)

core.validate()

//前端异步校验 参数为confirm、onChange参数中获得的 formulaList 与 expressList

core.validateAsync ()

//异步校验 参数为confirm、onChange参数中获得的 formulaList 与 expressList

core.getFormulaInfo ()

//公式计算 参数1:confirm、onChange参数中获得的 formulaList 或 core.parse的返回值 参数2: paramList 见项目配置项

core.calculate()