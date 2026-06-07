---
title: "房产税源信息编辑接口_新"
apiId: "2120880388833804297"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Property tax source information"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Property tax source information]
platform_version: "BIP"
source_type: community-api-docs
---

# 房产税源信息编辑接口_新

> `ContentType	application/json` 请求方式	POST | 分类: Property tax source information (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/other-tax/api/house-account/v1/update

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| orgCode | string | 否 | 是 | 税务组织编码 示例：OR0011 |
| projectCode | string | 否 | 否 | 项目编码 示例：PR0011 |
| landNum | string | 否 | 否 | 房屋所在土地编号为企业在税局备案的城镇土地使用税土地税源的土地编号 示例：LN0011 |
| lyid | string | 否 | 否 | 来源业务id,唯一（来源业务id和房产税源编号不可同时为空，且不能同时填写） 示例：SR0011 |
| isArchived | string | 否 | 否 | 是否已在税局备案：0-未备案、1-已备案 示例：1 |
| houseCode | string | 否 | 否 | 房产编号 示例：HD0011 |
| name | string | 否 | 否 | 房产名称 示例：一等房子 |
| uses | string | 否 | 否 | 房产用途：1：工业 2:商业及办 公 3:住房 4:其他 示例：1 |
| obtainTime | string | 否 | 否 | 房产取得时间:yyyy-MM-dd格式 示例：2024-01-01 |
| constructionArea | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 建筑面积：至多13位整数+2位小数，非负数 示例：150 |
| taxPayerType | string | 否 | 否 | 纳税人类型：1：产权所有人 2:经营管理人 3:承典人 4: 房屋代管人 5:房屋使用人 6：融资租赁承 租人 示例：1 |
| ownerOrgCode | string | 否 | 否 | 所有权税务组织编码 示例：OR1011 |
| ownerCode | string | 否 | 否 | 所有权人识别号:支持数值+大小写字母输入，控制在15位 示例：OW0011 |
| ownerName | string | 否 | 否 | 所有权人名称 示例：所有 |
| unitType | string | 否 | 否 | 不动产权证类型：1.不动产权证（原新证） 2.房屋所有权证（原其他证书） 3.其他(原暂未取得） 示例：1 |
| unitNum | string | 否 | 否 | 不动产单元号,长度不超过 50 个字符 示例：UN1011 |
| certNum | string | 否 | 否 | 不动产权证号:长度不超过 50 个字符 示例：CN0011 |
| province | string | 否 | 否 | 省/直辖市 示例：北京市 |
| city | string | 否 | 否 | 市 示例：市辖区 |
| area | string | 否 | 否 | 区 示例：海淀区 |
| town | string | 否 | 否 | 城镇/街道 示例：上地街道 |
| detailAddr | string | 否 | 否 | 房屋详细地址 示例：龙溪苑一区 |
| taxOfficeName | string | 否 | 否 | 房屋所属主管税务所（科，分局） 示例：北京市税管所 |
| taxRate | number |
| 小数位数:2,最大长度:5 | 否 | 否 | 计税比例 示例：70 |
| isAutoUpTaxAccount | string | 否 | 否 | 自动生成/更新房产税台账：1是、0否 示例：1 |
| code | string | 否 | 否 | 房产税源编码 示例：CD1011 |
| baseRegionCode | string | 否 | 否 | 行政区划代码 示例：110000000000 |
| isInvolvedHouseVatDetail | string | 否 | 否 | 涉及房产税：枚举 1是，0否 示例：1 |
| houseAccountAuxiliaryFacilityDetailList | object | 是 | 否 | 房源设施 |
| sourceId | string | 否 | 否 | 设施来源业务id（设施来源业务id和设施编号不可同时为空，且不能同时填写） 示例：123456789 |
| auxiliaryFacilityDetailCode | string | 否 | 否 | 设施编号（设施来源业务id和设施编号不可同时为空，且不能同时填写） 示例：SS20250208000001 |
| sourceCode | string | 否 | 否 | 设施来源业务编号 示例：DAS55 |
| auxiliaryFacilityDetailName | string | 否 | 是 | 设施名称 示例：设施1 |
| isInvolvedHouseVatDetail | string | 否 | 否 | 涉及房产税：0-否 1-是 示例：1 |
| useMonth | string | 否 | 是 | 投入使用月份，格式为yyyy-MM 示例：2024-12 |
| auxiliaryFacilityDetailValue | number |
| 小数位数:2,最大长度:15 | 否 | 是 | 设施价值 示例：10000 |
| calcAlloLandValueByHouse | boolean | 否 | 否 | 按照房屋计算应摊入土地价值 默认值：false |
| constructionArea | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 建筑面积 |
| shouldAllocatedLandValue | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 应摊入土地价值 |

## 3. 请求示例

Url: /yonbip/tax/other-tax/api/house-account/v1/update?access_token=访问令牌
Body: [{
	"orgCode": "OR0011",
	"projectCode": "PR0011",
	"landNum": "LN0011",
	"lyid": "SR0011",
	"isArchived": "1",
	"houseCode": "HD0011",
	"name": "一等房子",
	"uses": "1",
	"obtainTime": "2024-01-01",
	"constructionArea": 150,
	"taxPayerType": "1",
	"ownerOrgCode": "OR1011",
	"ownerCode": "OW0011",
	"ownerName": "所有",
	"unitType": "1",
	"unitNum": "UN1011",
	"certNum": "CN0011",
	"province": "北京市",
	"city": "市辖区",
	"area": "海淀区",
	"town": "上地街道",
	"detailAddr": "龙溪苑一区",
	"taxOfficeName": "北京市税管所",
	"taxRate": 70,
	"isAutoUpTaxAccount": "1",
	"code": "CD1011",
	"baseRegionCode": "110000000000",
	"isInvolvedHouseVatDetail": "1",
	"houseAccountAuxiliaryFacilityDetailList": [
		{
			"sourceId": "123456789",
			"auxiliaryFacilityDetailCode": "SS20250208000001",
			"sourceCode": "DAS55",
			"auxiliaryFacilityDetailName": "设施1",
			"isInvolvedHouseVatDetail": "1",
			"useMonth": "2024-12",
			"auxiliaryFacilityDetailValue": 10000,
			"calcAlloLandValueByHouse": true,
			"constructionArea": 0,
			"shouldAllocatedLandValue": 0
		}
	]
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 响应码 示例：200 |
| message | string | 否 | 响应信息 示例：成功 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

9999	系统异常	根据message信息修改

1001	请设置Redis客户端编码	设置redis客户端信息


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-17

更新

请求说明

新增

请求参数 (6)

更新

请求参数 isInvolvedHouseVatDetail

删除

请求参数 plotRatio

房产税源支持按照房屋维护应摊入土地价值

2	2025-07-03

新增

请求参数 baseRegionCode

更新

请求参数 orgCode

更新

请求参数 ownerOrgCode

更新

请求参数 ownerCode

3	2025-05-30

更新

请求参数 ownerCode


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

