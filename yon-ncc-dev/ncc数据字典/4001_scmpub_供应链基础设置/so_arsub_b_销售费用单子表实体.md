# |<<

**销售费用单子表实体 (so_arsub_b / nc.vo.so.m35.entity.ArsubBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5385.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | carsubbid | 销售费用单子表主键 | carsubbid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 5 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 6 | cprodlineid | 产品线 | cprodlineid | varchar(20) |  | 产品线 (prodline) |
| 7 | cordertrantypeid | 订单类型 | cordertrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 8 | vordertrantypecode | 订单类型编码 | vordertrantypecode | varchar(20) |  | 字符串 (String) |
| 9 | norigarsubmny | 费用支持金额 | norigarsubmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | ninvoicesubmny | 发票冲抵金额 | ninvoicesubmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | bsubfinshflag | 冲抵结束 | bsubfinshflag | char(1) |  | 布尔类型 (UFBoolean) | N |
| 12 | frownote | 行备注 | frownote | varchar(181) |  | 字符串 (String) |
| 13 | noriginvoicemny | 已审核发票冲抵金额 | noriginvoicemny | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | nordersubmny | 订单冲抵金额 | nordersubmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nredarsubmny | 红字应收金额 | nredarsubmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | nlrgcashmny | 赠品兑付金额 | nlrgcashmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | ngatheringmny | 转收款金额 | ngatheringmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | vsrctype | 来源单据类型 | vsrctype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 19 | vsrccode | 来源单据号 | vsrccode | varchar(40) |  | 字符串 (String) |
| 20 | vsrcrowno | 来源单据行号 | vsrcrowno | varchar(20) |  | 字符串 (String) |
| 21 | csrcid | 来源单据主表 | csrcid | varchar(20) |  | 主键 (UFID) |
| 22 | csrcbid | 来源单据子表 | csrcbid | varchar(20) |  | 主键 (UFID) |
| 23 | vsrctrantype | 来源交易类型 | vsrctrantype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 24 | cpayorgid | 费用承担组织 | cpayorgid | varchar(20) |  | 组织 (org) |
| 25 | cpaydeptid | 费用承担部门 | cpaydeptid | varchar(20) |  | 组织_部门 (dept) |
| 26 | cincomeprejectid | 收支项目 | cincomeprejectid | varchar(20) |  | 收支项目 (inoutbusiclass) |
| 27 | cprofitcenterid | 利润中心 | cprofitcenterid | varchar(20) |  | 利润中心 (profitcenter) |
| 28 | ccostcenterid | 成本中心 | ccostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 29 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 30 | cbrandid | 品牌 | cbrandid | varchar(20) |  | 品牌档案 (branddoc) |
| 31 | cchannelnodeid | 终端门店 | cchannelnodeid | varchar(20) |  | 分销渠道节点主实体 (dcm_chnlnode) |
| 32 | cfactorid | 核算要素 | cfactorid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 33 | ndeclaremny | 费用申报金额 | ndeclaremny | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | nsustainrate | 客户费用支持比例 | nsustainrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 35 | ncustpaymny | 客户承担费用 | ncustpaymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 36 | nsustainmny | 本币费用支持金额 | nsustainmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 37 | nlrgcashaccmny | 赠品兑付记账金额 | nlrgcashaccmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 38 | norderoffaccmny | 订单冲抵记账金额 | norderoffaccmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 39 | vbdef1 | 自定义项1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vbdef2 | 自定义项2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vbdef3 | 自定义项3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vbdef4 | 自定义项4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vbdef5 | 自定义项5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vbdef6 | 自定义项6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vbdef7 | 自定义项7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vbdef8 | 自定义项8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 47 | vbdef9 | 自定义项9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 48 | vbdef10 | 自定义项10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 49 | vbdef11 | 自定义项11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 50 | vbdef12 | 自定义项12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 51 | vbdef13 | 自定义项13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 52 | vbdef14 | 自定义项14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 53 | vbdef15 | 自定义项15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 54 | vbdef16 | 自定义项16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 55 | vbdef17 | 自定义项17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 56 | vbdef18 | 自定义项18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 57 | vbdef19 | 自定义项19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 58 | vbdef20 | 自定义项20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |