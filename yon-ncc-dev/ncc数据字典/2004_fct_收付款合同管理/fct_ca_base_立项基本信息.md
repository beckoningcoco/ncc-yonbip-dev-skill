# |<<

**立项基本信息 (fct_ca_base / nc.vo.fct.approval.FctCaBaseVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2181.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ca_base | 基本信息主键 | pk_ca_base | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 4 | pk_subjcode | 收支项目 | pk_subjcode | varchar(20) |  | 收支项目 (inoutbusiclass) |
| 5 | pk_ca_class | 立项分类 | pk_ca_class | varchar(20) |  | 合同立项分类(自定义档案) (Defdoc-FCT001) |
| 6 | material | 物料 | material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | pk_marbasclass | 物料分类编码 | pk_marbasclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 8 | pk_srcmaterial | 物料最新版本 | pk_srcmaterial | varchar(20) |  | 物料基本信息 (material_v) |
| 9 | pk_unit | 计量单位 | pk_unit | varchar(20) |  | 计量单位 (measdoc) |
| 10 | num | 数量 | num | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 12 | rate | 汇率 | rate | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | oriamount | 立项原币金额 | oriamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | orgamount | 立项组织本币金额 | orgamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | groupamount | 立项集团本币金额 | groupamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | globalamount | 立项全局本币 | globalamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | ctamount | 合同签订金额 | ctamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | ctorgamount | 合同签订组织本币金额 | ctorgamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | finishedamount | 已完成金额 | finishedamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | finishedorgamount | 已完成组织本币金额 | finishedorgamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | unfinishedamount | 未完成金额 | unfinishedamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | unfinishedorgamount | 未完成组织本币金额 | unfinishedorgamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | scale | 超立项合同比例 | scale | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | contractype | 合同类型 | contractype | varchar(50) |  | 字符串 (String) |
| 25 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vdef21 | 自定义项21 | vdef21 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vdef22 | 自定义项22 | vdef22 | varchar(101) |  | 自定义项 (Custom) |
| 47 | vdef23 | 自定义项23 | vdef23 | varchar(101) |  | 自定义项 (Custom) |
| 48 | vdef24 | 自定义项24 | vdef24 | varchar(101) |  | 自定义项 (Custom) |
| 49 | vdef25 | 自定义项25 | vdef25 | varchar(101) |  | 自定义项 (Custom) |
| 50 | vdef26 | 自定义项26 | vdef26 | varchar(101) |  | 自定义项 (Custom) |
| 51 | vdef27 | 自定义项27 | vdef27 | varchar(101) |  | 自定义项 (Custom) |
| 52 | vdef28 | 自定义项28 | vdef28 | varchar(101) |  | 自定义项 (Custom) |
| 53 | vdef29 | 自定义项29 | vdef29 | varchar(101) |  | 自定义项 (Custom) |
| 54 | vdef30 | 自定义项30 | vdef30 | varchar(101) |  | 自定义项 (Custom) |
| 55 | vdef31 | 自定义项31 | vdef31 | varchar(101) |  | 自定义项 (Custom) |
| 56 | vdef32 | 自定义项32 | vdef32 | varchar(101) |  | 自定义项 (Custom) |
| 57 | vdef33 | 自定义项33 | vdef33 | varchar(101) |  | 自定义项 (Custom) |
| 58 | vdef34 | 自定义项34 | vdef34 | varchar(101) |  | 自定义项 (Custom) |
| 59 | vdef35 | 自定义项35 | vdef35 | varchar(101) |  | 自定义项 (Custom) |
| 60 | vdef36 | 自定义项36 | vdef36 | varchar(101) |  | 自定义项 (Custom) |
| 61 | vdef37 | 自定义项37 | vdef37 | varchar(101) |  | 自定义项 (Custom) |
| 62 | vdef38 | 自定义项38 | vdef38 | varchar(101) |  | 自定义项 (Custom) |
| 63 | vdef39 | 自定义项39 | vdef39 | varchar(101) |  | 自定义项 (Custom) |
| 64 | vdef40 | 自定义项40 | vdef40 | varchar(101) |  | 自定义项 (Custom) |