---
title: "卡券档案列表查询"
apiId: "94db2c42a26b4fc5b32919fdc2a2e657"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Coupon"
domain: "MemberServer"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Coupon]
platform_version: "BIP"
source_type: community-api-docs
---

# 卡券档案列表查询

>  请求方式	POST | Coupon (MemberServer)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/coupon/archives/query
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
pageSize	int	否	是	每页行数 示例：10
pageIndex	int	否	是	页码 示例：1
simpleVOs	object	是	否	扩展查询条件
field	string	否	否	属性名(条件)(1.cEPName(商家名称) 2.cTitle(卡券标题) 3.cSubTitle(卡券副标题) 4.iType(卡券类别 1：代金券 2:折扣券 5:计次券 6：兑换券) 5.dEffectDate(生效日期 value1 value2 格式：1614268799 秒值) 6.cAppID(会籍cAppID))7.dExpDate(过期日期 value1 value2 格式：1614268799 秒值) 示例：cEPName
value1	string	否	否	值1
value2	string	否	否	值2
op	string	否	否	比较符(条件eq:相等, neq：不等, lt：小于, gt：大于, elt：小于等于, egt：大于等于, between：区间, in：包含, nin：不包含, like：包含字符, leftlike：左侧字符包含, rightlike：右侧字符包含, is_null：为空, is_not_null：不为空, and：和, or：或 )
logicOp	string	否	否	逻辑连接符(and：且；or：或) 注：logicOp有值时，conditions条件生效，logicOp同级的其他条件不生效；logicOp无值时，conditions条件不生效，logicOp同级设置的其他条件生效 示例：or
conditions	object	是	否	查询条件

## 3. 请求示例

Url: /yonbip/sd/coupon/archives/query?access_token=访问令牌
Body: {
	"pageSize": 10,
	"pageIndex": 1,
	"simpleVOs": [
		{
			"field": "",
			"value1": "",
			"value2": "",
			"op": "",
			"logicOp": "or",
			"conditions": [
				{
					"field": "cTitle",
					"value1": "卡券名称",
					"value2": "",
					"op": "eq"
				}
			]
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
code	int	否	状态码 示例：200
message	string	否	参数返回信息 示例：操作成功
data	object	否	数据对象
code	string	否	单据编号
code	string	否	单据编号
pageIndex	int	否	页码 示例：1
pageSize	int	否	每页行数 示例：2
recordCount	int	否	数据总行数 示例：1
recordList	object	是	数据详情
pageCount	int	否	页码 示例：1
beginPageIndex	int	否	第一页页码 示例：1
endPageIndex	int	否	最后一页页码 示例：1

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 2,
		"recordCount": 1,
		"recordList": [
			{
				"cAppID": "yl_cAVNBX8YGbWS",
				"iUnReceiveCount": 0,
				"bSyncWeChatCoupon": false,
				"dEffectDate": 1506528000,
				"iPreCouponCount": 0,
				"bWXCreated": 1,
				"iintervalEffectUnit": 1,
				"cEPName": "testzx",
				"iExpMode": 1,
				"iintervalExpUnit": 1,
				"iReceiveCount": 0,
				"iType": 1,
				"iFirstAttentionSend": 0,
				"bOutImport": true,
				"dExpDate": 1512057600,
				"cTitle": "test",
				"cCopyUrl": "http://u8cvip-test.yyuap.com/app/mm.php/MM/GetCoupon/portal.php?wid=gh_0a27fb331746&appid=yl_cAVNBX8YGbWS&couponid=1148",
				"bCrossMembershipGive": false,
				"id": 1148,
				"cAppName": "test1019_001_yl_5WitCYPKXhUf"
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
404	未查询到数据	查询条件填写有误

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
请求参数 amount

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

