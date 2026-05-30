# |<<

**采购订单明细 (po_order_b / nc.vo.pu.m21.entity.OrderItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4604.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_order_b | 采购订单明细 | pk_order_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 采购组织版本信息 | pk_org | varchar(20) |  | 组织_业务单元_采购组织 (purchaseorg) |
| 4 | pk_org_v | 采购组织 | pk_org_v | varchar(20) |  | 组织_业务单元_采购组织版本信息 (purchaseorg_v) |
| 5 | pk_reqcorp | 需求公司 | pk_reqcorp | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 6 | pk_reqstoorg | 需求库存组织最新版本 | pk_reqstoorg | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 7 | pk_reqstoorg_v | 需求库存组织 | pk_reqstoorg_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 8 | pk_reqstordoc | 需求仓库 | pk_reqstordoc | varchar(20) |  | 仓库 (stordoc) |
| 9 | pk_arrvstoorg | 收货库存组织最新版本 | pk_arrvstoorg | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 10 | pk_arrvstoorg_v | 收货库存组织 | pk_arrvstoorg_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 11 | pk_reqdept | 需求部门最新版本 | pk_reqdept | varchar(20) |  | 组织_部门 (dept) |
| 12 | pk_flowstockorg | 物流组织最新版本 | pk_flowstockorg | varchar(20) |  | 组织_业务单元_物流组织 (trafficorg) |
| 13 | pk_flowstockorg_v | 物流组织 | pk_flowstockorg_v | varchar(20) |  | 组织_业务单元_物流组织版本信息 (trafficorg_v) |
| 14 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 15 | pk_material | 物料版本信息 | pk_material | varchar(20) | √ | 物料基本信息（多版本） (material) |
| 16 | pk_srcmaterial | 物料信息 | pk_srcmaterial | varchar(20) | √ | 物料基本信息 (material_v) |
| 17 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 18 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 20 | nastnum | 数量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 22 | cqtunitid | 报价单位 | cqtunitid | varchar(20) |  | 计量单位 (measdoc) |
| 23 | nqtunitnum | 报价数量 | nqtunitnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | vqtunitrate | 报价换算率 | vqtunitrate | varchar(60) |  | 字符串 (String) |
| 25 | nqtorigprice | 无税单价 | nqtorigprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | nqtorigtaxprice | 含税单价 | nqtorigtaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | nqtorignetprice | 无税净价 | nqtorignetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | nqtorigtaxnetprc | 含税净价 | nqtorigtaxnetprc | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | nqtnetprice | 本币无税净价 | nqtnetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | nqttaxnetprice | 本币含税净价 | nqttaxnetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | nitemdiscountrate | 折扣 | nitemdiscountrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | norigmny | 无税金额 | norigmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | norigtaxmny | 价税合计 | norigtaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | nmny | 本币无税金额 | nmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 35 | ntaxmny | 本币价税合计 | ntaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 36 | ntax | 税额 | ntax | decimal(28, 8) |  | 数值 (UFDouble) |
| 37 | norigprice | 主无税单价 | norigprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 38 | norigtaxprice | 主含税单价 | norigtaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 39 | norignetprice | 主无税净价 | norignetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 40 | norigtaxnetprice | 主含税净价 | norigtaxnetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 41 | nnetprice | 主本币无税净价 | nnetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 42 | ntaxnetprice | 主本币含税净价 | ntaxnetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 43 | naccumarrvnum | 累计到货主数量 | naccumarrvnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 44 | naccumstorenum | 累计入库主数量 | naccumstorenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 45 | naccuminvoicenum | 累计开票主数量 | naccuminvoicenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 46 | naccumwastnum | 累计途耗主数量 | naccumwastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 47 | dplanarrvdate | 计划到货日期 | dplanarrvdate | char(19) |  | 日期(结束) (UFDateEnd) |
| 48 | pk_recvstordoc | 收货仓库 | pk_recvstordoc | varchar(20) |  | 仓库 (stordoc) |
| 49 | pk_receiveaddress | 收货地址 | pk_receiveaddress | varchar(20) |  | 地址簿 (address) |
| 50 | dcorrectdate | 修正日期 | dcorrectdate | varchar(19) |  | 日期 (UFDate) |
| 51 | chandler | 操作员 | chandler | varchar(20) |  | 用户 (user) |
| 52 | fisactive | 激活 | fisactive | int |  | 激活标志 (activeflag) | 0 | 0=激活; |