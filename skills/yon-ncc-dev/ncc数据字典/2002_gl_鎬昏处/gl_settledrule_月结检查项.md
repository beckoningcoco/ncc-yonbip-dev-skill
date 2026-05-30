# |<<

**月结检查项 (gl_settledrule / nc.vo.gl.settledrule.SettledRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2476.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_settledrule | 月结检查项标志 | pk_settledrule | char(20) | √ | 主键 (UFID) |
| 2 | pk_accountingbook | 核算账簿 | pk_accountingbook | char(20) | √ | 账簿_财务核算账簿 (accountingbook) |
| 3 | code | 检查项编码 | code | varchar(50) |  | 字符串 (String) |
| 4 | name | 检查项名称 | name | varchar(200) |  | 字符串 (String) |
| 5 | systypecode | 业务模块编码 | systypecode | char(20) |  | 主键 (UFID) |
| 6 | tasktype | 任务类型 | tasktype | int |  | 任务类型 (TaskTypeEnum) |  | 1=预置; |