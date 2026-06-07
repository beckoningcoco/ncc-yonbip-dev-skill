---
title: "表头明细切换 SumSwitch"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/05-sumswitchbiaotoumingxiqiehuan"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 表头明细切换 SumSwitch

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/05-sumswitchbiaotoumingxiqiehuan | 所属：Web组件

# [](#表头明细切换-sumswitch)表头明细切换 SumSwitch

## [](#1-功能说明)1. 功能说明

表头明细切换，如果选择表头，只会展示主表的信息，如果选择表头加明细，会把子表的部分信息也展示出来。

## [](#2-效果展示)2. 效果展示

![](data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAANsAAAAnCAYAAACG0z0iAAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAAJcEhZcwAAEnQAABJ0Ad5mH3gAAAMtSURBVHhe7ZlLjhoxFEWzlmScTFhXs4TeAmInsBCEEGIFMGmBkhEDJji+rp/LUB+g60nAOZIj43IV1X4+9jP54QDABGQDMALZAIxANgAjkA3ACGQDMALZAIxANgAjkA3ACGQDMALZAIxANgAjkA3AiIdlO51Obrfbuc1m4xaLRSiqq03X3g3GA5p4SLb9fh8m03a7dcfj0Z3P51BUV5uuqc+7wHhAG3fLpkmzXq/DRGpC19TnOybYYT524/kh/3SdtM9qOnazr/zDwDAeKzcZjdyoVia+teDgZh/59y8nSb+qTJZZ71fkLtmUDmmVbptYBeqjvjelUC3BSEscnMPXLA94FmQr2d5uPPxzx9F3ZkJLtlSu6LP/G8p38/ViEdCCULSvpsh2gc4fSov6or665xG6VvI4UKqrr5Vs18bj+Pnp/v3+E4rqMU8/HpLtY+Z18pTitMnmr03zmt5rimy90YG/zypeoL66pz8KVLVyNpYi4P7fwzJfbcs2Bc9GtnQ8JNffn79qJRbuGcajVeZG2ZL3KXfUqE3SsbP1R2mQDv59UV/d8whdK3lBFbDojDAw6XhoN0tlU1vBM4xHp2yRVJVsLWlkImgpX1KQLWFo2WorYVfJ05NLkmAPyNCy2Y3Htd1JJbnvnjQyvsbO1p/h08g6WUB8wKKUSG1FihTqVyfJldI4Ge9n+DSyjsV46BmtO1sqW7LbZSUTrP4+fnedI1tvLH8gUQDKoEfpR+NEKAjBT1bkgbD8gcRqPG6WTe9SE7dlJy3u8SBbB4P/1C3ylXLszxm1AIQJ1nH2iO7VRBw6gK84Hp2y+edUoq+8WOlzr5zZQn92tpsZ8j9xNehxSqQAhLZyUimQebDj1bQMaH1Fze4dNpBvNR56brGzefROl+loJVv8/oGwQOTvmxRka0CTRqu00iJNJB38VVRXm67dOrFS+kyMEGwFKw7oBdmEbFytv4G3HI9EvJpITd8fpZEx+tuQrQWlQzp/6MCvyaSiutpuTpVeAMYDmnhYNgDoB7IBGIFsAEYgG4ARyAZgBLIBGIFsAEYgG4ARyAZgBLIBGIFsAEYgG4AJzv0HOOT7boJ2hiQAAAAASUVORK5CYII=)

里边嵌套Radio组件。

使用sumswitch组件时，需要在UI元数据中sumswitch对应的元数据上配置扩展字段cStyle

配置示例： "cStyle": {true: "id", false: "subid"}

其中true为表头选项中表格使用的唯一标识，需要对应list返回数据中存在的字段，false为表头+明细选项中表格使用的唯一标识，同样也需要对应list返回数据中存在的字段。

## [](#3-设置默认值)3. 设置默认值

   
可以通过下面任意一种方法给isSum字段赋值的方式设置默认值，true为表头模式，false为表头+明细模式

- 

通过修改url参数设置默认值，示例url：[https://xxxx.com/meta/voucherlist/billnum?isSum=true](https://xxxx.com/meta/voucherlist/billnum?isSum=true)  

- 

通过扩展脚本设置默认值，示例代码如下：

viewmodel.setCache('isSum', false)