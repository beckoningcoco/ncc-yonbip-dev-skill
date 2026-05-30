# |<<

**账簿_组织关账 (org_closeacc / nc.vo.org.CloseAccBookVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4026.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_closeaccbook | 主键 | pk_closeaccbook | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织主键 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | closeorgpks | 关账组织主键组合 | closeorgpks | varchar(50) |  | 字符串 (String) |
| 4 | moduleid | 模块号 | moduleid | varchar(20) |  | 主键 (UFID) |
| 5 | pk_accperiodmonth | 会计期间 | pk_accperiodmonth | varchar(20) |  | 会计月份 (accperiodmonth) |
| 6 | ispreclose | 提前关账 | ispreclose | char(1) |  | 布尔类型 (UFBoolean) | N |
| 7 | isclose | 关账 | isclose | char(1) |  | 布尔类型 (UFBoolean) | N |
| 8 | closeuser | 关账人 | closeuser | varchar(20) |  | 用户 (user) |
| 9 | closetime | 关账时间 | closetime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | precloseuser | 提前关账人 | precloseuser | varchar(20) |  | 用户 (user) |
| 11 | preclosetime | 提前关账时间 | preclosetime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | uncloseuser | 反关账人 | uncloseuser | varchar(20) |  | 用户 (user) |
| 13 | unclosetime | 反关账时间 | unclosetime | char(19) |  | 日期时间 (UFDateTime) |
| 14 | unprecloseuser | 反提前关账人 | unprecloseuser | varchar(20) |  | 用户 (user) |
| 15 | unpreclosetime | 反提前关账时间 | unpreclosetime | char(19) |  | 日期时间 (UFDateTime) |
| 16 | isendacc | 结账 | isendacc | char(1) |  | 布尔类型 (UFBoolean) | N |
| 17 | endaccuser | 结账人 | endaccuser | varchar(20) |  | 用户 (user) |
| 18 | endacctime | 结账时间 | endacctime | char(19) |  | 日期时间 (UFDateTime) |
| 19 | unendaccuser | 反结账人 | unendaccuser | varchar(20) |  | 用户 (user) |
| 20 | unendacctime | 反结账时间 | unendacctime | char(19) |  | 日期时间 (UFDateTime) |
| 21 | pk_storedoc | 仓库 | pk_storedoc | varchar(20) |  | 仓库 (stordoc) |