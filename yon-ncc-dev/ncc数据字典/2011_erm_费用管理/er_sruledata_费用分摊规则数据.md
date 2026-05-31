# |<<

**费用分摊规则数据 (er_sruledata / nc.vo.erm.sharerule.ShareruleDataVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1917.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cshare_detail | 主键 | pk_cshare_detail | char(20) | √ | 主键 (UFID) |
| 2 | assume_org | 承担单位 | assume_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | assume_dept | 承担部门 | assume_dept | varchar(20) |  | 组织_部门 (dept) |
| 4 | pk_pcorg | 利润中心 | pk_pcorg | varchar(20) |  | 利润中心 (profitcenter) |
| 5 | pk_resacostcenter | 成本中心 | pk_resacostcenter | varchar(20) |  | 成本中心 (resacostcenter) |
| 6 | pk_iobsclass | 收支项目 | pk_iobsclass | varchar(20) |  | 收支项目 (inoutbusiclass) |
| 7 | jobid | 项目 | jobid | varchar(20) |  | 项目 (project) |
| 8 | projecttask | 项目任务 | projecttask | varchar(20) |  | 项目任务 (WBS) |
| 9 | pk_checkele | 核算要素 | pk_checkele | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 10 | customer | 客户 | customer | varchar(20) |  | 客户基本信息 (customer) |
| 11 | hbbm | 供应商 | hbbm | varchar(20) |  | 供应商基本信息 (supplier) |
| 12 | share_ratio | 分摊比例 | share_ratio | decimal(15, 8) |  | 数值 (UFDouble) |
| 13 | bzbm | 币种 | bzbm | varchar(20) |  | 字符串 (String) |
| 14 | assume_amount | 承担金额 | assume_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | bbhl | 组织本币汇率 | bbhl | decimal(15, 8) |  | 数值 (UFDouble) |
| 16 | globalbbhl | 全局本币汇率 | globalbbhl | decimal(15, 8) |  | 数值 (UFDouble) |
| 17 | groupbbhl | 集团本币汇率 | groupbbhl | decimal(15, 8) |  | 数值 (UFDouble) |
| 18 | bbje | 组织本币金额 | bbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | globalbbje | 全局本币金额 | globalbbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | groupbbje | 集团本币金额 | groupbbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | pk_proline | 产品线 | pk_proline | varchar(20) |  | 产品线 (prodline) |
| 22 | pk_brand | 品牌 | pk_brand | varchar(20) |  | 品牌档案 (branddoc) |
| 23 | defitem30 | 自定义项30 | defitem30 | varchar(101) |  | 自定义项 (Custom) |
| 24 | defitem29 | 自定义项29 | defitem29 | varchar(101) |  | 自定义项 (Custom) |
| 25 | defitem28 | 自定义项28 | defitem28 | varchar(101) |  | 自定义项 (Custom) |
| 26 | defitem27 | 自定义项27 | defitem27 | varchar(101) |  | 自定义项 (Custom) |
| 27 | defitem26 | 自定义项26 | defitem26 | varchar(101) |  | 自定义项 (Custom) |
| 28 | defitem25 | 自定义项25 | defitem25 | varchar(101) |  | 自定义项 (Custom) |
| 29 | defitem24 | 自定义项24 | defitem24 | varchar(101) |  | 自定义项 (Custom) |
| 30 | defitem23 | 自定义项23 | defitem23 | varchar(101) |  | 自定义项 (Custom) |
| 31 | defitem22 | 自定义项22 | defitem22 | varchar(101) |  | 自定义项 (Custom) |
| 32 | defitem21 | 自定义项21 | defitem21 | varchar(101) |  | 自定义项 (Custom) |
| 33 | defitem20 | 自定义项20 | defitem20 | varchar(101) |  | 自定义项 (Custom) |
| 34 | defitem19 | 自定义项19 | defitem19 | varchar(101) |  | 自定义项 (Custom) |
| 35 | defitem18 | 自定义项18 | defitem18 | varchar(101) |  | 自定义项 (Custom) |
| 36 | defitem17 | 自定义项17 | defitem17 | varchar(101) |  | 自定义项 (Custom) |
| 37 | defitem16 | 自定义项16 | defitem16 | varchar(101) |  | 自定义项 (Custom) |
| 38 | defitem15 | 自定义项15 | defitem15 | varchar(101) |  | 自定义项 (Custom) |
| 39 | defitem14 | 自定义项14 | defitem14 | varchar(101) |  | 自定义项 (Custom) |
| 40 | defitem13 | 自定义项13 | defitem13 | varchar(101) |  | 自定义项 (Custom) |
| 41 | defitem12 | 自定义项12 | defitem12 | varchar(101) |  | 自定义项 (Custom) |
| 42 | defitem11 | 自定义项11 | defitem11 | varchar(101) |  | 自定义项 (Custom) |
| 43 | defitem10 | 自定义项10 | defitem10 | varchar(101) |  | 自定义项 (Custom) |
| 44 | defitem9 | 自定义项9 | defitem9 | varchar(101) |  | 自定义项 (Custom) |
| 45 | defitem8 | 自定义项8 | defitem8 | varchar(101) |  | 自定义项 (Custom) |
| 46 | defitem7 | 自定义项7 | defitem7 | varchar(101) |  | 自定义项 (Custom) |
| 47 | defitem6 | 自定义项6 | defitem6 | varchar(101) |  | 自定义项 (Custom) |
| 48 | defitem5 | 自定义项5 | defitem5 | varchar(101) |  | 自定义项 (Custom) |
| 49 | defitem4 | 自定义项4 | defitem4 | varchar(101) |  | 自定义项 (Custom) |
| 50 | defitem3 | 自定义项3 | defitem3 | varchar(101) |  | 自定义项 (Custom) |
| 51 | defitem2 | 自定义项2 | defitem2 | varchar(101) |  | 自定义项 (Custom) |
| 52 | defitem1 | 自定义项1 | defitem1 | varchar(101) |  | 自定义项 (Custom) |