# |<<

**账簿_财务核算账簿_关联科目 (org_acb_accchart / nc.vo.org.AccountingBookAccchartVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3980.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_relaccchart | 关联科目信息主键 | pk_relaccchart | char(20) | √ | 主键 (UFID) |
| 2 | pk_accchart | 科目表 | pk_accchart | varchar(20) | √ | 科目表 (accchart) |
| 3 | pk_beginperiod | 开始期间 | pk_beginperiod | varchar(20) | √ | 会计月份 (accperiodmonth) |
| 4 | pk_endperiod | 结束期间 | pk_endperiod | varchar(20) |  | 会计月份 (accperiodmonth) |
| 5 | beginperiod | 开始期间日期 | beginperiod | varchar(50) |  | 字符串 (String) |
| 6 | endperiod | 结束期间日期 | endperiod | varchar(50) |  | 字符串 (String) |