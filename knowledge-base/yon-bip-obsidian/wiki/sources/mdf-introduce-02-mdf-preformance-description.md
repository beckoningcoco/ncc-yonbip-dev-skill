---
title: "性能问题排查指南"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/02-mdf-preformance-description"
section: "介绍"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 介绍]
platform_version: "BIP V5"
source_type: mdf-docs
images: 11
---

# 性能问题排查指南

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/02-mdf-preformance-description | 所属：介绍

# [](#性能问题排查指南)性能问题排查指南

**背景：** 遇到性能问题，可以从资源加载、渲染逻辑、内存泄露和业务逻辑等方面进行排查，以下优化指导针对使用MDF开发的领域服务。

**阅读对象：** 领域开发、实施及客开工程师

## [](#1-资源加载优化)1. 资源加载优化

### [](#11-使用analyzer分析资源)1.1. 使用Analyzer分析资源

- 在前端脚手架的package.json文件中的构建命令中添加ANALYZE参数，如：

"build:extend": "cross-env BABEL_ENV=production NODE_ENV=production ANALYZE=true ZIP=true MDF_LANG=true node --max-old-space-size=4096 node_modules/webpack/bin/webpack.js --config webpack.config.js --progress && echo '前端扩展：编译完成'",

- 执行 npm run build:extend 命令
- 根据webpack-bundle-analyzer输出分析打包内容是否必要，如下：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/xingnengwentipaichazhinan1.24d6ab98.png)

### [](#12-图片压缩)1.2. 图片压缩

检查项目中是否使用了大图片，如果有使用压缩工具压缩成小图片

### [](#13-按需加载三方包)1.3. 按需加载三方包

框架已暴漏的三方包：《[按需加载三方包](#/api/05-three-package)》

### [](#14-组件按需加载)1.4. 组件按需加载

针对大个体组件按需加载，方法自行百度

### [](#15-开启http20)1.5. 开启HTTP2.0

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/xingnengwentipaichazhinan2.6603237a.png)

### [](#16-避免单个资源过大)1.6. 避免单个资源过大

检查单个js文件是否有超过1M，cpu低的电脑影响大，加载执行慢

### [](#17-与三方系统集成)1.7. 与三方系统集成

与三方系统集成时，可以通过以下方式提前加载资源，以提高速度，参考：《[与第三方系统集成](#/spec/05-other-system-integration)》

## [](#2-接口耗时优化)2. 接口耗时优化

### [](#21-使用network面板)2.1. 使用Network面板

正常情况下接口耗时在500ms以上需要介入分析

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/xingnengwentipaichazhinan3.27ebc443.png)

- 关注耗时超过500ms的接口
- 关注接口并行度，如：非首次meta和detail接口应该是并行的
- 关注接口缓存，如：工作台模式下列表进详情非首次getTplId、meta、loadExtend接口不应该调用；代办进详情非首次generateADT不应该调用
- 关注接口请求体和返回值大小，正常情况下上行大于2M，下行大于5M需要介入分析是否可优化

### [](#22-接口转发)2.2. 接口转发

复制耗时较长接口的cURL，导入到Postman中，在url上添加debugNode=true参数，可以查看接口转发路径和耗时

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/xingnengwentipaichazhinan4.10eaa2b7.png)

### [](#23-其它思路)2.3. 其它思路

- 非必需接口缓存、后台线程处理
- 同步请求异步化（避免同步调用接口）
- 按需调用 getOptionValue: 不要全局调用，尽量使用批量方法getOptionValues
- 其它问题请使用 哈勃 录制性能报告，分析优化接口及SQL效率

## [](#3-渲染逻辑优化)3. 渲染逻辑优化

### [](#31-使用performance面板)3.1. 使用Performance面板

**适用场景：**

- 页面打开效率问题
- 操作卡顿

**操作步骤：**

1、F12打开谷歌浏览器开发者工具devtool，切换到Performance面板。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/xingnengwentipaichazhinan5.b22e8072.png)

2、点击录制按钮，等待开始计时再操作页面，操作结束后点击stop结束录制。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/xingnengwentipaichazhinan6.f8f3de83.png)

3、查看录制信息

**主要线索:**

1、镜像区

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/xingnengwentipaichazhinan7.b27563e3.png)

2、网络

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/xingnengwentipaichazhinan8.a8b47c0a.png)

3、火焰图

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/xingnengwentipaichazhinan9.e4f42a0d.png)

4、内存
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/xingnengwentipaichazhinan10.7da8ed01.png)

## [](#4-内存泄露优化)4. 内存泄露优化

### [](#41-使用memory面板)4.1. 使用Memory面板

