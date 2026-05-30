# |<<

**科目表 (bd_accchart / nc.vo.bd.accchart.AccChartVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/299.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accchart | 主键 | pk_accchart | char(20) | √ | 主键 (UFID) |
| 2 | code | 科目表编码 | code | varchar(40) | √ | 字符串 (String) |
| 3 | name | 科目表名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | pk_accsystem | 所属科目体系 | pk_accsystem | varchar(20) |  | 科目体系 (accsystem) |
| 5 | pk_accctrlrule | 所属控制规则 | pk_accctrlrule | varchar(20) |  | 科目控制规则 (accctrlrule) |
| 6 | alterchart | 版本变更发起表 | alterchart | varchar(20) |  | 科目表 (accchart) |
| 7 | originalchart | 原始科目表 | originalchart | varchar(20) |  | 科目表 (accchart) |
| 8 | beginperiod | 生效日期 | beginperiod | char(10) |  | 字符串 (String) | 0000-00-00 |
| 9 | endperiod | 失效日期 | endperiod | char(10) |  | 字符串 (String) | 9999-99-99 |
| 10 | dispnamemodel | 科目显示名称格式 | dispnamemodel | smallint | √ | 科目显示名称格式 (dispmodel) | 0 | 0=本级名称; |