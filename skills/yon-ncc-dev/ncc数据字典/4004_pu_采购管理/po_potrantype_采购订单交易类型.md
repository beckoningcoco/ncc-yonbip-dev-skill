# |<<

**采购订单交易类型 (po_potrantype / nc.vo.pu.m21transtype.entity.PoTransTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4619.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_potrantype | 主键 | pk_potrantype | char(20) | √ | 主键 (UFID) |
| 2 | vtrantypecode | 交易类型编码 | vtrantypecode | varchar(20) | √ | 字符串 (String) |
| 3 | bvmi | 供应商寄存 | bvmi | char(1) |  | 布尔类型 (UFBoolean) |
| 4 | bdirect | 直运采购 | bdirect | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | bcheckcenpur | 采购订单是否检查采购业务委托关系 | bcheckcenpur | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | boverpay | 允许超订单付款 | boverpay | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | breceiveplan | 进行到货计划安排 | breceiveplan | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | iprtopolimit | 请购单生成订单限制方式 | iprtopolimit | int |  | 请购单生成订单限制方式 (createordertype) |  | 0=不限制; |