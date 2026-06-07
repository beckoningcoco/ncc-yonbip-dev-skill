---
title: "级联选择 Cascader"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base-mobile--cascader"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 级联选择 Cascader

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base-mobile--cascader | 所属：YNF-组件

# [](#级联选择-cascader)级联选择 Cascader

填写组件描述

import { Cascader } from "ynf-lib-base-mobile"

## [](#何时使用)何时使用

填写使用场景

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||数据源||dataSource||object||数据源||[{"label":"浙江","label_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC04880808","value":"浙江","value_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC04880808","children":[{"label":"杭州","label_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC0488080A","value":"杭州","value_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC0488080A","children":[{"label":"西湖区","label_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC0488080C","value":"西湖区","value_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC0488080C"},{"label":"上城区","label_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC0488080E","value":"上城区","value_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC0488080E"},{"label":"余杭区","label_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC0488080F","value":"余杭区","value_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC0488080F","disabled":true}]},{"label":"温州","label_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC04880812","value":"温州","value_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC04880812","children":[{"label":"鹿城区","label_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC04880813","value":"鹿城区","value_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC04880813"},{"label":"龙湾区","label_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC04880814","value":"龙湾区","value_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC04880814"},{"label":"瓯海区","label_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC04880816","value":"瓯海区","value_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC04880816"}]},{"label":"宁波","label_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC04880817","value":"宁波","value_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC04880817","children":[{"label":"海曙区","label_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC04880818","value":"海曙区","value_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC04880818"},{"label":"江北区","label_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC04880819","value":"江北区","value_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC04880819"},{"label":"镇海区","label_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC0488081B","value":"镇海区","value_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC0488081B"}]}]},{"label":"安徽","label_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC0488081D","value":"安徽","value_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC0488081D","children":[{"label":"合肥","label_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC0488081F","value":"合肥","value_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC0488081F","children":[{"label":"包河区","label_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC04880820","value":"包河区","value_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC04880820"},{"label":"蜀山区","label_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC04880823","value":"蜀山区","value_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC04880823"},{"label":"瑶海区","label_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC04880825","value":"瑶海区","value_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC04880825"}]},{"label":"芜湖","label_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC04880827","value":"芜湖","value_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC04880827","children":[{"label":"镜湖区","label_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC04880828","value":"镜湖区","value_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC04880828"},{"label":"弋江区","label_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC0488082A","value":"弋江区","value_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC0488082A"},{"label":"湾沚区","label_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC0488082B","value":"湾沚区","value_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC0488082B"}]}]},{"label":"江苏","label_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC0488082E","value":"江苏","value_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC0488082E","children":[{"label":"南京","label_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC0488082F","value":"南京","value_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC0488082F","children":[{"label":"玄武区","label_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC04880804","value":"玄武区","value_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC04880804"},{"label":"秦淮区","label_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC04880805","value":"秦淮区","value_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC04880805"},{"label":"建邺区","label_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC04880806","value":"建邺区","value_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC04880806"}]},{"label":"苏州","label_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC04880807","value":"苏州","value_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC04880807","children":[{"label":"虎丘区","label_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC04880809","value":"虎丘区","value_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC04880809"},{"label":"吴中区","label_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC0488080B","value":"吴中区","value_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC0488080B"},{"label":"相城区","label_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC0488080D","value":"相城区","value_resid":"UID:P_LIB-MOBILE-YNF-FE_1BEB37FC0488080D"}]}]}]|||
||清除按钮||showClose||boolean||清除按钮||true|||