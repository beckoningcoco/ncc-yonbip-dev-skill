# |<<

**实际物料 (ewm_wo_actual_inv / nc.vo.ewm.workorder.WOActualInvVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1960.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wo_actual_inv | 实际物料主键 | pk_wo_actual_inv | char(20) | √ | 主键 (UFID) |
| 2 | src_bill_type | 来源 | src_bill_type | varchar(4) |  | 字符串 (String) |
| 3 | src_bill_code | 单据号 | src_bill_code | varchar(40) |  | 字符串 (String) |
| 4 | bill_date | 单据日期 | bill_date | char(19) |  | 日期 (UFDate) |
| 5 | src_rowno | 来源单据行号 | src_rowno | varchar(20) |  | 字符串 (String) |
| 6 | sequence_num | 作业序号 | sequence_num | int |  | 整数 (Integer) |
| 7 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 8 | pk_material | 物料 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 9 | pk_material_v | 物料编码 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 10 | nassistnum | 数量 | nassistnum | decimal(28, 8) |  | 数值 (UFDouble) |  | [0 , ] |
| 11 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 12 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |  | [0 , ] |
| 13 | pk_measdoc | 主单位 | pk_measdoc | varchar(20) |  | 计量单位 (measdoc) |
| 14 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 15 | outer_flag | 外部 | outer_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | pk_stockorg | 库存组织最新版本 | pk_stockorg | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 17 | pk_stockorg_v | 库存组织 | pk_stockorg_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 18 | pk_stordoc | 仓库 | pk_stordoc | varchar(20) |  | 仓库 (stordoc) |
| 19 | inout_date | 出入库日期 | inout_date | char(19) |  | 日期 (UFDate) |
| 20 | price_org | 单价 | price_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | money_org | 金额 | money_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | origcurrtypeid | 原币币种 | origcurrtypeid | varchar(20) |  | 币种 (currtype) |
| 23 | price | 原币单价 | price | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | money | 原币金额 | money | decimal(28, 8) |  | 金额 (UFMoney) |
| 25 | retnum | 已退主数量 | retnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 27 | src_transi_type | 来源交易类型 | src_transi_type | varchar(30) |  | 字符串 (String) |
| 28 | src_pk_transitype | 来源交易类型主键 | src_pk_transitype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 29 | src_pk_bill | 来源单据主键 | src_pk_bill | varchar(20) |  | 字符串 (String) |
| 30 | src_pk_bill_b | 来源单据表体主键 | src_pk_bill_b | varchar(20) |  | 字符串 (String) |
| 31 | link_flag | 关联标识 | link_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 32 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 33 | pk_org | 维修组织 | pk_org | varchar(20) |  | 组织_业务单元_维修组织 (maintainorg) |
| 34 | pk_org_v | 维修组织版本 | pk_org_v | varchar(20) |  | 字符串 (String) |
| 35 | first_billid | 源头单据主键 | first_billid | varchar(20) |  | 字符串 (String) |
| 36 | first_billbid | 源头单据表体主键 | first_billbid | varchar(20) |  | 字符串 (String) |
| 37 | cother_billid | 对应实际物料表头主键 | cother_billid | varchar(20) |  | 字符串 (String) |
| 38 | cother_bill_bid | 对应实际物料行主键 | cother_bill_bid | varchar(20) |  | 字符串 (String) |
| 39 | currrate | 币种汇率 | currrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 40 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 47 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 49 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |