# |<<

**融资方案登记 (fd_reg / nc.vo.fd.fdmanage.fdreg.FdregVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2184.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fdreg | 主键 | pk_fdreg | char(20) | √ | 主键 (UFID) |
| 2 | repaytype | 还款方式类型 | repaytype | varchar(50) |  | 字符串 (String) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 6 | demand_no | 融资需求编号 | demand_no | varchar(50) |  | 字符串 (String) |
| 7 | demand_name | 融资需求 | demand_name | varchar(200) |  | 字符串 (String) |
| 8 | vbillno | 融资方案编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 9 | pk_fininst | 融资机构 | pk_fininst | varchar(20) |  | 非银行金融机构 (NonbankFinInstitution) |
| 10 | pk_finvariety | 融资品种 | pk_finvariety | varchar(20) |  | 投融资品种 (FinVarietyVO) |
| 11 | rateofyear | 融资年利率 | rateofyear | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | rateday | 日利率天数 | rateday | int |  | 日利率天数 (rateday) |  | 360=360; |