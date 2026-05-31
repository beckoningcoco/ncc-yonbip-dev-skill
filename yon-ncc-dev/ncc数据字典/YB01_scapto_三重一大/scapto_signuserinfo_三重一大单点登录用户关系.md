# |<<

**三重一大单点登录用户关系 (scapto_signuserinfo / nc.vo.scapto.signuserinfo.SignUserInfoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5179.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_signuserinfo | 用户关系主键 | pk_signuserinfo | char(20) | √ | 主键 (UFID) |
| 2 | othersystemid | 用户对应外系统主键 | othersystemid | varchar(100) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_org_v | 业务单元版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 6 | loginid | 系统登陆帐号 | loginid | varchar(1000) |  | 字符串 (String) |
| 7 | vpassword | 系统登陆密码 | vpassword | varchar(1000) |  | 字符串 (String) |
| 8 | lastname | 姓名 | lastname | varchar(1000) |  | 字符串 (String) |
| 9 | sex | 性别 | sex | varchar(50) |  | 字符串 (String) |
| 10 | birthday | 生日 | birthday | varchar(50) |  | 字符串 (String) |
| 11 | nationality | 民族 | nationality | varchar(50) |  | 字符串 (String) |
| 12 | systemlanguage | 系统语言 | systemlanguage | varchar(50) |  | 字符串 (String) |
| 13 | maritalstatus | 婚姻状况 | maritalstatus | varchar(50) |  | 字符串 (String) |
| 14 | telephone | 电话 | telephone | varchar(50) |  | 字符串 (String) |
| 15 | mobile | 手机 | mobile | varchar(50) |  | 字符串 (String) |
| 16 | email | 电子邮件 | email | varchar(50) |  | 字符串 (String) |
| 17 | locationid | 工作地点 | locationid | varchar(100) |  | 字符串 (String) |
| 18 | jobtitle | 岗位 | jobtitle | varchar(50) |  | 字符串 (String) |
| 19 | departmentid | 所属部门 | departmentid | varchar(50) |  | 字符串 (String) |
| 20 | certificatenum | 身份证号码 | certificatenum | varchar(50) |  | 字符串 (String) |
| 21 | nativeplace | 籍贯 | nativeplace | varchar(50) |  | 字符串 (String) |
| 22 | pk_userid | ncc用户 | pk_userid | varchar(20) |  | 用户 (user) |
| 23 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 24 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 25 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |
| 43 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |