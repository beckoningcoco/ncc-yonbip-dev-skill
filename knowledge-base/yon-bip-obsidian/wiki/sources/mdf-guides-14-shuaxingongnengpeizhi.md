---
title: "刷新功能配置"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/14-shuaxingongnengpeizhi"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 刷新功能配置

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/14-shuaxingongnengpeizhi | 所属：指南

# [](#刷新功能配置)刷新功能配置

## [](#1-功能解读)1 功能解读：

       
1.点击刷新后，保留查询条件和表格过滤条件进行刷新，也就是仅刷新当前页的列表数据；
        2. 鼠标悬停会显示上次刷新时间，无刷新记录则不显示。

## [](#2-领域适配方案)2 领域适配方案：

        领域只需要执行脚本流水线将按钮刷到数据库即可。

## [](#3-列表刷新sql脚本参考文档)3 列表刷新sql脚本参考文档

/*

公共按钮下新增

按钮名称： btnDirectSearch

cmd名称： cmdDirectSearch

action: directsearch

icon: xiaoshuaxin

按钮名：刷新当前列表

resid: P_YS_FED_FW_1555933876791541761

 delete from bill_toolbaritem where `billnumber`= 'common_everytenant' and `tenant_id`='0' and `ytenant_id`='0' and `name`='btnDirectSearch' and `command`='cmdDirectSearch';

 delete from bill_command where `billnumber`= 'common_everytenant' and `tenant_id`='0' and `ytenant_id`='0' and `name`='cmdDirectSearch' and `action`='directsearch';

*/

insert into `bill_toolbar` (`id`,`billnumber`,`name`,`ismain`,`parent`,`align`,`subid`,`system`,`orderNum`,`childrenField`,`tplmode`,`cStyle`,`tenant_id`, `ytenant_id`)

select 1535306780963241987,'common_everytenant','commonToolbar',null, null,'top',null,0,0,null,0,'{"type":"common"}','0','0' from DUAL 

where not EXISTS (select 1 from bill_toolbar where `billnumber`= 'common_everytenant' and `tenant_id`='0' and `ytenant_id`='0');

insert into `bill_toolbaritem` (`id`,`billnumber`,`toolbar`,`name`,`command`,`type`,`style`,`text`,`text_resid`,`parameter`,`imgsrc`,`parent`,`order`,`subid`,`system`,`authid`,`authcontrol`,`authname`,`bMerge`,`icon`,`tenant_id`, `ytenant_id`)

select 1535306780963242006,'common_everytenant','commonToolbar','btnDirectSearch','cmdDirectSearch','button',0,'刷新当前列表','P_YS_FED_FW_1555933876791541761',null,null,null,15,'mdd',1,null,0,null,1, 'xiaoshuaxin','0','0'

 where not EXISTS (select 1 from bill_toolbaritem where `billnumber`= 'common_everytenant' and `tenant_id`='0' and `ytenant_id`='0' and `name`='btnDirectSearch' and `command`='cmdDirectSearch');

insert into `bill_command` (`id`,`name`,`action`,`billnumber`,`target`,`ruleid`,`svcurl`,`httpmethod`,`subid`,`system`,`parameter`,`authid`,`tenant_id`, `ytenant_id`)

select 1535306780963242007,'cmdDirectSearch','directsearch','common_everytenant',null,null,null,'POST','mdd',1,null,null,'0','0'

 where not EXISTS (select 1 from bill_command where `billnumber`= 'common_everytenant' and `tenant_id`='0' and `ytenant_id`='0' and `name`='cmdDirectSearch' and `action`='directsearch');

-- 刷新当前列表按钮状态控制

-- 公共脚本验证

-- 浏览

insert into `bill_status_profile` (`id`,`billnumber`, `status`, `item`, `group`, `visible`, `enable`, `subid`, `system`, `pubts`, `tenant_id`, `ytenant_id`)

select 1535306780963242008,'CommonVoucher', 'browse', 'btnDirectSearch', 'toolbaritem', 1, 1, 'mdd', 1, now(), 0, 0 from DUAL

where not EXISTS (select 1 from bill_status_profile where `billnumber`= 'CommonVoucher' and `status`='browse' and `item`='btnDirectSearch' and `group`='toolbaritem' and `tenant_id`='0' and `ytenant_id`='0');

-- 新增

insert into `bill_status_profile` (`id`,`billnumber`, `status`, `item`, `group`, `visible`, `enable`, `subid`, `system`, `pubts`, `tenant_id`, `ytenant_id`)

select 1535306780963242009,'CommonVoucher', 'add', 'btnDirectSearch', 'toolbaritem', 0, 0, 'mdd', 1, now(), 0, 0 from DUAL

where not EXISTS (select 1 from bill_status_profile where `billnumber`= 'CommonVoucher' and `status`='add' and `item`='btnDirectSearch' and `group`='toolbaritem' and `tenant_id`='0' and `ytenant_id`='0');

-- 编辑

insert into `bill_status_profile` (`id`,`billnumber`, `status`, `item`, `group`, `visible`, `enable`, `subid`, `system`, `pubts`, `tenant_id`, `ytenant_id`)

select 1535306780963242010,'CommonVoucher', 'edit', 'btnDirectSearch', 'toolbaritem', 0, 0, 'mdd', 1, now(), 0, 0 from DUAL

where not EXISTS (select 1 from bill_status_profile where `billnumber`= 'CommonVoucher' and `status`='edit' and `item`='btnDirectSearch' and `group`='toolbaritem' and `tenant_id`='0' and `ytenant_id`='0');

-- 空白

insert into `bill_status_profile` (`id`,`billnumber`, `status`, `item`, `group`, `visible`, `enable`, `subid`, `system`, `pubts`, `tenant_id`, `ytenant_id`)

select 1535306780963242011,'CommonVoucher', 'blank', 'btnDirectSearch', 'toolbaritem', 0, 0, 'mdd', 1, now(), 0, 0 from DUAL

where not EXISTS (select 1 from bill_status_profile where `billnumber`= 'CommonVoucher' and `status`='blank' and `item`='btnDirectSearch' and `group`='toolbaritem' and `tenant_id`='0' and `ytenant_id`='0');

## [](#4-sql执行规则)4 sql执行规则

    测试、日常环境，MDD统一执行了公共脚本，领域可在测试、日常环境验证，**验证通过后自行执行预发、生产环境**，根据自己的上线进度自行控制脚本执行。