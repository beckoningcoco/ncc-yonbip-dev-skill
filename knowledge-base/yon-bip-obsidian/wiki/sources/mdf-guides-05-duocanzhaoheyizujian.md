---
title: "多参照合一组件（多维参照）"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/05-duocanzhaoheyizujian"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 多参照合一组件（多维参照）

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/05-duocanzhaoheyizujian | 所属：指南

# [](#多参照合一组件多维参照)多参照合一组件（多维参照）

## [](#1-组件说明)1. 组件说明

该组件用于将多个参照，在同一个页面进行维护。

## [](#2-组件效果)2. 组件效果

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/duocanzhaoheyizujianimage1.55dd7ea8.png)

## [](#3-页面访问地址)3. 页面访问地址

测试环境URL/mdf-node/meta/voucherlist/mdd_multirefer?domainKey=iuap-metadata-mdd

## [](#4-样例单据excel)4. 样例单据Excel

参照树分配demo.xlsm

## [](#5-扩展脚本)5. 扩展脚本

cb.define(process.env.__DOMAINKEY__,[], function () {

 const DEMO_mdd_multirefer_VM_Extend = {

 doAction: function (name, viewmodel) {

 if (this[name]) {

 this[name](viewmodel);

 }

 },

 init: function (viewmodel) {

 // 分配弹窗的初始化参照

 viewmodel.get('org_name').setVisible(false);

 viewmodel.get("org_name").browse(false, (vm) => {});

 viewmodel.get("assignperson_name").setVisible(false);

 viewmodel.get("assignperson_name").browse(false, (vm) => {});

 viewmodel.get("assignrole_name").setVisible(false);

 viewmodel.get("assignrole_name").setState("domainKey","u8c-auth");

 viewmodel.get("assignrole_name").browse(false, (vm) => {});

 // 调用弹窗方法

 viewmodel.get('btnAssign').on('click', function(args) {

 // 组装弹窗参数

 const refercodes = "org_name,assignperson_name,assignrole_name";

 const referparams = {

 title: "分配",

 cParameter: refercodes,

 cRefKeyField: {

 org_name: "id",

 assignperson_name: "yhtUserId",

 assignrole_name: "id",

 },

 org_name: viewmodel.getCache('org') || [], // 此处为上次选中的数据，由于没有对应服务，此处暂时放在了缓存中

 assignperson_name: viewmodel.getCache('assignperson') || [],

 assignrole_name: viewmodel.getCache('assignrole') || [],

 };

 viewmodel.biz.do("multiplerefer", viewmodel, referparams);

 });

 // 分配确认后回调

 viewmodel.on("MultipleReferValueChange", function (datas) {

 // 回调数据中，会按照传入的接口返回，其中状态为Delete的为此次删除数据，Insert为新增加数据

 const org_name = datas["org_name"];

 const assignperson_name = datas["assignperson_name"];

 const assignrole_name = datas["assignrole_name"];

 const org = viewmodel.getCache('org') || [];

 const assignperson = viewmodel.getCache('assignperson') || [];

 const assignrole = viewmodel.getCache('assignrole') || [];

 if (org_name && org_name.length > 0) {

 org_name.forEach((element) => {

 const _status = element._status;

 if (_status == "Delete") {

 const index = org.indexOf(element.id);

 org.splice(index,1);

 } else if (_status == "Insert") {

 org.push(element.id);

 }

 });

 }

 if (assignperson_name && assignperson_name.length > 0) {

 assignperson_name.forEach((element) => {

 const _status = element._status;

 if (_status == "Delete") {

 const index = assignperson.indexOf(element.yhtUserId);

 assignperson.splice(index,1);

 } else if (_status == "Insert") {

 assignperson.push(element.yhtUserId);

 }

 });

 }

 if (assignrole_name && assignrole_name.length > 0) {

 assignrole_name.forEach((element) => {

 const _status = element._status;

 if (_status == "Delete") {

 const index = assignrole.indexOf(element.id);

 assignrole.splice(index,1);

 } else if (_status == "Insert") {

 assignrole.push(element.id);

 }

 });

 }

 // 处理后的数据，由于没有存储，此处暂时放到了缓存中，实际业务可以根据情况自行处理

 viewmodel.setCache('org', org);

 viewmodel.setCache('assignperson', assignperson);

 viewmodel.setCache('assignrole', assignrole);

 });

 },

 };

 try {

 module.exports = DEMO_mdd_multirefer_VM_Extend;

 } catch (error) { }

 return DEMO_mdd_multirefer_VM_Extend;

});