---
title: "固定资产重分类详情查询"
apiId: "1948650044191145993"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Fixed Asset Category Reclassfication"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Category Reclassfication]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产重分类详情查询

>  请求方式	GET | Fixed Asset Category Reclassfication (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/EFI/ReclassBill/detail
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	string	query	否	单据id    示例: 1676456946972491779

## 3. 请求示例

Url: /yonbip/EFI/ReclassBill/detail?access_token=访问令牌&id=1676456946972491779

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
code	number
小数位数:0,最大长度:10	否	返回状态码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	重分类详情信息
id	string	否	主键 示例：1676456946972491779
code	string	否	编码 示例：ZCDR010032
pubts	string	否	时间戳(格式为:yyyy-MM-dd HH:mm:ss) 示例：2023-03-20 12:36:58
verifyState	number
小数位数:0,最大长度:10	否	审核状态(0:初始开立,1:审批中,2:审批完成,3:不通过流程终止,4:驳回到制单) 示例：0
busiPostStatus	string	否	过账状态,枚举值(0:初始值,1:过账成功,2:过账失败,3:过账中,4:不过账) 示例：1
bodies	object	是	重分类变动详情信息

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": "1676456946972491779",
		"code": "ZCDR010032",
		"pubts": "2023-03-20 12:36:58",
		"verifyState": 0,
		"busiPostStatus": "1",
		"bodies": [
			{
				"id": "1676456946972491781",
				"reclassId": "111",
				"assetId": "1676456946972491781",
				"calculateId": "111",
				"beCategoryId": "0005230309068559",
				"afCategoryId": "1529342892468862979",
				"blnNewRule": false
			}
		]
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
999	当前单据被删除或没有权限	查看请求单据是否存在或请求用户是否有权限

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

