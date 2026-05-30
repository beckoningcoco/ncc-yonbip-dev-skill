# |<<

**内部服务结算确认清单-需方明细 (nresa_dem_destdetail / nc.vo.nresa.internalsettlent.service.DemDestDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3842.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_detail | 明细数据主键 | pk_detail | char(20) | √ | 主键 (UFID) |
| 2 | pk_dest | 内部结算确认清单-需方 | pk_dest | varchar(20) |  | 内部服务结算确认清单-需方 (DemDestVO) |
| 3 | pk_material | 物料 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 4 | pk_material_v | 物料版本 | pk_material_v | varchar(20) |  | 物料基本信息 (material_v) |
| 5 | pk_src_center | 供方利润中心 | pk_src_center | varchar(20) |  | 利润中心 (profitcenter) |
| 6 | pk_src_center_v | 供方利润中心版本 | pk_src_center_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 7 | pk_src_org | 供方责任组织 | pk_src_org | varchar(20) |  | 组织_业务单元_责任组织 (liabilitycenter) |
| 8 | pk_src_org_v | 供方责任组织版本 | pk_src_org_v | varchar(20) |  | 组织_业务单元_责任组织版本信息 (liabilitycenter_v) |
| 9 | pk_center | 需方利润中心 | pk_center | varchar(20) |  | 利润中心 (profitcenter) |
| 10 | pk_center_v | 需方利润中心版本 | pk_center_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 11 | pk_dept | 需方入账部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 12 | pk_costcenter | 需方入账成本中心 | pk_costcenter | varchar(20) |  | 成本中心 (resacostcenter) |
| 13 | pk_accsoa | 需方入账会计科目 | pk_accsoa | varchar(20) |  | 会计科目 (accasoa) |
| 14 | pk_currtype | 结算币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 15 | numberm | 结算数量 | numberm | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | pk_munit | 结算单位 | pk_munit | varchar(20) |  | 计量单位 (measdoc) |
| 17 | price | 结算单价 | price | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | money | 结算金额(结算原币) | money | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | bookmoney | 责任账簿本币金额 | bookmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | orgmoney | 责任组织本币金额 | orgmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | grpmoney | 集团本币金额 | grpmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | glbmoney | 全局本币金额 | glbmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 23 | srcbilltype | 来源单据类型 | srcbilltype | varchar(50) |  | 字符串 (String) |
| 24 | srcbillid | 来源单据主键 | srcbillid | varchar(50) |  | 字符串 (String) |
| 25 | srcbillno | 来源单据号 | srcbillno | varchar(50) |  | 字符串 (String) |
| 26 | srcitemid | 来源单据子表主键 | srcitemid | varchar(50) |  | 字符串 (String) |
| 27 | pk_upbill | 内部服务结算录入清单 | pk_upbill | varchar(20) |  | 内部服务结算录入清单-供方 (SupSrcVO) |
| 28 | pk_upbillitem | 内部服务结算录入清单明细 | pk_upbillitem | varchar(20) |  | 内部服务结算录入清单-供方明细 (SupSrcDetailVO) |
| 29 | bookhv | 账簿本币汇率 | bookhv | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | orghv | 责任组织本币汇率 | orghv | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | grplv | 集团本币汇率 | grplv | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | glbhv | 全局本币汇率 | glbhv | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | bookcur | 账簿币种 | bookcur | varchar(20) |  | 币种 (currtype) |
| 34 | orgcur | 组织币种 | orgcur | varchar(20) |  | 币种 (currtype) |
| 35 | grpcur | 集团币种 | grpcur | varchar(20) |  | 币种 (currtype) |
| 36 | glbcur | 全局币种 | glbcur | varchar(20) |  | 币种 (currtype) |
| 37 | bookscheme | 账簿汇率方案 | bookscheme | varchar(20) |  | 外币汇率方案 (exratescheme) |
| 38 | orgscheme | 组织汇率方案 | orgscheme | varchar(20) |  | 外币汇率方案 (exratescheme) |
| 39 | grpscheme | 集团汇率方案 | grpscheme | varchar(20) |  | 外币汇率方案 (exratescheme) |
| 40 | glbscheme | 全局汇率方案 | glbscheme | varchar(20) |  | 外币汇率方案 (exratescheme) |
| 41 | pkbook | 责任核算账簿 | pkbook | varchar(20) |  | 账簿_责任核算账簿 (liabilitybook) |
| 42 | inoutitem | 收支项目 | inoutitem | varchar(20) |  | 收支项目 (inoutbusiclass) |
| 43 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 47 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 49 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 50 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 51 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 52 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 53 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 54 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 55 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 56 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 57 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 58 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 59 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 60 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 61 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 62 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |