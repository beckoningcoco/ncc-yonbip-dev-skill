# |<<

**出国境情况 (hi_psndoc_abroad / nc.vo.hi.psndoc.AbroadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2552.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | 人员子表主键 | pk_psndoc_sub | char(20) | √ | 主键 (UFID) |
| 2 | begindate | 起始日期 | begindate | char(10) | √ | 模糊日期 (UFLiteralDate) |
| 3 | enddate | 终止日期 | enddate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 4 | abroaddate | 出国(出境)时间 | abroaddate | char(10) | √ | 模糊日期 (UFLiteralDate) |
| 5 | abroadway | 出国(出境)目的 | abroadway | varchar(20) |  | 出国目的代码(自定义档案) (Defdoc-HRHI011_0xx) |
| 6 | abroadarea | 所去国家(地区) | abroadarea | char(20) | √ | 国家地区 (countryzone) |
| 7 | abroadunit | 所去单位 | abroadunit | varchar(128) |  | 字符串 (String) |
| 8 | abroadout | 派出单位 | abroadout | varchar(128) |  | 字符串 (String) |
| 9 | abroadgroup | 团组名称 | abroadgroup | varchar(128) |  | 字符串 (String) |
| 10 | abroadoutlay | 经费来源 | abroadoutlay | varchar(128) |  | 字符串 (String) |
| 11 | abroadpro | 审批单位 | abroadpro | varchar(128) |  | 字符串 (String) |
| 12 | abroadprodate | 审批时间 | abroadprodate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 13 | abroadnumber | 审批文号 | abroadnumber | varchar(128) |  | 字符串 (String) |
| 14 | abroadreturn | 回国时间 | abroadreturn | char(10) |  | 模糊日期 (UFLiteralDate) |
| 15 | abroadex | 异常情况 | abroadex | varchar(128) |  | 字符串 (String) |
| 16 | recordnum | 记录序号 | recordnum | int |  | 整数 (Integer) |
| 17 | lastflag | 最近记录标志 | lastflag | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | pk_psndoc | 人员主键 | pk_psndoc | char(20) |  | 主键 (UFID) |
| 19 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 20 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织_业务单元_人力资源组织 (hrorg) |
| 21 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 22 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 23 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 24 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |