# |<<

**成本流水账2 (cost_account_last / nc.vo.hrpco.cost_account_last.CoAccountVO_Last)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1601.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_account | 主键 | pk_account | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | pk_month | 会计期间 | pk_month | varchar(20) |  | 会计期间档案 (accperiod) |
| 6 | pk_class | 分摊级次 | pk_class | varchar(20) |  | 分摊级次-成本组织 (SpgradeOrgVO) |
| 7 | pk_fundsource | 资金来源 | pk_fundsource | varchar(20) |  | 医疗资金来源 (FundSourceVO) |
| 8 | cyear | 年度 | cyear | varchar(50) |  | 字符串 (String) |
| 9 | month | 月度 | month | varchar(50) |  | 字符串 (String) |
| 10 | pk_soudept | 源科室 | pk_soudept | varchar(20) |  | 科室档案 (CodepartVO) |
| 11 | pk_dept | 科室 | pk_dept | varchar(20) |  | 科室档案 (CodepartVO) |
| 12 | pk_med | 中介 | pk_med | varchar(20) |  | 成本分摊中介子表 (CospagencyinfoVO) |
| 13 | upercent | 中介所占百分比 | upercent | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | pk_coitem | 成本项目 | pk_coitem | varchar(20) |  | 成本项目-成本组织 (CostProOrgVO) |
| 15 | pk_spreadpara | 分摊参数 | pk_spreadpara | varchar(20) |  | 分摊参数-成本组织 (CostSpparaOrgVO) |
| 16 | bisdirect | 是否直接成本 | bisdirect | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | bisspread | 是否分摊 | bisspread | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | nspvalue | 分摊参数值 | nspvalue | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | naspvalue | 参量总值 | naspvalue | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | nsacost | 来源科室成本 | nsacost | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | istype | 分摊方式 | istype | int |  | 整数 (Integer) |
| 22 | pk_srcdeptatr | 来源核算属性0 | pk_srcdeptatr | varchar(20) |  | 医疗核算属性 (DeptAtrVO) |
| 23 | pk_destdeptatr | 目的核算属性0 | pk_destdeptatr | varchar(20) |  | 医疗核算属性 (DeptAtrVO) |
| 24 | ndef2 | 自定义项1 | ndef2 | varchar(101) |  | 自定义项 (Custom) |
| 25 | ndef3 | 自定义项2 | ndef3 | varchar(101) |  | 自定义项 (Custom) |
| 26 | ndef4 | 自定义项3 | ndef4 | varchar(101) |  | 自定义项 (Custom) |
| 27 | ndef5 | 自定义项4 | ndef5 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vdef1 | 自定义项6 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vdef2 | 自定义项7 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vdef3 | 自定义项8 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vdef4 | 自定义项10 | vdef4 | varchar(101) |  | 自定义项 (Custom) |