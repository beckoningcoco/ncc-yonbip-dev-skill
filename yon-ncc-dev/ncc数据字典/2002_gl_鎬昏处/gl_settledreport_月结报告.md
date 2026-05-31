# |<<

**月结报告 (gl_settledreport / nc.vo.gl.settledreport.SettledReportVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2474.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_settledreport | 月结报告标识 | pk_settledreport | char(20) | √ | 主键 (UFID) |
| 2 | accountingbookcode | 账簿编码 | accountingbookcode | varchar(30) |  | 字符串 (String) |
| 3 | accountingbookname | 账簿名称 | accountingbookname | varchar(70) |  | 字符串 (String) |
| 4 | finishstatus | 完成状态 | finishstatus | int |  | 完成状态 (finishstatus) |  | 1=正常; |