# |<<

**账簿_组织批量关账 (org_closeacc / nc.vo.org.BatchCloseAccBookVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4027.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_closeaccbook | 主键 | pk_closeaccbook | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 业务单元主键 | pk_org | varchar(20) |  | 组织 (org) |
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
| 21 | name | 关帐组织名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 22 | code | 关帐组织编码 | code | varchar(40) |  | 字符串 (String) |
| 23 | pk_enableperiod | 启用期间 | pk_enableperiod | char(20) |  | 主键 (UFID) |
| 24 | pk_checkaccbook | 财务核算账簿主键 | pk_checkaccbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 25 | pk_liabilitybook | 责任核算账簿主键 | pk_liabilitybook | varchar(20) |  | 账簿_责任核算账簿 (liabilitybook) |
| 26 | pk_costregion | 成本域 | pk_costregion | varchar(20) |  | 组织_成本域 (costregion) |
| 27 | pk_taxaccbook | 税务核算账簿主键 | pk_taxaccbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 28 | pk_authorg | 所属组织 | pk_authorg | varchar(20) |  | 组织 (org) |
| 29 | pk_storedoc | 仓库 | pk_storedoc | varchar(20) |  | 仓库 (stordoc) |
| 30 | pk_accountingbook | 核算账簿性质 | pk_accountingbook | varchar(20) |  | 账簿_核算账簿 (accbook) |
| 31 | pk_factory | 工厂组织 | pk_factory | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 32 | pk_resaorg | 成本中心所属业务单元 | pk_resaorg | varchar(20) |  | 组织 (org) |