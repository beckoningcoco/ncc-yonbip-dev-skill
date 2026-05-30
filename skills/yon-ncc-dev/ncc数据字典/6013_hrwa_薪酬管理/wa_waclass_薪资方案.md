# |<<

**薪资方案 (wa_waclass / nc.vo.wa.category.WaClassVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6370.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_class | 薪资类别表主键 | pk_wa_class | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织 (org) |
| 4 | code | 薪资类别编码 | code | varchar(100) | √ | 字符串 (String) |
| 5 | name | 薪资类别名称 | name | varchar(100) | √ | 多语文本 (MultiLangText) |
| 6 | pk_periodscheme | 期间方案 | pk_periodscheme | varchar(20) |  | 薪资期间方案 (PeriodSchemeVO) |
| 7 | currid | 币种主键 | currid | char(20) | √ | 币种 (currtype) |
| 8 | displaytaxitem | 所得项目名称 | displaytaxitem | varchar(100) |  | 字符串 (String) |
| 9 | startyear | 起始年度 | startyear | varchar(4) |  | 字符串 (String) |
| 10 | startperiod | 起始期间 | startperiod | varchar(2) |  | 字符串 (String) |
| 11 | cyear | 最新业务年度 | cyear | varchar(4) |  | 字符串 (String) |
| 12 | cperiod | 最新业务期间 | cperiod | varchar(2) |  | 字符串 (String) |
| 13 | voucherflag | 参与月末制单 | voucherflag | char(1) | √ | 布尔类型 (UFBoolean) |
| 14 | collectflag | 是汇总类别 | collectflag | char(1) | √ | 布尔类型 (UFBoolean) |
| 15 | addflag | 允许下级增加发放项目 | addflag | char(1) | √ | 布尔类型 (UFBoolean) |
| 16 | checkflowflag | 需要审批流 | checkflowflag | char(1) | √ | 布尔类型 (UFBoolean) |
| 17 | stopflag | 停用 | stopflag | char(1) | √ | 布尔类型 (UFBoolean) |
| 18 | taxcurrid | 计税币种主键 | taxcurrid | char(20) | √ | 币种 (currtype) |
| 19 | idisplayorder | 显示顺序 | idisplayorder | int |  | 整数 (Integer) |
| 20 | mutipleflag | 多次发放 | mutipleflag | char(1) |  | 布尔类型 (UFBoolean) |
| 21 | showflag | 展现 | showflag | char(1) |  | 布尔类型 (UFBoolean) | Y |
| 22 | taxmode | 补发扣税方式 | taxmode | int | √ | 补发扣税方式 (taxmode) | 1 | 0=不扣税; |