---
title: "存储 IndexDB"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/05-index-db"
section: "API"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, API]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 存储 IndexDB

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/api/05-index-db | 所属：API

# [](#存储-indexdb)存储 indexDB

## [](#1-连接数据库)1. 连接数据库

`cb.indexDB.openDB`

const ret = await cb.indexDB.openDB('数据库名', 1, ['表名1', '表名2']);

console.log(ret);

## [](#2-保存数据)2. 保存数据

`cb.indexDB.IDB_saveData`

const row = {} // 需要存储的数据

await cb.indexDB.IDB_saveData(row, '表名', '数据库名');

## [](#3-删除单条数据)3. 删除单条数据

`cb.indexDB.IDB_deleteOneData`

const data = await cb.indexDB.IDB_deleteOneData({

 dbTableName: '表名',

 dbName: '数据库名',

 id: id // id字符串

});

console.log(data);

## [](#4-删除多条数据)4. 删除多条数据

`cb.indexDB.IDB_deleteSomeData`

const data = await cb.indexDB.IDB_deleteSomeData({

 dbTableName: '表名',

 dbName: '数据库名',

 id: ids // id数组

});

console.log(data);

## [](#5-检查全部数据)5. 检查全部数据

`cb.indexDB.IDB_searchData`

const data = await cb.indexDB.IDB_searchData({

 dbTableName: '表名',

 dbName: '数据库名'

});

console.log(data);

## [](#6-查询一条数据)6. 查询一条数据

`cb.indexDB.IDB_getData`

const row = await cb.indexDB.IDB_getData({

 dbTableName: '表名',

 dbName: '数据库名',

 key: '数据key'

});

console.log(row);

## [](#7-清空表数据)7. 清空表数据

`cb.indexDB.IDB_tableClear`

await cb.indexDB.IDB_tableClear('表名', '数据库名');