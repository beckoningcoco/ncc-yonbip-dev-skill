# |<<

**自动对账VO (gl_autocontrast / nc.vo.gl.contrast.detailcontrat.AutoContrastRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2349.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_autocontratrule | 自动对账标识 | pk_autocontratrule | char(20) | √ | 主键 (UFID) |
| 2 | bselect | 是否选择 | bselect | char(1) |  | 布尔类型 (UFBoolean) |
| 3 | rulecode | 规则编码 | rulecode | varchar(40) |  | 字符串 (String) |
| 4 | rulename | 规则名称 | rulename | varchar(100) |  | 字符串 (String) |
| 5 | self_accountingbook | 本方账簿 | self_accountingbook | char(20) |  | 主键 (UFID) |
| 6 | other_accountingbook | 对方账簿 | other_accountingbook | char(20) |  | 主键 (UFID) |
| 7 | rulevo | 规则VO | rulevo | varchar(20) |  | 内部交易规则 (ContrastRuleVO) |