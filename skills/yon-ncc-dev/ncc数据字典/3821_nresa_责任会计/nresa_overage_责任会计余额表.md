# |<<

**责任会计余额表 (nresa_overage / nc.vo.nresa.periodendclosing.NraOverageVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3883.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_overage | 余额主键 | pk_overage | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 责任核算账簿 | pk_org | varchar(20) |  | 账簿_责任核算账簿 (liabilitybook) |
| 4 | pk_resporg | 利润中心 | pk_resporg | varchar(20) |  | 组织_业务单元_责任组织 (liabilitycenter) |
| 5 | pk_org_v | 利润中心版本 | pk_org_v | varchar(20) |  | 组织_业务单元_责任组织版本信息 (liabilitycenter_v) |
| 6 | syear | 年度 | syear | char(4) |  | 字符串 (String) |
| 7 | smonth | 月份 | smonth | char(2) |  | 字符串 (String) |
| 8 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 9 | coriamount | 贷方原币金额 | coriamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | doriamount | 借方原币金额 | doriamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | cquantity | 贷方数量 | cquantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | dquantity | 借方数量 | dquantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | pk_account | 会计科目 | pk_account | varchar(20) |  | 会计科目 (accasoa) |
| 14 | pk_dimcombine | 辅助核算组合 | pk_dimcombine | varchar(50) |  | 字符串 (String) |
| 15 | orgdebit | 借方组织本币金额 | orgdebit | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | groupdebit | 借方集团本币金额 | groupdebit | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | globaldebit | 借方全局本币金额 | globaldebit | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | orgcredit | 贷方组织本币金额 | orgcredit | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | groupcredit | 贷方集团本币金额 | groupcredit | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | globalcredit | 贷方全局本币金额 | globalcredit | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | pk_costcenter | 成本中心 | pk_costcenter | varchar(20) |  | 成本中心 (resacostcenter) |
| 22 | voucherkind | 凭证种类 | voucherkind | varchar(20) |  | 责任凭证类别 (vouchertype) |
| 23 | srcsystem | 来源系统 | srcsystem | varchar(20) |  | 模块信息 (module) |
| 24 | pk_financial | 财务组织 | pk_financial | varchar(20) |  | 字符串 (String) |
| 25 | pk_company | 法人公司 | pk_company | varchar(20) |  | 字符串 (String) |
| 26 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |