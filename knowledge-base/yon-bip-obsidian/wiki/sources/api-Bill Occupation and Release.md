---
title: "票据占用及释放"
apiId: "2005131578546585607"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Bill Registration"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Bill Registration]
platform_version: "BIP"
source_type: community-api-docs
---

# 票据占用及释放

> `ContentType	application/json` 请求方式	POST | 分类: Bill Registration (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/api/noteInformation/preUseBill

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| accentityCode | string | 否 | 否 | 会计主体编码，名称编码二者其一必填 示例：A001 |
| accentityName | string | 否 | 否 | 会计主体名称，名称编码二者其一必填 示例：成都分公司 |
| releaseRecords | object | 是 | 否 | 需释放数据循环体 |
| direction | number |
| 小数位数:0,最大长度:1 | 否 | 是 | 收付方向 1=收款2=付款 示例：1 |
| pkRegister | string | 否 | 是 | 票据id 示例：1234441 |
| outerhid | string | 否 | 是 | 来源单据主键，需传给司库-待结算数据 示例：121333 |
| outerbid | string | 否 | 是 | 来源单据明细主键，需传给司库待结算数据，若单据不是主子表结构则值同outerhid 示例：1234444 |
| outertradetype | string | 否 | 是 | 交易类型 示例：1234444 |
| outerbilltype | string | 否 | 是 | 单据类型默认传98=外部单据 示例：98 默认值：98 |
| outereventype | string | 否 | 是 | 事项类型默认传98=外部单据 示例：98 默认值：98 |
| transMoney | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 交易金额 示例：521 |
| billRangeStart | number |
| 小数位数:0,最大长度:12 | 否 | 否 | 子票区间开始，如果已在网银办理，需填写 示例：400 |
| billRangeEnd | number |
| 小数位数:0,最大长度:12 | 否 | 否 | 子票区间结束，如果已在网银办理，需填写 示例：88888888 |
| preUseRecords | object | 是 | 否 | 预占用数据循环体 |
| direction | number |
| 小数位数:0,最大长度:1 | 否 | 是 | 收付方向 1=收款2=付款 示例：1 |
| pkRegister | string | 否 | 是 | 票据id 示例：1234441 |
| outerhid | string | 否 | 是 | 来源单据主键，需传给司库-待结算数据 示例：121333 |
| outerbid | string | 否 | 是 | 来源单据明细主键，需传给司库待结算数据，若单据不是主子表结构则值同outerhid 示例：1234444 |
| outertradetype | string | 否 | 是 | 交易类型 示例：1234444 |
| outerbilltype | string | 否 | 是 | 单据类型默认传98=外部单据 示例：98 默认值：98 |
| outereventype | string | 否 | 是 | 事项类型默认传98=外部单据 示例：98 默认值：98 |
| transMoney | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 交易金额 示例：521 |
| billRangeStart | number |
| 小数位数:0,最大长度:12 | 否 | 否 | 子票区间开始，如果已在网银办理，需填写 示例：400 |
| billRangeEnd | number |
| 小数位数:0,最大长度:12 | 否 | 否 | 子票区间结束，如果已在网银办理，需填写 示例：88888888 |

## 3. 请求示例

Url: /yonbip/ctm/api/noteInformation/preUseBill?access_token=访问令牌
Body: {
	"accentityCode": "A001",
	"accentityName": "成都分公司",
	"releaseRecords": [
		{
			"direction": 1,
			"pkRegister": "1234441",
			"outerhid": "121333",
			"outerbid": "1234444",
			"outertradetype": "1234444",
			"outerbilltype": "98",
			"outereventype": "98",
			"transMoney": 521,
			"billRangeStart": 400,
			"billRangeEnd": 88888888
		}
	],
	"preUseRecords": [
		{
			"direction": 1,
			"pkRegister": "1234441",
			"outerhid": "121333",
			"outerbid": "1234444",
			"outertradetype": "1234444",
			"outerbilltype": "98",
			"outereventype": "98",
			"transMoney": 521,
			"billRangeStart": 400,
			"billRangeEnd": 88888888
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
| code | string | 否 | 请求结果 00=成功 01=失败，整批处理，全部成功或者全部失败 示例：00 |
| message | string | 否 | 返回信息 示例：处理成功 |

## 5. 正确返回示例

{
	"code": "00",
	"message": "处理成功"
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

