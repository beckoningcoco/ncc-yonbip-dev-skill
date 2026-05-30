# |<<

**费用待摊摊销信息明细 (er_expamtdetail / nc.vo.erm.expamortize.ExpamtDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1891.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_expamtdetail | 主键 | pk_expamtdetail | char(20) | √ | 主键 (UFID) |
| 2 | pk_jkbx | 报销单 | pk_jkbx | varchar(20) |  | 报销单 (bxzb) |
| 3 | bx_billno | 报销单编号 | bx_billno | varchar(50) |  | 字符串 (String) |
| 4 | pk_busitem | 报销业务行 | pk_busitem | varchar(20) |  | 报销单业务行 (er_busitem) |
| 5 | pk_cshare_detail | 报销分摊记录 | pk_cshare_detail | varchar(20) |  | 事前费用分摊明细 (bx_cshare_detail) |
| 6 | total_period | 总摊销期 | total_period | int |  | 整数 (Integer) |
| 7 | total_amount | 总摊销金额 | total_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | res_period | 剩余摊销期 | res_period | int |  | 整数 (Integer) |
| 9 | res_amount | 剩余摊销金额 | res_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | start_period | 起摊会计期间 | start_period | varchar(50) |  | 字符串 (String) |
| 11 | end_period | 止摊会计期间 | end_period | varchar(50) |  | 字符串 (String) |
| 12 | assume_org | 承担单位 | assume_org | varchar(20) |  | 组织 (org) |
| 13 | assume_dept | 承担部门 | assume_dept | varchar(20) |  | 组织_部门 (dept) |
| 14 | pk_pcorg | 利润中心 | pk_pcorg | varchar(20) |  | 利润中心 (profitcenter) |
| 15 | pk_resacostcenter | 成本中心 | pk_resacostcenter | varchar(20) |  | 成本中心 (resacostcenter) |
| 16 | pk_iobsclass | 收支项目 | pk_iobsclass | varchar(20) |  | 收支项目 (inoutbusiclass) |
| 17 | jobid | 项目 | jobid | varchar(20) |  | 项目 (project) |
| 18 | projecttask | 项目任务 | projecttask | varchar(20) |  | 项目任务 (WBS) |
| 19 | pk_checkele | 核算要素 | pk_checkele | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 20 | customer | 客户 | customer | varchar(20) |  | 客户基本信息 (customer) |
| 21 | hbbm | 供应商 | hbbm | varchar(20) |  | 供应商基本信息 (supplier) |
| 22 | bzbm | 币种 | bzbm | varchar(20) |  | 币种 (currtype) |
| 23 | bbhl | 组织本币汇率 | bbhl | decimal(15, 8) |  | 数值 (UFDouble) |
| 24 | globalbbhl | 全局本币汇率 | globalbbhl | decimal(15, 8) |  | 数值 (UFDouble) |
| 25 | groupbbhl | 集团本币汇率 | groupbbhl | decimal(15, 8) |  | 数值 (UFDouble) |
| 26 | bbje | 组织本币总金额 | bbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | globalbbje | 全局本币总金额 | globalbbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | groupbbje | 集团本币总金额 | groupbbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 30 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 31 | res_orgamount | 组织本币剩余金额 | res_orgamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | res_groupamount | 集团本币剩余金额 | res_groupamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | res_globalamount | 全局本币剩余金额 | res_globalamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | billstatus | 单据状态 | billstatus | int |  | 整数 (Integer) |
| 35 | cashproj | 资金计划项目 | cashproj | varchar(20) |  | 资金计划项目 (fundplan) |
| 36 | pk_proline | 产品线 | pk_proline | varchar(20) |  | 产品线 (prodline) |
| 37 | pk_brand | 品牌 | pk_brand | varchar(20) |  | 品牌档案 (branddoc) |
| 38 | pk_payablebill | 应付单 | pk_payablebill | varchar(50) |  | 字符串 (String) |
| 39 | pk_receivablebill | 应收单 | pk_receivablebill | varchar(50) |  | 字符串 (String) |
| 40 | srcsystem | 来源 | srcsystem | varchar(50) |  | 字符串 (String) |
| 41 | fistperiodbbje | 首期摊销金额 | fistperiodbbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 42 | total_taxlessamount | 总无税摊销金额 | total_taxlessamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 43 | res_taxlessamount | 剩余无税摊销金额 | res_taxlessamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 44 | fistperiodtaxlessbbje | 首期无税摊销金额 | fistperiodtaxlessbbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 45 | defitem30 | 自定义项30 | defitem30 | varchar(101) |  | 自定义项 (Custom) |
| 46 | defitem29 | 自定义项29 | defitem29 | varchar(101) |  | 自定义项 (Custom) |
| 47 | defitem28 | 自定义项28 | defitem28 | varchar(101) |  | 自定义项 (Custom) |
| 48 | defitem27 | 自定义项27 | defitem27 | varchar(101) |  | 自定义项 (Custom) |
| 49 | defitem26 | 自定义项26 | defitem26 | varchar(101) |  | 自定义项 (Custom) |
| 50 | defitem25 | 自定义项25 | defitem25 | varchar(101) |  | 自定义项 (Custom) |
| 51 | defitem24 | 自定义项24 | defitem24 | varchar(101) |  | 自定义项 (Custom) |
| 52 | defitem23 | 自定义项23 | defitem23 | varchar(101) |  | 自定义项 (Custom) |
| 53 | defitem22 | 自定义项22 | defitem22 | varchar(101) |  | 自定义项 (Custom) |
| 54 | defitem21 | 自定义项21 | defitem21 | varchar(101) |  | 自定义项 (Custom) |
| 55 | defitem20 | 自定义项20 | defitem20 | varchar(101) |  | 自定义项 (Custom) |
| 56 | defitem19 | 自定义项19 | defitem19 | varchar(101) |  | 自定义项 (Custom) |
| 57 | defitem18 | 自定义项18 | defitem18 | varchar(101) |  | 自定义项 (Custom) |
| 58 | defitem17 | 自定义项17 | defitem17 | varchar(101) |  | 自定义项 (Custom) |
| 59 | defitem16 | 自定义项16 | defitem16 | varchar(101) |  | 自定义项 (Custom) |
| 60 | defitem15 | 自定义项15 | defitem15 | varchar(101) |  | 自定义项 (Custom) |
| 61 | defitem14 | 自定义项14 | defitem14 | varchar(101) |  | 自定义项 (Custom) |
| 62 | defitem13 | 自定义项13 | defitem13 | varchar(101) |  | 自定义项 (Custom) |
| 63 | defitem12 | 自定义项12 | defitem12 | varchar(101) |  | 自定义项 (Custom) |
| 64 | defitem11 | 自定义项11 | defitem11 | varchar(101) |  | 自定义项 (Custom) |
| 65 | defitem10 | 自定义项10 | defitem10 | varchar(101) |  | 自定义项 (Custom) |
| 66 | defitem9 | 自定义项9 | defitem9 | varchar(101) |  | 自定义项 (Custom) |
| 67 | defitem8 | 自定义项8 | defitem8 | varchar(101) |  | 自定义项 (Custom) |
| 68 | defitem7 | 自定义项7 | defitem7 | varchar(101) |  | 自定义项 (Custom) |
| 69 | defitem6 | 自定义项6 | defitem6 | varchar(101) |  | 自定义项 (Custom) |
| 70 | defitem5 | 自定义项5 | defitem5 | varchar(101) |  | 自定义项 (Custom) |
| 71 | defitem4 | 自定义项4 | defitem4 | varchar(101) |  | 自定义项 (Custom) |
| 72 | defitem3 | 自定义项3 | defitem3 | varchar(101) |  | 自定义项 (Custom) |
| 73 | defitem2 | 自定义项2 | defitem2 | varchar(101) |  | 自定义项 (Custom) |
| 74 | defitem1 | 自定义项1 | defitem1 | varchar(101) |  | 自定义项 (Custom) |
| 75 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 76 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 77 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 78 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |