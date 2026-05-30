# |<<

**交单登记子表 (lcm_submissionregister_b / nc.vo.lcm.receive.submissionregister.SubmissionRegisterBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3586.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_submissionregister_b | 交单登记子表主键 | pk_submissionregister_b | char(20) | √ | 主键 (UFID) |
| 2 | contractno | 合同号 | contractno | varchar(50) |  | 字符串 (String) |
| 3 | pk_concurrtype | 合同币种 | pk_concurrtype | varchar(20) |  | 币种 (currtype) |
| 4 | submissionbatch | 发货批次 | submissionbatch | varchar(50) |  | 字符串 (String) |
| 5 | pk_marbasclass | 货品分类 | pk_marbasclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 6 | pk_material | 货品/劳务 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | pk_measdoc | 计量单位 | pk_measdoc | varchar(20) |  | 计量单位 (measdoc) |
| 8 | bitnumber | 计量单位小数位数 | bitnumber | int |  | 整数 (Integer) |
| 9 | materialcount | 发货数量 | materialcount | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | materialprice | 单价 | materialprice | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | materialamount | 发货金额 | materialamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | materialolcamount | 发货金额组织本币金额 | materialolcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | materialglcamount | 发货金额集团本币金额 | materialglcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | materialgllcamount | 发货金额全局本币金额 | materialgllcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | remark | 备注 | remark | varchar(181) |  | 备注 (Memo) |
| 16 | pk_handler | 经手人 | pk_handler | varchar(20) |  | 人员基本信息 (psndoc) |
| 17 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 18 | pk_org_v | 财务组织多版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 19 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 20 | pk_contract | 来源合同主键 | pk_contract | varchar(20) |  | 字符串 (String) |
| 21 | srccode | 来源编号 | srccode | varchar(50) |  | 字符串 (String) |
| 22 | srcbilltype | 来源单据类型 | srcbilltype | varchar(50) |  | 字符串 (String) |
| 23 | pk_srcbill | 来源单据主键 | pk_srcbill | varchar(50) |  | 字符串 (String) |
| 24 | pk_srcbillline | 来源单据行主键 | pk_srcbillline | varchar(50) |  | 字符串 (String) |
| 25 | srcbillbusitype | 来源单据交易类型 | srcbillbusitype | varchar(50) |  | 字符串 (String) |
| 26 | headbusitype | 源头交易类型 | headbusitype | varchar(50) |  | 字符串 (String) |
| 27 | headbilltype | 源头单据类型 | headbilltype | varchar(50) |  | 字符串 (String) |
| 28 | pk_headbill | 源头单据主键 | pk_headbill | varchar(50) |  | 字符串 (String) |
| 29 | pk_headbillline | 源头单据行主键 | pk_headbillline | varchar(50) |  | 字符串 (String) |
| 30 | submiss4etamnt | 结汇交单金额 | submiss4etamnt | decimal(28, 8) |  | 金额 (UFMoney) |
| 31 | submissionamount | 交单金额 | submissionamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 32 | submissionolcamount | 交单金额组织本币金额 | submissionolcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 33 | submissionglcamount | 交单金额集团本币金额 | submissionglcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 34 | submissiongllcamount | 交单金额全局本币金额 | submissiongllcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 35 | poundage | 手续费 | poundage | decimal(28, 8) |  | 数值 (UFDouble) |
| 36 | olcpoundage | 手续费组织本币 | olcpoundage | decimal(28, 8) |  | 数值 (UFDouble) |
| 37 | glcpoundage | 手续费集团本币 | glcpoundage | decimal(28, 8) |  | 数值 (UFDouble) |
| 38 | gllcpoundage | 手续费全局本币 | gllcpoundage | decimal(28, 8) |  | 数值 (UFDouble) |
| 39 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 47 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 48 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 49 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 50 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 51 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 52 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 53 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 54 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 55 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 56 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 57 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 58 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |
| 59 | vdef21 | 自定义项21 | vdef21 | varchar(101) |  | 自定义项 (Custom) |
| 60 | vdef22 | 自定义项22 | vdef22 | varchar(101) |  | 自定义项 (Custom) |
| 61 | vdef23 | 自定义项23 | vdef23 | varchar(101) |  | 自定义项 (Custom) |
| 62 | vdef24 | 自定义项24 | vdef24 | varchar(101) |  | 自定义项 (Custom) |
| 63 | vdef25 | 自定义项25 | vdef25 | varchar(101) |  | 自定义项 (Custom) |
| 64 | vdef26 | 自定义项26 | vdef26 | varchar(101) |  | 自定义项 (Custom) |
| 65 | vdef27 | 自定义项27 | vdef27 | varchar(101) |  | 自定义项 (Custom) |
| 66 | vdef28 | 自定义项28 | vdef28 | varchar(101) |  | 自定义项 (Custom) |
| 67 | vdef29 | 自定义项29 | vdef29 | varchar(101) |  | 自定义项 (Custom) |
| 68 | vdef30 | 自定义项30 | vdef30 | varchar(101) |  | 自定义项 (Custom) |