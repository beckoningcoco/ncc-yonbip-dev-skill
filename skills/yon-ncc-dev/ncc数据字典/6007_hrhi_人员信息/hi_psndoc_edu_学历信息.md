# |<<

**学历信息 (hi_psndoc_edu / nc.vo.hi.psndoc.EduVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2561.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | 人员子表主键 | pk_psndoc_sub | char(20) | √ | 主键 (UFID) |
| 2 | begindate | 入学日期 | begindate | char(10) | √ | 模糊日期 (UFLiteralDate) |
| 3 | enddate | 毕业日期 | enddate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 4 | school | 学校 | school | varchar(60) |  | 字符串 (String) |
| 5 | schooltype | 学校类型 | schooltype | varchar(128) |  | 字符串 (String) |
| 6 | major | 专业 | major | varchar(200) |  | 字符串 (String) |
| 7 | majortype | 学历专业类别 | majortype | varchar(20) |  | 专业类别(自定义档案) (Defdoc-HR010_0xx) |
| 8 | edusystem | 学制 | edusystem | decimal(20, 8) |  | 数值 (UFDouble) |
| 9 | studymode | 学习方式 | studymode | varchar(20) |  | 学习方式(自定义档案) (Defdoc-HR023_0xx) |
| 10 | education | 学历 | education | varchar(20) | √ | 学历(自定义档案) (Defdoc-HR008_0xx) |
| 11 | pk_degree | 学位 | pk_degree | varchar(20) |  | 学位(自定义档案) (Defdoc-HR009_0xx) |
| 12 | degreedate | 学位授予日期 | degreedate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 13 | degreeunit | 学位授予单位 | degreeunit | varchar(256) |  | 字符串 (String) |
| 14 | educationctifcode | 学历证书编号 | educationctifcode | varchar(28) |  | 字符串 (String) |
| 15 | certifcode | 学位证书编号 | certifcode | varchar(28) |  | 字符串 (String) |
| 16 | lasteducation | 最高学历 | lasteducation | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | memo | 备注 | memo | varchar(1024) |  | 字符串 (String) |
| 18 | period | 期间 | period | varchar(10) |  | 字符串 (String) |
| 19 | approveflag | 审批标志 | approveflag | int |  | 整数 (Integer) |
| 20 | recordnum | 记录序号 | recordnum | int |  | 整数 (Integer) |
| 21 | lastflag | 最近记录标志 | lastflag | char(1) |  | 布尔类型 (UFBoolean) |
| 22 | pk_psndoc | 人员主键 | pk_psndoc | char(20) |  | 主键 (UFID) |
| 23 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 24 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织_业务单元_人力资源组织 (hrorg) |
| 25 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 26 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 27 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 28 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |