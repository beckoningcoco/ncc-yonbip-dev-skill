---
title: "资产卡片详情查询"
apiId: "1994708294203604996"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Asset Information"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Asset Information]
platform_version: "BIP"
source_type: community-api-docs
---

# 资产卡片详情查询

> `ContentType	application/json` 请求方式	POST | 分类: Asset Information (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/am/aimequipcard/detail

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| showImageType | number |
| 小数位数:0,最大长度:1 | query | 否 | 返回资产图片地址类型，0不需要，1缩略图，2原图    示例: 0 |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| id | string | 否 | 否 | 资产卡片id 示例：1975228435580059658 |
| code | string | 否 | 否 | 资产编码 示例：202405100009 |

## 3. 请求示例

Url: /yonbip/am/aimequipcard/detail?access_token=访问令牌&showImageType=0
Body: {
	"id": "1975228435580059658",
	"code": "202405100009"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | 返回编码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功！ |
| data | object | 否 | 返回数据 |
| pk_currency_tax | string | 否 | 税金币种主键 示例：1971570154232875393 |
| bill_type_src | string | 否 | 来源单据类型 示例：origin |
| used_dept_follow_user | boolean | 否 | 使用部门随责任人变动 示例：false |
| status_date | string | 否 | 状态日期 示例：2024-05-12 |
| pk_category__category_global | string | 否 | 全级次资产类别 示例：资产类别1 |
| borrow_flag | boolean | 否 | 借用标识 示例：false |
| pk_ownerunit__name | string | 否 | 所有权 示例：hxx-全职能组织 |
| equip_extend__pk_equip | string | 否 | 扩展表卡片主键 示例：1995286388128350212 |
| bill_type | string | 否 | 单据类型 示例：4A00 |
| map_location | string | 否 | 地理位置 示例：北京市东城区东华门街道天安门东地铁站C东南口中国国家博物馆 |
| epc | string | 否 | epc编码 示例：450001995286388128350211 |
| model | string | 否 | 型号 示例：型号 |
| pk_priority__priority_code | string | 否 | 关键程度编码 示例：01 |
| id | string | 否 | 资产卡片主键 示例：1995286388128350212 |
| equip_extend!runStatus | string | 否 | 运行状态 示例：PRESET01_0000LUT9Q1KVH9R6RM0000 |
| creator__name | string | 否 | 创建人 示例：昵称-haoxxia |
| pk_user__name | string | 否 | 责任人 示例：haoxxia |
| pk_used_status | string | 否 | 资产状态主键 示例：PRESET01_0000LUT9Q1KVH9R6RM0000 |
| tenant | string | 否 | 租户 示例：0000LUT9Q1KVH9R6RM0000 |
| mortgage_flag | boolean | 否 | 抵押标识 示例：false |
| pk_usedept__code | string | 否 | 使用部门编码 示例：x1 |
| equip_extend!soldArea | number |
| 小数位数:0,最大长度:10 | 否 | 已售面积 示例：0 |
| facturer_name | string | 否 | 生产厂商 示例：生产厂商 |
| branchcode | string | 否 | 分支编码 示例：OVDWA1BQ |
| lng | number |
| 小数位数:6,最大长度:10 | 否 | 经度 示例：116.401783 |
| keyparts | object | 是 | 部位子表数据 |
| isWfControlled | boolean | 否 | 是否审批流控制 示例：false |
| rent_flag | boolean | 否 | 租赁标记 示例：false |
| equip_name | object | 否 | 资产名称 |
| pk_used_status__status_type | number |
| 小数位数:0,最大长度:10 | 否 | 资产状态类型 示例：0 |
| deploy_flag | boolean | 否 | 调拨标记 示例：false |
| pk_special_type | string | 否 | 特种设备类别主键 示例：1985627058214010888 |
| pk_icorg__name | string | 否 | 库存组织名称 示例：hxx-全职能组织 |
| assign_flag | boolean | 否 | 领用标记 示例：false |
| returncount | number |
| 小数位数:0,最大长度:10 | 否 | 退回次数 示例：0 |
| verifystate | number |
| 小数位数:0,最大长度:10 | 否 | 审批状态 示例：2 |
| pk_usedorg | string | 否 | 使用单位主键 示例：1975228435580059658 |
| pk_currency_tax__moneyDigit | number |
| 小数位数:0,最大长度:10 | 否 | 税金币种精度 示例：2 |
| pk_currency_purc__moneyDigit | number |
| 小数位数:0,最大长度:10 | 否 | 采购币种精度 示例：2 |
| subvos | object | 是 | 子资产数据 |
| sealflag | boolean | 否 | 封存标记 示例：false |
| pk_user | string | 否 | 责任人主键 示例：1975367592513110017 |
| install_location | string | 否 | 行政区划主键 示例：bfad109f-5cf3-11e9-817e-7cd30abea0c0 |
| pk_mandept | string | 否 | 管理部门主键 示例：1975270053801623554 |
| associate_flag | boolean | 否 | 联动固定资产 示例：false |
| pk_ownerorg | string | 否 | 资产管理组织主键 示例：1975228435580059658 |
| equip_extend!planRentalArea | number |
| 小数位数:0,最大长度:10 | 否 | 规划可租面积 示例：0 |
| pk_fiorg | string | 否 | 会计主体主键 示例：1975228435580059658 |
| start_used_date | string | 否 | 投用日期 示例：2024-05-12 |
| pubts | string | 否 | 时间戳 示例：2024-05-12 10:53:01 |
| pk_used_status__status_name | string | 否 | 资产状态 示例：在用 |
| pk_category__category_name | string | 否 | 资产类别 示例：资产类别1 |
| pk_special_type__catalogue_name | string | 否 | 特种设备类别 示例：安全帽 |
| creator | string | 否 | 创建人主键 示例：672e9f78-e1c1-44f1-8c77-e076eb447098 |
| pk_manager__name | string | 否 | 管理人 示例：haoxxia |
| pk_usedorg__name | string | 否 | 使用单位 示例：hxx-全职能组织 |
| measurepoint | object | 是 | 测量点子表数据 |
| auditor | string | 否 | 审核人主键 示例：672e9f78-e1c1-44f1-8c77-e076eb447098 |
| rentobject | object | 是 | 租赁对象子表数据 |
| equip_extend!runStatus__name | string | 否 | 运行状态 示例：运行 |
| equip_extend!planUsableArea | number |
| 小数位数:0,最大长度:10 | 否 | 规划可用面积 示例：0 |
| pk_manager | string | 否 | 管理人主键 示例：1975367592513110017 |
| pk_priority__priority_name | string | 否 | 关键程度 示例：关键资产 |
| masterOrgKeyField | string | 否 | 主组织字段 示例：pk_org |
| out_flag | boolean | 否 | 外部租入资产标志 示例：false |
| modifier | string | 否 | 最后修改人主键 示例：672e9f78-e1c1-44f1-8c77-e076eb447098 |
| pk_usedept | string | 否 | 使用部门主键 示例：1971678344462729219 |
| pk_category__category_code | string | 否 | 资产类别编码 示例：202404100001 |
| special_asset | object | 是 | 特种设备子表数据 |
| source | string | 否 | 建卡来源 示例：origin |
| spec | string | 否 | 规格 示例：规格 |
| pk_org | string | 否 | 资产组织主键 示例：1975228435580059658 |
| equip_code | string | 否 | 资产编码 示例：202405120001 |
| pk_transitype | string | 否 | 交易类型主键 示例：1971570154245980246 |
| pk_icorg | string | 否 | 库存组织主键 示例：1975228435580059658 |
| lat | number |
| 小数位数:6,最大长度:10 | 否 | 纬度 示例：39.906793 |
| area | number |
| 小数位数:0,最大长度:10 | 否 | 规划总面积 示例：0 |
| audittime | string | 否 | 审核时间 示例：2024-05-12 10:53:01 |
| pk_transitype__name | string | 否 | 交易类型 示例：资产卡片 |
| pk_org__name | string | 否 | 资产组织 示例：hxx-全职能组织 |
| pk_category__portrait_flag | number |
| 小数位数:0,最大长度:10 | 否 | 资产类别资产画像 示例：1 |
| measure_instrument | boolean | 否 | 计量器具 示例：false |
| special_flag | boolean | 否 | 特种设备 示例：true |
| billmaker__name | string | 否 | 制单人 示例：昵称-haoxxia |
| modifier__name | string | 否 | 最后修改人 示例：昵称-haoxxia |
| equip_extend!rentedArea | number |
| 小数位数:0,最大长度:10 | 否 | 已租面积 示例：0 |
| billmaker | string | 否 | 制单人主键 示例：672e9f78-e1c1-44f1-8c77-e076eb447098 |
| equip_extend!evaluateValue | number |
| 小数位数:0,最大长度:10 | 否 | 评估价值 示例：0 |
| creationtime | string | 否 | 创建时间 示例：2024-05-12 10:45:07 |
| pk_usedept__name | string | 否 | 使用部门 示例：营销部门 |
| pk_fiorg__name | string | 否 | 会计主体 示例：hxx-全职能组织 |
| pk_category__line_category | boolean | 否 | 线性类别 示例：false |
| pk_currency_purc__name | string | 否 | 采购币种 示例：人民币 |
| pk_org__code | string | 否 | 资产组织编码 示例：1 |
| whole_rent_flag | boolean | 否 | 整租标识 示例：false |
| pk_mandept__name | string | 否 | 管理部门 示例：部门A |
| pk_priority | string | 否 | 关键程度主键 示例：PRESET01_0000LUT9Q1KVH9R6RM0000 |
| pk_currency_tax__name | string | 否 | 税金币种 示例：人民币 |
| assignment_flag | boolean | 否 | 分配标记 示例：false |
| innercode | string | 否 | 内部编码 示例：OVDWA1BQ |
| pk_currency_purc | string | 否 | 采购币种主键 示例：1971570154232875393 |
| modifiedtime | string | 否 | 最后修改时间 示例：2024-05-12 10:53:00 |
| userDefines | object | 否 | 自定义项数据 |
| spare_part | object | 是 | 零部件子表数据 |
| pk_mandept__code | string | 否 | 管理部门编码 示例：133 |
| equip_extend!selfUseArea | number |
| 小数位数:0,最大长度:10 | 否 | 自用面积 示例：0 |
| pk_usedorg__code | string | 否 | 使用单位编码 示例：1 |
| fa_flag | boolean | 否 | 固定资产核算 示例：true |
| equip_extend!planSaleableArea | number |
| 小数位数:0,最大长度:10 | 否 | 规划可售面积 示例：0 |
| pk_ownerunit | string | 否 | 所有权主键 示例：1975228435580059658 |
| equip_extend!business_type | number |
| 小数位数:0,最大长度:10 | 否 | 经营类型 示例：2 |
| billmaketime | string | 否 | 制单时间 示例：2024-05-12 10:45:07 |
| reduce_flag | boolean | 否 | 减少标记 示例：false |
| changeRatePrecision | number |
| 小数位数:0,最大长度:10 | 否 | 换算率精度 示例：0 |
| auditor__name | string | 否 | 审核人 示例：昵称-haoxxia |
| pk_category | string | 否 | 资产类别主键 示例：1971688231464337413 |
| pk_ownerorg__name | string | 否 | 资产管理组织 示例：hxx-全职能组织 |
| associate_status_flag | boolean | 否 | 联动固定资产状态 示例：false |
| bill_status | number |
| 小数位数:0,最大长度:10 | 否 | 单据状态 示例：1 |
| equip_extend!leasedOccupyArea | number |
| 小数位数:0,最大长度:10 | 否 | 租赁预占面积 示例：0 |
| transi_type | string | 否 | 交易类型编码 示例：4A00-01 |
| pk_category__innercode | string | 否 | 资产类别内部编码 示例：0JPB |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"pk_currency_tax": "1971570154232875393",
		"bill_type_src": "origin",
		"used_dept_follow_user": false,
		"status_date": "2024-05-12",
		"pk_category__category_global": "资产类别1",
		"borrow_flag": false,
		"pk_ownerunit__name": "hxx-全职能组织",
		"equip_extend__pk_equip": "1995286388128350212",
		"bill_type": "4A00",
		"map_location": "北京市东城区东华门街道天安门东地铁站C东南口中国国家博物馆",
		"epc": "450001995286388128350211",
		"model": "型号",
		"pk_priority__priority_code": "01",
		"id": "1995286388128350212",
		"equip_extend!runStatus": "PRESET01_0000LUT9Q1KVH9R6RM0000",
		"creator__name": "昵称-haoxxia",
		"pk_user__name": "haoxxia",
		"pk_used_status": "PRESET01_0000LUT9Q1KVH9R6RM0000",
		"tenant": "0000LUT9Q1KVH9R6RM0000",
		"mortgage_flag": false,
		"pk_usedept__code": "x1",
		"equip_extend!soldArea": 0,
		"facturer_name": "生产厂商",
		"branchcode": "OVDWA1BQ",
		"lng": 116.401783,
		"keyparts": [
			{
				"pk_equip": "1995286388128350212",
				"name": "部位1",
				"memo": "备注1",
				"id": "1995290451167412238"
			}
		],
		"isWfControlled": false,
		"rent_flag": false,
		"equip_name": {
			"zh_CN": "api测试数据"
		},
		"pk_used_status__status_type": 0,
		"deploy_flag": false,
		"pk_special_type": "1985627058214010888",
		"pk_icorg__name": "hxx-全职能组织",
		"assign_flag": false,
		"returncount": 0,
		"verifystate": 2,
		"pk_usedorg": "1975228435580059658",
		"pk_currency_tax__moneyDigit": 2,
		"pk_currency_purc__moneyDigit": 2,
		"subvos": [
			{
				"pk_equip__branchcode": "OVDWA1BQ",
				"pk_equip__pk_usedorg": "1975228435580059658",
				"pk_equip__pk_usedorg__name": "hxx-全职能组织",
				"pk_equip__pk_mandept": "1975270053801623554",
				"pk_equip__pk_mandept__name": "部门A",
				"pk_equip__pk_used_status": "PRESET01_0000LUT9Q1KVH9R6RM0000",
				"pk_equip__pk_category": "1971688231464337413",
				"pk_equip__equip_code": "202405100006",
				"pk_equip": "1994019870968643594",
				"pk_equip__start_used_date": "2024-05-10",
				"pk_equip__pk_used_status__status_name": "在用",
				"pk_equip__equip_name": "测试",
				"pk_equip__pk_category__category_name": "资产类别1",
				"fk_parent": "1995286388128350212",
				"id": "1994019870968643594",
				"pubts": "2024-05-12 10:53:01",
				"pk_equip__pk_ownerorg": "1975228435580059658",
				"pk_equip__pk_ownerorg__name": "hxx-全职能组织"
			}
		],
		"sealflag": false,
		"pk_user": "1975367592513110017",
		"install_location": "bfad109f-5cf3-11e9-817e-7cd30abea0c0",
		"pk_mandept": "1975270053801623554",
		"associate_flag": false,
		"pk_ownerorg": "1975228435580059658",
		"equip_extend!planRentalArea": 0,
		"pk_fiorg": "1975228435580059658",
		"start_used_date": "2024-05-12",
		"pubts": "2024-05-12 10:53:01",
		"pk_used_status__status_name": "在用",
		"pk_category__category_name": "资产类别1",
		"pk_special_type__catalogue_name": "安全帽",
		"creator": "672e9f78-e1c1-44f1-8c77-e076eb447098",
		"pk_manager__name": "haoxxia",
		"pk_usedorg__name": "hxx-全职能组织",
		"measurepoint": [
			{
				"pk_meas_items": "PRESET02_0000LUT9Q1KVH9R6RM0000",
				"frequency_unit": 0,
				"pk_meas_items__result_type": 1,
				"enablestate": 2,
				"measure_point_name": "测量点名称",
				"meas_item_explain": "说明",
				"range": 3,
				"frequency": 1,
				"statistical_duration": 1,
				"pk_meas_items__item_name": "电表",
				"statistical_unit": 2,
				"pk_meas_items__pk_measuredoc__name": "千瓦时",
				"id": "1995290451167412236",
				"pk_meas_items__pk_measuredoc": "1971569905141022729",
				"creator__name": "昵称-haoxxia",
				"synchronous_state": 1,
				"identifier": "标识符",
				"creator": "672e9f78-e1c1-44f1-8c77-e076eb447098",
				"end_time": "23:59:59",
				"main_id": "1995286388128350212",
				"measure_point_code": "CLD0001",
				"pk_meas_items__pk_measuredoc__precision": 2,
				"start_time": "00:00:00",
				"start_number_time": "2024-05-13 00:00:00",
				"pk_equip": "1995286388128350212",
				"creationtime": "2024-05-12 10:53:00"
			}
		],
		"auditor": "672e9f78-e1c1-44f1-8c77-e076eb447098",
		"rentobject": [
			{
				"area": 0,
				"rent_object_explain": "*对象描述",
				"enablestate": 2,
				"seal_time": "2024-05-10 17:54:20",
				"rent_status": 1,
				"memo": "备注",
				"spec": "规格",
				"unit": "1",
				"pk_equip": "1995286388128350212",
				"rent_object": "*租赁对象",
				"business_type": 2,
				"usableArea": 0,
				"model": "型号",
				"id": "1995286388128350213",
				"floor": "5",
				"pubts": "2024-05-12 10:53:00",
				"building_number": "12",
				"tenant": "0000LUT9Q1KVH9R6RM0000"
			}
		],
		"equip_extend!runStatus__name": "运行",
		"equip_extend!planUsableArea": 0,
		"pk_manager": "1975367592513110017",
		"pk_priority__priority_name": "关键资产",
		"masterOrgKeyField": "pk_org",
		"out_flag": false,
		"modifier": "672e9f78-e1c1-44f1-8c77-e076eb447098",
		"pk_usedept": "1971678344462729219",
		"pk_category__category_code": "202404100001",
		"special_asset": [
			{
				"registration_authority": "己关",
				"check_content_no": 1,
				"pre_check_date": "2024-05-12",
				"memo": "备注",
				"check_status": 0,
				"inspection_party": "检验方",
				"pk_equip": "1995286388128350212",
				"check_period_unit": 2,
				"registration_code": "注册代码",
				"calculation_method": 3,
				"next_check_date": "2024-07-11",
				"certificate_no": "编号",
				"id": "1995290451167412237",
				"check_period_num": 2,
				"check_content": "内容"
			}
		],
		"source": "origin",
		"spec": "规格",
		"pk_org": "1975228435580059658",
		"equip_code": "202405120001",
		"pk_transitype": "1971570154245980246",
		"pk_icorg": "1975228435580059658",
		"lat": 39.906793,
		"area": 0,
		"audittime": "2024-05-12 10:53:01",
		"pk_transitype__name": "资产卡片",
		"pk_org__name": "hxx-全职能组织",
		"pk_category__portrait_flag": 1,
		"measure_instrument": false,
		"special_flag": true,
		"billmaker__name": "昵称-haoxxia",
		"modifier__name": "昵称-haoxxia",
		"equip_extend!rentedArea": 0,
		"billmaker": "672e9f78-e1c1-44f1-8c77-e076eb447098",
		"equip_extend!evaluateValue": 0,
		"creationtime": "2024-05-12 10:45:07",
		"pk_usedept__name": "营销部门",
		"pk_fiorg__name": "hxx-全职能组织",
		"pk_category__line_category": false,
		"pk_currency_purc__name": "人民币",
		"pk_org__code": "1",
		"whole_rent_flag": false,
		"pk_mandept__name": "部门A",
		"pk_priority": "PRESET01_0000LUT9Q1KVH9R6RM0000",
		"pk_currency_tax__name": "人民币",
		"assignment_flag": false,
		"innercode": "OVDWA1BQ",
		"pk_currency_purc": "1971570154232875393",
		"modifiedtime": "2024-05-12 10:53:00",
		"userDefines": {},
		"spare_part": [
			{
				"num": 1,
				"ass_unit__precision": 3,
				"change_rate": 1,
				"pk_org": "1975228435580059658",
				"ass_unit": "1971569905141022727",
				"ass_unit__name": "立方米",
				"pk_material__name": "备件物料",
				"pk_material": "1977048170286809097",
				"unit": "1971569905141022727",
				"ass_num": 1,
				"pk_equip": "1995286388128350212",
				"unit__precision": 3,
				"pk_material__code": "0001000001",
				"id": "1995290451167412234",
				"pubts": "2024-05-12 10:53:00",
				"tenant": "0000LUT9Q1KVH9R6RM0000",
				"unit__name": "立方米"
			}
		],
		"pk_mandept__code": "133",
		"equip_extend!selfUseArea": 0,
		"pk_usedorg__code": "1",
		"fa_flag": true,
		"equip_extend!planSaleableArea": 0,
		"pk_ownerunit": "1975228435580059658",
		"equip_extend!business_type": 2,
		"billmaketime": "2024-05-12 10:45:07",
		"reduce_flag": false,
		"changeRatePrecision": 0,
		"auditor__name": "昵称-haoxxia",
		"pk_category": "1971688231464337413",
		"pk_ownerorg__name": "hxx-全职能组织",
		"associate_status_flag": false,
		"bill_status": 1,
		"equip_extend!leasedOccupyArea": 0,
		"transi_type": "4A00-01",
		"pk_category__innercode": "0JPB"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

code	服务端逻辑异常	服务端逻辑异常


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-05-22

更新

请求说明

资产卡片详情查询支持用户级


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

