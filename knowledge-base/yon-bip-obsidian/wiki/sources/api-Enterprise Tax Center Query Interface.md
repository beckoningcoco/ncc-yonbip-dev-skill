---
title: "企业税金中心查询接口"
apiId: "2341139811611443201"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Enterprise Tax Center"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Enterprise Tax Center]
platform_version: "BIP"
source_type: community-api-docs
---

# 企业税金中心查询接口

> `ContentType	application/json` 请求方式	POST | 分类: Enterprise Tax Center (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/yonbip/tax/other-tax/api/collect/list/page

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
| nsrsbhs | string | 是 | 是 | 纳税人识别号：必填 示例：["91110000600001760P"] |
| sbTypes | string | 是 | 否 | 税种枚举；1：增值税；5：印花税；6：房产税；7：工会经费；8：文化事业建设费；10：环境保护税；14：城镇土地使用税；16：城市维护建设税；21：消费税；22：耕地占用税；23：资源税；24：契税；25：车船税；26：车辆购置税；27：关税；28：烟叶税；29：船舶吨税；30：土地增值税；31：教育费附加；32：地方教育附加；33：企业所得税；34：个人所得税；36：残疾人就业保障金；37：水利建设专项收入；38：罚款及滞纳金；39：查补税款；40：其他税费；51：城市生活垃圾处置费；52：森林植被恢复 示例：["1"] |
| periodQuarterStart | string | 否 | 否 | 税款所属期起：日期格式yyyy-MM-dd格式 示例：2024-01-01 |
| periodQuarterEnd | string | 否 | 否 | 税款所属期止，日期格式yyyy-MM-dd格式格式 示例：2024-01-01 |
| pageNum | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 页码 示例：1 默认值：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 每页数量 示例：20 默认值：20 |

## 3. 请求示例

Url: /yonbip/FCC/yonbip/tax/other-tax/api/collect/list/page?access_token=访问令牌
Body: {
	"nsrsbhs": [
		"91110000600001760P"
	],
	"sbTypes": [
		"1"
	],
	"periodQuarterStart": "2024-01-01",
	"periodQuarterEnd": "2024-01-01",
	"pageNum": 1,
	"pageSize": 20
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 状态码 示例：0000 |
| msg | string | 否 | 提示信息 示例：操作成功 |
| datas | object | 否 | 响应数据 |
| pageNum | number |
| 小数位数:0,最大长度:10 | 否 | 页码 示例：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 每页条数 示例：20 |
| total | number |
| 小数位数:0,最大长度:10 | 否 | 总条数 示例：100 |
| result | object | 是 | 响应数据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"code": "0000",
		"msg": "操作成功",
		"datas": {
			"pageNum": 1,
			"pageSize": 20,
			"total": 100,
			"result": [
				{
					"diworkOrgId": "1765409069748191239",
					"nsrsbh": "91110000600001760P",
					"nsrmc": "用友网络科技股份有限公司",
					"taxOfficeId": "000048b359ee4e338d9872f8d1c2c011",
					"officeName": "国家税务总局福建福安经济开发区税务局",
					"prepayName": "是",
					"periodType": "月",
					"declareBegin": "2025-01-01",
					"declareEnd": "2025-01-31",
					"yssr": 12345,
					"ybtsje": 1000,
					"jmse": 10,
					"jkje": 1234,
					"declareTime": "2025-02-15",
					"paymentTime": "2025-02-15",
					"collectionWay": "税金采集",
					"creator": "测试管理员",
					"createTime": "2025-01-09 20:35:06",
					"modifier": "测试管理员",
					"ts": "2025-01-09 20:35:06",
					"digest": "增值税—一般纳税人",
					"sbTypeArchiveId": "10000",
					"sbTypeArchiveIdName": "增值税",
					"ysbje": 5840.88,
					"sjjnje": 5840.88,
					"taxRefundAmt": 898,
					"taxRefundReason": "",
					"taxItem": "税目"
				}
			]
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

9999	系统发生异常错误，请联系管理员查看日志


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-05

更新

请求说明

新增

返回参数 taxItem


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

