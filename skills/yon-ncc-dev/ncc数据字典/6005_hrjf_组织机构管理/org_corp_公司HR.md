# |<<

**公司HR (org_corp / nc.vo.om.orginfo.HRCorpVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4029.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_corp | 公司主键 | pk_corp | char(20) | √ | 主键 (UFID) |
| 2 | code | 公司编码 | code | varchar(40) | √ | 字符串 (String) |
| 3 | name | 公司名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | shortname | 公司简称 | shortname | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | ownersharerate | 所有权份额 | ownersharerate | decimal(28, 2) |  | 数值 (UFDouble) |
| 6 | industry | 所属行业 | industry | varchar(20) |  | 经济行业(自定义档案) (Defdoc-SYS005_0xx) |
| 7 | ecotype | 经济类型 | ecotype | varchar(20) |  | 经济类型(自定义档案) (Defdoc-SYS004_0xx) |
| 8 | legalbodycode | 法人代表 | legalbodycode | varchar(25) |  | 字符串 (String) |
| 9 | postaddr | 通讯地址 | postaddr | varchar(60) |  | 字符串 (String) |
| 10 | zipcode | 邮政编码 | zipcode | char(6) |  | 字符串 (String) |
| 11 | phone1 | 电话1 | phone1 | varchar(30) |  | 字符串 (String) |
| 12 | phone2 | 电话2 | phone2 | varchar(30) |  | 字符串 (String) |
| 13 | phone3 | 电话3 | phone3 | varchar(30) |  | 字符串 (String) |
| 14 | fax1 | 传真1 | fax1 | varchar(30) |  | 字符串 (String) |
| 15 | fax2 | 传真2 | fax2 | varchar(30) |  | 字符串 (String) |
| 16 | linkman1 | 联系人1 | linkman1 | varchar(25) |  | 字符串 (String) |
| 17 | linkman2 | 联系人2 | linkman2 | varchar(25) |  | 字符串 (String) |
| 18 | linkman3 | 联系人3 | linkman3 | varchar(25) |  | 字符串 (String) |
| 19 | email1 | 电子邮件1 | email1 | varchar(50) |  | 字符串 (String) |
| 20 | email2 | 电子邮件2 | email2 | varchar(50) |  | 字符串 (String) |
| 21 | email3 | 电子邮件3 | email3 | varchar(50) |  | 字符串 (String) |
| 22 | url | Web网址 | url | varchar(60) |  | 字符串 (String) |
| 23 | createdate | 公司成立时间 | createdate | char(19) |  | 日期 (UFDate) |
| 24 | regcapital | 注册资本 | regcapital | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | briefintro | 简介 | briefintro | varchar(1000) |  | 字符串 (String) |
| 26 | corptype | 单位类型 | corptype | varchar(20) |  | 单位类型(自定义档案) (Defdoc-SYS002_0xx) |
| 27 | idnumber | 法人身份证号码 | idnumber | varchar(60) |  | 字符串 (String) |
| 28 | begindate | 业务开始日期 | begindate | char(19) |  | 日期 (UFDate) |
| 29 | enddate | 业务终止日期 | enddate | char(19) |  | 日期 (UFDate) |
| 30 | chargedeptcode | 上级主管部门编码 | chargedeptcode | varchar(60) |  | 字符串 (String) |
| 31 | chargedeptname | 上级主管部门名称 | chargedeptname | varchar(60) |  | 字符串 (String) |
| 32 | unitdistinction | 单位级别 | unitdistinction | varchar(20) |  | 单位级别(自定义档案) (Defdoc-SYS003_0xx) |
| 33 | region | 行政区划 | region | varchar(20) |  | 行政区划 (region) |
| 34 | pk_corpkind | 公司类别 | pk_corpkind | varchar(20) |  | 字符串 (String) |
| 35 | innercode | 编码级次 | innercode | varchar(60) |  | 字符串 (String) |
| 36 | maxinnercode | 内部编码下级最大值 | maxinnercode | varchar(60) |  | 字符串 (String) |
| 37 | taxpayertype | 纳税人类型 | taxpayertype | smallint |  | 纳税人类型 (taxpayertype) |  | 0=一般纳税人; |