---
title: "跨区域涉税事项档案-查询"
apiId: "2112646549967208452"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Archives of cross-regional tax-related matters"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Archives of cross-regional tax-related matters]
platform_version: "BIP"
source_type: community-api-docs
---

# 跨区域涉税事项档案-查询

> `ContentType	application/json` 请求方式	POST | 分类: Archives of cross-regional tax-related matters (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/other-tax/api/cross-region-project-report/query

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| nsrsbh | string | 否 | 是 | 纳税人识别号 示例：1232424 |
| orgCode | string | 否 | 否 | 税务组织编码 示例：1111 |
| verifyNumber | string | 否 | 否 | 跨区域涉税事项管理编号 |
| crossRegionStatus | string | 是 | 否 | 状态 -1:待补录;-2:已报告未报验;0:已报验未反馈;1:已反馈;2:作废 示例：[ "-2","-1","0","1","2" ] |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 每页大小 示例：20 默认值：20 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 页数 示例：1 默认值：1 |

## 3. 请求示例

Url: /yonbip/tax/other-tax/api/cross-region-project-report/query?access_token=访问令牌
Body: {
	"nsrsbh": "1232424",
	"orgCode": "1111",
	"verifyNumber": "",
	"crossRegionStatus": [
		"-2",
		"-1",
		"0",
		"1",
		"2"
	],
	"pageSize": 20,
	"pageIndex": 1
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 状态码 示例：0000 |
| msg | string | 否 | 操作描述 示例：操作成功 |
| datas | object | 是 | 返回值实体 |
| totalCount | number |
| 小数位数:0,最大长度:10 | 否 | 合计数量 示例：10 |
| bills | object | 是 | 跨区域涉税事项档案实体 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"code": "0000",
		"msg": "操作成功",
		"datas": [
			{
				"totalCount": 10,
				"bills": [
					{
						"orgName": "税务组织",
						"nsrmc": "纳税人名称",
						"nsrsbh": "纳税人识别号",
						"pprojectName": "项目名称",
						"pProjectCode": "项目编码",
						"taxOfficeName": "主管税务机关",
						"verifyNumber": "跨区域涉税事项报验管理编号",
						"projectName": "工程项目名称",
						"province": "省/直辖市名称",
						"area": "区名称",
						"town": "乡镇/街道名称",
						"operateAddress": "跨区域经营地址",
						"operateMethod": "1",
						"effectiveDateStart": "2024-10-15",
						"effectiveDateEnd": "2024-10-15",
						"crossRegionStatus": "1",
						"city": "市名称"
					}
				]
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

9999	未知错误	按返回信息处理


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-03

更新

请求参数 orgCode

更新

返回参数 orgName


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

