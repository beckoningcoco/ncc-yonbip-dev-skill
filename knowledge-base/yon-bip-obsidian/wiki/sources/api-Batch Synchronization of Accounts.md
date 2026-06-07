---
title: "会计科目批量同步"
apiId: "2319969268414808074"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Accounts"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Accounts]
platform_version: "BIP"
source_type: community-api-docs
---

# 会计科目批量同步

> `ContentType	application/json` 请求方式	POST | 分类: Accounts (AMP)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/FCC/accsubjec/bill/save

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| key | string | 否 | 否 | 来源系统的唯一主键字段名称 示例：objid 默认值：objid |
| billnum | string | 否 | 否 | 单据编码 示例：fiepub_accsubjectcard 默认值：fiepub_accsubjectcard |
| data | object | 是 | 否 | 请求数据 |
| effectiveDate | string | 否 | 否 | 生效日期 示例：0000-01-01 |
| expirationDate | string | 否 | 否 | 失效日期 示例：9999-12-31 默认值：9999-12-31 |
| accsubjectchart_subjectCodeControlRule | string | 否 | 否 | 科目编码控制规则 示例：1 |
| subjectcoderule | string | 否 | 否 | 科目编码规则 示例：4-2-2-2 |
| subjectlevel | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 科目层级 示例：1 |
| leaf | boolean | 否 | 否 | 是否叶子节点 示例：true |
| parent_code | string | 否 | 否 | 父科目编码 |
| parent_name | string | 否 | 否 | 父科目名称 |
| code | string | 否 | 否 | 编码 示例：1111 |
| id | string | 否 | 否 | ID 示例：2319933611587928072 |
| name | object | 否 | 否 | 名称 |
| accproperty | string | 否 | 否 | 会计要素id 示例：1608758968085119337 |
| accproperty_direction | string | 否 | 否 | 会计要素方向 示例：Debit |
| accproperty_sysid | string | 否 | 否 | 会计要素来源id 示例：ZM0000DEFAULTACCPROPERTY00100001 |
| accproperty_name | string | 否 | 否 | 会计要素名称 示例：资产 |
| accproperty_code | string | 否 | 否 | 会计要素编码 |
| accsubjectchart | string | 否 | 否 | 科目表id 示例：1962649378312683524 |
| accsubjectchart_code | string | 否 | 是 | 科目表编码 |
| accsubjectchart_name | string | 否 | 否 | 科目表名称 示例：总账-账龄分析多币种科目表 |
| accsubjectchart_expirationDate | string | 否 | 否 | 科目表失效日期 示例：9999-12-31 默认值：9999-12-31 |
| deficitcheckstrategy | string | 否 | 否 | 赤字检查策略 示例：NoCheck |
| cashcategory | string | 否 | 否 | 现金分类 示例：Other |
| direction | string | 否 | 否 | 余额方向 示例：Debit |
| bnumcheck | boolean | 否 | 否 | 数量核算 示例：true |
| measuredoc | string | 否 | 否 | 默认计量单位id 示例：1608760548632035336 |
| measuredoc_code | string | 否 | 否 | 默认计量单位编码 示例：HUR |
| hasnum | boolean | 否 | 否 | 数量必填 示例：true |
| currency | string | 否 | 否 | 币种id 示例：1608759028194738203 |
| currency_code | string | 否 | 否 | 币种编码 示例：人民币 |
| isrevaluation | boolean | 否 | 否 | 汇兑损益 示例：true |
| exchangerate | string | 否 | 否 | 汇兑损益对方科目id 示例：1962649378312683526 |
| exchangerate_code | string | 否 | 否 | 汇兑损益对方科目编码 示例：1002 |
| exchangerate_name | string | 否 | 否 | 汇兑损益对方科目名称 示例：1002 银行存款 |
| enabled | boolean | 否 | 否 | 状态 示例：true |
| bstrongctrl | boolean | 否 | 否 | 是否强管控 示例：false |
| baccrualcontrol | boolean | 否 | 否 | 发生额方向控制 示例：true |
| hasbvr | boolean | 否 | 否 | 是否含有辅助核算 示例：true |
| hasfactor | boolean | 否 | 否 | 是否有成本要素 示例：true |
| blnVerify | boolean | 否 | 否 | 往来科目 示例：true |
| country | string | 否 | 否 | 国家/地区id 示例：0001Z010000000079UJJ |
| country_code | string | 否 | 否 | 国家/地区名称编码 示例：中国 |
| controlledservice | boolean | 否 | 否 | 受控应用 示例：true |
| settlementmode | boolean | 否 | 否 | 结算方式 示例：false |
| billtime | boolean | 否 | 否 | 票据日期 示例：false |
| billno | boolean | 否 | 否 | 票据号 示例：false |
| bankverifycode | boolean | 否 | 否 | 银行对账码 示例：false |
| bodies | object | 是 | 否 | 业财分析维度和辅助核算项 |
| accSubjectCostFactor | object | 是 | 否 | 成本要素信息 |
| services | object | 是 | 否 | 会计科目受控服务信息 |
| _status | string | 否 | 否 | 操作状态 示例：Update |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| objid | string | 否 | 否 | 来源系统的唯一主键值 示例：1111 |
| bbalancecontrol | string | 否 | 否 | 余额方向控制 |

