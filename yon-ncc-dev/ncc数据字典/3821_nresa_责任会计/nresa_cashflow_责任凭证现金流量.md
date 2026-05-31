# |<<

**责任凭证现金流量 (nresa_cashflow / nc.vo.nresa.dutyvoucher.CashFlowVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3837.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cashflow | 现金流量主键 | pk_cashflow | char(20) | √ | 主键 (UFID) |
| 2 | entryno | 分录号 | entryno | int |  | 整数 (Integer) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_control | 所属管控范围 | pk_control | varchar(20) |  | 管控范围 (controlarea) |
| 5 | pk_org | 责任组织 | pk_org | varchar(20) |  | 组织_业务单元_责任组织 (liabilitycenter) |
| 6 | pk_accountingbook | 责任核算账簿 | pk_accountingbook | varchar(20) |  | 账簿_责任核算账簿 (liabilitybook) |
| 7 | pk_setofbook | 账簿类型 | pk_setofbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 8 | pk_profit | 利润中心 | pk_profit | varchar(20) |  | 利润中心 (profitcenter) |
| 9 | pk_profit_v | 利润中心版本 | pk_profit_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 10 | pk_finacial | 财务组织 | pk_finacial | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 11 | pk_finacial_v | 财务组织版本 | pk_finacial_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 12 | pk_corp | 法人公司 | pk_corp | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 13 | pk_unit | 内部单位 | pk_unit | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 14 | pk_account | 科目主键 | pk_account | varchar(20) |  | 会计科目 (accasoa) |
| 15 | pk_dimsgroup | 辅助核算 | pk_dimsgroup | varchar(20) |  | 辅助核算 (accass) |
| 16 | direction | 方向 | direction | varchar(50) |  | 借贷方向 (DutyVoucherDirection) |  | 0=借; |