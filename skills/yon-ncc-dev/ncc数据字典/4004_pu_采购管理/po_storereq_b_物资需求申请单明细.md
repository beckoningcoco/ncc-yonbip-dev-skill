# |<<

**物资需求申请单明细 (po_storereq_b / nc.vo.pu.m422x.entity.StoreReqAppItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4637.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_storereq_b | 物资需求申请单明细 | pk_storereq_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 6 | pk_material | 物料版本信息 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | pk_srcmaterial | 物料信息 | pk_srcmaterial | varchar(20) |  | 物料基本信息 (material_v) |
| 8 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 9 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 11 | nastnum | 数量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 13 | ntaxprice | 主本币含税单价 | ntaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | ntaxmny | 本币价税合计 | ntaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | pk_reqstordoc | 原始需求仓库 | pk_reqstordoc | varchar(20) |  | 仓库 (stordoc) |
| 16 | dreqdate | 需求日期 | dreqdate | char(19) |  | 日期(结束) (UFDateEnd) |
| 17 | pk_apppsn | 申请人 | pk_apppsn | varchar(20) |  | 人员基本信息 (psndoc) |
| 18 | pk_appdept_v | 申请部门 | pk_appdept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 19 | pk_appdept | 申请部门最新版本 | pk_appdept | varchar(20) |  | 组织_部门 (dept) |
| 20 | pk_receiveaddress | 收货地址 | pk_receiveaddress | varchar(20) |  | 地址簿 (address) |
| 21 | cdevareaid | 收货地区 | cdevareaid | varchar(20) |  | 地区分类 (areaclass) |
| 22 | cdevaddrid | 收货地点 | cdevaddrid | varchar(20) |  | 地点档案 (addressdoc) |
| 23 | csourcetypecode | 来源单据类型 | csourcetypecode | varchar(20) |  | 单据类型 (BilltypeVO) |
| 24 | csourceid | 来源单据 | csourceid | varchar(20) |  | 主键 (UFID) |
| 25 | csourcebid | 来源单据明细 | csourcebid | varchar(20) |  | 主键 (UFID) |
| 26 | vsourcecode | 来源单据号 | vsourcecode | varchar(40) |  | 字符串 (String) |
| 27 | vsourcetrantype | 来源交易类型 | vsourcetrantype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 28 | vsourcerowno | 来源单据行号 | vsourcerowno | varchar(20) |  | 字符串 (String) |
| 29 | cfirsttypecode | 源头单据类型 | cfirsttypecode | varchar(20) |  | 单据类型 (BilltypeVO) |
| 30 | cfirstid | 源头单据 | cfirstid | varchar(20) |  | 主键 (UFID) |
| 31 | cfirstbid | 源头单据明细 | cfirstbid | varchar(20) |  | 主键 (UFID) |
| 32 | vfirstcode | 源头单据号 | vfirstcode | varchar(40) |  | 字符串 (String) |
| 33 | vfirsttrantype | 源头交易类型 | vfirsttrantype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 34 | vfirstrowno | 源头单据行号 | vfirstrowno | varchar(20) |  | 字符串 (String) |
| 35 | naccuoutnum | 累计出库主数量 | naccuoutnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 36 | naccuoutreqnum | 累计申请出库主数量 | naccuoutreqnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 37 | bclose | 是否关闭 | bclose | char(1) |  | 布尔类型 (UFBoolean) | N |
| 38 | pk_batchcode | 批次号主键 | pk_batchcode | varchar(20) |  | 主键 (UFID) |
| 39 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 40 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 41 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 42 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 43 | cprojecttaskid | 项目任务 | cprojecttaskid | varchar(20) |  | 项目任务 (WBS) |
| 44 | ccostelementid | 成本要素 | ccostelementid | varchar(20) |  | 主键 (UFID) |
| 45 | vbmemo | 备注 | vbmemo | varchar(181) |  | 字符串 (String) |
| 46 | dbilldate | 申请日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 47 | ccurrencyid | 本币币种 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 48 | naccumbuyreqnum | 累计请购主数量 | naccumbuyreqnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 49 | pk_reqstoorg_v | 原始需求库存组织 | pk_reqstoorg_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 50 | pk_reqstoorg | 原始需求库存组织最新版本 | pk_reqstoorg | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 51 | pk_nextbalanceorg_v | 下次平衡库存组织 | pk_nextbalanceorg_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 52 | pk_nextbalanceorg | 下次平衡库存组织最新版本 | pk_nextbalanceorg | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 53 | bendgather | 已平衡 | bendgather | char(1) |  | 布尔类型 (UFBoolean) |
| 54 | naccustornum | 库存满足主数量 | naccustornum | decimal(28, 8) |  | 数值 (UFDouble) |
| 55 | nnetnum | 转净需求主数量 | nnetnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 56 | csourceid2 | 下游单据 | csourceid2 | char(20) |  | 主键 (UFID) |
| 57 | csourcebid2 | 下游单据行 | csourcebid2 | char(20) |  | 主键 (UFID) |
| 58 | vsourcecode2 | 下游单据号 | vsourcecode2 | varchar(40) |  | 字符串 (String) |
| 59 | vsourcerowno2 | 下游单据行号 | vsourcerowno2 | varchar(20) |  | 字符串 (String) |
| 60 | csourcetypecode2 | 下游单据类型 | csourcetypecode2 | varchar(20) |  | 单据类型 (BilltypeVO) |
| 61 | vsourcetrantype2 | 下游单据交易类型 | vsourcetrantype2 | varchar(20) |  | 单据类型 (BilltypeVO) |
| 62 | cfirstid2 | 调拨订单 | cfirstid2 | char(20) |  | 主键 (UFID) |
| 63 | cfirstbid2 | 调拨订单明细 | cfirstbid2 | char(20) |  | 主键 (UFID) |
| 64 | vfirstcode2 | 调拨单据号 | vfirstcode2 | varchar(40) |  | 字符串 (String) |
| 65 | vfirstrowno2 | 调拨单据行号 | vfirstrowno2 | varchar(20) |  | 字符串 (String) |
| 66 | cfirsttypecode2 | 调拨单据类型 | cfirsttypecode2 | varchar(20) |  | 单据类型 (BilltypeVO) |
| 67 | vfirsttrantype2 | 调拨单据交易类型 | vfirsttrantype2 | varchar(20) |  | 单据类型 (BilltypeVO) |
| 68 | tgathertime | 汇总时间 | tgathertime | char(19) |  | 日期 (UFDate) |
| 69 | cgatherpsnid | 汇总人 | cgatherpsnid | varchar(20) |  | 用户 (user) |
| 70 | cgatherid | 汇总ID | cgatherid | char(20) |  | 主键 (UFID) |
| 71 | naccumminusnum | 汇总平衡转请购主数量 | naccumminusnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 72 | cbs | CBS | cbs | varchar(20) |  | 成本分解结构成员 (cbsnode) |
| 73 | devicetype | 设备类别 | devicetype | varchar(20) |  | 设备类别(自定义档案) (Defdoc-BDMH_0006) |
| 74 | deviceimportance | 设备关键程度 | deviceimportance | varchar(20) |  | 设备关键程度(自定义档案) (Defdoc-BDMH_0007) |
| 75 | installcondition | 安装环境 | installcondition | varchar(20) |  | 是否具备(自定义档案) (Defdoc-BDMH_0008) |
| 76 | prefessionaloptpsn | 专业操作人员 | prefessionaloptpsn | varchar(20) |  | 是否具备(自定义档案) (Defdoc-BDMH_0008) |
| 77 | maintainfundscond | 维护经费条件 | maintainfundscond | varchar(20) |  | 是否具备(自定义档案) (Defdoc-BDMH_0008) |
| 78 | purchasenecessity | 购置必要性 | purchasenecessity | varchar(20) |  | 是否必要(自定义档案) (Defdoc-BDMH_0009) |
| 79 | purpose | 功能用途 | purpose | varchar(256) |  | 字符串 (String) |
| 80 | appreason | 申请理由 | appreason | varchar(256) |  | 字符串 (String) |
| 81 | techparams | 技术参数 | techparams | varchar(256) |  | 字符串 (String) |
| 82 | useyear | 预计使用年限 | useyear | varchar(30) |  | 字符串 (String) |
| 83 | predictincome | 预计收入 | predictincome | varchar(30) |  | 字符串 (String) |
| 84 | balancepoint | 盈亏平衡点 | balancepoint | varchar(30) |  | 字符串 (String) |
| 85 | pk_reqstoorg0 | 需求库存组织 | pk_reqstoorg0 | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 86 | pk_reqstoorg_v0 | 需求库存组织最新版本 | pk_reqstoorg_v0 | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 87 | pk_reqstordoc0 | 需求库存组织仓库 | pk_reqstordoc0 | varchar(20) |  | 仓库 (stordoc) |
| 88 | pk_nextbalstordoc | 下次平衡库存组织仓库 | pk_nextbalstordoc | varchar(20) |  | 仓库 (stordoc) |
| 89 | sumcspecialnum | 累计转库主数量 | sumcspecialnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 90 | nsobillnum | 累计销售主数量 | nsobillnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 91 | ntobillnum | 累计调拨主数量 | ntobillnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 92 | ninnum | 累计入库主数量 | ninnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 93 | vm4dhid | 材料出库单ID | vm4dhid | varchar(20) |  | 字符串 (String) |
| 94 | vm4dbid | 材料出库单行ID | vm4dbid | varchar(20) |  | 字符串 (String) |
| 95 | vm4dbillno | 材料出库单号 | vm4dbillno | varchar(40) |  | 字符串 (String) |
| 96 | vm4khid | 转库单ID | vm4khid | varchar(20) |  | 字符串 (String) |
| 97 | vm4kbid | 转库单行ID | vm4kbid | varchar(20) |  | 字符串 (String) |
| 98 | vm4kbillno | 转库单号 | vm4kbillno | varchar(40) |  | 字符串 (String) |
| 99 | naccu4dnum | 汇总平衡转4D数量 | naccu4dnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 100 | vfree1 | 自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 101 | vfree2 | 自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 102 | vfree3 | 自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 103 | vfree4 | 自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 104 | vfree5 | 自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 105 | vfree6 | 自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 106 | vfree7 | 自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 107 | vfree8 | 自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 108 | vfree9 | 自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 109 | vfree10 | 自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |
| 110 | vbdef1 | 自定义项1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 111 | vbdef2 | 自定义项2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 112 | vbdef3 | 自定义项3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 113 | vbdef4 | 自定义项4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 114 | vbdef5 | 自定义项5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 115 | vbdef6 | 自定义项6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 116 | vbdef7 | 自定义项7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 117 | vbdef8 | 自定义项8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 118 | vbdef9 | 自定义项9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 119 | vbdef10 | 自定义项10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 120 | vbdef11 | 自定义项11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 121 | vbdef12 | 自定义项12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 122 | vbdef13 | 自定义项13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 123 | vbdef14 | 自定义项14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 124 | vbdef15 | 自定义项15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 125 | vbdef16 | 自定义项16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 126 | vbdef17 | 自定义项17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 127 | vbdef18 | 自定义项18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 128 | vbdef19 | 自定义项19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 129 | vbdef20 | 自定义项20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |
| 130 | vbdef21 | 自定义项21 | vbdef21 | varchar(101) |  | 自定义项 (Custom) |
| 131 | vbdef22 | 自定义项22 | vbdef22 | varchar(101) |  | 自定义项 (Custom) |
| 132 | vbdef23 | 自定义项23 | vbdef23 | varchar(101) |  | 自定义项 (Custom) |
| 133 | vbdef24 | 自定义项24 | vbdef24 | varchar(101) |  | 自定义项 (Custom) |
| 134 | vbdef25 | 自定义项25 | vbdef25 | varchar(101) |  | 自定义项 (Custom) |
| 135 | vbdef26 | 自定义项26 | vbdef26 | varchar(101) |  | 自定义项 (Custom) |
| 136 | vbdef27 | 自定义项27 | vbdef27 | varchar(101) |  | 自定义项 (Custom) |
| 137 | vbdef28 | 自定义项28 | vbdef28 | varchar(101) |  | 自定义项 (Custom) |
| 138 | vbdef29 | 自定义项29 | vbdef29 | varchar(101) |  | 自定义项 (Custom) |
| 139 | vbdef30 | 自定义项30 | vbdef30 | varchar(101) |  | 自定义项 (Custom) |
| 140 | vbdef31 | 自定义项31 | vbdef31 | varchar(101) |  | 自定义项 (Custom) |
| 141 | vbdef32 | 自定义项32 | vbdef32 | varchar(101) |  | 自定义项 (Custom) |
| 142 | vbdef33 | 自定义项33 | vbdef33 | varchar(101) |  | 自定义项 (Custom) |
| 143 | vbdef34 | 自定义项34 | vbdef34 | varchar(101) |  | 自定义项 (Custom) |
| 144 | vbdef35 | 自定义项35 | vbdef35 | varchar(101) |  | 自定义项 (Custom) |
| 145 | vbdef36 | 自定义项36 | vbdef36 | varchar(101) |  | 自定义项 (Custom) |
| 146 | vbdef37 | 自定义项37 | vbdef37 | varchar(101) |  | 自定义项 (Custom) |
| 147 | vbdef38 | 自定义项38 | vbdef38 | varchar(101) |  | 自定义项 (Custom) |
| 148 | vbdef39 | 自定义项39 | vbdef39 | varchar(101) |  | 自定义项 (Custom) |
| 149 | vbdef40 | 自定义项40 | vbdef40 | varchar(101) |  | 自定义项 (Custom) |
| 150 | vbdef41 | 自定义项41 | vbdef41 | varchar(101) |  | 自定义项 (Custom) |
| 151 | vbdef42 | 自定义项42 | vbdef42 | varchar(101) |  | 自定义项 (Custom) |
| 152 | vbdef43 | 自定义项43 | vbdef43 | varchar(101) |  | 自定义项 (Custom) |
| 153 | vbdef44 | 自定义项44 | vbdef44 | varchar(101) |  | 自定义项 (Custom) |
| 154 | vbdef45 | 自定义项45 | vbdef45 | varchar(101) |  | 自定义项 (Custom) |
| 155 | vbdef46 | 自定义项46 | vbdef46 | varchar(101) |  | 自定义项 (Custom) |
| 156 | vbdef47 | 自定义项47 | vbdef47 | varchar(101) |  | 自定义项 (Custom) |
| 157 | vbdef48 | 自定义项48 | vbdef48 | varchar(101) |  | 自定义项 (Custom) |
| 158 | vbdef49 | 自定义项49 | vbdef49 | varchar(101) |  | 自定义项 (Custom) |
| 159 | vbdef50 | 自定义项50 | vbdef50 | varchar(101) |  | 自定义项 (Custom) |