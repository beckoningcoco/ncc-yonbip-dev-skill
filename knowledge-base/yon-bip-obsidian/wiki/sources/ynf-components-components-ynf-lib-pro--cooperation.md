---
title: "协作助手 Cooperation"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-pro--cooperation"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 协作助手 Cooperation

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-pro--cooperation | 所属：YNF-组件

# [](#协作助手-cooperation)协作助手 Cooperation

填写组件描述

import { Cooperation } from "ynf-lib-pro"

## [](#何时使用)何时使用

填写使用场景

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||单据Id||objectId||string||单据Id||-|||
||调用方应用code||objectName||string||必须先申请注册后方能使用, [https://gfwiki.yyrd.com/pages/viewpage.action?pageId=33079345](https://gfwiki.yyrd.com/pages/viewpage.action?pageId=33079345)||-|||
||相关人员友互通ID||idList||array||相关人员友互通ID||-|||
||单据名称||coBillName||string||单据名称||-|||
||通知点击跳转地址||webUrl||string||通知点击跳转地址||-|||
||单据编号||docCode||string||单据编号||-|||
||评论通知内容||notice||string||评论通知内容||-|||
||IM扩展字段||extend||string||IM扩展字段||-|||
||是否发送im消息||sendMessage||boolean||false的情况点击群聊优先打开pc端||true|||
||单据相关人员||relatedPersons||Json||单据相关人员||[{"name":"赵四","yhtUserId":"26f233e9-fccf-4bf5-960f-dbc1a167e634","avatar":"[https://tse1-mm.cn.bing.net/th/id/OIP-C.1ChedSsZH_Uw30w2BhWAmQHaHa?pid=ImgDet&rs=1","isDirector":true,"isInner":true,"phone":"18994919191","role":"项目秘书项目秘书项目秘书项目秘书项目秘书项目秘书项目秘书","company":"用友集团123"},{"name":"张三","yhtUserId":"1838579e-6b2a-40e0-8c36-9d64817ba53c","avatar":"https://tse1-mm.cn.bing.net/th/id/OIP-C.6n1yJHH7kwAmbxMeywTBRgHaHa?pid=ImgDet&rs=1","isInner":true,"phone":"18994919191","company":"用友集团"},{"name":"李武","yhtUserId":"","avatar":"https://pic2.zhimg.com/v2-4ce49ecd42054e1db4a5b0df31604cfe_r.jpg?source=1940ef5c","isInner":false,"phone":"18994919191","role":"项目秘书"},{"name":"马八","yhtUserId":"11d6dd77-dde4-445b-bf33-927e452bdc3e","avatar":"","isInner":false,"phone":"18994919191","role":"项目秘书","company":"用友集团"},{"name":"王麻子","yhtUserId":"","avatar":"","isInner":false,"phone":"18994919191","role":"项目秘书","company":"用友集团","email":"11@11.com](https://tse1-mm.cn.bing.net/th/id/OIP-C.1ChedSsZH_Uw30w2BhWAmQHaHa?pid=ImgDet&rs=1%22,%22isDirector%22:true,%22isInner%22:true,%22phone%22:%2218994919191%22,%22role%22:%22%E9%A1%B9%E7%9B%AE%E7%A7%98%E4%B9%A6%E9%A1%B9%E7%9B%AE%E7%A7%98%E4%B9%A6%E9%A1%B9%E7%9B%AE%E7%A7%98%E4%B9%A6%E9%A1%B9%E7%9B%AE%E7%A7%98%E4%B9%A6%E9%A1%B9%E7%9B%AE%E7%A7%98%E4%B9%A6%E9%A1%B9%E7%9B%AE%E7%A7%98%E4%B9%A6%E9%A1%B9%E7%9B%AE%E7%A7%98%E4%B9%A6%22,%22company%22:%22%E7%94%A8%E5%8F%8B%E9%9B%86%E5%9B%A2123%22%7D,%7B%22name%22:%22%E5%BC%A0%E4%B8%89%22,%22yhtUserId%22:%221838579e-6b2a-40e0-8c36-9d64817ba53c%22,%22avatar%22:%22https://tse1-mm.cn.bing.net/th/id/OIP-C.6n1yJHH7kwAmbxMeywTBRgHaHa?pid=ImgDet&rs=1%22,%22isInner%22:true,%22phone%22:%2218994919191%22,%22company%22:%22%E7%94%A8%E5%8F%8B%E9%9B%86%E5%9B%A2%22%7D,%7B%22name%22:%22%E6%9D%8E%E6%AD%A6%22,%22yhtUserId%22:%22%22,%22avatar%22:%22https://pic2.zhimg.com/v2-4ce49ecd42054e1db4a5b0df31604cfe_r.jpg?source=1940ef5c%22,%22isInner%22:false,%22phone%22:%2218994919191%22,%22role%22:%22%E9%A1%B9%E7%9B%AE%E7%A7%98%E4%B9%A6%22%7D,%7B%22name%22:%22%E9%A9%AC%E5%85%AB%22,%22yhtUserId%22:%2211d6dd77-dde4-445b-bf33-927e452bdc3e%22,%22avatar%22:%22%22,%22isInner%22:false,%22phone%22:%2218994919191%22,%22role%22:%22%E9%A1%B9%E7%9B%AE%E7%A7%98%E4%B9%A6%22,%22company%22:%22%E7%94%A8%E5%8F%8B%E9%9B%86%E5%9B%A2%22%7D,%7B%22name%22:%22%E7%8E%8B%E9%BA%BB%E5%AD%90%22,%22yhtUserId%22:%22%22,%22avatar%22:%22%22,%22isInner%22:false,%22phone%22:%2218994919191%22,%22role%22:%22%E9%A1%B9%E7%9B%AE%E7%A7%98%E4%B9%A6%22,%22company%22:%22%E7%94%A8%E5%8F%8B%E9%9B%86%E5%9B%A2%22,%22email%22:%2211@11.com)"}]|||
||选择成员参数||selectMemberParams||Json||新选人组件所有参数通过此字段透传, 具体参考[https://package.yonyoucloud.com/package/detail/@yonyou/youzone-select-member](https://package.yonyoucloud.com/package/detail/@yonyou/youzone-select-member)||{"enableSelectAll":true,"customTabs":[{"title":"成员测试","key":"list1234","type":"member","data":[{"yhtUserId":"11d6dd77-dde4-445b-bf33-927e452bdc3e","userName":"王敬能","deptId":"1484654513752113152","deptName":"研发部","avatar":"","duty":""}]}]}|||
||显示任务模块||showTask||boolean||显示任务模块||true|||
||显示协作流程模块||showCooperationFlow||boolean||显示协作流程模块||true|||
||显示最近联系人||showRecentContact||boolean||显示最近联系人||true|||
||显示相关人员||showRelatedPeople||boolean||显示相关人员||true|||
||默认是否展开任务||expandTask||boolean||默认是否展开任务||false|||
||默认是否展开协作流程||expandCooperationFlow||boolean||默认是否展开协作流程||false|||
||默认是否展开相关人员||expandRelatedPeople||boolean||默认是否展开相关人员||true|||
||add模式下不显示助手的具体功能||mode||string||add模式下不显示助手的具体功能||-|||
||extraParams参数配置||extraParams||Json||extraParams参数配置||{"apiHost":"[https://bip-daily.yonyoucloud.com","authId":"ybbase","fromDevice":"web"}](https://bip-daily.yonyoucloud.com%22,%22authId%22:%22ybbase%22,%22fromDevice%22:%22web%22%7D)|||
||注册按钮类型||workbenchRightSidebarType||string||必传, businessAssistant为业务洞察, 要保证唯⼀||-|||
||边栏按钮是否选中||selectWorkbenchRightSidebar||boolean||⾮必传, 控制⼯作台右侧边栏按钮是否选中||-|||
||⼯作台右侧边栏按钮图标||workbenchRightSidebarIcon||string||⾃定义必传（没有在⼯作台报备）, ⼯作台右侧边栏按钮图标||-|||