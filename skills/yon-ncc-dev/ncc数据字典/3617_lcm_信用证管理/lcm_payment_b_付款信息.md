# |<<

**付款信息 (lcm_payment_b / nc.vo.lcm.open.payment.PaymentInfoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3575.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_payment_b | 主键 | pk_payment_b | char(20) | √ | 主键 (UFID) |
| 2 | contractno | 合同号 | contractno | varchar(50) |  | 字符串 (String) |
| 3 | pk_concurrtype | 合同币种 | pk_concurrtype | varchar(20) |  | 币种 (currtype) |
| 4 | arrivalbatch | 到货批次 | arrivalbatch | varchar(50) |  | 字符串 (String) |
| 5 | pk_marbasclass | 货品分类 | pk_marbasclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 6 | pk_material | 货品/劳务 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | pk_measdoc | 计量单位 | pk_measdoc | varchar(20) |  | 计量单位 (measdoc) |
| 8 | arrivalcount | 到货数量 | arrivalcount | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | arrivalamnt | 到货金额 | arrivalamnt | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | payamount | 付款金额(原币) | payamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | paylcamount | 付款金额(本币) | paylcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | bitnumber | 小数位 | bitnumber | int |  | 整数 (Integer) |
| 13 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 14 | pk_org_v | 财务组织多版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 15 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 16 | glcpayamt | 付款金额(集团本币) | glcpayamt | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | gllcpayamt | 付款金额(全局本币) | gllcpayamt | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | pk_contract | 合同主键 | pk_contract | varchar(20) |  | 字符串 (String) |
| 19 | srccode | 来源编号 | srccode | varchar(50) |  | 字符串 (String) |
| 20 | srcbilltype | 来源单据类型 | srcbilltype | varchar(50) |  | 字符串 (String) |
| 21 | pk_srcbillline | 来源单据行主键 | pk_srcbillline | varchar(50) |  | 字符串 (String) |
| 22 | srcbillbusitype | 来源单据交易类型 | srcbillbusitype | varchar(50) |  | 字符串 (String) |
| 23 | srcheadbusitype | 源头交易类型 | srcheadbusitype | varchar(50) |  | 字符串 (String) |
| 24 | srcheadbilltype | 源头单据类型 | srcheadbilltype | varchar(50) |  | 字符串 (String) |
| 25 | pk_srcheadbill | 源头单据主键 | pk_srcheadbill | varchar(50) |  | 字符串 (String) |
| 26 | pk_srcheadbillline | 源头单据行主键 | pk_srcheadbillline | varchar(50) |  | 字符串 (String) |
| 27 | pk_srcbill | 来源单据主键 | pk_srcbill | varchar(50) |  | 字符串 (String) |
| 28 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 47 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |