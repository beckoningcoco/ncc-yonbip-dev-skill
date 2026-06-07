---
title: "担保额度执行"
apiId: "2085264905103474694"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Quota Execution"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Quota Execution]
platform_version: "BIP"
source_type: community-api-docs
---

# 担保额度执行

> `ContentType	application/json` 请求方式	POST | 分类: Quota Execution (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/grmOpenApi/quotaEnforcement

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
| accentity | string | 否 | 是 | 资金组织 示例：1524864006176636931 |
| executionOrderType | string | 否 | 是 | 执行单类型：1-占用、2-释放 示例：1 |
| protocol | string | 否 | 是 | 协议号：占用/释放担保的业务编号（比如融资合同的合同号，信用证业务的信用证编号等） 示例：担保调用 |
| exeCurrency | string | 否 | 是 | 币种 示例：1524777565678469141 |
| amount | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 金额：为明细子表的执行金额合计，释放的金额不能超过占用的额度 示例：100 |
| beginDate | date |
| 格式:yyyy-MM-dd | 否 | 是 | 开始日期 示例：2024-12-20 |
| endDate | date |
| 格式:yyyy-MM-dd | 否 | 是 | 到期日期 示例：2025-12-20 |
| executionDate | date |
| 格式:yyyy-MM-dd | 否 | 是 | 执行日期：占用/释放担保的业务日期，执行单类型=占用，执行日期应介于担保合同开始日期、结束日期之间；执行单类型=释放，不控制日期 示例：2024-12-20 |
| business | string | 否 | 是 | 所属业务：104-授信管理、105-投融资管理、106-商业汇票、107-保函管理、108-信用证管理、109-外部系统 示例：104 |
| srcitem | string | 否 | 是 | 来源系统：104-授信管理、105-投融资管理、106-商业汇票、107-保函管理、108-信用证管理、109-外部系统 示例：104 默认值：109 |
| businessBillId | string | 否 | 是 | 来源业务单据ID 示例：2160157452424708099 |
| businessCode | string | 否 | 是 | 来源业务单据：来源业务单据唯一 示例：CAMCONT202412201177 |
| systemCode | string | 否 | 是 | 业务系统编码 示例：YONBIP-FI-CTMCAM |
| serviceCode | string | 否 | 是 | 业务单据服务编码 示例：cam_agreementlist |
| data | object | 是 | 是 | 合同ID信息 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| bcontractCode | string | 否 | 是 | 担保合同id 示例：2160156627790987277 |
| bexecutionAmount | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 执行金额 示例：100 |

## 3. 请求示例

Url: /yonbip/ctm/grmOpenApi/quotaEnforcement?access_token=访问令牌
Body: {
	"accentity": "1524864006176636931",
	"executionOrderType": "1",
	"protocol": "担保调用",
	"exeCurrency": "1524777565678469141",
	"amount": 100,
	"beginDate": "2024-12-20",
	"endDate": "2025-12-20",
	"executionDate": "2024-12-20",
	"business": "104",
	"srcitem": "104",
	"businessBillId": "2160157452424708099",
	"businessCode": "CAMCONT202412201177",
	"systemCode": "YONBIP-FI-CTMCAM",
	"serviceCode": "cam_agreementlist",
	"data": [
		{
			"resubmitCheckKey": "",
			"bcontractCode": "2160156627790987277",
			"bexecutionAmount": 100
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
| code | string | 否 | 接口返回码 示例：200 |
| message | string | 否 | 返回消息 示例：成功 |
| id | string | 否 | 额度执行id |

## 5. 正确返回示例

{
	"code": "200",
	"message": "成功",
	"id": ""
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

500	接口错误


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

