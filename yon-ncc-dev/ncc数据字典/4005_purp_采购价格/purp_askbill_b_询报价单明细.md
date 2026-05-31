# |<<

**询报价单明细 (purp_askbill_b / nc.vo.pp.m29.entity.AskBillItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4801.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_askbill_b | 询报价单明细 | pk_askbill_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 采购组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_采购组织 (purchaseorg) |
| 4 | pk_org_v | 采购组织 | pk_org_v | varchar(20) |  | 组织_业务单元_采购组织版本信息 (purchaseorg_v) |
| 5 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 6 | pk_material | 物料 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | pk_srcmaterial | 物料最新版本 | pk_srcmaterial | varchar(20) |  | 物料基本信息 (material_v) |
| 8 | vpackmode | 包装方式 | vpackmode | varchar(181) |  | 字符串 (String) |
| 9 | ninsurance | 保险费 | ninsurance | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | dqtvaliddate | 报价生效日期 | dqtvaliddate | varchar(19) |  | 日期(开始) (UFDateBegin) |
| 11 | dqtinvaliddate | 报价失效日期 | dqtinvaliddate | varchar(19) |  | 日期(结束) (UFDateEnd) |
| 12 | vbmemo | 备注 | vbmemo | varchar(181) |  | 字符串 (String) |
| 13 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 14 | vreceivearea | 收货地区 | vreceivearea | varchar(20) |  | 地区分类 (areaclass) |
| 15 | vreceiveaddr | 到货地址 | vreceiveaddr | varchar(20) |  | 地址簿 (address) |
| 16 | dreceivedate | 到货日期 | dreceivedate | varchar(19) |  | 日期(结束) (UFDateEnd) |
| 17 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 18 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 19 | cqualitylevelid | 质量等级 | cqualitylevelid | varchar(20) |  | 质量等级 (scm_qualitylevel_b) |
| 20 | nimpost | 关税 | nimpost | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | nastorigtaxprice | 含税单价 | nastorigtaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | nastorigprice | 无税单价 | nastorigprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 24 | cunitid | 主单位(实际主单位) | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 25 | showcunitid | 主单位 | showcunitid | varchar(20) |  | 计量单位 (measdoc) |
| 26 | nastnum | 数量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | ntaxrate | 税率 | ntaxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | pk_transporttype | 运输方式 | pk_transporttype | varchar(20) |  | 运输方式 (transporttype) |
| 29 | ntransportmny | 运杂费 | ntransportmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | nnum | 主数量(实际主数量) | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | shownnum | 主数量 | shownnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | norigtaxprice | 主含税单价 | norigtaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | norigprice | 主无税单价 | norigprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | ftaxtypeflag | 扣税类别 | ftaxtypeflag | int |  | 扣税类别 (taxtype) |  | 1=应税外加; |