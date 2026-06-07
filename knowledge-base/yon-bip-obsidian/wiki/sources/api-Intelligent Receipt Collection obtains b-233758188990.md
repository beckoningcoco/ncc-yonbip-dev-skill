---
title: "智能收单获取首页基础信息V2"
apiId: "2337581889902084100"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Intelligent Receipt Collection"
domain: "SSC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Intelligent Receipt Collection]
platform_version: "BIP"
source_type: community-api-docs
---

# 智能收单获取首页基础信息V2

>  请求方式	POST | Intelligent Receipt Collection (SSC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/FCC/SSC/IA_ZNSD/appDevice/v2/getHomeData
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
deviceCode	string	否	是	设备唯一编号：收单机获取唯一物理ID，用作收单机唯一身份标识 示例：yonyou000001
manufacturer	string	否	是	终端所属厂商标识：由用友分发标识符 示例：yonyou

## 3. 请求示例

Url: /yonbip/FCC/SSC/IA_ZNSD/appDevice/v2/getHomeData?access_token=访问令牌
Body: {
	"deviceCode": "yonyou000001",
	"manufacturer": "yonyou"
}

## 4. 返回值参数

名称	类型	数组	描述
billtype	string	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
creator	string	否	创建人
creator	string	否	创建人
displayCode	string	否	异常码
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
salesOrgId	string	否	销售组织id
saleDepartmentId	string	否	销售部门id
transactionTypeId	string	否	交易类型id
settlementOrgId	string	否	开票组织id
bizId	string	否	商家id
createDate	string	否	创建时间
synSourceOrg	string	否	协同来源组织id
ecsuiteuser	string	否	气泡联系人
ecsuiteuser	string	否	气泡联系人
billtype	string	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
creator	string	否	创建人
displayCode	string	否	异常码
code	string	否	成功为200，错误提示为其他值 示例：200
message	string	否	成功提示或错误提示 示例：操作成功
data	object	否	返回数据
tenantInfo	object	否	租户信息
deviceInfo	object	否	如果该字段为空，则说明服务是待开通状态或设备许可已过期

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"tenantInfo": {
			"logo": "https://cdn.yonyoucloud.com/combine/yht/tenant/logo/1627034728811.png",
			"yTenantId": "0000KR63PRZP59AUWY0000",
			"tenantName": "0716日常旗舰全1",
			"mandatoryAcquiring": true
		},
		"deviceInfo": {
			"openedOcr": true,
			"helpManualurl": "https://wenku.baidu.com/view/7c21cdf0f61fb7360b4c65e9.html?fr=income4-wk_app_search_ctrX-search",
			"code": "3bc83e85-0ce3-4934-bed9-7b8e60aecafd",
			"location": "8号楼4B",
			"status": 1,
			"billReceivedNum": 0,
			"leftReceivedNum": 300,
			"maxReceivedNum": 300,
			"hotLine": "13678590002",
			"name": "收单机器",
			"adminPhone": "13678590002",
			"alertPhone": "13678590002",
			"openTime": "2022-03-07 15:03:03",
			"boxInfo": [
				{
					"id": "5971161365450588333",
					"boxNum": "1",
					"billReceivedNum": 20,
					"leftReceivedNum": 280,
					"maxReceiveNum": 300,
					"alertReceiveNum": 200,
					"orgs": [
						{
							"code": "test",
							"name": "test"
						}
					]
				}
			],
			"verificationCodeMode": 0,
			"mandatoryAcquiringCount": 0
		}
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
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

