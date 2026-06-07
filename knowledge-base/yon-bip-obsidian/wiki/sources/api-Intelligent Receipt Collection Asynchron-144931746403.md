---
title: "智能收单异步提交验符"
apiId: "1449317464037916672"
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

# 智能收单异步提交验符

>  请求方式	POST | Intelligent Receipt Collection (SSC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ssc/appDevice/v1/submitVerification/async
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	参数实体
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
billNum	string	否	是	单据号：由获取单据信息接口获取 示例：GRRD220225000002
barCode	string	否	是	单据条码：由费控系统或NCC系统中单据信息中获取的二维码，收单机扫描识别 示例：znbzbx_expensebill|2663540345934592
businessId	string	否	是	业务id：uuid即可，同一批次扫描图片该值要相同 示例：2732913416425728
asyncKey	string	否	是	异步操作key：用于后续查询异步验符结果。 每次提交验符请使用不同的asyncKey值，uuid即可 示例：bd274193-634d-42e4-6719-ac66463d23344
files	object	是	是	上传票据文件数组
deviceCode	string	否	是	设备唯一编号：收单机获取唯一物理ID，用作收单机唯一身份标识 示例：yonyou000001
manufacturer	string	否	是	终端所属厂商标识：由用友分发标识符 示例：yonyou

## 3. 请求示例

Url: /yonbip/ssc/appDevice/v1/submitVerification/async?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"billNum": "GRRD220225000002",
		"barCode": "znbzbx_expensebill|2663540345934592",
		"businessId": "2732913416425728",
		"asyncKey": "bd274193-634d-42e4-6719-ac66463d23344",
		"files": [
			{
				"fileId": "625908057ca0ec3ccea206e9",
				"checked": true,
				"uploadImageId": "sjLm9Tu0gFJatgxOcRiSUd9s9DRozfxK4IWE"
			}
		],
		"deviceCode": "yonyou000001",
		"manufacturer": "yonyou"
	}
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

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1023060400013	数据重复提交	更新幂等key值提交
1023060400010	设备编号不存在	设备编号未绑定
1023060400007	信息已过期，请重新扫码	信息已过期，请重新扫码
1023060400008	提交的图片信息为空	提交的图片信息为空
1023060400009	提交的选中图片为空	检查图片信息
1023060400035	同一单据号同一批次已提交，请重新扫码提单	重新扫码提单

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

