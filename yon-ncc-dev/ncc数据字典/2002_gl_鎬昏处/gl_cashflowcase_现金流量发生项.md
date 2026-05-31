# |<<

**现金流量发生项 (gl_cashflowcase / nc.vo.gl.cashflow.cashflowcase)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2363.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cashflowcase | 现金流量标识 | pk_cashflowcase | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | char(20) |  | 主键 (UFID) |
| 3 | pk_org_v | 财务组织版本 | pk_org_v | char(20) |  | 主键 (UFID) |
| 4 | pk_unit | 业务单元 | pk_unit | varchar(20) |  | 字符串 (String) |
| 5 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 6 | pk_setofbook | 账簿类型 | pk_setofbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 7 | pk_detail | 凭证分录 | pk_detail | varchar(50) |  | 字符串 (String) |
| 8 | pk_cashflow | 现金流量表项 | pk_cashflow | varchar(20) |  | 现金流量项目 (cashflow) |
| 9 | money | 金额 | money | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | flag | 分析标记 | flag | int |  | 整数 (Integer) |
| 11 | pk_detail_opp | 对方科目 | pk_detail_opp | char(20) |  | 主键 (UFID) |
| 12 | memo | 备注 | memo | varchar(150) |  | 字符串 (String) |
| 13 | moneymain | 主币 | moneymain | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | pk_currtype | 现金流量币种 | pk_currtype | char(20) |  | 主键 (UFID) |
| 15 | moneygroup | 集团本币 | moneygroup | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | moneyglobal | 全局本币 | moneyglobal | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | pk_accountingbook | 核算账簿 | pk_accountingbook | char(20) |  | 字符串 (String) |
| 18 | prepareddate | 制单日期 | prepareddate | char(19) |  | 日期时间 (UFDateTime) |
| 19 | pk_manager | 记账人 | pk_manager | char(20) |  | 主键 (UFID) |
| 20 | pk_voucher | 凭证表体主键 | pk_voucher | char(20) |  | 主键 (UFID) |
| 21 | assid | 辅助核算 | assid | char(20) |  | 主键 (UFID) |
| 22 | pk_accasoa | 科目主键 | pk_accasoa | char(20) |  | 主键 (UFID) |