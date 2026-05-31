# |<<

**期末结账 (nresa_solveaccount / nc.vo.nresa.periodendclosing.SolveAccountVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3897.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_solveaccount | 主键 | pk_solveaccount | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_relorg | 责任组织 | pk_relorg | varchar(20) |  | 组织_业务单元_责任组织 (liabilitycenter) |
| 4 | pk_liabilitybook | 责任核算帐簿 | pk_liabilitybook | varchar(20) |  | 账簿_责任核算账簿 (liabilitybook) |
| 5 | issolveaccount | 是否结账 | issolveaccount | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | syear | 年度 | syear | varchar(4) |  | 字符串 (String) |
| 7 | speriod | 期间 | speriod | varchar(4) |  | 字符串 (String) |
| 8 | solveaccounter | 结账人 | solveaccounter | varchar(20) |  | 用户 (user) |
| 9 | solveaccounttime | 结账时间 | solveaccounttime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | cancelsolver | 取消结账人 | cancelsolver | varchar(20) |  | 用户 (user) |
| 11 | cancelsolvetime | 取消结账时间 | cancelsolvetime | char(19) |  | 日期时间 (UFDateTime) |