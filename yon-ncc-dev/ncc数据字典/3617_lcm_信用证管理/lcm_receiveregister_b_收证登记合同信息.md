# |<<

**收证登记合同信息 (lcm_receiveregister_b / nc.vo.lcm.receive.receiveregister.ReceiveRegisterBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3581.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_receiptregister_b | 合同信息主键 | pk_receiptregister_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | contractno | 合同号 | contractno | varchar(50) |  | 字符串 (String) |
| 6 | pk_currtype | 合同币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 7 | pk_marbasclass | 货品分类 | pk_marbasclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 8 | pk_material | 货品/劳务 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 9 | quantity | 数量 | quantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | measure | 计量单位 | measure | varchar(20) |  | 计量单位 (measdoc) |
| 11 | unitprice | 单价 | unitprice | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | amount | 金额 | amount | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | bitnumber | 计量单位小数位 | bitnumber | int |  | 整数 (Integer) |
| 14 | pk_cnt | 出口合同主键 | pk_cnt | varchar(50) |  | 字符串 (String) |
| 15 | srcbilltype | 来源单据类型 | srcbilltype | varchar(10) |  | 字符串 (String) |
| 16 | srccode | 来源编号 | srccode | varchar(50) |  | 字符串 (String) |
| 17 | pk_srcbill | 来源单据主键 | pk_srcbill | varchar(50) |  | 字符串 (String) |
| 18 | pk_srcbillline | 来源单据行主键 | pk_srcbillline | varchar(50) |  | 字符串 (String) |
| 19 | srcbillbusitype | 来源单据交易类型 | srcbillbusitype | varchar(50) |  | 字符串 (String) |
| 20 | headbusitype | 源头交易类型 | headbusitype | varchar(50) |  | 字符串 (String) |
| 21 | headbilltype | 源头单据类型 | headbilltype | varchar(50) |  | 字符串 (String) |
| 22 | pk_headbill | 源头单据主键 | pk_headbill | varchar(50) |  | 字符串 (String) |
| 23 | pk_headbillline | 源头单据行主键 | pk_headbillline | varchar(50) |  | 字符串 (String) |
| 24 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 25 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vdef21 | 自定义项21 | vdef21 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vdef22 | 自定义项22 | vdef22 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vdef23 | 自定义项23 | vdef23 | varchar(101) |  | 自定义项 (Custom) |
| 47 | vdef24 | 自定义项24 | vdef24 | varchar(101) |  | 自定义项 (Custom) |
| 48 | vdef25 | 自定义项25 | vdef25 | varchar(101) |  | 自定义项 (Custom) |
| 49 | vdef26 | 自定义项26 | vdef26 | varchar(101) |  | 自定义项 (Custom) |
| 50 | vdef27 | 自定义项27 | vdef27 | varchar(101) |  | 自定义项 (Custom) |
| 51 | vdef28 | 自定义项28 | vdef28 | varchar(101) |  | 自定义项 (Custom) |
| 52 | vdef29 | 自定义项29 | vdef29 | varchar(101) |  | 自定义项 (Custom) |
| 53 | vdef30 | 自定义项30 | vdef30 | varchar(101) |  | 自定义项 (Custom) |