## 3. 请求示例

Url: /yonbip/FCC/accsubjec/bill/save?access_token=访问令牌
Body: {
	"key": "objid",
	"billnum": "fiepub_accsubjectcard",
	"data": [
		{
			"effectiveDate": "0000-01-01",
			"expirationDate": "9999-12-31",
			"accsubjectchart_subjectCodeControlRule": "1",
			"subjectcoderule": "4-2-2-2",
			"subjectlevel": 1,
			"leaf": true,
			"parent_code": "",
			"parent_name": "",
			"code": "1111",
			"id": "2319933611587928072",
			"name": {
				"zh_CN": "099"
			},
			"accproperty": "1608758968085119337",
			"accproperty_direction": "Debit",
			"accproperty_sysid": "ZM0000DEFAULTACCPROPERTY00100001",
			"accproperty_name": "资产",
			"accproperty_code": "",
			"accsubjectchart": "1962649378312683524",
			"accsubjectchart_code": "",
			"accsubjectchart_name": "总账-账龄分析多币种科目表",
			"accsubjectchart_expirationDate": "9999-12-31",
			"deficitcheckstrategy": "NoCheck",
			"cashcategory": "Other",
			"direction": "Debit",
			"bnumcheck": true,
			"measuredoc": "1608760548632035336",
			"measuredoc_code": "HUR",
			"hasnum": true,
			"currency": "1608759028194738203",
			"currency_code": "人民币",
			"isrevaluation": true,
			"exchangerate": "1962649378312683526",
			"exchangerate_code": "1002",
			"exchangerate_name": "1002 银行存款",
			"enabled": true,
			"bstrongctrl": false,
			"baccrualcontrol": true,
			"hasbvr": true,
			"hasfactor": true,
			"blnVerify": true,
			"country": "0001Z010000000079UJJ",
			"country_code": "中国",
			"controlledservice": true,
			"settlementmode": false,
			"billtime": false,
			"billno": false,
			"bankverifycode": false,
			"bodies": [
				{
					"allownonleaf": true,
					"blnExt": true,
					"balancedireccontrol": false,
					"ballowempty": true,
					"summaryprint": false,
					"relateField": "summary",
					"dimensionext_code": "摘要",
					"id": "2319933611587928074",
					"_status": "Update"
				}
			],
			"accSubjectCostFactor": [
				{
					"elementnature": "01",
					"elementmold_name": "固定资产",
					"elementmold": "1608758985264988264",
					"elementmold_code": "0101",
					"elementcategory": "21",
					"_status": "Unchanged"
				}
			],
			"services": [
				{
					"controlledservice_code": "figl_convert",
					"controlledservice": "elateField_info114",
					"controlledservice_name": "财务折算",
					"id": "2319933611587928075",
					"_status": "Insert"
				}
			],
			"_status": "Update",
			"resubmitCheckKey": "fiepub_accsubjectcard_add_5b188198-cb03-42c5-a977-509d176a3da5",
			"objid": "1111",
			"bbalancecontrol": ""
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 否 | 响应数据 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 总条数 示例：1 |
| sucessCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功条数 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败条数 示例：0 |
| messages | string | 是 | 错误提示 |
| infos | object | 是 | 同步成功数据 |
| failInfos | string | 是 | 失败的数据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"effectiveDate": "0000-01-01",
				"expirationDate": "9999-12-31",
				"accsubjectchart_subjectCodeControlRule": "1",
				"subjectcoderule": "4-2-2-2",
				"subjectlevel": 1,
				"leaf": true,
				"parent_code": "",
				"parent_name": "",
				"code": "1111",
				"id": "2320360952254431235",
				"name": {
					"zh_CN": "099"
				},
				"accproperty": "1608758968085119337",
				"accproperty_direction": "Debit",
				"accproperty_sysid": "ZM0000DEFAULTACCPROPERTY00100001",
				"accproperty_name": "资产",
				"accsubjectchart": "1687385688809930753",
				"accsubjectchart_name": "总账-账龄分析多币种科目表",
				"deficitcheckstrategy": "NoCheck",
				"cashcategory": "Other",
				"direction": "Debit",
				"bnumcheck": true,
				"measuredoc": "1608760548632035336",
				"measuredoc_code": "HUR",
				"hasnum": true,
				"currency": "1608759028194738203",
				"currency_name": "人民币",
				"isrevaluation": true,
				"exchangerate": "1962649378312683526",
				"exchangerate_code": "1002",
				"exchangerate_name": "1002 银行存款",
				"enabled": true,
				"bstrongctrl": false,
				"baccrualcontrol": true,
				"hasbvr": true,
				"hasfactor": true,
				"blnVerify": true,
				"country": "0001Z010000000079UJJ",
				"country_name": "中国",
				"controlledservice": true,
				"settlementmode": false,
				"billtime": false,
				"billno": false,
				"bankverifycode": false,
				"bodies": [
					{
						"allownonleaf": true,
						"blnExt": true,
						"balancedireccontrol": false,
						"ballowempty": true,
						"summaryprint": false,
						"relateField": "summary",
						"dimensionext_name": "摘要",
						"dimensionext": "2319933620177862665",
						"id": "2320360952254431236",
						"accsubject": "2320360952254431235",
						"accsubjectchart": "1687385688809930753",
						"fullName": "eaai.eventvoucher.EventVoucherDetailsDO",
						"dimensionext_code": "summary",
						"accsubjectchartOid": "1687385688809930753",
						"accsubjectchartVid": "1687385688809930753",
						"accsubjectOid": "2320360952254431235",
						"accsubjectVid": "2320360952254431235",
						"effectiveDate": "0000-01-01",
						"expirationDate": "9999-12-31"
					}
				],
				"accSubjectCostFactor": {
					"elementnature": "01",
					"elementmold_name": "固定资产",
					"elementmold": "1608758985264988264",
					"elementmold_code": "0101",
					"elementcategory": "21",
					"accsubjectchart": "1687385688809930753",
					"accsubject": "2320360952254431235",
					"id": "2320360960844365827",
					"accsubjectchartOid": "1687385688809930753",
					"accsubjectchartVid": "1687385688809930753",
					"accsubjectOid": "2320360952254431235",
					"accsubjectVid": "2320360952254431235",
					"effectiveDate": "0000-01-01",
					"expirationDate": "9999-12-31"
				},
				"services": [
					{
						"controlledservice_code": "figl_convert",
						"controlledservice": "114",
						"controlledservice_name": "财务折算",
						"accsubjectchart": "1687385688809930753",
						"accsubject": "2320360952254431235",
						"accsubjectchartOid": "1687385688809930753",
						"accsubjectchartVid": "1687385688809930753",
						"accsubjectOid": "2320360952254431235",
						"accsubjectVid": "2320360952254431235",
						"effectiveDate": "0000-01-01",
						"expirationDate": "9999-12-31",
						"id": "2320360952254431237"
					}
				],
				"internalCode": "1111",
				"accsubjectchartVid": "1687385688809930753",
				"accsubjectchartOid": "1687385688809930753",
				"vr1": false,
				"vr2": false,
				"vr3": false,
				"displayname": {
					"zh_CN": "099"
				},
				"accsubjectVid": "2320360952254431235",
				"accsubjectOid": "2320360952254431235",
				"objid": "1111"
			}
		],
		"failInfos": [
			""
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

暂时没有数据哦~


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

