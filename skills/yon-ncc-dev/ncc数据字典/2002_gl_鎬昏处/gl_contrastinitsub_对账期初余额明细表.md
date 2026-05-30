# |<<

**对账期初余额明细表 (gl_contrastinitsub / nc.vo.gl.contrast.init.ContrastInitSubVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2375.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contrastinitsub | 对账期初明细表标识 | pk_contrastinitsub | char(20) | √ | 主键 (UFID) |
| 2 | pk_accountingbook | 财务核算账簿 | pk_accountingbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_accasoa | 科目 | pk_accasoa | varchar(20) |  | 会计科目 (accasoa) |
| 5 | pk_contrastrule | 内部交易对账规则 | pk_contrastrule | varchar(20) |  | 内部交易规则 (ContrastRuleVO) |
| 6 | voucherdate | 凭证日期 | voucherdate | char(19) |  | 日期 (UFDate) |
| 7 | pk_vouchertype | 凭证类别 | pk_vouchertype | varchar(20) |  | 凭证类别 (vouchertype) |
| 8 | voucherno | 凭证号 | voucherno | int |  | 整数 (Integer) |
| 9 | detailno | 分录序号 | detailno | int |  | 整数 (Integer) |
| 10 | year | 年份 | year | char(4) |  | 字符串 (String) |
| 11 | period | 期间 | period | char(2) |  | 字符串 (String) |
| 12 | pk_customer | 客商辅助核算 | pk_customer | char(20) |  | 主键 (UFID) |
| 13 | explanation | 摘要 | explanation | char(150) |  | 主键 (UFID) |
| 14 | direction | 方向 | direction | varchar(50) |  | 借贷方向枚举 (enum) |  | Y=借; |