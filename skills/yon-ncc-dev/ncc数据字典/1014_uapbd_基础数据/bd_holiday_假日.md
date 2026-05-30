# |<<

**假日 (bd_holiday / nc.vo.bd.holiday.HolidayVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/856.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_holiday | 主键 | pk_holiday | char(20) | √ | 主键 (UFID) |
| 2 | pk_holidaysort | 假日分类主键 | pk_holidaysort | varchar(20) |  | 假日类别(自定义档案) (Defdoc-BDHS01_0xx) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | code | 编码 | code | varchar(80) |  | 字符串 (String) |
| 6 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | holidayyear | 假日年度 | holidayyear | varchar(10) |  | 字符串 (String) |
| 8 | memo | 备注 | memo | varchar(512) |  | 字符串 (String) |
| 9 | starttime | 开始时间 | starttime | varchar(50) |  | 字符串 (String) |
| 10 | endtime | 结束时间 | endtime | varchar(50) |  | 字符串 (String) |
| 11 | isdeftime | 是否分时假日 | isdeftime | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | oneswitch | 对调班别日期一 | oneswitch | char(10) |  | 模糊日期 (UFLiteralDate) |
| 13 | oneswitchto | 对调至班别日期一 | oneswitchto | char(10) |  | 模糊日期 (UFLiteralDate) |
| 14 | twoswitch | 对调班别日期二 | twoswitch | char(10) |  | 模糊日期 (UFLiteralDate) |
| 15 | twoswitchto | 对调至班别日期二 | twoswitchto | char(10) |  | 模糊日期 (UFLiteralDate) |
| 16 | threeswitch | 对调班别日期三 | threeswitch | char(10) |  | 模糊日期 (UFLiteralDate) |
| 17 | threeswitchto | 对调至班别日期三 | threeswitchto | char(10) |  | 模糊日期 (UFLiteralDate) |
| 18 | fourswitch | 对调班别日期四 | fourswitch | char(10) |  | 模糊日期 (UFLiteralDate) |
| 19 | fourswitchto | 对调至班别日期四 | fourswitchto | char(10) |  | 模糊日期 (UFLiteralDate) |
| 20 | fiveswitch | 对调班别日期五 | fiveswitch | char(10) |  | 模糊日期 (UFLiteralDate) |
| 21 | fiveswitchto | 对调至班别日期五 | fiveswitchto | char(10) |  | 模糊日期 (UFLiteralDate) |
| 22 | sixswitch | 对调班别日期六 | sixswitch | char(10) |  | 模糊日期 (UFLiteralDate) |
| 23 | sixswitchto | 对调至班别日期六 | sixswitchto | char(10) |  | 模糊日期 (UFLiteralDate) |
| 24 | sevenswitch | 对调班别日期七 | sevenswitch | char(10) |  | 模糊日期 (UFLiteralDate) |
| 25 | sevenswitchto | 对调至班别日期七 | sevenswitchto | char(10) |  | 模糊日期 (UFLiteralDate) |
| 26 | eightswitch | 对调班别日期八 | eightswitch | char(10) |  | 模糊日期 (UFLiteralDate) |
| 27 | eightswitchto | 对调至班别日期八 | eightswitchto | char(10) |  | 模糊日期 (UFLiteralDate) |
| 28 | allflag | 是否适用全部人员 | allflag | char(1) |  | 布尔类型 (UFBoolean) |
| 29 | formulastr | 公式显示字段 | formulastr | varchar(1024) |  | 字符串 (String) |
| 30 | formula | 公式定义 | formula | varchar(1024) |  | 字符串 (String) |
| 31 | dataoriginflag | 分布式 | dataoriginflag | int |  | 整数 (Integer) |
| 32 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 33 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 34 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 35 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |