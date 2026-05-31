# |<<

**险种 (bm_bmclass / nc.vo.bm.bmclass.BmClassVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1220.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bm_class | 险种主键 | pk_bm_class | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | code | 险种编码 | code | varchar(50) |  | 字符串 (String) |
| 5 | name | 险种名称 | name | varchar(50) | √ | 多语文本 (MultiLangText) |
| 6 | pk_periodscheme | 期间方案 | pk_periodscheme | varchar(20) |  | 险种期间方案 (BmPeriodSchemeVO) |
| 7 | currid | 币种主键 | currid | varchar(20) |  | 币种 (currtype) |
| 8 | pk_financeorg | 财务组织 | pk_financeorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 9 | cyear | 最新年度 | cyear | varchar(50) |  | 字符串 (String) |
| 10 | cperiod | 最新期间 | cperiod | varchar(50) |  | 字符串 (String) |
| 11 | startyear | 起始年度 | startyear | varchar(50) |  | 字符串 (String) |
| 12 | startperiod | 起始期间 | startperiod | varchar(50) |  | 字符串 (String) |
| 13 | stopflag | 是否停用 | stopflag | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | idisplayorder | 显示顺序 | idisplayorder | int |  | 整数 (Integer) |
| 15 | note | 险种说明 | note | varchar(2000) |  | 字符串 (String) |
| 16 | enableorgbase | 启用单位基金基数 | enableorgbase | char(1) | √ | 布尔类型 (UFBoolean) | N |
| 17 | editdatasource | 允许组织修改数据来源 | editdatasource | char(1) | √ | 布尔类型 (UFBoolean) | N |
| 18 | allowadditem | 允许下级增加险种项目 | allowadditem | char(1) | √ | 布尔类型 (UFBoolean) | Y |
| 19 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 20 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 21 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 22 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |