# |<<

**到货计划 (po_order_bb1 / nc.vo.pu.m21.entity.OrderReceivePlanVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4606.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_order_bb1 | 到货计划 | pk_order_bb1 | varchar(20) | √ | 字符串 (String) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 采购组织版本信息 | pk_org | varchar(20) |  | 组织_业务单元_采购组织 (purchaseorg) |
| 4 | pk_org_v | 采购组织 | pk_org_v | varchar(20) |  | 组织_业务单元_采购组织版本信息 (purchaseorg_v) |
| 5 | vbillcode | 到货计划号 | vbillcode | varchar(40) | √ | 字符串 (String) |
| 6 | pk_arrvstoorg | 收货库存组织最新版本 | pk_arrvstoorg | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 7 | pk_arrvstoorg_v | 收货库存组织 | pk_arrvstoorg_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 8 | pk_flowstockorg | 物流组织最新版本 | pk_flowstockorg | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 9 | pk_flowstockorg_v | 物流组织 | pk_flowstockorg_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 10 | pk_material | 物料版本信息 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 11 | pk_srcmaterial | 物料信息 | pk_srcmaterial | varchar(20) |  | 物料基本信息 (material_v) |
| 12 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 13 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 15 | nastnum | 数量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 17 | cqtunitid | 报价单位 | cqtunitid | varchar(20) |  | 计量单位 (measdoc) |
| 18 | nqtunitnum | 报价数量 | nqtunitnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | vqtunitrate | 报价单位换算率 | vqtunitrate | varchar(60) |  | 字符串 (String) |
| 20 | naccumarrvnum | 累计到货主数量 | naccumarrvnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | naccumstorenum | 累计入库主数量 | naccumstorenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | naccumwastnum | 累计途耗主数量 | naccumwastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | dplanarrvdate | 计划到货日期 | dplanarrvdate | char(19) |  | 日期(结束) (UFDateEnd) |
| 24 | pk_recvstordoc | 收货仓库 | pk_recvstordoc | varchar(20) |  | 仓库 (stordoc) |
| 25 | pk_receiveaddress | 收货地址 | pk_receiveaddress | varchar(20) |  | 地址簿 (address) |
| 26 | fisactive | 激活状态 | fisactive | int |  | 激活标志 (activeflag) | 0 | 0=激活; |