---
title: "DataSource 协议"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/spec/g01-spec-datasource-spec"
section: "YNF-协议"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 协议]
platform_version: "BIP V5"
source_type: ynf-docs
images: 1
---

# DataSource 协议

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/spec/g01-spec-datasource-spec | 所属：YNF-协议

# [](#datasource-协议)DataSource 协议

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/template-spec-04.eaaf34cf.png)

- DatasourceList Object描述了模板上组件绑定的元数据来源，常以实体元数据为基本颗粒度*，当模板引用多个实体时需定义多个
- DatasourceList Item Object描述了数据源对应实体元数据的基本情况。
其中mainEntity标识了当前实体是否作为主实体使用，每个模板仅可存在一个主实体。uri标识了数据源关联实体元数据的唯一标识，例如CLM.clmContract.clm_contract
- Datasource Field Object 描述了该引用实体元数据每个字段基本情况，其中fileld对应了实体元数据的fieldName，virtualField标识此字段是否为虚拟字段

### [](#1-datasourcelist-object数据源)1. DatasourceList Object数据源

数据源对象。

||字段名称||字段类型||业务含义||说明（示例）|
||serialCode||String||YNF模型编号||唯一标识OID格式|
||caption||String||数据源显示名称||数据源|
||captionResid||String||组件显示名称多语词条|||
||controlType||String||控件类型||datasourceList|
||nid||String||设计器内组件id||"nid_239"|
||children||[DataSource Item Object](#_DataSource Item Object 数据源对象描述)||数据源集合对象||text|

### [](#2-datasourcelist-item-object数据源项)2. DatasourceList Item Object数据源项

||字段名称||字段类型||业务含义||说明（示例）|
||serialCode||String||YNF模型编号||唯一标识OID格式|
||parentSerialCode||String||父级YNF模型编号|||
||alias||String||数据源字段编码||clm_contract|
||caption||String||数据源显示名称||合同信息|
||captionResid||String||组件显示名称多语词条|||
||controlType||String||数据源类型||Datasource，固定值|
||dataPattern||String||||LIST、QUERY等|
||mainEntity||Boolean||是否主实体||true|
||serialCode||String||序列号编码||1671674440747843606|
||type||String||数据源类型||entity --- 实体|
||uri||String||数据源的uri||CLM.clmContract.clm_contract|
||nid||String||设计器内组件id||"nid_239"|
||fieldsArr||[[DataSource Filed Object](#_DataSource Filed Object 数据源对象字段描述)]||数据源对象字段描述集合||[]|
||children||[DataSource Item Object](#_DataSource Item Object 数据源对象描述)||子数据源集合对象|||

### [](#3-datasource-filed-object数据源字段)3. DataSource Filed Object数据源字段

||字段名称||字段类型||业务含义||说明（示例）|
||serialCode||String||YNF模型编号||唯一标识OID格式|
||parentSerialCode||String||父级YNF模型编号|||
||alias||String||字段别名||creator_userName|
||bizType||String||业务类型||text|
||caption||String||显示名称||创建人|
||field||String||字段编码||creator.userName|
||type||String||数据源类型||entity|
||refEntityUri||String||引用实体uri||yonbip-ec-contract.yonbip-ec-contract.reDirection|
||fieldCodeInMeta||String||对应元数据字段编号||enumerate4hg|
||nid||String||设计器内组件id||nid_185|
||virtualField||Boolean||是否真实字段||false|