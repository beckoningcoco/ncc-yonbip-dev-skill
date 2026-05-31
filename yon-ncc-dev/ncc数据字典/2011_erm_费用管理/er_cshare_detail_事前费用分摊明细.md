# |<<

**事前费用分摊明细 (er_cshare_detail / nc.vo.erm.costshare.CShareDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1885.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cshare_detail | 主键 | pk_cshare_detail | char(20) | √ | 主键 (UFID) |
| 2 | billno | 单据编号 | billno | varchar(50) |  | 字符串 (String) |
| 3 | pk_billtype | 单据类型 | pk_billtype | varchar(20) |  | 字符串 (String) |
| 4 | pk_tradetype | 交易类型 | pk_tradetype | varchar(20) |  | 字符串 (String) |
| 5 | billstatus | 单据状态 | billstatus | int |  | 整数 (Integer) |
| 6 | assume_org | 承担单位 | assume_org | varchar(20) |  | 组织 (org) |
| 7 | assume_dept | 承担部门 | assume_dept | varchar(20) |  | 组织_部门 (dept) |
| 8 | pk_pcorg | 利润中心 | pk_pcorg | varchar(20) |  | 利润中心 (profitcenter) |
| 9 | pk_resacostcenter | 成本中心 | pk_resacostcenter | varchar(20) |  | 成本中心 (resacostcenter) |
| 10 | pk_iobsclass | 收支项目 | pk_iobsclass | varchar(20) |  | 收支项目 (inoutbusiclass) |
| 11 | jobid | 项目 | jobid | varchar(20) |  | 项目 (project) |
| 12 | projecttask | 项目任务 | projecttask | varchar(20) |  | 项目任务 (WBS) |
| 13 | pk_checkele | 核算要素 | pk_checkele | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 14 | customer | 客户 | customer | varchar(20) |  | 客户基本信息 (customer) |
| 15 | hbbm | 供应商 | hbbm | varchar(20) |  | 供应商基本信息 (supplier) |
| 16 | assume_amount | 承担金额 | assume_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | share_ratio | 分摊比例 | share_ratio | decimal(15, 8) |  | 数值 (UFDouble) |
| 18 | src_type | 来源方式 | src_type | int |  | 整数 (Integer) |
| 19 | src_id | 来源单据ID | src_id | varchar(20) |  | 字符串 (String) |
| 20 | bzbm | 币种 | bzbm | varchar(20) |  | 币种 (currtype) |
| 21 | bbhl | 组织本币汇率 | bbhl | decimal(15, 8) |  | 数值 (UFDouble) |
| 22 | bbje | 组织本币金额 | bbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | globalbbje | 全局本币金额 | globalbbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | groupbbje | 集团本币金额 | groupbbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | globalbbhl | 全局本币汇率 | globalbbhl | decimal(15, 8) |  | 数值 (UFDouble) |
| 26 | groupbbhl | 集团本币汇率 | groupbbhl | decimal(15, 8) |  | 数值 (UFDouble) |
| 27 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 28 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 29 | pk_costshare | 费用结转单_主键 | pk_costshare | char(20) |  | 主键 (UFID) |
| 30 | pk_item | 费用申请单 | pk_item | varchar(50) |  | 字符串 (String) |
| 31 | pk_mtapp_detail | 费用申请明细 | pk_mtapp_detail | varchar(50) |  | 字符串 (String) |
| 32 | pk_proline | 产品线 | pk_proline | varchar(20) |  | 产品线 (prodline) |
| 33 | pk_brand | 品牌 | pk_brand | varchar(20) |  | 品牌档案 (branddoc) |
| 34 | ysdate | 预算占用日期 | ysdate | char(19) |  | 日期 (UFDate) |
| 35 | src_ybz_id | 友报账id | src_ybz_id | varchar(50) |  | 字符串 (String) |
| 36 | defitem30 | 自定义项30 | defitem30 | varchar(101) |  | 自定义项 (Custom) |
| 37 | defitem29 | 自定义项29 | defitem29 | varchar(101) |  | 自定义项 (Custom) |
| 38 | defitem28 | 自定义项28 | defitem28 | varchar(101) |  | 自定义项 (Custom) |
| 39 | defitem27 | 自定义项27 | defitem27 | varchar(101) |  | 自定义项 (Custom) |
| 40 | defitem26 | 自定义项26 | defitem26 | varchar(101) |  | 自定义项 (Custom) |
| 41 | defitem25 | 自定义项25 | defitem25 | varchar(101) |  | 自定义项 (Custom) |
| 42 | defitem24 | 自定义项24 | defitem24 | varchar(101) |  | 自定义项 (Custom) |
| 43 | defitem23 | 自定义项23 | defitem23 | varchar(101) |  | 自定义项 (Custom) |
| 44 | defitem22 | 自定义项22 | defitem22 | varchar(101) |  | 自定义项 (Custom) |
| 45 | defitem21 | 自定义项21 | defitem21 | varchar(101) |  | 自定义项 (Custom) |
| 46 | defitem20 | 自定义项20 | defitem20 | varchar(101) |  | 自定义项 (Custom) |
| 47 | defitem19 | 自定义项19 | defitem19 | varchar(101) |  | 自定义项 (Custom) |
| 48 | defitem18 | 自定义项18 | defitem18 | varchar(101) |  | 自定义项 (Custom) |
| 49 | defitem17 | 自定义项17 | defitem17 | varchar(101) |  | 自定义项 (Custom) |
| 50 | defitem16 | 自定义项16 | defitem16 | varchar(101) |  | 自定义项 (Custom) |
| 51 | defitem15 | 自定义项15 | defitem15 | varchar(101) |  | 自定义项 (Custom) |
| 52 | defitem14 | 自定义项14 | defitem14 | varchar(101) |  | 自定义项 (Custom) |
| 53 | defitem13 | 自定义项13 | defitem13 | varchar(101) |  | 自定义项 (Custom) |
| 54 | defitem12 | 自定义项12 | defitem12 | varchar(101) |  | 自定义项 (Custom) |
| 55 | defitem11 | 自定义项11 | defitem11 | varchar(101) |  | 自定义项 (Custom) |
| 56 | defitem10 | 自定义项10 | defitem10 | varchar(101) |  | 自定义项 (Custom) |
| 57 | defitem9 | 自定义项9 | defitem9 | varchar(101) |  | 自定义项 (Custom) |
| 58 | defitem8 | 自定义项8 | defitem8 | varchar(101) |  | 自定义项 (Custom) |
| 59 | defitem7 | 自定义项7 | defitem7 | varchar(101) |  | 自定义项 (Custom) |
| 60 | defitem6 | 自定义项6 | defitem6 | varchar(101) |  | 自定义项 (Custom) |
| 61 | defitem5 | 自定义项5 | defitem5 | varchar(101) |  | 自定义项 (Custom) |
| 62 | defitem4 | 自定义项4 | defitem4 | varchar(101) |  | 自定义项 (Custom) |
| 63 | defitem3 | 自定义项3 | defitem3 | varchar(101) |  | 自定义项 (Custom) |
| 64 | defitem2 | 自定义项2 | defitem2 | varchar(101) |  | 自定义项 (Custom) |
| 65 | defitem1 | 自定义项1 | defitem1 | varchar(101) |  | 自定义项 (Custom) |
| 66 | defitem31 | 自定义项31 | defitem31 | varchar(101) |  | 自定义项 (Custom) |
| 67 | defitem32 | 自定义项32 | defitem32 | varchar(101) |  | 自定义项 (Custom) |
| 68 | defitem33 | 自定义项33 | defitem33 | varchar(101) |  | 自定义项 (Custom) |
| 69 | defitem34 | 自定义项34 | defitem34 | varchar(101) |  | 自定义项 (Custom) |
| 70 | defitem35 | 自定义项35 | defitem35 | varchar(101) |  | 自定义项 (Custom) |
| 71 | defitem36 | 自定义项36 | defitem36 | varchar(101) |  | 自定义项 (Custom) |
| 72 | defitem37 | 自定义项37 | defitem37 | varchar(101) |  | 自定义项 (Custom) |
| 73 | defitem38 | 自定义项38 | defitem38 | varchar(101) |  | 自定义项 (Custom) |
| 74 | defitem39 | 自定义项39 | defitem39 | varchar(101) |  | 自定义项 (Custom) |
| 75 | defitem40 | 自定义项40 | defitem40 | varchar(101) |  | 自定义项 (Custom) |
| 76 | defitem41 | 自定义项41 | defitem41 | varchar(101) |  | 自定义项 (Custom) |
| 77 | defitem42 | 自定义项42 | defitem42 | varchar(101) |  | 自定义项 (Custom) |
| 78 | defitem43 | 自定义项43 | defitem43 | varchar(101) |  | 自定义项 (Custom) |
| 79 | defitem44 | 自定义项44 | defitem44 | varchar(101) |  | 自定义项 (Custom) |
| 80 | defitem45 | 自定义项45 | defitem45 | varchar(101) |  | 自定义项 (Custom) |
| 81 | defitem46 | 自定义项46 | defitem46 | varchar(101) |  | 自定义项 (Custom) |
| 82 | defitem47 | 自定义项47 | defitem47 | varchar(101) |  | 自定义项 (Custom) |
| 83 | defitem48 | 自定义项48 | defitem48 | varchar(101) |  | 自定义项 (Custom) |
| 84 | defitem49 | 自定义项49 | defitem49 | varchar(101) |  | 自定义项 (Custom) |
| 85 | defitem50 | 自定义项50 | defitem50 | varchar(101) |  | 自定义项 (Custom) |