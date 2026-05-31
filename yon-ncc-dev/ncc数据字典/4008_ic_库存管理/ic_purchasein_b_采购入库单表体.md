# |<<

**采购入库单表体 (ic_purchasein_b / nc.vo.ic.m45.entity.PurchaseInBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2957.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cgeneralbid | 入库单表体主键 | cgeneralbid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | corpoid | 公司最新版本 | corpoid | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 4 | corpvid | 公司 | corpvid | varchar(20) |  | 组织_业务单元_公司版本信息 (corp_v) |
| 5 | cfanaceorgoid | 结算财务组织 | cfanaceorgoid | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 7 | cstateid | 库存状态 | cstateid | varchar(20) |  | 库存状态 (ic_storestate) |
| 8 | cmaterialoid | 物料 | cmaterialoid | varchar(20) | √ | 物料基本信息 (material_v) |
| 9 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) | √ | 物料基本信息（多版本） (material) |
| 10 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 11 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 12 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 13 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 14 | nshouldassistnum | 应收数量 | nshouldassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nshouldnum | 应收主数量 | nshouldnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | nassistnum | 实收数量 | nassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | nnum | 实收主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | nplannedprice | 计划单价 | nplannedprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | nplannedmny | 计划金额 | nplannedmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | clocationid | 货位 | clocationid | varchar(20) |  | 货位 (rack) |
| 21 | dbizdate | 入库日期 | dbizdate | varchar(19) |  | 日期 (UFDate) |
| 22 | fchecked | 待检标志 | fchecked | int |  | 整数 (Integer) |
| 23 | ccheckstateid | 质检状态 | ccheckstateid | char(20) |  | 主键 (UFID) |
| 24 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 25 | casscustid | 客户 | casscustid | varchar(20) |  | 客户基本信息 (customer) |
| 26 | ccorrespondhid | 对应入库单表头主键 | ccorrespondhid | varchar(20) |  | 主键 (UFID) |
| 27 | ccorrespondbid | 对应入库单据表体主键 | ccorrespondbid | varchar(20) |  | 主键 (UFID) |
| 28 | ccorrespondtype | 对应入库单类型 | ccorrespondtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 29 | ccorrespondtranstype | 对应入库单交易类型 | ccorrespondtranstype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 30 | ccorrespondcode | 对应入库单单据号 | ccorrespondcode | varchar(40) |  | 字符串 (String) |
| 31 | ccorrespondrowno | 对应入库单行号 | ccorrespondrowno | varchar(20) |  | 字符串 (String) |
| 32 | flargess | 赠品 | flargess | char(1) |  | 布尔类型 (UFBoolean) |
| 33 | bsourcelargess | 上游赠品行 | bsourcelargess | char(1) |  | 布尔类型 (UFBoolean) |
| 34 | csourcebillhid | 来源单据表头主键 | csourcebillhid | varchar(20) |  | 主键 (UFID) |
| 35 | csourcebillbid | 来源单据表体行主键 | csourcebillbid | varchar(20) |  | 主键 (UFID) |
| 36 | carriveorder_bbid | 来源到货单质检明细主键 | carriveorder_bbid | varchar(20) |  | 主键 (UFID) |
| 37 | csourcetype | 来源单据类型 | csourcetype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 38 | csourcetranstype | 来源单据交易类型 | csourcetranstype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 39 | vsourcebillcode | 来源单据号 | vsourcebillcode | varchar(40) |  | 字符串 (String) |
| 40 | vsourcerowno | 来源单据行号 | vsourcerowno | varchar(20) |  | 字符串 (String) |
| 41 | cfirsttype | 源头单据类型 | cfirsttype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 42 | cfirsttranstype | 源头单据交易类型 | cfirsttranstype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 43 | cfirstbillhid | 源头单据表头主键 | cfirstbillhid | char(20) |  | 主键 (UFID) |
| 44 | cfirstbillbid | 源头单据表体主键 | cfirstbillbid | char(20) |  | 主键 (UFID) |
| 45 | corder_bb1id | 源头采购单据到货计划 | corder_bb1id | char(20) |  | 主键 (UFID) |
| 46 | vfirstbillcode | 源头单据号 | vfirstbillcode | varchar(40) |  | 字符串 (String) |
| 47 | vfirstrowno | 源头单据行号 | vfirstrowno | varchar(20) |  | 字符串 (String) |
| 48 | csrc2billtype | 其他来源单据类型编码 | csrc2billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 49 | csrc2transtype | 其他来源交易类型编码 | csrc2transtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 50 | csrc2billhid | 其他来源单主键 | csrc2billhid | varchar(20) |  | 主键 (UFID) |
| 51 | vsrc2billcode | 其他来源单据号 | vsrc2billcode | varchar(40) |  | 字符串 (String) |
| 52 | csrc2billbid | 其他来源单行主键 | csrc2billbid | varchar(20) |  | 主键 (UFID) |
| 53 | vsrc2billrowno | 其他来源单行号 | vsrc2billrowno | varchar(20) |  | 字符串 (String) |
| 54 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 55 | fbillrowflag | 配套标志 | fbillrowflag | int |  | 整数 (Integer) |
| 56 | vnotebody | 行备注 | vnotebody | varchar(181) |  | 字符串 (String) |
| 57 | ncountnum | 箱数 | ncountnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 58 | pk_packsort | 包装类型 | pk_packsort | varchar(20) |  | 包装箱类型 (PackTypeVO) |
| 59 | nbarcodenum | 条码主数量 | nbarcodenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 60 | bbarcodeclose | 单据行是否条码关闭 | bbarcodeclose | char(1) |  | 布尔类型 (UFBoolean) |
| 61 | bonroadflag | 是否在途 | bonroadflag | char(1) |  | 布尔类型 (UFBoolean) |
| 62 | pk_measware | 计量器具 | pk_measware | varchar(20) |  | 计量器具维护 (pd_meastool) |
| 63 | ngrossnum | 毛重主数量 | ngrossnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 64 | ntarenum | 皮重主数量 | ntarenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 65 | idesatype | 拆解类型 | idesatype | int |  | 整数 (Integer) |
| 66 | cselastunitid | 选择拆解单位 | cselastunitid | varchar(20) |  | 主键 (UFID) |
| 67 | dproducedate | 生产日期 | dproducedate | varchar(19) |  | 日期(结束) (UFDateEnd) |
| 68 | dvalidate | 失效日期 | dvalidate | varchar(19) |  | 日期(结束) (UFDateEnd) |
| 69 | cbodytranstypecode | 出入库类型 | cbodytranstypecode | varchar(20) |  | 单据类型 (BilltypeVO) |
| 70 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 71 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 72 | cbodywarehouseid | 库存仓库 | cbodywarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 73 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 74 | cvmivenderid | 寄存供应商 | cvmivenderid | varchar(20) |  | 供应商基本信息 (supplier) |
| 75 | pk_creqwareid | 需求仓库 | pk_creqwareid | varchar(20) |  | 仓库 (stordoc) |
| 76 | creqstoorgoid | 需求库存组织最新版本 | creqstoorgoid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 77 | creqstoorgvid | 需求库存组织 | creqstoorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 78 | ctplcustomerid | 货主客户 | ctplcustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 79 | nkdnum | 扣吨主数量 | nkdnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 80 | vexigencycode | 紧急放行申请单号 | vexigencycode | varchar(50) |  | 字符串 (String) |
| 81 | vexigencyhid | 紧急放行申请单主键 | vexigencyhid | varchar(20) |  | 主键 (UFID) |
| 82 | vexigencyrowno | 紧急放行申请单行号 | vexigencyrowno | varchar(50) |  | 字符串 (String) |
| 83 | vexigencybid | 紧急放行申请单行主键 | vexigencybid | varchar(20) |  | 主键 (UFID) |
| 84 | cliabilityoid | 结算利润中心最新版本 | cliabilityoid | varchar(20) |  | 利润中心 (profitcenter) |
| 85 | cliabilityvid | 结算利润中心 | cliabilityvid | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 86 | nweight | 重量 | nweight | decimal(28, 8) |  | 数值 (UFDouble) |
| 87 | nvolume | 体积 | nvolume | decimal(28, 8) |  | 数值 (UFDouble) |
| 88 | npiece | 件数 | npiece | decimal(28, 8) |  | 数值 (UFDouble) |
| 89 | borrowinflag | 借入转采购 | borrowinflag | char(1) |  | 布尔类型 (UFBoolean) |
| 90 | corigcurrencyid | 币种 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |
| 91 | nchangestdrate | 折本汇率 | nchangestdrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 92 | ccurrencyid | 本位币 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 93 | norignetprice | 主无税净价 | norignetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 94 | norigtaxnetprice | 主含税净价 | norigtaxnetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 95 | nnetprice | 主本币无税净价 | nnetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 96 | ntaxnetprice | 主本币含税净价 | ntaxnetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 97 | cqtunitid | 报价单位 | cqtunitid | varchar(20) |  | 计量单位 (measdoc) |
| 98 | nqtunitnum | 报价数量 | nqtunitnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 99 | vqtunitrate | 报价换算率 | vqtunitrate | varchar(60) |  | 字符串 (String) |
| 100 | nqtorignetprice | 无税净价 | nqtorignetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 101 | nqtorigtaxnetprice | 含税净价 | nqtorigtaxnetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 102 | nqtnetprice | 本币无税净价 | nqtnetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 103 | nqttaxnetprice | 本币含税净价 | nqttaxnetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 104 | norigprice | 主无税单价 | norigprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 105 | norigtaxprice | 主含税单价 | norigtaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 106 | nprice | 主本币无税单价 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 107 | ntaxprice | 主本币含税单价 | ntaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 108 | nqtorigprice | 无税单价 | nqtorigprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 109 | nqtorigtaxprice | 含税单价 | nqtorigtaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 110 | nqtprice | 本币无税单价 | nqtprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 111 | nqttaxprice | 本币含税单价 | nqttaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 112 | nitemdiscountrate | 折扣 | nitemdiscountrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 113 | norigmny | 无税金额 | norigmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 114 | norigtaxmny | 价税合计 | norigtaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 115 | nmny | 本币无税金额 | nmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 116 | ntaxmny | 本币价税合计 | ntaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 117 | ntax | 税额 | ntax | decimal(28, 8) |  | 数值 (UFDouble) |
| 118 | vreturnreason | 退库理由 | vreturnreason | varchar(20) |  | 退货理由设置 (scm_backreason) |
| 119 | ntaxrate | 税率 | ntaxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 120 | cetdetlpickbid | 出口明细拣配主键 | cetdetlpickbid | varchar(20) |  | 主键 (UFID) |
| 121 | cglobalcurrencyid | 全局本位币 | cglobalcurrencyid | varchar(20) |  | 币种 (currtype) |
| 122 | nglobalmny | 全局本币无税金额 | nglobalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 123 | nglobaltaxmny | 全局本币价税合计 | nglobaltaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 124 | nglobalexchgrate | 全局本位币汇率 | nglobalexchgrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 125 | cgroupcurrencyid | 集团本位币 | cgroupcurrencyid | varchar(20) |  | 币种 (currtype) |
| 126 | ngroupmny | 集团本币无税金额 | ngroupmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 127 | ngrouptaxmny | 集团本币价税合计 | ngrouptaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 128 | ngroupexchgrate | 集团本位币汇率 | ngroupexchgrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 129 | pk_batchcode | 批次主键 | pk_batchcode | varchar(20) |  | 批次档案 (BatchcodeVO) |
| 130 | bassetcard | 已生成设备卡片 | bassetcard | char(1) |  | 布尔类型 (UFBoolean) |
| 131 | bfixedasset | 已转固 | bfixedasset | char(1) |  | 布尔类型 (UFBoolean) |
| 132 | csrcmaterialoid | 来源物料 | csrcmaterialoid | varchar(20) |  | 物料基本信息 (material_v) |
| 133 | csrcmaterialvid | 来源物料编码 | csrcmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 134 | cprojecttaskid | 项目任务 | cprojecttaskid | varchar(20) |  | 项目任务 (WBS) |
| 135 | ctaxcodeid | 税码 | ctaxcodeid | varchar(20) |  | 增值税税码税率 (taxcode) |
| 136 | nnosubtaxrate | 不可抵扣税率 | nnosubtaxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 137 | nnosubtax | 不可抵扣税额 | nnosubtax | decimal(28, 8) |  | 数值 (UFDouble) |
| 138 | ncaltaxmny | 计税金额 | ncaltaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 139 | corigcountryid | 原产国 | corigcountryid | varchar(20) |  | 国家地区 (countryzone) |
| 140 | corigareaid | 原产地区 | corigareaid | varchar(20) |  | 行政区划 (region) |
| 141 | cdesticountryid | 目的国 | cdesticountryid | varchar(20) |  | 国家地区 (countryzone) |
| 142 | cdestiareaid | 目的地区 | cdestiareaid | varchar(20) |  | 行政区划 (region) |
| 143 | bopptaxflag | 逆向征税标志 | bopptaxflag | char(1) |  | 布尔类型 (UFBoolean) |
| 144 | ftaxtypeflag | 扣税类别 | ftaxtypeflag | int |  | 扣税类别 (taxtype) |  | 1=应税外加; |