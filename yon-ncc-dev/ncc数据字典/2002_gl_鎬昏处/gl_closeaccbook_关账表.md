# |<<

**关账表 (gl_closeaccbook / nc.vo.gl.closeaccbook.CloseaccbookVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2365.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_closeaccbook | 关账表标识 | pk_closeaccbook | char(20) | √ | 主键 (UFID) |
| 2 | isclose | 关账 | isclose | char(1) |  | 布尔类型 (UFBoolean) |
| 3 | ispreclose | 提前关账 | ispreclose | char(1) |  | 布尔类型 (UFBoolean) |
| 4 | closeuser | 关账人 | closeuser | char(20) |  | 主键 (UFID) |
| 5 | closetime | 关账时间 | closetime | char(19) |  | 日期时间 (UFDateTime) |
| 6 | precloseuser | 提前关账人 | precloseuser | char(20) |  | 主键 (UFID) |
| 7 | preclosetime | 提前关账时间 | preclosetime | char(19) |  | 日期时间 (UFDateTime) |
| 8 | uncloseuser | 反关账人 | uncloseuser | char(40) |  | 主键 (UFID) |
| 9 | unclosetime | 反关账时间 | unclosetime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | unprecloseuser | 反提前关账人 | unprecloseuser | char(20) |  | 主键 (UFID) |
| 11 | unpreclosetime | 反提前关账时间 | unpreclosetime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 13 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 14 | pk_org_v | 财务组织多版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 15 | pk_setofbook | 账簿类型 | pk_setofbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 16 | pk_accountingbook | 核算账簿 | pk_accountingbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 17 | year | 年度 | year | varchar(50) |  | 字符串 (String) |
| 18 | period | 期间 | period | varchar(50) |  | 字符串 (String) |
| 19 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 20 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 21 | modifier | 修改人 | modifier | varchar(20) |  | 人员基本信息 (psndoc) |
| 22 | creator | 创建人 | creator | varchar(20) |  | 人员基本信息 (psndoc) |