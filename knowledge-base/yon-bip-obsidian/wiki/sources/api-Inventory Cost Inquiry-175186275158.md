---
title: "存货成本查询"
apiId: "1751862751585107977"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Period Balance"
domain: "EFI"
date: 2026-06-07
tags: [YonBIP, OpenAPI]
source_type: community-api-docs
---

# 存货成本查询

>  请求方式	POST | Period Balance (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/EFI/fieia/queryBalance
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

只看必填项
名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
企业自建获取token
服务商获取token
Body参数
名称	类型	数组	必填	描述
dataType	string	否	是	数据类型：枚举值 1.期初成本 2.期末成本 3.年初成本 4.最新成本 示例：1
accentity	string	否	是	会计主体ID 示例：1746236822491392
resultCount	long	否	是	返回明细条数,最多10条 示例：10 默认值：1
date	string	否	是	取数日期 格式yyyy-mm-dd 示例：2019-09-12
params	object	是	是	查询参数子项
accBook	string	否	是	账簿ID 示例：132321
accpurpose	string	否	否	核算目的ID 示例：331231
stockOrg	string	否	否	库存组织ID，根据会计主体的成本域层级确定是否传参，例如：成本域层级为库存组织+仓库，则库存组织和仓库id都要传值 示例：1362549404881152
warehouse	string	否	否	仓库ID，根据会计主体的成本域层级确定是否传参，例如：成本域层级为库存组织+仓库，则库存组织和仓库id都要传值 示例：2001009921675520
materialId	string	否	是	物料ID 示例：1470258881155328
batchNo	string	否	否	物料为批次核算，批次号必输 示例：0000001

## 3. 请求示例

Url: /yonbip/EFI/fieia/queryBalance?access_token=访问令牌
Body: {
	"dataType": "1",
	"accentity": "1746236822491392",
	"resultCount": 10,
	"date": "2019-09-12",
	"params": [
		{
			"accBook": "132321",
			"accpurpose": "331231",
			"stockOrg": "1362549404881152",
			"warehouse": "2001009921675520",
			"materialId": "1470258881155328",
			"batchNo": "0000001"
		}
	]
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
code	string	否	code 示例：200
message	string	否	描述信息 示例：查询成功
data	object	否	业务数据
dataType	string	否	数据类型 枚举值 1.期初成本 2.期末成本 3.年初成本 4.最新成本 示例：1
date	string	否	取数日期 示例：2020-11-12
resultCount	long	否	返回数 示例：1
dataList	object	是	查询结果数据

## 5. 正确返回示例

{
	"code": "200",
	"message": "查询成功",
	"data": {
		"dataType": "1",
		"date": "2020-11-12",
		"resultCount": 1,
		"dataList": [
			{
				"accentity": "2080120785195264",
				"accpurpose": "",
				"stockOrg": "",
				"warehouse": "",
				"materialId": "",
				"dataList": [
					{
						"num": "10.00",
						"price": "50.00",
						"money": "500.00",
						"costDomainVO": {
							"accentity": "2063146257060864",
							"accbook": "2063147411940096",
							"pricingMethod": "1",
							"code": "yx5",
							"name": "yx5",
							"id": "2063362710279680",
							"pubts": "1616412421498",
							"level": "1"
						},
						"inventoryObjectVO": {
							"materialId": 2063351892054272,
							"id": "2063395383399936"
						}
					}
				]
			}
		]
	}
}

## 6. 业务异常码

查看业务异常码
异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
999	会计主体不能为空	会计主体必填

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

