# |<<

**月结报告单行 (gl_settledreportitem / nc.vo.gl.settledreport.SettledReportItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2475.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_settledreportitem | 月结报告单行标志 | pk_settledreportitem | char(20) | √ | 主键 (UFID) |
| 2 | pk_settledrule | 检查项 | pk_settledrule | varchar(20) |  | 月结检查项 (SettledRuleVO) |
| 3 | isfinished | 完成情况 | isfinished | int |  | 完成情况 (finishcondition) |  | 1=未完成; |