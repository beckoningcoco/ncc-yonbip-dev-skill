# |<<

**收款信息子表 (lcm_collectionnotice_b / nc.vo.lcm.receive.collectionnotice.CollectionNoticeBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3558.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_collectionnotice_b | 收款信息子表主键 | pk_collectionnotice_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | contractno | 合同号 | contractno | varchar(50) |  | 字符串 (String) |
| 6 | pk_concurrtype | 合同币种 | pk_concurrtype | varchar(20) |  | 币种 (currtype) |
| 7 | submissionbatch | 发货批次 | submissionbatch | varchar(50) |  | 字符串 (String) |
| 8 | pk_marbasclass | 货品分类 | pk_marbasclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 9 | pk_material | 货品 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 10 | materialcount | 数量 | materialcount | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | pk_measdoc | 计量单位 | pk_measdoc | varchar(20) |  | 计量单位 (measdoc) |
| 12 | bitnumber | 计量单位小数位数 | bitnumber | int |  | 整数 (Integer) |
| 13 | materialprice | 单价 | materialprice | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | materialamount | 发货金额 | materialamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | collectamount | 收款金额 | collectamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | olcrate | 组织本币汇率 | olcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | collectolcamount | 收款金额组织本币金额 | collectolcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | glcrate | 集团本币汇率 | glcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | collectglcamount | 收款金额集团本币金额 | collectglcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | gllcrate | 全局本币汇率 | gllcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | collectgllcamount | 收款金额全局本币金额 | collectgllcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | remark | 备注 | remark | varchar(181) |  | 备注 (Memo) |
| 23 | srccode | 来源编号 | srccode | varchar(50) |  | 字符串 (String) |
| 24 | srcbilltype | 来源单据类型 | srcbilltype | varchar(50) |  | 字符串 (String) |
| 25 | pk_srcbill | 来源单据主键 | pk_srcbill | varchar(50) |  | 字符串 (String) |
| 26 | pk_srcbillline | 来源单据行主键 | pk_srcbillline | varchar(50) |  | 字符串 (String) |
| 27 | srcbillbusitype | 来源单据交易类型 | srcbillbusitype | varchar(50) |  | 字符串 (String) |
| 28 | headbusitype | 源头交易类型 | headbusitype | varchar(50) |  | 字符串 (String) |
| 29 | headbilltype | 源头单据类型 | headbilltype | varchar(50) |  | 字符串 (String) |
| 30 | pk_headbill | 源头单据主键 | pk_headbill | varchar(50) |  | 字符串 (String) |
| 31 | pk_headbillline | 源头单据行主键 | pk_headbillline | varchar(50) |  | 字符串 (String) |
| 32 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 47 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 48 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 49 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 50 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 51 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |
| 52 | vdef21 | 自定义项21 | vdef21 | varchar(101) |  | 自定义项 (Custom) |
| 53 | vdef22 | 自定义项22 | vdef22 | varchar(101) |  | 自定义项 (Custom) |
| 54 | vdef23 | 自定义项23 | vdef23 | varchar(101) |  | 自定义项 (Custom) |
| 55 | vdef24 | 自定义项24 | vdef24 | varchar(101) |  | 自定义项 (Custom) |
| 56 | vdef25 | 自定义项25 | vdef25 | varchar(101) |  | 自定义项 (Custom) |
| 57 | vdef26 | 自定义项26 | vdef26 | varchar(101) |  | 自定义项 (Custom) |
| 58 | vdef27 | 自定义项27 | vdef27 | varchar(101) |  | 自定义项 (Custom) |
| 59 | vdef28 | 自定义项28 | vdef28 | varchar(101) |  | 自定义项 (Custom) |
| 60 | vdef29 | 自定义项29 | vdef29 | varchar(101) |  | 自定义项 (Custom) |
| 61 | vdef30 | 自定义项30 | vdef30 | varchar(101) |  | 自定义项 (Custom) |