参考文档：《[MDF内存泄漏优化记录](#/introduce/02-mdf-memory-optimize#4-%E5%86%85%E5%AD%98%E6%B3%84%E6%BC%8F%E6%8E%92%E6%9F%A5%E6%96%B9%E6%B3%95)》

## [](#5-业务逻辑优化)5. 业务逻辑优化

### [](#51-逻辑批量化)5.1. 逻辑批量化

扩展逻辑应尽量批量化处理

### [](#52-大数据量表格缓加载)5.2. 大数据量表格缓加载

#### [](#521-子表)5.2.1. 子表

缓加载和分页

||配置||作用||备注|
||lazyLoadPage||详情子表延迟加载数据（懒加载）||无感知增加接口调用次数，UI层无单独处理，并非支持了分页功能 后端适配文档：《MDD》 《YPD》|
||lazyLoadByPage||详情子表延迟加载数据（分页）||子表懒加载，支持分页功能，需要和lazyLoadPage开关一起使用，只能用作数据展示场景使用，有批量操作场景时不能使用|

子表数据懒加载开启的前提是需要开启前端特性开关lazyLoadPage，并且配置需要懒加载的子表的detailByPage属性，具体配置参考后端适配文档[《MDD框架适配文档》](https://gfwiki.yyrd.com/pages/viewpage.action?pageId=42392557)、[《YPD框架适配文档》](https://gfwiki.yyrd.com/pages/viewpage.action?pageId=7511432)，`开启lazyLoadPage后，进入详情会发起两次detail接口`，第一次接口返回正常的数据以及50条子表数据，`第二次detail接口返回子表的key及对应的数据的总数量`（这里需要注意，如果返回结构不对，则不会发起后续的流程），`在两次detail均正确返回后，会根据懒加载子表的数据的总数量发起N个detailByPage请求`，在所有detailByPage请求均正常返回后进行一次页面的重新渲染。此时整个子表延迟加载的功能流程完毕。在特殊场景下，因以上懒加载场景也是通过对数据延迟加载的方式减少首屏打开时间，但最终数据均会返回端上，如详情页数据量巨量，可能会造成页面反应慢的情况发生，`此时如果当前详情页面对数据无批量操作需求（慎重！！！确保此页面发起的所有请求后端不使用子表数据），`可以额外开启另一个前端特性lazyLoadByPage，对接口detailByPage请求再次进行按需延迟处理，开启后子表会出现分页，当对分页切换的时候才会调用detailByPage接口请求后续的数据。

**上文提到的配置项说明：**

- lazyLoadPage 子表懒加载特性开关，在MDF配置中心配置对应的domainKey
- detailByPage 表格组件属性，在表格组件的cExtProps中配置
- lazyLoadByPage 子表分页特性开关，在MDF配置中心配置对应的domainKey **`（慎重！！！确保此页面发起的所有请求后端不使用子表数据）`**

即：如果需要子表懒加载，则配置lazyLoadPage和detailByPage这2个配置项；如果需要子表分页，则上面3个配置项都要配

**启用原则：**

- 优先从设计层面屏蔽子表数据量过大，如：通过延后加载或手动点击二次查询等方式避免
- 子表数据大小2万条，小于2万应从代码层面优化，不要启用
- 业务逻辑中有使用子表数据的单据不允许启用子表分页

#### [](#522-树)5.2.2. **树**

**《[懒加载树适配](#/components-web/04-lanjiazaishushipei)》**

### [](#53-开启性能优化开关)5.3. 开启性能优化开关

#### [](#531-查看现有配置)5.3.1. 查看现有配置

检查domainKey配置的特性是否开启了以下和性能有关的特性开关，可通过《[MDF谷歌调试插件](#/introduce/02-chrome-debug-plugin)》查看现有配置项

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/xingnengwentipaichazhinan11.19d8c974.png)

更多配置和配置方式查看《[MDF服务配置项说明](#/node/02-config-item-desc)》和《[项目级配置文件（旧）](#/node/03-config-file)》

#### [](#532-需要开启的配置)5.3.2. 需要开启的配置

应该要开启的特性开关和Env开关如下：

**Features特性开关：**

- forbidCallingCmdList   不调用getbillcommands接口
- queryLoginUser    调用getLoginUser接口，优化可去掉
- getTplIdFirst    4代UI模板，计算模板ID
- newBillMeta     后端调用getfebill，不再调用getbill
- metaClientCache    开启UI模板前端缓存 
- asyncBatchOutput    异步批量导出
- reactBatchUpdate     批量更新页面状态（需要严格验证）
- performance     部分接口优化参数（add、detail、meta等接口）
- lazyLoadToolbar    按钮延后渲染
- loadDataAdvance    渲染优化，提前计算数据和状态（需要严格验证）
- lazyLoadPage   子表数据懒加载（子表数据量大时建议开启，需要后端适配）
- banSaveRefresh    禁用保存后刷新页面
- saveDirtyData    无数据修改时不调用接口
- carryCheckEmptyData    check接口忽略无关行数据
- asyncSave    异步保存

**Env开关：**

- batchCheckChunkNum: 30    开启批量check的阀值
- asyncSaveSubTabNum: 500    开启异步保存的阀值

### [](#54-重复触发事件)5.4. 重复触发事件

- 重复触发afterCellValueChanage，批量操作不执行重复逻辑
- 重复触发beforeCellCheck、afterCellCheck，收窄作用范围（判断有孙表、有数据、批量操作时）
- 避免多次循环
- 多个方法使用同一逻辑，考虑合并   

### [](#55-afterloaddata常见问题)5.5. afterLoadData常见问题

- 避免调用同步接口，如果必须调用，在使用时调用，如getOptionValue
- 避免过多调用耗时函数，如: getRows()、getData()，应使用getRealData()代替 **（问题重灾区）**
- 与数据无关的按钮状态设置放在后端bill_status操作按钮状态
- setColumnsState是否可以异步处理

### [](#56-aftercellcheckaftersetdatasource常见问题)5.6. afterCellCheck、afterSetDataSource常见问题

- afterCelICheck中尽量只处理本行相关内容,cellcheck是行级别的
- afterCelICheck中尽量避免使用getRows()
- 计算等操作可以放到beforeSetDataSource里面，防止重新渲染beforeSetDataSource

### [](#57-setcellstatesetcellvaluesetcolumnstate常见问题)5.7. setCellState、setCellValue、setColumnState常见问题

- setCellState、setCellValue、setColumnState 替换成 setCellStates、updateRows、setCellValues、setColumnStates  **（问题重灾区）**
- setCelIValue的第四的参数为true (表示触发check) 要结合实际情况选择优化 

### [](#58-getrows常见问题)5.8. getRows常见问题

- 避免频繁的调用getRows
- 获取表格行长度使用getRowsCount()，不应该用getRows().length  **（问题重灾区）**

### [](#59-表格方法性能对比)5.9. 表格方法性能对比

- getData()：获取所有数据(dataSource)，setDirty(true)时，和getDirtyData()取值是相同的，可能和页面的数据不一致，删除的数据也会获取到；会有状态值字段_status
- getAllData()：获取页面上所显示(筛选排序后)的数据，没有状态值字段，不建议使用，即将废弃
- getRows()：获取所有数据，不包含删除的数据（排序后，筛选前），如果传参false则获取的是所有(筛选排序前dataSource不包括删除的数据)的数据
- getRow(index): 获取所有数据中的某一行数据（排序后，筛选前）
- getEffeData()：深拷贝，获取dataSource中的数据，不包含删除的数据；
- getRealData()：浅拷贝；获取dataSource中的数据，不包含删除的数据；
- getRealRows()：浅拷贝，获取所有数据，不包含删除的数据（排序后，筛选前）；

||方法名||作用||实现方式||性能||使用场景|
||getData()||获取所有数据(dataSource)，包含删除的数据||深拷贝||低||参与界面展示的场景，如：显示到表格中、推拉单显示到上下游表格中等|
||getRows()||获取所有数据(rows)，不包含删除的数据（排序后，筛选前）||深拷贝||低||参与界面展示的场景，如：显示到表格中、推拉单显示到上下游表格中等|
||getRealRows()||获取所有数据(rows)，不包含删除的数据（排序后，筛选前）||浅拷贝||高||不参与界面展示的场景，如：获取数量，循环条件，前端计算等|
||getEffeData()||获取所有数据(dataSource)，不包含删除的数据（排序前，筛选前）||深拷贝||低||参与界面展示的场景，如：显示到表格中、推拉单显示到上下游表格中等|
||getRealData()||获取所有数据(dataSource)，不包含删除的数据（排序前，筛选前）||浅拷贝||高||不参与界面展示的场景，如：获取数量，循环条件，前端计算等|
||getRealViewRows()||获取界面显示的数据(排序后，筛选后)||浅拷贝||高||不参与界面展示的场景，如：获取数量，循环条件，前端计算等|

### [](#510-禁用方法)5.10. 禁用方法

- viewmodel._data等以_开头的为框架内部变量，业务不要使用
- cb.rest.DynamicProxy.create 禁用，应该使用viewmodel.setProxy方法
- cb.rest.ajax 禁用，应该使用 viewmodel.setProxy方法

### [](#511-写代码思考)5.11. 写代码思考

- 考虑大数据量的时候，脚本写法是否存在性能问题
- 是否会存在多次重复渲染的情况
- 是否多次调用MDF相同的Model的方法
- 是否同步方案可以优化为异步方案
- 多次触发check，check是否合理，多次check是否可以处理成一次check
- 批量操作是否需要触发此段脚本，能否控制操作数据范围 

## [](#6-相关资料)6. 相关资料

《[MDF框架实施手册](#/introduce/02-mdf-framework-use-description)》