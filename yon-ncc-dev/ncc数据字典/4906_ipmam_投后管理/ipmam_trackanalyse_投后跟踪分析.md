# |<<

**投后跟踪分析 (ipmam_trackanalyse / nc.vo.ipmam.trackanalyse.TrackAnalyseVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3218.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_trackanalyse | 投后跟踪分析主键 | pk_trackanalyse | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 6 | name | 名称 | name | varchar(300) |  | 字符串 (String) |
| 7 | pk_enterprise | 标的企业 | pk_enterprise | varchar(20) |  | 企业&自然人 (EnterprisePersonVO) |
| 8 | pk_target_proj | 项目编码 | pk_target_proj | varchar(20) |  | 投资项目档案 (ProjectLibVO) |
| 9 | pk_invest_type | 投资类型 | pk_invest_type | varchar(20) |  | 投资类型 (InvestTypeVO) |
| 10 | corigcurrencyid | 原币币种 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |
| 11 | noriginvestamountmny | 投资金额 | noriginvestamountmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | hold_ratio | 投后占股比例(%) | hold_ratio | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | pk_dept | 经办部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 14 | pk_dept_v | 经办部门版本 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 15 | pk_psndoc | 经办人员 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 16 | vmemo | 备注 | vmemo | varchar(1024) |  | 备注 (Memo) |
| 17 | nbaseinvestamountmny | 投资金额组织本币 | nbaseinvestamountmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | ngpinvestamountmny | 投资金额集团本币 | ngpinvestamountmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | nallinvestamountmny | 投资金额全局本币 | nallinvestamountmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | ccurrencyid | 组织本位币币种 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 21 | cgroupcurrencyid | 集团本位币币种 | cgroupcurrencyid | varchar(20) |  | 币种 (currtype) |
| 22 | cglobalcurrencyid | 全局本位币币种 | cglobalcurrencyid | varchar(20) |  | 币种 (currtype) |
| 23 | nexchangerate | 组织本位币汇率 | nexchangerate | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | ngroupexchgrate | 集团本位币汇率 | ngroupexchgrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | nglobalexchgrate | 全局本位币汇率 | nglobalexchgrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | vreserve1 | 预留字段1 | vreserve1 | varchar(100) |  | 字符串 (String) |
| 27 | vreserve2 | 预留字段2 | vreserve2 | varchar(100) |  | 字符串 (String) |
| 28 | vreserve3 | 预留字段3 | vreserve3 | varchar(100) |  | 字符串 (String) |
| 29 | vreserve4 | 预留字段4 | vreserve4 | varchar(100) |  | 字符串 (String) |
| 30 | vreserve5 | 预留字段5 | vreserve5 | varchar(100) |  | 字符串 (String) |
| 31 | vreserve6 | 预留字段6 | vreserve6 | varchar(100) |  | 字符串 (String) |
| 32 | vreserve7 | 预留字段7 | vreserve7 | varchar(100) |  | 字符串 (String) |
| 33 | vreserve8 | 预留字段8 | vreserve8 | varchar(100) |  | 字符串 (String) |
| 34 | vreserve9 | 预留字段9 | vreserve9 | varchar(100) |  | 字符串 (String) |
| 35 | vreserve10 | 预留字段10 | vreserve10 | varchar(100) |  | 字符串 (String) |
| 36 | vreserve11 | 预留字段11 | vreserve11 | varchar(100) |  | 字符串 (String) |
| 37 | vreserve12 | 预留字段12 | vreserve12 | varchar(100) |  | 字符串 (String) |
| 38 | vreserve13 | 预留字段13 | vreserve13 | varchar(100) |  | 字符串 (String) |
| 39 | vreserve14 | 预留字段14 | vreserve14 | varchar(100) |  | 字符串 (String) |
| 40 | vreserve15 | 预留字段15 | vreserve15 | varchar(100) |  | 字符串 (String) |
| 41 | vreserve16 | 预留字段16 | vreserve16 | varchar(100) |  | 字符串 (String) |
| 42 | vreserve17 | 预留字段17 | vreserve17 | varchar(100) |  | 字符串 (String) |
| 43 | vreserve18 | 预留字段18 | vreserve18 | varchar(100) |  | 字符串 (String) |
| 44 | vreserve19 | 预留字段19 | vreserve19 | varchar(100) |  | 字符串 (String) |
| 45 | vreserve20 | 预留字段20 | vreserve20 | varchar(100) |  | 字符串 (String) |
| 46 | vsrctype | 来源单据类型 | vsrctype | varchar(20) |  | 字符串 (String) |
| 47 | vsrccode | 来源单据号 | vsrccode | varchar(50) |  | 字符串 (String) |
| 48 | csrcid | 来源单据主表主键 | csrcid | char(20) |  | 主键 (UFID) |
| 49 | vsrctrantype | 来源交易类型 | vsrctrantype | varchar(20) |  | 字符串 (String) |
| 50 | vfirsttype | 源头单据类型 | vfirsttype | varchar(20) |  | 字符串 (String) |
| 51 | vfirstcode | 源头单据号 | vfirstcode | varchar(50) |  | 字符串 (String) |
| 52 | cfirstid | 源头单据主表主键 | cfirstid | char(20) |  | 主键 (UFID) |
| 53 | vfirsttrantype | 源头交易类型 | vfirsttrantype | varchar(20) |  | 字符串 (String) |
| 54 | debt | 资产负债率(%) | debt | decimal(28, 8) |  | 数值 (UFDouble) |
| 55 | growth_of_sales | 收入环比增长率(%) | growth_of_sales | decimal(28, 8) |  | 数值 (UFDouble) |
| 56 | gp_ratio | 毛利率(%) | gp_ratio | decimal(28, 8) |  | 数值 (UFDouble) |
| 57 | acc_recei_rate | 应收账款周转天数(天) | acc_recei_rate | decimal(28, 8) |  | 数值 (UFDouble) |
| 58 | norigcashmny | 货币资金 | norigcashmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 59 | nbasecashmny | 货币资金组织本币 | nbasecashmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 60 | ngpcashmny | 货币资金集团本币 | ngpcashmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 61 | nallcashmny | 货币资金全局本币 | nallcashmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 62 | norigsalesmny | 主营业务收入 | norigsalesmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 63 | nbasesalesmny | 主营业务收入组织本币 | nbasesalesmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 64 | ngpsalesmny | 主营业务收入集团本币 | ngpsalesmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 65 | nallsalesmny | 主营业务收入全局本币 | nallsalesmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 66 | np_ratio | 净利率 | np_ratio | decimal(28, 8) |  | 数值 (UFDouble) |
| 67 | ocfos | 经营现金流/主营业务收入(%) | ocfos | decimal(28, 8) |  | 数值 (UFDouble) |
| 68 | bissnapshot | 是否快照 | bissnapshot | char(1) |  | 布尔类型 (UFBoolean) |
| 69 | pk_original | 原始单据主键 | pk_original | char(20) |  | 主键 (UFID) |
| 70 | snapshotname | 快照名称 | snapshotname | varchar(200) |  | 多语文本 (MultiLangText) |
| 71 | snapshottime | 记录时间 | snapshottime | char(19) |  | 日期时间 (UFDateTime) |
| 72 | financial_month | 财务月度 | financial_month | varchar(50) |  | 字符串 (String) |
| 73 | vdef1 | 表头自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 74 | vdef2 | 表头自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 75 | vdef3 | 表头自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 76 | vdef4 | 表头自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 77 | vdef5 | 表头自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 78 | vdef6 | 表头自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 79 | vdef7 | 表头自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 80 | vdef8 | 表头自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 81 | vdef9 | 表头自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 82 | vdef10 | 表头自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 83 | vdef11 | 表头自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 84 | vdef12 | 表头自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 85 | vdef13 | 表头自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 86 | vdef14 | 表头自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 87 | vdef15 | 表头自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 88 | vdef16 | 表头自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 89 | vdef17 | 表头自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 90 | vdef18 | 表头自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 91 | vdef19 | 表头自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 92 | vdef20 | 表头自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |
| 93 | vdef21 | 表头自定义项21 | vdef21 | varchar(101) |  | 自定义项 (Custom) |
| 94 | vdef22 | 表头自定义项22 | vdef22 | varchar(101) |  | 自定义项 (Custom) |
| 95 | vdef23 | 表头自定义项23 | vdef23 | varchar(101) |  | 自定义项 (Custom) |
| 96 | vdef24 | 表头自定义项24 | vdef24 | varchar(101) |  | 自定义项 (Custom) |
| 97 | vdef25 | 表头自定义项25 | vdef25 | varchar(101) |  | 自定义项 (Custom) |
| 98 | vdef26 | 表头自定义项26 | vdef26 | varchar(101) |  | 自定义项 (Custom) |
| 99 | vdef27 | 表头自定义项27 | vdef27 | varchar(101) |  | 自定义项 (Custom) |
| 100 | vdef28 | 表头自定义项28 | vdef28 | varchar(101) |  | 自定义项 (Custom) |
| 101 | vdef29 | 表头自定义项29 | vdef29 | varchar(101) |  | 自定义项 (Custom) |
| 102 | vdef30 | 表头自定义项30 | vdef30 | varchar(101) |  | 自定义项 (Custom) |
| 103 | vdef31 | 表头自定义项31 | vdef31 | varchar(101) |  | 自定义项 (Custom) |
| 104 | vdef32 | 表头自定义项32 | vdef32 | varchar(101) |  | 自定义项 (Custom) |
| 105 | vdef33 | 表头自定义项33 | vdef33 | varchar(101) |  | 自定义项 (Custom) |
| 106 | vdef34 | 表头自定义项34 | vdef34 | varchar(101) |  | 自定义项 (Custom) |
| 107 | vdef35 | 表头自定义项35 | vdef35 | varchar(101) |  | 自定义项 (Custom) |
| 108 | vdef36 | 表头自定义项36 | vdef36 | varchar(101) |  | 自定义项 (Custom) |
| 109 | vdef37 | 表头自定义项37 | vdef37 | varchar(101) |  | 自定义项 (Custom) |
| 110 | vdef38 | 表头自定义项38 | vdef38 | varchar(101) |  | 自定义项 (Custom) |
| 111 | vdef39 | 表头自定义项39 | vdef39 | varchar(101) |  | 自定义项 (Custom) |
| 112 | vdef40 | 表头自定义项40 | vdef40 | varchar(101) |  | 自定义项 (Custom) |
| 113 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 114 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 115 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 116 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |