# |<<

**签证申请子表 (pm_visaalter_b / nc.vo.pcm.alter.AlterBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4551.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_alter_b | 签证子表 | pk_alter_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 5 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 6 | alter_item | 变更项 | alter_item | varchar(200) |  | 字符串 (String) |
| 7 | alter_reason | 变更原因 | alter_reason | varchar(200) |  | 字符串 (String) |
| 8 | pk_wbs | 项目任务 | pk_wbs | varchar(20) |  | 项目任务 (WBS) |
| 9 | pk_cbsnode | CBS | pk_cbsnode | varchar(20) |  | 成本分解结构成员 (cbsnode) |
| 10 | pk_material | 物料最新版本 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 11 | pk_material_v | 物料 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 12 | pk_measdoc | 单位 | pk_measdoc | varchar(20) |  | 计量单位 (measdoc) |
| 13 | curr_num | 数量 | curr_num | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | price | 无税单价 | price | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | pk_taxcode | 税码 | pk_taxcode | varchar(20) |  | 增值税税码税率 (taxcode) |
| 16 | taxrate | 税率 | taxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | service_prc_ratio | 服务价格系数 | service_prc_ratio | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | taxprice | 含税单价 | taxprice | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | curr_mny | 无税金额 | curr_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | tax | 税额 | tax | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | taxmny | 含税金额 | taxmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | influence | 影响范围 | influence | varchar(200) |  | 字符串 (String) |
| 23 | execute_dept | 执行部门最新版本 | execute_dept | varchar(20) |  | 组织_部门 (dept) |
| 24 | execute_dept_v | 执行部门 | execute_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 25 | nosubtaxrate | 不可抵扣率 | nosubtaxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | nosubtaxmny | 不可抵扣额 | nosubtaxmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 27 | calcostmny | 计成本金额 | calcostmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 28 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |