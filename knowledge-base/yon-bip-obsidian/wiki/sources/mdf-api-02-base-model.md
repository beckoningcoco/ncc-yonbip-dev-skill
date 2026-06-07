---
title: "基础模型 BaseModel"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/02-base-model"
section: "API"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, API]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 基础模型 BaseModel

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/02-base-model | 所属：API

# [](#基础模型-basemodel)基础模型 BaseModel

## [](#1-前言)1. 前言

MDF所有模型均继承于BaseModel，即BaseModel内方法可以在所有模型上调用

## [](#2-基本设计)2. 基本设计

- 所有的 ViewModel 对象都是通过构造函数加原型的方式创建的一个类，通过对象实例化的方式进行调用
- BaseModel 是所有 ViewModel 的一个基类，其作用相当于是js中的基类Object对象，其他的 ViewModel 对象会继承该基类并使用相关的api。
- BaseModel 一般不会在外部被开发者使用，除非要 register 一个新的 ViewModel的时候。

cb.models.register('BaseModel', function (modelType) {

 // BaseModel 构造函数

 var model = function (data) {

 var propertyNames = [];

 if (data)

 for (var propertyName in data)

 propertyNames.push(propertyName);

 // _data 是基类维护的数据对象

 // _get_data、_set_data、_del_data、_cls_data

 // 均是对_data的数据获取项、设置项、删除项、清空全部等操作

 var _data = cb.utils.extend({}, { listeners: [], propertyNames: propertyNames, events: {}, cache: {} }, data);

 

 this._get_data = function (key) {

 if (!key) return;

 return _data[key];

 };

 

 this._set_data = function (key, value, update) { };

 this._del_data = function (key) { };

 this._cls_data = function () { };

 };

 // BaseModel 原型属性

 model.prototype.modelType = modelType;

 // BaseModel 原型方法

 model.prototype.getData = function () { };

 // BaseModel 原型方法

 model.prototype.setState = function (name, value, ctrlName) { };

 ...

}

BaseModel 内部实现可以分三个纬度来深度了解：

- 一个是对象内维护的数据源
_data，其他的公共方法和事件都是围绕这个data展开的；
- 第二个纬度就是公共api，包含对数据的增删改查等操作；
- 第三个就是事件机制，通过给数据进行事件的绑定和监听事件数据的动态管理。

## [](#3-作用)3. 作用

比如注册 ReportModel 这个 ViewModel 类，ReportModel
将在构造函数和原型两个维度继承 BaseModel

cb.models.register('ReportModel', function (modelType) { 

 var model = function (data) { 

 cb.models.BaseModel.call(this, data); 

 }; 

 model.prototype = cb.utils.getPrototype(cb.models.BaseModel.prototype); 

}

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/BaseModeljichumoxingimage1.f25d9a01.png)

### [](#31-对数据的管理)3.1. 对数据的管理

||属性名称||type||示例||说明|
||listeners||array||[]|||
||propertyNames||array||["cItemName,"iStyle", "needClear"]|||
||events||object||{}||事件队列，其中每个key都是数组。events[name] = []|
||cache||object||{}||缓存池，将挂载不同ViewModel的cache字段，如vm|
||isDirty||boolean||true||标志位：是否脏数据|
||originalData||boolean||false||标志位：是否远程数据|
||readOnly|||||||
||proxy|||||||
||cDefaultValue|||||||
||value||||||SimpleModel 中的 setValue 方法将会对 value 设值。|
||disabled|||||||
||visible|||||||
||checkMsg|||||||
||checking|||||||
||cShowCaption||string||"批量操作"|||
||cCommand||string||"cmdBatchOp"|||
||cControlType||string||"dropdownbutton"|||
||key|||||||
||treeFilter|||||||
||condition|||||||

### [](#32-对事件的管理)3.2. 对事件的管理

||API名称||使用||说明|
||addListener|||||
||removeListener|||||
||fireEvent|||||
||notifyListener|||||
||doPropertyChange||viewmodel.doPropertyChange(name, value, ctrlName)||name 为 'setDisabled'、"setState"等 API 名称，|
||on|||||
||un|||||
||hasEvent||viewmodel.hasEvent(name)||判断 _data.events 事件队列中是否有某个事件|
||execute||viewmodel.execute(name)||var events = this._get_data('events')[name];.... events.forEach()|
||promiseExecute|||||

### [](#33-对状态的管理)3.3. 对状态的管理

||API名称||使用||说明|
||_get_data|||||
||_set_data||viewmodel.setState(name, value, update)||往_data对象上新增属性值。其中update 为布尔值，true的时候会同时将该属性值新增到data.propertyNames 数组中|
||_del_data|||||
||_cls_data|||||
||get||||和 _get_data 一致|
||setState|||||
||getData||viewmodel.getData()||执行的_get_data('value')，没看到具体用处|
||setParent|||||
||getParent|||||
||setName|||||
||getName|||||
||setDirty|||||
||getDirtyData|||||
||getData|||||
||setState|||||
||getState|||||
||setProxy|||||
||getProxy|||||
||setReadOnly|||||
||getReadOnly|||||
||setDisabled|||||
||getDisabled|||||
||setVisible|||||
||getVisible|||||
||setChecking|||||
||setCheckMsg|||||
||validate|||||
||setCache||viewmodel.setCache(key, value)||从 _data.cache缓存池设值|
||getCache||viewmodel.getCache(key)||从 _data.cache缓存池取数|
||clearCache||viewmodel.clearCache(key)||从 _data.cache缓存池中delete某条数据|
||runGC||viewmodel.runGC()||其实就是将 _data = null|

### [](#34-建立双向绑定机制)3.4. 建立双向绑定机制

无

## [](#4-方法)4. 方法

### [](#41-setparentparent)4.1. setParent(parent)

**说明：** 将父模型缓存到当前模型上

**入参：**

- parent: 想要缓存的父模型

**返回值：**

- 无

**示例：**

model.setParent(parent) // 实现源码为this.setCache('parent', parent)

### [](#42-getparent)4.2. getParent()

**说明：** 获取当前模型上缓存的父模型

**入参：**

- 无

**返回值：**

- parentModel: 父模型

**示例：**

const parentModel = model.getParent()

### [](#43-getrootparent)4.3. getRootParent()

**说明：** 获取根模型

**入参：**

- 无

**返回值：**

- rootModel: 根模型

**示例：**

const rootModel = model.getRootParent() // 从当前模型找父模型，再找父模型的父模型一直找到最后一层的父模型

### [](#44-setnamename)4.4. setName(name)

**说明：** 在model上设置一个name

**入参：**

- name：想要设置的name值

**返回值：**

- 无

**示例：**

model.setName(name) // 源码实现为 this.setCache('name', name);

### [](#45-getname)4.5. getName()

**说明：** 获取model上设置的name

**入参：**

- 无

**返回值：**

- name：想要设置的name值

**示例：**

const name = model.getName() // 源码实现为 this.getCache('name');

### [](#46-getdomainkey)4.6. getDomainKey()

**说明：** 获取model上domainKey属性的值

**入参：**

- 无

**返回值：**

- domainKey：前端编码

**示例：**

const domainKey = model.getDomainKey()

### [](#47-setdomainkeydomainkey)4.7. setDomainKey(domainKey)

**说明：** 设置model上domainKey属性的值

**入参：**

- domainKey: domainKey的值

**返回值：**

- 无

**示例：**

model.setDomainKey(domainKey)

### [](#48-hasfeaturefeature)4.8. hasFeature(feature)

**说明：** 判断一个单据是否开启某特征

**入参：**

- feature: 特征名称

**返回值：**

- isFeature：是否开启某特性

**示例：**

const isFeature = model.hasFeature(feature)

### [](#49-enablefeaturefeature)4.9. enableFeature(feature)

**说明：** 启用某特征

**入参：**

- feature: 特征名称

**返回值：**

- 无

**示例：**

model.enableFeature(feature) // 一般为某一个单据，单独开启一个特征

### [](#410-disablefeaturefeature)4.10. disableFeature(feature)

**说明：** 停用用某特征

**入参：**

- feature: 特征名称

**返回值：**

- 无

**示例：**

model.disableFeature(feature) // 一般为某一个单据，单独停用一个特征

### [](#411-getname)4.11. get(name)

**说明：** 获取当前model属性值

**入参：**

- name: 属性key

**返回值：**

- value：属性值

**示例：**

const value = model.get(name)

### [](#412-setdirtydirty)4.12. setDirty(dirty)

**说明：** 为当前模型设置是否为脏数据

**入参：**

- dirty: 是否脏数据 true or false

**返回值：**

- 无

**示例：**

model.setDirty(dirty)

### [](#413-getdirtydatanecessary)4.13. getDirtyData(necessary)

**说明：** 获取当前模型的脏数据

**入参：**

- necessary: 是否是必要数据

**返回值：**

- dirtyData：获取到的脏数据

**示例：**

const dirtyData = model.getDirtyData(necessary)

### [](#414-getdata)4.14. getData()

**说明：** 获取当前模型value值

**入参：**

- 无

**返回值：**

- dirtyData：获取到的脏数据

**示例：**

const data = model.getData()

### [](#415-setstatename-value-ctrlname)4.15. setState(name, value, ctrlName)

**说明：** 给当前模型绑定的UI组件设置state值

**入参：**

- name: state的key值
- value: state的Value值
- ctrlName: 是否将该state的值设置到当前模型上（true为不设置，false是设置）默认值为false

**返回值：**

- 无

**示例：**

model.setState('visible', false)

### [](#416-getstatename-ctrlname)4.16. getState(name, ctrlName)

**说明：** 获取模型绑定的UI组件state中name的值

**入参：**

- name: state的key值
- ctrlName:是否获取模型上name字段对应的值（true为不获取，false是获取）默认值为false

**返回值：**

- 无

**示例：**

model.getState('visible')

### [](#417-setcheckmsgmsg)4.17. setCheckMsg(msg)

**说明：** 为改模型绑定的UI组件设置错误提示信息

**入参：**

- msg: 提示信息

**返回值：**

- 无

**示例：**

model.setCheckMsg('不能为空')

### [](#418-haseventname)4.18. hasEvent(name)

**说明：** 判断模型上是否注册了事件

**入参：**

- name: 事件名称

**返回值：**

- isEvent：是否注册了某事件

**示例：**

const isEvent = model.hasEvent('beforeValueChange') // 判断模型上是否注册了beforeValueChange事件

### [](#419-setcachekey-value)4.19. setCache(key, value)

**说明：** 在改模型上设置一个缓存

**入参：**

- key: 缓存的key值
- value: 缓存的value值

**返回值：**

- 无

**示例：**

model.setCache('hasInit', true)

### [](#420-getcachekey)4.20. getCache(key)

**说明：** 获取模型上一个缓存值

**入参：**

- key: 缓存的key值

**返回值：**

- cacheValue: 缓存的值

**示例：**

const cacheValue = model.getCache('hasInit')

### [](#421-clearcachekey)4.21. clearCache(key)

**说明：** 清除模型上的缓存值

**入参：**

- key: 需要清除缓存的key值

**返回值：**

- 无

**示例：**

model.clearCache('hasInit')

## [](#5-事件)5. 事件

### [](#51-onname-callback)5.1. on(name, callback)

**说明：** 给模型注册一个事件

**入参：**

- name：事件名称
- callback：事件回调函数

**返回值：**

- 返回true则继续进行value的改变，返回false则终止value的改变

**示例：**

// 示例中data数据由改模型执行事件beforeValueChange时传入的

model.on('beforeValueChange', function (data) { return true; });

### [](#52-unname-callback)5.2. un(name, callback)

**说明：** 将模型中事件卸载

**入参：**

- name：需要卸载的事件名称
- callback：需要卸载指定事件（比如模型中注册了多个click事件，只想卸载其中一个click事件），可以不传

**返回值：**

- 无

**示例：**

model.un('beforeValueChange')

### [](#53-executename-args)5.3. execute(name, ...args)

**说明：** 给模型执行一个同步事件

**入参：**

- name：事件名称
- arg: 执行事件传入的参数

**返回值：**

- 无

**示例：**

model.execute('beforeValueChange', {value:111}); // 代码执行后，模型上注册的beforeValueChange事件的回调函数，即可接收到{value:111}参数

### [](#54-promiseexecuteeventname)5.4. promiseExecute(eventName)

**说明：** 给模型执行一个异步事件

**入参：**

- eventName： 事件名称

**返回值：**

- 无

**示例：**

model.promiseExecute('beforeBrowse', carryParams, function(){} );