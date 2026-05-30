# |<<

**计划物料 (ewm_wo_plan_inv / nc.vo.ewm.workorder.WOPlanInVVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1968.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wo_plan_inv | 计划物料主键 | pk_wo_plan_inv | char(20) | √ | 主键 (UFID) |
| 2 | sequence_num | 作业序号 | sequence_num | int |  | 整数 (Integer) |
| 3 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 4 | pk_material | 物料 | pk_material | varchar(20) |  | 字符串 (String) |
| 5 | pk_material_v | 物料编码 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 6 | nassistnum | 数量 | nassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 8 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | pk_measdoc | 主单位 | pk_measdoc | varchar(20) |  | 计量单位 (measdoc) |
| 10 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 11 | required_date | 需求日期 | required_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 12 | outer_flag | 外部 | outer_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | pk_stockorg | 库存组织最新版本 | pk_stockorg | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 14 | pk_stockorg_v | 库存组织 | pk_stockorg_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 15 | pk_stordoc | 仓库 | pk_stordoc | varchar(20) |  | 仓库 (stordoc) |
| 16 | price_org | 主参考单价 | price_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | money_org | 参考成本 | money_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | outnum | 已发主数量 | outnum | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 19 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 20 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 21 | pk_org | 维修组织 | pk_org | varchar(20) |  | 组织_业务单元_维修组织 (maintainorg) |
| 22 | pk_org_v | 维修组织版本 | pk_org_v | varchar(20) |  | 字符串 (String) |
| 23 | nreqrsnum | 预留数量 | nreqrsnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | src_rowno | 来源单据行号 | src_rowno | varchar(30) |  | 字符串 (String) |
| 25 | src_pk_bill | 来源单据主键 | src_pk_bill | varchar(20) |  | 字符串 (String) |
| 26 | src_pk_bill_b | 来源单据表体主键 | src_pk_bill_b | varchar(20) |  | 字符串 (String) |
| 27 | src_bill_code | 来源单据编码 | src_bill_code | varchar(40) |  | 字符串 (String) |
| 28 | src_bill_type | 来源单据类型 | src_bill_type | varchar(4) |  | 字符串 (String) |
| 29 | src_pk_transitype | 来源交易类型主键 | src_pk_transitype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 30 | src_transi_type | 来源交易类型 | src_transi_type | varchar(30) |  | 字符串 (String) |
| 31 | bendgather | 已平衡 | bendgather | char(1) |  | 布尔类型 (UFBoolean) |
| 32 | naccustornum | 库存满足主数量 | naccustornum | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | nnetnum | 转净需求/请购数量 | nnetnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | csourceid2 | 下游单据 | csourceid2 | char(20) |  | 主键 (UFID) |
| 35 | csourcebid2 | 下游单据行 | csourcebid2 | char(20) |  | 主键 (UFID) |
| 36 | vsourcecode2 | 下游单据号 | vsourcecode2 | varchar(40) |  | 字符串 (String) |
| 37 | vsourcerowno2 | 下游单据行号 | vsourcerowno2 | varchar(20) |  | 字符串 (String) |
| 38 | csourcetypecode2 | 下游单据类型 | csourcetypecode2 | varchar(20) |  | 单据类型 (BilltypeVO) |
| 39 | vsourcetrantype2 | 下游交易类型 | vsourcetrantype2 | varchar(20) |  | 单据类型 (BilltypeVO) |
| 40 | tgathertime | 汇总时间 | tgathertime | char(19) |  | 日期 (UFDate) |
| 41 | cgatherpsnid | 汇总人 | cgatherpsnid | varchar(20) |  | 用户 (user) |
| 42 | buynum | 已请购主数量 | buynum | decimal(28, 8) |  | 数值 (UFDouble) |
| 43 | applynum | 计划申请主数量 | applynum | decimal(28, 8) |  | 数值 (UFDouble) |
| 44 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 47 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 49 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 50 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 51 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 52 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 53 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |