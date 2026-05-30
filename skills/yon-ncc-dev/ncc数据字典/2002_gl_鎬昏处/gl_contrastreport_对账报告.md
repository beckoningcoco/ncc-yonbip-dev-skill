# |<<

**对账报告 (gl_contrastreport / nc.vo.gl.contrast.report.ContrastReportVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2376.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contrastreport | 对帐报告标识 | pk_contrastreport | char(20) | √ | 对帐报告明细 (ContrastReportSubVO) |
| 2 | pk_contrastrule | 内部交易规则标识 | pk_contrastrule | varchar(20) |  | 主键 (UFID) |
| 3 | syear | 年度 | syear | char(4) |  | 字符串 (String) |
| 4 | smonth | 月份 | smonth | char(2) |  | 字符串 (String) |
| 5 | pk_accountingbook | 财务核算帐簿 | pk_accountingbook | char(20) |  | 主键 (UFID) |
| 6 | isconfirmed | 是否确认 | isconfirmed | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | pk_checked | 是否审核 | pk_checked | char(20) |  | 主键 (UFID) |
| 8 | isfinished | 是否完成 | isfinished | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | isbuilded | 是否生成 | isbuilded | int |  | 整数 (Integer) |
| 10 | selfaccountbook | 本方财务核算帐簿 | selfaccountbook | char(20) |  | 字符串 (String) |
| 11 | otheraccountbook | 对方财务核算帐簿 | otheraccountbook | char(20) |  | 字符串 (String) |
| 12 | rowno | 序号 | rowno | int |  | 整数 (Integer) |
| 13 | bselect | 是否选择 | bselect | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | pk_currtype | 币种标识 | pk_currtype | varchar(20) |  | 主键 (UFID) |
| 15 | buildtime | 生成时间 | buildtime | char(19) |  | 日期时间 (UFDateTime) |
| 16 | contrastcontent | 对账内容 | contrastcontent | varchar(5) |  | 字符串 (String) |
| 17 | contrastmoney | 对账金额性质 | contrastmoney | varchar(1) |  | 字符串 (String) |