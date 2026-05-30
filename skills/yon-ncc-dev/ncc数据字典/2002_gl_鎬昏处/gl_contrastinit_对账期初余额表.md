# |<<

**对账期初余额表 (gl_contrastinit / nc.vo.gl.contrast.init.ContrastInitVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2374.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contrastinit | 对账期初标识 | pk_contrastinit | char(20) | √ | 主键 (UFID) |
| 2 | pk_accountingbook | 财务核算账簿 | pk_accountingbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 3 | pk_contrastrule | 内部交易规则 | pk_contrastrule | varchar(20) |  | 内部交易规则 (ContrastRuleVO) |
| 4 | syear | 年度 | syear | varchar(50) |  | 字符串 (String) |
| 5 | speriod | 期间 | speriod | varchar(50) |  | 字符串 (String) |
| 6 | startdate | 启用日期 | startdate | char(19) |  | 日期时间 (UFDateTime) |
| 7 | pk_accasoa | 科目 | pk_accasoa | varchar(20) |  | 会计科目 (accasoa) |
| 8 | assid | 辅助核算 | assid | char(20) |  | 主键 (UFID) |
| 9 | direction | 方向 | direction | varchar(50) |  | 借贷方向枚举 (enum) |  | Y=借; |