# |<<

**差异分析表 (gl_diffanaly / nc.vo.gl.diffanaly.DiffAnalyzeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2405.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_diff | 差异分析项主键 | pk_diff | char(20) | √ | 主键 (UFID) |
| 2 | pk_accasoa | 会计科目 | pk_accasoa | varchar(50) |  | 字符串 (String) |
| 3 | assid | 辅助核算 | assid | varchar(50) |  | 字符串 (String) |
| 4 | pk_currtype | 币种 | pk_currtype | varchar(50) |  | 字符串 (String) |
| 5 | direct | 方向 | direct | varchar(50) |  | 字符串 (String) |
| 6 | defcol | 主表表项 | defcol | varchar(20) |  | 差异分析 (diffanalysis) |
| 7 | pk_org | 业务单元 | pk_org | varchar(50) |  | 字符串 (String) |
| 8 | pk_accountbook | 核算账簿 | pk_accountbook | varchar(50) |  | 字符串 (String) |
| 9 | detailno | 分录号 | detailno | int |  | 整数 (Integer) |
| 10 | amount | 金额 | amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | localcreditamount | 组织贷方金额 | localcreditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | groupcreditamount | 集团贷方金额 | groupcreditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | globalcreditamount | 全局贷方金额 | globalcreditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | localdebitamount | 组织借方金额 | localdebitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | groupdebitamount | 集团借方金额 | groupdebitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | globaldebitamount | 全局借方金额 | globaldebitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | occamount | 原币 | occamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | localamount | 本币 | localamount | varchar(50) |  | 字符串 (String) |
| 19 | pk_voucher | 凭证主键 | pk_voucher | varchar(50) |  | 字符串 (String) |
| 20 | pk_detail | 分录主键 | pk_detail | varchar(50) |  | 字符串 (String) |
| 21 | subitem | 差异项目类型 | subitem | varchar(50) |  | 字符串 (String) |