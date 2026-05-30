# |<<

**销售出库单表体 (ic_saleout_b / nc.vo.ic.m4c.entity.SaleOutBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2971.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cgeneralbid | 出库单表体主键 | cgeneralbid | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | corpoid | 公司最新版本 | corpoid | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 5 | corpvid | 公司 | corpvid | varchar(20) |  | 组织_业务单元_公司版本信息 (corp_v) |
| 6 | cfanaceorgoid | 结算财务组织 | cfanaceorgoid | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 7 | cstateid | 库存状态 | cstateid | varchar(20) |  | 库存状态 (ic_storestate) |
| 8 | cmaterialoid | 物料 | cmaterialoid | varchar(20) | √ | 物料基本信息 (material_v) |
| 9 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) | √ | 物料基本信息（多版本） (material) |
| 10 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 11 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 12 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 13 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 14 | nshouldassistnum | 应发数量 | nshouldassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nshouldnum | 应发主数量 | nshouldnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | nassistnum | 实发数量 | nassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | nnum | 实发主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | ncostprice | 单价 | ncostprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | ncostmny | 金额 | ncostmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | nplannedprice | 计划单价 | nplannedprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | nplannedmny | 计划金额 | nplannedmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | dbizdate | 出库日期 | dbizdate | char(19) |  | 日期 (UFDate) |
| 23 | clocationid | 货位 | clocationid | varchar(20) |  | 货位 (rack) |
| 24 | cinvoicecustid | 开票客户 | cinvoicecustid | varchar(20) |  | 客户基本信息 (customer) |
| 25 | csourcebillhid | 来源单据表头主键 | csourcebillhid | varchar(20) |  | 主键 (UFID) |
| 26 | csourcebillbid | 来源单据表体主键 | csourcebillbid | varchar(20) |  | 主键 (UFID) |
| 27 | csourcetype | 来源单据类型 | csourcetype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 28 | csourcetranstype | 来源交易类型 | csourcetranstype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 29 | vsourcebillcode | 来源单据号 | vsourcebillcode | varchar(40) |  | 字符串 (String) |
| 30 | vsourcerowno | 来源单据行号 | vsourcerowno | varchar(20) |  | 字符串 (String) |
| 31 | csourcematerialoid | 来源单据物料 | csourcematerialoid | varchar(20) |  | 主键 (UFID) |
| 32 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 33 | casscustid | 客户 | casscustid | varchar(20) |  | 客户基本信息 (customer) |
| 34 | ccostobject | 成本对象 | ccostobject | varchar(20) |  | 字符串 (String) |
| 35 | ccorrespondbid | 对应入库单据表体主键 | ccorrespondbid | varchar(20) |  | 主键 (UFID) |
| 36 | ccorrespondhid | 对应入库单主键 | ccorrespondhid | varchar(20) |  | 主键 (UFID) |
| 37 | ccorrespondtype | 对应入库单类型 | ccorrespondtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 38 | ccorrespondtranstype | 对应入库单交易类型 | ccorrespondtranstype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 39 | ccorrespondcode | 对应入库单单据号 | ccorrespondcode | varchar(40) |  | 字符串 (String) |
| 40 | ccorrespondrowno | 对应入库单行号 | ccorrespondrowno | varchar(40) |  | 字符串 (String) |
| 41 | cfirsttype | 源头单据类型 | cfirsttype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 42 | cfirsttranstype | 源头交易类型 | cfirsttranstype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 43 | cfirstbillhid | 源头单据表头主键 | cfirstbillhid | varchar(20) |  | 主键 (UFID) |
| 44 | cfirstbillbid | 源头单据表体主键 | cfirstbillbid | varchar(20) |  | 主键 (UFID) |
| 45 | vfirstbillcode | 源头单据号 | vfirstbillcode | varchar(40) |  | 字符串 (String) |
| 46 | vfirstrowno | 源头单据行号 | vfirstrowno | varchar(20) |  | 字符串 (String) |
| 47 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 48 | fbillrowflag | 配套标志 | fbillrowflag | int |  | 整数 (Integer) |
| 49 | vnotebody | 行备注 | vnotebody | varchar(181) |  | 字符串 (String) |
| 50 | creceieveid | 收货客户 | creceieveid | varchar(20) |  | 客户基本信息 (customer) |
| 51 | ncountnum | 箱数 | ncountnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 52 | pk_packsort | 包装类型 | pk_packsort | varchar(20) |  | 包装箱类型 (PackTypeVO) |
| 53 | nbarcodenum | 条码主数量 | nbarcodenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 54 | bbarcodeclose | 单据行是否条码关闭 | bbarcodeclose | char(1) |  | 布尔类型 (UFBoolean) |
| 55 | flargess | 赠品 | flargess | char(1) |  | 布尔类型 (UFBoolean) |
| 56 | bsourcelargess | 上游赠品行 | bsourcelargess | char(1) |  | 布尔类型 (UFBoolean) |
| 57 | bonroadflag | 在途 | bonroadflag | char(1) |  | 布尔类型 (UFBoolean) |
| 58 | vvehiclecode | 运输工具号 | vvehiclecode | varchar(50) |  | 字符串 (String) |
| 59 | vtransfercode | 收货车号 | vtransfercode | varchar(50) |  | 字符串 (String) |
| 60 | pk_measware | 计量器具 | pk_measware | varchar(20) |  | 计量器具维护 (pd_meastool) |
| 61 | ngrossnum | 毛重主数量 | ngrossnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 62 | ntarenum | 皮重主数量 | ntarenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 63 | csrc2billtype | 其他来源单据类型编码 | csrc2billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 64 | csrc2transtype | 其他来源交易类型编码 | csrc2transtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 65 | csrc2billhid | 其他来源单主键 | csrc2billhid | varchar(20) |  | 主键 (UFID) |
| 66 | vsrc2billcode | 其他来源单据号 | vsrc2billcode | varchar(40) |  | 字符串 (String) |
| 67 | csrc2billbid | 其他来源单行主键 | csrc2billbid | varchar(20) |  | 主键 (UFID) |
| 68 | vsrc2billrowno | 其他来源单行标识 | vsrc2billrowno | varchar(20) |  | 字符串 (String) |
| 69 | idesatype | 拆解类型 | idesatype | int |  | 整数 (Integer) |
| 70 | cselastunitid | 选择拆解单位 | cselastunitid | varchar(20) |  | 主键 (UFID) |
| 71 | dproducedate | 生产日期 | dproducedate | char(19) |  | 日期(结束) (UFDateEnd) |
| 72 | dvalidate | 失效日期 | dvalidate | char(19) |  | 日期(结束) (UFDateEnd) |
| 73 | cbodytranstypecode | 出入库类型 | cbodytranstypecode | varchar(20) |  | 单据类型 (BilltypeVO) |
| 74 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 75 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 76 | cbodywarehouseid | 库存仓库 | cbodywarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 77 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 78 | cvmivenderid | 寄存供应商 | cvmivenderid | varchar(20) |  | 供应商基本信息 (supplier) |
| 79 | bsafeprice | 价保 | bsafeprice | char(1) |  | 布尔类型 (UFBoolean) |
| 80 | breturnprofit | 返利 | breturnprofit | char(1) |  | 布尔类型 (UFBoolean) |
| 81 | pk_returnreason | 退货原因 | pk_returnreason | varchar(20) |  | 字符串 (String) |
| 82 | btou8rm | 已下发零售 | btou8rm | char(1) |  | 布尔类型 (UFBoolean) |
| 83 | vbilltypeu8rm | 来自于零售之单据类型 | vbilltypeu8rm | varchar(20) |  | 单据类型 (BilltypeVO) |
| 84 | vtranstypeu8rm | 来自于零售之交易类型 | vtranstypeu8rm | varchar(20) |  | 单据类型 (BilltypeVO) |
| 85 | csignwasttype | 出入库单其它来源类型 | csignwasttype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 86 | csignwasthid | 出入库单其它来源单据主键 | csignwasthid | varchar(20) |  | 主键 (UFID) |
| 87 | vsignwastcode | 出入库单其它来源单据号 | vsignwastcode | varchar(40) |  | 字符串 (String) |
| 88 | csignwastbid | 出入库单其它来源单据行主键 | csignwastbid | varchar(20) |  | 主键 (UFID) |
| 89 | vsignwastrowno | 出入库单其它来源单据行标识 | vsignwastrowno | varchar(20) |  | 字符串 (String) |
| 90 | creceiveareaid | 收货地区 | creceiveareaid | varchar(20) |  | 地区分类 (areaclass) |
| 91 | creceivepointid | 收货地点 | creceivepointid | varchar(20) |  | 地点档案 (addressdoc) |
| 92 | vreceiveaddress | 收货地址 | vreceiveaddress | varchar(20) |  | 客户收货地址 (custaddress) |
| 93 | ddeliverdate | 要求收货日期 | ddeliverdate | char(19) |  | 日期 (UFDate) |
| 94 | csourcewasttype | 来源途损单据类型 | csourcewasttype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 95 | csourcewasttranstype | 来源途损交易类型 | csourcewasttranstype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 96 | csourcewasthid | 来源途损单据主键 | csourcewasthid | varchar(20) |  | 主键 (UFID) |
| 97 | vsourcewastcode | 来源途损单据号 | vsourcewastcode | varchar(40) |  | 字符串 (String) |
| 98 | csourcewastbid | 来源途损单据表体主键 | csourcewastbid | varchar(20) |  | 主键 (UFID) |
| 99 | vsourcewastrowno | 来源途损单据行标识 | vsourcewastrowno | varchar(20) |  | 字符串 (String) |
| 100 | vexigencyhid | 紧急放行申请单主键 | vexigencyhid | varchar(20) |  | 主键 (UFID) |
| 101 | vexigencybid | 紧急放行申请单行主键 | vexigencybid | varchar(20) |  | 主键 (UFID) |
| 102 | vexigencycode | 紧急放行申请单号 | vexigencycode | varchar(40) |  | 字符串 (String) |
| 103 | vexigencyrowno | 紧急放行申请单行号 | vexigencyrowno | varchar(20) |  | 字符串 (String) |
| 104 | cliabilityoid | 结算利润中心 | cliabilityoid | varchar(20) |  | 利润中心 (profitcenter) |
| 105 | cliabilityvid | 结算利润中心版本 | cliabilityvid | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 106 | cprodlineid | 产品线 | cprodlineid | varchar(20) |  | 产品线 (prodline) |
| 107 | nweight | 重量 | nweight | decimal(28, 8) |  | 数值 (UFDouble) |
| 108 | nvolume | 体积 | nvolume | decimal(28, 8) |  | 数值 (UFDouble) |
| 109 | npiece | 件数 | npiece | decimal(28, 8) |  | 数值 (UFDouble) |
| 110 | ctplcustomerid | 货主客户 | ctplcustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 111 | corigcurrencyid | 币种 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |
| 112 | nbdiscountrate | 整单折扣 | nbdiscountrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 113 | nchangestdrate | 折本汇率 | nchangestdrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 114 | ccurrencyid | 本位币 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 115 | norignetprice | 主无税净价 | norignetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 116 | norigtaxnetprice | 主含税净价 | norigtaxnetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 117 | nnetprice | 主本币无税净价 | nnetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 118 | ntaxnetprice | 主本币含税净价 | ntaxnetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 119 | cqtunitid | 报价单位 | cqtunitid | varchar(20) |  | 计量单位 (measdoc) |
| 120 | nqtunitnum | 报价数量 | nqtunitnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 121 | vqtunitrate | 报价换算率 | vqtunitrate | varchar(60) |  | 字符串 (String) |
| 122 | nqtorignetprice | 无税净价 | nqtorignetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 123 | nqtorigtaxnetprice | 含税净价 | nqtorigtaxnetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 124 | nqtnetprice | 本币无税净价 | nqtnetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 125 | nqttaxnetprice | 本币含税净价 | nqttaxnetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 126 | norigprice | 主无税单价 | norigprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 127 | norigtaxprice | 主含税单价 | norigtaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 128 | nprice | 主本币无税单价 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 129 | ntaxprice | 主本币含税单价 | ntaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 130 | nqtorigprice | 无税单价 | nqtorigprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 131 | nqtorigtaxprice | 含税单价 | nqtorigtaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 132 | nqtprice | 本币无税单价 | nqtprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 133 | nqttaxprice | 本币含税单价 | nqttaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 134 | nitemdiscountrate | 单品折扣 | nitemdiscountrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 135 | norigmny | 无税金额 | norigmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 136 | norigtaxmny | 价税合计 | norigtaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 137 | nmny | 本币无税金额 | nmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 138 | ntaxmny | 本币价税合计 | ntaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 139 | ntax | 税额 | ntax | decimal(28, 8) |  | 数值 (UFDouble) |
| 140 | blendoutflag | 借出转销售 | blendoutflag | char(1) |  | 布尔类型 (UFBoolean) |
| 141 | ntaxrate | 税率 | ntaxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 142 | cglobalcurrencyid | 全局本位币 | cglobalcurrencyid | varchar(20) |  | 币种 (currtype) |
| 143 | nglobalmny | 全局本币无税金额 | nglobalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 144 | nglobaltaxmny | 全局本币价税合计 | nglobaltaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 145 | nglobalexchgrate | 全局本位币汇率 | nglobalexchgrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 146 | cgroupcurrencyid | 集团本位币 | cgroupcurrencyid | varchar(20) |  | 币种 (currtype) |
| 147 | ngroupmny | 集团本币无税金额 | ngroupmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 148 | ngrouptaxmny | 集团本币价税合计 | ngrouptaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 149 | ngroupexchgrate | 集团本位币汇率 | ngroupexchgrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 150 | pk_batchcode | 批次主键 | pk_batchcode | varchar(20) |  | 批次档案 (BatchcodeVO) |
| 151 | csourcebilldate | 来源单据日期 | csourcebilldate | char(19) |  | 日期 (UFDate) |
| 152 | cfirstbilldate | 源头单据日期 | cfirstbilldate | char(19) |  | 日期 (UFDate) |
| 153 | nqtorigtaxnetprc | 报价单位含税净价 | nqtorigtaxnetprc | decimal(28, 8) |  | 数值 (UFDouble) |
| 154 | bwastageflag | 签收 | bwastageflag | char(1) |  | 布尔类型 (UFBoolean) |
| 155 | badvfeeflag | 代垫运费 | badvfeeflag | char(1) |  | 布尔类型 (UFBoolean) |
| 156 | csrcmaterialoid | 来源物料 | csrcmaterialoid | varchar(20) |  | 物料基本信息 (material_v) |
| 157 | csrcmaterialvid | 来源物料编码 | csrcmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 158 | cdelivery_bbid | 发货单报检单据主键 | cdelivery_bbid | varchar(20) |  | 主键 (UFID) |
| 159 | ctaxcodeid | 税码 | ctaxcodeid | varchar(20) |  | 增值税税码税率 (taxcode) |
| 160 | ncaltaxmny | 计税金额 | ncaltaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 161 | corigcountryid | 原产国 | corigcountryid | varchar(20) |  | 国家地区 (countryzone) |
| 162 | corigareaid | 原产地区 | corigareaid | varchar(20) |  | 行政区划 (region) |
| 163 | ftaxtypeflag | 扣税类别 | ftaxtypeflag | int |  | 扣税类别 (taxtype) |  | 1=应税外加; |