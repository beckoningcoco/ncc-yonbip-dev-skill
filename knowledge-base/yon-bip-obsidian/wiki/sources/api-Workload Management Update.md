---
title: "工作量管理更新"
apiId: "2097736648319041540"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Workload Mgmt"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Workload Mgmt]
platform_version: "BIP"
source_type: community-api-docs
---

# 工作量管理更新

> `ContentType	application/json` 请求方式	POST | 分类: Workload Mgmt (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/wotkmanage/update

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 否 | data |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| accbook | string | 否 | 否 | 账簿id 示例：123 |
| periodId | string | 否 | 否 | 期间id 示例：123231 |
| period | string | 否 | 否 | 期间编码 示例：2023-04-11 |
| assetId | string | 否 | 否 | 固定资产id 示例：到付 |
| assetCode | string | 否 | 否 | 固定资产编码 示例：123 |
| monthWorkload | number |
| 小数位数:8,最大长度:48 | 否 | 否 | 本月工作量 示例：0 |

## 3. 请求示例

Url: /yonbip/EFI/wotkmanage/update?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "",
			"accbook": "123",
			"periodId": "123231",
			"period": "2023-04-11",
			"assetId": "到付",
			"assetCode": "123",
			"monthWorkload": 0
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | 编码 示例：200 |
| message | string | 否 | 信息 示例：操作成功 |
| data | object | 否 | 明细 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 修改总数 示例：4 |
| sucessCount | number |
| 小数位数:0,最大长度:10 | 否 | 修改成功数量 示例：0 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 修改失败数量 示例：4 |
| messages | string | 是 | 结果 示例：["修改卡片:【0302240327000088】的会计期间:202408小于最小未结帐期期间:202501"] |
| infos | object | 是 | 修改成功明细 |
| failInfos | object | 是 | failInfos |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"count": 4,
		"sucessCount": 0,
		"failCount": 4,
		"messages": [
			"修改卡片:【0302240327000088】的会计期间:202408小于最小未结帐期期间:202501"
		],
		"infos": [
			{
				"accentity": "1959167903688294403",
				"accbook": "1959177438522507281",
				"periodId": "1939096172892258699",
				"period": "234",
				"assetId": "1961136527729229829",
				"assetIdCode": "0302240327000088",
				"monthWorkload": 100
			}
		],
		"failInfos": [
			{
				"accentity": "1959167903688294403",
				"accbook": "1959177438522507281",
				"periodId": "1939096172892258699",
				"period": "2024-08",
				"assetId": "1961136527729229829",
				"assetIdCode": "0302240327000088",
				"monthWorkload": 100
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	会计主体不允许为空	请求参数中输入会计主体id


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

