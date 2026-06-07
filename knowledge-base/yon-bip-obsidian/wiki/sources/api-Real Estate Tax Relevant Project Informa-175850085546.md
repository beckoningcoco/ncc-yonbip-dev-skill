---
title: "房地产涉税项目信息同步房间"
apiId: "1758500855467212807"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Tax Related Data Management"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Tax Related Data Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 房地产涉税项目信息同步房间

>  请求方式	POST | Tax Related Data Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/tax/yonbip-fi-taxbd/bd/api/land/vat/house/payment/add
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
tList	object	是	否	房屋信息
houseCode	string	否	是	房间编码 示例：1122
houseNum	string	否	是	房间号 示例：1122
productCode	string	否	是	产品类型编码 示例：11222
managementAttribute	string	否	是	经营属性(1可售、2不可售、3自用、4配建) 示例：1
propertyRightAttribute	string	否	是	产权属性(1独立产权、2集体产权、3无产权) 示例：1
location	string	否	是	位置（0地上，1地下） 示例：0
preSaleArea	long	否	否	预售建筑面积 示例：100
preSaleInnerArea	long	否	否	预售套内面积 示例：100
buildingArea	long	否	否	实测建筑面积 示例：100
buildingInnerArea	long	否	否	实测套内面积 示例：100
saleFilingTime	string	否	否	现售备案日期 示例：2023-02-01
signTime	string	否	否	签约日期 示例：2023-02-01
onlineSignTime	string	否	否	网签日期 示例：2023-02-01
totalAmount	BigDecimal	否	否	房间总价 示例：123
unitAmount	BigDecimal	否	否	成交单价 示例：123
bshareAmount	string	否	否	是否分摊土地价款(N否，Y是) 示例：N
unitName	string	否	否	单元名称 示例：1
blockCode	string	否	是	楼栋编码 示例：1122
projectCode	string	否	是	项目编码 示例：llce
installmentCode	string	否	是	分期编码 示例：1122
srcId	string	否	否	来源id 示例：122
cancelMark	string	否	否	作废标识（Y:是，N否） 示例：N

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxbd/bd/api/land/vat/house/payment/add?access_token=访问令牌
Body: {
	"tList": [
		{
			"houseCode": "1122",
			"houseNum": "1122",
			"productCode": "11222",
			"managementAttribute": "1",
			"propertyRightAttribute": "1",
			"location": "0",
			"preSaleArea": 100,
			"preSaleInnerArea": 100,
			"buildingArea": 100,
			"buildingInnerArea": 100,
			"saleFilingTime": "2023-02-01",
			"signTime": "2023-02-01",
			"onlineSignTime": "2023-02-01",
			"totalAmount": 123,
			"unitAmount": 123,
			"bshareAmount": "N",
			"unitName": "1",
			"blockCode": "1122",
			"projectCode": "llce",
			"installmentCode": "1122",
			"srcId": "122",
			"cancelMark": "N"
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
billtype	string	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
creator	string	否	创建人
displayCode	string	否	异常码
message	string	否	响应信息 示例：同步成功
code	string	否	响应编码 示例：200

## 5. 正确返回示例

{
	"message": "同步成功",
	"code": "200"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
9999	系统异常	根据message信息修改
1001	请设置Redis客户端编码	设置redis客户端信息

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

