# |<<

**组织信息HR (org_orgs / nc.vo.om.orginfo.HROrgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4109.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_org | 组织主键 | pk_org | char(20) | √ | 主键 (UFID) |
| 2 | code | 组织编码 | code | varchar(40) | √ | 字符串 (String) |
| 3 | name | 组织名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | innercode | 内部编码 | innercode | varchar(200) |  | 字符串 (String) |
| 5 | shortname | 组织简称 | shortname | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 7 | pk_fatherorg | 上级组织 | pk_fatherorg | varchar(20) |  | 组织 (org) |
| 8 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 9 | orgtype1 | 组织类型1 | orgtype1 | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | orgtype2 | 法人公司 | orgtype2 | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | orgtype3 | 组织类型3 | orgtype3 | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | orgtype4 | 人力资源 | orgtype4 | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | orgtype5 | 财务组织 | orgtype5 | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | orgtype6 | 组织类型6 | orgtype6 | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | orgtype7 | 组织类型7 | orgtype7 | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | orgtype8 | 组织类型8 | orgtype8 | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | orgtype9 | 组织类型9 | orgtype9 | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | orgtype10 | 组织类型10 | orgtype10 | char(1) |  | 布尔类型 (UFBoolean) |
| 19 | orgtype11 | 组织类型11 | orgtype11 | char(1) |  | 布尔类型 (UFBoolean) |
| 20 | orgtype12 | 组织类型12 | orgtype12 | char(1) |  | 布尔类型 (UFBoolean) |
| 21 | orgtype13 | 组织类型13 | orgtype13 | char(1) |  | 布尔类型 (UFBoolean) |
| 22 | orgtype14 | 组织类型14 | orgtype14 | char(1) |  | 布尔类型 (UFBoolean) |
| 23 | orgtype15 | 组织类型15 | orgtype15 | char(1) |  | 布尔类型 (UFBoolean) |
| 24 | orgtype16 | 组织类型16 | orgtype16 | char(1) |  | 布尔类型 (UFBoolean) |
| 25 | orgtype17 | 组织类型17 | orgtype17 | char(1) |  | 布尔类型 (UFBoolean) |
| 26 | orgtype18 | 组织类型18 | orgtype18 | char(1) |  | 布尔类型 (UFBoolean) |
| 27 | orgtype19 | 组织类型19 | orgtype19 | char(1) |  | 布尔类型 (UFBoolean) |
| 28 | orgtype20 | 组织类型20 | orgtype20 | char(1) |  | 布尔类型 (UFBoolean) |
| 29 | orgtype21 | 组织类型21 | orgtype21 | char(1) |  | 布尔类型 (UFBoolean) |
| 30 | orgtype22 | 组织类型22 | orgtype22 | char(1) |  | 布尔类型 (UFBoolean) |
| 31 | orgtype23 | 组织类型23 | orgtype23 | char(1) |  | 布尔类型 (UFBoolean) |
| 32 | orgtype24 | 组织类型24 | orgtype24 | char(1) |  | 布尔类型 (UFBoolean) |
| 33 | orgtype25 | 组织类型25 | orgtype25 | char(1) |  | 布尔类型 (UFBoolean) |
| 34 | orgtype26 | 组织类型26 | orgtype26 | char(1) |  | 布尔类型 (UFBoolean) |
| 35 | orgtype27 | 组织类型27 | orgtype27 | char(1) |  | 布尔类型 (UFBoolean) |
| 36 | orgtype28 | 组织类型28 | orgtype28 | char(1) |  | 布尔类型 (UFBoolean) |
| 37 | orgtype29 | 行政组织 | orgtype29 | char(1) |  | 布尔类型 (UFBoolean) |
| 38 | orgtype30 | 组织类型30 | orgtype30 | char(1) |  | 布尔类型 (UFBoolean) |
| 39 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) | 2 | 1=未启用; |