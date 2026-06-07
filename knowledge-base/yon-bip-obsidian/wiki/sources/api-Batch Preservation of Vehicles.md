---
title: "车辆批量保存V2"
apiId: "2229984987671166982"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Vehicle"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Vehicle]
platform_version: "BIP"
source_type: community-api-docs
---

# 车辆批量保存V2

> `ContentType	application/json` 请求方式	POST | 分类: Vehicle (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/basedoc/vehicle/batchSave

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| matchRule | string | 否 | 是 | 对已存在数据的匹配规则，用于判断数据是否已经存在。id-按数据中的主键字段匹配、code-按数据中的编码字段匹配。默认按主键查询已存在数据 示例：add 默认值：id |
| unmatchedStrategy | string | 否 | 是 | 按matchRule查询不到数据时的默认处理方式，add-查询不到数据默认新增、error-提示错误。默认为查询不到按新增处理 示例：add 默认值：add |
| data | object | 是 | 否 | 业务数据 |
| vmainlicense | string | 否 | 是 | 车牌号 示例：111 |
| ccarrierid | string | 否 | 否 | 承运商ID，编码与ID二选一填入即可，当有ID的时候取ID，编码不生效。 示例：3004531958878464 |
| ccarrierid___code | string | 否 | 否 | 承运商编码，编码与ID二选一填入即可，当有ID的时候取ID，编码不生效。 示例：A123 |
| fleet | string | 否 | 否 | 车队 示例：xxxx |
| owner | string | 否 | 否 | 车主 示例：2 |
| ivehiclesort | string | 否 | 是 | 类型，0：货车，1：非货车。 示例：0 |
| ntypeaxlenum | string | 否 | 否 | 轴数，1：2轴，2：3轴，3：4轴，4：5轴，5：6轴，6：6轴以上。 示例：5 |
| emission | string | 否 | 否 | 排放标准，1国IV，2国V，3国VI。 示例：0 |
| energytype | string | 否 | 否 | 能源类型，1汽油，2柴油，3纯电动，4油电混动，5液化天然气LNG，6压缩天然气CNG，7氢燃料，8甲醇，9其他。 示例：新能源 |
| terminalid | string | 否 | 是 | 车载终端ID 示例：111 |
| cartypeid | string | 否 | 否 | 车辆类型ID。编码与ID二选一填入即可，当有ID的时候取ID，编码不生效。 示例：3253648653734144 |
| cartypeid___code | string | 否 | 否 | 车辆类型编码。编码与ID二选一填入即可，当有ID的时候取ID，编码不生效。 示例：2 |
| pk_vehicletype | string | 否 | 否 | 标准车型，1：普通货车，2：厢式货车，3：封闭货车，4：罐式货车，5：平板货车，6：集装箱(货柜)车，7：自卸货车，8：特殊结构火车，9：仓栅式货车，10：普通挂车，11：厢式挂车，12：罐式挂车，13：平板挂车，14：集装箱(货柜)挂车，15：自卸挂车，16：仓栅式挂车，17：专项作业挂车，18：牵引车，19：车辆运输车，20：专项作业车，21：其他，22：非货车。 示例：1 |
| carlength | string | 否 | 否 | 标准车长，1：4.2米，2：4.5米，3：5.2米，4：5.8米， 5：6.2米，6：6.8米，7：7.2米，8：7.8米，9：8.2米，10：8.8米，11：9.6米，12：11.6米，13：12米，14：12.5米，15：13米，16：13.5米，17：15米，18：16米，19：17.5米，20：不限。 示例：5 |
| nbaseload | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 标准载重 示例：2 |
| nloadfactor | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 载重系数 示例：2 |
| nmaxload | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 最大载重 示例：5.88 |
| ndbaseestload | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 标准皮重 示例：1.39 |
| ndnewestload | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 最新皮重 示例：1.59 |
| maxoverload | number |
| 小数位数:1,最大长度:10 | 否 | 否 | 总质量限值（超载） 示例：8.2 |
| cmeamunit | string | 否 | 否 | 计量单位ID 示例：1554602256549019654 |
| cmeamunit___code | string | 否 | 否 | 计量单位编码 |
| btarevalidctrl | string | 否 | 是 | 限时皮重，1是，0否 示例：0 |
| adminvehicle | string | 否 | 是 | 行政车辆，1是，0否 示例：0 |
| iscold | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 是否冷藏车，1是，0否 示例：0 |
| isblack | string | 否 | 否 | 黑名单车辆，1是，0否 示例：0 |
| bcombine | string | 否 | 否 | 是否子母车，1是，0否 示例：0 |
| benable | string | 否 | 否 | 启用状态，1启用，0停用 示例：1 |
| vremark | string | 否 | 否 | 备注 示例：111 |
| carrierList | object | 是 | 否 | 可用承运商 |
| materielList | object | 是 | 否 | 专属物料 |
| clientList | object | 是 | 否 | 客户子表 |
| supplierList | object | 是 | 否 | 供应商子表 |
| certificateList | object | 是 | 否 | 证照 |
| driverList | object | 是 | 否 | 司机子表 |
| sourceUnique | string | 否 | 是 | 源系统唯一标识 示例：2148930794371940361 |
| id | string | 否 | 否 | 主键ID 示例：1554602256549019569 |

## 3. 请求示例

Url: /yonbip/digitalModel/basedoc/vehicle/batchSave?access_token=访问令牌
Body: {
	"matchRule": "add",
	"unmatchedStrategy": "add",
	"data": [
		{
			"vmainlicense": "111",
			"ccarrierid": "3004531958878464",
			"ccarrierid___code": "A123",
			"fleet": "xxxx",
			"owner": "2",
			"ivehiclesort": "0",
			"ntypeaxlenum": "5",
			"emission": "0",
			"energytype": "新能源",
			"terminalid": "111",
			"cartypeid": "3253648653734144",
			"cartypeid___code": "2",
			"pk_vehicletype": "1",
			"carlength": "5",
			"nbaseload": 2,
			"nloadfactor": 2,
			"nmaxload": 5.88,
			"ndbaseestload": 1.39,
			"ndnewestload": 1.59,
			"maxoverload": 8.2,
			"cmeamunit": "1554602256549019654",
			"cmeamunit___code": "",
			"btarevalidctrl": "0",
			"adminvehicle": "0",
			"iscold": 0,
			"isblack": "0",
			"bcombine": "0",
			"benable": "1",
			"vremark": "111",
			"carrierList": [
				{
					"carrierid": "3004531958878464",
					"carrierid___code": "",
					"is_default": 1
				}
			],
			"materielList": [
				{
					"materielid": "3253648653734144",
					"materielid___code": ""
				}
			],
			"clientList": [
				{
					"clientclassificationid": "3004531958878464",
					"clientclassificationid___code": "02",
					"clientid": "3253648653734144",
					"clientid___code": "518"
				}
			],
			"supplierList": [
				{
					"supplierid": "3004531958878464",
					"supplierid___code": "112"
				}
			],
			"certificateList": [
				{
					"licensetype": "8",
					"drivingnumber": "111",
					"enddate": "2025-01-06",
					"attachmentId": "111"
				}
			],
			"driverList": [
				{
					"driverid": ""
				}
			],
			"sourceUnique": "2148930794371940361",
			"id": "1554602256549019569"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回值，成功返回200 示例：200 |
| success | boolean | 否 | 是否成功 示例：true |
| data | object | 否 | 调用成功时返回的数据 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 总数 示例：1 |
| successCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功总数 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败总数 示例：0 |
| messages | object | 是 | 失败数据信息 |
| infos | object | 是 | 成功数据信息 |
| displayCode | string | 否 | 业务异常码 示例：000-525-000067 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"success": true,
	"data": {
		"count": 1,
		"successCount": 1,
		"failCount": 0,
		"messages": [
			{
				"sourceUnique": "",
				"message": ""
			}
		],
		"infos": [
			{
				"created": true,
				"sourceUnique": "124555",
				"targetUnique": "2227602792669249539",
				"id": "2227602792669249539"
			}
		]
	},
	"displayCode": "000-525-000067",
	"level": 0
}

## 6. 业务异常码

000-525-000066

传入的数据列表为空或存在空对象，请检查代码

000-525-000067

执行批量操作时，数据必须包含sourceUnique


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-01

更新

请求说明

新增

返回参数 displayCode

新增

返回参数 level


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

