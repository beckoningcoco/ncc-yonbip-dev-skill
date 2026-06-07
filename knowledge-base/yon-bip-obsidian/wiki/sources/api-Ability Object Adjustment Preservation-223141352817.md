---
title: "能力对象调节保存"
apiId: "2231413528170856452"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Capacity Object"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Capacity Object]
platform_version: "BIP"
source_type: community-api-docs
---

# 能力对象调节保存

>  请求方式	POST | Capacity Object (MF)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/mfg/capacityAdjust/save
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	是	新增的数据集合
orgId	string	否	否	组织 id，可为空，若为空会通过编码查询 示例：1890903916826591237
orgCode	string	否	否	组织编码，可为空，若为空会通过 id 查询 示例：hytc
capacityObjectType	string	否	是	能力对象类型 (fixture工装，resource物料) 示例：resource
capacityObjectId	number
小数位数:0,最大长度:32	否	否	能力对象 id，可为空，若为空会通过编码查询 示例：2235204034466676740
capacityObjectCode	string	否	否	能力对象编码，可为空，若为空会通过 id 查询 示例：000006
adjustmentDate	date
格式:yyyy-MM-dd	否	是	调节日期 示例：2025-05-01
adjustmentType	number
小数位数:0,最大长度:5	否	是	调节类型(10期初，20调增，30调减) 示例：20
adjustmentQuantity	number
小数位数:3,最大长度:10	否	是	调节量 示例：10
unitId	number
小数位数:0,最大长度:32	否	否	单位 id，可为空，若为空会通过编码查询 示例：1892244650984996881
unitCode	string	否	否	单位编码，可为空，若为空会通过 id 查询 示例：KG
conversionRate	number
小数位数:3,最大长度:10	否	否	换算率 示例：1000

## 3. 请求示例

Url: /yonbip/mfg/capacityAdjust/save?access_token=访问令牌
Body: {
	"data": [
		{
			"orgId": "1890903916826591237",
			"orgCode": "hytc",
			"capacityObjectType": "resource",
			"capacityObjectId": 2235204034466676740,
			"capacityObjectCode": "000006",
			"adjustmentDate": "2025-05-01",
			"adjustmentType": 20,
			"adjustmentQuantity": 10,
			"unitId": 1892244650984996881,
			"unitCode": "KG",
			"conversionRate": 1000
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
message	string	否	信息 示例：操作成功
data	string	否	响应信息
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	单据编号
code	string	否	单据编号
code	string	否	返回码，成功时返回200，失败时返回999 示例：200
message	string	否	状态信息 示例：操作成功

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
0	未传入优惠券档案id	coupon_id值填写有误
999	抱歉，系统出现了一些问题，请稍后再试。如果问题持续，请联系技术支持。	

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

