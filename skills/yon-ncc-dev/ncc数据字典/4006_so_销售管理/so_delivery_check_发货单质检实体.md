# |<<

**发货单质检实体 (so_delivery_check / nc.vo.so.m4331.entity.DeliveryCheckVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5401.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cdeliverycid | 发货单质检实体 | cdeliverycid | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 质检结果行 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | cmaterialid | 物料版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 4 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 5 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 6 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 7 | cqualitylevelid | 质量等级 | cqualitylevelid | char(20) |  | 主键 (UFID) |
| 8 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 9 | pk_batchcode | 批次档案 | pk_batchcode | char(20) |  | 主键 (UFID) |
| 10 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 11 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 12 | nastnum | 数量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 14 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 16 | cqtunitid | 报价单位 | cqtunitid | varchar(20) |  | 计量单位 (measdoc) |
| 17 | nqtunitnum | 质检报价数量 | nqtunitnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | vqtunitrate | 报价换算率 | vqtunitrate | varchar(60) |  | 字符串 (String) |
| 19 | vcheckcode | 质检单据号 | vcheckcode | varchar(40) |  | 字符串 (String) |
| 20 | dcheckdate | 质检日期 | dcheckdate | char(19) |  | 日期 (UFDate) |
| 21 | ccheckstatebid | 检验状态 | ccheckstatebid | varchar(20) |  | 质量等级 (scm_qualitylevel_b) |
| 22 | cdefectprocessid | 建议处理方式 | cdefectprocessid | varchar(20) |  | 处理方式 (scm_dealfashion) |
| 23 | beligflag | 是否合格 | beligflag | char(1) |  | 布尔类型 (UFBoolean) |
| 24 | bcheckinflag | 质检报告是否可入库 | bcheckinflag | char(1) |  | 布尔类型 (UFBoolean) |
| 25 | blargessflag | 赠品 | blargessflag | char(1) |  | 布尔类型 (UFBoolean) |
| 26 | bpricechgflag | 物料改判 | bpricechgflag | char(1) |  | 布尔类型 (UFBoolean) |
| 27 | ntaxrate | 税率 | ntaxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | ndiscountrate | 整单折扣 | ndiscountrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | nitemdiscountrate | 单品折扣 | nitemdiscountrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | norigtaxprice | 主含税单价 | norigtaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | norigprice | 主无税单价 | norigprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | norigtaxnetprice | 主含税净价 | norigtaxnetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | norignetprice | 主无税净价 | norignetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | nqtorigtaxprice | 含税单价 | nqtorigtaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 35 | nqtorigprice | 无税单价 | nqtorigprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 36 | nqtorigtaxnetprc | 含税净价 | nqtorigtaxnetprc | decimal(28, 8) |  | 数值 (UFDouble) |
| 37 | nqtorignetprice | 无税净价 | nqtorignetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 38 | norigmny | 无税金额 | norigmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 39 | norigtaxmny | 价税合计 | norigtaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 40 | norigdiscount | 折扣额 | norigdiscount | decimal(28, 8) |  | 数值 (UFDouble) |
| 41 | ntaxprice | 本币主含税单价 | ntaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 42 | nprice | 本币主无税单价 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 43 | ntaxnetprice | 本币主含税净价 | ntaxnetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 44 | nnetprice | 本币主无税净价 | nnetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 45 | nqttaxprice | 本币含税单价 | nqttaxprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 46 | nqtprice | 本币无税单价 | nqtprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 47 | nqttaxnetprice | 本币含税净价 | nqttaxnetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 48 | nqtnetprice | 本币无税净价 | nqtnetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 49 | ntax | 税额 | ntax | decimal(28, 8) |  | 数值 (UFDouble) |
| 50 | nmny | 本币无税金额 | nmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 51 | ntaxmny | 本币价税合计 | ntaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 52 | ndiscount | 本币折扣额 | ndiscount | decimal(28, 8) |  | 数值 (UFDouble) |
| 53 | corigcurrencyid | 原币 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |
| 54 | nexchangerate | 折本汇率 | nexchangerate | decimal(28, 8) |  | 数值 (UFDouble) |
| 55 | ccurrencyid | 本位币 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 56 | ntotaltransnum | 累计运输数量 | ntotaltransnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 57 | btransendflag | 运输关闭 | btransendflag | char(1) |  | 布尔类型 (UFBoolean) |
| 58 | ntotaloutnum | 累计出库数量 | ntotaloutnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 59 | boutendflag | 出库关闭 | boutendflag | char(1) |  | 布尔类型 (UFBoolean) |
| 60 | vrownote | 备注 | vrownote | varchar(181) |  | 字符串 (String) |
| 61 | vsrcrowno | 接收单行号 | vsrcrowno | varchar(20) |  | 字符串 (String) |
| 62 | pk_org | 物流组织 | pk_org | varchar(20) |  | 组织_业务单元_物流组织 (trafficorg) |
| 63 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 64 | ntotalnotoutnum | 累计应发未出库主数量 | ntotalnotoutnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 65 | csrcid | 来源单据id | csrcid | char(50) |  | 字符串 (String) |
| 66 | nglobaltaxmny | 全局本币价税合计 | nglobaltaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 67 | nglobalmny | 全局本币无税金额 | nglobalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 68 | nglobalexchgrate | 全局本位币汇率 | nglobalexchgrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 69 | ngrouptaxmny | 集团本币价税合计 | ngrouptaxmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 70 | ngroupmny | 集团本币无税金额 | ngroupmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 71 | ngroupexchgrate | 集团本位币汇率 | ngroupexchgrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 72 | crececountryid | 收货国家/地区 | crececountryid | varchar(20) |  | 国家地区 (countryzone) |
| 73 | csendcountryid | 发货国/地区 | csendcountryid | varchar(20) |  | 国家地区 (countryzone) |
| 74 | ctaxcountryid | 报税国/地区 | ctaxcountryid | varchar(20) |  | 国家地区 (countryzone) |
| 75 | fbuysellflag | 购销类型 | fbuysellflag | int |  | 购销类型 (pursaletype) |  | 1=国内销售; |